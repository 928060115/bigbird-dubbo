package com.bigbird.dubbo.service.imp;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bigbird.api.dubbo.SharesListService;
import com.bigbird.base.BaseModel;
import com.bigbird.entity.SharesList;
import com.bigbird.shareslist.dao.SharesListMapper;

@Service
public class SharesListServiceImpl implements SharesListService {

	private static Logger logger = LoggerFactory.getLogger(SharesListServiceImpl.class);
	
	@Resource
	private SharesListMapper sharesListMapper;
	
	@Override
	public int deleteByPrimaryKey(String symbol) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(SharesList record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(SharesList record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public SharesList selectByPrimaryKey(String symbol) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public SharesList selectByCode(String code) {
		SharesList sharesList = sharesListMapper.selectByCode(code);
		return sharesList;
	}

	@Override
	public int updateByPrimaryKeySelective(SharesList record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(SharesList record) {
		// TODO Auto-generated method stub
		return 0;
	}

}
