package com.ctbc.pe.m01.demo.adaptor;

import java.util.List;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.domain.Page;
import com.ctbc.pe.m01.demo.application.service.ComNnavService;
import com.ctbc.pe.m01.demo.application.query.ComNnavFindAllQry;
import com.ctbc.pe.m01.demo.application.dto.ComNnavDto;


import lombok.RequiredArgsConstructor;

@RequestMapping("/api/com/networth")
@RestController
@RequiredArgsConstructor
public class NnavController {

	final ComNnavService nnavService; // Application Service Dependency


	// BK0104_01 - 淨值資料維護查詢
	// @GetMapping("/query")
	// public Page<ComNnavDto> getNnavs(@RequestParam(required = false) String cmdtyId,@RequestParam(required = false) String dateTime) {

	// 	// Page<ComNnavDto> nnavs = nnavService.query(qry);

	// 	return nnavService.query(qry);
	// }

	// BK0104_02 - 淨值資料維護提交
	// @PutMapping("/audit")
	// public String auditNnavs() {

	
	// }


}
