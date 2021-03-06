package net.slipp.web;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
	private List<UserForm> users = new ArrayList<>();
	
	@PostMapping("/create")
	public String create(UserForm userForm) {
		System.out.println(userForm.toString());
		users.add(userForm);
		return "redirect:list";
	}

	@GetMapping("/list")
	public String list(Model model) {
		model.addAttribute("users", users);
		return "list";
	}
}
