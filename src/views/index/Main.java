package views.index;

import model.Student;
import storage.FileWriteRead;
import views.menuAndList.DisplayMLStudent;
import views.remove.RemoveStudent;
import views.add.ChoiceAddStudent;
import views.edit.EditStudent;

import java.util.List;
import java.util.Scanner;

public class Main {
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICEEXIT = 0;
    static Scanner scanner = new Scanner(System.in);
    static final String pathFile = "students.dat";
    static FileWriteRead fileWriteRead = new FileWriteRead();
    static List<Student> studentList = (List<Student>) fileWriteRead.readFile(pathFile);

    public static void main(String[] args) {
        DisplayMLStudent.listStudent(studentList);
        DisplayMLStudent.menuStudent();
        while (true) {

            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAddStudent.addStudent(studentList, pathFile);
                    DisplayMLStudent.menuStudent();
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList, pathFile);
                    DisplayMLStudent.menuStudent();
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    RemoveStudent.choiceRemove(studentList, pathFile);
                    break;
                case CHOICEEXIT:
                    //exit
                    System.exit(0);
                    break;
                case CHOICESHOW:
                    //detail list
                    DisplayMLStudent.listStudent(studentList);
                    DisplayMLStudent.menuStudent();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }
}
