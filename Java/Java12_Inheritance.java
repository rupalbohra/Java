import java.util.*;

class Parent{
    int i = 10;
    int j = 12;
}
class Child extends Parent{
    int l = 10;
    public int getSum(){
        return i+j+l;
    }
}

public class Java12_Inheritance {
    public static void main(String[] args){
        Child c = new Child();
        System.out.println(c.i);
        System.out.println(c.getSum());
    }
}
