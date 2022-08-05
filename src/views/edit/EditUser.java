package views.edit;

import controller.UserService;
import model.User;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class EditUser {
    static final String pathFile="src/w_database/users.dat";
    List<User> listUser= new FileWriteRead().readFile(pathFile);
    public void editUser() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎───────────────────[SỬA NHÂN VIÊN]─────────────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập mã nhân viên cần sửa:");
        System.out.println("-----------------------------------------------------");
        String id = scanner.nextLine();
        int indexRemove=new UserService().checkIndex(listUser,id);
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("-----------------------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập tên: ");
        String name = scanner.nextLine();
        System.out.print("┠ ▹ Nhập vai trò (Admin-User): ");
        String role = scanner.nextLine();
        boolean roleReal=false;
        if(role.equals("Admin")){
            roleReal=true;
        }
        System.out.println("┖────────────────────────────────────────────────────┚");
        new IsAccountEdit().checkAccountUser(indexRemove,account, password, name,roleReal);
    }
}
