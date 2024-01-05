package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		String FailedMethod = result.getMethod().getMethodName().toString();
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File tempfile=ts.getScreenshotAs(OutputType.FILE);
		String currentTime=LocalDateTime.now().toString().replace(":", "-");
		
		File permnentFile=new File("./src/test/resources/screenshot"+FailedMethod+".png");
	    try {
			FileHandler.copy(tempfile, permnentFile);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}



	
}
