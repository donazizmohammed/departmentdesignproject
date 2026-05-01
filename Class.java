public class Class {
    private int classID;
    private int courseID;
    private int period;
    private String room;
    private int teacher;

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

    public int getTeacher() {
        return this.teacher;
    }

    public void setTeacher(int teacher) {
        this.teacher = teacher;
    }

    public Class(int courseID, int period, String room, int teacher){
        this.courseID = courseID;
        this.period = period;
        this.room = room;
        this.teacher = teacher;
    }

    @Override
    public String toString(){
        return "INSERT INTO Class (courseID, period, room, teacher) VALUES ( " + courseID + ", " + period + ", " + room + ", " + teacher + ");";
    }
}
