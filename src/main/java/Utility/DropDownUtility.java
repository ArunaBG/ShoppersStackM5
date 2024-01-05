package Utility;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropDownUtility {

	public void SelectDropDownByVIsibleText(String textoption,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.selectByVisibleText(textoption);
	}
	
	public void SelectDropDownByValue(String ValueAttributeValue,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.selectByValue(ValueAttributeValue);
	}
	
	public void SelectDropDownByIndex(int Index,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.selectByIndex(Index);
	}
	
	public void DeSelectDropDownByVIsibleText(String textoption,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.deselectByVisibleText(textoption);
	}
	
	public void DeSelectDropDownByValue(String ValueAttributeValue,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.deselectByValue(ValueAttributeValue);
	}
	
	public void DeSelectDropDownByIndex(int Index,WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		select.deselectByIndex(Index);
	}
	
	public ArrayList ToGetAllOPtionsText (WebElement SelectTagOfDropDown) {
		Select select=new Select(SelectTagOfDropDown);
		List<WebElement> AllOptions = select.getOptions();
		ArrayList<String> allOptionsText=new ArrayList<String>();
		
		for(WebElement ele:AllOptions) {
			allOptionsText.add(ele.getText());
			
		}
		return allOptionsText;
	}
	
	public WebElement ToGetParticularOptionIndex(WebElement selectTagOfDropDown,int indexOfOption) {
		Select select=new Select(selectTagOfDropDown);
		List<WebElement> allOptions = select.getOptions();
		WebElement ParticularOptionWebelement = allOptions.get(indexOfOption);
		return ParticularOptionWebelement;
		
	}
}
