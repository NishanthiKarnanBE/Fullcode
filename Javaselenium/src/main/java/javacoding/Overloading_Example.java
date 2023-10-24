package javacoding;

public class Overloading_Example {

    public void PersonalDetails(String name, String initial){
        System.out.println("Name: " + name);
        System.out.println("Initial: " + initial);
    }

    public void PersonalDetails(int age, String Qualification){
        System.out.println("Age: " + age);
        System.out.println("Qualification: " + Qualification );
    }

    public void PersonalDetails(String Fathername){
        System.out.println("Father's name: " + Fathername);
    }

    public void PersonalDetails(int Fatherage){
        System.out.println("Father's age: ");
    }

    public void PersonalDetails(String Mothername, int Motherage){
        System.out.println("Mother's name: " + Mothername);
        System.out.println("Mother's age: " + Motherage);
    }

    public static void main(String[] args) {
        Overloading_Example obj = new Overloading_Example();
        obj.PersonalDetails(30000);
        obj.PersonalDetails("Thrity Thousand");
    }
}
