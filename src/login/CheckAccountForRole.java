package login;

import views.system.RunByAdmin;
import views.system.RunByUser;

import java.util.InputMismatchException;

public class CheckAccountForRole {
    static void checkAccount(String account, String password) {
        int checkRole = 0;
        checkRole = new CheckGetRole().getCheckRole(account, password, checkRole);
        try {
            if (checkRole == 1) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi ADMIN thành công !!!");
                System.out.println("------------------------------------------------------------");
                RunByAdmin.choiceUserOrStudent();
            } else if (checkRole == 2) {
                System.out.println("[\uD83D\uDD13] Đăng nhập hệ thống bởi USER thành công !!!");
                System.out.println("----------------------------------------------------------");
                RunByUser.menuUser();
            } else {
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng! Mời nhập lại: ");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                System.out.println("----------------------------------------------------------");
                new Login().loginManager();
            }
        } catch (InputMismatchException e) {
            e.getMessage();
        }
    }
}
