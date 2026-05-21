
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        CourseType elective = new CourseType("Elective"); // CourseType hard code population
        CourseType regents = new CourseType("Regents");
        CourseType ap = new CourseType("AP");

        // System.out.println(elective);
        // System.out.println(regents);
        // System.out.println(ap);
        ArrayList<Student> studentList = new ArrayList<>(); // Arraylist to store all students
        ArrayList<Teacher> teacherList = new ArrayList<>(); // Arraylist to store all teachers
        ArrayList<Course> courseList = new ArrayList<>(); // Arratlist to store all courses
        ArrayList<String> differentRooms = new ArrayList<>(); // Arraylist to store all rooms
        ArrayList<Department> departmentList = new ArrayList<>(); // Arraylist to store all departments
        ArrayList<Enrollment> enrollmentList = new ArrayList<>(); // you get it by now
        ArrayList<Klass> ClassList = new ArrayList<>();
        ArrayList<Grade> GradeList = new ArrayList<>();


        try {

            Main x = new Main();
            x.names(studentList);
            x.teachers(teacherList);
            x.courses(courseList);
            x.rooms(differentRooms);
            x.department(departmentList);
            x.Class(ClassList);
            x.enrolls(enrollmentList, ClassList); //need to fix enroll to take in two lists

        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
        // for (Course i : courseList){
        // System.out.println(i);
        // }
        // for (Student i : studentList){
        // System.out.println(i);
        // }
        // for (Teacher i : teacherList){
        // System.out.println(i);
        // }
        // for (Department i : departmentList){
        // System.out.println(i);
        // }

        // Printing for all the tables, toString statements will auto print the INSERT
        // statements
    }
    // attempt at making code that generates student objects from the student.txt
    // file
    // 90% chance this doesnt work but its a start


    public void populateRooms(ArrayList<String> differentRooms) throws FileNotFoundException {
        File rooms = new File("rooms.txt");
        try (Scanner roomz = new Scanner(rooms)) {
            while (roomz.hasNextLine()) {
                String room = roomz.nextLine();
                differentRooms.add(room);
            }
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
    }

    
    

    public static void dropALL() {
        System.out.println("DROP TABLE IF EXISTS Grade;");
        System.out.println("DROP TABLE IF EXISTS Enrollment;");
        System.out.println("DROP TABLE IF EXISTS Assignment;");
        System.out.println("DROP TABLE IF EXISTS AssignmentType;");
        System.out.println("DROP TABLE IF EXISTS Class;");
        System.out.println("DROP TABLE IF EXISTS Student;");
        System.out.println("DROP TABLE IF EXISTS Teacher;");
        System.out.println("DROP TABLE IF EXISTS Course;");
        System.out.println("DROP TABLE IF EXISTS Department;");
        System.out.println("DROP TABLE IF EXISTS CourseType;");
    }

    public static void populateCourseType(){
        System.out.println("INSERT INTO CourseType (TypeID, TypeName) VALUES ('AP')");
        System.out.println("INSERT INTO CourseType (TypeID, TypeName) VALUES ('Elective');");
        System.out.println("INSERT INTO CourseType (TypeID, TypeName) VALUES ('Regents')");
    }

    public static void populateAssignmentType() {
        System.out.println("INSERT INTO AssignmentType (AssignmentTypeID, AssignmentName) VALUES ('Minor');");
        System.out.println("INSERT INTO AssignmentType (AssignmentTypeID, AssignmentName) VALUES ('Major');");
    }

    




}
