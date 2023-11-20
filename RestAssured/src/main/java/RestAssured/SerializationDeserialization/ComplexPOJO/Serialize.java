package RestAssured.SerializationDeserialization.ComplexPOJO;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialize {

    public static void main(String[] args) throws IOException {
        Address address = new Address();
        address.setStreetAddress("naist street");
        address.setCity("Nara");
        address.setPostalCode("630-0192");

        Phonenumbers phonenumbers = new Phonenumbers();
        phonenumbers.setType("iPhone");
        phonenumbers.setNumber("0123-4567-8888");

        Phonenumbers phonenumbers1 = new Phonenumbers();
        phonenumbers1.setType("Android");
        phonenumbers1.setNumber("0123-4567-8910");

        List<Phonenumbers> phonenumbersList = new ArrayList<Phonenumbers>();
        phonenumbersList.add(phonenumbers);
        phonenumbersList.add(phonenumbers1);

        PersonalDetails personalDetails = new PersonalDetails();
        personalDetails.setFirstName("John");
        personalDetails.setLastName("doe");
        personalDetails.setAge(26);
        personalDetails.setAddress(address);
        personalDetails.setPhoneNumbers(phonenumbersList);

        ObjectMapper objectMapper=new ObjectMapper();//Serializing complex java object to json
        File outputjson = new File(System.getProperty("user.dir")+"/src/main/java/RestAssured/SerializationDeserialization/ComplexPOJO/Output1.json"); //Reading the json file
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputjson,personalDetails);
    }

}
