package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentMethod {

	
	public PaymentMethod(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	
	@FindBy(xpath="//span[text()='Cash On Delivery (COD)']/preceding-sibling::span/input")
	private WebElement CashOnDelivery;
	
	public WebElement getCashOnDelivery()
	{
		return CashOnDelivery;
	}
	
	@FindBy(xpath="//button[text()='Proceed']")
private WebElement ProceedButton;
	
	public WebElement getProceedButton()
	{
		return ProceedButton;
	}
	
	@FindBy(xpath="//input[@value='Net Banking']")
	private WebElement NetBanking;
	public WebElement getNetBanking()
{
		return NetBanking;
		}
}
