package model;

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
                '}'+"\n";
    }
}
