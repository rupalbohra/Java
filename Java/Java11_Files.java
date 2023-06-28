import java.io.*;
import java.util.*;
import java.util.Scanner;

public class Java11_Files {
    public static void main(String[] args) throws IOException{
        // create file
        File myFile = new File("C:\\Languages\\Java_EndTerm\\input.txt");
        myFile.createNewFile();

        // write in a file
        FileWriter fileWriter = new FileWriter("input.txt");
        fileWriter.write("Hey, I am Rupal");
        fileWriter.close();

        // Reading a file
        myFile = new File("input.txt");
        Scanner sc = new Scanner(myFile);
        while(sc.hasNextLine()){
            String line = sc.nextLine();
            System.out.println(line);
        }

        // Deleting a file
        File newFile = new File("C:\\Languages\\Java_EndTerm\\input01.txt");
        newFile = new File("input.text");
        if(newFile.delete()){
            System.out.println("I have deleted my file"+ newFile.getName());

        }else{
            System.out.println("Some error occured while deleting the file");
        }

    }
}
