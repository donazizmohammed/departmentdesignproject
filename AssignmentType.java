public class AssignmentType {
    private int assignmentTypeID;
    private String assignmentTypeName;

    public AssignmentType(int assignmentTypeID, String assignmentName){
        this.assignmentTypeName = assignmentName;
        this.assignmentTypeID = assignmentTypeID;
    }

    public int getAssignmentTypeID() {
        return assignmentTypeID;
    }

    public void setAssignmentTypeID(int assignmentTypeID) {
        this.assignmentTypeID = assignmentTypeID;
    }

    public String getAssignmentName() {
        return assignmentTypeName;
    }

    public void setAssignmentName(String assignmentName) {
        this.assignmentTypeName = assignmentName;
    }

    public String toString(){
        return "INSERT INTO AssignmentType (assignmentName) VALUES (" + assignmentTypeName +");";
    }
}
