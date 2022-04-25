package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class InvalidTokenException extends BaseException {
    private static final long serialVersionUID = 2535064455716038947L;

    public InvalidTokenException() {
        super(ResultTypeCode.INVALID_TOKEN, null);
    }

    public InvalidTokenException(String message) {
        super(ResultTypeCode.INVALID_TOKEN, message);
    }
}
