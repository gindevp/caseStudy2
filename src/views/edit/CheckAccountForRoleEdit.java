package views.edit;

import controller.Manager;
import login.CheckNameAcount;
import model.User;
import storage.FileWriteRead;
import views.index.RunByAdmin;

import java.util.List;

public class CheckAccountForRoleEdit {
    static final String pathFile="src/w_database/users.dat";
    List<User> listUser= new FileWriteRead().readFile(pathFile);
    public void checkAccountUser(int index,String account, String password, String name, boolean role) {
        if (new CheckNameAcount().checkNameAccount(account)) {
            System.err.println("[❌] Tài khoản đã tồn tại. Vui lòng sửa lại !!!");
            System.out.println("---------------------------------------");
        } else {
            new Manager().edit(index,listUser,new User(account,password,name,role),pathFile);
            System.out.println("[\uD83D\uDC4C] Xóa thành công");
            System.out.println("----------------------------------------");
            System.out.println();
        }
        RunByAdmin.menuStaffManager();
    }
}
