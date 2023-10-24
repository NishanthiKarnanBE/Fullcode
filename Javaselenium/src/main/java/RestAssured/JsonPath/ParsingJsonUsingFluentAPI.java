package RestAssured.JsonPath;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ParsingJsonUsingFluentAPI {

    @Test(enabled = false)
    public void fluentAPIDocumentContext() throws IOException {

        File inputjsonfile = new File(System.getProperty("user.dir")+"/src/main/resources/CakeMade.json"); //Reading the json file

        DocumentContext documentContext = JsonPath.parse(inputjsonfile); //using Document context parsing the json file

        List<Object> CakeAllTypes = documentContext.read("$..type"); //read the jsonpath and storing it in list

        for (Object CakeType:CakeAllTypes) { // printing each value separetely
            System.out.println(CakeType);
        }
    }

    @Test
    public void fluentAPIConfiguration() throws IOException {

        File inputjsonfile = new File(System.getProperty("user.dir")+"/src/main/resources/CakeMade.json"); //Reading the json file

        Configuration configuration = Configuration.defaultConfiguration(); //using configuration parsing the json file

        List<Object> CakeAllTypes =  JsonPath.using(configuration).parse(inputjsonfile).read("$..type"); // read the jsonpath and storing it in list

        for (Object CakeType:CakeAllTypes) { // printing each value separetely
            System.out.println(CakeType);
        }
    }

    //return type of jsonpath
    //1. definite path....if it return single value, need to store in data type of what is going to be return
    //indefinite path...........deep scan, expression, [start:end].........these are should be stored in list<object>
}
