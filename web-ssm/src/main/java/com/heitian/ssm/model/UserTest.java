package com.heitian.ssm.model;

/**
 * Created by He on 2018/1/21.
 */
public class UserTest {

    private long id;            //用户ID
    private String userName;    //用户名
    private int sex;            //性别
    private int age;            //年龄
    private String  birthday;   //生日

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getSex() {
        return sex;
    }

    public void setSex(int sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "UserTest{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", birthday='" + birthday + '\'' +
                '}';
    }
}
