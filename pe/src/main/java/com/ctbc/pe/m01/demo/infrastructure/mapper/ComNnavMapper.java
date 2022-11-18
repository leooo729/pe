package com.ctbc.pe.m01.demo.infrastructure.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.ctbc.pe.m01.demo.application.dto.ComNnavDto;
import com.ctbc.pe.m01.demo.domain.entity.ComNnavEntity;
import com.ctbc.pe.m01.demo.infrastructure.database.ComNnavPo;

@Mapper
public interface ComNnavMapper {

	ComNnavMapper INSTANCE = Mappers.getMapper(ComNnavMapper.class);

	public ComNnavPo doEntity2Po(ComNnavEntity entity);

	public List<ComNnavPo> doEntity2Po(List<ComNnavEntity> entity);

	public ComNnavEntity doPo2Entity(ComNnavPo po);

	public List<ComNnavEntity> doPo2Entity(List<ComNnavPo> po);

	public ComNnavEntity doDto2Entity(ComNnavDto dto);

	public List<ComNnavEntity> doDto2Entity(List<ComNnavDto> dto);

	public ComNnavDto doEntity2Dto(ComNnavEntity entity);

	public List<ComNnavDto> doEntity2Dto(List<ComNnavEntity> entity);

}
