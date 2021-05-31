package com.zhuguang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Description:
 * @Author: 黎晓琦
 * @Date: 2021/5/31 16:11
 * @Modify By:
 **/
@Component
public class GroupService {

	@Autowired
	UserService userService;

	public GroupService(){
		System.out.println("group bean");
	}
}
