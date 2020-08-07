package com.example.demo.Service;

import java.util.List;

import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.SupportAnalyst;


public interface AdminServices {
	public int CreateAd(Admin admin);
	public int login(AdminLogin adminlogin);
	public List<SupportAnalyst> listsupportanalyst();
	public boolean assignRemedy(String inputString);
	public List<String> getAllAdminIDs();
	public Admin getAdminByContactNumber(String contactNumber);
	public Admin getAdmin(String username);
}
