package ma.gov.gbank.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import ma.gov.gbank.entities.Compte;
import ma.gov.gbank.entities.User;
import ma.gov.gbank.services.UserService;

@Controller
@RequestMapping("/user")
public class UserController {	
	
	@Autowired
	UserService userService;
	
	@Autowired
	HttpSession session;
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public ModelAndView getFormSignin() {
		ModelAndView mav = new ModelAndView("signin");
		mav.addObject("user", new User());
		return mav;
	}
	

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user) {
		ModelAndView mav;
		User res = userService.getUser(user);
		if(res == null) {
			mav = new ModelAndView("signin");
			return mav;
		}
		else {
			mav = new ModelAndView("redirect:/list");
			mav.addObject("compte", new Compte());
			session.setAttribute("user", user);
			return mav;
		}
	}
	

	@RequestMapping(value="/signupPage")
	public ModelAndView signup() {
		ModelAndView mav = new ModelAndView("signup");
		return mav;
	}
	

	@RequestMapping(value="/signup")
	public ModelAndView getFormSignup(@ModelAttribute User user) {
		user.setUsername(user.getUsername());
		user.setEmail(user.getEmail());
		user.setPassword(user.getPassword());
		userService.addUser(user);
		ModelAndView mav = new ModelAndView("redirect:/list");
		return mav;
	}
	
	

}