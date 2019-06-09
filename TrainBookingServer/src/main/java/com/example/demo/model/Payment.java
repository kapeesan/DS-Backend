package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Payment {
	
	@Id
	private Integer payid;
	private Integer ticid;
	private String paytype;
	private String name;
	private Long cardno;
	private Integer csvno;
	public Integer getPayid() {
		return payid;
	}
	public void setPayid(Integer payid) {
		this.payid = payid;
	}
	public Integer getTicid() {
		return ticid;
	}
	public void setTicid(Integer ticid) {
		this.ticid = ticid;
	}
	public String getPaytype() {
		return paytype;
	}
	public void setPaytype(String paytype) {
		this.paytype = paytype;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getCardno() {
		return cardno;
	}
	public void setCardno(Long cardno) {
		this.cardno = cardno;
	}
	public Integer getCsvno() {
		return csvno;
	}
	public void setCsvno(Integer csvno) {
		this.csvno = csvno;
	}
	
	

}
