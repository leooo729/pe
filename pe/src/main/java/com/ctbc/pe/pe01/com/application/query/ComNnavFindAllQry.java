package com.ctbc.pe.pe01.com.application.query;

import java.util.List;

import org.springframework.data.domain.Pageable;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

// find all entities with pageable

@Getter
@ToString
@Builder(toBuilder = true)
public class ComNnavFindAllQry {

	Pageable pageable;

}
