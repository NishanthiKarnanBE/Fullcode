package RestAssured.httpMethods;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.Test;

public class GetMethod {
    @Test
    public  void getall(){
        //Gett all values
        RestAssured.baseURI="https://dummy.restapiexample.com/api/v1";
        RequestSpecification requestSpecification = RestAssured.given();
        Response response=requestSpecification.request(Method.GET,"/employees");
        System.out.println(response.asPrettyString());
        System.out.println(response.getStatusCode());
    }
}
