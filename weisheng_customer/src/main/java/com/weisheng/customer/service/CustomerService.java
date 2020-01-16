package com.weisheng.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.weisheng.customer.dao.CustomerDao;
import com.weisheng.customer.entity.Customer;

@Service
public class CustomerService {

	@Autowired
	private CustomerDao customerDao;
	
	public PageInfo<Customer> getList(String userId, String page, String size) {
		System.out.println(page+size);
		PageHelper.startPage(Integer.parseInt(page),Integer.parseInt(size));
		List<Customer> dataList = customerDao.getList(userId);
		return new PageInfo<Customer>(dataList);
	}

}
