package views.remove;

import controller.CRUD;
import controller.UserService;
import model.User;
import storage.FileWriteRead;

import java.util.List;
import java.util.Scanner;

public class RemoveUser {
    static final String pathFile="src/w_database/users.dat";
    List<User> listUser= new FileWriteRead().readFile(pathFile);
    public void removeUser() {
        Scanner scanner= new Scanner(System.in);
        System.out.println("┎───────────────────[XÓA NHÂN VIÊN]─────────────────┒");
        System.out.println("[\uD83D\uDD11] Mời bạn nhập mã nhân viên cần xóa:");
        System.out.println("-----------------------------------------------------");
        String id = scanner.nextLine();
        int indexRemove=new UserService().checkIndex(listUser,id);
        new CRUD().remove(indexRemove,listUser,pathFile);
        System.out.println("Xóa Thành Công");
    }
}
