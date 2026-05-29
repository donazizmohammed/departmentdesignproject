
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
 
        ArrayList<Student> studentList = new ArrayList<>(); // Arraylist to store all students
        ArrayList<Teacher> teacherList = new ArrayList<>(); // Arraylist to store all teachers
        ArrayList<Course> courseList = new ArrayList<>(); // Arratlist to store all courses
        ArrayList<String> differentRooms = new ArrayList<>(); // Arraylist to store all rooms
        ArrayList<Department> departmentList = new ArrayList<>(); // Arraylist to store all departments
        ArrayList<Enrollment> enrollmentList = new ArrayList<>(); // you get it by now
        ArrayList<Klass> classList = new ArrayList<>();
        ArrayList<Grade> gradeList = new ArrayList<>();
        ArrayList<Assignment> assignmentList = new ArrayList<>();
        

        try {
            Main x = new Main();
            dropALL();
            MakeTables.makeTables();
            populateCourseType();
            Course.populateCourses(courseList);
            populateAssignmentType();
            Department.populatedepartment(departmentList);
            Student.populateStudents(studentList);
            Teacher.populateTeachers(teacherList);
            x.populateRooms(differentRooms);
            Klass.populateClass(classList, differentRooms);
            Enrollment.studentEnrolling(enrollmentList, classList); 
            Assignment.populateAssignment(assignmentList, courseList);
            Grade.populateGrades(gradeList, classList, enrollmentList, assignmentList);

        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
        for (Course i : courseList){
        System.out.println(i);
        }
        for (Student i : studentList){
        System.out.println(i);
        }
        for (Teacher i : teacherList){
        System.out.println(i);
        }
        for (Department i : departmentList){
        System.out.println(i);
        }
        for (Klass i : classList){
        System.out.println(i);
        }
        for (Enrollment i : enrollmentList){
        System.out.println(i);
        }
        for (Assignment i : assignmentList){
        System.out.println(i);
        }
        for (Grade i : gradeList){
        System.out.println(i);
        }

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
        System.out.println("DROP TABLE IF EXISTS Grade;"); //DELETE * FROM Grade
        System.out.println("DROP TABLE IF EXISTS Enrollment;");
        System.out.println("DROP TABLE IF EXISTS Assignment;");
        System.out.println("DROP TABLE IF EXISTS AssignmentType;");
        System.out.println("DROP TABLE IF EXISTS Class;");
        System.out.println("DROP TABLE IF EXISTS Students;");
        System.out.println("DROP TABLE IF EXISTS Teacher;");
        System.out.println("DROP TABLE IF EXISTS Courses;");
        System.out.println("DROP TABLE IF EXISTS Department;");
        System.out.println("DROP TABLE IF EXISTS CourseType;");
    }

    public static void populateCourseType(){
        System.out.println("INSERT INTO CourseType (TypeName) VALUES ('AP');");
        System.out.println("INSERT INTO CourseType (TypeName) VALUES ('Elective');");
        System.out.println("INSERT INTO CourseType (TypeName) VALUES ('Regents');");
    }

    public static void populateAssignmentType() {
        System.out.println("INSERT INTO AssignmentType (TypeName) VALUES ('Minor');");
        System.out.println("INSERT INTO AssignmentType (TypeName) VALUES ('Major');");
    }

    




}
