package login;

import model.User;
import storage.FileWriteRead;
import views.menuAndList.DisplayML;

import java.util.List;
import java.util.Scanner;

public class Login {
    Scanner scanner = new Scanner(System.in);
    static List<User> listUser = new FileWriteRead().readFile("src/w_database/users.dat");
    public static void main(String[] args) {
//        List<User> userList= new ArrayList<>();
//        userList.add(new User("01","123456","Quyết",true));
//        userList.add(new User("02","123456","ĐẠt",false));
//        userList.add(new User("03","123456","Huyền",false));
//        userList.add(new User("04","123456","Minh",false));
//        new FileWriteRead().writeFile(userList,"users.dat");
//        System.out.println(new FileWriteRead().readFile("users.dat"));
        Login login = new Login();
        login.choiceLogin();
    }
    public void choiceLogin() throws NumberFormatException {
        do {
            DisplayML.menuLogin();
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    loginManager();
                    break;
                case 2:
                    new RegisterUser().registerAccountUser();
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
    void loginManager() {
        try {
            System.out.println("┎──────────────[ĐĂNG NHẬP]──────────────┒");
            System.out.print("┠ ▹ Nhập tài khoản: ");
            String account = scanner.nextLine();
            System.out.print("┠ ▹ Nhập mật khẩu: ");
            String password = scanner.nextLine();
            System.out.println("┖───────────────────────────────────────┚");
            CheckAccountForRole.checkAccount(account, password);
        } catch (Exception e) {
            e.getMessage();
        }
    }
    void loginSystem() {
        try {
            choiceLogin();
        } catch (Exception e) {
            System.out.println("[❌] Bạn đã nhập sai dữ liệu! Vui lòng nhập lại!");
            System.out.println("---------------------------------------------------");
            loginSystem();
        }
    }


}
