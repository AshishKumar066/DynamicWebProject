package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController2 {

	@ResponseBody
	@RequestMapping("/Welcome")
	public String welcome() {
		return "Welcome to my First web Page !";
	}
}
