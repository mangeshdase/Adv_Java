package com.cdac.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AccountDao {
	
	public void createAccount() {
		System.out.println("creating Account");
	}
	public void withdraw() {
		System.out.println("withdrawing amount");
	}
	public void deposite() {
		System.out.println("withdrawing deposite");
	}
	public void blocAccount() {
		
	}
}
