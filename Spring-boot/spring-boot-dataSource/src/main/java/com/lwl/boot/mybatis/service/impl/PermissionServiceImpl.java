package com.lwl.boot.mybatis.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lwl.boot.mybatis.mapper.PermissionMapper;
import com.lwl.boot.mybatis.model.Permission;
import com.lwl.boot.mybatis.service.IPermissionService;

@Service
//@Transactional
public class PermissionServiceImpl implements IPermissionService {

	@Autowired
	private PermissionMapper permissionMapper;
	
//	@Transactional(readOnly=true)
	@Override
	public List<Permission> selectAll() {
		return permissionMapper.selectAll();
	}

	@Override
	public void insert(Permission permission) {
		permissionMapper.insert(permission);
		int i = 1 /0 ;
	}

}
