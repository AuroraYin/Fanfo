package com.eshore;

import java.util.List;


public interface ArticleDao {
	 public boolean addArticle(Article article)throws Exception ;
	 
	 //��������id�������ӱ��⡢ͷͼ�����ݡ����ߡ����ߵȼ������ӵ��������Ķ���
	 public Article findById(int id)throws Exception;
	 
	 //������ʱ��˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findOrderByTime(String time)throws Exception;
	 
	 //��������+�Ķ���˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findOrderByRead(String supprot,String read)throws Exception;
	 
	 //���������йؼ��ְ�����ʱ��˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByNameOrderByTime(String name)throws Exception;
	 
	 //���������йؼ��ְ�������+�Ķ���˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByNameOrderByRead(String name)throws Exception;
	 
	 //������а�����ʱ��˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByCityOrderByTime(String city)throws Exception;
	 
	 //������а�������+�Ķ���˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByCityOrderByRead(String city)throws Exception;
	 
	 //�����ղ���id���ղ���˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByCollectorOrderByCollect(int id)throws Exception;
	 
	 //���뷢����id������ʱ��˳�򷵻��������ơ�ͷͼ�����ߡ��Ķ�������������id
	 public List<Article> findByPublisherOrderByTime(int id)throws Exception;
	 
	 
}
