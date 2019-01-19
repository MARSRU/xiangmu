package com.clsb.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//
		// Person per = new Person() ;
		//
		// per.setName("张三");
		//
		// per.setAge(18);

		//
		// // 创建 IOC容器 ， 准备调用， 里面的内容 进行 注入
	      ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");
		
		 // 通过 bean 节点 调用 id 进行 注入 ， 返回 注入的对象
		 Person perllc = (Person) context.getBean("per");
		
		 System.out.println(perllc);


	}

}
