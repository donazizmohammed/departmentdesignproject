public class AssignmentType {
    private static int count = 1;
    private int assignmentTypeID;
    private String assignmentTypeName;

    public AssignmentType(String assignmentName){
        this.assignmentTypeName = assignmentName;
        this.assignmentTypeID = count++;
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

    @Override
    public String toString(){
        return "INSERT INTO AssignmentType (assignmentName) VALUES ('" + assignmentTypeName +"');";
    }
}
