package storage;

import model.*;

import java.io.*;
import java.util.List;

public class FileWriteRead implements IOUploadFile {

    @Override
    public void writeFile(List list, String pathFile) {
        try {
            FileOutputStream fos = new FileOutputStream(pathFile);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(list);
            fos.close();
            oos.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List readFile(String pathFile) {
        try {
            FileInputStream fis = new FileInputStream(pathFile);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Object ob = ois.readObject();
            List list = (List) ob;
            ois.close();
            fis.close();
            return list;
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


//    public static void main(String[] args) {
//                 FileWriteRead fileWriteRead= new FileWriteRead();
//         List <Student> students= (List<Student>) fileWriteRead.readFile("students.dat");
//                  List<Student> students= new ArrayList<>();
//                students.add(new StudentA00("A00_1","Nguyen Huu Quyet","A1", 18,true,"2001-09-07","0393883210","Chăm học ngoan ngoãn :)) ",9,9,9));
//                students.add(new StudentA00("A00_2","Nguyen Van Minh","A1", 18,false,"1999-08-07","0393883210","Năng động tích cực ",8,9,9));
//                students.add(new StudentA00("A00_3","Ngo Minh Hieu","A1", 18,true,"1997-08-25","0393883210","Thông minh, ham học hỏi ",7,9,8));
//                students.add(new StudentE09("E09_1","Nguyen Duc Anh","E1", 18,false,"2003-09-17","0393883210","Chăm chỉ siêng năng ",6,9,6));
//                students.add(new StudentE09("E09_2","Nguyen Xuan Hoa","E1", 18,false,"2002-08-25","0393883210","Cần cù bù siêng năng :)  ",9,4,8));
//                students.add(new StudentE09("E09_3","Nguyen Hoa An","E1", 18,true,"2001-09-02","0393883210","Ở xã hội này chỉ có làm  ",3,5,3));
//                students.add(new StudentC06("C06_1","Nguyen Van Nhan","C1", 18,false,"2001-07-09","0393883210","Thì mới có ăn, những cái bọn  ",4,6,9));
//                students.add(new StudentC06("C06_2","Nguyen Huu Long","C1", 18,true,"2000-09-01","0393883210","K làm mà đòi có ăn chỉ có ăn c ăn ...  ",5,5,4));
//                students.add(new StudentC06("C06_3","Nguyen Huu Trang","C1", 18,true,"1999-09-09","0393883210","Chăm học ngoan ngoãn :)) ",7,5,3));
//                FileWriteRead fileWriteRead= new FileWriteRead();
//                fileWriteRead.writeFile(students,"students.dat");
////
//                System.out.println(students);
//
//                Student student1= new StudentC06("C06_3","Nguyen Huu Trang","C1", 18,true,"1999-09-09","0393883210","Chăm học ngoan ngoãn :)) ",7,5,3);
//                StudentManager studentManager= new StudentManager();
//                studentManager.add(students,student1,"students.dat");
//
//                fileWriteRead.writeFile(students,"students.dat");
//                students= (List<Student>) fileWriteRead.readFile("students.dat");
//                System.out.println(students);
//    }


}
