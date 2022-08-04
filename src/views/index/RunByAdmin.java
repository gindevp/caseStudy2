package views.index;

import login.Login;
import model.Student;
import model.User;
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
    static final int CHOICEUSER = 6;
    static Scanner scanner = new Scanner(System.in);
    static final String pathFileStudent = "src/w_database/students.dat";
    static final String pathFileUser = "src/w_database/users.dat";
    static FileWriteRead fileWriteRead = new FileWriteRead();
    static List<Student> studentList = (List<Student>) fileWriteRead.readFile(pathFileStudent);
    static List<User> userList= fileWriteRead.readFile(pathFileUser);
    public  static void choiceUserOrStudent(){
        System.out.println("╔============================================================╗");
        System.out.println("║             ▂ ▃ ▅ ▆ █ HỆ THỐNG ADMIN  █ ▆ ▅ ▃ ▂            ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Quản lý sinh viên                                     ║");
        System.out.println("║>[2]. Quản lý nhân viên                                     ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
        System.out.println("Mời nhập lựa chọn:");
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    //add
                    menuAdmin();
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
        DisplayML.listUser(userList);
        System.out.println("╔============================================================╗");
        System.out.println("║             ▂ ▃ ▅ ▆ █ HỆ THỐNG ADMIN  █ ▆ ▅ ▃ ▂            ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Thêm Nhân Viên                                        ║");
        System.out.println("║>[2]. Sửa Nhân Viên                                         ║");
        System.out.println("║>[3]. Xóa Nhân Viên                                         ║");
        System.out.println("║>[4]. Danh Sách Nhân Viên                                   ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
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
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list
                    DisplayML.listUser(userList);
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }

    public static void menuAdmin() {
        DisplayML.listStudent(studentList);
        DisplayML.menuAdmin();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAddStudent.addStudent(studentList, pathFileStudent);
                    DisplayML.menuUser();
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList, pathFileStudent);
                    DisplayML.menuUser();
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
                    DisplayML.menuUser();
                    break;
                case CHOICEUSER:
                    menuStaffManager();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }
}
