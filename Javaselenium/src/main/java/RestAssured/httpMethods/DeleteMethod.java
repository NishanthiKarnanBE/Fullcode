package RestAssured.httpMethods;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class DeleteMethod {

    @Test
    public void deletemethod(){
        //Delete  a request
        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
        RequestSpecification requestSpecification=RestAssured
                .given()
                .header("Content-Type","application/json");
        Response response=requestSpecification.request(Method.DELETE,"/delete/2");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
    }
}
