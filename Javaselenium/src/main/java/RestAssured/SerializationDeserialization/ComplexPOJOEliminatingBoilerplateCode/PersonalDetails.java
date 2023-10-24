package RestAssured.SerializationDeserialization.ComplexPOJOEliminatingBoilerplateCode;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class PersonalDetails {
    private String FirstName;
    private String LastName;
    private int Age;
    private Address address;
    private List<Phonenumbers> PhoneNumbers;


}
