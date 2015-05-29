package Multiple_devices.Research;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.*;
       
public class device {

       AppiumDriver driver;
       @BeforeMethod
       @Parameters("device")  
       public void openBroswer(String browser) throws Exception{
       /*
              if(browser.equalsIgnoreCase("dev1")) {
               DesiredCapabilities capabilities = new DesiredCapabilities();
               capabilities.setCapability("deviceName", "Nexus5");
               capabilities.setCapability("udid","emulator-5554");
               capabilities.setCapability("avd","myEmulator2");
               capabilities.setCapability("platformV01ersion", "5.0.1");
               capabilities.setCapability("appPackage","com.android.calculator2");
               capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
               capabilities.setCapability("waitAppActivity", "com.android.calculator2.Calculator");
               driver = new AndroidDriver(new URL("http://127.0.0.1:4722/wd/hub"),capabilities);
              } else {
               DesiredCapabilities capabilities = new DesiredCapabilities();
               capabilities.setCapability("deviceName", "Samsung_Galaxy_S6");
               capabilities.setCapability("udid","emulator-5556");
               capabilities.setCapability("avd","Samsung_Galaxy_S6");
               capabilities.setCapability("platformV01ersion", "5.1.1");
               capabilities.setCapability("appPackage","com.android.calculator2");
               capabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
               capabilities.setCapability("waitAppActivity", "com.android.calculator2.Calculator");
               driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"),capabilities);
              }
          */    
    	   
    	   DesiredCapabilities capabilities = new DesiredCapabilities();
           capabilities.setCapability("deviceName", "Metroll");
           capabilities.setCapability("udid","1c6ca225067b4fa3");

           capabilities.setCapability("platformV01ersion", "5.0.1");
           capabilities.setCapability("appPackage","com.bae.intellicabin");
           capabilities.setCapability("appActivity", "com.bae.ife.MainActivity");
           capabilities.setCapability("waitAppActivity", "com.bae.ife.MainActivity");
           driver = new AndroidDriver(new URL("http://127.0.0.1:4722/wd/hub"),capabilities);
       }
       
       @AfterMethod /* this annotation would run once test script execution would complete*/
       public void closeBrowser() {
              try {
                     driver.wait(15000);
              } catch(Exception e){}

              //driver.quit();
       }
}
