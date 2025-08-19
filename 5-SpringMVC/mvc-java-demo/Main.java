import controller.StudentController;
import model.StudentDAO;
import view.StudentView;

public class Main {
    public static void main(String[] args) {
        StudentDAO dao = new StudentDAO();
        StudentView view = new StudentView();
        StudentController controller = new StudentController(dao, view);

        controller.showAllStudents();
    }
}
