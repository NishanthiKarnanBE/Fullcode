package RestAssured.InterviewQuestions;

import io.restassured.RestAssured;

public class DefaultHostAndPort {

    //When we didn't give any URI in get method By default it takes "Localhost.8080' and throws Connection refused exception because in this URI nothing is running

    public static void main(String[] args) {

        RestAssured
                .given()
                .log()
                .all()
                .when()
                .get();
    }
}
