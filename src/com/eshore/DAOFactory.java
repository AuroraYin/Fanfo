package com.eshore;

public class DAOFactory {
	public static UserDao getIEmpUserDAOInstance()throws Exception {   
        return new UserService();//ȡ��ҵ�������   
    } 
	public static RestaurantDao getIEmpRestaurantDAOInstance()throws Exception
	{
		return new RestaurantService();
	}
}