package com.eshore;

public interface UserDao {

    public boolean addUser(User user)throws Exception ;     
    //传入用户id返回经验值、等级、美食币、用户名
    public User findById(int id)throws Exception;     
}
