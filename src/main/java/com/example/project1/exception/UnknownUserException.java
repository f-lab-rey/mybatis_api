package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class UnknownUserException extends BaseException{
    private static final long serialVersionUID = 5345111164565560091L;

    public UnknownUserException() {
        super(ResultTypeCode.UNKNOWN_USER, null);
    }

    public UnknownUserException(String message) {
        super(ResultTypeCode.UNKNOWN_USER, message);
    }
}
