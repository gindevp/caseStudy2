package views.system;

import login.Login;
import model.Student;
import storage.FileWriteRead;
import views.menuAndList.DisplayML;
import views.remove.RemoveStudent;
import views.add.ChoiceAddStudent;
import views.edit.EditStudent;

import java.util.List;
import java.util.Scanner;

public class RunByUser {
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICEEXIT = 0;
    static Scanner scanner = new Scanner(System.in);
    static final String pathFile = "src/w_database/students.dat";
    static FileWriteRead fileWriteRead = new FileWriteRead();
    static List<Student> studentList = (List<Student>) fileWriteRead.readFile(pathFile);

    public static void menuUser() {
        DisplayML.listStudent(studentList);
        DisplayML.menuUser();
        while (true) {

            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAddStudent.addStudent(studentList, pathFile);
                    DisplayML.menuUser();
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList, pathFile);
                    DisplayML.menuUser();
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    RemoveStudent.choiceRemove(studentList, pathFile);
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list
                    DisplayML.listStudent(studentList);
                    DisplayML.menuUser();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }
}
