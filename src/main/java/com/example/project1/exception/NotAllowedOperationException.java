package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class NotAllowedOperationException extends BaseException {
    private static final long serialVersionUID = 2255240058814816152L;

    public NotAllowedOperationException() {
        super(ResultTypeCode.NOT_ALLOWED_OPERATION, null);
    }

    public NotAllowedOperationException(String message) {
        super(ResultTypeCode.NOT_ALLOWED_OPERATION, message);
    }
}
