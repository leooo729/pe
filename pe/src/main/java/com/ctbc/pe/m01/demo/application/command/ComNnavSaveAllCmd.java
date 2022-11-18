package com.ctbc.pe.m01.demo.application.command;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.ctbc.pe.m01.demo.application.dto.ComNnavDto;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

// save all entities from dto

@Getter
@ToString
@Builder(toBuilder = true)
public class ComNnavSaveAllCmd {

	List<ComNnavDto> listDto;

}
