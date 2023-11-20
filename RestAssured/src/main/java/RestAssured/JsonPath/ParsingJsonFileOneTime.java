package RestAssured.JsonPath;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.*;
import java.util.List;

public class ParsingJsonFileOneTime {

    @Test
    public void parsngJsonFileOneTIme() throws IOException {

        InputStream inputjsonfile = new FileInputStream(System.getProperty("user.dir")+"/src/main/resources/CakeMade.json"); //Reading the json file

        Object Parsedinputjsonfile =Configuration
                .defaultConfiguration()
                .jsonProvider();
            //   .parse(inputjsonfile.readAllBytes());//to avoid parsing json file multiple times using this method

        List<Object> BatterAllType =  JsonPath.read(Parsedinputjsonfile,"$..type");

        for (Object BatterType: BatterAllType) { // printing each value separetely
            System.out.println(BatterType);
        }
    }
}
