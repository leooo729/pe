package com.ctbc.pe.pe01.com.application.command;

import java.util.List;

import com.ctbc.pe.pe01.com.application.dto.ComNnavDto;

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
