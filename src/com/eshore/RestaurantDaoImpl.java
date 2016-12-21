package com.eshore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class RestaurantDaoImpl implements RestaurantDao {
	private Connection conn = null; // ���ݿ����Ӷ���
	private PreparedStatement pstmt = null; // ���ݿ��������
	// ͨ�����췽��ȡ�����ݿ�����
	public RestaurantDaoImpl(Connection conn) { 
		this.conn = conn;  
	}
		//��Ӳ͹���Ϣ
	//��Ӳ͹���Ϣ(yes)
		public boolean addRestaurant(Restaurant res)throws Exception 
		 {
			 	boolean flag = false; // �����ʶ
				String sql = "insert into Restaurant(res_name,res_addr_province,res_addr_city,res_addr_street,res_style,res_average_cost,res_pic) values(?,?,?,?,?,?,?)";
				this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
				this.pstmt.setString(1,res.getRes_name());
				this.pstmt.setString(2,res.getRes_addr_province());
				this.pstmt.setString(3,res.getRes_addr_city());
				this.pstmt.setString(4,res.getRes_addr_street());
				this.pstmt.setString(5,res.getRes_style());
				this.pstmt.setInt(6,res.getRes_average_cost());
				this.pstmt.setString(7,res.getRes_pic());
			
				if (this.pstmt.executeUpdate() > 0) { // ���¼�¼����������0
					flag = true; // �޸ı�ʶ
				}
				this.pstmt.close(); // �ر�PreparedStatement����
				return flag;
		 }
	
	//������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		
		//������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		public List<Restaurant> findByScore()throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}
		
		//���������йؼ��ְ�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		
		//���������йؼ��ְ�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		public List<Restaurant> findByKey(String key)throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant where res_name like ? order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setString(1,"%"+key+"%");
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}
		
		//������а�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		
		//������а�����˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		public List<Restaurant> findByCity(String city)throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant where res_addr_city=? order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setString(1, city);
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next() )
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}
		
		//�����ղ���id������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
	
		//�����ղ���id������˳�򷵻ز͹����ơ�ͼƬ����ַ��id���Ƽ���
		public List<Restaurant> findByCollectorId(int id)throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant join res_collect where collector_id=? and cres_id=res_id order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}
		
		//�����û�id�����ղصĲ͹������ĳ��кͲ�ϵ
	
		//�����û�id�����ղصĲ͹������ĳ��кͲ�ϵ
		public Restaurant findByUserId(int id)throws Exception
		{
			Restaurant res=new Restaurant();
			String sql="SELECT res_addr_city , COUNT(res_addr_city) AS count_res_city FROM restaurant join res_collect where collector_id=? and res_id=cres_id GROUP BY res_addr_city order by count_res_city desc limit 1";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
			ResultSet rs=this.pstmt.executeQuery();
			while(rs.next())
			{
				res.setRes_addr_city(rs.getString(1));
			}
			sql="SELECT res_style , COUNT(res_style) AS count_res_style FROM restaurant join res_collect where collector_id=? and res_id=cres_id GROUP BY res_style order by count_res_style desc limit 1";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
		    rs=this.pstmt.executeQuery();
			while(rs.next())
			{
				res.setRes_style(rs.getString(1));
			}
			this.pstmt.close();
			return res;
		}
		
		// ������кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id���Ƽ���
		
		// ������кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
		public List<Restaurant> findByCityAndStyle(String city,String style)throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant where res_addr_city=? and res_style like ? order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setString(1, city);
			this.pstmt.setString(2,"%"+style+"%");
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}
		
		//�����û��ȵõ��ղصĲ͹������ĳ��кͲ�ϵ�����ݳ��кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
		
		//�����û��ȵõ��ղصĲ͹������ĳ��кͲ�ϵ�����ݳ��кͲ�ϵ���������ز͹����ơ�ͷͼ����ַ��id
		public List<Restaurant> findByLike(int id)throws Exception
		{
			Restaurant res=new Restaurant();
			String sql="SELECT res_addr_city , COUNT(res_addr_city) AS count_res_city FROM restaurant join res_collect where collector_id=? and res_id=cres_id GROUP BY res_addr_city order by count_res_city desc limit 1";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
			ResultSet rs=this.pstmt.executeQuery();
			while(rs.next())
			{
				res.setRes_addr_city(rs.getString(1));
			}
			sql="SELECT res_style , COUNT(res_style) AS count_res_style FROM restaurant join res_collect where collector_id=? and res_id=cres_id GROUP BY res_style order by count_res_style desc limit 1";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
		    rs=this.pstmt.executeQuery();
			while(rs.next())
			{
				res.setRes_style(rs.getString(1));
			}
			List<Restaurant> rest=new ArrayList<Restaurant>();
			sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant where res_addr_city=? and res_style like ? order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setString(1, res.getRes_addr_city());
			this.pstmt.setString(2,"%"+res.getRes_style()+"%");
			rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				rest.add(restaurant);
			}
			this.pstmt.close();
			return rest;
		}
		
		//����͹�id���ز͹����ơ�ͷͼ����ַ�����֡��Ƽ�ֵ
		
		//����͹�id���ز͹����ơ�ͷͼ����ַ�����֡��Ƽ�ֵ
		public Restaurant findByResId(int id)throws Exception
		{
			Restaurant res=null;
			String sql = "select res_score,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num from restaurant where res_id=?";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1, id);
			ResultSet rs=this.pstmt.executeQuery();
			res=new Restaurant();
			if(rs.next())
			{
				res.setRes_score(rs.getDouble(1));
				res.setRes_name(rs.getString(2));
				res.setRes_addr_province(rs.getString(3));
				res.setRes_addr_city(rs.getString(4));
				res.setRes_addr_street(rs.getString(5));
				res.setRes_pic(rs.getString(6));
				res.setRes_refer_num(rs.getInt(7));
			}
			this.pstmt.close();
			return res;
		}
		
		//������м������йؼ��ַ��ز͹����ơ�ͷͼ��id����ַ����֡��Ƽ���
	
		//������м������йؼ��ַ��ز͹����ơ�ͷͼ��id����ַ����֡��Ƽ���
		public List<Restaurant> findByCityAndKey(String city,String key)throws Exception
		{
			List<Restaurant> res=new ArrayList<Restaurant>();
			String sql = "select res_id,res_name,res_addr_province,res_addr_city,res_addr_street,res_pic,res_refer_num,res_score from restaurant where res_addr_city=? and res_name like ? order by res_score desc";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setString(1, city);
			this.pstmt.setString(2, '%'+key+"%");
			ResultSet rs=this.pstmt.executeQuery();
			Restaurant restaurant=null;
			while(rs.next())
			{
				restaurant=new Restaurant();
				restaurant.setRes_id(rs.getInt(1));
				restaurant.setRes_name(rs.getString(2));
				restaurant.setRes_addr_province(rs.getString(3));
				restaurant.setRes_addr_city(rs.getString(4));
				restaurant.setRes_addr_street(rs.getString(5));
				restaurant.setRes_pic(rs.getString(6));
				restaurant.setRes_refer_num(rs.getInt(7));
				res.add(restaurant);
			}
			this.pstmt.close();
			return res;
		}

		//���²͹ݷ���
		
		//���²͹ݷ���
		public boolean updateResScore(int id)throws Exception
		{
			boolean flag=false;
			ArrayList<Integer> level=new ArrayList<Integer>();
			ArrayList<Integer> mark=new ArrayList<Integer>();
			int sumLevel=0;
			int sumMark=0;
			String sql="select user_level,res_mark from user join res_mark where marker_id=user_id and mres_id=?";
			this.pstmt=this.conn.prepareStatement(sql);
			this.pstmt.setInt(1, id);
			ResultSet rs=this.pstmt.executeQuery();
			while(rs.next())
			{ 
				int a=0,b=0;
				a=rs.getInt(1);
				b=rs.getInt(2);
				level.add(a);
				mark.add(b);
			}
			for(int i=0;i<level.size();i++)
			{
				sumLevel=sumLevel+level.get(i);
				level.set(i,level.get(i)*mark.get(i));
				sumMark=sumMark+level.get(i);
			}
			double m=(double)sumMark/(double)sumLevel;
			m=Math.round(m*10)/10.0;//����һλС��
			sql="update restaurant set res_score=? where res_id=?";
			this.pstmt=this.conn.prepareStatement(sql);
			this.pstmt.setDouble(1,m);
			this.pstmt.setInt(2,id);
			if(this.pstmt.executeUpdate()>0)
			{
				flag=true;
			}
			return flag;
		}
		
		//����û��Ƿ����ղ�ĳ�͹�
		
		//����û��Ƿ����ղ�ĳ�͹�
		public boolean checkResCollect(int user_id,int res_id)throws Exception
		{
			boolean flag = false; // �����ʶ
			String sql = "select collector_id,cres_id from res_collect where collector_id=? and cres_id=?";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1,user_id);
			this.pstmt.setInt(2,res_id);		
			ResultSet rs=this.pstmt.executeQuery();
			ResCollect rc=new ResCollect();
			while(rs.next())
			{
				rc.setCollector_id(rs.getInt(1));
				rc.setCres_id(rs.getInt(2));
			}
			if(rc.getCollector_id()==user_id && rc.getCres_id()==res_id)
				flag=true;
			this.pstmt.close(); // �ر�PreparedStatement����
			return flag;
		}
		
		//�û��ղ�ĳ�͹�
		
		//�û��ղ�ĳ�͹�
		public boolean addResCollect(int user_id,int res_id)throws Exception
		{
			boolean flag = false; // �����ʶ
			String sql = "insert into res_collect(cres_id,collector_id) values(?,?)";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1,res_id);
			this.pstmt.setInt(2, user_id);
			if (this.pstmt.executeUpdate() > 0) { // ���¼�¼����������0
				flag = true; // �޸ı�ʶ
			}
			this.pstmt.close(); // �ر�PreparedStatement����
			return flag;
		}
		
		//����û��Ƿ�Ϊĳ�͹ݴ��
		
		//����û��Ƿ�Ϊĳ�͹ݴ��
		public boolean checkResMark(int user_id,int res_id)throws Exception
		{
			boolean flag = false; // �����ʶ
			String sql = "select mres_id,marker_id from res_mark where marker_id=? and mres_id=?";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1,user_id);
			this.pstmt.setInt(2,res_id);		
			ResultSet rs=this.pstmt.executeQuery();
			ResMark rm=new ResMark();
			while(rs.next())
			{
				rm.setMresId(rs.getInt(1));
				rm.setMarkerId(rs.getInt(2));
			}
			if(rm.getMarkerId()==user_id && rm.getMresId()==res_id)
				flag=true;
			this.pstmt.close(); // �ر�PreparedStatement����
			return flag;
		}

		
		//�û�Ϊ�͹ݴ��
		public boolean addResMark(int user_id,int res_id,int mark)throws Exception
		{
			boolean flag = false; // �����ʶ
			GetDate gt=new GetDate();
			java.sql.Date date=gt.getCurrentTime();
			String sql = "insert into res_mark(mres_id,marker_id,res_mark_time,res_mark) values(?,?,?,?)";
			this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
			this.pstmt.setInt(1,res_id);
			this.pstmt.setInt(2, user_id);
			this.pstmt.setDate(3, date);
			this.pstmt.setInt(4, mark);
			if (this.pstmt.executeUpdate() > 0) { // ���¼�¼����������0
				flag = true; // �޸ı�ʶ
			}
			this.pstmt.close(); // �ر�PreparedStatement����
			return flag;
		}
}
