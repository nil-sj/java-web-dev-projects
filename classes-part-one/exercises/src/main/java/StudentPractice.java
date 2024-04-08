import java.util.ArrayList;

public class StudentPractice {
    public static void main(String[] args){
        //instantiate your Student class below
        Student nil = new Student("Niladri", 12345, 1, 4.0);

        //instantiate Teacher class below:
        Teacher phillip = new Teacher("Phillip", "H", "Java", 10);

        ArrayList<Student> javaStudents = new ArrayList<>();
        javaStudents.add(nil);

        //instantiate Course class below:
        Course java101 = new Course("Java Basics", 101, phillip, new ArrayList<>());

        System.out.println(java101.getName());
        java101.setName("Java Fundamentals");
        System.out.println(java101.getName());
        System.out.println(java101.getEnrolledStudents());
        java101.setEnrolledStudents(javaStudents);
        System.out.println(java101.getEnrolledStudents());
        Student[] studentsArray= new Student[1];
        java101.getEnrolledStudents().toArray(studentsArray);
        System.out.println(studentsArray[0].getName());
    }
}
