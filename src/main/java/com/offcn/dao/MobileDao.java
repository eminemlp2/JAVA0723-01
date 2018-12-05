package com.offcn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.offcn.bean.Mobile;

public interface MobileDao {

	Mobile selectAddress(@Param("number") String number);
	
}
