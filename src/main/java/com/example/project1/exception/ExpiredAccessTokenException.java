package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class ExpiredAccessTokenException extends BaseException {
    private static final long serialVersionUID = -2825169825195388153L;

    public ExpiredAccessTokenException() {
        super(ResultTypeCode.EXPIRED_ACCESS_TOKEN, null);
    }

    public ExpiredAccessTokenException(String message) {
        super(ResultTypeCode.EXPIRED_ACCESS_TOKEN, message);
    }
}
