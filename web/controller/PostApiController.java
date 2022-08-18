package com.test.web.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.vo.PostRequest;

@RestController
@RequestMapping("/api")
public class PostApiController {
	
	// postMethod 생성 1
	@PostMapping("/post")
		// get방식은 @RequestParam 으로 변수의 값을 받아왔다면
		// post 방식은 @RequestBody 사용해서 받아와야 한다.
	public void post(@RequestBody Map<String, Object> requestData) {
		requestData.forEach((key, value) -> {
			System.out.println("keys:" + key);
			System.out.println("value:" + value);
		});
	}

	// getMethod 생성 2 
	@PostMapping("/post-dto")
	public void postDto(@RequestBody PostRequest pVO) {
		System.out.println(pVO);
	}
	
	
	
	
}
