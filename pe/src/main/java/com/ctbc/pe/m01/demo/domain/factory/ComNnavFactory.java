package com.ctbc.pe.m01.demo.domain.factory;

import org.springframework.stereotype.Service;

import com.ctbc.pe.m01.demo.domain.entity.ComNnavEntity;
import com.ctbc.pe.m01.demo.domain.gateway.ComNnavGateway;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComNnavFactory {

	final ComNnavGateway gateway;

	public ComNnavEntity makeEntity() {
		return new ComNnavEntity(gateway);
	}


}
