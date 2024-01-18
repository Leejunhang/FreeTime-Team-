package com.example.dao;

import java.util.HashMap;
import java.util.List;

import com.example.domain.GradecalcVO;

public interface GradeCalcDAO {
	public List<HashMap<String,Object>> list();
	public HashMap<String, Object> read(int gid);
	public void insert(GradecalcVO vo);
	public void update(GradecalcVO vo);
	public void delete(int gid);

}