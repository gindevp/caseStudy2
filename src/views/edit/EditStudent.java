package views.edit;

import model.StudentA00;
import model.StudentC06;

import java.util.List;
import java.util.Scanner;

public class EditStudent {
    static Scanner scanner= new Scanner(System.in);
    public static void editStudent(List studentList, String pathFile) {
        System.out.println("Mời nhập index của sinh viên cần sửa:");
        int index= scanner.nextInt();
        if(studentList.get(index) instanceof StudentA00){
            InputEditA00.editA00(studentList,index,pathFile);
        } else if (studentList.get(index) instanceof StudentC06) {
            InputEditC06.editC06(studentList,index,pathFile);
        }else {
            InputEditE09.editE09(studentList,index,pathFile);
        }
    }
}
