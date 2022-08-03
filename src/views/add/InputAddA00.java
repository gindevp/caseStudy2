package views.add;

import controller.StudentManager;
import model.Student;
import model.StudentA00;

import java.util.List;
import java.util.Scanner;

public class InputAddA00 {
    static Scanner scanner= new Scanner(System.in);
    static Scanner scanner1= new Scanner(System.in);

    public static void choiceA00(List studentList,String pathFile){
        System.out.println("Mời nhập mã sinh viên(A00-C06-E09):");
        String id = scanner1.nextLine();
        System.out.println("Mời nhập tên sinh viên(Họ-tên):");
        String name = scanner1.nextLine();
        System.out.println("Mời nhập tên lớp học(A-C-E):");
        String className= scanner1.nextLine();
        System.out.println("Mời nhập tuổi sinh viên(18->100):");
        int age = scanner.nextInt();
        System.out.println("Mời nhập giới tính sinh viên(nam-nữ):");
        String sex= scanner1.nextLine();
        boolean sexReal=false;
        if("nam".equals(sex)) sexReal=true;
        System.out.println("Mời nhập ngày tháng năm sinh của sinh viên(yyyy-mm-dd):");
        String date = scanner1.nextLine();
        System.out.println("Mời nhập số điện thoại của sinh viên:");
        String phone= scanner1.nextLine();
        System.out.println("Mời nhập ghi chú cho sinh viên:");
        String note= scanner1.nextLine();

        System.out.println("Mời nhập điểm toán(0->10):");
        int toan= scanner.nextInt();
        System.out.println("Mời nhập điểm lý(0->10):");
        int ly= scanner.nextInt();
        System.out.println("Mời nhập điểm Hoá(0->10):");
        int hoa= scanner.nextInt();
        Student students= new StudentA00(id,name,className,age,sexReal,date,phone,note,toan,ly,hoa);
        new StudentManager().add(studentList,students,pathFile);
        System.out.println("Thêm thành công");

    }
}
