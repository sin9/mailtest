package cn.sinout.mailtest.model.controller;

import java.lang.reflect.Method;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cn.sinout.mailtest.test.Email;

@Controller
@RequestMapping("/send")
public class SendController {

	public static  ApplicationContext context = new ClassPathXmlApplicationContext("mailtest-application.xml");
	
	public static Email mail = (Email)context.getBean("simpleMail");
	
	@RequestMapping
	public void init(){
		
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String req(String address,String title,String content,Model model){
		try {
			mail.sendMail(title, content, address);
		} catch (Exception e) {
			model.addAttribute("acce", "发送失败");
		}
		
		model.addAttribute("acce", "发送成功");
		return "/send";
	}
	
}
