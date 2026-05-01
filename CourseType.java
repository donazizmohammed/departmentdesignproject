public class CourseType {
    private static int count = 0;
    private int typeID;
    private String typeName;

    public CourseType(String typeName){
        this.typeID = count++;
        this.typeName = typeName;
    }

    @Override
    public String toString() {

        return "INSERT INTO CourseType (typeName) VALUES ( '" + typeName + "')";
    }
}
