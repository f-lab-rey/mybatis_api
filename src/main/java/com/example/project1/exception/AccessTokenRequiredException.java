package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class AccessTokenRequiredException extends BaseException {
    private static final long serialVersionUID = 7604141855343860279L;

    public AccessTokenRequiredException() {
        super(ResultTypeCode.ACCESS_TOKEN_REQUIRED, null);
    }

    public AccessTokenRequiredException(String message) {
        super(ResultTypeCode.ACCESS_TOKEN_REQUIRED, message);
    }
}
