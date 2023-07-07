package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_dto.BankManager;
import com.jsp.bankmanagement_service.BankManagerService;

public class SaveBankManager {
public static void main(String[] args) {
	BankManager bankManager=new BankManager();
	
	bankManager.setName("AAru254");
	bankManager.setGmail("aarubhau@gmail.com");

	bankManager.setCno(254485754);
	bankManager.setStatus("Unapproved");

	
	BankManagerService bankManagerService=new BankManagerService();
	
	//bankManagerService.saveBankManager(bankManager);
	
	BankManager bankManager2=bankManagerService.saveBankManager(bankManager);
if (bankManager2!=null) {
	System.out.println("BankManager saved successfully");
	}else {
		System.out.println("BankManager not saved");
		
		
	}
}
}

