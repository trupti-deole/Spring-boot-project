package com.test.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WelcomeController {
	@RequestMapping(value="/welcome")
	public String WelcomePage()
	{
		return "welcome";
	}
	@RequestMapping(value="/")
	public String LandingPage()
	{
		 return "index";
	}
	@RequestMapping(value="/**")
	public String FallbackPage()
	{
		return "error";
	}
	@RequestMapping(value="/check/{num}") //request is /check and number is defined in curly bracket
	                                      //and here we accept data by using @PathVariableAnnotation
	public String CheckEvenOdd(@PathVariable ("num")int num)
	{
		System.out.println(num);
		return "index";
	}
	@RequestMapping(value="/booktrainer/{name}/course/{cname}")
	public String BookTrainer(@PathVariable("name") String name,@PathVariable("cname") String cname )
	{
		
		System.out.println(name+" "+cname);
	    return "index";
	}
}
