package TestCase;

	
		
		import java.io.File;
		import java.io.FileInputStream;
		import java.io.FileNotFoundException;
		import java.util.Properties;

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

		import POM_2_CLASSES.AccountSettingPage;
		import POM_2_CLASSES.AddressFormPage;
		import POM_2_CLASSES.HomePage;
		import POM_2_CLASSES.MyAddress;
		import POM_2_CLASSES.MyProfilePage;
		import POM_2_CLASSES.NetBankingPage;
		import POM_2_CLASSES.OrderConfirm;
		import POM_2_CLASSES.PaymentMethod;
		import POM_2_CLASSES.TshirtPage;
		import POM_2_CLASSES.addToCartPage;
		import POM_2_CLASSES.addressPage;
		import Utilities.BaseClass;
		import Utilities.DataUtility;
		import Utilities.IPathConstant;

		@Listeners(Utilities.ListenersUtility.class)
		public class AddToCartTest_2 extends BaseClass
		{
			
			
			@Test(dataProvider="dataProviderAddress")
			public void Tc_AddAddress_001_Test(String home,String house_office,
				String street,String landmark,String country,String state,String city,String Dpin,String mobN) throws Throwable {
				System.out.println("add address");
				 Thread.sleep(5000);
				 HomePage hp=new HomePage(driver);
				 hp.javaScriptClick(driver);
			
				 Thread.sleep(3000);
				AccountSettingPage as=new AccountSettingPage(driver);
				as.getmyProfileLink().click();
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/my-profile/my-profile-info");

				System.out.println("The my profile  page is opened");
				MyProfilePage mp=new MyProfilePage(driver);
				mp.getmyAddressLink().click();
				
				MyAddress ma=new MyAddress(driver);
				
				ma.getaddressformbutton().click();
				
				AddressFormPage afp=new AddressFormPage(driver);
				afp.getNameTextField().sendKeys(home);
				afp.getHouseOfficeInformationTextField().sendKeys(house_office);
				afp.getStreetInformationTextField().sendKeys(street);
				afp.getLandmarkTextField().sendKeys(landmark);
				WebElement counrtyDropdown=afp.getCountryDropDown();
				drpU.selectDropDownByVisibleText(country,counrtyDropdown);
				WebElement StateDropdown=afp.getStateDropDown();
				drpU.selectDropDownByVisibleText(state,StateDropdown);
				WebElement CityDropdown=afp.getCityDropDown();
				drpU.selectDropDownByVisibleText(city,CityDropdown);
				afp.getPincodeTextField().sendKeys(Dpin);
				afp.getPhoneNumberTextField().sendKeys(mobN);
				afp.getAddAddressButton().click();		
			}
			
			@DataProvider
			public Object[][] dataProviderAddress() throws Throwable{	
				return du.aceessAllAddress();
			}
			

			
			@Test(priority=1,dependsOnMethods="Tc_AddAddress_001_Test")
			public void Tc_EndToEndCashOnDelivery_Test() throws Throwable {	
			Thread.sleep(3000);
		    System.out.println("first test case");
		    String titleHomePage=driver.getTitle();
		    Assert.assertEquals(titleHomePage,"ShoppersStack | Home"); 
		    HomePage hp=new HomePage(driver);
		    Thread.sleep(5000);
		    WebElement menLink=hp.getmenMenuLink(); 
		    wu.mouseOverAction(driver,menLink);  
		    hp.getTshirtPopupLink().click();  
		    TshirtPage tsp=new TshirtPage(driver);
		String currentUrl=driver.getCurrentUrl();
		  Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/sub-category/men-tshirt"); 
		  wu.mouseOverAction(driver,tsp.gettshirtTopLink());
		    tsp.gettlevisMensRegularfitproduct_AddTOCartButton().click();    hp.getaddToCartLink().click();
		   Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart"); 
		    System.out.println("The cart page has opened");
		   
		   addToCartPage ac=new addToCartPage(driver);
		   String levisProductTest= ac.getlevisProduct().getText();
		   Assert.assertEquals(levisProductTest,"Levis Mens Regular Fit Tee");
		    System.out.println("the product is added to cart");
		    ac.buyNowButtonInAddToCartPage().click();
		     String addresPageUrl = driver.getCurrentUrl();
		     Assert.assertEquals(addresPageUrl,"https://www.shoppersstack.com/selectaddress");
		     System.out.println("the address page is displayed"); 
		    
		    addressPage ap= new addressPage(driver);
		     ap.getlovwebirdAddress().click();
		     ap.getprocedButton().click();
		     
		     PaymentMethod pm=new PaymentMethod(driver);
		     pm.getcashOndeliveryRadioButton().click();
		     pm.getProceedButton().click();
		     
		     OrderConfirm oc=new OrderConfirm(driver);
		     
		     Assert.assertEquals(oc.getOrderConfirmedText().getText(),"Order Confirmed");
		     System.out.println("The order got confiremed in cash on delivery");
			}

			@Test(priority=2,dependsOnMethods="Tc_AddAddress_001_Test")
			public void EndToEnd_NetBanikng() throws Throwable {
				Thread.sleep(3000);
			    System.out.println("first test case");
			    String titleHomePage=driver.getTitle();
			    Assert.assertEquals(titleHomePage,"ShoppersStack | Home"); 
			    HomePage hp=new HomePage(driver);
			    Thread.sleep(5000);
			    WebElement menLink=hp.getmenMenuLink(); 
			    wu.mouseOverAction(driver,menLink);  
			    hp.getTshirtPopupLink().click();  
			    TshirtPage tsp=new TshirtPage(driver);
			String currentUrl=driver.getCurrentUrl();
			  Assert.assertEquals(currentUrl,"https://www.shoppersstack.com/sub-category/men-tshirt"); 
			  wu.mouseOverAction(driver,tsp.gettshirtTopLink());
			    tsp.gettlevisMensRegularfitproduct_AddTOCartButton().click();    hp.getaddToCartLink().click();
			   Assert.assertEquals(driver.getCurrentUrl(),"https://www.shoppersstack.com/cart"); 
			    System.out.println("The cart page has opened");
			   
			   addToCartPage ac=new addToCartPage(driver);
			   String levisProductTest= ac.getlevisProduct().getText();
			   Assert.assertEquals(levisProductTest,"Levis Mens Regular Fit Tee");
			    System.out.println("the product is added to cart");
			    ac.buyNowButtonInAddToCartPage().click();
			     String addresPageUrl = driver.getCurrentUrl();
			     Assert.assertEquals(addresPageUrl,"https://www.shoppersstack.com/selectaddress");
			     System.out.println("the address page is displayed"); 
			    
			    addressPage ap= new addressPage(driver);
			     ap.getlovwebirdAddress().click();
			     ap.getprocedButton().click();
//			     PaymentMethod pm=new PaymentMethod(driver);
//			    WebElement netbankingbutton= pm.getNetBankingButton();
//			    wu.javaScriptClick(driver,netbankingbutton);
//			    
//			    Thread.sleep(3000);
//			     pm.getProceedButton().click();
//			     NetBankingPage nb= new NetBankingPage(driver);
//			     driver.switchTo().frame(nb.getnetBankingFrameTag());
//			     
//			     Thread.sleep(3000);
//			     nb.getIDHC_radioButton().click();
//			     Thread.sleep(3000);
//			     nb.getsubmitButton().click();
//			     
//			     
//			     
			}
			
		}

	

	
	
