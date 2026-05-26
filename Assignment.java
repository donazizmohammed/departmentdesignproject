import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Assignment {
    private static int count = 1;
    private int assignmentID;
    private String assignmentName;
    private int assignmentTypeID;
    private int courseID;

    public String getAssignmentName() {
        return this.assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public int getAssignmentTypeID() {
        return this.assignmentTypeID;
    }

    public void setAssignmentTypeID(int assignmentTypeID) {
        this.assignmentTypeID = assignmentTypeID;
    }

    public int getCourseID() {
        return this.courseID;
    }

    public void setClassID(int classID) {
        this.courseID = classID;
    }


    public Assignment(String name, int typeID, int cID){
        assignmentName = name;
        assignmentTypeID = typeID;
        courseID = cID;
        assignmentID = count++;
    }
    @Override
    public String toString(){
        return "INSERT INTO Assignment ( AssignmentName, AssignmentTypeID, CourseID) VALUES ( " + assignmentName + ", " + assignmentTypeID + ", " + courseID + ");";
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public static ArrayList<Assignment> populateAssignment(ArrayList<Assignment> assignmentList, ArrayList<Course> courseList) throws FileNotFoundException {
        int totalclasses = courseList.size(); //idk yet
        for (int i = 1; i <= totalclasses; i++) {
            for (int z = 1; z <= 12; z++) {
                String assignmentname = "Assignment" + z;
                Assignment k = new Assignment(assignmentname, 1, i);
                assignmentList.add(k);
            }
            for (int y = 1; y <= 3; y++) {
                String Testname = "Test" + y;
                Assignment k = new Assignment(Testname, 2, i);
                assignmentList.add(k);
            }
        }
        return assignmentList;
    }
}
