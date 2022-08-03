package model;

import java.time.LocalDate;

public class StudentA00 extends Student{
    /** Toán*/
    private int math;
    /** Lý*/
    private int physics;
    /** Hóa*/
    private int chemistry;

    public StudentA00() {
    }

    public StudentA00(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
    }

    public StudentA00(String studentId, String name, String className, int age, boolean sex, String birthDate, String phone, String note, int math, int physics, int chemistry) {
        super(studentId, name, className, age, sex, birthDate, phone, note);
        this.math = math;
        this.physics = physics;
        this.chemistry = chemistry;
    }

    public int getMath() {
        return math;
    }

    public void setMath(int math) {
        this.math = math;
    }

    public int getPhysics() {
        return physics;
    }

    public void setPhysics(int physics) {
        this.physics = physics;
    }

    public int getChemistry() {
        return chemistry;
    }

    public void setChemistry(int chemistry) {
        this.chemistry = chemistry;
    }

    @Override
    public String toString() {
        return "StudenA00{" +
                "studentId='" + getStudentId() + '\'' +
                ", name='" + getName() + '\'' +
                ", className='" + getClassName() + '\'' +
                ", age=" + getAge() +
                ", sex=" + getSex() +
                ", birthDate=" + getBirthDate() +
                ", phone='" + getPhone() + '\'' +
                ", note='" + getNote() + '\'' +
                ", math='" + math + '\'' +
                ", physics='" + physics + '\'' +
                ", chemistry='" + chemistry + '\'' +
                '}'+"\n";
    }
}
