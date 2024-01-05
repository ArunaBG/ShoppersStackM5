package Utility;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import POMClasses.AccountSettingPage;
import POMClasses.HomePage;
import POMClasses.LoginPage;
import POMClasses.WelcomePage;

public class BaseClass {
	public static WebDriver driver;
	
	public DataUtility data=new DataUtility();
	public WebDriverUtility WU=new WebDriverUtility();
	public DropDownUtility DD=new  DropDownUtility();
	
	@BeforeClass
	public void LaunchingBrowser() throws Throwable {
		System.out.println("....launching Browser........");
		String BROWSER = data.dataFromPropertiesFile("browser");
		
		
		if(BROWSER.equals("Chrome")) {
			ChromeOptions option=new ChromeOptions();
			option.addArguments("--disable-notifications");
			driver=new ChromeDriver();
		}
		else if(BROWSER.equals("edge")){
			driver=new EdgeDriver();
		}
		else
		{
			driver=new ChromeDriver();
		}
		
		String URL=data.dataFromPropertiesFile("url");
		driver.get(URL);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@BeforeMethod
	public void loginToApplication() throws Throwable {
		System.out.println("....Login to application........");
		WelcomePage wl=new WelcomePage(driver);
		Thread.sleep(3000);
		wl.getMainLoginButton().click();
		
		LoginPage lg=new LoginPage(driver);
		String emailId=data.dataFromPropertiesFile("username");
		lg.getEmailTextField().sendKeys(emailId);
		
		String Password=data.dataFromPropertiesFile("password");
		lg.getPasswordTextField().sendKeys(Password);
		
		lg.getLoginButton().click();
		
	}
	@AfterMethod
  public void loginFromApplication() throws Throwable {
		System.out.println("....Login From the application........");
		Thread.sleep(2000);
	  HomePage hp = new HomePage(driver);
	  hp.javaScriptClick(driver);
	  
	  AccountSettingPage as = new AccountSettingPage(driver);
	  as.getLogooutIcon().click();
  }
	@AfterClass
	public void logOutFromApplication() {
		System.out.println("....LogOut from the application........");
		driver.quit();
	
	}
}
