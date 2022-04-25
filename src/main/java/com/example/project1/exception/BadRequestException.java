package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class BadRequestException extends BaseException {
    private static final long serialVersionUID = 1795945193875580278L;

    public BadRequestException() {
        super(ResultTypeCode.BAD_REQUEST, null);
    }

    public BadRequestException(String message) {
        super(ResultTypeCode.BAD_REQUEST, message);
    }
}
