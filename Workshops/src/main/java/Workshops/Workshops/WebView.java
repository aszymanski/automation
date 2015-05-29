package Workshops.Workshops;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.common.SelendroidCapabilities;
import io.selendroid.common.device.DeviceTargetPlatform;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class WebView {
	
	static SelendroidDriver driver;

	@BeforeClass
	public static void classSetup() throws Exception {
		
		SelendroidCapabilities caps = new SelendroidCapabilities("io.selendroid.testapp:0.15.0");	
		caps.setEmulator(true);
		
		driver = new SelendroidDriver(caps);	
	}
	
	@Test
	public void testSwitchToWebView() {
		WebElement button = driver.findElement(By.id("buttonStartWebView"));
		button.click();
		driver.switchTo().frame("WEBVIEW");
		driver.findElement(By.tagName("input")).sendKeys("Mobile web is the future");
	}
	
	
	
	@AfterClass
	public static void classTeardown() throws Exception {
		driver.quit();
	}

}
