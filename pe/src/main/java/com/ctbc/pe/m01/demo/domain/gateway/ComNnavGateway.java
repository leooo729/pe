package com.ctbc.pe.m01.demo.domain.gateway;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.ctbc.pe.m01.demo.domain.entity.ComNnavEntity;

public interface ComNnavGateway {

	public void save(ComNnavEntity entity);

	public void saveAll(List<ComNnavEntity> listEntity);

	public List<ComNnavEntity> findAll(Pageable pageable);

}
