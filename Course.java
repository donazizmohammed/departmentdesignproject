
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Course {
    private static int count = 1;
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
        courseID = count++;
    }
    @Override
    public String toString() {
        return "INSERT INTO Courses (Name, TypeID) VALUES ('" + name + "', " + typeID + ");";
    }
    
    public static ArrayList<Course> populateCourses(ArrayList<Course> courseList) throws FileNotFoundException {
        int y = -1;
        File input = new File("courses.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {

                String line = scan.nextLine();
                String[] parts = line.split("\\|", 2);
                String type = parts[1].trim();
                if (type.equals("AP")) {
                    y = 1;
                }
                if (type.equals("Elective")) {
                    y = 2;
                }
                if (type.equals("Regents")) {
                    y = 3;
                }
                Course c = new Course(parts[0], y);
                courseList.add(c);
            }

        }
        return courseList;
    }

}
