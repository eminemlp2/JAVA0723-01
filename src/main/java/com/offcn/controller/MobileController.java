package com.offcn.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.offcn.bean.Mobile;
import com.offcn.service.MobileService;

@Controller
public class MobileController {
	@Resource
	private MobileService service;
	
	@RequestMapping("show")
	public @ResponseBody Mobile show(String number) {
		Mobile selectAddress = service.selectAddress(number);
		System.out.println(selectAddress);
		if(selectAddress!=null) {
			return selectAddress;
		}else {
			return null;
		}		
	}
}
