package Example_report.JUnit_example;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import java.util.HashMap;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AC_app_example {
	
private AndroidDriver driver;
	
	
	@Before
    public void setUp() throws Exception {
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("automationName","Appium");
    	capabilities.setCapability("deviceName","LG G2 Mini");
    	capabilities.setCapability("uid","emulator-5554");
    	capabilities.setCapability("app","D:\\com.AirCanadaApp.master4.apk");
    	//capabilities.setCapability("uid","LGD620875202e3");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("deviceReadyTimeout","35");
    	capabilities.setCapability("androidDeviceReadyTimeout","35");
    	capabilities.setCapability("version","5.0.1");
    	capabilities.setCapability("avd","Nexus_5_API_21_x86");
    	//capabilities.setCapability("appPackage","com.example.aszymanski.myapplication1");
    	//capabilities.setCapability("appActivity","com.example.aszymanski.myapplication1.MainActivity");
    	//capabilities.setCapability("appWaitActivity","com.example.aszymanski.myapplication1.MainActivity"); 
    	//capabilities.setCapability("noReset","true");
    	
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
    public void AC_test1(){
		
		
		
		
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonFlightStatus")));
		
		driver.findElement(By.id("com.AirCanadaApp:id/buttonFlightStatus")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_search")));
		
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("121");
		
		driver.findElement(By.id("com.AirCanadaApp:id/btn_search")).click();
		
	}

}
