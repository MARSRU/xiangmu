package com.clsb.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		//
		// Person per = new Person() ;
		//
		// per.setName("����");
		//
		// per.setAge(18);

		//
		// // ���� IOC���� �� ׼�����ã� ��������� ���� ע��
	      ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");
		
		 // ͨ�� bean �ڵ� ���� id ���� ע�� �� ���� ע��Ķ���
		 Person perllc = (Person) context.getBean("per");
		
		 System.out.println(perllc);


	}

}
