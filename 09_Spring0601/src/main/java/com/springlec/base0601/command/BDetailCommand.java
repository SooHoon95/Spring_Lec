package com.springlec.base0601.command;

import java.util.ArrayList;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.springlec.base0601.dao.BDao;
import com.springlec.base0601.dto.BDto;

public class BDetailCommand implements BCommand {

	@Override
	public void execute(Model model) {
		// TODO Auto-generated method stub
		
		Map<String, Object> map = model.asMap(); //데이터를 받아올 수 있도록..!	
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String detailbId = request.getParameter("bId");
		int bId = Integer.parseInt(detailbId);
		
		BDao dao = new BDao();
		BDto dto = dao.detail(bId);
		model.addAttribute("detail", dto);
		
		
	}

}
