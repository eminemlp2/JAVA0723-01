package com.offcn.service.impl;

import javax.annotation.Resource;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.bean.Mobile;
import com.offcn.dao.MobileDao;
import com.offcn.service.MobileService;
@Service
@WebService
public class MobileServiceImpl implements MobileService{

	@Resource
	private MobileDao dao;
	
	@Override
	public Mobile selectAddress(String number) {
		// TODO Auto-generated method stub
		System.out.println("serviceimpl÷¥––"+number);
		return dao.selectAddress(number);
	}
	
}
