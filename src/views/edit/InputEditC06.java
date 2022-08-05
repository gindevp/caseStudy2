package views.edit;

import controller.CRUD;
import controller.UserService;
import model.Student;
import model.StudentC06;

import java.util.List;
import java.util.Scanner;

public class InputEditC06 {
    static Scanner scanner= new Scanner(System.in);
    static Scanner scanner1= new Scanner(System.in);
    public static void editC06(List studentList,int index,String pathFile) {
        boolean regex=true;
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
        String phone;
        do {
            phone= scanner1.nextLine();
            regex= new UserService().validate("^[0-9]{10}$",phone);
        }while (!regex);
        System.out.println("Mời nhập ghi chú cho sinh viên:");
        String note= scanner1.nextLine();

        System.out.println("Mời nhập điểm Văn(0->10):");
        int toan= scanner.nextInt();
        System.out.println("Mời nhập điểm Sinh(0->10):");
        int ly= scanner.nextInt();
        System.out.println("Mời nhập điểm Anh(0->10):");
        int hoa= scanner.nextInt();
        Student students= new StudentC06(id,name,className,age,sexReal,date,phone,note,toan,ly,hoa);
        new CRUD().edit(index,studentList,students,pathFile);
        System.out.println("Sửa thành công");
    }
}
