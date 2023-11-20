package RestAssured.httpMethods;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PostMethod {

    @Test
    public void postmethod(){
        //Create new record
        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
        RequestSpecification requestSpecification=RestAssured.given()
                .header("Content-Type","application/json")
                .body("{\"name\":\"Nisha\"," +
                        "\"salary\":\"28500\"," +
                        "\"age\":\"23\"}");
        Response response=requestSpecification.request(Method.POST,"/create");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
    }
}
