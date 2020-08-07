package com.example.demo.Controller;

import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Dao.SupportAnalystdao;

import com.example.demo.Model.SupportAnalyst;
import com.example.demo.Model.SupportAnalystLogin;
import com.example.demo.Service.SupportAnalystServices;


@Controller
public class SupportAnalystController {
	@Autowired
	private SupportAnalystdao dao;
	
	@Autowired
	private SupportAnalystServices supportanalystservice;
	@GetMapping(value = "/supportanalyst")
	public String supportanalyst(Model model) {
		model.addAttribute("supportanalyst", new SupportAnalyst());
		return "SupportAnalyst";
	}

	@PostMapping(value = "/supportanalystreg")
	public String adminreg(@ModelAttribute("supportanalyst") SupportAnalyst adminreg, Model model) {
		
		SupportAnalyst ar = dao.save(adminreg);
		if (ar != null) {
			model.addAttribute("message", "Your details are submitted successfully.");
			return "SupportAnalyst";
		} else {
			model.addAttribute("message", "Oops...Something went wrong.");
			return "failure";
		}
	}

	@GetMapping(value = "/supportanalystlogin")
	public String adminlogin(Model model) {
		model.addAttribute("supportanalystlogin", new SupportAnalystLogin());
		return "SupportAnalystLogin";
	}

	@PostMapping(value = "/supportanalystverify")
	public String branchloginverify(@ModelAttribute("supportanalystlogin") SupportAnalystLogin supportanalystlogin, Model model,
			HttpSession session) {
		Optional<SupportAnalyst> al = dao.findById(supportanalystlogin.getUserId());
	
		if (al.isPresent()) {
			SupportAnalyst badmin = al.get();
			if (badmin.getPassword().equals(supportanalystlogin.getPassword())) {
				session.setAttribute("username", badmin.getAnalystId());
				return "SupportAnalystHome";
			}
			
		}
		model.addAttribute("message", "Invalid userId or password");
		return "SupportAnalystLogin";
	}
	@GetMapping(value="/supportanalystlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("/wr1")
	public String wwal()
	{

		return "wwrptt1";
	}
	@GetMapping("/wr2")
	public String wals()
	{

		return "wwrptt2";
	}
	
}

