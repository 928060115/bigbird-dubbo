package com.bigbird.shareslist.dao;

import com.bigbird.entity.SharesList;

public interface SharesListMapper {
	int deleteByPrimaryKey(String symbol);

	int insert(SharesList record);

	int insertSelective(SharesList record);

	SharesList selectByPrimaryKey(String symbol);

	SharesList selectByCode(String code);

	int updateByPrimaryKeySelective(SharesList record);

	int updateByPrimaryKey(SharesList record);
}
