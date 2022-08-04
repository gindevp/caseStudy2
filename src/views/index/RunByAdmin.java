package views.index;

import login.Login;
import model.Student;
import storage.FileWriteRead;
import views.add.AddStaff;
import views.edit.EditStaff;
import views.menuAndList.DisplayMLStudent;
import views.remove.RemoveStaff;
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
    static Scanner scanner = new Scanner(System.in);
    static final String pathFile = "src/w_database/students.dat";
    static FileWriteRead fileWriteRead = new FileWriteRead();
    static List<Student> studentList = (List<Student>) fileWriteRead.readFile(pathFile);
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
                    new AddStaff().addUser();
                    break;
                case 2:
                    new EditStaff().editUser();
                    //edit
                    break;
                case 3:
                    //remove
                    new RemoveStaff().removeUser();
                    break;
                case CHOICEEXIT:
                    //exit
                    new Login().choiceLogin();
                    break;
                case CHOICESHOW:
                    //detail list

                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }

    public static void menuAdmin() {
        DisplayMLStudent.listStudent(studentList);
        DisplayMLStudent.menuAdmin();
        while (true) {
            int choice = scanner.nextInt();
            switch (choice) {
                case CHOICEADD:
                    //add
                    ChoiceAddStudent.addStudent(studentList, pathFile);
                    DisplayMLStudent.menuUser();
                    break;
                case CHOICEEDIT:
                    EditStudent.editStudent(studentList, pathFile);
                    DisplayMLStudent.menuUser();
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
                    DisplayMLStudent.listStudent(studentList);
                    DisplayMLStudent.menuUser();
                    break;
                default:
                    System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }
        }
    }
}
