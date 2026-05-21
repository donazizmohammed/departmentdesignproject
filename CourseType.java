public class CourseType {
    private static int count = 1;
    private int typeID;

    public int getTypeID() {
        return this.typeID;
    }

    public void setTypeID(int typeID) {
        this.typeID = typeID;
    }
    private String typeName;

    public String getTypeName() {
        return this.typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public CourseType(String typeName){
        this.typeID = count++;
        this.typeName = typeName;
    }

    @Override
    public String toString() {

        return "INSERT INTO CourseType (typeName) VALUES ( '" + typeName + "');";
    }
}
