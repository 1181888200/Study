package com.lwl.boot.mybatis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lwl.boot.mybatis.model.Permission;
import com.lwl.boot.mybatis.service.IPermissionService;

@RestController
public class PermissionController {

	@Autowired
	private IPermissionService permissionService;
	
	@RequestMapping("/selectAll")
	public List<Permission> selectAll(){
		return permissionService.selectAll();
	}
	
	@RequestMapping("/insert")
	public Permission save(String name,String resource){
		Permission permission = new Permission();
		permission.setName(name);
		permission.setResource(resource);
		permissionService.insert(permission);
		return permission;
	}
//	
}
