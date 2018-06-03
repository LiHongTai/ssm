package com.roger.ssm.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roger.ssm.mapper.DeptMapper;

@Service(value="indexService")
public class IndexService {

	@Autowired
	private DeptMapper deptMapper;
	
	public void hello() {
		System.out.println("调用了service方法...");
		List<Map<String,Object>> depts = deptMapper.findAll();
		for (Map<String, Object> dept : depts) {
			System.out.println(dept.get("loc"));
		}
	}
}
