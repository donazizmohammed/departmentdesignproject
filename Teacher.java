import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Teacher {
    private static int count = 1;
    private int teacherID;
    private String firstName;
    private String lastName;
    private int departmentID;

    public int getTeacherID() {
        return this.teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartmentID() {
        return this.departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Teacher(String firstName, String lastName, int departmentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentID = departmentID;
        teacherID = count++;
    }
    @Override
    public String toString(){
        return "INSERT INTO Teacher ( FirstName, Lastname, DepartmentID) VALUES ( " + firstName + ", " + lastName + ", " + departmentID + ");";

    }



    public ArrayList<Teacher> populateTeachers(ArrayList<Teacher> teacherList) throws FileNotFoundException {
        // doesnt work perfectly due to some teachers having middle names but WHO CARES
        // LOL
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
                teacherList.add(teach);
            }
        }
        return teacherList;
    }
}
