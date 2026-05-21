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

    public int getteacherID() {
        return this.teacherID;
    }

    public void setteacherID(int teacherID) {
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
}
