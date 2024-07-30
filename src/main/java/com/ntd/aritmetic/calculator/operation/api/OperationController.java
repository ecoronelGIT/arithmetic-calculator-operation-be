package com.ntd.aritmetic.calculator.operation.api;

import com.ntd.aritmetic.calculator.operation.common.request.OperationRequest;
import com.ntd.aritmetic.calculator.operation.common.response.OperationResult;
import com.ntd.aritmetic.calculator.operation.core.usecase.OperationUseCase;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class OperationController {

    private final OperationUseCase operationUseCase;

    @PostMapping(value = "/operation")
    public OperationResult executeOperation(@RequestBody OperationRequest operationRequest) {
        return operationUseCase.executeOperation(operationRequest);
    }

}
