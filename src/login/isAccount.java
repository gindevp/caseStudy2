package login;

import controller.Manager;
import model.User;

import java.util.List;

public class isAccount {
    List<User> listUser= Login.listUser;
    void checkAccountUser(String account, String password, String name, boolean b) {
        if (new checkNameAcount().checkNameAccount(account)) {
            System.out.println("[❌] Tài khoản đã tồn tại. Vui lòng đăng ký lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new Manager().add(listUser,new User(account,password,name,b),"users.dat");
            System.out.println("[\uD83D\uDC4C] Đăng ký thành công. Mời đăng nhập vào hệ thống !!!");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        new Login().loginSystem();
    }
}
