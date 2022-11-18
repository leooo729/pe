package com.ctbc.pe.m01.demo.infrastructure.database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.IdClass;
import javax.persistence.Id;
import javax.persistence.Table;

import com.ctbc.pe.util.CharConverter;

import lombok.Data;


@Data
@Entity
@IdClass(ComNnavPoId.class)
@Table(name = "COM_NNAV")
public class ComNnavPo implements Serializable {

	private static final long serialVersionUID = 15L;

	@Id
	@Column(name = "NNAV_CMDTY_ID")
	String nnavCmdtyId;// VARCHAR2(10) PK

	@Id
	@Column(name = "NNAV_DATE")
	LocalDate nnavDate;// DATE PK

	@Column(name = "NNAV_NAV")
	BigDecimal nnavNav;// DECIMAL(0,0)

	@Column(name = "NNAV_BUY")
	BigDecimal nnavBuy;// DECIMAL(0,0)

	@Column(name = "NNAV_SELL")
	BigDecimal nnavSell;// DECIMAL(0,0)

	@Column(name = "NNAV_ROI_1")
	BigDecimal nnavRoi1;// DECIMAL(0,0)

	@Column(name = "NNAV_ROI_3")
	BigDecimal nnavRoi3;// DECIMAL(0,0)

	@Column(name = "NNAV_ROI_6")
	BigDecimal nnavRoi6;// DECIMAL(0,0)

	@Column(name = "NNAV_ROI_12")
	BigDecimal nnavRoi12;// DECIMAL(0,0)

	@Column(name = "NNAV_LOCK")
	@Convert(converter = CharConverter.class)
	String nnavLock;// CHAR(1)

	@Column(name = "NNAV_DEL_FLAG")
	@Convert(converter = CharConverter.class)
	String nnavDelFlag;// CHAR(1)

	@Column(name = "NNAV_CRT_USER")
	String nnavCrtUser;// VARCHAR2(16)

	@Column(name = "NNAV_CRT_DATE")
	LocalDateTime nnavCrtDate;// TIMESTAMP

	@Column(name = "NNAV_UPD_USER")
	String nnavUpdUser;// VARCHAR2(16)

	@Column(name = "NNAV_UPD_DATE")
	LocalDateTime nnavUpdDate;// TIMESTAMP


}
