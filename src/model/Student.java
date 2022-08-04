package model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public abstract class Student implements Serializable{
    private String studentId;
    private String name;
    private String className;
    private int age;
    private boolean sex;
    private LocalDate birthDate;
    private String phone;
    private String note;

    public Student() {
    }

    public Student(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note) {
        this.studentId = studentId;
        this.name = name;
        this.className = className;
        this.age = age;
        this.sex = sex;
        this.birthDate = LocalDate.parse(birthDate);
        this.phone = phone;
        this.note = note;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    String getSex() {
        String sex;
        if (isSex()) sex = "Nam";
        else sex = "Nữ";
        return sex;
    }
public abstract String classification(int subject,int subject0, int subject2);
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", className='" + className + '\'' +
                ", age=" + age +
                ", sex=" + getSex() +
                ", birthDate=" + birthDate +
                ", phone='" + phone + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
