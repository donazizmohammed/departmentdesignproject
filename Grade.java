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
        return "INSERT INTO Grade (assignmentID, grade, studentID) VALUES (" + assignmentID + ", " + grade + ", " + studentID   +");";
    }
}
