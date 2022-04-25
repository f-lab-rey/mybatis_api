package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class NoRoleException extends BaseException {
    private static final long serialVersionUID = -2750313565690760360L;

    public NoRoleException() {
        super(ResultTypeCode.NO_ROLE, null);
    }

    public NoRoleException(String message) {
        super(ResultTypeCode.NO_ROLE, message);
    }
}
