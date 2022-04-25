package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class PasswordLengthIncorrectException extends BaseException {
    private static final long serialVersionUID = 359076811724616823L;

    public PasswordLengthIncorrectException() {
        super(ResultTypeCode.PASSWORD_LENGTH_INCORRECT, null);
    }

    public PasswordLengthIncorrectException(String message) {
        super(ResultTypeCode.PASSWORD_LENGTH_INCORRECT, message);
    }
}
