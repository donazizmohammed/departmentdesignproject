
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
        try {
            Main x = new Main();
            x.courses();
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
    }
// attempt at making code that generates student objects from the student.txt file
// 90% chance this doesnt work but its a start

    public void names() throws FileNotFoundException {
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

    public void teachers() throws FileNotFoundException {
        // doesnt work perfectly due to some teachers having middle names but WHO CARES LOL
        File input = new File("teachers.txt");
        int d = -1;
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();

                String[] parts = line.split("\\|", 2);
                String[] name = parts[0].trim().split(" ");

                String dept = parts.length > 1 ? parts[1].trim() : "Unknown";

                String firstName = name[0];
                String lastName = (name.length > 1) ? name[1] : "Unknown";
                if (dept.equals("Biological Sciences")) {
                    d = 1;
                }
                if (dept.equals("Chemistry")) {
                    d = 2;
                }
                if (dept.equals("CTE, Computer Science & Engineering")) {
                    d = 3;
                }
                if (dept.equals("English")) {
                    d = 4;
                }
                if (dept.equals("Health & Physical Education")) {
                    d = 5;
                }
                if (dept.equals("Mathematics")) {
                    d = 6;
                }
                if (dept.equals("Physics")) {
                    d = 7;
                }
                if (dept.equals("Social Studies")) {
                    d = 8;
                }
                if (dept.equals("Visual & Performing Arts")) {
                    d = 9;
                }
                if (dept.equals("World Languages")) {
                    d = 10;
                }
                Teacher teach = new Teacher(firstName, lastName, d);

            }
        }
    }

    public void courses() throws FileNotFoundException {
        File input = new File("courses.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String[] parts = line.split("\\|", 2);
                String type = parts[1].trim();
                System.out.println(type);
                if (type.equals("AP")) {
                    int y = 1;
                }
                if (type.equals("Elective")) {
                    int y = 2;
                }
                if (type.equals("Regents")) {
                    int y = 3;
                }

                Course c = new Course(parts[0], 1);
            }

        }
    }
}
