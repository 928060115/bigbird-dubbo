package com.bigbird.web.controller;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bigbird.api.dubbo.SharesListService;
import com.bigbird.entity.SharesList;

@Controller
@RequestMapping(value="/shares")
public class SharesListContoller {

	private static Logger logger = LoggerFactory.getLogger(SharesListContoller.class);
	
	@Resource
	private SharesListService sharesListService;
	
	@RequestMapping(value="/selectByCode")
	@ResponseBody
	public SharesList selectByCode(String code){
		logger.debug("========================");
		return sharesListService.selectByCode(code);
	}
	
	@RequestMapping(value="/updateByPrimaryKeySelective")
	@ResponseBody
	public int updateByPrimaryKeySelective(String type, int page){
		return sharesListService.updateByPrimaryKeySelective(type, page);
	}
	
}
