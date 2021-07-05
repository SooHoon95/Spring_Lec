package com.springproject.Command;

import org.apache.ibatis.session.SqlSession;
import org.springframework.ui.Model;

public interface BCommand {

	void execute(SqlSession sqlSession, Model model);
}
