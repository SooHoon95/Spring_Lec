package com.springlec.base0702.command;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.springlec.base0702.dao.BDao;
import com.springlec.base0702.dto.BDto;

public class BListCommand implements BCommand {

	private BDao dao = null;
	
	@Autowired
	public void setDao(BDao dao) {
		System.out.println("listDao");
		this.dao=dao;
	}
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		System.out.println("listcommand");
		
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
		

	}

}
