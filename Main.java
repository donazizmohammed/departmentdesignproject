
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CourseType elective = new CourseType("Elective");
        CourseType regents = new CourseType("Regents");
        CourseType ap = new CourseType("AP");

        System.out.println(elective);
        System.out.println(regents);
        System.out.println(ap);

        File input = new File("students.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                Student student = new Student();
                student.setFirstName(data[0]);
                student.setLastName(data[1]);

            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
    }
}
