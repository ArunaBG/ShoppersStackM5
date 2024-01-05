package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	public WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email")
	private WebElement EmailTextField;
	
	public WebElement getEmailTextField() {
		return EmailTextField;
	}
	
	@FindBy(id="Password")
	private WebElement PasswordlTextField;
	public WebElement getPasswordTextField() {
		return PasswordlTextField;
	}
	@FindBy(xpath="//span[text()='Login']")
	private WebElement LoginButton;
	public WebElement getLoginButton() {
		return LoginButton;
	}
	
}


