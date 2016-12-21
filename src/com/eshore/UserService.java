package com.eshore;

public class UserService implements UserDao{
	private DBConnection dbconn = null; // 定义数据库连接类
	private UserDao dao = null; // 声明DAO对象
	// 在构造方法中实例化数据库连接，同时实例化dao对象
	public UserService() throws Exception { 
		this.dbconn = new DBConnection();
		this.dao = new UserDaoImpl(this.dbconn.getConnection());// 实例化ProductDao的实现类
	}
	public boolean addUser(User user) throws Exception {
		boolean flag = false; // 标识
		try {
			if (this.dao.findById(user.getId()) == null) {// 如果要插入的产品编号不存在
				flag = this.dao.addUser(user);// 新增一条产品信息
			}
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbconn.close();
		}
		return flag;
	}
	
	public User findById(int id) throws Exception {
		User user = null;
		try {
			user = this.dao.findById(id);
		} catch (Exception e) {
			throw e;
		} finally {
			this.dbconn.close();
		}
		return user;
	}
}
