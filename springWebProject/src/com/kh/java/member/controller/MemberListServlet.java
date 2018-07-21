package com.kh.java.member.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.java.member.model.service.MemberService;
import com.kh.java.member.model.vo.MemberVo;
@WebServlet("/memberList.do")
public class MemberListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MemberListServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<MemberVo> list = new MemberService().selectMemberList();
		
		RequestDispatcher view = null;
		if(list != null){
			request.setAttribute("list", list);
			view = request.getRequestDispatcher("views/member/MemberList.jsp");
			view.forward(request, response);
		}
	}

}
