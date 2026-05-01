import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Enrollment {
    private int classID;
    private int studentID;

    public Enrollment(int classID, int studentID){
        this.classID = classID;
        this.studentID = studentID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Enrollment (classID, studentID) VALUES (" + classID + ", " + studentID + ");";
    }


    
    public void roomandteachInserts() throws FileNotFoundException {
        //list of valid rooms when room is picked for period remove it from the list

        ArrayList<String> data = new ArrayList<>();
        File input = new File("rooms.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                data.add(line);
            }
            ArrayList<Integer> validTeachers = new ArrayList<>();
            for (Integer i = 0; i <= 301; i++) {
                validTeachers.add(i);
            }
            ArrayList<String> validRooms = new ArrayList<>(data);

            // the idea for the for loop is that this needs to be done for each period
            for (int period = 0; period <= 10; period++) {
                String room = validRooms.get((int) (Math.random()));  // get a random room random teacher checkj if they are occupied if not wirte the instert should be that hard :)
                Integer teach = (int) (Math.random() * 301) + 1; // get random teacherid
                if (!validRooms.contains(room) && !validTeachers.contains(teach)) {
                    System.out.println("Insert INTO Enrollment (Room, Teacherid) Values ('" + room + "', '" + teach + "');");
                }
            }
        }
    }
//    public static void main(String[] args) {
//        try {
//            Enrollment x = new Enrollment();
//            x.roomandteachInserts();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
//        }
//
//    }
}
