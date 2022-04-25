package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class UserAlreadyEnrollmentException extends BaseException {
    private static final long serialVersionUID = 3253214957045367348L;

    public UserAlreadyEnrollmentException() {
        super(ResultTypeCode.USER_ALREADY_ENROLLMENT, null);
    }
    public UserAlreadyEnrollmentException(String message) {
        super(ResultTypeCode.USER_ALREADY_ENROLLMENT, message);
    }
}
