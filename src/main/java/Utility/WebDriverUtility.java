package Utility;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtility {
	
	
	
/**Author:Mustakim
 * When we get ElementClickInterceptedException (when element is hidden by other element)
 * then we will use java script click
 * @param driver
 * @param ele
 */
	public void JavaScriptClick(WebDriver driver,WebElement ele) {
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();",ele);
		 
	}
	
	/**Author:Musthakim
	 * to avoid ElementClickInterceptedException
	 * @param driver
	 * @param ele
	 */
	
	
	public void JavascriptSendKeys(WebDriver driver,WebElement ele) {
		
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].click();",ele);
	}
	
	/**
	 * Author:Musthakim
	 * this page will scroll the webpage till the given element
	 * @param driver
	 * @param ele
	 */
	
	
	public void JavascriptScrollTillWebElement(WebDriver driver,WebElement ele) {
		
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("arguments[0].scrollIntoView(true);",ele);
	}
	
	
	
	/**
	 * Author:Musthakim
	 * this page will scroll the webpage with given coordinates
	 * @param driver
	 * @param x
	 * @param y
	 */
	
	
	
	
	public void JavascriptSrollByCoordinates(WebDriver driver,int x,int y) {
		
		 JavascriptExecutor jse=(JavascriptExecutor)driver;
		 jse.executeScript("scrollBy("+x+","+y+");");
	}
	
	
	/**
	 * Author:Musthakim
	 * thie menthod will highlight the webelement border with 2px red color
	 * @param driver
	 * @param ele
	 */
	
	public void JavascriptHighlightElement(WebDriver driver,WebElement ele) {
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("arguments[0].style.border='2px solid red';", ele);
	}
	
	/**
	 * To perform mouse over operation
	 * @param driver
	 * @param ele
	 */
	public void  mouseOverAction(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.moveToElement(ele).perform();
		
		}
	/**
	 * To perform double click operation
	 * @param driver
	 * @param ele
	 */
	public void DoubleClick(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.doubleClick(ele).perform();
	}
	/**
	 * To perform right click operation
	 * @param driver
	 * @param ele
	 */
	public void RightClick(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.contextClick(ele).perform();
	}
	/**
	 * To perform drag and drop operation between two elements
	 * @param driver
	 * @param draggingElement
	 * @param dropingElement
	 */
	public void DragAndDrop(WebDriver driver,WebElement draggingElement,WebElement dropingElement) {
		Actions action=new Actions(driver);
		action.dragAndDrop(draggingElement, dropingElement).perform();
	}
	/**
	 * To perform Click and hold operationbetween two elements
	 * @param driver
	 * @param ele
	 */
	public void ClickAndHold(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.clickAndHold(ele).perform();
		
	}
	/**
	 * To scroll webpage till the element
	 * @param driver
	 * @param ele
	 */
	
	public void ScrolToElementByActionsClass(WebDriver driver,WebElement ele) {
		Actions action=new Actions(driver);
		action.scrollToElement(ele).perform();
	}
	/**
	 *this method will wait until given element is visible
	 * @param driver
	 * @param ele
	 * @param timeDelay
	 */
	public void ExplicitlyWaitForElementToBeClickableByVisibility(WebDriver driver, WebElement ele,int timeDelay) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}
	
	/**
	 * *this method will wait until reaches the element 
	 * @param driver
	 * @param locator
	 * @param timeDelay
	 */
public void ExplicitlyWaitForElementToBeClickable(WebDriver driver, By locator,int timeDelay) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.elementToBeClickable(locator));
	}
	
	/**
	 * this method will wait until alert is present
	 * @param driver
	 * @param timeDelay
	 */
public void ExplicitlyWaitForAlert(WebDriver driver, int timeDelay) {
		
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
		wait.until(ExpectedConditions.alertIsPresent());
	}
/**
 * this method will wait until particular page or  particular(given) url appears
 * @param driver
 * @param timeDelay
 * @param CompleteUrl
 */
public void ExplicitlyWaitForUrl(WebDriver driver, int timeDelay,String CompleteUrl) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
	wait.until(ExpectedConditions.urlToBe(CompleteUrl));
}

/**
 * this method will wait until particular page is displayed
 * @param driver
 * @param timeDelay
 * @param CompleteTitle
 */
public void ExplicitlyWaitForTitle(WebDriver driver, int timeDelay,String CompleteTitle) {
	
	WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(timeDelay));
	wait.until(ExpectedConditions.titleIs(CompleteTitle));
}
	
}
