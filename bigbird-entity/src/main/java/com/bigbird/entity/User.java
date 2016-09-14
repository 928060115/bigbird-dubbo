package com.bigbird.entity;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -2813721915595650086L;

	private String id;
	private String nickyName;
	private String pwd;

	public User(String id, String nickyName, String pwd) {
		this.id = id;
		this.nickyName = nickyName;
		this.pwd = pwd;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNickyName() {
		return nickyName;
	}

	public void setNickyName(String nickyName) {
		this.nickyName = nickyName;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", nickyName=" + nickyName + ", pwd=" + pwd + "]";
	}
}
