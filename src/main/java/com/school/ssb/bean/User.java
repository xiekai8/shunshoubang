package com.school.ssb.bean;

import java.sql.Timestamp;
import java.util.Date;

public class User {
    private Long id;

    private String username;

    private String password;

    private Integer userSex;

    private String nickName;

    private Timestamp cerateTime;

    private Timestamp updateTime;

    private Integer flag;

    private String imgSrc;

    public String getImgSrc() {
        return imgSrc;
    }

    public void setImgSrc(String imgSrc) {
        this.imgSrc = imgSrc;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Integer getFlag() {

        return flag;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName == null ? null : nickName.trim();
    }

    public Date getCerateTime() {
        return cerateTime;
    }

    public void setCerateTime(Timestamp cerateTime) {
        this.cerateTime = cerateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }

    public User(String username, String password, String nickName) {
        this.username = username;
        this.password = password;
        this.nickName = nickName;
    }

    public User(Long id, String username, String password, Integer userSex, String nickName, Timestamp cerateTime, Timestamp updateTime, Integer flag,String imgSrc) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
        this.cerateTime = cerateTime;
        this.updateTime = updateTime;
        this.flag = flag;
        this.imgSrc = imgSrc;
    }
}