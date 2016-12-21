package com.eshore;

import java.util.List;

public interface RestaurantDao {

	//添加餐馆信息
	 public boolean addRestaurant(Restaurant res)throws Exception ;
	
	//按分数顺序返回餐馆名称、图片、地址、id、推荐数
	public List<Restaurant> findByScore()throws Exception;
	
	//传入名称中关键字按分数顺序返回餐馆名称、图片、地址、id、推荐数
	public List<Restaurant> findByKey(String key)throws Exception;
	
	//传入城市按分数顺序返回餐馆名称、图片、地址、id、推荐数
	public List<Restaurant> findByCity(String city)throws Exception;
	
	//传入收藏者id按分数顺序返回餐馆名称、图片、地址、id、推荐数
	public List<Restaurant> findByCollectorId(int id)throws Exception;
	
	//传入用户id返回收藏的餐馆中最多的城市和菜系
	public Restaurant findByUserId(int id)throws Exception;
	
	// 传入城市和菜系按分数返回餐馆名称、头图、地址、id
	public List<Restaurant> findByCityAndStyle(String city,String style)throws Exception;
	
	//传入用户先得到收藏的餐馆中最多的城市和菜系，根据城市和菜系按分数返回餐馆名称、头图、地址、id
	public List<Restaurant> findByLike(int id)throws Exception;
	
	//传入餐馆id返回餐馆名称、头图、地址、评分、推荐值
	public Restaurant findByResId(int id)throws Exception;
	
	//传入城市及名称中关键字返回餐馆名称、头图、id、地址、打分、推荐数
	public List<Restaurant> findByCityAndKey(String city,String key)throws Exception;

	//更新餐馆分数
	public boolean updateResScore(int id)throws Exception;
	
	//检查用户是否已收藏某餐馆
	public boolean checkResCollect(int user_id,int res_id)throws Exception;
	
	//用户收藏某餐馆
	public boolean addResCollect(int user_id,int res_id)throws Exception;
	
	//检查用户是否为某餐馆打分
	public boolean checkResMark(int user_id,int res_id)throws Exception;
	
	//用户为餐馆打分
	public boolean addResMark(int user_id,int res_id,int mark)throws Exception;
}
