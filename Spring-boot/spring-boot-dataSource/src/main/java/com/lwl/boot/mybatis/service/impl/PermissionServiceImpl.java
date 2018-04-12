package com.lwl.boot.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lwl.boot.mybatis.mapper.PermissionMapper;
import com.lwl.boot.mybatis.model.Permission;
import com.lwl.boot.mybatis.service.IPermissionService;

@Service
public class PermissionServiceImpl implements IPermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
	@Override
	public List<Permission> selectAll() {
		return permissionMapper.selectAll();
	}

	@Override
	public void insert(Permission permission) {
		permissionMapper.insert(permission);		
	}

}
