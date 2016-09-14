package com.bigbird.entity;

import java.io.Serializable;

public class SharesList implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -1562189203080947433L;

	private String symbol;

	private String name;

	private String trade;

	private String pricechange;

	private String changepercent;

	private String buy;

	private String sell;

	private String settlement;

	private String open;

	private String high;

	private String low;

	private String volume;

	private String amount;

	private String code;

	private String ticktime;

	public String getSymbol() {
		return symbol;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol == null ? null : symbol.trim();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name == null ? null : name.trim();
	}

	public String getTrade() {
		return trade;
	}

	public void setTrade(String trade) {
		this.trade = trade == null ? null : trade.trim();
	}

	public String getPricechange() {
		return pricechange;
	}

	public void setPricechange(String pricechange) {
		this.pricechange = pricechange == null ? null : pricechange.trim();
	}

	public String getChangepercent() {
		return changepercent;
	}

	public void setChangepercent(String changepercent) {
		this.changepercent = changepercent == null ? null : changepercent.trim();
	}

	public String getBuy() {
		return buy;
	}

	public void setBuy(String buy) {
		this.buy = buy == null ? null : buy.trim();
	}

	public String getSell() {
		return sell;
	}

	public void setSell(String sell) {
		this.sell = sell == null ? null : sell.trim();
	}

	public String getSettlement() {
		return settlement;
	}

	public void setSettlement(String settlement) {
		this.settlement = settlement == null ? null : settlement.trim();
	}

	public String getOpen() {
		return open;
	}

	public void setOpen(String open) {
		this.open = open == null ? null : open.trim();
	}

	public String getHigh() {
		return high;
	}

	public void setHigh(String high) {
		this.high = high == null ? null : high.trim();
	}

	public String getLow() {
		return low;
	}

	public void setLow(String low) {
		this.low = low == null ? null : low.trim();
	}

	public String getVolume() {
		return volume;
	}

	public void setVolume(String volume) {
		this.volume = volume == null ? null : volume.trim();
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount == null ? null : amount.trim();
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code == null ? null : code.trim();
	}

	public String getTicktime() {
		return ticktime;
	}

	public void setTicktime(String ticktime) {
		this.ticktime = ticktime == null ? null : ticktime.trim();
	}
}
