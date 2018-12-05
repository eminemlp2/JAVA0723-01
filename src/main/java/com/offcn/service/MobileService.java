package com.offcn.service;

import java.util.List;

import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.offcn.bean.Mobile;
@WebService
public interface MobileService {
	
	Mobile selectAddress(String number);
}
