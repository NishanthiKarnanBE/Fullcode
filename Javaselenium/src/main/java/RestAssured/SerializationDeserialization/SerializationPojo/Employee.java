package RestAssured.SerializationDeserialization.SerializationPojo;

import java.util.List;

public class Employee {

    //pojo class

    //Ui la data va pass pannum poothu, bussiness layer la process pannitu, json format ah convert pannanum...this is happening in real way
    //with out business layer nothing will happen

    private String FirstName;
    private String LastName;
    private String Email;
    private List Skills;

    //do not assign the values directly, instead of that need to pass the values by creating constructor


    //straight ah values ah store pannama getter/setter method ah use pandro...
    //oru declaration ku value set pannanum na setter method use pannanum
    //set panna value ah retrieve panna getter method use pannanum

    //intha method la iruka methods ku values ellam main method la set panni retrieve pandrom

    //UI la irunthu retrieve panni vara values ella java object ah store panni vappanga developers, antha java object ah store pandrathuku peru tha POJO(Plain old java object)
    //POJO-simple aana java object
    //actual application work like this

    public String getFirstName(){
        return FirstName;
    }
    public void setFirstName(String FirstName){
        this.FirstName = FirstName;
    }
    public String getLastName(){
        return LastName;
    }
    public void setLastName(String LastName){
        this.LastName = LastName;
    }
    public String getEmail(){
        return Email;
    }
    public void setEmail(String Email){
        this.Email = Email;
    }
    public List getSkills(){
        return Skills;
    }
    public void setSkills(List Skills){
        this.Skills = Skills;
    }

}
