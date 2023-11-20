package RestAssured.httpMethods;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class PutMethod {

    @Test
    public void putmethod(){
        //Update the existing request
        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
        RequestSpecification requestSpecification=RestAssured
                .given()
                .header("Content-Type","application/json")
                .body("{\"name\":\"test_update\"," +
                        "\"salary\":\"123\"," +
                        "\"age\":\"23\"}");
        Response response=requestSpecification.request(Method.PUT,"/update/21");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
    }
}
