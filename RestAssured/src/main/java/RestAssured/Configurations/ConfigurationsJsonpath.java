package RestAssured.Configurations;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class ConfigurationsJsonpath {

    @Test
    public void configuration() throws IOException {

        File inputjsonfile = new File(System.getProperty("user.dir") + "/src/main/resources/ConfigurationDemo.json"); //Reading the json file

        Configuration configuration = Configuration.defaultConfiguration(); //parsing the inputfile using configuration

        String Resut1 = JsonPath.using(configuration).parse(inputjsonfile).read("$.[0].Name");
        System.out.println("Simple Configuration: " + Resut1);

        //*************************************************************************************//

        configuration=configuration.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL); //'Default path leaf to null' is used to print null in the result when the key and value is not present in the json file
        String  Result2 =JsonPath.using(configuration).parse(inputjsonfile).read("$.[1].Gender");
        System.out.println("Print NULL when property is not present in the json file: " + Result2);

        //*************************************************************************************//

        configuration=configuration.addOptions(Option.ALWAYS_RETURN_LIST);//'Always return list' is used to print the result in list format eventhough the result will be a string, interger etc...
        List<Object> Result3 = JsonPath.using(configuration).parse(inputjsonfile).read("$.[0].Name");
        System.out.println("Output should be in list format eventhough my result is String, integer etc..: " + Result3);

        //*************************************************************************************//

        configuration=configuration.addOptions(Option.SUPPRESS_EXCEPTIONS);//'suppress exceptions' is used to avoid showing the exception when the property is not present in the json file instead of that it will display 'NULL'
        List<Object> Result4 = JsonPath.using(configuration).parse(inputjsonfile).read("$.[1].Gender");
        System.out.println("Exceptions will not thrown when the property is not present in the json file: " + Result4);

        //*************************************************************************************//

        configuration=configuration.addOptions(Option.REQUIRE_PROPERTIES);//'require properties' is used to verify the properties which we mentioned in the jsonpath should be present in json file otherwise it will throw exception while running
        List<Object> Result5 = JsonPath.using(configuration).parse(inputjsonfile).read("$.[*].Gender");
        System.out.println("Exception will thrown when the property is not present in the json: " + Result5);

        //*************************************************************************************//

        Configuration configuration1 = Configuration.builder().options(Option.DEFAULT_PATH_LEAF_TO_NULL).build();//Another way for using configuration
        String Result6 = JsonPath.using(configuration1).parse(inputjsonfile).read("$.[0].Gender");
        System.out.println("Another way for using configuration: " + Result6);
    }
}
