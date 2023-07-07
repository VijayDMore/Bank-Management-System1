package com.jsp.bankmanagement_service;

import java.util.List;

import com.jsp.bankmanagement_dao.AdminDao;
import com.jsp.bankmanagement_dto.Admin;
import com.jsp.bankmanagement_dto.BankManager;

public class AdminService {
     AdminDao adminDao=new AdminDao();
	
	public Admin saveAdmin(Admin admin) {
		return adminDao.saveAdmin(admin);

	}
	public Admin updateAdminName(int id, String name) {
        return adminDao.updateAdminName(id,name);
	}
	
	public Admin updateAdminEmail(int id,String email) {
		return adminDao.updateAdminEmail(id, email);

	}
	public Admin updateAdminCno(int id, long c_no) {
		return adminDao.updateAdminCno(id, c_no);
	}
	public boolean deleteAdmin(int id) {
		return adminDao.deleteAdmin(id);
	}
	public Admin getById(int id) {
		return adminDao.getById(id);
	}
	public List<Admin> getAllAdmin(){
		return adminDao.getAllAdmin();
	}
	public List<BankManager> approvedAllManager(int adminId){
		return adminDao.approvedAllManager(adminId);
		
	}
	 public BankManager approvedBankManager(int bankManagerId,int adminId) {
		 return adminDao.approvedBankManager(bankManagerId, adminId);
	 }
	
	
}