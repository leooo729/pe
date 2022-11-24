package com.ctbc.pe.pe01.com.application.service;


import java.time.LocalDate;
import java.util.List;

import com.ctbc.pe.pe01.com.application.dto.request.QueryNetworthRequest;
import com.ctbc.pe.pe01.com.application.dto.response.NetWorthDto;
import org.springframework.stereotype.Service;

import com.ctbc.pe.pe01.com.application.command.ComNnavSaveAllCmd;
import com.ctbc.pe.pe01.com.application.dto.ComNnavDto;
import com.ctbc.pe.pe01.com.application.query.ComNnavFindAllQry;
import com.ctbc.pe.pe01.com.domain.gateway.ComNnavGateway;
import com.ctbc.pe.pe01.com.infrastructure.mapper.ComNnavMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComNnavService {

    final ComNnavGateway gateway;

    public List<ComNnavDto> query(ComNnavFindAllQry qry) {
        var pageEntity = gateway.findAll(qry.getPageable());
        return ComNnavMapper.INSTANCE.doEntity2Dto(pageEntity);
    }

    public void command(ComNnavSaveAllCmd cmd) {
        var listEntity = ComNnavMapper.INSTANCE.doDto2Entity(cmd.getListDto());
        gateway.saveAll(listEntity);
    }

//    public List<ComNnavDto> queryNetworth(QueryNetworthRequest request) {
//        List<ComNnavPo> comNnavPoList;
//        if (request.getYearMonth().isEmpty()) {
//            comNnavPoList = comNnavJpaRepository.findByNnavCmdtyId(request.getCharterId());
//            System.out.println(comNnavPoList.get(1).getNnavDate());
//        }
//    return comNnavPoList;
//    }
    public List<NetWorthDto> queryNetworth(QueryNetworthRequest request) {

        var listEntity = gateway.query(request.getCharterId(), LocalDate.parse(request.getYearMonth()));
        return ComNnavMapper.INSTANCE.doEntity2NDto(listEntity);
    }
}
