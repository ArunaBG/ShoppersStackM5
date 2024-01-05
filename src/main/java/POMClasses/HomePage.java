package POMClasses;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

public WebDriver driver;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
//	@FindBy(xpath="//button[@aria-label='Account settings']")
//	private WebElement accountSettingButton;
//	
//	public WebElement getaccountSettingButton() {
//		return accountSettingButton;
//	}
	
	@FindAll({@FindBy(xpath="//a[text()='T-shirts']"),@FindBy(id="men")})
	private WebElement TshirtPopupLink;
	
	public WebElement getTshirtPopupLink()
	{
		return TshirtPopupLink;
	}
	
	@FindAll({@FindBy(xpath="//a[@href='/men']"),@FindBy(id="men")})
	private WebElement menLink;
	public WebElement getmenLink() {
		return menLink;
	}
	
    @FindBy(id="cart")
    private WebElement Cartbutton;
	
	public WebElement getCartbutton()
	{
		return Cartbutton;
}
	
	
	public void javaScriptClick(WebDriver driver) {
		WebElement ele = driver.findElement(By.xpath("//button[@aria-label='Account settings']"));
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].click();", ele);
		
	}
	
	
	}