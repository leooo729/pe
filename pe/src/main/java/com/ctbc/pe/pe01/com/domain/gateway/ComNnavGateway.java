package com.ctbc.pe.pe01.com.domain.gateway;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ctbc.pe.pe01.com.domain.entity.ComNnavEntity;

public interface ComNnavGateway {

	public void save(ComNnavEntity entity);

	public void saveAll(List<ComNnavEntity> listEntity);

	public List<ComNnavEntity> findAll(Pageable pageable);

}
