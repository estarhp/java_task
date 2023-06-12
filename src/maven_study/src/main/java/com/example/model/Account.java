package com.example.model;


import java.util.Date;

public class Account {
    private String id;
    private String name;

    private int money;

    private Date createTime;

    private Date updateTime;

    public String getId() {
        return id;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public int getMoney() {
        return money;
    }

    public String getName() {
        return name;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}

