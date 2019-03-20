package ma.gov.gbank.controller;

import java.util.ArrayList;
import java.util.List;

import org.codehaus.jettison.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import ma.gov.gbank.entities.Compte;
import ma.gov.gbank.services.IService;

@Controller
public class CompteController {	
	
	@Autowired
	IService service;
	
	@RequestMapping(value="/list")
	public ModelAndView list(Model model) {
		ModelAndView mnv=  new ModelAndView("comptes");
		ArrayList<Compte> listCompte = (ArrayList<Compte>) service.selectAll();
	    mnv.addObject("compteList", listCompte);
		return mnv;
	}
	
	@RequestMapping(value="/compte-list", method= RequestMethod.GET, consumes = "application/json")
	public @ResponseBody JSONArray list() {
		ArrayList<Compte> listCompte = (ArrayList<Compte>) service.selectAll();
		JSONArray jsArray = new JSONArray(listCompte); 
		return jsArray;
	}
	
	@RequestMapping(value="addCompte")
	public ModelAndView addCompte(@ModelAttribute Compte c)
	{
		c.setCapital(c.getCapital());
		c.setDescription(c.getDescription());
		c.setNum(c.getNum());
		service.ajouterCompte(c);
		return new ModelAndView("redirect:/list");
	}

	@RequestMapping(value="compteToUpdate/{id}")
	public ModelAndView compteToUpdate(@PathVariable("id")Long id,Model model) {
		Compte c = service.selectById(id);
		ModelAndView mnv=  new ModelAndView("redirect:/list");
	    mnv.addObject("compteToUpdate", c);
		return mnv;
	}

	@RequestMapping(value="updateCompte")
	public ModelAndView updateCompte(@ModelAttribute Compte cUpdate)
	{
		Compte c = new Compte();
		c = service.selectById(cUpdate.getId());
		c.setCapital(cUpdate.getCapital());
		c.setDescription(cUpdate.getDescription());
		c.setNum(cUpdate.getNum());
		return new ModelAndView("redirect:/list");
	}
	
	@RequestMapping(value="deleteCompte/{id}")
	public ModelAndView deleteCompte(@PathVariable("id")Long id,Model model) {
		Compte c = service.selectById(id);
		service.deleteCompte(c);
		ModelAndView mnv=  new ModelAndView("redirect:/list");
		return mnv;
	}
	
	
	@RequestMapping(value="searchCompte")
	public ModelAndView serchCompte(Model model, @RequestParam(value="idCompte") Long id) {
		List<Compte> listCompte = new ArrayList<Compte>();
		if (service.selectById(id) != null) {
			listCompte.add(service.selectById(id));
		}
		ModelAndView mnv=  new ModelAndView("comptes");
		mnv.addObject("compteList", listCompte);
		mnv.addObject("idCompte", id);
		return mnv;
	}
	
}
