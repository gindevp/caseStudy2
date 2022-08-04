package views.system;

import controller.StudentService;
import controller.UserService;
import login.Login;
import model.*;
import storage.FileWriteRead;
import views.add.AddUser;
import views.edit.EditUser;
import views.menuAndList.DisplayML;
import views.remove.RemoveUser;
import views.remove.RemoveStudent;
import views.add.ChoiceAddStudent;
import views.edit.EditStudent;

import java.util.List;
import java.util.Scanner;

public class RunByAdmin{
    static final int CHOICEADD = 1;
    static final int CHOICEEDIT = 2;
    static final int CHOICEREMOVE = 3;
    static final int CHOICESHOW = 4;
    static final int CHOICEEXIT = 0;
    static final int CHOICEUSER = 7;
    static final int CHOICESTUDENT=5;
    static Scanner scanner = new Scanner(System.in);
    static Scanner scanner1 = new Scanner(System.in);
    static final String pathFileStudent = "src/w_database/students.dat";
    static final String pathFileUser = "src/w_database/users.dat";
    static FileWriteRead fileWriteRead = new FileWriteRead();
    static List<Student> studentList = (List<Student>) fileWriteRead.readFile(pathFileStudent);

    public  static void choiceUserOrStudent(){
        DisplayML.choiceStudentUser();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //add
                    menuStudentAdmin();
                    break;
                case 2:
                    menuStaffManager();
                    //edit
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }
    public static void menuStaffManager() {
        DisplayML.listUser(fileWriteRead.readFile(pathFileUser));
        DisplayML.menuStaff();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //add
                    new AddUser().addUser();
                    break;
                case 2:
                    new EditUser().editUser();
                    //edit
                    break;
                case 3:
                    //remove
                    new RemoveUser().removeUser();
                    RunByAdmin.menuStaffManager();
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list
                    RunByAdmin.menuStaffManager();
                    break;
                case 5:
                    //student mangaer
                    menuStudentAdmin();
                    break;
                case 6:
                    System.out.println("Mời nhập tên nhân viên cần tìm: ");
                    String name= scanner1.nextLine();
                    User element= new UserService().search(fileWriteRead.readFile(pathFileUser),name);
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

    public static void menuStudentAdmin() {
        DisplayML.listStudent(fileWriteRead.readFile(pathFileStudent));
        DisplayML.menuAdmin();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAddStudent.addStudent(studentList, pathFileStudent);
                    DisplayML.menuAdmin();
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList, pathFileStudent);
                    DisplayML.menuAdmin();
                    //edit
                    break;
                case CHOICEREMOVE:
                    //remove
                    RemoveStudent.choiceRemove(studentList, pathFileStudent);
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list
                    DisplayML.listStudent(studentList);
                    DisplayML.menuAdmin();
                    break;
                case CHOICEUSER:
                    menuStaffManager();
                    break;
                case  5:
                    System.out.println("Điểm trung bình: "+sum());
                    break;
                case 6 :
                    System.out.println("Mời nhập tên nhân viên cần tìm: ");
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
}
