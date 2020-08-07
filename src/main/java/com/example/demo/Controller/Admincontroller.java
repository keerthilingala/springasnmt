package com.example.demo.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.Dao.Admindao;
import com.example.demo.Dao.SupportAnalystdao;
import com.example.demo.Model.Admin;
import com.example.demo.Model.AdminLogin;
import com.example.demo.Model.SupportAnalyst;
import com.example.demo.Service.AdminServices;

@Controller
public class Admincontroller {
	@Autowired
	private Admindao dao;
	@Autowired
	private SupportAnalystdao sdao;
   
    @Autowired
    private AdminServices adminservices;
    
	@GetMapping(value="/admin")
	 public String admin(Model model) {
		 model.addAttribute("admin",new Admin());
		 return "Admin";
	 }
	@PostMapping(value="/adminreg")
	public String adminreg(@ModelAttribute("admin") Admin adminreg,Model model) {
		Admin ar= dao.save(adminreg);
		if(ar!=null) {
			model.addAttribute("message","Your details are submitted successfully.");
			return "Admin";
		}else {
			model.addAttribute("message","Something went wrong.");
			return "failure";
		}		
	}	
	@GetMapping(value="/adminlogin")
	public String adminlogin(Model model) {
		model.addAttribute("adminlogin", new AdminLogin());
		return "AdminLogin";
	}
	
	@PostMapping(value="/loginverify")
	public String loginverify(@ModelAttribute("adminlogin") AdminLogin adminlogin,Model model,HttpSession session)
	{
		Optional<Admin> al=dao.findById(adminlogin.getUserId());
		if(al.isPresent())
			
		{
			Admin a1=al.get();
			if(a1.getPassword().equals(adminlogin.getPassword()))
			{
				session.setAttribute("name", a1.getAdminId());
				return "AdminHome";
			}		
		}
		
		model.addAttribute("message", "Invalid userId or password");
		return "AdminLogin";
		
	}	
	
	@GetMapping(value="/adminlogout")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:/";
	}
	@GetMapping("/adminLogout")
	public String adminLogOut(HttpSession session)
	{
		session.invalidate();	
		return "redirect:/";
	}
	
	
	@GetMapping("/role1")
	public String role1()
	{

		return "Role";
	}
	@GetMapping("/user1")
	public String user1()
	{

		return "User";
	}
  
	@GetMapping("/dash1")
	public String dash1()
	{

		return "Dashboard";
	}
	@GetMapping("walmart1")
	public String walmart()
	{

		return "wrpt1";
	}
	@GetMapping("walmart2")
	public String walmarts()
	{

		return "wrpt2";
	}
	@GetMapping("trpt1")
	public String trpt()
	{

		return "trpt1";
	}
	@GetMapping("trpt2")
	public String trpt1()
	{

		return "trpt2";
	}
	
   }
