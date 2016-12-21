package com.eshore;
import java.sql.Date;
import java.util.List;
public class TestFindRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Restaurant res=null;
//		try {
//			res= DAOFactory.getIEmpRestaurantDAOInstance().findByResId(1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//			System.out.println(res.getRes_id()+"　　　");
//			System.out.println(res.getRes_style()+"   ");
//			System.out.println(res.getRes_name()+"　　　");
//			System.out.println(res.getRes_addr_city());
//		}
		
//		List<Restaurant> res=null;
//		try {
//			res= DAOFactory.getIEmpRestaurantDAOInstance().findByCityAndKey("貧今","匯");
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		for(int i=0;i<res.size();i++){
//			System.out.println(res.get(i).getRes_id());
//		System.out.println("    ");
//		}
//	}
		
// boolean f=false;
// Restaurant res=null;
//		try {
//			f= DAOFactory.getIEmpRestaurantDAOInstance().updateResScore(1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		try {
//			res=DAOFactory.getIEmpRestaurantDAOInstance().findByResId(1);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(f);
//		System.out.println("    "+res.getRes_score());
//	}
		
//		List<Restaurant> res=null;
//		boolean f=false;
//		try {
//			f= DAOFactory.getIEmpRestaurantDAOInstance().addResCollect(100002, 2);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(f);
//	}
		List<Restaurant> res=null;
		boolean f=false;
		f=Message.isMobileNO("14121239580");
		System.out.println(f);
//		try {
//			f= DAOFactory.getIEmpRestaurantDAOInstance().addResMark(100000, 2,4);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(f);
//	}
		
//String city="beijing";
//List<Restaurant> res=null;
//try {
//	res= DAOFactory.getIEmpRestaurantDAOInstance().findByCity(city);
//} catch (Exception e) {
//	// TODO Auto-generated catch block
//	e.printStackTrace();
//}


//		Restaurant rest=new Restaurant();
//		rest.setRes_name("aaa");
//		rest.setRes_addr_city("beijing");
//		rest.setRes_addr_province("4");
//		rest.setRes_addr_street("JKDLFJLK");
//		rest.setRes_pic("dfjklj");
//		rest.setRes_average_cost(10);
//		rest.setRes_score(5);
//		rest.setRes_style("aaaa");
//		try {
//			DAOFactory.getIEmpRestaurantDAOInstance().addRestaurant(rest);
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
}
}
