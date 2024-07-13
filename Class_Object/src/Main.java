
class Student{
    int roll;
   float cgpa;
    String course;

    public void courseInfo() {
        System.out.println(this.roll);
        System.out.println(this.cgpa);
        System.out.println(this.course);
    }
    Student(){
        System.out.println("This is a coonstructor");
    }
    Student(Student s2){ //using of copy constructor with 2 parameter
        this.roll = s2.roll;
        this.cgpa = s2.cgpa;
    }
    Student(int roll, float cgpa, String course){ //using of constructor with 3 parameter
        this.roll = roll ;
        this.cgpa = cgpa;
        this.course = course;

    }
}
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.roll = 42;
        s1.cgpa = 3.5f;
        s1.course = "Java";

        Student s3 = new Student();
        s3.roll = 44;
        s3.cgpa = 3.7f;
        s3.course = "PHP";
        s1.courseInfo();

        s3.courseInfo();

        Student s2 = new Student(s1); // copying values of s1 into s2.
        s2.courseInfo();

    }
}