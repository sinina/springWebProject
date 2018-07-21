package com.kh.java.member.model.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.common.MySqlFactory;
import com.kh.java.member.model.dao.MemberDao;
import com.kh.java.member.model.vo.MemberVo;

public class MemberService {
	MemberDao dao = new MemberDao();
	public List<MemberVo> selectMemberList() {
		List<MemberVo> list =null;
		SqlSession session = MySqlFactory.getMySqlsession().openSession(false);
		try{
			list = dao.selectMemberList(session);	
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return list;
	}
	public MemberVo selectMember(HashMap<String, String> params) {
		MemberVo member =null;
		SqlSession session = MySqlFactory.getMySqlsession().openSession(false);
		try{
			member = dao.selectMember(session,params);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			session.close();
		}
		return member;
	}

}
