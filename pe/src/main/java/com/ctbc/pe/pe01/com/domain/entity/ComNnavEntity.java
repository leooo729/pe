package com.ctbc.pe.pe01.com.domain.entity;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

import com.ctbc.pe.pe01.com.domain.gateway.ComNnavGateway;

import lombok.Data;
import lombok.RequiredArgsConstructor;


@Data
@RequiredArgsConstructor
public class ComNnavEntity {

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

	final ComNnavGateway gateway;

	public void save() {
		gateway.save(this);
	}


}
