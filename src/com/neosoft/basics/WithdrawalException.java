package com.neosoft.basics;

public class WithdrawalException extends RuntimeException {

	private String msg;
	public WithdrawalException(String msg) {
		// TODO Auto-generated constructor stub
		this.msg=msg;
	}
	
	public String getMassege() {
		return msg;
	}
	
}
