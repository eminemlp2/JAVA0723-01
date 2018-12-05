package com.offcn.test;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;

public class test {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-service.xml","spring-dao.xml","cxf-service.xml");
		MobileService service = context.getBean(MobileService.class);
		Mobile selectAddress = service.selectAddress("1383986");
		System.out.println(selectAddress);
	}
}
