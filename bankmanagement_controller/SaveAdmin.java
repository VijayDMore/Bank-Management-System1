package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_dto.Admin;
import com.jsp.bankmanagement_service.AdminService;

public class SaveAdmin {
	public static void main(String[] args) {
		Admin admin = new Admin();
		admin.setName("Om");
		admin.setEmail("om@gmail.com");
		admin.setC_no(62245245659l);
		/*
		 * admin.setName("vijay"); admin.setEmail("vijbdgvd@124");
		 * admin.setC_no(25415247);
		 */
		AdminService adminService = new AdminService();
		Admin a=adminService.saveAdmin(admin);
		if(a!=null) {
			System.out.println("Admin saved...");
		}else {
			System.out.println("Not saved");
		}
	}
}
