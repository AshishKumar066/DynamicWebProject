package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/rlectronics")
public class UserController {

	@RequestMapping("/")
	public String greet() {
		System.out.println("UserController.greet()");
		return "Hey User !";
	}

//	/WEB-INF/JSP/welcome.jsp

	@GetMapping(value = { "/movies", "/films" })
	public String movie() {
		System.out.println("UserController.movie()");
		return "movies";
	}
}