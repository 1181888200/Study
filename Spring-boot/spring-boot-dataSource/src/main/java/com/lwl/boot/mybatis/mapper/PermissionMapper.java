package com.lwl.boot.mybatis.mapper;

import java.util.List;

import com.lwl.boot.mybatis.model.Permission;

public interface PermissionMapper {

	List<Permission> selectAll();
	
	void insert(Permission permission);
	
}
