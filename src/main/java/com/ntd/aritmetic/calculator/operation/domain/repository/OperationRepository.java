package com.ntd.aritmetic.calculator.operation.domain.repository;

import com.ntd.aritmetic.calculator.operation.domain.entity.OperationEntity;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OperationRepository extends JpaRepository<OperationEntity, UUID> {

}
