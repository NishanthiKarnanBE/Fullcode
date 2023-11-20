package JsonSchemaValidation;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;
import org.testng.annotations.Test;

import java.io.*;

public class RestAssuredJsonSchemaValidation {

    @Test(enabled = false)
    public void validationUsingJsonSchemaInClassPath(){

        File requestjson = new File(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        System.out.println(requestjson);

        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                    .header("Content-Type","application/json")
                    .body(requestjson)
                .when()
                    .post("/create")
                .then()
                //using "matchesjsonschemaclasspath" when response schema is in classpath (that is in resource folder)
                    .body(JsonSchemaValidator.matchesJsonSchemaInClasspath("ResponseSchema.json"))
                    .log()
                    .all();

    }

    @Test
    public void validationUsingMatchesJsonSchema() throws FileNotFoundException {

        File requestjson = new File(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        //Method 1
        File ResponseSchemaJsonusingFile = new File(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        //Method 2
        InputStream ResponseSchemaJsonusingInputstream = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        //Method 3
        Reader ResponseSchemaJsonusingReader= new FileReader(System.getProperty("user.dir")+"/src/main/resources/Request.json");

        RestAssured
                .given()
                .baseUri("https://dummy.restapiexample.com/api/v1")
                .header("Content-Type","application/json")
                .body(requestjson)
                .when()
                .post("/create")
                .then()
                //using "matchesJsonSchema" when response is not in classpath (that is not in resource folder)
                //Method 1
                .body(JsonSchemaValidator.matchesJsonSchema(ResponseSchemaJsonusingFile))
                //Method 2
                .body(JsonSchemaValidator.matchesJsonSchema(ResponseSchemaJsonusingInputstream))
                //Method 3
                .body(JsonSchemaValidator.matchesJsonSchema(ResponseSchemaJsonusingReader))
                .log()
                .all();

    }
}
