package RestAssured.JsonSchemaValidation;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.networknt.schema.JsonSchema;
import com.networknt.schema.JsonSchemaFactory;
import com.networknt.schema.SpecVersion;
import com.networknt.schema.ValidationMessage;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;

public class NetworkntJsonSchemaValidation {

    @Test
    public void validateJsonSchema() throws IOException {
        ObjectMapper   mapper = new ObjectMapper(); // creating object for object mapper

        JsonSchemaFactory jsonSchemaFactory =JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V4);//Creating object for jsonschemafactory and need to give json schema version

        File Inputjsonfile = new File(System.getProperty("user.dir")+"/src/main/resources/Request.json");
        JsonNode jsonNode=mapper.readTree(Inputjsonfile);//with the help of object mapper passing input file saving this in their return type that is jsonnode

        FileInputStream outputjsonschema = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/ResponseSchema.json");
        JsonSchema jsonSchema=jsonSchemaFactory.getSchema(outputjsonschema);//with the help of Json schema factory passing json schema and saving this in their return type that is Json schema

        Set<ValidationMessage> result = jsonSchema.validate(jsonNode);// validating jsonnode with jsonschema and saving this in their return type that is set

        if(result.isEmpty()){//validating the result whether it is empty or not..if it is empty there is no error in json schema
            System.out.println("No validation message");
        }
        else {
            for (ValidationMessage message:result ) {
                System.out.println(message);
            }
        }


    }
}
