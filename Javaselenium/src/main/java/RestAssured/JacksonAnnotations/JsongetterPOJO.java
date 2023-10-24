package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;

public class JsongetterPOJO {


    //Jsongetter annotation is used to change the defined key value
    //This annotation should give in get methods

    private int Id;
    private String Name;
    private String Email;

    @JsonGetter(value = "EmployeeID")
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }
}
