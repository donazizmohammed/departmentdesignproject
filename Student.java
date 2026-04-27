public class Student {
    private String FirstName;
    private String LastName;
    private int StudentID;

    public String getFirstName() {
        return this.FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return this.LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public int getStudentID() {
        return this.StudentID;
    }

    public void setStudentID(int StudentID) {
        this.StudentID = StudentID;
    }

    @Override
    public String toString(){
        return "INSERT INTO Students (FirstName, LastName) VALUES ('" + FirstName + "', '" + LastName + "');";
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
