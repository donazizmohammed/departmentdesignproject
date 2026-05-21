import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Klass {
    private static int count = 0;
    private int classID;
    private int courseID;
    private int period;
    private String room;
    private int teacherID;

    public int getClassID() {
        return this.classID;
    }

    public void setClassID(int classID) {
        this.classID = classID;
    }

    public int getCourseID() {
        return this.courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public int getPeriod() {
        return this.period;
    }

    public void setPeriod(int period) {
        this.period = period;
    }

    public String getRoom() {
        return this.room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public int getTeacherID() {
        return this.teacherID;
    }

    public void setTeacherID(int teacherID) {
        this.teacherID = teacherID;
    }

    public Klass(int courseID, int period, String room, int teacherID){
        classID = count++;
        this.courseID = courseID;
        this.period = period;
        this.room = room;
        this.teacherID = teacherID;
    }

    @Override
    public String toString(){
        return "INSERT INTO Class (courseID, period, room, teacherID) VALUES ( " + courseID + ", " + period + ", " + room + ", " + teacherID + ");";
    }

    public static ArrayList<Klass> populateClass(ArrayList<Klass> classList, ArrayList<String> roomList) throws FileNotFoundException {
        ArrayList<Integer> teacherIDList = new ArrayList<>();
        ArrayList<Integer> courseIDList = new ArrayList<>();

        for (int i = 1; i <= 301; i++) {
            teacherIDList.add(i);
        }
        for (int i = 1; i <= 92; i++) {
            courseIDList.add(i);
        }
        ArrayList<Integer> teacherIDListCopy = new ArrayList<>(teacherIDList);
        ArrayList<String> roomListCopy = new ArrayList<>(roomList);
        // coursetimes to determine how many classes this course will be taught (has to
        // be 1-5)
        for (int q = 1; q <= courseIDList.size(); q++) {
            int coursetimes = (int) (Math.random() * 5) + 1;
            for (int z = 1; z <= coursetimes; z++) {
                int teacherID = -1;
                int courseID = -1;
                String room = " ";
                int period = (int) (Math.random() * 10) + 1; // determine the period
                if (!teacherIDListCopy.isEmpty()) {
                    teacherID = teacherIDListCopy.get((int) (Math.random() * teacherIDListCopy.size()));// random teach

                    courseID = q;

                    room = roomListCopy.get((int) (Math.random() * roomListCopy.size())); // random room

                    Klass k = new Klass(courseID, period, room, teacherID);
                    classList.add(k);
                    teacherIDListCopy.remove(teacherIDListCopy.indexOf(teacherID));

                    if (!roomListCopy.isEmpty()) {

                        roomListCopy.remove(roomListCopy.indexOf(room));

                    } else {
                        roomListCopy = new ArrayList<>(roomList);
                    }

                } else {
                    if (teacherIDListCopy.isEmpty()) {
                        teacherIDListCopy = new ArrayList<>(teacherIDList);
                    }
                    teacherID = teacherIDListCopy.get((int) (Math.random() * teacherIDListCopy.size()));// random teach

                    boolean foundteacherID = false;
                    while (!foundteacherID) {
                        for (Klass x : classList) {
                            if (x.getTeacherID() == teacherID) {
                                if (x.getPeriod() == period) {
                                    teacherID = teacherIDListCopy.get((int) (Math.random() * teacherIDListCopy.size()));// random teach
                                } else {
                                    foundteacherID = true;
                                }
                            }
                        }
                    }
                    
                    courseID = q;

                    room = roomListCopy.get((int) (Math.random() * roomListCopy.size())); // random room

                    Klass k = new Klass(courseID, period, room, teacherID);
                     classList.add(k);

                    teacherIDListCopy.remove(teacherIDListCopy.indexOf(teacherID));

                    if (!roomListCopy.isEmpty()) {

                        roomListCopy.remove(roomListCopy.indexOf(room));

                    } else {
                        roomListCopy = new ArrayList<>(roomList);
                    }
                }
            }
        }
        return classList;
    }
}
