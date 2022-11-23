package com.ctbc.pe.pe01.com.infrastructure.database;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface ComNnavJpaRepository extends JpaRepository<ComNnavPo, ComNnavPoId>, JpaSpecificationExecutor<ComNnavPo> {

}
