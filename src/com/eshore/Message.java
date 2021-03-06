package com.eshore;

import java.io.IOException;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import org.dom4j.Document;   
import org.dom4j.DocumentException;
import org.dom4j.DocumentHelper;   
import org.dom4j.Element;   
import java.util.regex.Matcher;  

import java.util.regex.Pattern; 
public class Message {
	
	//验证手机号码是否存在
	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
		}
	
	//发送短信
	public static String sendMsg(String phoneNumber)
{	
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(phoneNumber);
		if(m.matches()==false)
			return "手机号码不存在";
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod("http://106.ihuyi.cn/webservice/sms.php?method=Submit");
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");
		int mobile_code = (int)((Math.random()*9+1)*100000);
	    String content = new String("您的验证码是：" + mobile_code + "。请不要把验证码泄露给其他人。");
		NameValuePair[] data = {//提交短信
			    new NameValuePair("account", "cf_ansedon"), 
			    new NameValuePair("password", "339e3b1395071030083e4eaf17e6a4f0"), //查看密码请登录用户中心->验证码、通知短信->帐户及签名设置->APIKEY
			    new NameValuePair("mobile", "18221239580"), 
			    new NameValuePair("content", content),
		};
		method.setRequestBody(data);
		try {
			client.executeMethod(method);
			String SubmitResult =method.getResponseBodyAsString();
			Document doc = DocumentHelper.parseText(SubmitResult);
			Element root = doc.getRootElement();
			String code = root.elementText("code");
			String msg = root.elementText("msg");
			String smsid = root.elementText("smsid");
			System.out.println(code);
			System.out.println(msg);
			System.out.println(smsid);
			 if("2".equals(code)){
				System.out.println("短信提交成功");
			}
		} catch (HttpException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (DocumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		return Integer.toString(mobile_code);
}
}