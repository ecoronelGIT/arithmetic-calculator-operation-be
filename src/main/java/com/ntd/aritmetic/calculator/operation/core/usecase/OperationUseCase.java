package com.ntd.aritmetic.calculator.operation.core.usecase;

import com.ntd.aritmetic.calculator.operation.common.request.OperationRequest;
import com.ntd.aritmetic.calculator.operation.common.response.OperationResult;

public interface OperationUseCase {
    OperationResult executeOperation(OperationRequest operationRequest);

}
