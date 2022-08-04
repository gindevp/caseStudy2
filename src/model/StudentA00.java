package model;

import model.Student;

public class StudentA00 extends Student {
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

    @Override
    public String classification(int sub,int sub0,int sub1) {
        int sum=sub*4+sub0*3+sub1*3;
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
                "classification='" + classification(math,physics,chemistry) + '\'' +
                '}'+"\n";
    }
}
