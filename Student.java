
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Student {

    public void names() throws FileNotFoundException {
        File input = new File("students.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                System.out.println("INSERT INTO Students (FirstName, LastName) VALUES ('" + data[0] + "', '" + data[1] + "');");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.names();
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }

    }
}
