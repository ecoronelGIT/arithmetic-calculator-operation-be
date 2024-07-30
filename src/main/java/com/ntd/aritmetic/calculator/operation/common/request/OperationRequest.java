package com.ntd.aritmetic.calculator.operation.common.request;

import com.ntd.aritmetic.calculator.operation.common.enums.OperationType;
import lombok.Data;

@Data
public class OperationRequest {
    private Double firstOperand;
    private Double secondOperand;
    private OperationType operationType;
}
