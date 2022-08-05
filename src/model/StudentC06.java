package model;

import model.Student;

public class StudentC06 extends Student {
    /** Văn*/
    private int literature;
    /**Sinh*/
    private  int disciple;
    /**Anh*/
    private  int english;

    public StudentC06() {
    }

    public StudentC06(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
    }

    @Override
    public String classification() {
        int sum=literature*3+disciple*4+english*3;
        if(sum>=90){
            return "Xuất sắc";

        }else if(sum>=80){
            return  "Giỏi";
        }
        else if (sum>=75) {
            return "tiên tiến";
        } else if (sum>=50) {
            return "trung bình";
        }else if(sum>=30){
            return "khá";
        }else {
            return "kém";
        }
    }

    @Override
    public double avg() {
        int sum=this.getLiterature()*4+this.getDisciple()*3+this.getEnglish()*3;
        return sum/10;
    }

    public StudentC06(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note, int literature, int disciple, int english) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
        this.literature = literature;
        this.disciple = disciple;
        this.english = english;
    }

    public int getLiterature() {
        return literature;
    }

    public void setLiterature(int literature) {
        this.literature = literature;
    }

    public int getDisciple() {
        return disciple;
    }

    public void setDisciple(int disciple) {
        this.disciple = disciple;
    }

    public int getEnglish() {
        return english;
    }

    public void setEnglish(int english) {
        this.english = english;
    }

    @Override
    public String toString() {
        return "StudentC06{" +
                "studentId='" + getStudentId() + '\'' +
                ", name='" + getName() + '\'' +
                ", className='" + getClassName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", birthDate=" + getBirthDate() +
                ", phone='" + getPhone() + '\'' +
                ", note='" + getNote() + '\'' +
                ", literature='" + literature + '\'' +
                ", disciple='" + disciple + '\'' +
                ", english='" + english + '\'' +
                ", classification='" + classification() + '\'' +
                '}'+"\n";
    }
}
