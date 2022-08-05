package model;

import model.Student;

public class StudentE09 extends Student {
    /**Vẽ*/
    private int art;
    /**Địa*/
    private int geography;
    /**lich sử*/
    private int history;

    public StudentE09() {
    }

    public StudentE09(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
    }

    @Override
    public String classification() {
        int sum=art*3+geography*3+history*4;
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
        int sum=this.getArt()*4+this.getGeography()*3+this.getHistory()*3;
        return sum/10;
    }

    public StudentE09(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note, int art, int geography, int history) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
        this.art = art;
        this.geography = geography;
        this.history = history;
    }

    public int getArt() {
        return art;
    }

    public void setArt(int art) {
        this.art = art;
    }

    public int getGeography() {
        return geography;
    }

    public void setGeography(int geography) {
        this.geography = geography;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    @Override
    public String toString() {
        return "StudentE09{" +
                "studentId='" + getStudentId() + '\'' +
                ", name='" + getName() + '\'' +
                ", className='" + getClassName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", birthDate=" + getBirthDate() +
                ", phone='" + getPhone() + '\'' +
                ", note='" + getNote() + '\'' +
                ", art='" + art + '\'' +
                ", geography='" + geography + '\'' +
                ", history='" + history + '\'' +
                ", classification='" + classification() + '\'' +
                '}'+"\n";
    }
}
