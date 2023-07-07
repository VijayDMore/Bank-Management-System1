package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_dto.BankAccount;
import com.jsp.bankmanagement_service.BankAccountService;


public class UpdateBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();

		bankAccount.setAccount_no(12458);
		bankAccount.setIfsc("MAHB000452");
		bankAccount.setBalance(2500000);
		bankAccount.setName("raju");


		BankAccountService bankAccountService = new BankAccountService();

		BankAccount bankAccount2 = bankAccountService.updateBankAccount(bankAccount, 10);

		if (bankAccount2 != null) {
			System.out.println("Account has been updated");
		}

	}
}
