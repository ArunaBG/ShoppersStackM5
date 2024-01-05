package POMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NetBankingPage {

	
	public NetBankingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
}

	@FindBy(xpath="//iframe[@title='Netbanking']")
	private WebElement netBankingFrameTag;
	
	public WebElement getnetBankingFrameTag()
	{
		return netBankingFrameTag;
	}
	
	@FindBy(xpath="//input[@value='IDHC']")
	private WebElement idhcradiobutton;
	
	public WebElement getidhcradiobutton()
{
		return idhcradiobutton;
}
	
	@FindBy(xpath="//button[text()='Submit']")
    private WebElement Submitbutton;
	
	public WebElement getSubmitbutton()
{
		return Submitbutton;
}
}

