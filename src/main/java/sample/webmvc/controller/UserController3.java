package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController3 {

	@ResponseBody
	@RequestMapping("/footwear")
	public String footWear() {

		return "Hey User it's your footwear page !";
	}

}
