
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
            Assignment.populateAssignment(assignmentList, classList);
            Grade.populateGrades(gradeList, enrollmentList, assignmentList);

        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
        System.out.println("INSERT INTO Courses(name, typeID) VALUES ");
        for (int i = 0; i < courseList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(courseList.get(courseList.size()-1) + ";");

        System.out.println("INSERT INTO Department (DepartmentName) VALUES ");
        for (int i = 0; i < departmentList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(departmentList.get(departmentList.size()-1) + ";");

        System.out.println("INSERT INTO Students (FirstName, LastName) VALUES ");
        for (int i = 0; i < studentList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(studentList.get(studentList.size()-1) + ";");

        System.out.println("INSERT INTO Teacher ( FirstName, Lastname, DepartmentID) VALUES ");
        for (int i = 0; i < teacherList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(teacherList.get(teacherList.size()-1) + ";");

        System.out.println("INSERT INTO Class (courseID, period, room, teacherID) VALUES ");
        for (int i = 0; i < classList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(classList.get(classList.size()-1) + ";");

        System.out.println("INSERT INTO Enrollment (classID, studentID) VALUES ");
        for (int i = 0; i < enrollmentList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(enrollmentList.get(enrollmentList.size()-1) + ";");

      System.out.println("INSERT INTO Assignment ( AssignmentName, AssignmentTypeID, ClassID) VALUES ");
        for (int i = 0; i < assignmentList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(assignmentList.get(assignmentList.size()-1) + ";");

        System.out.println("INSERT INTO Grade (assignmentID, grade, studentID) VALUES ");
        for (int i = 0; i < gradeList.size() - 1; i ++){
            System.out.println(i + ",");
        }
        System.out.println(gradeList.get(gradeList.size()-1) + ";");

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
