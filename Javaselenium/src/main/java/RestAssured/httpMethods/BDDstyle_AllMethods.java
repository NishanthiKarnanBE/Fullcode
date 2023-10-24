package RestAssured.httpMethods;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class BDDstyle_AllMethods {
    @Test(enabled = false)
    public void getall(){
        //Getallvalues
        //No need to give Rest assured.....when we declare import statement static and give .* in last
        RestAssured
                .given()
                   .baseUri("https://dummy.restapiexample.com/api/v1")
                .when()
                   .get("/employees")
                .prettyPrint();
    }
    @Test(enabled = false)
    public void postMethod(){
        //Createnewrequest
        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                    .header("Content-Type","application/json")
                    .body("{\"name\":\"Nishanthi\"," +
                        "\"salary\":\"30500\"," +
                        "\"age\":\"23\"}")
                .when()
                    .post("/create")
                .prettyPrint();
    }
    @Test(enabled = false)
    public void putMethod(){
        //Updaterequest
        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                    .header("Content-Type","application/json")
                    .body("{\"name\":\"test_update\"," +
                        "\"salary\":\"123\"," +
                        "\"age\":\"23\"}")
                .when()
                    .put("/update/21")
                .prettyPrint();
    }
    @Test
    public void deleteMethod(){
        //deleterequest
        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                .when()
                    .delete("/delete/2")
                .prettyPrint();
    }
}
