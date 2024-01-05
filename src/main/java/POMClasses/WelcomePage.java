package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	
	public WebDriver driver;
	
	//initialisation
	public WelcomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	//Declaration
	@FindAll({@FindBy(id="loginBtn"),@FindBy(xpath="//button[text()='Login']"),@FindBy(xpath="//button[@name='loginBtn']")})
    private WebElement MainLoginButton;
	
	public WebElement getMainLoginButton()
			 {
		return MainLoginButton;
		
	}
}
