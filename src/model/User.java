package model;

import java.io.Serializable;

public class User implements Serializable {
    private String staffId;
    private String passWord;
    private String name;
    private boolean role= false;

    public User() {
    }

    public User(String staffId, String passWord, String name, boolean role) {
        this.staffId = staffId;
        this.passWord = passWord;
        this.name = name;
        this.role = role;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isRole() {
        return role;
    }

    public void setRole(boolean role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "User{" +
                "staffId='" + staffId + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
