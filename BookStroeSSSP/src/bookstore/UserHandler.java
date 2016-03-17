package bookstore;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserHandler {
	@RequestMapping("/user")
	public String test(){
		return "test";
	}
}
