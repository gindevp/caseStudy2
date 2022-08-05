package login;

import model.User;
import storage.FileWriteRead;

import java.util.List;

public class CheckNameAcount {
    List<User> listUser= new FileWriteRead().readFile("src/w_database/users.dat");;
    public boolean checkNameAccount(String accountUser) {
        for (User account : listUser) {
            boolean checkAccountUser = accountUser.equals(account.getUserId());
            if (checkAccountUser) {
                return true;
            }
        }
        return false;
    }

}
