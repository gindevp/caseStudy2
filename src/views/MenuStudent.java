package views;

import model.Student;

import java.util.List;

public class MenuStudent {
    public static void menuStudent(){
        System.out.println("\nDanh sách lựa chọn:");
        System.out.println("1: Thêm sinh viên\n2: Sửa sinh viên\n3: Xóa sinh viên\n4: Show list sinh viên\n5: Tính điểm trung bình các môn toàn khổi\n6: Trở lại lựa chọn trước đó\n0: Exit");
        System.out.println("Mời nhập lựa chọn:");
    }

    public static void listStudent(List<?> studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Index: "+i+" "+studentList.get(i));
        }
    }
}
