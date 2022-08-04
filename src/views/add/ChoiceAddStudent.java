package views.add;

import views.menuAndList.DisplayML;

import java.util.List;
import java.util.Scanner;

public class ChoiceAddStudent {

    static final int A00 = 1;
    static final int C06 = 2;
    static final int E09 = 3;
    static final int EXIT = 0;
    private static Scanner scanner = new Scanner(System.in);

    public static void addStudent(List studentList, String pathFile) {
        DisplayML.menuAdd();
        while (true) {
            int choice = scanner.nextInt();
            if (choice == A00) {
                InputAddA00.choiceA00(studentList,pathFile);
                break;
            } else if (choice == C06) {
                InputAddC06.choiceC06(studentList,pathFile);
                break;
            } else if (choice == E09) {
                InputAddE09.choiceE09(studentList,pathFile);
                break;
            } else if (choice == EXIT) {
                break;
            } else {
                System.err.println("[❌] Lựa chọn không tồn tại, mời bạn nhập lại !!!");
            }


        }

    }

}
