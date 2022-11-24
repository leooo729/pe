package com.ctbc.pe.pe01.com.adaptor;

import com.ctbc.pe.pe01.com.application.dto.ComNnavDto;
import com.ctbc.pe.pe01.com.application.dto.request.QueryNetworthRequest;
import com.ctbc.pe.pe01.com.application.dto.response.NetWorthDto;
import com.ctbc.pe.pe01.com.infrastructure.database.ComNnavPo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import com.ctbc.pe.pe01.com.application.service.ComNnavService;

import lombok.RequiredArgsConstructor;

import java.util.List;

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
//	@GetMapping("/query")
//	public String getNnavs(@RequestParam(required = false) String cmdtyId, @RequestParam(required = false) String dateTime) {
//		log.info("cmdty_Id "+cmdtyId);
//		log.info("date_Time "+dateTime);
//		return cmdtyId+" ,"+dateTime;
//	}
	@GetMapping("/query")
	public List<NetWorthDto> getNnavs(@RequestBody QueryNetworthRequest request) {

		return nnavService.queryNetworth(request);
	}
	// BK0104_02 - 淨值資料維護提交
	// @PutMapping("/audit")
	// public String auditNnavs() {

	
	// }


}
