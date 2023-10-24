package javacoding;

public class Hierarchicalexample {
}

class AA{
    void place_1(){
        System.out.println("Chennai");
    }
}
class BB extends  AA{
    void place_2(){
        System.out.println("Salem");
    }
}
class CC extends AA{
    void place_3(){
        System.out.println("Trichy");
    }

    public static void main(String[] args) {
        CC obj = new CC();
        obj.place_1();
        obj.place_3();
        BB obj_1 = new BB();
        obj_1.place_2();
    }
}

