package JsonSchemaValidation;


import io.restassured.module.jsv.JsonSchemaValidator;
import org.apache.commons.io.FileUtils;
import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;

public class HamcrestMatcherJsonSchemaValidation {

    @Test
    public void hamcrestMatcherJsonSchemaValidation() throws IOException {
        //File InputJsonFile = new File(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        File InputJsonFile = new File(System.getProperty("user.dir")+"/src/main/resources/Response.json"); //reading the input json file

        String fileToStringConversionInputJson = FileUtils.readFileToString(InputJsonFile); // Coverting file to string bcz in hamcrest assertion frist parameter accepts only String

        File OutputJsonSchema = new File(System.getProperty("user.dir")+"/src/main/resources/ResponseSchema.json"); // reading the output json schema file

        MatcherAssert.assertThat(fileToStringConversionInputJson, JsonSchemaValidator.matchesJsonSchema(OutputJsonSchema)); //using hamcrest assertion validating the input json with schema json
        //(in second parameter need to pass only boolean so here using restassured jsonschemavalidator for passing the output json schema file)
    }
}
