package RestAssured.Authorization;

import io.restassured.RestAssured;
import org.testng.annotations.Test;

public class Oauth2 {

    //Another type of authorization is 'Oauth2'
    //For Oauth2 need to set the token

    @Test
    public void Oauth(){
    //RestnAssured token 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
    // Rest token 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
        String token ="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";
        RestAssured
                .given()
                .auth()
                .oauth2(token)
                .when()
                .get("https://api.github.com/user/repos")
                .prettyPrint();
}
}
