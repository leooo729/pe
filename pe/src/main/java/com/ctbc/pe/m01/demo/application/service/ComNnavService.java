package com.ctbc.pe.m01.demo.application.service;

import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ctbc.pe.m01.demo.application.dto.ComNnavDto;
import com.ctbc.pe.m01.demo.domain.gateway.ComNnavGateway;
import com.ctbc.pe.m01.demo.infrastructure.mapper.ComNnavMapper;
import com.ctbc.pe.m01.demo.application.query.ComNnavFindAllQry;
import com.ctbc.pe.m01.demo.application.command.ComNnavSaveAllCmd;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComNnavService {

	final ComNnavGateway gateway;

	public Page<ComNnavDto> query(ComNnavFindAllQry qry) {
		var pageEntity = gateway.findAll(qry.getPageable());
		return pageEntity.map(ComNnavMapper.INSTANCE::doEntity2Dto);
	}


	public void command(ComNnavSaveAllCmd cmd) {
		var listEntity = ComNnavMapper.INSTANCE.doDto2Entity(cmd.getListDto());
		gateway.saveAll(listEntity);
	}


}
