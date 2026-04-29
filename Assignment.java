public class Assignment {
    private int assignmentID;
    private String assignmentName;
    private int assignmentTypeID;
    private int courseID;

    public Assignment(String name, int typeID, int cID){
        assignmentName = name;
        assignmentTypeID = typeID;
        courseID = cID;

    }
    public String toString(){
        return "INSERT INTO Assignment ( AssignmentName, AssignmentTypeID, courseID) VALUES ( " + assignmentName + ", " + assignmentTypeID + ", " + courseID + ");";
    }
}
