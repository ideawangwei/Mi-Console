package org.ahstu.mi.console.entity;


/**
 * Created by xiezg@317hu.com on 2017/8/29 0029.
 * 用户实体类
 */
public class UserEntity extends BaseEntity {
    private String id;

    /**
     * 用户英文名称
     */
    private String enName;

    /**
     * 用户中文名称
     */
    private String cnName;

    /**
     * 性别
     */
    private String sex;

    /**
     * 用户登录密码
     */
    private String passWord;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCnName() {
        return cnName;
    }

    public void setCnName(String cnName) {
        this.cnName = cnName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getEnName() {
        return enName;
    }

    public void setEnName(String enName) {
        this.enName = enName;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
