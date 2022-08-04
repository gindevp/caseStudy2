package views.remove;

import controller.Manager;

import java.util.List;
import java.util.Scanner;

public class RemoveStudent {
    public static void choiceRemove(List studentList, String pathFile) {
        System.out.println("Mời nhập index của sinh viên cần xóa:");
        Scanner scanner= new Scanner(System.in);
        int index= scanner.nextInt();
        new Manager().remove(index,studentList,pathFile);
        System.out.println("Xóa thành công");
    }
}
