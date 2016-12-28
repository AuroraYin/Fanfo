<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page  import="java.util.*,com.eshore.Article"%>
<!DOCTYPE html>
<html>
<head>
<title>Blog_Single</title>
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="js/jquery.min.js"></script>
<!-- Custom Theme files -->
<!--menu-->
<script src="js/scripts.js"></script>
<link href="css/styles.css" rel="stylesheet">
<!--//menu-->
<!--theme-style-->
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Real Home  Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>

</head>
<body>

 <% 
  		 Article list = (Article)session.getAttribute("article");
%>
<div class="header">
	<div class="container">
		<!--logo-->
			<a href="home.html"><img src="images/title_fanfo.jpg" width="130" ></a>
		<!--//logo-->
		<div class="top-nav">
			<ul class="right-icons">
				<li><a  href="login.html"><i class="glyphicon glyphicon-user"> </i>My account</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i> </a></li>
				
			</ul>
			</div>
		<div class="clearfix"> </div>
			<!---pop-up-box---->
				    
				<link href="css/popuo-box.css" rel="stylesheet" type="text/css" media="all"/>
				<script src="js/jquery.magnific-popup.js" type="text/javascript"></script>
			<!---//pop-up-box---->
				<div id="small-dialog" class="mfp-hide">
					    <!----- tabs-box ---->
				<div class="sap_tabs">	
				     <div id="horizontalTab" style="display: block; width: 100%; margin: 0px;">
						  <ul class="resp-tabs-list">
						  	  <li class="resp-tab-item " aria-controls="tab_item-0" role="tab"><span>全部</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>帖子</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>作者</span></li>
							  <div class="clearfix"></div>
						  </ul>				  	 
						  <div class="resp-tabs-container">
						  		<h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>全部</h2><div class="tab-1 resp-tab-content resp-tab-content-active" aria-labelledby="tab_item-0" style="display:block">
								 	<div class="facts">
									  	<div class="login">
											<input type="text" value="Search Address, Neighborhood, City or Zip" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">		
									 		<input type="submit" value="">
									 	</div>        
							        </div>
						  		</div>
							     <h2 class="resp-accordion" role="tab" aria-controls="tab_item-1"><span class="resp-arrow"></span>帖子</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-1">
									<div class="facts">									
										<div class="login">
											<input type="text" value="Search Address, Neighborhood, City or Zip" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">		
									 		<input type="submit" value="">
									 	</div> 
							        </div>	
								 </div>									
							      <h2 class="resp-accordion" role="tab" aria-controls="tab_item-2"><span class="resp-arrow"></span>作者</h2><div class="tab-1 resp-tab-content" aria-labelledby="tab_item-2">
									 <div class="facts">
										<div class="login">
											<input type="text" value="Search Address, Neighborhood, City or Zip" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search Address, Neighborhood, City or Zip';}">		
									 		<input type="submit" value="">
									 	</div> 
							         </div>	
							    </div>
					      </div>
					 </div>
					 <script src="js/easyResponsiveTabs.js" type="text/javascript"></script>
				    	<script type="text/javascript">
						    $(document).ready(function () {
						        $('#horizontalTab').easyResponsiveTabs({
						            type: 'default', //Types: default, vertical, accordion           
						            width: 'auto', //auto or any width like 600px
						            fit: true   // 100% fit in a container
						        });
						    });
			  			 </script>	
				</div>
				</div>
				 <script>
						$(document).ready(function() {
						$('.popup-with-zoom-anim').magnificPopup({
							type: 'inline',
							fixedContentPos: false,
							fixedBgPos: true,
							overflowY: 'auto',
							closeBtnInside: true,
							preloader: false,
							midClick: true,
							removalDelay: 300,
							mainClass: 'my-mfp-zoom-in'
						});
																						
						});
				</script>
					
	
		</div>
		<div class="clearfix"> </div>
		</div>	
</div>   		
	</div>
</div>-->
<!--//header-->
<!--blog-->
<div class="blog">
<div class="container">
   <div class="col-md-9 blog-head">
	     <div class="blog-top">
	        <img src="images/art1.jpg" class="img-responsive" alt=""/>
	          <h4>一个人的旅行之：2016国庆潮汕觅.食记</h4>
	         <h5>Posted By : <a href="#">Ipsum</a> | Date : 03-03-2015</h5>
	           <p><%= list.getArt_content() %></p>
	           <div class="links">
		  		  <ul class="blog-links">
		  			<li><a href="#"><i class="blog_circle">24 </i><span>评论</span></a></li>
		  			<li><a href="#"><i class="glyphicon glyphicon-heart"> </i><span>收藏</span></a></li>
					<li><a href="#"><i class="blog_circle">* </i><span>打赏</span></a></li>
		  		  </ul>
		  	   </div>
		 </div> 
		 <!---->
			<div class="single-grid">
				<h5>Our Comment</h5>
				 <div class="media">
		          <div class="media-left">
		            <a href="#">
		            	<img class="media-object" src="images/av.png" alt="" />
		            </a>
		          </div>
		          <div class="media-body">
		            <h4 class="media-heading">鱼饺店</h4>
		              <p> 很好找，就在住的酒店楼下斜对面的街口，只是这个店的名字我始终记不住，总想起一个叫“文曲星”的东西。</p>
		          </div>
		        </div>
      			<div class="media">
		          <div class="media-left">
		            <a href="#">
		            	<img class="media-object" src="images/av.png" alt="" />
		            </a>
		          </div>
		          <div class="media-body">
		            <h4 class="media-heading">交通</h4>
		              <p> 发愣解决不了问题，自己又不想在福州多呆，只能把潮汕美食行提前启动了。也是幸亏没有去成霞浦，否则后面的时间真是不够用了，所以，旅行，真不能太贪。赶紧把去霞浦和后天去潮州的火车票退了，票是退的利索，但刚看12306明明有今天福州到潮州的车票，退票的功夫，再一登录查余票，全没！好在畅途网上有福州到汕头的大巴票，赶紧下单，只要能离开，无所谓交通工具了。</p>
		          	<div class="media">
		          <div class="media-left">
		            <a href="#">
		            	<img class="media-object" src="images/av.png" alt="" />
		            </a>
		          </div>
		          <div class="media-body">
		            <h4 class="media-heading">天气</h4>
		              <p>惦记着天气好坏，加上换地方睡的不踏实，早上5点多就醒了。望着窗外阴沉的天气，赶紧用手机查一下霞浦的天，结果手机无情的显示，霞浦中雨转多云，看着天气预报，一个人坐在床上乜呆呆的发愣。本想去霞浦看日出日落，拍拍号称中国最美的滩涂，看来难以成行了。如果这个天气去霞浦，估计啥也看不成了，真成“瞎扑”了。</p>
		          	
		          </div>
		        </div>
		        <div class="media">
		          <div class="media-left">
		            <a href="#">
		            	<img class="media-object" src="images/av.png" alt="" />
		            </a>
		          </div>
		          <div class="media-body">
		            <h4 class="media-heading">酒店</h4>
		              <p> 找到酒店办好入住，酒店的位置非常不错，就在三坊七巷街口。洗漱完毕，抓紧休息，祈祷明天会是个好天气。</p>
		          	
		          </div>
		        </div>
		          </div>
		        </div>
		</div>
		<!---->
		<div class="leave">
			<h5>Leave a Comment</h5>
			<form>
			   <textarea  placeholder="Comment" required></textarea>
			   <label class="hvr-sweep-to-right">
	           <input type="submit" value="Post Comment">
	           </label>
			</form>
			</div>
	</div>
	<div class="col-md-3 blog-sidebar">
	 </div>
	 <div class="clearfix"> </div>
	 
</div>
</div>
<!--//blog-->
<!--footer-->
<div class="footer">

	<div class="footer-bottom">
		<div class="container">
			<div class="col-md-4 footer-logo">
				<h2><a href="blog.html">老 饕</a></h2>
			</div>
			<!--<div class="col-md-8 footer-class">
				<p >Copyright &copy; 2015.Company name All rights reserved.<a target="_blank" href="http://www.cssmoban.com/">&#x7F51;&#x9875;&#x6A21;&#x677F;</a></p>
			</div>-->
		<div class="clearfix"> </div>
	 	</div>
	</div>
</div>
<!--//footer-->
</body>
</html>