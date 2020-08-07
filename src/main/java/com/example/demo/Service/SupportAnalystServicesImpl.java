package com.example.demo.Service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


import com.example.demo.Dao.SupportAnalystdao;
import com.example.demo.Model.SupportAnalyst;
import com.example.demo.Model.SupportAnalystLogin;

@Service
@Component
public class SupportAnalystServicesImpl implements SupportAnalystServices {
   @Autowired
   private SupportAnalystdao dao;
  
	@Override
	public int CreateSupportAnalyst(SupportAnalyst supportanalyst) {
		SupportAnalyst e=dao.findByAnalystId(supportanalyst.getAnalystId());
		if(e==null) {
			SupportAnalyst sa1=dao.save(supportanalyst);
			if (sa1 != null) {
				return 1;
			} else {
				return 2;
			}
		}
		return 0;
		
	}

	@Override
	public int login(SupportAnalystLogin supportanalystlogin) {
		SupportAnalyst sa=dao.findByAnalystId(supportanalystlogin.getUserId());
		 if(sa==null)
		 {
		   return 1;
		 }
		 else
		 {
		 return 2;
		 }

	}


	
	@Override
	public List<SupportAnalyst> getSupportAnalystList() {
		// TODO Auto-generated method stub
		Iterable<SupportAnalyst>list=dao.findAll();
		if(list==null) {
			return null;
		}
		return (List<SupportAnalyst>) list;
	}

	@Override
	public SupportAnalyst getSupportAnalystById(String id) {
		// TODO Auto-generated method stub
		
		SupportAnalyst sanalyst=dao.findByAnalystId(id);
		return sanalyst;
	}

	
	@Override
	public boolean updateSupportAnalyst(SupportAnalyst sanalyst) {
		// TODO Auto-generated method stub
		SupportAnalyst sanalyst1=dao.save(sanalyst);
		if(sanalyst1!=null) {
			return true;
		}
		return false;
	}


	
	@Override
	public SupportAnalyst getSupportAnalyst(String username) {
		
		return dao.findByAnalystId(username);
	}

	@Override
	public SupportAnalyst getAnalystByContactNumber(String contactNumber) {
		// TODO Auto-generated method stub
		return dao.findBycontactNumber(contactNumber);
	}

	

}
