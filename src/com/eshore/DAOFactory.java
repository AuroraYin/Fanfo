package com.eshore;

public class DAOFactory {
	public static UserDao getIEmpUserDAOInstance()throws Exception {   
        return new UserService();//取得业务操作类   
    } 
	public static RestaurantDao getIEmpRestaurantDAOInstance()throws Exception
	{
		return new RestaurantService();
	}
}