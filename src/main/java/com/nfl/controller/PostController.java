package com.nfl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/post")
public class PostController {
	
	
	@RequestMapping(value="/create", method = RequestMethod.GET)
	public String createPost() {
		return "post/create";
	}
	
//	@RequestMapping(value='/create',method)
}
