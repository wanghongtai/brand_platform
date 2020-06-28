package com.gqgx.common.service.impl;

import com.gqgx.common.entity.vo.UploadFileVo;
import com.gqgx.common.service.FileUploadService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUpLoadServiceImpl implements FileUploadService {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public UploadFileVo uploadFile(MultipartFile uploadFile) {

		return null;
	}
}
