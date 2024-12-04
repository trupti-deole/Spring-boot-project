package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.binding.Product;

@Controller
public class GreetController {
	@RequestMapping(value = "/greet")
	public String welcomePage() {
		return "greet";
	}

	@RequestMapping(value = "/reg")
	public String RegisterPage() {
		return "register";
	}

	@RequestMapping(value = "/log")
	public String LoginPage() {
		return "login";
	}

	@RequestMapping(value = "/register")
//	public String RegPage(@RequestParam String pname, @RequestParam String pid, @RequestParam String price,
//			@RequestParam String quantity, @RequestParam String pmanufacturer) {
//		System.out.println(pname+" "+pid+" "+price+" "+quantity+" "+pmanufacturer);
//		return "index";
//
//	}
	public String  ProductRegPage(@ModelAttribute Product prod)
	{
		System.out.println(prod.getPid()+" "+prod.getPname()+" "+prod.getPrice()+" "+prod.getQuantity()+" "+prod.getPmanufacturer());
		return "index";
	}
	@RequestMapping(value = "/login")
	public String LogPage(@RequestParam String pname, @RequestParam String pid) {
		
		if(pname.equalsIgnoreCase("pen")&&pid.equals("1234"))
		{
			System.out.println("Login successfully.....");
			System.out.println("Product name:"+pname+" "+"Product Id:"+pid);
		}
		return "index";

	}
	
	
}
