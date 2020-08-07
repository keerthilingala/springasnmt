package com.example.demo.Service;
import java.util.List;


import com.example.demo.Model.SupportAnalyst;
import com.example.demo.Model.SupportAnalystLogin;

public interface SupportAnalystServices {
	public int CreateSupportAnalyst(SupportAnalyst supportanalyst);
	public int login(SupportAnalystLogin supportanalystlogin);
	public List<SupportAnalyst> getSupportAnalystList();
	public SupportAnalyst getSupportAnalystById(String id);
	public boolean updateSupportAnalyst(SupportAnalyst sanalyst);
	public SupportAnalyst getAnalystByContactNumber(String contactNumber);
	public SupportAnalyst getSupportAnalyst(String username);

}
