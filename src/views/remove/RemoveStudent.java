package views.remove;

import controller.StudentManager;

import java.util.List;
import java.util.Scanner;

public class RemoveStudent {
    public static void choiceRemove(List studentList, String pathFile) {
        System.out.println("Mời nhập index của sinh viên cần xóa:");
        Scanner scanner= new Scanner(System.in);
        int index= scanner.nextInt();
        new StudentManager().remove(index,studentList,pathFile);
        System.out.println("Xóa thành công");
    }
}
