package login;

import java.util.Scanner;

public class RegisterUser {

    public void registerAccountUser() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎──────────────[ĐĂNG KÝ]──────────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập thông tin:");
        System.out.println("--------------------------------------");
        System.out.print("┠ ▹ Nhập tài khoản: ");
        String account = scanner.nextLine();
        System.out.print("┠ ▹ Nhập passwword: ");
        String password = scanner.nextLine();
        System.out.print("┠ ▹ Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("┖─────────────────────────────────────┚");
        new isAccount().checkAccountUser(account, password, name,false);
    }
}
