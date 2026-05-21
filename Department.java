import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Department {
    private static int count = 1;
    private int departmentID;
    private String departmentName;

    public int getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Department.count = count;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public Department(String departmentName){
        departmentID = count++;
        this.departmentName = departmentName;
    }
    
    public String toString() {
        return "INSERT INTO Departments (DepartmentName) VALUES ( " + departmentName + ");";
    }

    public static ArrayList<Department> populatedepartment(ArrayList<Department> departmentList) throws FileNotFoundException {
        File input = new File("Department.txt");
        try (Scanner scan = new Scanner(input)) {
            while (scan.hasNextLine()) {
                String dept = scan.nextLine();
                Department department = new Department(dept);
                departmentList.add(department);
            }
        }
        return departmentList;
    }
}