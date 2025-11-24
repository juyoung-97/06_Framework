package edu.kh.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller // 요청 / 응답 제어 역할 명시 + Bean 등록
public class ExampleController {
	
	// 1) @RequestMapping("example")
	
	// 2) @GetMapping("example") : Get(조회) 방식 요청 매핑
	//	  @PostMapping("example") : Post(삽입) 방식 요청 매핑
	//	  @PutMapping("example") : Put(수정) 방식 요청 매핑
	//	  @DeleteMapping("example") : Delete(삭제) 방식 요청 매핑
	
	// "/"를 앞에 안붙히는 이유
	/*
	 * 1) Spring Boot 에서는 요청 주소 앞에 "/"가 없어도
	 * 요청 처리가 잘된다 ! (오류 발생 X)
	 * 
	 * 2) 프로젝트를 AWS 같은 호스팅 서비스를 이용하여 배포 시
	 *    만약 리눅스 os 를 이용하면 build 과정에서 경로 상 오류 발생...
	 *    
	 * */
	
	@GetMapping("example")
	public String exampleMethod() {
	
		// forward 하려는 html 파일 경로 return 작성
		// 단, ViewResolver가 제공하는
		// 타임리프의 접두사, 접미사는 제외하고 작성
		
		// 접두사 : classpath:/templates/
		// 접미사 : .html
		return "example";
		// src/main/resources/templates/example.html
	}
	
	
}
