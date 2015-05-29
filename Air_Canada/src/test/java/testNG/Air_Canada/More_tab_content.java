package testNG.Air_Canada;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class More_tab_content {

	private AndroidDriver driver;

	
	@Test(groups="banan")
	
	public void openMoreTab() {
		
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		
		driver.findElement(By.id("android:id/button1")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonMore")));
		
		driver.findElement(By.id("com.AirCanadaApp:id/buttonMore")).click();
			
	}
	
	/*
	@Test(groups="banan")
	
	public void checkContentOfMoreTab() {
		
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonInflightEntertainment")));
	
		driver.findElement(By.id("com.AirCanadaApp:id/buttonInformationAndServices")).click();
				
	}
	*/
	
	@BeforeMethod
	public void beforMethod() throws IOException, InterruptedException{
		
	
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("automationName","Appium");
    	capabilities.setCapability("deviceName","LG G2 Mini");
    	//capabilities.setCapability("uid","emulator-5554");
    	capabilities.setCapability("app","D:\\com.AirCanadaApp.master4.apk");
    	capabilities.setCapability("uid","LGD620875202e3");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("deviceReadyTimeout","35");
    	capabilities.setCapability("androidDeviceReadyTimeout","35");
    	capabilities.setCapability("version","4.4.2");
    	//capabilities.setCapability("avd","myEmulator2");
    	//capabilities.setCapability("appPackage","com.example.aszymanski.myapplication1");
    	//capabilities.setCapability("appActivity","com.example.aszymanski.myapplication1.MainActivity");
    	//capabilities.setCapability("appWaitActivity","com.example.aszymanski.myapplication1.MainActivity"); 
    	capabilities.setCapability("noReset","false");
    	
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	@AfterMethod
	public void afterMethod(){
		
		driver.quit();
	}
	
	
	
}
