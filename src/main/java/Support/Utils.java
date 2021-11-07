package Support;
import java.io.FileReader;
import java.io.IOException;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Utils {
  public void accessCMD(String command) {
    Runtime runtime = Runtime.getRuntime();
    try {
      runtime.exec(command);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
  public JSONObject getPayload() {
    JSONParser jsonParser = new JSONParser();
    Object object = null;
    try {
      try {

        object = jsonParser.parse(new FileReader("src\\main\\java\\Payload\\age.json"));
      } catch (IOException e) {
        e.printStackTrace();
      }
    } catch (org.json.simple.parser.ParseException e) {
      e.printStackTrace();
    }
    JSONObject json = (JSONObject) object;
    return json;
  }

}
