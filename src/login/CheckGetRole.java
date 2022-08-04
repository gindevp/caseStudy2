package login;

import model.User;

import java.util.List;

public class CheckGetRole {
    List<User> listUser= Login.listUser;
    public int getCheckRole(String account, String password, int checkRole) {
        try {
            for (User x : listUser
            ) {
                if (account.equals(x.getStaffId()) && password.equals(x.getPassWord())) {
                    if (x.isRole()) checkRole = 1;
                    else checkRole = 2;
                }

            }
        } catch (IndexOutOfBoundsException e) {
            System.out.println("[❌] Đăng nhập thất bại. Vui lòng đăng nhập lại !!!");
            System.out.println("-------------------------------------------------------");
            new Login().loginSystem();
        }
        return checkRole;
    }
}
