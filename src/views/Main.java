package views;

import model.Student;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class Main {

        static final int CHOICEADD=1;
        static final int CHOICEEDIT=2;
        static final int CHOICEREMOVE=3;
        static final int CHOICEAVG=4;
        static final int CHOICESHOW=5;
//    static final int CHOICE=7;
        static final int CHOICEEXIT=0;
        static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
        static final String pathFile= "students.dat";

        static FileWriteRead fileWriteRead=new FileWriteRead();
        static List<Student> studentList= (List<Student>) fileWriteRead.readFile(pathFile);
    public static void main(String[] args) {
        MenuStudent.listStudent(studentList);
        MenuStudent.menuStudent();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    AddStudent.addStudent(studentList,pathFile);
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList,pathFile);
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
//                    RemoveStudent.choiceRemove(studentList,pathFile);
                    break;
                case CHOICEEXIT:
                    //exit
                    System.exit(0);
                    break;
                case CHOICESHOW:
                    //detail list
                    MenuStudent.listStudent(studentList);
                    MenuStudent.menuStudent();
                    break;
                default:
                    System.out.println("mời bạn nhập lại:");
            }
        }
    }
}
