package com.eshore;

import java.util.List;


public interface ArticleDao {
	 public boolean addArticle(Article article)throws Exception ;
	 
	 //传入帖子id返回帖子标题、头图、内容、作者、作者等级、帖子点赞量、阅读量
	 public Article findById(int id)throws Exception;
	 
	 //按发布时间顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findOrderByTime(String time)throws Exception;
	 
	 //按点赞量+阅读量顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findOrderByRead(String supprot,String read)throws Exception;
	 
	 //传入名称中关键字按发布时间顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByNameOrderByTime(String name)throws Exception;
	 
	 //传入名称中关键字按点赞量+阅读量顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByNameOrderByRead(String name)throws Exception;
	 
	 //传入城市按发布时间顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByCityOrderByTime(String city)throws Exception;
	 
	 //传入城市按点赞量+阅读量顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByCityOrderByRead(String city)throws Exception;
	 
	 //传入收藏者id按收藏量顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByCollectorOrderByCollect(int id)throws Exception;
	 
	 //传入发布者id按发布时间顺序返回帖子名称、头图、作者、阅读量、点赞量、id
	 public List<Article> findByPublisherOrderByTime(int id)throws Exception;
	 
	 
}
