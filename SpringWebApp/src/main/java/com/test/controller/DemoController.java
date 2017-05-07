package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.test.model.User;

@Controller
public class DemoController {
	
	Logger logger = LoggerFactory.getLogger(DemoController.class);
	
	@RequestMapping(method=RequestMethod.GET,value="/showWelcome")
	public String showWelcomePage(){
		logger.debug(" Debug Demo  ()");	
		logger.info(" INFO Demo ()");	
		logger.warn(" WARN Demo");	
		logger.error("  Error Demo");	
		return "welcome"; //view name Path =  /WEB-INF/jsp/welcome.jsp
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/welcome") ////View Name /WEB-INF/jsp/welcome.jsp
	public void showWelcome(){
		System.out.println(" Show Welcome   ()");	
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/saveData") 
	public String readInput(HttpServletRequest request,HttpServletResponse response){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + request.getParameter("username"));
		return "welcome"; 
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/sendData/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public String userInputDemo(@PathVariable String username,String  password){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + username);
		System.out.println(" PAssword  : " + password);
		return "welcome"; 
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/sendData") //View Name /WEB-INF/jsp/welcome.jsp
	public String userPostDemo(String username,String password){
		System.out.println(" ****** Spring Welcome  ******");
		System.out.println(" USer Name  : " + username);
		System.out.println(" PAssword  : " + password);
		return "welcome"; 
	}

	@RequestMapping(method=RequestMethod.GET,value="/getuserdata/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public ModelAndView returnOutputData(@PathVariable String username){
		//B.L
		ModelAndView mv = new ModelAndView();
		mv.setViewName("user");
		mv.addObject("username", username);
		mv.addObject("address", "567 N W , Gori St");
		mv.addObject("zipCode", "675756");
		return mv;
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/getuser/{username}") //View Name /WEB-INF/jsp/welcome.jsp
	public ModelAndView returnOutputObject(@PathVariable String username){
		//B.L
		ModelAndView mv = new ModelAndView();
		mv.setViewName("userdemo");
		mv.addObject("userObj", new User(username, "76786", "567 N W , Gori St"));
		return mv;
	}

}
