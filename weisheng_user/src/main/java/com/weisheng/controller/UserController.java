package com.weisheng.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author fongfiafia
 * 该模块是对公客户管理模块：
 * 涉及到对客户查询，创建，删除，修改
 * 备注：
 * 当前登录的用户为客户经理，只能查询该客户经理下的对公客户
 */
@RestController("/user")
@CrossOrigin
public class UserController {
	
}
