package com.eshore;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserDaoImpl implements UserDao {

	private Connection conn = null; // 数据库连接对象
	private PreparedStatement pstmt = null; // 数据库操作对象
	// 通过构造方法取得数据库连接
	public UserDaoImpl(Connection conn) { 
		this.conn = conn;  
	}
	public boolean addUser(User user) throws Exception {
		boolean flag = false; // 定义标识
		String sql = "insert into user(user_name,user_password) values(?,?)";
		this.pstmt = this.conn.prepareStatement(sql);// 实例化PrepareStatement对象
		this.pstmt.setString(1,user.getName());// 设置产品id
		this.pstmt.setString(2,user.getPassword());// 设置产品名称
		
		if (this.pstmt.executeUpdate() > 0) { // 更新记录的行数大于0
			flag = true; // 修改标识
		}
		this.pstmt.close(); // 关闭PreparedStatement操作
		return flag;
	}
	public User findById(int id) throws Exception {
		User user = null;
		String sql = "select user_experience , user_level , user_money, user_name from user where user_id=?";
		this.pstmt = this.conn.prepareStatement(sql);
		this.pstmt.setInt(1, id); // 设置产品编号
		ResultSet rs = this.pstmt.executeQuery();
		if (rs.next()) {
			user = new User();
			user.setExperience(rs.getInt(1));
			user.setLevel(rs.getInt(2));
			user.setMoney(rs.getInt(3));
			user.setName(rs.getString(4));
		}
		this.pstmt.close();
		return user; // 如果查询不到结果则返回null,默认值为null
	}
}
