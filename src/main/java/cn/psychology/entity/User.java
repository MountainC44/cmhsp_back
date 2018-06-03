
package cn.psychology.entity;

import javax.persistence.*;

@Entity
@Table(name="user")
public class User {
    /*
     * ------------------------------------------------------------------------------------------------------------------
     * 用户表
     * ------------------------------------------------------------------------------------------------------------------
     * */
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer userid;
    //用户名
    private String username;
    //密码
    private String userpwd;
    //用户昵称
    private String usernickname;
    //性别
    private String sex;
    //地区
    private String region;
    //个性签名
    private String signature;
    //头像图片地址
    private String imageAddre;
    //用户注册时间
    private String userRegTime;

    //系统消息是否已读
    private int hasread;

    public String getUserpwd() {
        return userpwd;
    }

    public void setUserpwd(String userpwd) {
        this.userpwd = userpwd;
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsernickname() {
        return usernickname;
    }

    public void setUsernickname(String usernickname) {
        this.usernickname = usernickname;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getImageAddre() {
        return imageAddre;
    }

    public void setImageAddre(String imageAddre) {
        this.imageAddre = imageAddre;
    }

    public String getUserRegTime() {
        return userRegTime;
    }

    public void setUserRegTime(String userRegTime) {
        this.userRegTime = userRegTime;
    }

    public int getHasread() {
        return hasread;
    }

    public void setHasread(int hasread) {
        this.hasread = hasread;
    }
}

