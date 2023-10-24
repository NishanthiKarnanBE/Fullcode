package javacoding;

public class Overriding_Example {
    /*Before coming to Overriding, must know about inheritance
      Definition: If subclass has the same method as declared in the parent class
                  (parent class method and child class method should be same)
      Rules: 1. same method name in parent class and child class
             2. same method parameter in parent class and child class
             3. IS-A relationship in class(Inheritance)*/

    public static void main(String[] args) {
        /*Child_Class childObj = new Parent_Class();
        childObj.emp_salary();*/
    }

    class Parent_Class {
        public void emp_salary() {
            System.out.println("Emp_1 Salary: 20,000");
        }
    }
    class Child_Class extends Parent_Class{
        public void emp_salary(){
            System.out.println("Emp_2 Salary: 30,000");
        }
    }
}
