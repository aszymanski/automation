package testNG.Jenkins_test;

import io.appium.java_client.android.AndroidDriver;

import java.io.IOException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Sample {
	
	private AndroidDriver driver;
  @Test
  public void f() {
	  
	  
  }
  
	@BeforeMethod
	public void beforMethod() throws IOException, InterruptedException{
		
	
		
	
	DesiredCapabilities capabilities = new DesiredCapabilities();
  	capabilities.setCapability("automationName","Appium");
  	capabilities.setCapability("udid","emulator-5554");
	capabilities.setCapability("deviceName","myEmulator2");
  	capabilities.setCapability("app","http://localhost:8080/job/MySampleProject/lastSuccessfulBuild/artifact/app/build/outputs/apk/app-release-unsigned.apk");
  	capabilities.setCapability("platformName","Android");
  	capabilities.setCapability("deviceReadyTimeout","35");
  	capabilities.setCapability("androidDeviceReadyTimeout","35");
  	capabilities.setCapability("version","4.4.2");
  	capabilities.setCapability("avd","myEmulator2");

  	capabilities.setCapability("noReset","false");
  	
  	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		
	}
	
	@AfterMethod
	public void afterMethod(){
		
		driver.quit();
	}
}
