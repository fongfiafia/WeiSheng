package com.weisheng.dao;

import org.apache.ibatis.annotations.Mapper;

import com.weisheng.entity.User;

@Mapper
public interface LoginDao {

	public User getUser(String loginname) ;

}
