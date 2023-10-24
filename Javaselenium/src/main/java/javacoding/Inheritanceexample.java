package javacoding;

public class Inheritanceexample {

}
//Inheritance
//1.Single Inheritance
class Superclass{
    String name="Nisha";
    public void age(int a){
        System.out.println("Nisha's age: " + a);
    }
}
class Subclass extends Superclass{
    String name_1 = "Gayathri";
    public void age_1(int b){
        System.out.println("Gayu's age: "+ b);
    }

    public static void main(String[] args) {
        Subclass obj = new Subclass();
        System.out.println(obj.name);
        obj.age(21);
        System.out.println(obj.name_1);
        obj.age_1(22);
    }
}