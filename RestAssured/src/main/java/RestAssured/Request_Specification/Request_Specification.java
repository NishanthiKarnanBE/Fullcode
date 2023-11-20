package RestAssured.Request_Specification;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.with;

public class Request_Specification {

    RequestSpecification requestSpecification1;
    RequestSpecification requestSpecification2;


    //In previous methods we specify the base URI and endpoint for each method..By using request specification we can able declare the common and repeatedly used values only one time
    //For this we are having 2 methods [given and with] both are same only syntax is different
    //In below method we are sepcifying base URI and base path commonly and using these values in required methods by using spec method

    @BeforeSuite
    public void getRequestSpecification(){
        requestSpecification1 =given()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .basePath("/employees");
        requestSpecification2=with()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .basePath("/employee");
    }

   @Test
    public void getall(){
        //Getallvalues
        //No need to give Rest assured.....when we declare import statement static and give .* in last
        given()
                .spec(requestSpecification1)
                .when()
                .get()
                .prettyPrint();
    }

    @Test
    public void getemployee(){
        given()
                .spec(requestSpecification2)
                .when()
                .get("/2")
                .prettyPrint();
    }

    //********************************************************************************************//
    //specifying multiple request specification

    @Test
    public void postMethod(){

        RequestSpecification specification = given()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .basePath("/create")
                .contentType(ContentType.JSON);

        //Createnewrequest
        RestAssured
                .given()
                .spec(specification)
                .body("{\"name\":\"Nishanthi\"," +
                        "\"salary\":\"30500\"," +
                        "\"age\":\"23\"}")
                .when()
                .post()
                .prettyPrint();
    }

    //********************************************************************************************//
   //The scenario I don't want to give spec method, for that I want to declare default request specification

    @Test
    public void getallvalues(){

       RequestSpecification requestSpecifications =given()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .basePath("/employees");
       RestAssured.requestSpecification=requestSpecifications;//The scenario I don't want to give spec method, for that I want to declare default request specification

        given()
                .when()
                .get()
                .prettyPrint();
    }

    //********************************************************************************************//
    //Constructing request specification using 'RequestSpecBuilder'

    @Test
    public void getallmethod(){
        RequestSpecBuilder builder = new RequestSpecBuilder();//Instead of 'RequestSpecification' using 'RequestSpecBuilder'
        builder
                .setBaseUri("https://dummy.restapiexample.com/api/v1")
                .setBasePath("/employees");
        RequestSpecification spec1 = builder.build();//built helps to convert into request specification and storing the build in 'RequestSpecification'

        given()
                .spec(spec1)
                .get()
                .prettyPrint();

        //Another way bto use 'RequestSpecbuilder'
        RequestSpecification spec2 = builder.setBasePath("https://dummy.restapiexample.com/api/v1").setAccept("/employee/10").build();

        //we can also give the spec variable name in given method itself
        given(spec2)
                .get()
                .prettyPrint();
    }

}

