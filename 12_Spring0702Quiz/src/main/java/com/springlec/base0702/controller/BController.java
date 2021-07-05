package com.springlec.base0702.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springlec.base0702.command.BCommand;
import com.springlec.base0702.util.Constant;


@Controller
public class BController {
	
	
	private JdbcTemplate template;
	
	@Autowired
	public void setTemplate(JdbcTemplate template) {
		this.template = template;
		Constant.template = this.template;
	}
	
	
	private BCommand listCommand = null;
	private BCommand writeCommand = null;
	private BCommand contentCommand = null;
	private BCommand modifyCommand = null;
	private BCommand deleteCommand = null;
	
	
	@Autowired
	public void auto(BCommand list, BCommand write, BCommand content, BCommand modify, BCommand delete) {
		this.listCommand =list;
		this.writeCommand = write;
		this.contentCommand = content;
		this.modifyCommand = modify;
		this.deleteCommand = delete;
	}

	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list()");
		listCommand.execute(model);

		return "mainboard";
	}
	
	@RequestMapping("/write_view")
	public String write(Model model) {
		System.out.println("write_view");
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		writeCommand.execute(model);
		return "redirect:list";
	}
	
	@RequestMapping("/delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete");
		
		model.addAttribute("request", request);
		deleteCommand.execute(model);
		
		return "redirect:list";
	}
	
}
