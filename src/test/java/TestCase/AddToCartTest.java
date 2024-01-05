package TestCase;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import POMClasses.AccountSettingPage;
import POMClasses.AddToCartPage;
import POMClasses.AddressFormPage;
import POMClasses.AddressPage;
import POMClasses.HomePage;
import POMClasses.MyProfilePage;
import POMClasses.NetBankingPage;
import POMClasses.OrderConfirmed;
import POMClasses.PaymentMethod;
import POMClasses.TshirtPage;
import Utility.BaseClass;
import Utility.IPathConstant;
import Utility.WebDriverUtility;


@Listeners(Utility.ListenersUtility.class)

public class AddToCartTest extends BaseClass {

	//@Test(dataProvider="dataProvider")
	
	public void Tc_AddAddress_001(String home,String house_office,String street,String landmark,String Country,String state,String city,String pincode,String mobnum ) throws Throwable {
		System.out.println("add address");
		Thread.sleep(5000);
		HomePage hp=new HomePage(driver);
	    hp.javaScriptClick(driver);
		//hp.getaccountSettingButton().click();
	    Thread.sleep(3000);
		AccountSettingPage ap=new AccountSettingPage(driver);
		ap.getmyProfileLink().click();
		
		Assert.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/my-profile/my-profile-info");
		System.out.println("My Profile page is opened");
		 Thread.sleep(3000);
		MyProfilePage mp=new MyProfilePage(driver);
	    mp.getmyAddressButton().click();
	    Thread.sleep(3000);
	    AddressPage Ap=new AddressPage(driver);
	    Ap.getaddAddressFormbutton().click();
	    Thread.sleep(3000);
	    AddressFormPage af =new AddressFormPage(driver);
	    af.getnameTextField().sendKeys(home);
	    af.gethouseOfficeTextField().sendKeys(house_office);
	    af.getstreetInfoTextField().sendKeys(street);
	    af.getlandmarkTxtField().sendKeys(landmark);
	    WebElement countrydrop = af.getcountryTextFieldDropDown();
	    DD.SelectDropDownByVIsibleText(Country,countrydrop);
	    WebElement Statedrop = af.getstateDropDown();
	    DD.SelectDropDownByVIsibleText(state, Statedrop);
	    WebElement citydrop = af.getcityDropDown();
	    DD.SelectDropDownByVIsibleText(city, citydrop);
	    af.getpincodeTextField().sendKeys(pincode);
	    af.getphonenumberTextField().sendKeys(mobnum);
	    af.getaddAddressButton().click();
	    Ap.getHariHara().click();
	    Ap.getProceedButton().click();
	    
	    PaymentMethod pm=new PaymentMethod(driver);
	    pm.getNetBanking().click();
	    pm.getProceedButton().click();
	    
	  // Assert.assertEquals(Ap.getaddaddress().getText(),home);
	    System.out.println("the ddress-"+home+" is added succesfully");
	    OrderConfirmed oc=new OrderConfirmed(driver);
	    Assert.assertEquals(oc.getorderConfirmedText(),"Order Confirmed");
	    System.out.println("Order Confirmed");
	   }
	
	//@DataProvider
	public Object[][] dataProviderAddress() throws  Throwable{
		return data.AcessAddress();
		
		
	

	
//		Object[][] ref=new Object[1][9];
//		ref[0][0]="HariHara";
//		ref[0][1]="Ambani building , second Floor";
//		ref[0][2]="Amabani Street";
//		ref[0][3]="Ambani point";
//		ref[0][4]="India";
//		ref[0][5]="Karnataka";
//		ref[0][6]="Bengaluru";
//		ref[0][7]="560010";
//		ref[0][8]="9876543210";
//		return ref;
		
		
		
//		ref[1][0]="Happy";
//		ref[1][1]="Ambani building , second Floor";
//		ref[1][2]="Amabani Street";
//		ref[1][3]="Ambani point";
//		ref[1][4]="India";
//		ref[1][5]="Karnataka";
//		ref[1][6]="Bengaluru";
//		ref[1][7]="560010";
//		ref[1][8]="9876543210";
//		return ref;
//		
	}
	
	
	
	
	//@Test

	public void Tc_AddToCartTest2() throws Throwable {
		Thread.sleep(3000);
		System.out.println("first test");
		String titleHomePage=driver.getTitle();
		//Assert.assertEquals(titleHomePage, "ShopperStack | Home");
		Thread.sleep(5000);
		HomePage hp=new HomePage(driver);
		WebElement menLink=hp.getmenLink();
		WebDriverUtility WU=new WebDriverUtility();
		WU.JavascriptScrollTillWebElement(driver,menLink);
		hp.getTshirtPopupLink().click();
		TshirtPage tsp=new TshirtPage(driver);
		String currentUrlText = driver.getCurrentUrl();
		Assert.assertEquals(currentUrlText, "https://www.shoppersstack.com/sub-category/men-tshirt");
		WU.mouseOverAction(driver,tsp.getTshirTopLink());
		tsp.getPumaShirt().click();

		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart");
		System.out.println("Cart page has opened");
		
		

	AddToCartPage ac = new AddToCartPage(driver);
	String LeviProductText = ac.getpuma().getText();

	Assert.assertEquals(LeviProductText,"PUMA")	;
	System.out.println("product is added to the cart");
	ac.getBuyNowButtonInAddToCartPage().click();
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals(currentUrl, "https://www.shoppersstack.com/selectaddress");
	System.out.println("address page is displayed");
	ac.getBuyNowButtonInAddToCartPage().click();
	
	
	
	}
		




//@Test
public void Tc_AddToCartTest3() throws Throwable {
	Thread.sleep(5000);
	System.out.println("second test");
}


@Test(dataProvider="dataProvider")

public void Tc_EndTOEndTest(String home,String house_office,String street,String landmark,String Country,String state,String city,String pincode,String mobnum ) throws Throwable {
	
	System.out.println("add address");
	Thread.sleep(3000);
	System.out.println("first test");
	String titleHomePage=driver.getTitle();
	Assert.assertEquals(titleHomePage, "ShopperStack | Home");
	Thread.sleep(5000);
	HomePage hp=new HomePage(driver);
	WebElement menLink=hp.getmenLink();
	WebDriverUtility WU=new WebDriverUtility();
	WU.JavascriptScrollTillWebElement(driver,menLink);
	hp.getTshirtPopupLink().click();
	TshirtPage tsp=new TshirtPage(driver);
	String currentUrlText = driver.getCurrentUrl();
	Assert.assertEquals(currentUrlText, "https://www.shoppersstack.com/sub-category/men-tshirt");
	WU.mouseOverAction(driver,tsp.getTshirTopLink());
	tsp.getPumaShirt().click();

	Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart");
	System.out.println("Cart page has opened");
	AddToCartPage ac = new AddToCartPage(driver);
	String LeviProductText = ac.getpuma().getText();

	Assert.assertEquals(LeviProductText,"Levis Mens Regular Fit Tee")	;
	System.out.println("product is added to the cart");
	ac.getBuyNowButtonInAddToCartPage().click();
	String currentUrl = driver.getCurrentUrl();
	Assert.assertEquals(currentUrl, "https://www.shoppersstack.com/selectaddress");
	System.out.println("address page is displayed");
	ac.getBuyNowButtonInAddToCartPage().click();

	System.out.println("add address");
	Thread.sleep(5000);
	
    hp.javaScriptClick(driver);
	//hp.getaccountSettingButton().click();
    Thread.sleep(3000);
	AccountSettingPage ap=new AccountSettingPage(driver);
	ap.getmyProfileLink().click();
	
	Assert.assertEquals(driver.getCurrentUrl(), "https://www.shoppersstack.com/my-profile/my-profile-info");
	System.out.println("My Profile page is opened");
	 Thread.sleep(3000);
	MyProfilePage mp=new MyProfilePage(driver);
    mp.getmyAddressButton().click();
    Thread.sleep(3000);
    AddressPage Ap=new AddressPage(driver);
    Ap.getaddAddressFormbutton().click();
    Thread.sleep(3000);
    AddressFormPage af =new AddressFormPage(driver);
    af.getnameTextField().sendKeys(home);
    af.gethouseOfficeTextField().sendKeys(house_office);
    af.getstreetInfoTextField().sendKeys(street);
    af.getlandmarkTxtField().sendKeys(landmark);
    WebElement countrydrop = af.getcountryTextFieldDropDown();
    DD.SelectDropDownByVIsibleText(Country,countrydrop);
    WebElement Statedrop = af.getstateDropDown();
    DD.SelectDropDownByVIsibleText(state, Statedrop);
    WebElement citydrop = af.getcityDropDown();
    DD.SelectDropDownByVIsibleText(city, citydrop);
    af.getpincodeTextField().sendKeys(pincode);
    af.getphonenumberTextField().sendKeys(mobnum);
    af.getaddAddressButton().click();
    Ap.getHariHara().click();
    Ap.getProceedButton().click();
    PaymentMethod pm=new PaymentMethod(driver);
    pm.getNetBanking().click();
    pm.getProceedButton().click();
    
    NetBankingPage nt=new NetBankingPage(driver);
    driver.switchTo().frame(nt.getnetBankingFrameTag());
    
    nt.getidhcradiobutton().click();
    nt.getSubmitbutton().click();
    
  
    
    
   }

@DataProvider
public Object[][] dataProviderAddress1() throws  Throwable{
	return data.AcessAddress();
	
	



	
}

}
		
		


