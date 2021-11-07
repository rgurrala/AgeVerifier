package Pages;


import static Pages.AppPage.appDriver;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage {

  public WebDriverWait webDriverWait(){
    return new WebDriverWait(appDriver, 30);
  }

  public void enterAge(String age) {
    webDriverWait().until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.EditText[@resource-id='com.example.ageverifier:id/editTextNumber']"))).sendKeys(age);}

  public void clickVerify(){
    webDriverWait().until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@resource-id='com.example.ageverifier:id/button']"))).click();
  }

  public void verificationMessage(String message) {
    webDriverWait().until(ExpectedConditions.visibilityOfElementLocated(MobileBy.AndroidUIAutomator("new UiSelector().textContains(\""+message+"\")")));
  }

}
