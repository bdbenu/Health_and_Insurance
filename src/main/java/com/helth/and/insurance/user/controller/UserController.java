package com.helth.and.insurance.user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.helth.and.insurance.appexception.UserNotCreatedException;
import com.helth.and.insurance.constant.UserConstant;
import com.helth.and.insurance.user.beans.UserBeans;
import com.helth.and.insurance.user.service.IUserSeervice;

@Controller
public class UserController {
	@Autowired
	private IUserSeervice userservice;

	@GetMapping(value = { "/", "/load" })
	public String loadPage(Model model) {
		UserBeans formbinding = new UserBeans();
		model.addAttribute("formbinding", formbinding);
		return "index";
	}

	@PostMapping("/saved")
	public String saveUser(@ModelAttribute("formbinding") UserBeans beans, RedirectAttributes model) {
		boolean saveUser = userservice.saveUser(beans);
		if (saveUser) {
			model.addAttribute("sucMsg", "CREATE USER SUCCESSFULLY");
		} else {
			throw new UserNotCreatedException();
		}

		return "redirect:userCreatedSucces";
	}

	@GetMapping("/userCreatedSucces")
	public String successedUserCreate(Model model) {
		UserBeans formbinding = new UserBeans();
		model.addAttribute("formbinding", formbinding);
		return "index";
	}

}
