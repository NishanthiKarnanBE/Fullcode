package javacoding;

public class Multilevel_Inheritance {
}

class A{
    public String school(String school_name){
        System.out.println("School Name: "+ school_name);
        return school_name;
    }
}
class B extends A{
    public String college(String clg_name){
        System.out.println("College name: "+ clg_name);
        return clg_name;
    }
}
class c extends B{
    public String work(String work_name){
        System.out.println("Work_name: " + work_name);
        return work_name;
    }

    public static void main(String[] args) {
        c obj = new c();
        obj.school("JGHSS");
        obj.college("Paavai");
        obj.work("Ionixx");
    }
}
