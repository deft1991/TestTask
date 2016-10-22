package firstMVC;

/**
 * Created by deft on 22.10.2016.
 */
public class MVCPatternDemo {
    public static void main(String[] args) {
        Student model = retriveStudentFromDataBase();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentAge(22);
        controller.setStudentName("Alena");
        controller.updateView();
    }

    private static Student retriveStudentFromDataBase() {
        Student student = new Student();
        student.setName("Robert");
        student.setAge(25);
        student.setRoolNo("10");
        return student;
    }
}
