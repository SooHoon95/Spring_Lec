package com.springlec.base0602.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.springlec.base0602.command.BCommand;
import com.springlec.base0602.command.BDeleteCommand;
import com.springlec.base0602.command.BDetailCommand;
import com.springlec.base0602.command.BListCommand;
import com.springlec.base0602.command.BModifyCommand;
import com.springlec.base0602.command.BWriteCommand;

@Controller
public class BController {

	BCommand command = null;
	
	private BCommand listCommand = null; // 이렇게 하면 일일이 커멘드로 진입할 때 new로 선언해 줄 필요가 없다.
	private BCommand writeCommand = null;
	private BCommand contentCommand = null;
	private BCommand modifyCommand = null;
	private BCommand deleteCommand = null;
	
	//======================================
	
	@Autowired
	public void auto(BCommand list) {
		this.listCommand = list; // 여기 리스트는 결국 servlet-context의 list를 부르는 행위임.
	}
	
	@Autowired
	public void autwrite(BCommand content) {
		this.contentCommand = content; // 여기 리스트는 결국 servlet-context의 list를 부르는 행위임.
	}
	
	@Autowired
	public void autocontent(BCommand write) {
		this.writeCommand = write; // 여기 리스트는 결국 servlet-context의 list를 부르는 행위임.
	}
	
	@Autowired
	public void automodify(BCommand modify) {
		this.modifyCommand = modify; // 여기 리스트는 결국 servlet-context의 list를 부르는 행위임.
	}
	
	@Autowired
	public void autodelete(BCommand delete) {
		this.deleteCommand = delete; // 여기 리스트는 결국 servlet-context의 list를 부르는 행위임.
	}
	
	
	//======================================
	@RequestMapping("/list")
	public String list(Model model) {
		System.out.println("list():");
		listCommand.execute(model);
		return "list";
	}
	
	@RequestMapping("/write_view")
	public String write_view(Model model) {
		System.out.println("write_view()");
		return "write_view";
	}
	
	@RequestMapping("write")
	public String write(HttpServletRequest request, Model model) {
		System.out.println("write()");
		
		model.addAttribute("request", request);
		writeCommand.execute(model);
		
		return "redirect:list";
	}
	
	
	@RequestMapping("/content_view")
	public String content_view (HttpServletRequest request, Model model) {
		System.out.println("detail()");
		
		model.addAttribute("request", request);
		contentCommand.execute(model);
		
		return "content_view";
		
	}
	
	@RequestMapping("delete")
	public String delete(HttpServletRequest request, Model model) {
		System.out.println("delete()");
		
		model.addAttribute("request", request);
		deleteCommand.execute(model);
		
		return "redirect:list";
	}
	
	
	@RequestMapping("modify")
	public String modify(HttpServletRequest request, Model model) {
		System.out.println("modify()");
		
		model.addAttribute("request", request);
		modifyCommand.execute(model);
		
		return "redirect:list";
	}
	
	
	
	
}
