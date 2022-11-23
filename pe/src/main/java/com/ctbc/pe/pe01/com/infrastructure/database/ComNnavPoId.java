package com.ctbc.pe.pe01.com.infrastructure.database;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;

import lombok.Data;


@Data
public class ComNnavPoId implements Serializable {

	private static final long serialVersionUID = 2L;

	String nnavCmdtyId;// VARCHAR2(10)

	LocalDate nnavDate;// DATE


}
