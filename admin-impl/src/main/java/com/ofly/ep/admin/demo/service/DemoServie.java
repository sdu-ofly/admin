package com.ofly.ep.admin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ofly.ep.admin.demo.api.IDemoService;
import com.ofly.ep.admin.demo.dao.IDemoDao;

@Service
public class DemoServie implements IDemoService {
	@Autowired
	IDemoDao dao;
	
	@Transactional
	public void query() throws Exception {
		//CustomerContextHolder.setCustomerType(CustomerContextHolder.ZDM);
		String id = dao.query();
		System.out.println(id);
		int i = dao.insert();
		int i2 = dao.insert();
		System.out.println(i|i2);
		throw new RuntimeException();
	}
}
