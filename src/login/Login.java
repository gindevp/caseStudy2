package login;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);

    public void menuLogin() throws NumberFormatException {
        do {
            System.out.println("╔============================================╗");
            System.out.println("║   ▂ ▃ ▅ ▆ █  Student Manager  █ ▆ ▅ ▃ ▂    ║");
            System.out.println("╠============================================╣");
            System.out.println("║>[1]. Đăng nhập                             ║");
            System.out.println("║>[2]. Đăng ký tài khoản                     ║");
            System.out.println("║>[0]. Thoát                                 ║");
            System.out.println("╚============================================╝");
            System.out.print("[\uD83D\uDC4B] Nhập lựa chọn: ");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
//                    registerAccountUser();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
                    break;
            }
        } while (true);
    }

    private void loginManager() {
        try{
            System.out.println("┎──────────────[ĐĂNG NHẬP]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản: ");
            String account = scanner.nextLine();
            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            checkAccount(account,password);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    public static void main(String[] args) {
        Login login = new Login();
        login.menuLogin();
    }
    private void checkAccount(String account, String password) {
        try {
            if (checkAccountAdmin(account,password)){
                System.out.println("[\uD83D\uDD13] Đặng nhập hệ thống bởi ADMIN thành công !!!");
                System.out.println("------------------------------------------------------------");
//                runByAdmin.menuManager();
            } else if (checkAccountUser(account, password)) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi USER thành công !!!");
                System.out.println("----------------------------------------------------------");
//                runByUser.displayShop();
            }else {
                System.err.println("Tên đăng nhập hoặc mật khẩu không đúng! Mời nhập lại: ");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }

    private boolean checkAccountUser(String account, String password) {
return false;
    }

    private boolean checkAccountAdmin(String account, String password) {
        return false;
    }


}
