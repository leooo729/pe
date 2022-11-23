package com.ctbc.pe.pe01.com.adaptor;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctbc.pe.pe01.com.application.service.ComNnavService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api/com/networth")
@RestController
@RequiredArgsConstructor
public class NnavController {

	final ComNnavService nnavService; // Application Service Dependency


	// BK0104_01 - 淨值資料維護查詢
	// @GetMapping("/query")
	// public Page<ComNnavDto> getNnavs(@RequestParam(required = false) String cmdtyId,@RequestParam(required = false) String dateTime) {


	// }

	// BK0104_02 - 淨值資料維護提交
	// @PutMapping("/audit")
	// public String auditNnavs() {

	
	// }


}
