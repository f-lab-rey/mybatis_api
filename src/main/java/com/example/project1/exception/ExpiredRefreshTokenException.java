package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class ExpiredRefreshTokenException extends BaseException {
    private static final long serialVersionUID = 7078037810778524940L;

    public ExpiredRefreshTokenException() {
        super(ResultTypeCode.EXPIRED_REFRESH_TOKEN, null);
    }

    public ExpiredRefreshTokenException(String message) {
        super(ResultTypeCode.EXPIRED_REFRESH_TOKEN, message);
    }
}
