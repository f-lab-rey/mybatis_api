package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class IllegalArgumentException extends BaseException {
    private static final long serialVersionUID = 1338794653466547145L;

    public IllegalArgumentException() {
        super(ResultTypeCode.ILLEGAL_ARGUMENT, null);
    }

    public IllegalArgumentException(String message) {
        super(ResultTypeCode.ILLEGAL_ARGUMENT, message);
    }
}
