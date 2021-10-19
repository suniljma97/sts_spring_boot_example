package com.sunruhi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	@RequestMapping("/")
	public String home()
	{
		System.out.print("This is home Page");
		return "home";
	}
	@RequestMapping("/contact")
	public String contact()
	{
		System.out.print("This is home Page");
		return "contact";
	}

	

}
