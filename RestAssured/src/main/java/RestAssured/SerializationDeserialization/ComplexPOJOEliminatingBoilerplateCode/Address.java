package RestAssured.SerializationDeserialization.ComplexPOJOEliminatingBoilerplateCode;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String StreetAddress;
    private String City;
    private String PostalCode;

}

