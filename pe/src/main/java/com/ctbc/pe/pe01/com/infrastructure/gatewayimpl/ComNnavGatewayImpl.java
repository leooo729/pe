package com.ctbc.pe.pe01.com.infrastructure.gatewayimpl;

import java.time.LocalDate;
import java.util.List;

import com.ctbc.pe.pe01.com.application.dto.request.QueryNetworthRequest;
import com.ctbc.pe.pe01.com.infrastructure.database.ComNnavPo;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ctbc.pe.pe01.com.domain.entity.ComNnavEntity;
import com.ctbc.pe.pe01.com.domain.gateway.ComNnavGateway;
import com.ctbc.pe.pe01.com.infrastructure.database.ComNnavJpaRepository;
import com.ctbc.pe.pe01.com.infrastructure.mapper.ComNnavMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComNnavGatewayImpl implements ComNnavGateway {

	final ComNnavJpaRepository jpaRepository;

	public void save(ComNnavEntity entity) {
		var po = ComNnavMapper.INSTANCE.doEntity2Po(entity);
		jpaRepository.save(po);
	}

	public void saveAll(List<ComNnavEntity> listEntity) {
		var listPo = ComNnavMapper.INSTANCE.doEntity2Po(listEntity);
		jpaRepository.saveAll(listPo);
	}


	public List<ComNnavEntity> findAll(Pageable pageable) {
		var pagePo = jpaRepository.findAll();
		return ComNnavMapper.INSTANCE.doPo2Entity(pagePo);
	}

	public List<ComNnavEntity>query(String id , LocalDate date){
		var listPo=jpaRepository.findByNnavCmdtyIdAndNnavDate(id,date);
		return ComNnavMapper.INSTANCE.doPo2Entity(listPo);
	}

}
