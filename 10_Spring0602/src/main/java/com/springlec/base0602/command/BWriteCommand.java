package com.springlec.base0602.command;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.ui.Model;

import com.springlec.base0602.dao.BDao;

public class BWriteCommand implements BCommand {

	@Override
	public void execute(Model model) {

		//List커맨드랑 좀 달라진다.
		//앞이 키값 뒤가 벨류 값
		Map<String, Object> map = model.asMap(); //데이터를 받아올 수 있도록..!	
		HttpServletRequest request = (HttpServletRequest) map.get("request");
		String bName = request.getParameter("bName");
		String bTitle = request.getParameter("bTitle");
		String bContent = request.getParameter("bContent");
		
		BDao dao = new BDao();
		dao.write(bName, bTitle, bContent);
		
	}

}
