package RestAssured.Predicates;

import com.jayway.jsonpath.Criteria;
import com.jayway.jsonpath.Filter;
import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import static com.jayway.jsonpath.Criteria.*;
import static com.jayway.jsonpath.Filter.filter;
import static com.jayway.jsonpath.JsonPath.parse;

public class FilterAPIPredicates {

    @Test
    public void filterAPIPredicates() throws IOException {

        File inputjsonfile = new File(System.getProperty("user.dir") + "/src/main/resources/CakeMade.json"); //Reading the json file

        Filter filterAPIpredicate = Filter.filter(
                Criteria
                        .where("id")                        //Declaring expression using Filter method
                        .is(1000));
        List<Object> Result1 = JsonPath.parse(inputjsonfile).read("$.batters.batter[?].type",filterAPIpredicate);
        System.out.println("Ouput for Simple expression using Filter API: " + Result1);

        //*******************************************************************************************************//

        Filter filterAPIPredicatedusingAND = Filter.filter(
                Criteria
                        .where("id")
                        .is(1000)                                 //Declaring expression using Filter method
                        .and("type")
                        .is("Regular"));
        List<Object> Result2 = JsonPath.parse(inputjsonfile).read("$.batters.batter[?]",filterAPIPredicatedusingAND);
        System.out.println("Output for Expression using AND in Filter API: " + Result2);

        //*******************************************************************************************************//

        Filter filterAPIpredicateusingStaticMethod = filter(
                where("id")
                        .is(1000)                               //Declaring expression using Filter method(here importing criteria and filter in a static way)
                        .and("type")
                        .is("Regular"));
        List<Map<String,Object>> Result3 =parse(inputjsonfile).read("$.batters.batter[?]",filterAPIpredicateusingStaticMethod);
            // storing the jsonpath in map, bcz from the result if we need to retrive any data ths way will helpful..or else if we stored in only list, can't able to retrive date from the result
        System.out.println("Output for Expression by importing static way in Filter API: " + Result3);
        System.out.println("Retriving data from the result by storing it in Map: " + Result3.get(0).get("id"));

    }
}
