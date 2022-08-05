package views.system;

import controller.StudentService;
import login.Login;
import model.Student;
import model.StudentA00;
import model.StudentC06;
import model.StudentE09;
import storage.FileWriteRead;
import views.menuAndList.DisplayML;
import views.remove.RemoveStudent;
import views.add.ChoiceAddStudent;
import views.edit.CheckInstanceStudentEdit;

import java.util.List;
import java.util.Scanner;

public class RunByUser {
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICEAVG= 5;
    static final int CHOICESEARCH = 6;
    static final int CHOICEEXIT = 0;
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
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
                    CheckInstanceStudentEdit.checkInsStudentEit(studentList, pathFile);
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
                case CHOICEAVG:

                    System.out.println("Điểm trung bình: "+sum());
                    break;
                case CHOICESEARCH:
                    System.out.println("Mời nhập tên sinh viên cần tìm: ");
                    String name= scanner1.nextLine();
                    Student element= new StudentService().search(studentList,name);
                    System.out.println("Đối tượng cần tìm là : "+element.toString());
                    System.out.println("Mời nhập lựa chọn:");
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }

    private static double sum() {
        int sum=0;
        double avg=0;
        int count=0;
        for (Student x: studentList
             ) {
            if(x instanceof StudentA00){
            StudentA00 y=(StudentA00) x;
           sum = y.getChemistry()+y.getMath()+y.getPhysics();
           avg+= sum/3;
           count++;
            }
        }
        for (Student x: studentList
        ) {
            if(x instanceof StudentC06){
            StudentC06 y=(StudentC06) x;
            sum = y.getDisciple()+y.getEnglish()+y.getLiterature();
                avg+= sum/3;
            count++;}
        }
        for (Student x: studentList
        ) {
            if(x instanceof StudentE09){
            StudentE09 y=(StudentE09) x;
            sum = y.getArt()+y.getGeography()+y.getHistory();
            avg+= sum/3;
            count++;}
        }
        avg=avg/count;
       return avg;
    }
}
