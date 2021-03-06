package Example_report.JUnit_example;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

public class MyApplication1_example {

	private AndroidDriver driver;
	
	
	@Before
    public void setUp() throws Exception {
			
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("automationName","Appium");
    	capabilities.setCapability("deviceName","LG G2 Mini");
    	//capabilities.setCapability("uid","emulator-5554");
    	capabilities.setCapability("uid","LGD620875202e3");
    	capabilities.setCapability("platformName","Android");
    	capabilities.setCapability("deviceReadyTimeout","35");
    	capabilities.setCapability("androidDeviceReadyTimeout","35");
    	capabilities.setCapability("version","5.0.1");
    	//capabilities.setCapability("avd","Nexus_5_API_21_x86");
    	capabilities.setCapability("appPackage","com.example.aszymanski.myapplication1");
    	capabilities.setCapability("appActivity","com.example.aszymanski.myapplication1.MainActivity");
    	capabilities.setCapability("appWaitActivity","com.example.aszymanski.myapplication1.MainActivity");
    	capabilities.setCapability("noReset","true");
    	
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	//clicking example in preinstalled custom application 
	@Test
    public void clicker(){
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.className("android.widget.ImageButton")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.name("Section 1")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.className("android.widget.ImageButton")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.name("Section 2")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.className("android.widget.ImageButton")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.name("Section 3")).click();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		driver.findElement(By.className("android.widget.ImageButton")).click();
	
	}
	
	
}
