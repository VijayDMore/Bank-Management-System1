package com.jsp.bankmanagement_controller;

import com.jsp.bankmanagement_service.AdminService;

//enter the update id and enter the field
public class UpdateAdmin {
	public static void main(String[] args) {
		AdminService adminService=new AdminService();
			adminService.updateAdminName(11,"Saurabh");
			/* adminService.updateAdminEmail(6,"ok@email.com"); */
			/* adminService.updateAdminCno(4,8657424589l); */
	}
}
