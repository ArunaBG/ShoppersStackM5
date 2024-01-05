package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSettingPage {
	public AccountSettingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//*[name()='svg'and @data-testid='LogoutIcon']")
	private WebElement LogooutIcon;
	
	public WebElement getLogooutIcon() {
		return LogooutIcon;
	}
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfileLink;
	
	public WebElement getmyProfileLink()
      {
		return myProfileLink;
		}
}
