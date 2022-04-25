package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class AdminTokenRequiredException extends BaseException {
    private static final long serialVersionUID = 6276838169794434823L;

    public AdminTokenRequiredException() {
        super(ResultTypeCode.ADMIN_TOKEN_REQUIRED, null);
    }

    public AdminTokenRequiredException(String message) {
        super(ResultTypeCode.ADMIN_TOKEN_REQUIRED, message);
    }
}
