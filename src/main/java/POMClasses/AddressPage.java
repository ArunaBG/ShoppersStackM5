package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressPage {

	
	public AddressPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//a[@href='/addressform']")
	private WebElement addAddressFormbutton;
	
	public WebElement getaddAddressFormbutton() {
		return addAddressFormbutton;
	}
	
	@FindBy(xpath="//div[@class='addressListContainer']//h3")
	private WebElement addaddress;
	public WebElement getaddaddress()
{
		return addaddress;
		}
	
	@FindBy(id="13753")
	private WebElement HariHara;
	
	public WebElement getHariHara()
	{
		return HariHara;
	}
	
	@FindBy(xpath="//button[text()='Proceed']")
	private WebElement ProceedButton;
	public WebElement getProceedButton()
	{
		return ProceedButton;
	}
}
