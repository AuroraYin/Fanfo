package com.eshore;

public class TestInsertProduct {
	public static void main(String[] args){
		User user = null;
		try{
			for(int i=0;i<5;i++){
				user = new User();
				user.setName("1"+i);
				user.setPassword("h"+i);
				DAOFactory.getIEmpUserDAOInstance().addUser(user);
			}
		}catch(Exception e){
			e.printStackTrace();
			e.printStackTrace();
		}
	}
}