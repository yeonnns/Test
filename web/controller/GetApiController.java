package com.test.web.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.vo.UserRequest;
 
@RestController
@RequestMapping("/api/get") 
public class GetApiController {
	     
		// getMethod 생성 1 
		@GetMapping("/hello") // http://localhost:8080/api/get/hello
		public String getHello() {
			return "Get Hello!";
		}
		/*
		 	명시적 지정
		 	@GetMapping(path="/hello") // http://localhost:8080/api/get/hello
			public String getHello() {
				return "Get Hello!";
		}
		 	
		 */
		@RequestMapping(path="/hi", method=RequestMethod.GET) // http://localhost:8080/api/get/hi
		public String getHi() {
			return "Get Hi!";
		}
		
		// getMethod 생성 2
		@RequestMapping("/path-variable/{name}") // http://localhost:8080/api/get/path-variable/{name}
		public String pathVariable(@PathVariable(name = "name") String pathName) {
		
		System.out.println("Path Variable: " + pathName);
		
			return "Get Path Variable : " + pathName;
		}
		
		// getMethod 생성 3
		@RequestMapping("queryParam")
		public String queryParam01(
				@RequestParam String name,
				@RequestParam String email,
				@RequestParam int age
				) {
			System.out.println(name);
			System.out.println(email);
			System.out.println(age);
			return name + " " + email + " " + age;
		}
		
		public String queryParam02(UserRequest uVO) {
			System.out.println(uVO.getName());
			System.out.println(uVO.getEmail());
			System.out.println(uVO.getAge());
			return uVO.toString();
		}
		
}
