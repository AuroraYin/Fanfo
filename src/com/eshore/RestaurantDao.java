package com.eshore;

import java.util.List;

public interface RestaurantDao {

	//��Ӳ͹���Ϣ
	 public boolean addRestaurant(Restaurant res)throws Exception ;
	
	//������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
	public List<Restaurant> findByScore()throws Exception;
	
	//���������йؼ��ְ�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
	public List<Restaurant> findByKey(String key)throws Exception;
	
	//������а�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
	public List<Restaurant> findByCity(String city)throws Exception;
	
	//�����ղ���id������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
	public List<Restaurant> findByCollectorId(int id)throws Exception;
	
	//�����û�id�����ղصĲ͹������ĳ��кͲ�ϵ
	public Restaurant findByUserId(int id)throws Exception;
	
	// ������кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
	public List<Restaurant> findByCityAndStyle(String city,String style)throws Exception;
	
	//�����û��ȵõ��ղصĲ͹������ĳ��кͲ�ϵ�����ݳ��кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
	public List<Restaurant> findByLike(int id)throws Exception;
	
	//����͹�id���ز͹����ơ�ͷͼ����ַ�����֡��Ƽ�ֵ
	public Restaurant findByResId(int id)throws Exception;
	
	//������м������йؼ��ַ��ز͹����ơ�ͷͼ��id����ַ����֡��Ƽ���
	public List<Restaurant> findByCityAndKey(String city,String key)throws Exception;

	//���²͹ݷ���
	public boolean updateResScore(int id)throws Exception;
	
	//����û��Ƿ����ղ�ĳ�͹�
	public boolean checkResCollect(int user_id,int res_id)throws Exception;
	
	//�û��ղ�ĳ�͹�
	public boolean addResCollect(int user_id,int res_id)throws Exception;
	
	//����û��Ƿ�Ϊĳ�͹ݴ��
	public boolean checkResMark(int user_id,int res_id)throws Exception;
	
	//�û�Ϊ�͹ݴ��
	public boolean addResMark(int user_id,int res_id,int mark)throws Exception;
}
