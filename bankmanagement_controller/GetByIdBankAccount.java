package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_dto.BankAccount;
import com.jsp.bankmanagement_service.BankAccountService;

public class GetByIdBankAccount {
	public static void main(String[] args) {

		BankAccountService bankAccountService = new BankAccountService();
		BankAccount bankAccount = bankAccountService.getbyidBankAccount(8);

		System.out.println("Account Id       : " + bankAccount.getId());
		System.out.println("Account Name     : " + bankAccount.getName());
		System.out.println("Account Acc_no   : " + bankAccount.getAccount_no());
		System.out.println("Account IFSC_code: " + bankAccount.getIfsc());
		System.out.println("Account Balance  : " + bankAccount.getAccount_no());

	}
}
