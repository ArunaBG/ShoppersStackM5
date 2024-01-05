package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddressFormPage {

	public WebDriver driver;
	public AddressFormPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(id="Name")
	private WebElement nameTextField;
	public WebElement getnameTextField() {
		return nameTextField;
	}
	
	@FindBy(id="House/Office Info")
	private WebElement houseOfficeTextField;
	public WebElement gethouseOfficeTextField() {
		return houseOfficeTextField;
	}
	
	@FindBy(id="Street Info")
	private WebElement streetInfoTextField;
	public WebElement getstreetInfoTextField() {
		return streetInfoTextField;
	}
	
	@FindBy(id="Landmark")
	private WebElement landmarkTxtField;
	public WebElement getlandmarkTxtField() {
		return landmarkTxtField;
	}
	
	@FindBy(id="Country")
	private WebElement countryTextFieldDropDown;
	public WebElement getcountryTextFieldDropDown()
	{
		return countryTextFieldDropDown;
	}
	
	@FindBy(id="State")
	private WebElement stateDropDown;
	public WebElement getstateDropDown()
	{
		return stateDropDown;
	}
	
	@FindBy(id="City")
	private WebElement cityDropDown;
	public WebElement getcityDropDown()
	{
		return cityDropDown;
	}
	
	
	@FindBy(id="Pincode")
	private WebElement pincodeTextField;
	public WebElement getpincodeTextField()
	{
		return pincodeTextField;
	}
	
	
	@FindBy(id="Phone Number")
	private WebElement phonenumberTextField;
	public WebElement getphonenumberTextField()
	{
		return phonenumberTextField;
	}
	
	
	@FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressButton;
	public WebElement getaddAddressButton()
	{
		return addAddressButton;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
