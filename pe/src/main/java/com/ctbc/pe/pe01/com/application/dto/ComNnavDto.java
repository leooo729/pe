package com.ctbc.pe.pe01.com.application.dto;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;

import lombok.Data;

@Data
public class ComNnavDto {

	String nnavCmdtyId;// VARCHAR2(10) PK

	LocalDate nnavDate;// DATE PK

	BigDecimal nnavNav;// DECIMAL(0,0)

	BigDecimal nnavBuy;// DECIMAL(0,0)

	BigDecimal nnavSell;// DECIMAL(0,0)

	BigDecimal nnavRoi1;// DECIMAL(0,0)

	BigDecimal nnavRoi3;// DECIMAL(0,0)

	BigDecimal nnavRoi6;// DECIMAL(0,0)

	BigDecimal nnavRoi12;// DECIMAL(0,0)

	String nnavLock;// CHAR(1)

	String nnavDelFlag;// CHAR(1)

	String nnavCrtUser;// VARCHAR2(16)

	LocalDateTime nnavCrtDate;// TIMESTAMP

	String nnavUpdUser;// VARCHAR2(16)

	LocalDateTime nnavUpdDate;// TIMESTAMP


}
