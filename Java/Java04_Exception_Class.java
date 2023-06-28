import java.util.*;

// We can write our custome exceptions using exception class in Java

class MyException extends Exception{
    public String toString(){
        return super.toString() + "I am toString";
    }
    public String getMessage(){
        // return super.getMessage() + "I am getMessage()";   // the method super.getMEssage will return null 
        // return "I am getMessage";
        return super.getMessage();
    }
}

public class Java04_Exception_Class {
    public static void main(String[] args){
        int a;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = sc.nextInt();
        if(a<99){
            try{
                throw new MyException();
                // throw new ArithmeticException("This is an exception");
            }
            catch(Exception e){
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e); // will print the output of toString method
                e.printStackTrace();
                System.out.println("Finished");
            }
            System.out.println("Yes finished");
        }
    }
}
