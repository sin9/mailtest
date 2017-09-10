package cn.sinout.mailtest.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmailTest {

	 public void testSendMail() {
		 ApplicationContext context = new ClassPathXmlApplicationContext("mailtest-application.xml");
	       Email mail = (Email)context.getBean("simpleMail");
	      mail.sendMail("嘻嘻嘻", "Spring SMTP Mail和附件发送", "sinoutx@gmail.com");
	      System.out.println("发送成功！");
	        //mail.sendMail("标题", "内容", "收件人邮箱");
	    }

	 public static void main(String[] args) {
	EmailTest et = new EmailTest();
		
		et.testSendMail();
	}
}
