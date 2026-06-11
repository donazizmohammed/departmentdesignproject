import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    private static int count = 1;
    private String firstName;
    private String lastName;
    private int studentID;

    public Student(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        studentID = count++;
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

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }



    @Override
    public String toString(){
        return "('" + firstName + "', '" + lastName + "')";
    }

    
    public static ArrayList<Student> populateStudents(ArrayList<Student> studentList) throws FileNotFoundException {
        
        File input = new File("students.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                Student student = new Student(data[0], data[1]);
                studentList.add(student);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
        return studentList;
    }

}
