package com.ctbc.pe.m01.demo.infrastructure.gatewayimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ctbc.pe.m01.demo.domain.entity.ComNnavEntity;
import com.ctbc.pe.m01.demo.domain.gateway.ComNnavGateway;
import com.ctbc.pe.m01.demo.infrastructure.database.ComNnavJpaRepository;
import com.ctbc.pe.m01.demo.infrastructure.mapper.ComNnavMapper;

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


	public Page<ComNnavEntity> findAll(Pageable pageable) {
		var pagePo = jpaRepository.findAll(pageable);
		return pagePo.map(ComNnavMapper.INSTANCE::doPo2Entity);
	}


}
