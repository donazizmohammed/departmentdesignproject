public class AssignmentType {
    private int assignmentTypeID;
    private String assignmentName;

    public AssignmentType(int assignmentTypeID, String assignmentName){
        this.assignmentName = assignmentName;
        this.assignmentTypeID = assignmentTypeID;
    }

    public int getAssignmentTypeID() {
        return assignmentTypeID;
    }

    public void setAssignmentTypeID(int assignmentTypeID) {
        this.assignmentTypeID = assignmentTypeID;
    }

    public String getAssignmentName() {
        return assignmentName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentName = assignmentName;
    }

    public String toString(){
        return "INSERT INTO AssignmentType (assignmentName) VALUES (varchar(255));";
    }
}
