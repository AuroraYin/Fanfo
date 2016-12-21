package com.eshore;
import java.util.List;

public class RestaurantService implements RestaurantDao {
	private DBConnection dbconn = null; // �������ݿ�������
	private RestaurantDao dao = null; // ����DAO����
	// �ڹ��췽����ʵ�������ݿ����ӣ�ͬʱʵ����dao����
	public RestaurantService() throws Exception { 
		this.dbconn = new DBConnection();
		this.dao = new RestaurantDaoImpl(this.dbconn.getConnection());// ʵ����ProductDao��ʵ����
	}
	
	//��Ӳ͹���Ϣ
		 public boolean addRestaurant(Restaurant res)throws Exception 
		 {
			 boolean flag = false; // ��ʶ
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
		
		//������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
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
		
		//���������йؼ��ְ�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
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
		
		//������а�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
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
		
		//�����ղ���id������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
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
		
		//�����û�id�����ղصĲ͹������ĳ��кͲ�ϵ
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
		
		// ������кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
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
		
		//�����û��ȵõ��ղصĲ͹������ĳ��кͲ�ϵ�����ݳ��кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
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
		
		//����͹�id���ز͹����ơ�ͷͼ����ַ�����֡��Ƽ�ֵ
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
		
		//������м������йؼ��ַ��ز͹����ơ�ͷͼ��id����ַ����֡��Ƽ���
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

		//���²͹ݷ���
		public boolean updateResScore(int id)throws Exception
		{
			 boolean flag = false; // ��ʶ
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

		//����û��Ƿ����ղ�ĳ�͹�
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

		//�û��ղ�ĳ�͹�
		public boolean addResCollect(int user_id,int res_id)throws Exception
		{
			boolean flag=false;
			try{
				if(this.dao.checkResCollect(user_id, res_id)==false)//����û�δ�ղظò͹�
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
		
		//����û��Ƿ�Ϊĳ�͹ݴ��
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
		
		//�û�Ϊ�͹ݴ��
		public boolean addResMark(int user_id,int res_id,int mark)throws Exception
		{
			boolean flag=false;
			try{
				if(this.dao.checkResMark(user_id, res_id)==false)//����û�δ��͹ݴ��
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
