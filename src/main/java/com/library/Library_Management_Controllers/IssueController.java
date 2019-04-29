package com.library.Library_Management_Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IssueController {

	@RequestMapping(value= "/issueBook", method = RequestMethod.GET )
	public String getName() {
		return "IssueBook";
	}

	/*@RequestMapping(value= "/issueBook", method = RequestMethod.POST )
	public String getName2(@RequestParam String ) {
		
	}
	*/
	
	
}
