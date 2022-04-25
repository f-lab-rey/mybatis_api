package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class RefreshTokenRequiredException extends BaseException {
    private static final long serialVersionUID = 2287712195012155522L;

    public RefreshTokenRequiredException() {
        super(ResultTypeCode.REFRESH_TOKEN_REQUIRED, null);
    }

    public RefreshTokenRequiredException(String message) {
        super(ResultTypeCode.REFRESH_TOKEN_REQUIRED, message);
    }
}
