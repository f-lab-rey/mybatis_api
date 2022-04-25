package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class InvalidParameterException extends BaseException {
    private static final long serialVersionUID = -5430362376833967843L;

    public InvalidParameterException() {
        super(ResultTypeCode.INVALID_PARAMETER, null);
    }

    public InvalidParameterException(String message) {
        super(ResultTypeCode.INVALID_PARAMETER, message);
    }
}
