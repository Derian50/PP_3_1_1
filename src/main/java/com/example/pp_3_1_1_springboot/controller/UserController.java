package com.example.pp_3_1_1_springboot.controller;

import com.example.pp_3_1_1_springboot.model.User;
import com.example.pp_3_1_1_springboot.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


import java.util.List;

@Controller
public class UserController {

	@Autowired
	private UserService userService;
	@GetMapping(value = "/")
	public String printUsersTable(ModelMap model) {
		List<User> users = userService.getUsers();
		model.addAttribute("users", users);

		return "index";
	}
	@GetMapping(value = "/add")
	public String addUser(ModelMap model) {
		model.addAttribute("user", new User());
		return "add";
	}

	@PostMapping("/add")
	public String addUser(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "add";
		}
		userService.add(user);
		return "redirect:/";
	}
	@GetMapping(value = "/update")
	public String updateUser(@RequestParam(value = "id") Long id, ModelMap model) {
		model.addAttribute("user", userService.getUserById(id));
		return "update";
	}

	@PostMapping("/update")
	public String updateUser(@Valid User user, BindingResult bindingResult) {
		if (bindingResult.hasErrors()) {
			return "update";
		}
		userService.update(user);
		return "redirect:/";
	}

	@PostMapping("/delete")
	public String deleteUser(@RequestParam(value = "id") Long id) {
		userService.remove(userService.getUserById(id));
		return "redirect:/";
	}
	
}