public class Class {
    private int classID;
    private int courseID;
    private int period;
    private String room;
    private int teacher;

    public Class(int courseID, int period, String room, int teacher){
        this.courseID = courseID;
        this.period = period;
        this.room = room;
        this.teacher = teacher;
    }

    public String toString(){
        return "INSERT INTO Class (courseID, period, room, teacher) VALUES (foreign key, int, varchar(255), foreign key)";
    }
}
