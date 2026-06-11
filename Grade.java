import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Grade {
   private int assignmentID;
   private int grade;
   private int studentID;

   public Grade(int assignmentID, int grade, int studentID){
       this.assignmentID = assignmentID;
       this.grade = grade;
       this.studentID = studentID;
   }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "(" + assignmentID + ", " + grade + ", " + studentID   +")";
    }

    public static ArrayList<Grade> populateGrades(ArrayList<Grade> gradeList,ArrayList<Enrollment> enrollmentList,ArrayList<Assignment> assignmentList) throws FileNotFoundException {
        for (Enrollment list : enrollmentList) {
            int studentID = list.getStudentID();
            int classID = list.getClassID();
            ArrayList<Integer> assignmentIDs = new ArrayList<>();
            for (Assignment assi : assignmentList) {
                if (classID == assi.getClassID()) {
                    assignmentIDs.add(assi.getAssignmentID());
                }
            }
            for (int assiIDs : assignmentIDs) {
                int grade = (int) (Math.random() * 26) + 75;
                Grade k = new Grade(assiIDs, grade, studentID);
                gradeList.add(k);
            }
        }
        return gradeList;
    }
}
