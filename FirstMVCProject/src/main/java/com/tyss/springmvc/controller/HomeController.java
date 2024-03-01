package com.tyss.springmvc.controller;
//import javax.servlet.http.HttpServletRequest;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
////import org.springframework.web.multipart.support.AbstractMultipartHttpServletRequest;
//
//@Controller
//public class HomeController {
//	@RequestMapping("/hi")
//	public String hello() {
//		System.out.println("Hi method is executed...");
//		return "result.jsp";
//	}
//	
//	@RequestMapping("/add")
//	public String addition(HttpServletRequest req,Model m) {
//		String num1=req.getParameter("num1");
//		String num2=req.getParameter("num2");
//		
//		int res=Integer.parseInt(num1)+Integer.parseInt(num1);
//		m.addAttribute("res",res);
//		return "result.jsp";
//	}
//}
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.HttpServerErrorException;

 
@Controller
public class HomeController {
	@RequestMapping("/hi")
	public String hello()
	{
		System.out.println("Hi method is executed...");
		return "result.jsp";
	}
	@RequestMapping("/add")
	public String addition(@RequestParam int num1,@RequestParam int num2,Model m)
	{
		//String num1=req.getParameter("num1");
		//String num2=req.getParameter("num2");
		//int res=Integer.parseInt(num1)+Integer.parseInt(num2);
		//m.addAttribute("res",res);
		//int res=num1+num2;
		m.addAttribute("res",num1+num2);
		return "result.jsp";
	}
	@RequestMapping("/sub")
	public String subtraction(HttpServletRequest req,Model m)
	{
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int res=Integer.parseInt(num1)-Integer.parseInt(num2);
		m.addAttribute("res",res);
		return "result.jsp";
	}
	@RequestMapping("/mul")
	public String Multiplication(HttpServletRequest req,Model m)
	{
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int res=Integer.parseInt(num1)*Integer.parseInt(num2);
		m.addAttribute("res",res);
		return "result.jsp";
	}
	@RequestMapping("/div")
	public String Division(HttpServletRequest req,Model m)
	{
		String num1=req.getParameter("num1");
		String num2=req.getParameter("num2");
		int res=Integer.parseInt(num1)/Integer.parseInt(num2);
		m.addAttribute("res",res);
		return "result.jsp";
	}

 
}