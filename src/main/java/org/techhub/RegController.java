package org.techhub;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.techhub.service.RegService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class RegController {
	@Autowired
	RegService regService;
	@RequestMapping(value="/",method=RequestMethod.GET)
	public String homePage(){
 return "register";

	}
	@RequestMapping(value="/reg",method=RequestMethod.POST)
public String welcomePage(Register reg,Map<String,String> map) {
	boolean b=regService.isRegister(reg);
	if(b) {
		map.put("msg","Record Save.....");
	}
	else {
		map.put("msg","Record Not Save");
	}
	
	
		return "welcome";
}
}

