import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        File f = new File ("grades.txt");

        try{
            Scanner sc = new Scanner(f);
            System.out.println("Student Grades:");
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        }catch(Exception e){
            System.out.println("File not found!");

        }

    }
}
