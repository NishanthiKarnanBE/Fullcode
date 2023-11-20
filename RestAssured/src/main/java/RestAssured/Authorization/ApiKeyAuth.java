package RestAssured.Authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class ApiKeyAuth {

    //Another type of authorization is 'ApiKeyAuth'
    //For ApiKeyAuth we need to pass 'Key' and 'Value'


    //This is the simplest one...passing the entire URI with API key in get method
    @Test
    public void apiKeyAuth(){
        RestAssured
                .given()
                .when()
                .get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=3684d5d226c8018853db112e9d2c90b4")
                .prettyPrint();
    }


    //We can also give 'query param' or 'Header'
    @Test
    public void apiKeyAuthUsingParams(){
        RestAssured
                .given()
                .queryParam("q","Salem")
                .queryParam("appid", "af69a29cb4bbb140d13486bc3be3cfa3")// If we need to give Header, here only we need to change 'queryParam' to 'Header'
                .when()
                .get("https://api.openweathermap.org/data/2.5/weather")
                .then()
                .log().body();
    }
}
