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
	public ModelAndView getForm() {
		System.out.println("login method GET");
		ModelAndView mav = new ModelAndView("signin");
		mav.addObject("user", new User());
		return mav;
	}
	

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public ModelAndView login(@ModelAttribute("user") User user) {
		ModelAndView mav;
		System.out.println("login method POST");
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
	
	

}