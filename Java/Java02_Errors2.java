import java.util.*;

public class Java02_Errors2 {
    public static void main(String[] args){
        int []marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array index: ");
        int ind = sc.nextInt();
        System.out.println("Enter the number you want to divide the value with: ");
        int number = sc.nextInt();
        try{
            System.out.println("The value at array index antered is: "+ marks[ind]);
            System.out.println("The value after division: "+ marks[ind]/number);

        }

        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("ArrayIndexOutOfBoundsException occured");
            System.out.println(e);
        }

        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception occured");
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println("Some exception occured: ");
            System.out.println(e);
        }

    }
}
