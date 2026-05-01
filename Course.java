
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Course {
    private int courseID;
    private String name;
    private int typeID;

    public int getCourseID() {
        return this.courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTypeID() {
        return this.typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }


    public Course(String name, int typeID){
        this.name = name;
        this.typeID = typeID;
    }
    @Override
    public String toString() {
        return "INSERT INTO Courses (Name, TypeID) VALUES (String, foreign key);";
    }
    
    public void courseInserts() throws FileNotFoundException {
        File input = new File("courses.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] parts = line.split("\\|", 2);
                parts[0] = parts[0].substring(0, parts[0].length() - 1);
                System.out.println("INSERT INTO Courses (Name, Type) VALUES ('" + parts[0] + "', '" + parts[1] + "');");

            }
        }
    }

//    public static void main(String[] args) {
//
//        try {
//            Course course = new Course();
//            course.courseInserts();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
//        }
//
//    }

}
