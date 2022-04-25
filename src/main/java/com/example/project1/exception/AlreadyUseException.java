package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class AlreadyUseException extends BaseException {
    private static final long serialVersionUID = 5577978733909958615L;

    public AlreadyUseException() {
        super(ResultTypeCode.ALREADY_USE, null);
    }

    public AlreadyUseException(String message) {
        super(ResultTypeCode.ALREADY_USE, message);
    }
}
