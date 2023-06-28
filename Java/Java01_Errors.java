import java.util.*;

public class Java01_Errors{
    public static void main(String[] args){
        int a = 80;
        int b = 0;
// Without Try:
        // int c = a/b; 


// With try and catch:
        try{
            int c = a/b;
        }
        catch(Exception e){
            System.out.println("We failed to divide. Reason: ");
            System.out.println(e);
        }
        System.out.println("End of program");
    }
}