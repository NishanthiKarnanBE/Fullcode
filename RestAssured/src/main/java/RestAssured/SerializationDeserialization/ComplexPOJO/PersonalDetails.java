package RestAssured.SerializationDeserialization.ComplexPOJO;

import java.util.List;

public class PersonalDetails {
    private String FirstName;
    private String LastName;
    private int Age;
    private Address address;
    private List<Phonenumbers> PhoneNumbers;

    public List<Phonenumbers> getPhoneNumbers() {
        return PhoneNumbers;
    }

    public void setPhoneNumbers(List<Phonenumbers> phoneNumbers) {
        PhoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }


}
