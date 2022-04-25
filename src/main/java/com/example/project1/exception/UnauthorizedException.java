package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class UnauthorizedException extends BaseException {
    private static final long serialVersionUID = 4860255320400897688L;

    public UnauthorizedException() {
        super(ResultTypeCode.UNAUTHORIZED, null);
    }

    public UnauthorizedException(String message) {
        super(ResultTypeCode.UNAUTHORIZED, message);
    }
}
