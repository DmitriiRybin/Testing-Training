package First;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.util.HashMap;
import static io.restassured.RestAssured.given;

public class SimpleTest {

    @Test
    public void createUser() {

        HashMap data = new HashMap();
        data.put("id", 111);
        data.put("username", "alexnat");
        data.put("firstName", "alex");
        data.put("lastName", "Nat");
        data.put("email", "example@example.com");
        data.put("password", "123456");
        data.put("phone", "iphone");
        data.put("userStatus", 0);


    Response response =
        given() .contentType("application/json")
                .body(data)
                .when()
                    .post("https://petstore.swagger.io/v2/user")
                .then()
                    .statusCode(200). log(). body() .extract() .response();

        String jsonStr = response.asString();
        Assert.assertEquals(jsonStr.contains("unknown"), true);
    }



}
