package com.clsb.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		// 创建 ioc 容器
		ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");

		// 通过 bean 节点 调用 id 进行 注入 ， 返回 注入的对象
		Person per = (Person) context.getBean("per1");

		System.out.println(per);
	}

}
