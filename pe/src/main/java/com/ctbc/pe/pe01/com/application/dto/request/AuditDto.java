package com.ctbc.pe.pe01.com.application.dto.request;


import lombok.Data;

@Data
public class AuditDto {

	String caseId; //案件代號
	String status; //狀態
	String desc;//備註

}
