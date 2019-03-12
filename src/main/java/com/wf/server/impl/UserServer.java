package com.wf.server.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wf.dao.UserDao;
import com.wf.entity.TbUser;

@Service
public class UserServer {
	
	@Autowired
	private UserDao userDao;
	
	//查询所有
	//。。。
	public List<TbUser> findAll() {
	
		List<TbUser> userList = userDao.findAll();
		
		if (userList!=null && userList.size()>0) {
			return userList;
		}
		
		return null;
		
	}

}
