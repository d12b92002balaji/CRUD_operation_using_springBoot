package com.example.fourthspring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.example.fourthspring.dao.userDao;
import com.example.fourthspring.model.user;

@Controller
public class UserController {
	
	@Autowired
	userDao userdao;
	
	@RequestMapping("index")
	public String addUser()
	{
		return "index.jsp";
	}
	
	@RequestMapping("addUser")
	public String addUser(user us)
	{
		userdao.save(us);
		return "index.jsp";
	}
	
	@RequestMapping("getUser")
	public ModelAndView getUser(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView();
		user us=userdao.findById(id).orElse(new user());
		mav.addObject("username",us);
		mav.setViewName("showUser.jsp");
		return mav;
	}
	
	@RequestMapping("deleteUser")
	public ModelAndView deleteUser(@RequestParam int id)
	{
		ModelAndView mav=new ModelAndView();
		user us=userdao.findById(id).orElse(new user());
		userdao.deleteById(id);
		mav.addObject("deletename",us);
		mav.setViewName("deleteUser.jsp");
		return mav;
	}
	
	@RequestMapping("updateUser")
	public ModelAndView updateUser(user us)
	{
		ModelAndView mav=new ModelAndView("updateUser.jsp");
		us=userdao.findById(us.getId()).orElse(new user());
		userdao.deleteById(us.getId());
		mav.addObject("username",us);
		
		return mav;
	}
	

}
