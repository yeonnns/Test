package com.test.web.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.web.vo.PutRequest;

@RestController
@RequestMapping("/api")
public class PutApiController {
	
	@PutMapping("/put")
	public PutRequest put(@RequestBody PutRequest ptVO) {
		System.out.println(ptVO);
		
		return ptVO;
	}
}
