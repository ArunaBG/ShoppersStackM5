package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TshirtPage {

	public TshirtPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//a[text()='men tshirt']")
	private WebElement TshirTopLink;
	
	public WebElement getTshirTopLink()
{
		return TshirTopLink;
		}
	
	@FindBy(xpath="//span[text()='puma']/parent::div/following-sibling::div/child::button[text()='add to cart']")
	private WebElement PumaShirt;
	 public WebElement getPumaShirt()
	 {
		 return PumaShirt;
	 }
}
