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
	
	//��֤�ֻ������Ƿ����
	public static boolean isMobileNO(String mobiles) {
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(mobiles);
		return m.matches();
		}
	
	//���Ͷ���
	public static String sendMsg(String phoneNumber)
{	
		Pattern p = Pattern.compile("^((13[0-9])|(15[^4,\\D])|(18[0-9]))\\d{8}$");
		Matcher m = p.matcher(phoneNumber);
		if(m.matches()==false)
			return "�ֻ����벻����";
		HttpClient client = new HttpClient(); 
		PostMethod method = new PostMethod("http://106.ihuyi.cn/webservice/sms.php?method=Submit");
		client.getParams().setContentCharset("UTF-8");
		method.setRequestHeader("ContentType","application/x-www-form-urlencoded;charset=UTF-8");
		int mobile_code = (int)((Math.random()*9+1)*100000);
	    String content = new String("������֤���ǣ�" + mobile_code + "���벻Ҫ����֤��й¶�������ˡ�");
		NameValuePair[] data = {//�ύ����
			    new NameValuePair("account", "cf_ansedon"), 
			    new NameValuePair("password", "339e3b1395071030083e4eaf17e6a4f0"), //�鿴�������¼�û�����->��֤�롢֪ͨ����->�ʻ���ǩ������->APIKEY
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
				System.out.println("�����ύ�ɹ�");
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