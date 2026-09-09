package com.main.Exception;

import rushi.main.Strings.intern;

enum AccountType{
	SAVINGS,
	CURRENT,
	SALARY
}
class Account{
	private int  accountno;
	private String  accountName;
	private AccountType accountType;
	
	Account(int accountno,String accountName,AccountType accountType){
		this.accountno=accountno;
		this.accountName = accountName;
		this.accountType = accountType;
		System.out.println(accountno + " " + accountName + " " + accountType);
	}
}


public class MyClass {
	public static void main(String[] args) {
	new Account(101, "RBI",AccountType.CURRENT);
		
	}

}
