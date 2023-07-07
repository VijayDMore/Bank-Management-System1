package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_dto.BankAccount;
import com.jsp.bankmanagement_service.BankAccountService;
import com.jsp.bankmanagement_service.CustomerService;

import com.jsp.dto.Customer;

public class SaveBankAccount {
	public static void main(String[] args) {
		BankAccount bankAccount = new BankAccount();
		
		//Enter the account no
		bankAccount.setAccount_no(43255632);
		
		//Enter the name
		bankAccount.setName("omkar");

		// Enter the ifsc_code
		bankAccount.setIfsc("MAHB6545");

		// Enter the amount
		bankAccount.setBalance(1015);

		 CustomerService customerService = new CustomerService();

		// ===================== Enter the bankAccount and customerId================//

		 customerService.saveBankAccount(bankAccount, 2);

		// =================save bank account=============//
		/*
		 * BankAccountService bankAccountService = new BankAccountService();
		 * 
		 * BankAccount b1 = bankAccountService.saveBankAccount(bankAccount); if (b1 !=
		 * null) { System.out.println("save Account Sucessfully "); } else {
		 * System.out.println("not save Account Sucessfully"); }
		 */

	}
}
