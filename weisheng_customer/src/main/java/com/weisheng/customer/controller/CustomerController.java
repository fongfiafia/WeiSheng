package com.weisheng.customer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.pagehelper.PageInfo;
import com.weisheng.common.entity.PageResult;
import com.weisheng.common.entity.Result;
import com.weisheng.common.entity.StatusCode;
import com.weisheng.customer.entity.Customer;
import com.weisheng.customer.service.CustomerService;

@RestController
@CrossOrigin
//@RequestMapping("/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/query/{userId}/{page}/{size}")
	public Result getList(@PathVariable String userId,@PathVariable String page,@PathVariable String size) {
		System.out.println("xxxx");
		PageInfo<Customer> dataList =  customerService.getList(userId,page,size);
		
		return new Result(true,StatusCode.OK,"查询成功",new PageResult(dataList.getTotal(),dataList.getList()));
	}
}
