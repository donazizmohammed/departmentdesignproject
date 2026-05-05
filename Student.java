public class Student {
    private String firstName;
    private String lastName;
    private int studentID;

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

    public int getStudentID() {
        return this.studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO Students (FirstName, LastName) VALUES ('" + firstName + "', '" + lastName + "');";
    }
       /* old code needs to be unifed with the rest into like a file that handles all inserts
        public void names() throws FileNotFoundException {
        File input = new File("students.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String line = scan.nextLine();
                String[] data = line.split(" ");
                System.out.println("INSERT INTO Students (FirstName, LastName) VALUES ('" + data[0] + "', '" + data[1] + "');");
            }
        }
    }

    public static void main(String[] args) {
        try {
            Student student = new Student();
            student.names();
        } catch (FileNotFoundException e) {
            System.err.println("File not found" + e.getLocalizedMessage() + "gl");
        }
       
       
       
       */
}
