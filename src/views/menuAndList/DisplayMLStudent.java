package views.menuAndList;

import java.util.List;

public class DisplayMLStudent {
    public static void menuStudent(){
        System.out.println("╔============================================================╗");
        System.out.println("║              ▂ ▃ ▅ ▆ █ HỆ THỐNG ADMIN █ ▆ ▅ ▃ ▂            ║");
        System.out.println("╠============================================================╣");
        System.out.println("║>[1]. Thêm sinh viên                                        ║");
        System.out.println("║>[2]. Sửa sinh viên                                         ║");
        System.out.println("║>[3]. Xóa sinh viên                                         ║");
        System.out.println("║>[4]. Hiển thị sinh viên                                    ║");
        System.out.println("║>[5]. Tính điểm trung bình các môn toàn khối                ║");
        System.out.println("║>[0]. Đăng xuất                                             ║");
        System.out.println("╚============================================================╝");
        System.out.println("Mời nhập lựa chọn:");
    }
    public static void listStudent(List studentList) {
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("Index: "+i+" "+studentList.get(i).toString());
        }
    }
    public static void menuAdd() {
        System.out.println("╔===========================================╗");
        System.out.println("║     ▂ ▃ ▅ ▆ █ THÊM SẢN PHẨM  █ ▆ ▅ ▃ ▂    ║");
        System.out.println("╠===========================================╣");
        System.out.println("║>[1]. Khối A00                             ║");
        System.out.println("║>[2]. Khối C06                             ║");
        System.out.println("║>[3]. Khối E09                             ║");
        System.out.println("║>[0]. Trở lại lựa chọn trước đó            ║");
        System.out.println("╚===========================================╝");
        System.out.println("Mời nhập lựa chọn:");
    }
}
