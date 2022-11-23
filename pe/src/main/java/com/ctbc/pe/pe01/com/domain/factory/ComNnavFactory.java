package com.ctbc.pe.pe01.com.domain.factory;

import org.springframework.stereotype.Service;

import com.ctbc.pe.pe01.com.domain.entity.ComNnavEntity;
import com.ctbc.pe.pe01.com.domain.gateway.ComNnavGateway;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ComNnavFactory {

	final ComNnavGateway gateway;

	public ComNnavEntity makeEntity() {
		return new ComNnavEntity(gateway);
	}


}
