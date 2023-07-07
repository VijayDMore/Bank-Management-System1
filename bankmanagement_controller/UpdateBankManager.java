package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_service.BankManagerService;

public class UpdateBankManager {
	public static void main(String[] args) {
		BankManagerService bankManagerService = new BankManagerService();

		bankManagerService.updateBankManager(2, "vijay");
		bankManagerService.updateBankManagerGmail(2, "vijaymore@gmail.com");
		bankManagerService.updateBankManagerCno(1, 254871245);
	
	}
}
