package com.ofly.ep.admin.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ofly.ep.admin.demo.api.IDemoService;
import com.ofly.ep.admin.demo.dao.IDemoDao;

@Service
public class DemoServie implements IDemoService {
	@Autowired
	IDemoDao dao;
	public void query() {
		String id = dao.query();
		System.out.println(id);
	}
}
