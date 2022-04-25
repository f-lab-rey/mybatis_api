package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class NotAllowPasswordException extends BaseException {
    private static final long serialVersionUID = -6025963260285606843L;

    public NotAllowPasswordException() {
        super(ResultTypeCode.NOT_ALLOW_PASSWORD, null);
    }

    public NotAllowPasswordException(ResultTypeCode type, String message) {
        super(ResultTypeCode.NOT_ALLOW_PASSWORD, message);
    }
}
