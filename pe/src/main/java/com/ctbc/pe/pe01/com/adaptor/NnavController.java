package com.ctbc.pe.pe01.com.adaptor;

import com.ctbc.pe.pe01.com.application.dto.ComNnavDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctbc.pe.pe01.com.application.service.ComNnavService;

import lombok.RequiredArgsConstructor;

@RequestMapping("/api/com/networth")
@RestController
@RequiredArgsConstructor
@Slf4j
public class NnavController {

	final ComNnavService nnavService; // Application Service Dependency


////	 BK0104_01 - 淨值資料維護查詢
//	 @GetMapping("/query")
//	 public Page<ComNnavDto> getNnavs(@RequestParam(required = false) String cmdtyId, @RequestParam(required = false) String dateTime) {
//
//
//	 }

	//	 BK0104_01 - 淨值資料維護查詢
	@GetMapping("/query")
	public String getNnavs(@RequestParam(required = false) String cmdtyId, @RequestParam(required = false) String dateTime) {
		log.info("cmdty_Id "+cmdtyId);
		log.info("date_Time "+dateTime);
		return cmdtyId+" ,"+dateTime;
	}
	// BK0104_02 - 淨值資料維護提交
	// @PutMapping("/audit")
	// public String auditNnavs() {

	
	// }


}
