package Pages;
import static com.jayway.restassured.RestAssured.given;
import com.jayway.restassured.response.Response;
import org.json.simple.JSONObject;


public class RestService {
  public Response response;
  String baseUrl = "https://age-verifier.herokuapp.com/age/verifier";
  public Response executePostRequest(JSONObject payload){
    response = given().body(payload).
        contentType("application/json").
        when().
        post(baseUrl);
    return response;
  }
}
