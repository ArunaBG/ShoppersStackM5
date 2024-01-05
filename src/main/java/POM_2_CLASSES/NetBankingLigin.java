package POM_2_CLASSES;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NetBankingLigin {

	@FindBy(xpath="//div[@class='payment_selectBankBlock__Dq1Xk']")
	private WebElement ParentFrame_1;
	
	@FindBy(xpath="//section[@class='payment_netBankingLogin__SCfkd']")
	private WebElement ParentFrame;
	
}
