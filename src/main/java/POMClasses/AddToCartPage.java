package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	public WebDriver driver;
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//h3[text()='puma']")
	private WebElement puma;

public WebElement getpuma() {
	return puma;
}

@FindBy(id="buynow_fl")
private WebElement BuyNowButtonInAddToCartPage;

public WebElement getBuyNowButtonInAddToCartPage()
{
	return BuyNowButtonInAddToCartPage;
	}
}
