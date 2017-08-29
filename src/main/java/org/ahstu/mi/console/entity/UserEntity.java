package org.ahstu.mi.console.entity;

import java.io.Serializable;

/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 * 用户实体类
 */
public class UserEntity extends BaseEntity {
    private String id;
    private String userName;
    private String passWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
}
