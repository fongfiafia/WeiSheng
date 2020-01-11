package com.weisheng.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
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
@CrossOrigin
public class LoginController {
	
	@Autowired
	private LoginService loginServie;

	/**
	 * 登录	
	 * @param entity
	 * @return
	 */
	@RequestMapping(value = "/login", method = RequestMethod.POST )
	public Result login(@RequestBody LoginEntity entity ) {
		Map<String, String> map = new HashMap<String, String>();
		System.out.println(entity);
		boolean flag = loginServie.login(entity);
		if (!flag) {
			return new Result(true,StatusCode.OK,"登录失败");
		}
		map.put("token","admin");
		return new Result(true,StatusCode.OK,"登录成功",map);
	}
	
}
