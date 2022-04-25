package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class DataAlreadyExistException extends BaseException {
    private static final long serialVersionUID = -7448132213595337203L;

    public DataAlreadyExistException() {
        super(ResultTypeCode.DATA_ALREADY_EXIST, null);
    }

    public DataAlreadyExistException(ResultTypeCode type, String message) {
        super(ResultTypeCode.DATA_ALREADY_EXIST, message);
    }
}
