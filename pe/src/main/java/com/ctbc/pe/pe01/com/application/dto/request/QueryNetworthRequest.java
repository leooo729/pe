package com.ctbc.pe.pe01.com.application.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class QueryNetworthRequest {
    private String charterId;
    private String yearMonth;//可為空 yyyy/MM
}
