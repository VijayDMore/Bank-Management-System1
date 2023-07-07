package com.jsp.bankmanagement_dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jsp.bankmanagement_dto.Admin;
import com.jsp.bankmanagement_dto.BankAccount;
import com.jsp.bankmanagement_dto.Customer;

import net.bytebuddy.asm.Advice.Return;

public class BankAccountDao {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vijay");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction = entityManager.getTransaction();

	// =============To save BankAccount============//

	public BankAccount saveBankAccount(BankAccount bankAccount) {
		if (bankAccount != null) {

			entityTransaction.begin();
			entityManager.persist(bankAccount);
			entityTransaction.commit();

			return bankAccount;
		}

		return null;
	}

	// ==============To getbyid record================//

	public BankAccount getbyidBankAccount(int id) {

		return entityManager.find(BankAccount.class, id);

	}

	// ===================To Update BankAccount================//

	public BankAccount deleteBankAccount(BankAccount bankAccount) {

		entityTransaction.begin();
		entityManager.remove(bankAccount);
		entityTransaction.commit();

		return bankAccount;

	}

	// ===============================To Update BankAccount===================//

	public BankAccount updateBankAccount(BankAccount bankAccount) {

		if (bankAccount != null) {

			entityTransaction.begin();
			entityManager.merge(bankAccount);
			entityTransaction.commit();

			return bankAccount;
		}
		return null;
	}

	// ===================================TO GetALLACCOUNTS=====================//

	public List<BankAccount> getAllAccounts() {
		String sql = "select a from Account a";
		Query query = entityManager.createQuery(sql);
		List<BankAccount> bankaccounts = query.getResultList();
		for (BankAccount a : bankaccounts) {
			System.out.println(a.getAccount_no());
			System.out.println(a.getBalance());
			System.out.println(a.getIfsc());
			System.out.println(a.getName());
		}
		return bankaccounts;
	}

}
