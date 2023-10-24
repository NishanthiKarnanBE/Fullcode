package RestAssured;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

import java.io.File;

public class ReqBody_ExternalJsonfile {

    @Test
    public void postMethod(){
        File jsonfile = new File(System.getProperty("user.dir")+"/src/main/java/RestAssured/PostData.json");
        System.out.println(jsonfile);

        RestAssured
                .given()
                    .baseUri("https://dummy.restapiexample.com/api/v1")
                    .header("Content-Type","application/json")
                    .body(jsonfile)
                .when()
                    .post("/create")
                .prettyPrint();
    }
}



