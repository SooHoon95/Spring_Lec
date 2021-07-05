package com.springlec.base0602.command;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import com.springlec.base0602.dao.BDao;
import com.springlec.base0602.dto.BDto;

public class BListCommand implements BCommand {

	private BDao dao = null;
	
	@Autowired
	public void setDao(BDao dao) {
		this.dao =dao; // 아래 오버라이드에서 다오를 새로 선언해줄 필요가 없어진다.
	}
	
	
	
	
	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
//		BDao dao = new BDao();
		ArrayList<BDto> dtos = dao.list();
		model.addAttribute("list", dtos);
		
	}

}
