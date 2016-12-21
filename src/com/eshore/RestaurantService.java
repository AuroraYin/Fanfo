package com.eshore;
import java.util.List;

public class RestaurantService implements RestaurantDao {
	private DBConnection dbconn = null; // 定义数据库连接类
	private RestaurantDao dao = null; // 声明DAO对象
	// 在构造方法中实例化数据库连接，同时实例化dao对象
	public RestaurantService() throws Exception { 
		this.dbconn = new DBConnection();
		this.dao = new RestaurantDaoImpl(this.dbconn.getConnection());// 实例化ProductDao的实现类
	}
	
	//添加餐馆信息
		 public boolean addRestaurant(Restaurant res)throws Exception 
		 {
			 boolean flag = false; // 标识
			 try
			 {
				 flag=this.dao.addRestaurant(res);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return flag;
		 }
		
		//按分数顺序返回餐馆名称、图片、地址、id、推荐数
		public List<Restaurant> findByScore()throws Exception
		{
			 List<Restaurant> res =null;
			 try
			 {
				 res=this.dao.findByScore();	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入名称中关键字按分数顺序返回餐馆名称、图片、地址、id、推荐数
		public List<Restaurant> findByKey(String key)throws Exception
		{
			 List<Restaurant> res =null;
			 try
			 {
				 res=this.dao.findByKey(key);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入城市按分数顺序返回餐馆名称、图片、地址、id、推荐数
		public List<Restaurant> findByCity(String city)throws Exception
		{
			 List<Restaurant> res =null;
			 try
			 {
				 res=this.dao.findByCity(city);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入收藏者id按分数顺序返回餐馆名称、图片、地址、id、推荐数
		public List<Restaurant> findByCollectorId(int id)throws Exception
		{
			 List<Restaurant> res =null;
			 try
			 {
				 res=this.dao. findByCollectorId(id);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入用户id返回收藏的餐馆中最多的城市和菜系
		public Restaurant findByUserId(int id)throws Exception
		{
			 Restaurant res =null;
			 try
			 {
				 res=this.dao. findByUserId(id);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		// 传入城市和菜系按分数返回餐馆名称、头图、地址、id
		public List<Restaurant> findByCityAndStyle(String city,String style)throws Exception
		{
			List<Restaurant> res =null;
			 try
			 {
				 res=this.dao. findByCityAndStyle(city,style);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入用户先得到收藏的餐馆中最多的城市和菜系，根据城市和菜系按分数返回餐馆名称、头图、地址、id
		public List<Restaurant> findByLike(int id)throws Exception
		{
			List<Restaurant> res =null;
			 try
			 {
				 res=this.dao. findByLike(id);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入餐馆id返回餐馆名称、头图、地址、评分、推荐值
		public Restaurant findByResId(int id)throws Exception
		{
			Restaurant res =null;
			 try
			 {
				 res=this.dao. findByResId(id);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}
		
		//传入城市及名称中关键字返回餐馆名称、头图、id、地址、打分、推荐数
		public List<Restaurant> findByCityAndKey(String city,String key)throws Exception
		{
			List<Restaurant> res =null;
			 try
			 {
				 res=this.dao.  findByCityAndKey(city,key);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return res;
		}

		//更新餐馆分数
		public boolean updateResScore(int id)throws Exception
		{
			 boolean flag = false; // 标识
			 try
			 {
				 flag=this.dao.updateResScore(id);	
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }
			 return flag;
		}

		//检查用户是否已收藏某餐馆
		public boolean checkResCollect(int user_id,int res_id)throws Exception
		{
			boolean flag=false;
			 try
			 {
				 flag=this.dao.checkResCollect(user_id, res_id);
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }	
		    return flag;
		}

		//用户收藏某餐馆
		public boolean addResCollect(int user_id,int res_id)throws Exception
		{
			boolean flag=false;
			try{
				if(this.dao.checkResCollect(user_id, res_id)==false)//如果用户未收藏该餐馆
					flag=this.dao.addResCollect(user_id, res_id);
			}catch(Exception e)
			{
				throw e;
			}finally
			{
				this.dbconn.close();
			}
			return flag;
		}
		
		//检查用户是否为某餐馆打分
		public boolean checkResMark(int user_id,int res_id)throws Exception
		{
			boolean flag=false;
			 try
			 {
				 flag=this.dao.checkResMark(user_id, res_id);
			 }catch(Exception e)
			 {
				 throw e;
			 }finally
			 {
				 this.dbconn.close();
			 }	
		    return flag;
		}
		
		//用户为餐馆打分
		public boolean addResMark(int user_id,int res_id,int mark)throws Exception
		{
			boolean flag=false;
			try{
				if(this.dao.checkResMark(user_id, res_id)==false)//如果用户未替餐馆打分
					flag=this.dao.addResMark(user_id, res_id,mark);
			}catch(Exception e)
			{
				throw e;
			}finally
			{
				this.dbconn.close();
			}
			return flag;
		}
}
