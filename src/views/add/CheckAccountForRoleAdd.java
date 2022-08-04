package views.add;

import controller.Manager;
import login.CheckNameAcount;
import model.User;
import storage.FileWriteRead;
import views.index.RunByAdmin;

import java.util.List;

public class CheckAccountForRoleAdd {

    static final String pathFile="src/w_database/users.dat";
    List<User> listUser= new FileWriteRead().readFile(pathFile);
    public void checkAccountUser(String account, String password, String name, boolean role) {
        if (new CheckNameAcount().checkNameAccount(account)) {
            System.err.println("[❌] Tài khoản đã tồn tại. Vui lòng thêm lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new Manager().add(listUser,new User(account,password,name,role),pathFile);
            System.out.println("[\uD83D\uDC4C] Thêm thành công");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        RunByAdmin.menuStaffManager();
    }
}
