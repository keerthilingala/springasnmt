package com.example.demo.Service;



import java.security.Security;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.example.demo.Dao.Admindao;
import com.example.demo.Dao.SupportAnalystdao;
import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.SupportAnalyst;

@Service
@Component
public class AdminServicesImpl implements AdminServices {
	@Autowired
	private Admindao dao;
	
	@Autowired
	private SupportAnalystdao supportDao;

	
	@Override
	public int CreateAd(Admin admin) {
		Admin a=dao.findByAdminId(admin.getAdminId());
		if(a==null) {
			Admin a1=dao.save(admin);
			if (a1 != null) {
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
	}

	@Override
	public int login(AdminLogin adminlogin) {
		Admin a =dao.findByAdminId(adminlogin.getUserId());
		 if(a==null)
		 {
		   return 1;
		 }
		 else
		 {
		 return 2;
		 }
}
	
	@Override
	public List<SupportAnalyst> listsupportanalyst() {
		// TODO Auto-generated method stub
		return null;
	}

	
	

	@Override
	public List<String> getAllAdminIDs() {

         List<String> ids = new ArrayList<String>();
		
		
         dao.findAll().forEach(t->{
        	 
        	 ids.add(t.getAdminId());
        	 
         });
		return ids;
	}

	@Override
	public Admin getAdmin(String username) {
		
		return dao.findByAdminId(username);
	}

	@Override
	public Admin getAdminByContactNumber(String contactNumber) {
		// TODO Auto-generated method stub
		return dao.findBycontactNumber(contactNumber);
	}

	@Override
	public boolean assignRemedy(String inputString) {
		// TODO Auto-generated method stub
		return false;
	}


}
	

	
	