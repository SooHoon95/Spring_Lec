package com.springlec.base;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping("board/view")
	public String view() {
		return "board/view" ;//jsp를 부른다
	}
	
	@RequestMapping("board/content")
	public String content(Model model) { // 안드로이드에서 intent와 같다고 생각
		model.addAttribute("id", 30);
		return "board/content";
	}
	
	@RequestMapping("board/reply")
	public ModelAndView reply() { //리턴 값이 ModelandView다
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("id", 30);
		modelAndView.setViewName("board/reply"); // 뷰네임
		return modelAndView;
	}
	
	
	
	
	
	
}
