package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonValue;

public class JsonvaluePOJO {

    //JsonValue helps to serialize the customized one
    //Jsonvalue works in method level

    private int Id;
    private String Name;
    private String Email;

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

    @JsonValue
    public int jsonValue(){
        return  this.Id;
    }

}
