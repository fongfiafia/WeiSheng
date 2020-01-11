package com.weisheng.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.weisheng.common.entity.Result;
import com.weisheng.common.entity.StatusCode;
import com.weisheng.entity.LoginEntity;
import com.weisheng.service.LoginService;

@RestController
@RequestMapping("/system")
public class LoginController {
	
	@Autowired
	private LoginService loginServie;

	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public Result login(@RequestBody LoginEntity entity ) {
		System.out.println("xxxxxx");
		boolean flag = loginServie.login(entity);
		if (!flag) {
			return new Result(true,StatusCode.OK,"登录失败");
		}
		return new Result(true,StatusCode.OK,"登录成功");
	}
	
}
