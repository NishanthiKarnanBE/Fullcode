package RestAssured.JacksonAnnotations;

import com.fasterxml.jackson.annotation.JsonGetter;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder(alphabetic = true)
//@JsonPropertyOrder({"Id","Name","Email"})
public class JsonpropertyorderPOJO {

    //'JsonPropertyOrder' annotation helps to order the property values
    //By default Json will serialize in the order of variable name declared

    //When we give JsonGetter annotation along with JsonPropertyOrder(Alphabet) It will consider the Jsongetter annotation value and arrange in alphabet order

    private String Email;
    private String Name;
    private int Id;


    //@JsonGetter(value = "AID")
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
