package StepDefs;
import Pages.AppPage;
import Pages.MainPage;
import Support.Utils;
import io.cucumber.java.AfterAll;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import java.io.IOException;

public class AppTests_Stepdefs {

  AppPage appPage=new AppPage();
  MainPage mainPage=new MainPage();
  Utils utils=new Utils();
  @Given("I launch the app and provide {string}")
  public void iLaunchTheAppAndProvide(String age) throws Throwable {
    utils.accessCMD("cmd.exe /c start cmd.exe /k \"appium -a 127.0.0.1 -p 4723\"");
    appPage.launchApp();
    mainPage.enterAge(age);
  }

  @And("^click verify button$")
  public void clickVerifyButton() {
    mainPage.clickVerify();
  }

  @Then("I will know the {string}")
  public void iWillKnowThe(String status){
    mainPage.verificationMessage(status);
  }
  @AfterAll
  public static void teardownAppium(){
    Runtime runtime = Runtime.getRuntime();
    try {
      runtime.exec("taskkill /F /IM node.exe");
      runtime.exec("taskkill /f /im cmd.exe");
    } catch (IOException e) {
      e.printStackTrace();
    }
  }


}
