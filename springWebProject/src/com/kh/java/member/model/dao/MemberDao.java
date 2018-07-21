package com.kh.java.member.model.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.kh.java.member.model.vo.MemberVo;

public class MemberDao {
	public MemberDao() {
	}

	public List<MemberVo> selectMemberList(SqlSession session) {
		return session.selectList("MemberMapper.selectMemberList");
	}

	public MemberVo selectMember(SqlSession session, HashMap<String, String> params) {
		return session.selectOne("MemberMapper.selectMember",params);
	}
}
