package com.javahash.controller;

import java.util.List;













import com.javahash.dao.SpringProjectDAO;
import com.javahash.entity.Golden;
import com.javahash.entity.Client;
import com.javahash.entity.Silver;

import com.javahash.entity.Bronzes;
import com.javahash.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Controller
public class AppController {
	@Autowired
	SpringProjectDAO dao;
	@RequestMapping(value = { "/", "/index**" }, method = RequestMethod.GET)
	public ModelAndView welcomePage() {
 
		ModelAndView model = new ModelAndView();
		
		model.setViewName("index");
		return model;
 
	}
	
		
		@RequestMapping(value = {  "/403**" }, method = RequestMethod.GET)
		public ModelAndView error() {
	 
			ModelAndView model = new ModelAndView();
			
			model.setViewName("403");
			return model;
	 
		}
		
	
		@RequestMapping(value = {  "/contacts**" }, method = RequestMethod.GET)
		public ModelAndView help() {
	 
			ModelAndView model = new ModelAndView();
			
			model.setViewName("contacts");
			return model;
	 
		}
		@RequestMapping(value = { "/bronze**" }, method = RequestMethod.GET)
		public ModelAndView bronze() {
	 
			ModelAndView model = new ModelAndView();
			List<Bronzes> bronzes = dao.readBronzes();
			model.addObject("bronzesList",bronzes);		
			model.setViewName("bronzes");
			return model;
	 
		}
		@RequestMapping(value = { "/silver**" }, method = RequestMethod.GET)
		public ModelAndView silver() {
	 
			ModelAndView model = new ModelAndView();
			List<Silver> silver = dao.readSilver();
			model.addObject("silverList",silver);		
			model.setViewName("silver");
			return model;
	 
		}
		@RequestMapping(value = { "/golden**" }, method = RequestMethod.GET)
		public ModelAndView java() {
	 
			ModelAndView model = new ModelAndView();
			List<Golden> golden = dao.readGolden();
			model.addObject("goldenList",golden);		
			model.setViewName("golden");
			return model;
	 
		}	
		
		@RequestMapping(value = { "/indentinfo**" }, method = RequestMethod.GET)
	    public ModelAndView indentinfo(@RequestParam  String name,String image) {
			ModelAndView mav=new ModelAndView("indentinfo");	
			Bronzes pindents = new Bronzes(name,image);
			mav.addObject("pindentsList",pindents);	
			return mav;

	}


		@RequestMapping(value = { "/UDB**" }, method = RequestMethod.GET)
		public ModelAndView udb() {
	 
			ModelAndView model = new ModelAndView();
			List<Client> client = dao.readClient();
			model.addObject("clientList",client);		
			model.setViewName("UDB");
			return model;
	 
		}	
		@RequestMapping(value = { "/register**" }, method = RequestMethod.GET)
		public ModelAndView register() {
	 
			ModelAndView model = new ModelAndView();
			List<Client> client = dao.readClient();
			model.addObject("clientList",client);		
			model.setViewName("register");
			return model;
	 
		}	
		@RequestMapping(value = { "/uadd**" }, method = RequestMethod.GET)
		public String uadd(@RequestParam  String name,  String lname, String fname,String image,String email,String password){
	    	Client client = new Client(name,lname,fname,password,image,email);
	    	dao.addInformation(client);
	    	return "redirect:UDB.do";
		}
		
}