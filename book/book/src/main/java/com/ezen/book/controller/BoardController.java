package com.ezen.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/Board/*")
public class BoardController {
	
	
	@GetMapping("/pay")
	public String pay() {
		
		return "/cart/pay";
	}

}
