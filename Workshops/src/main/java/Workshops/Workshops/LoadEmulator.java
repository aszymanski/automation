package Workshops.Workshops;

import java.io.File;
import java.net.URL;

import org.junit.Assert;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoadEmulator {
//APIUM
	
	static WebDriver driver;
	
	@BeforeClass
	public static void setUp() throws Exception {
		
		File classPathRoot = new File(System.getProperty("user.dir"));
		File appDir = new File(classPathRoot, "../../Downloads");
		File app = new File(appDir, "selendroid-test-app-0.15.0.apk");
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability("deviceName", "LG G2 Mini");
		cap.setCapability("deviceName", "Nexus_5_API_21_x86");
		//cap.setCapability("uid","LGD620875202e3");
		cap.setCapability("platformName","Android");
		cap.setCapability("uid","emulator-5554");
		cap.setCapability("avd","Nexus_5_API_21_x86");
		cap.setCapability("platformVersion", "5.0.1");
		cap.setCapability("app", app.getAbsolutePath());
		cap.setCapability("appPackage", "io.selendroid.testapp");
		cap.setCapability("appActivity",".HomeScreenActivity");
		driver = new RemoteWebDriver(new URL("http://127.0.0.1:4723/wd/hub"),cap);
	
	}
	
	@Test
	public void loadEmulator() {
		
		WebDriverWait wait;
		wait = new WebDriverWait(driver, 60);
		

		WebElement inputField = driver.findElement(
				By.className("android.widget.EditText"));
		WebElement buttonSec = driver.findElement(By.id("io.selendroid.testapp:id/showPopupWindowButton"));
		
		wait.until(ExpectedConditions.elementToBeClickable(buttonSec));
		
		Assert.assertEquals("true", inputField.getAttribute("enabled"));
		
		
		//inputField.sendKeys("Appium");
		//Assert.assertEquals("Appium", inputField.getText());
		
		 
		buttonSec.click();
		
		
	}
	
	
	
	@AfterClass
	public static void tearDown() throws Exception {
		driver.quit();
	}
	
}
