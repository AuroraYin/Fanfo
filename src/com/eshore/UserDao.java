package com.eshore;

public interface UserDao {

    public boolean addUser(User user)throws Exception ;     
    //�����û�id���ؾ���ֵ���ȼ�����ʳ�ҡ��û���
    public User findById(int id)throws Exception;     
}
