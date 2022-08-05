package model;

import java.io.Serializable;

public class User implements Serializable {
    private String userId;
    private String passWord;
    private String name;
    private boolean role= false;

    public User() {
    }

    public User(String userId, String passWord, String name, boolean role) {
        this.userId = userId;
        this.passWord = passWord;
        this.name = name;
        this.role = role;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
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
                "userId='" + userId + '\'' +
                ", passWord='" + passWord + '\'' +
                ", name='" + name + '\'' +
                ", role=" + role +
                '}';
    }
}
