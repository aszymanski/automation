package Workshops.Workshops;

import io.selendroid.client.SelendroidDriver;
import io.selendroid.client.TouchAction;
import io.selendroid.client.TouchActionBuilder;
import io.selendroid.common.SelendroidCapabilities;



import org.junit.AfterClass;
import org.junit.Assert;
//import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class EmulatorLoads {
	
	static SelendroidDriver driver;

	@BeforeClass
	public static void classSetup() throws Exception {
		
		SelendroidCapabilities caps = new SelendroidCapabilities("io.selendroid.testapp:0.15.0");
		caps.setEmulator(true);
		//caps.setSerial("emulator-5554");
		driver = new SelendroidDriver(caps);
		
	}
	/*
	@Test
	public void testThatTheEmulatorLoadsAndWeCanType() {
		
		WebElement inputField = driver.findElement(By.id("my_text_field"));
		Assert.assertEquals("true", inputField.getAttribute("enabled"));
		inputField.sendKeys("Selendroid");
		Assert.assertEquals("Selendroid",inputField.getText());		
	}
	*/
	
	@Test
	public void testFindElementsAndType() {
		
		//WebElement button = driver.findElement(By.xpath("//Button[@id='buttonTest']"));
		//button.click();
		WebElement inputField = driver.findElement(By.id("my_text_field"));
		inputField.sendKeys("I like cheese");
		
		TouchActionBuilder builder = new TouchActionBuilder();

		TouchAction dragAndDrop = builder.pointerDown(inputField)
		.pointerMove(inputField, 10,0)
		.pointerUp()
		.build();
		dragAndDrop.perform(driver);
		
	}
	
	
	@AfterClass
	public static void classTeardown() throws Exception {
		driver.quit();
	}
	
	
		
	

}
