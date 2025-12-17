package edu.kh.project.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.kh.project.main.model.service.MainService;
import edu.kh.project.member.model.dto.Member;

@Controller
public class MainController {
	
	@Autowired
	private MainService service;
	
	@RequestMapping("/") // "/" 요청 매핑
	public String mainPage() {
		
		// 접두사/접미사 제외
		// classpath:/templates/
		// .html
		return "common/main"; // forward
	}
	
	// LoginFilter 에서 로그인하지 않았을 때 리다이렉트로 요청
	@GetMapping("loginError")
	public String loginError(RedirectAttributes ra) {
		
		ra.addFlashAttribute("message", "로그인 후 이용해주세요~");
		
		return "redirect:/";
		
	}
	
	

	
	

	
	
	
	
	
}
