package com.lwl.boot.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FreemarkerController {

	@RequestMapping("/hello")
	public String helloPage(Model model) {
		model.addAttribute("name", "lwl");
		return "hello";
	}
	
	@RequestMapping("/index")
	public String index(Model model) {
		model.addAttribute("name", "index");
		return "index/index";
	}
}
