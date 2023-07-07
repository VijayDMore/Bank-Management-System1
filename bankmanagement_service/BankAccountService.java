package com.jsp.bankmanagement_service;

import java.util.List;

import com.jsp.bankmanagement_dao.BankAccountDao;
import com.jsp.bankmanagement_dao.CustomerDao;
import com.jsp.bankmanagement_dto.BankAccount;

public class BankAccountService {
	BankAccountDao bankAccountDao = new BankAccountDao();

	public BankAccount saveBankAccount(BankAccount bankAccount) {

		return bankAccountDao.saveBankAccount(bankAccount);

	}

	public BankAccount getbyidBankAccount(int id) {

		return bankAccountDao.getbyidBankAccount(id);
	}
	
	

	public BankAccount deleteBankAccount(BankAccount bankAccount) {
		return bankAccountDao.deleteBankAccount(bankAccount);

	}
	

	public BankAccount updateBankAccount(BankAccount bankAccount, int id) {
		BankAccount bankAccount2 = bankAccountDao.getbyidBankAccount(id);

		if (bankAccount.getName() != null) {
			bankAccount2.setName(bankAccount.getName());
		}
		if (bankAccount.getAccount_no() != 0) {
			bankAccount2.setAccount_no(bankAccount.getAccount_no());

		}
		if (bankAccount.getBalance() != 0) {
			bankAccount2.setBalance(bankAccount.getBalance());
		}
		if (bankAccount.getIfsc() != null) {
			bankAccount2.setIfsc(bankAccount.getIfsc());
		}
		if (bankAccount2 != null) {
			bankAccount2.setBalance(500000);
			return bankAccountDao.updateBankAccount(bankAccount2);
		}
		return null;

	}

	public List<BankAccount> getAllBankAccounts() {

		return bankAccountDao.getAllAccounts();
	}

	

	}


