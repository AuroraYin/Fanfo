package com.eshore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

	private Connection conn = null; // ���ݿ����Ӷ���
	private PreparedStatement pstmt = null; // ���ݿ��������
	// ͨ�����췽��ȡ�����ݿ�����
	public UserDaoImpl(Connection conn) { 
		this.conn = conn;  
	}
	public boolean addUser(User user) throws Exception {
		boolean flag = false; // �����ʶ
		String sql = "insert into user(user_name,user_password) values(?,?)";
		this.pstmt = this.conn.prepareStatement(sql);// ʵ����PrepareStatement����
		this.pstmt.setString(1,user.getName());// ���ò�Ʒid
		this.pstmt.setString(2,user.getPassword());// ���ò�Ʒ����
		
		if (this.pstmt.executeUpdate() > 0) { // ���¼�¼����������0
			flag = true; // �޸ı�ʶ
		}
		this.pstmt.close(); // �ر�PreparedStatement����
		return flag;
	}
	public User findById(int id) throws Exception {
		User user = null;
		String sql = "select user_experience , user_level , user_money, user_name from user where user_id=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id); // ���ò�Ʒ���
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			user = new User();
			user.setExperience(rs.getInt(1));
			user.setLevel(rs.getInt(2));
			user.setMoney(rs.getInt(3));
			user.setName(rs.getString(4));
		}
		this.pstmt.close();
		return user; // �����ѯ��������򷵻�null,Ĭ��ֵΪnull
	}
}
