
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;


public class Enrollment {
    private int classID;
    private int studentID;

    public Enrollment(int classID, int studentID){
        this.classID = classID;
        this.studentID = studentID;
    }

    public int getClassID() {
        return classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    @Override
    public String toString() {
        return "INSERT INTO Enrollment (classID, studentID) VALUES (" + classID + ", " + studentID + ");";
    }

    public static ArrayList<Enrollment> studentEnrolling(ArrayList<Enrollment> enrollmentList , ArrayList<Klass> listOfClasses) throws FileNotFoundException{
        HashMap<Integer, ArrayList<Integer>> klassMap = new HashMap<>();
        for (int z = 0; z < listOfClasses.size(); z++) {
            int period = listOfClasses.get(z).getPeriod();
            if (!klassMap.containsKey(period)) klassMap.put(period, new ArrayList<>());
            klassMap.get(period).add(z+1);
        }
        
        for (int p = 0; p < 5000; p++) {
            int studentID = p + 1;
            for (int period = 1; period < 11; period++){
                ArrayList<Integer> periodClasses = klassMap.get(period);
                enrollmentList.add(new Enrollment(periodClasses.get((int) (Math.random() * periodClasses.size())), studentID));
            }

        }  
        return enrollmentList;
    }
    

}
