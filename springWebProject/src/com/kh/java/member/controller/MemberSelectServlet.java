package com.kh.java.member.controller;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.kh.java.member.model.service.MemberService;
import com.kh.java.member.model.vo.MemberVo;
@WebServlet("/selectMember.do")
public class MemberSelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MemberSelectServlet() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String userid = request.getParameter("userid");
		MemberVo member = null;
		HashMap<String,String> params = new HashMap<String,String>();
		params.put("key", userid);
		member = new MemberService().selectMember(params);
		System.out.println(member.toString());
	}

}
