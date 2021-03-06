package Example_report.JUnit_example;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.android.AndroidDriver;


public class Calculator2
{
	private AndroidDriver driver;
	
	@Before
    public void setUp() throws Exception {
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("automationName","Appium");
    	capabilities.setCapability("deviceName","Nexus_5_API_21_x86");
    	capabilities.setCapability("uid","emulator-5554");
    	//capabilities.setCapability("uid","LGD620875202e3");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("deviceReadyTimeout","35");
    	capabilities.setCapability("androidDeviceReadyTimeout","35");
    	capabilities.setCapability("version","5.0.1");
    	capabilities.setCapability("avd","Nexus_5_API_21_x86");
    	capabilities.setCapability("appPackage","com.android.calculator2");
    	capabilities.setCapability("appActivity","com.android.calculator2.Calculator");
    	capabilities.setCapability("appWaitActivity","com.android.calculator2.Calculator");
    	capabilities.setCapability("noReset","true");
    	
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
    public void sum() throws Exception{
	
		
		Thread.sleep(2000);
	
	driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
	
			Thread.sleep(2000);
	
	driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
	
		
			Thread.sleep(2000);
		
	
	driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
	
		Thread.sleep(2000);

	driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		
	}
	@Test
    public void sum2(){
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	
	
	driver.findElement(By.id("com.android.calculator2:id/digit_4")).click();
	

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}	
	
	
	driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	
	driver.findElement(By.id("com.android.calculator2:id/digit_6")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}   	
	driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		
	}
	@Test
    public void sum3(){
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	
	
	driver.findElement(By.id("com.android.calculator2:id/digit_1")).click();
	

		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}	
	
	
	driver.findElement(By.id("com.android.calculator2:id/op_add")).click();
	
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
	
	driver.findElement(By.id("com.android.calculator2:id/digit_9")).click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}   	
	driver.findElement(By.id("com.android.calculator2:id/eq")).click();
		
	}
	
   
}
