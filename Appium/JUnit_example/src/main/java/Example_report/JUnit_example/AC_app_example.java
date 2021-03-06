package Example_report.JUnit_example;

import static org.junit.Assert.*;

import io.appium.java_client.android.AndroidDriver;

import java.net.URL;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    	capabilities.setCapability("noReset","false");
    	
    	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	}
	
	@After
	public void tearDown() throws Exception {
		driver.quit();
	}
	
	@Test
    public void AC_test1() throws InterruptedException{
		
		
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonFlightStatus")));
		
		driver.findElement(By.id("com.AirCanadaApp:id/buttonFlightStatus")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_search")));
		
	  	
		driver.swipe(300, 900, 300, 700, 500);	
	
		Thread.sleep(2000);

		driver.swipe(550, 900, 550, 700, 500);
		
		Thread.sleep(2000);
	
		//driver.swipe(750, 900, 750, 700, 500);

		//Thread.sleep(2000);
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("121");
		
		driver.findElement(By.id("com.AirCanadaApp:id/btn_search")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_add_flight")));
		
		
		WebElement startLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='0']"));
		WebElement destinationLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='1']"));
		WebElement button = driver.findElement(By.id("com.AirCanadaApp:id/btn_add_flight"));
				
		
		System.out.println(startLocation.getText());
		System.out.println(destinationLocation.getText());
		System.out.println("Button: " + button.getText());
		
		
		assertEquals("Toronto Pearson", startLocation.getText());
		assertEquals("Calgary Intl", destinationLocation.getText());
		assertEquals("Add to My Flights", button.getText());

	}
	@Test
    public void AC_test2() throws InterruptedException{
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonFlightStatus")));
		
		driver.findElement(By.id("com.AirCanadaApp:id/buttonFlightStatus")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_search")));
		
	  	
		driver.swipe(300, 900, 300, 700, 500);	
	
		Thread.sleep(2000);

		driver.swipe(550, 900, 550, 700, 500);
		
		Thread.sleep(2000);
	
		//driver.swipe(750, 900, 750, 700, 500);

		//Thread.sleep(2000);
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("121");
		
		driver.findElement(By.id("com.AirCanadaApp:id/btn_search")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_add_flight")));
		
		
		WebElement startLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='0']"));
		WebElement destinationLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='1']"));
		WebElement button = driver.findElement(By.id("com.AirCanadaApp:id/btn_add_flight"));
				
		
		System.out.println(startLocation.getText());
		System.out.println(destinationLocation.getText());
		System.out.println("Button: " + button.getText());
		
		
		assertEquals("Toronto Pearson", startLocation.getText());
		assertEquals("Calgary Intl", destinationLocation.getText());
		assertEquals("Add to My Flights", button.getText());
	}
	

}
