package com.library.Library_Management_Controllers;
import java.text.ParseException;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.library.Library_Management.AddUserMain;
import com.library.Library_Management.UserDetails;
import com.library.service.AddUserService;


@Controller
public class AddUserController {
	
	@Autowired
	AddUserService cdd;

	@RequestMapping(value = "/AddUser", method = RequestMethod.GET)
	public String getName1() {
		return "AddUser";
	}
	
	
/*	@RequestMapping(value="/AddUser", method = RequestMethod.POST)
	public void getName(@RequestParam String Name, @RequestParam String Address) {
		System.out.println("Data:"+Name+Address);
	}
	
	*/

	
		@RequestMapping(value = "/AddUser", method = RequestMethod.POST)
		public void add_user(HttpServletRequest request, HttpServletResponse response) throws ParseException
		{
			String user_name= (request.getParameter("Name")).toString();
			String  Address=(request.getParameter("Address")).toString();
			
			System.out.println("Data"+user_name);
			
			
			
			UserDetails obj1 = new UserDetails();
			 obj1.setUser_name(user_name);
			 obj1.setAddress(Address);
			 
		
			cdd.adduser(obj1); 
			 
			
			
			/*AddUserMain add_user= new AddUserMain();
			add_user.add_user_db(user_name, Address, Book1_ID, Book1_issue, Book1_return, Book2_ID, Book2_issue, Book2_return);
				
			ModelAndView mv= new ModelAndView();
			mv.setViewName("Add_user_confirmation.jsp");
			mv.addObject("user_name",user_name);
			mv.addObject("Address",Address);
			return mv;*/
			
		}
}

