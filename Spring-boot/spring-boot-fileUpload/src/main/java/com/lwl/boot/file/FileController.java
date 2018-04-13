package com.lwl.boot.file;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class FileController {

	//读取配置文件中 文件的保存路径
	@Value("${file.path}")
	private String filePath;
	
	@RequestMapping("/upload")
	@ResponseBody
	public String upload(MultipartFile file) throws FileNotFoundException, IOException {
		
		//获取上传文件的后缀
		String extName = file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
		//重命名文件名称
		String fileName = UUID.randomUUID().toString()+extName;
		//将文件保存到指定目录下
		FileCopyUtils.copy(file.getInputStream(), new FileOutputStream(new File(filePath+fileName)));
		
		return filePath+fileName;
	}
	
}
