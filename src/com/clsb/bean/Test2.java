package com.clsb.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {

	public static void main(String[] args) {
		
		// ���� ioc ����
		ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");

		// ͨ�� bean �ڵ� ���� id ���� ע�� �� ���� ע��Ķ���
		Person per = (Person) context.getBean("per1");

		System.out.println(per);
	}

}
