package com.springlec.base0502;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {

	
	@RequestMapping("studentConfirm")
	public String studentRedirect(HttpServletRequest httpServletRequest, Model model) {
		
		String id = httpServletRequest.getParameter("id");
		if(id.equals("abc")) {
			return"redirect:studentOK"; //""안에있다고 글씨아니고. 저 이름으로 된 jsp가 있는게 아니라 키워드임
		}
		return "redirect:studentNG";
	}
	
	
	@RequestMapping("studentOK")
	public String ok(Model model) {
		return "student/studentOK"; //여기로 가라
	}
	
	@RequestMapping("studentNG")
	public String ng(Model model) {
		return "student/studentNG";
	}
	
	
	
	
	
	
	
	
	
}///=========
