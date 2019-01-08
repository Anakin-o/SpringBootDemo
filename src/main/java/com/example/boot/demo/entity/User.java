package com.example.boot.demo.entity;

import com.example.boot.demo.entity.BaseEntity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "demo_user")
public class User extends BaseEntity {

    private void outputName() {
        System.out.println("out");
    }
    private String userNameTest;

    public String getUserNameTest() {
        return userNameTest;
    }

    public void setUserNameTest(String userNameTest) {
        this.userNameTest = userNameTest;
    }
}
