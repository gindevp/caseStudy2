package login;

import controller.CRUD;
import model.User;
import storage.FileWriteRead;

import java.util.List;

public class IsAccount {
    static final String pathFile="src/w_database/users.dat";
    List<User> listUser= new FileWriteRead().readFile("src/w_database/users.dat");;
    public void checkAccountUser(String account, String password, String name, boolean role) {
        if (new CheckNameAcount().checkNameAccount(account)) {
            System.out.println("[❌] Tài khoản đã tồn tại. Vui lòng đăng ký lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new CRUD().add(listUser,new User(account,password,name,role),pathFile);
            System.out.println("[\uD83D\uDC4C] Đăng ký thành công. Mời đăng nhập vào hệ thống !!!");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        new Login().loginSystem();
    }
}
