package com.weisheng.customer.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.weisheng.customer.entity.Customer;

@Mapper
public interface CustomerDao {

	public List<Customer> getList(String userId);

}
