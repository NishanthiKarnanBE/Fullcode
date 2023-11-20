package RestAssured.SerializationDeserialization.ComplexPOJOEliminatingBoilerplateCode;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Serialize {

    //Instead of creating getters and setters method we are using lombok annotation(Getters and Setters)
    //1. Need to add lombok dependency in POM.xml
    //2. Add Getters and Setters annotation in POJO class


    //Important notes:
    //While going serialization, we are calling setter methods explictly but we didn't call getter methods..Eventhough the getter methods are not explicitly called, it will call getter methods implictly
    //How it happening means, before doing serialization... values should be set using setter method, to covert those values to json need to call getter...In code we are not calling getter method explictly
    //Object mapper method automatically calling the getter mehod for json conversion
    //writerWithDefaultPrettyPrinter--->implictly call getter method

    //While going deserialization, we are calling getter methods explictly but we didn't call setter methods..Eventhough the setter methods are not explictly called, it will call setter methods implictly
    //How it happening means, In deserialization json values should be set in the POJO class in the form of java object, for this process Object mapper method will call setter method implictly after that
    //to get that stored values need to call getter method explictly
    //read value---> implictly call setter method

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
        File outputjson = new File(System.getProperty("user.dir")+"/src/main/java/RestAssured/SerializationDeserialization/ComplexPOJOEliminatingBoilerplateCode/Output.json"); //Reading the json file
        objectMapper.writerWithDefaultPrettyPrinter().writeValue(outputjson,personalDetails);
    }

}
