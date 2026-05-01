import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        CourseType elective = new CourseType("Elective");
        CourseType regents = new CourseType("Regents");
        CourseType ap = new CourseType("AP");


        try {
            Main x = new Main();
            x.courses();
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }

    }

    public void courses() throws FileNotFoundException{
        File input = new File("courses.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String[] parts = line.split("\\|", 2);
                String type = parts[1].trim();

                System.out.println(type);
            }

            }
    }


}
