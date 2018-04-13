package com.lwl.boot.interceptor;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InterceptorController {

	
	
	
	@RequestMapping("/index")
	@ResponseBody
	public String index() {
	
		return "hello interceptor";
	}
	
}
