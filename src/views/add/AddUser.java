package views.add;

import java.util.Scanner;

public class AddUser {
    public void addUser(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎──────────[THÊM NHÂN VIÊN]──────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
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
        System.out.println("┖─────────────────────────────────────┚");
        new CheckAccountForRoleAdd().checkAccountUser(account, password, name,roleReal);
    }
}
