package testNG.Air_Canada;

import io.appium.java_client.android.AndroidDriver;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Test_Case_2 {
public void takeScreenshot(String testName, String timeStamp) throws IOException {
		
		
		
		WebDriver driver1 = new Augmenter().augment(driver);
		File file  = ((TakesScreenshot)driver1).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file, new File("test-output\\screens\\" + timeStamp + "\\" + testName+".jpg"));
		
	}
	
	
	
	private AndroidDriver driver;
	
	String timeStamp = new SimpleDateFormat("yyyy.MM.dd_(HH-mm-ss)").format(new Date());
	
	

	
	
	
	@Test
	
	public void test2() throws Exception{
		
		
		//String testName = "General_Smoke";
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("android:id/button1")));
		
		driver.findElement(By.id("android:id/button1")).click();
		
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/buttonFlightStatus")));
		
		driver.findElement(By.id("com.AirCanadaApp:id/buttonFlightStatus")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_search")));
		
	  	
		//driver.swipe(300, 900, 300, 700, 500);	
	
		Thread.sleep(2000);

		//driver.swipe(550, 900, 550, 700, 500);
		
		Thread.sleep(2000);
	
		//driver.swipe(750, 900, 750, 700, 500);

		//Thread.sleep(2000);
		
		driver.findElement(By.className("android.widget.EditText")).sendKeys("121");
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("com.AirCanadaApp:id/btn_search")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("com.AirCanadaApp:id/btn_add_flight")));
		
		
		WebElement startLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='0']"));
		WebElement destinationLocation = driver.findElement(By.xpath("//android.widget.ListView//android.widget.LinearLayout[@index='1']//android.widget.TextView[@index='1']"));
		WebElement button = driver.findElement(By.id("com.AirCanadaApp:id/btn_add_flight"));
				
		//takeScreenshot(testName, timeStamp);
		
		System.out.println(startLocation.getText());
		System.out.println(destinationLocation.getText());
		System.out.println("Button: " + button.getText());
		
		
		//takeScreenshot(testName, timeStamp);


		Assert.assertEquals("Toronto Pearson", startLocation.getText());
		Assert.assertEquals("Calgary Intl", destinationLocation.getText());
		Assert.assertEquals("Add to My Flights", button.getText());
		
	}
	
	@BeforeMethod
	public void beforMethod() throws IOException, InterruptedException{
		
	
		
		DesiredCapabilities capabilities = new DesiredCapabilities();
    	capabilities.setCapability("automationName","Appium");
    	capabilities.setCapability("deviceName","LG G2 Mini");
    	//capabilities.setCapability("uid","emulator-5554");
    	capabilities.setCapability("app","D:\\com.AirCanadaApp.master4.apk");
    	//capabilities.setCapability("uid","LGD620875202e3");
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
