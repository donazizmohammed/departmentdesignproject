public class Teacher {
    private int teacherID;
    private String firstName;
    private String lastName;
    private int departmentID;

    public int getTeacherID() {
        return this.teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getDepartmentID() {
        return this.departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public Teacher(String firstName, String lastName, int departmentID){
        this.firstName = firstName;
        this.lastName = lastName;
        this.departmentID = departmentID;
    }
    @Override
    public String toString(){
        return "INSERT INTO Teacher ( FirstName, Lastname, DepartmentID) VALUES ( " + firstName + ", " + lastName + ", " + departmentID + ");";

    }



//    public void teacherInserts() throws FileNotFoundException {
//        //doesnt work perfectly due to some teachers having middle names but WHO CARES LOL
//        File input = new File("teachers.txt");
//
//        try (Scanner scan = new Scanner(input)) {
//            while (scan.hasNextLine()) {
//                String line = scan.nextLine();
//
//                String[] parts = line.split("\\|", 2);
//                String[] name = parts[0].trim().split(" ");
//
//                String dept = parts.length > 1 ? parts[1].trim() : "";
//
//                String firstName = name[0];
//                String lastName = (name.length > 1) ? name[1] : "Unknown";
//
//                System.out.println("INSERT INTO Teachers (FirstName, LastName, Department) VALUES ('"
//                        + firstName + "', '" + lastName + "', '" + dept + "');");
//            }
//        }
//    }
//    public static void main(String[] args) {
//        try {
//            Teachers x = new Teachers();
//            x.teacherInserts();
//        } catch (FileNotFoundException e) {
//            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
//        }
//    }
}
