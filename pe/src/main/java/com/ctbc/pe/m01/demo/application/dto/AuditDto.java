package com.ctbc.pe.m01.demo.application.dto;


import lombok.Data;

@Data
public class AuditDto {

	String caseId; //案件代號
	String status; //狀態
	String desc;//備註

}
