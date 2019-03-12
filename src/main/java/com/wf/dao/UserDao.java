package com.wf.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.wf.entity.TbUser;

@Repository
public interface UserDao {

	
	//查询所有用户信息
	public List<TbUser> findAll();
	
}
