package login;

import views.index.RunByAdminn;
import views.index.RunByUser;

import java.util.InputMismatchException;

public class checkAccountForRole{
    static void checkAccount(String account, String password) {
        int checkRole = 0;
        checkRole = new checkGetRole().getCheckRole(account, password, checkRole);
        try {
            if (checkRole == 1) {
                System.out.println("[\uD83D\uDD13] Đặng nhập hệ thống bởi ADMIN thành công !!!");
                System.out.println("------------------------------------------------------------");
                RunByAdminn.menuAdmin();
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
