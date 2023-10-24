package RestAssured.Predicates;

import com.jayway.jsonpath.JsonPath;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class InlinePredicate {

    @Test
    public void inlinePredicate() throws IOException {

        File inputjsonfile = new File(System.getProperty("user.dir") + "/src/main/resources/CakeMade.json"); //Reading the json file

        List<Object> result = JsonPath.parse(inputjsonfile).read("$.batters.batter[?(@.id==1000)].type"); //Inline predicate
        System.out.println("Inline Predicate: " + result);

        List<Object> resultusingand = JsonPath.parse(inputjsonfile).read("$.batters.batter[?(@.id==1000 && @.type=='Regular')].type"); //using AND operator in 'Inline Predicate'
        System.out.println("Inline Predicate using AND operator: " + resultusingand);

        List<Object> resultusingor = JsonPath.parse(inputjsonfile).read("$.batters.batter[?(@.id>2000 || @.type=='Blueberry')].type"); //using OR operator in 'Inline Predicate'
        System.out.println("Inline Predicate using OR operator: " + resultusingor);

        List<Object> resultusingnot = JsonPath.parse(inputjsonfile).read("$.batters.batter[?(!(@.id==1000 && @.type=='Regular'))].type"); //using NOT operator in 'Inline Predicate'
        System.out.println("Inline Predicate using NOT operator: " + resultusingnot);
    }

}
