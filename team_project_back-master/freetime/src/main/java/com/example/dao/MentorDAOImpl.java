package com.example.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.domain.MentorVO;
import com.example.domain.QueryVO;

@Repository
public class MentorDAOImpl implements MentorDAO{
	@Autowired
	SqlSession session;
	String namespace="com.example.mapper.MentorMapper";
	
	@Override
	public HashMap<String, Object> read(String mtid) {
		return session.selectOne(namespace + ".read", mtid);
	}
	@Override
	public void insert(MentorVO vo) {
		session.insert(namespace + ".insert", vo);
	}
	@Override
	public void update(MentorVO vo) {
		session.update(namespace + ".update", vo);
	}
	@Override
	public void delete(String mtid) {
		session.delete(namespace + ".delete", mtid);
	}
	@Override
	public List<HashMap<String, Object>> list(QueryVO vo) {
		vo.setStart((vo.getPage()-1) * vo.getSize());
		return session.selectList(namespace + ".list", vo);
	}
}