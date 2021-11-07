package Pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppPage {

  public static AppiumDriver appDriver;

  public void launchApp() throws MalformedURLException {
    DesiredCapabilities capabilities = new DesiredCapabilities();
    capabilities.setCapability("deviceName", "Parent");
    capabilities.setCapability("platformVersion", "9.0.0");
    capabilities.setCapability("platformName", "ANDROID");
    capabilities.setCapability("udid", "5200472dec01a4a9");
  capabilities.setCapability("appPackage", "com.example.ageverifier");
  capabilities.setCapability("appActivity", ".MainActivity");
    URL mobileURL = new URL("http://127.0.0.1:4723/wd/hub");
      appDriver = new AndroidDriver(mobileURL, capabilities);

  }

}
