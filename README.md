# LAB 18 Grade Reader (File Reading & Exception Handling)

In this lab, you will write a small Java program that reads student grades from a text file and displays them on the screen.
You will also handle the case when the file is missing using a try–catch block.

You will complete the lab step by step.

##Setup
Create a new project named LabFileRead.
Copy the Starter Code below into your Main.java file.
Complete the TODOs in order (Part A → Part B → Part C).

##starter code
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO A1: Create a File object for "grades.txt"
        // TODO A2: Use try–catch to handle FileNotFoundException

        try {
            // TODO B1: Create a Scanner to read the file
            // TODO B2: Print "Student Grades:"
            // TODO B3: Read and print each line from the file
        }
        catch (Exception e) {
            // TODO C1: Print "File not found!" if grades.txt is missing
        }
    }
}

##EXample output

Case 1 — File Exists

Student Grades:
John: 85
Sara: 92
Mark: 78
Case 2 — File Missing

##Author
HAO

File not found!
