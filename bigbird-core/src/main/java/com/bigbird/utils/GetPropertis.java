package com.bigbird.utils;

import java.util.Properties;
import java.io.InputStream;
import java.io.IOException;

/**
 * 读取Properties文件
 */
public  class GetPropertis {
	public String getValueFromPropertis(String key,String path) {
		String value = null;
		Properties prop = new Properties();
		System.out.println(Object.class.getResource("").getPath());
		InputStream in = Object.class.getResourceAsStream(path);
		try {
			prop.load(in);
			value = prop.getProperty(key).trim();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return value;
	}
}
