package com.ctbc.pe.pe01.com.application.service;

import java.util.List;

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


}
