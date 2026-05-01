public class CourseType {
    private int typeID;
    private String typeName;

    public CourseType(String typeName){
        this.typeName = typeName;
    }

    @Override
    public String toString() {

        return "INSERT INTO CourseType (typeName) VALUES (" + typeName + ")";
    }
}
