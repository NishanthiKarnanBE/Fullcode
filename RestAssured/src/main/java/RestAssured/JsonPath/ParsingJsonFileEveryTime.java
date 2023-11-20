package RestAssured.JsonPath;

import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ParsingJsonFileEveryTime {

    @Test
    public void readJson() throws IOException {
        File inputjsonfile = new File(System.getProperty("user.dir")+"/src/main/resources/CakeMade.json"); //Reading the json file

        List<Object> BatterAllId =  JsonPath.read(inputjsonfile,"$..id"); //with the help of jayway json path retrieving the value from json..(reading the json file and passing the jsonpath, storing it in which type the jsonpath return)

        for (Object BatterID: BatterAllId) { // printing each value separetely
            System.out.println(BatterID);
        }

    }

}
