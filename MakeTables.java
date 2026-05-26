public class MakeTables {

    public static void makeTables(){
        System.out.println("CREATE TABLE CourseType (\r\n" + //
                        "    TypeID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    TypeName VARCHAR(255) NOT NULL\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Department (\r\n" + //
                        "    DepartmentID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    DepartmentName VARCHAR(255) NOT NULL\r\n" + //
                        ");\r\n" + //
                        "");
                        
        System.out.println("CREATE TABLE Course (\r\n" + //
                        "    CourseID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    Name VARCHAR(255) NOT NULL,\r\n" + //
                        "    TypeID INT,\r\n" + //
                        "    FOREIGN KEY (TypeID) REFERENCES CourseType(TypeID)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Teacher (\r\n" + //
                        "    TeacherID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    FirstName VARCHAR(255),\r\n" + //
                        "    LastName VARCHAR(255),\r\n" + //
                        "    DepartmentID INT,\r\n" + //
                        "    FOREIGN KEY (DepartmentID) REFERENCES Department(DepartmentID)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Class (\r\n" + //
                        "    ClassID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    CourseID INT,\r\n" + //
                        "    Period INT,\r\n" + //
                        "    Room VARCHAR(255),\r\n" + //
                        "    TeacherID INT,\r\n" + //
                        "    FOREIGN KEY (CourseID) REFERENCES Course(CourseID),\r\n" + //
                        "    FOREIGN KEY (TeacherID) REFERENCES Teacher(TeacherID)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Student (\r\n" + //
                        "    StudentID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    FirstName VARCHAR(255),\r\n" + //
                        "    LastName VARCHAR(255)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Enrollment (\r\n" + //
                        "    ClassID INT,\r\n" + //
                        "    StudentID INT,\r\n" + //
                        "    PRIMARY KEY (ClassID, StudentID),\r\n" + //
                        "    FOREIGN KEY (ClassID) REFERENCES Class(ClassID),\r\n" + //
                        "    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE AssignmentType (\r\n" + //
                        "    AssignmentTypeID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    TypeName VARCHAR(100) NOT NULL\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Assignment (\r\n" + //
                        "    AssignmentID INT AUTO_INCREMENT PRIMARY KEY,\r\n" + //
                        "    AssignmentName VARCHAR(255),\r\n" + //
                        "    AssignmentTypeID INT,\r\n" + //
                        "    CourseID INT,\r\n" + //
                        "    FOREIGN KEY (AssignmentTypeID) REFERENCES AssignmentType(AssignmentTypeID),\r\n" + //
                        "    FOREIGN KEY (CourseID) REFERENCES Course(CourseID)\r\n" + //
                        ");\r\n" + //
                        "");

        System.out.println("CREATE TABLE Grade (\r\n" + //
                        "    AssignmentID INT,\r\n" + //
                        "    StudentID INT,\r\n" + //
                        "    Grade INT,\r\n" + //
                        "    PRIMARY KEY (AssignmentID, StudentID),\r\n" + //
                        "    FOREIGN KEY (AssignmentID) REFERENCES Assignment(AssignmentID),\r\n" + //
                        "    FOREIGN KEY (StudentID) REFERENCES Student(StudentID)\r\n" + //
                        ");\r\n" + //
                        "");
    }




}