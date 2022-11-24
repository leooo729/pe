package com.ctbc.pe.pe01.com.domain.gateway;

import java.time.LocalDate;
import java.util.List;

import com.ctbc.pe.pe01.com.application.dto.request.QueryNetworthRequest;
import org.springframework.data.domain.Pageable;

import com.ctbc.pe.pe01.com.domain.entity.ComNnavEntity;

public interface ComNnavGateway {

	public void save(ComNnavEntity entity);

	public void saveAll(List<ComNnavEntity> listEntity);

	public List<ComNnavEntity> findAll(Pageable pageable);

	public List<ComNnavEntity>query(String id, LocalDate date);

}
