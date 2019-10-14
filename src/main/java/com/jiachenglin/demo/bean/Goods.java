package com.jiachenglin.demo.bean;

import java.io.Serializable;
import java.math.BigDecimal;

public class Goods implements Serializable {
	private int gid;
	private String gname;
	private BigDecimal price;
	private int baifen;
	public int getGid() {
		return gid;
	}
	public void setGid(int gid) {
		this.gid = gid;
	}
	public String getGname() {
		return gname;
	}
	public void setGname(String gname) {
		this.gname = gname;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public int getBaifen() {
		return baifen;
	}
	public void setBaifen(int baifen) {
		this.baifen = baifen;
	}
}
