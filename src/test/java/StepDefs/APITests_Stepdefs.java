package StepDefs;
import Pages.RestService;
import Support.Utils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.Given;
import org.json.simple.JSONObject;
import org.junit.Assert;

public class APITests_Stepdefs {
Utils utils=new Utils();
RestService restService=new RestService();
  @Given("I check if the {string} is legal")
  public void iCheckIfTheIsLegal(String age) {
    JSONObject postAge= utils.getPayload();
    postAge.replace("age",age);
    restService.executePostRequest(postAge);


  }

  @Then("I should get a {string}")
  public void iShouldGetA(String response) {
   Assert.assertEquals(restService.response.getBody().path("isValid"),Boolean.valueOf(response));
  }


}
