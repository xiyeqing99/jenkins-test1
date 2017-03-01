package dao;

import model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by xiyeqing on 2017-二月-24.
 */
public class UserDao {
    String name;
    String age;
    String sex;
    String address;

     List findUser(){
         List lst = new ArrayList();
         lst.add("aaa");
         lst.add("bbb");
         lst.add("ccc");
         lst.add("ddd");
         lst.add("eee");
         return lst;
     }

    public User findUser(int id){
        User user = new User();
        return user;
    }


    public boolean saveUser(User user){

        System.out.println("saveUser 成功");
        return true;
    }

    public int getKey(){
        return 1;
    }

    public  String getValue(){
        return "1";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
