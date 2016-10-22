package firstMVC;

/**
 * Created by deft on 22.10.2016.
 */
public class StudentController {
    Student model;
    StudentView view;

    public StudentController(Student student, StudentView view) {
        this.model = student;
        this.view = view;
    }
    public void setStudentName(String name){
        model.setName(name);
    }
    public void setStudentAge(int age){
        model.setAge(age);
    }
    public void setStudentRollNo(String rollNo){
        model.setRoolNo(rollNo);
    }
    public void updateView(){
        view.printStudentDetails(model.getName(),model.getAge(),model.getRoolNo());
    }



}
