package bookstore.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import bookstore.service.UserService;

@Controller
public class bookstoreHandler {
	@Autowired
	private UserService userService;
}
