package com.cslb.hlf;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.clsb.bean.Person;

public class Test {

	public static void main(String[] args) {

		//
		// Person perLCL = new Person() ;
		//
		// per.setName("����");
		//
		// per.setAge(18);

		//
		// // ���� IOC���� �� ׼�����ã� ��������� ���� ע��
	      ApplicationContext context = new ClassPathXmlApplicationContext("abc.xml");
		
		 // ͨ�� bean �ڵ� ���� id ���� ע�� �� ���� ע��Ķ���
		 Person perhlf= (Person) context.getBean("per");
		
		 System.out.println(perhlf);


	}

}
