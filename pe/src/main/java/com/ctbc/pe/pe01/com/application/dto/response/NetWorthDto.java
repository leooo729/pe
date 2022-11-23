package com.ctbc.pe.pe01.com.application.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NetWorthDto {
    private String charterId;
    private Date navDate;//    YYYY/MM/DD
    private Number navValue; //NAV_UNIT_QTY
    private String isLock;//被使用就需鎖定
    private String updUser;
    private Timestamp updDate;//    YYYY/MM/DD hh：mm：ss

}
