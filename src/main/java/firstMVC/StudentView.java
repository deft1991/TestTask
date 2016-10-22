package firstMVC;

/**
 * Created by deft on 22.10.2016.
 */
public class StudentView {
    public void printStudentDetails(String studentName, int studentAge, String studentRollNo){
        System.out.println("Student: ");
        System.out.println("Name: " + studentName);
        System.out.println("Age: " + studentAge);
        System.out.println("Roll No: " + studentRollNo);
    }
}
