package sample.webmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/kitchen")
public class UserController3 {

	@RequestMapping({ "", "/" })
	public String greet() {
		System.out.println("UserController.greet()");
		return "kitchen";

	}

//	/WEB-INF/JSP/welcome.jsp

//	@RequestMapping(value =  "/movies" ,method = RequestMethod.GET)
	@GetMapping(value = { "/movies", "/films" })
	public String movie() {
		System.out.println("UserController.movie()");
		return "movies";

	}

}
