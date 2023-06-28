import java.util.*;
public class Java03_Nested_Try_Catch {
    public static void main(String[] args){
        int []marks = new int[3];
        marks[0] = 7;
        marks[1] = 56;
        marks[1] = 6;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of index");
        int ind = sc.nextInt();
        try{
            System.out.println("Welcome to video 2");
            try{
                System.out.println(marks[ind]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Index does not exist");
                System.out.println("Exception in level 2");
            }
        }catch(Exception e){
            System.out.println("Exception in level 1");
        }
    }
}
