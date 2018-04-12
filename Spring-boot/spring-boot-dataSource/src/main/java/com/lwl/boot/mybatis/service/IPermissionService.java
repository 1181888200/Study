package com.lwl.boot.mybatis.service;

import java.util.List;

import com.lwl.boot.mybatis.model.Permission;

public interface IPermissionService {

	List<Permission> selectAll();
	
	void insert(Permission permission);
	
	
}
