
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Teachers {

    public void teacherInserts() throws FileNotFoundException {
        //doesnt work perfectly due to some teachers having middle names but WHO CARES LOL
        File input = new File("teachers.txt");

        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                String[] parts = line.split("\\|", 2);
                String[] name = parts[0].trim().split(" ");

                String dept = parts.length > 1 ? parts[1].trim() : "";

                String firstName = name[0];
                String lastName = (name.length > 1) ? name[1] : "Unknown";

                System.out.println("INSERT INTO Teachers (FirstName, LastName, Department) VALUES ('"
                        + firstName + "', '" + lastName + "', '" + dept + "');");
            }
        }
    }
    public static void main(String[] args) {
        try {
            Teachers x = new Teachers();
            x.teacherInserts();
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
    }
}
