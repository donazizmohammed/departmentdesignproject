public class Assignment {
    private static int count = 1;
    private int assignmentID;
    private String assignmentName;
    private int assignmentTypeID;
    private int classID;

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

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }


    public Assignment(String name, int typeID, int cID){
        assignmentName = name;
        assignmentTypeID = typeID;
        classID = cID;
        assignmentTypeID = count++;
    }
    @Override
    public String toString(){
        return "INSERT INTO Assignment ( AssignmentName, AssignmentTypeID, classID) VALUES ( " + assignmentName + ", " + assignmentTypeID + ", " + classID + ");";
    }

    public int getAssignmentID() {
        return assignmentID;
    }

    public void setAssignmentID(int assignmentID) {
        this.assignmentID = assignmentID;
    }
}
