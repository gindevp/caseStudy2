package login;

import model.User;

import java.util.List;

public class CheckNameAcount {
    List<User> listUser= Login.listUser;
    public boolean checkNameAccount(String accountUser) {
        for (User account : listUser) {
            boolean checkAccountUser = accountUser.equals(account.getStaffId());
            if (checkAccountUser) {
                return true;
            }
        }
        return false;
    }

}
