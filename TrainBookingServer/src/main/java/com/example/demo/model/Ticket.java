package com.example.demo.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Ticket {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer ticid;
	private Integer trcid;
	private Integer no;
	private Float totalamount;
	@JsonFormat(pattern="yyyy-MM-dd")
	private Date bodate;
	public Integer getTicid() {
		return ticid;
	}
	public void setTicid(Integer ticid) {
		this.ticid = ticid;
	}
	public Integer getTrcid() {
		return trcid;
	}
	public void setTrcid(Integer trcid) {
		this.trcid = trcid;
	}
	public Integer getNo() {
		return no;
	}
	public void setNo(Integer no) {
		this.no = no;
	}
	public Float getTotalamount() {
		return totalamount;
	}
	public void setTotalamount(Float totalamount) {
		this.totalamount = totalamount;
	}
	public Date getBodate() {
		return bodate;
	}
	public void setBodate(Date bodate) {
		this.bodate = bodate;
	}
	
	
	
	
	
	

}
