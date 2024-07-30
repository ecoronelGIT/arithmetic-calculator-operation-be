package com.ntd.aritmetic.calculator.operation.core.manager;

import com.ntd.aritmetic.calculator.operation.common.request.OperationRequest;
import com.ntd.aritmetic.calculator.operation.common.response.OperationResult;
import com.ntd.aritmetic.calculator.operation.core.usecase.OperationUseCase;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Component;

@Component
public class OperationManager implements OperationUseCase {
    @Override
    public OperationResult executeOperation(OperationRequest operationRequest) {
        return switch (operationRequest.getOperationType()) {
            case ADDITION -> OperationResult.builder().result(String.valueOf(operationRequest.getFirstOperand() + operationRequest.getSecondOperand())).build();
            case SUBTRACTION -> OperationResult.builder().result(String.valueOf(operationRequest.getFirstOperand() - operationRequest.getSecondOperand())).build();
            case MULTIPLICATION -> OperationResult.builder().result(String.valueOf(operationRequest.getFirstOperand() * operationRequest.getSecondOperand())).build();
            case DIVISION -> OperationResult.builder().result(String.valueOf(operationRequest.getFirstOperand() / operationRequest.getSecondOperand())).build();
            case SQUARE_ROOT -> OperationResult.builder().result(String.valueOf(Math.sqrt(operationRequest.getFirstOperand()))).build();
            case RANDOM_STRING -> OperationResult.builder().result(RandomStringUtils.randomAlphanumeric(operationRequest.getFirstOperand().intValue())).build();
        };
    }

}
