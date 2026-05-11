
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

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

        try {

            Main x = new Main();
            x.names(studentList);
            x.teachers(teacherList);
            x.courses(courseList);
            x.rooms(differentRooms);
            x.department(departmentList);
            x.enrolls(enrollmentList);

        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
        // for (Course i : courseList){
        //     System.out.println(i);
        // } 
        // for (Student i : studentList){
        //     System.out.println(i);
        // }
        // for (Teacher i : teacherList){
        //     System.out.println(i);
        // }
        // for (Department i : departmentList){
        //     System.out.println(i);
        // }

        // Printing for all the tables, toString statements will auto print the INSERT statements
    }
    // attempt at making code that generates student objects from the student.txt
    // file
    // 90% chance this doesnt work but its a start

    public void names(ArrayList<Student> studentList) throws FileNotFoundException {
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
    }

    public ArrayList<Enrollment> enrolls(ArrayList<Enrollment> y) {
        ArrayList<Integer> courseIDList = new ArrayList<>();
        ArrayList<Integer> studentIDList = new ArrayList<>();
        for (int i = 1; i <= 5000; i++) {
            studentIDList.add(i);
        }
        for (int i = 1; i <= 92; i++) {
            courseIDList.add(i);
        }
        for (Integer course : courseIDList) {
            int x = (int) (Math.random() * 30) + 20; // amount of students
            for (int i = 0; i <= x; i++) {
                y.add(new Enrollment(course, studentIDList.get((int) (Math.random() * studentIDList.size()))));
            }
        }
        return y;
    }

    public void teachers(ArrayList<Teacher> teacherList) throws FileNotFoundException {
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
    }

    public void department(ArrayList<Department> departmentList) throws FileNotFoundException {
        File input = new File("Department.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String dept = scan.nextLine();
                Department department = new Department(dept);
                departmentList.add(department);
            }
        }
    }

    public void courses(ArrayList<Course> courseList) throws FileNotFoundException {
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
    }

    public void rooms(ArrayList<String> differentRooms) throws FileNotFoundException {
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

    public void Class() throws FileNotFoundException {
        ArrayList<Integer> teacherIDList = new ArrayList<>();
        ArrayList<Integer> courseIDList = new ArrayList<>();
        ArrayList<String> roomList = new ArrayList<>();

        rooms(roomList);
        ArrayList<ArrayList<Integer>> teacherList = new ArrayList<>(); // to store the teacherID and the period they're occupied
        for (int i = 1; i <= 301; i++) {
            teacherIDList.add(i);
        }
        for (int i = 1; i <= 92; i++) {
            courseIDList.add(i);
        }
        ArrayList<Integer> teacherIDListCopy = new ArrayList<>(teacherIDList);
        ArrayList<Integer> courseIDListCopy = new ArrayList<>(courseIDList);
        ArrayList<String> roomListCopy = new ArrayList<>(roomList);
        int coursetimes = (int) (Math.random() * 5) + 1;
        // coursetimes to determine how many classes this course will be taught (has to
        // be 1-5)
        for (int z = 1; z <= coursetimes; z++) {
            int teacherID = -1;
            int courseID = -1;
            String room = " ";
            int period = (int) (Math.random() * 10) + 1; // determine the period
            if (!teacherIDListCopy.isEmpty()) {
                teacherID = teacherIDListCopy.get((int) (Math.random() * teacherIDListCopy.size()));// random teach

                courseID = courseIDListCopy.get((int) (Math.random() * courseIDListCopy.size())); // random course

                room = roomListCopy.get((int) (Math.random() * roomListCopy.size())); // random room

                Klass k = new Klass(courseID, period, room, teacherID);
                if (!courseIDListCopy.isEmpty()) {
                    courseIDListCopy.remove(courseIDListCopy.indexOf(courseID));

                    teacherIDListCopy.remove(teacherIDListCopy.indexOf(teacherID));

                    if (!roomListCopy.isEmpty()) {

                        roomListCopy.remove(roomListCopy.indexOf(room));

                    } else {
                        roomListCopy = new ArrayList<>(roomList);
                    }

                } else {
                    courseIDListCopy = new ArrayList<>(courseIDList);

                }

            }
        }

    }

}
