package RestAssured.Authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BasicAuth {

    //Some request need authorization to print the response
    //There are so many authorization here we are using basic auth
    //For basic auth we need to give username and password in 'auth' method and 'basic' method

    @Test
    public void basicAuth(){
        RestAssured
                .given()
                .auth()
                    .basic("postman","password")
                .baseUri("https://postman-echo.com/")
                .when()
                    .get("basic-auth")
                .prettyPrint();
    }
}
