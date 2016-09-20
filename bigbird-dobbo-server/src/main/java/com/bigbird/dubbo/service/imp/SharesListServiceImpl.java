package com.bigbird.dubbo.service.imp;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.alibaba.dubbo.config.annotation.Service;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bigbird.api.dubbo.SharesListService;
import com.bigbird.entity.SharesList;
import com.bigbird.utils.Utils;
import com.bigbird.shareslist.dao.SharesListMapper;

@Service
public class SharesListServiceImpl implements SharesListService {

	private static Logger logger = LoggerFactory.getLogger(SharesListServiceImpl.class);
	static String apiUrl = new SharesListServiceImpl().getValueFromPropertis("apiUrl", "/config.properties");
	static String appkey = new SharesListServiceImpl().getValueFromPropertis("APPKEY", "/config.properties");
	
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
	public int updateByPrimaryKeySelective(String type, int page) {
		SharesList sharesList = new SharesList();
		String response = null;
		int result = 0;
		String url = apiUrl + type;// ����ӿڵ�ַ
		Map<String, String> params = new HashMap<String, String>();// �������
		params.put("key", appkey);// �������APPKEY
		params.put("page", String.valueOf(page));// �ڼ�ҳ,ÿҳ20�����,Ĭ�ϵ�1ҳ
		try {
			response = Utils.netRequest(url, params, "GET");
			System.out.println(response);
			JSONObject responseJson = JSONObject.parseObject(response);
			JSONObject resultJson = responseJson.getJSONObject("result");
			if (responseJson.getIntValue("error_code") == 0) {
				JSONArray data = resultJson.getJSONArray("data");
				for (int i = 0; i < data.size(); i++) {
					sharesList.setSymbol(data.getJSONObject(i).getString("symbol"));
					sharesList.setName(data.getJSONObject(i).getString("name"));
					sharesList.setTrade(data.getJSONObject(i).getString("trade"));
					sharesList.setPricechange(data.getJSONObject(i).getString("pricechange"));
					sharesList.setChangepercent(data.getJSONObject(i).getString("changepercent"));
					sharesList.setBuy(data.getJSONObject(i).getString("buy"));
					sharesList.setSell(data.getJSONObject(i).getString("sell"));
					sharesList.setSettlement(data.getJSONObject(i).getString("settlement"));
					sharesList.setOpen(data.getJSONObject(i).getString("open"));
					sharesList.setHigh(data.getJSONObject(i).getString("high"));
					sharesList.setLow(data.getJSONObject(i).getString("low"));
					sharesList.setVolume(data.getJSONObject(i).getString("volume"));
					sharesList.setAmount(data.getJSONObject(i).getString("amount"));
					sharesList.setCode(data.getJSONObject(i).getString("symbol").substring(2));
					sharesList.setTicktime(data.getJSONObject(i).getString("ticktime"));
					result = sharesListMapper.updateByPrimaryKeySelective(sharesList);
				}
				logger.info("����ɹ�");
			} else {
				logger.error(responseJson.get("error_code") + ":" + responseJson.get("reason"));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	@Override
	public int updateByPrimaryKey(SharesList record) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getValueFromPropertis(String key,String path) {
		String value = null;
		Properties prop = new Properties();
		InputStream in = SharesListServiceImpl.class.getResourceAsStream(path);
		try {
			prop.load(in);
			value = prop.getProperty(key).trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
	
}
