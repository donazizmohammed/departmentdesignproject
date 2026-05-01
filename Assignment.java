public class Assignment {
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

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }


    public Assignment(String name, int typeID, int cID){
        assignmentName = name;
        assignmentTypeID = typeID;
        courseID = cID;

    }
    public String toString(){
        return "INSERT INTO Assignment ( AssignmentName, AssignmentTypeID, courseID) VALUES ( " + assignmentName + ", " + assignmentTypeID + ", " + courseID + ");";
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }
}
