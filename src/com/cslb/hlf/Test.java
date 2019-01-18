package com.cslb.hlf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clsb.bean.Person;

public class Test {

	public static void main(String[] args) {

		//
		// Person perLCL = new Person() ;
		//
		// per.setName("张三");
		//
		// per.setAge(18);

		//
		// // 创建 IOC容器 ， 准备调用， 里面的内容 进行 注入
	      ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");
		
		 // 通过 bean 节点 调用 id 进行 注入 ， 返回 注入的对象
		 Person perhlf= (Person) context.getBean("per");
		
		 System.out.println(perhlf);


	}

}
