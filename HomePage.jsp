<%@ page  import="java.util.*,com.eshore.*" pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("utf-8");//解决中文乱码
%>
<!DOCTYPE html>
<html>
<head>
<title>Fanfo</title>
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
<style type="text/css">
body,td,th {
	font-family: "微软雅黑";
}
.art_container {
	position: relative;
}
.art_container {
	height: 300px;
	width: 100%;
	margin-top: 30px;
	margin-right: 10px;
	margin-bottom: 70px;
	margin-left: 10px;
}
.art_content {
	font-family: "微软雅黑";
	margin-top: 10px;
	margin-left: 10px;
	margin-right: 0px;
	float: right;
	height: 300px;
	width: 450px;
}
.art_picture {
	float: left;
	height: 300px;
	width: 500px;
	margin: 10px;
	padding-top: 10px;
	padding-right: 10px;
	padding-bottom: 10px;
	padding-left: 10px;
}
</style>	
<!--//theme-style-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Real Home Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, 
Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- slide -->
<script src="js/responsiveslides.min.js"></script>
   <script>
    $(function () {
      $("#slider").responsiveSlides({
      	auto: true,
      	speed: 500,
        namespace: "callbacks",
        pager: true,
      });
    });
  </script>

</head>
<body>
<!--header-->
<!--	<div class="navigation">
			<div class="container-fluid">
				<nav class="pull">
					<ul>
						<li><a  href="index.html">Home</a></li>
						<li><a  href="about.html">About Us</a></li>
						<li><a  href="blog.html">Blog</a></li>
						<li><a  href="terms.html">Terms</a></li>
						<li><a  href="privacy.html">Privacy</a></li>
						<li><a  href="contact.html">Contact</a></li>
					</ul>
				</nav>			
			</div>
		</div>-->

<div class="header">
	<div class="container">
		<!--logo-->
				<a href="HomePage.jsp"><img src="images/title_fanfo.jpg" width="130" ></a>
		<!--//logo-->
    
		<div class="top-nav">
			<ul class="right-icons">
			    <li><a  href="city.jsp"><i class="glyphicon glyphicon-user"> </i>City </a></li>
				<li><a  href="Login.jsp"><i class="glyphicon glyphicon-user"> </i>My account</a></li>
				<li><a class="play-icon popup-with-zoom-anim" href="#small-dialog"><i class="glyphicon glyphicon-search"> </i> </a></li>
			</ul>
			<!--<div class="nav-icon">
				<div class="hero fa-navicon fa-2x nav_slide_button" id="hero">
						<a href="#"><i class="glyphicon glyphicon-menu-hamburger"></i> </a>
					</div>	
				<!---
				<a href="#" class="right_bt" id="activator"><i class="glyphicon glyphicon-menu-hamburger"></i>  </a>
			--->
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
							  <li class="resp-tab-item" aria-controls="tab_item-1" role="tab"><span>文章</span></li>
							  <li class="resp-tab-item" aria-controls="tab_item-2" role="tab"><span>餐馆</span></li>
							  <div class="clearfix"></div>
						  </ul>				  	 
						  <div class="resp-tabs-container">
						  		<h2 class="resp-accordion resp-tab-active" role="tab" aria-controls="tab_item-0"><span class="resp-arrow"></span>全部</h2><div class="tab-1 resp-tab-content resp-tab-content-active" aria-labelledby="tab_item-0" style="display:block">
								 	<div class="facts">
									  	<div class="login">
											<input type="text" class="glyphicon-phone" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = '搜地点/美食种类/餐馆名';}" value="搜地点/美食种类/餐馆名等等">		
									 		<input type="submit" value="" >
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
<!--//-->	
	<div class=" header-right">
		<div class=" banner">
			 <div class="slider">
			    <div class="callbacks_container">
			      <ul class="rslides" id="slider">		       
					 <li>
			          	 <div class="banner1">
			           		<div class="caption">
					          	<h3><span>饭</span><span style="font-family: '方正小标宋简体'">否</span></h3> 
					          	<p>真正的城市美味，藏在大街小巷，藏在老饕心里</p>
			          		</div>
			          	</div>
			         </li>
					 <li>
			          	 <div class="banner2">
			           		<div class="caption">
					          	 	<h3><span>饭</span><span style="font-family: '方正小标宋简体'">否</span></h3> 
					          	<p>真正的城市美味，藏在大街小巷，藏在老饕心里</p>
			          		</div>
			          	</div>
			         </li>
			         <li>
			          	 <div class="banner3">
			           		<div class="caption">
					          	 	<h3><span>饭</span><span style="font-family: '方正小标宋简体'">否</span></h3> 
					          	<p>真正的城市美味，藏在大街小巷，藏在老饕心里</p>
			          		</div>
			          	</div>
			         </li>		
			      </ul>
			  </div>
			</div>
		</div>
	</div>

<!--//header-->
<!--project--->
	<div class="project">
		<div class="container">
		  <h3>猜你喜欢</h3>
				<div class="project-top">
 					<%
 					List<Restaurant> res = (List)session.getAttribute("res");
 						for(int i = 0;i < 4 && i<res.size();i++) {
 							Restaurant p = res.get(i);%>
					<div class="col-md-3 project-grid">
						<div class="project-grid-top">
							<a><img src="images/res1.JPG" class="img-responsive zoom-img" alt=""/></a>
						  <div class="col-md1">
								 <div class="col-md2">
									 <div class="col-md3">
									 	<span class="star"> <strong><%=p.getRes_score() %></strong></span>
									 </div>
									 <div class="col-md4">
									 	<strong><%=p.getRes_name() %></strong>
									 	<small><%=p.getRes_refer_num() %>次推荐</small>
									 </div>
									 <div class="clearfix"> </div>
								 </div>

								  <p>地址：<%=p.getRes_addr_city() %><%=p.getRes_addr_street() %></p>
                            <p>类别：<%=p.getRes_style() %></p>
                         <p class="cost">人均：¥<%=p.getRes_average_cost() %></p>          
						    <a href="single.html" class="hvr-sweep-to-right more">想吃</a>
						    </div>
						</div>
					</div>
					<%} %>
	
		  </div>			
		</div>   
	</div>
<!--//project-->
<!--content-->
<div class="content">
  <div class="content-grid">
		<div class="container">
		  <h3>热门美食路线</h3>
          <div class="content-bottom-in">
			<ul id="flexiselDemo1">	
			<%
				List<Route> route = (List)session.getAttribute("route");
				for(int i = 0;i < 5 && i<route.size();i++){
					Route p = route.get(i);
					%>
				<li><div class="project-fur">
			     	 <a href="route1.html" class="mask">
			     	   	<img class="img-responsive zoom-img" src="images/pc4.jpg" alt="">
			     	   	<span class="four">¥<%=p.getRou_price() %></span>
			     	 </a>
	     	      <div class="most-1">
			     	   	 <h5><a href="route1.html"><%=p.getRou_title() %></a></h5>
	     	    	<p>by <%=p.getRou_user_id() %></p>
		     	    </div>
			 </div></li>
		 <%} %>
            </ul>
            <script type="text/javascript">
						$(window).load(function() {
							$("#flexiselDemo1").flexisel({
								visibleItems: 4,
								animationSpeed: 1000,
								autoPlay: true,
								autoPlaySpeed: 3000,    		
								pauseOnHover: true,
								enableResponsiveBreakpoints: true,
						    	responsiveBreakpoints: { 
						    		portrait: { 
						    			changePoint:480,
						    			visibleItems: 1
						    		}, 
						    		landscape: { 
						    			changePoint:640,
						    			visibleItems: 2
						    		},
						    		tablet: { 
						    			changePoint:768,
						    			visibleItems: 3
						    		}
						    	}
						    });
						    
						});
			</script>
			<script type="text/javascript" src="js/jquery.flexisel.js"></script>
           <div class="clearfix"> </div>
          </div>
       </div>
	</div>
  </div>
<!--blog-->
<div class="blog">
<div class="container">
	<h3>热门食荐</h3>
   <div class="col-md-9 blog-head">
   <% 
   	List<Article> article = (List)session.getAttribute("article");
   	String str="article";
   	for(int i = 0; i < 4 && i<article.size();i++){
   		Article p1 =article.get(i);
   		str="article:"+Integer.toString(i);%>
     <div class="art_container">
       <div class="art_picture">
          <a href="article.html"><img src="<%=p1.getArt_title_pic()%>" class="img-responsive" alt=""/></a>
       </div>          
       <div class="art_content">
         <div class="blog-top">
           <h4><a href="article.html"><%=p1.getArt_title() %></a></h4>
	         <h5>Posted By : <a href="article.html"><%=p1.getArt_user_name() %></a> | Date : <%=p1.getArt_post_time() %></h5>
             <h5><a href="article.html">阅读量：<%=p1.getArt_read_num() %></a></h5>
	         <a class="hvr-sweep-to-right more" href="article.html">Read More</a>
	           <div class="links">
		  		  <ul class="blog-links">
		  		  </ul>
		  	   </div>
	      </div>  
    </div>
   </div>  
	<%} %>
        
   
	 <div class="clearfix"> </div>
	 <nav>
      <ul class="pagination">
        <li class="disabled"><a href="#" aria-label="Previous"><span aria-hidden="true">«</span></a></li>
        <li class="active"><a href="#">1 <span class="sr-only">(current)</span></a></li>
        <li><a href="#">2</a></li>
        <li><a href="#">3</a></li>
        <li><a href="#">4</a></li>
        <li><a href="#">5</a></li>
        <li><a href="#" aria-label="Next"><span aria-hidden="true">»</span></a></li>
     </ul>
   </nav>
</div>
</div>
</div>

<!--//footer-->
</body>
<script type='text/javascript'>
document.getElementById("<%=str%>").onclick=function()
{
	alert("没事干点我干吗？");
	
	
}
</script>
</html>