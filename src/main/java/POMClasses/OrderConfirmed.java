package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderConfirmed {

	
	public OrderConfirmed(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//h1[text()='Order Confirmed']")
	private WebElement orderConfirmedText;
	
	public WebElement getorderConfirmedText()
{
		return orderConfirmedText;
		}
}
