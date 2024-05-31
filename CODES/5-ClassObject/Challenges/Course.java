package _6ClassObject.Challenges;

public class Course {
    static int maxCapacity=100;
    String courseName;
    int enrollments;
    String[] enrolledStudents;
    Course(String courseName){
        this.courseName=courseName;
        enrollments=0;
        enrolledStudents=new String[maxCapacity];
    }
    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }
    void enrollStudent(String studentName){
        enrolledStudents[enrollments]=studentName;
        enrollments++;
        System.out.println("The student has successfully enrolled");
    }
    void unenrollStudent(String studentName){
        System.out.println("Student removed");
        enrollments--;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Krishn Learning Point");
        Course bca=new Course("BCA");
        Course.setMaxCapacity(200);
        bca.enrollStudent("krishn kant");
        bca.enrollStudent("sunil");
        Course mbbs=new Course("MBBS");
        mbbs.enrollStudent("Nishu");
        bca.unenrollStudent("krishn kant");
        bca.unenrollStudent("sunil");
        mbbs.unenrollStudent("Nishu");
    }
}
