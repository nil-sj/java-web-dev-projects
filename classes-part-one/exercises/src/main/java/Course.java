import java.util.ArrayList;
public class Course {
    private String name;
    private int id;
    private Teacher instructor;
    private ArrayList<Student> enrolledStudents;

    public Course(String name, int id, Teacher instructor, ArrayList<Student> enrolledStudents) {
        this.name = name;
        this.id = id;
        this.instructor = instructor;
        this.enrolledStudents = enrolledStudents;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Student> getEnrolledStudents() {
        return enrolledStudents;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEnrolledStudents(ArrayList<Student> enrolledStudents) {
        this.enrolledStudents = enrolledStudents;
    }
}
