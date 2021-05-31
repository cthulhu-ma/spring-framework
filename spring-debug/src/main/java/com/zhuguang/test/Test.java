package com.zhuguang.test;

import com.zhuguang.AppConfig;
import com.zhuguang.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Description:
 * @Author: 黎晓琦
 * @Date: 2021/5/31 14:43
 * @Modify By:
 **/
public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(
				AppConfig.class);
		System.out.println(ac.getBean(UserService.class));
	}

}
