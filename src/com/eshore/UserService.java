package com.eshore;

public class UserService implements UserDao{
	private DBConnection dbconn = null; // �������ݿ�������
	private UserDao dao = null; // ����DAO����
	// �ڹ��췽����ʵ�������ݿ����ӣ�ͬʱʵ����dao����
	public UserService() throws Exception { 
		this.dbconn = new DBConnection();
		this.dao = new UserDaoImpl(this.dbconn.getConnection());// ʵ����ProductDao��ʵ����
	}
	public boolean addUser(User user) throws Exception {
		boolean flag = false; // ��ʶ
		try {
			if (this.dao.findById(user.getId()) == null) {// ���Ҫ����Ĳ�Ʒ��Ų�����
				flag = this.dao.addUser(user);// ����һ����Ʒ��Ϣ
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
