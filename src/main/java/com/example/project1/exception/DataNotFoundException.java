package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class DataNotFoundException extends BaseException {
    private static final long serialVersionUID = 8008096372626781568L;

    public DataNotFoundException() {
        super(ResultTypeCode.DATA_NOT_FOUND, null);
    }
    public DataNotFoundException(String message) {
        super(ResultTypeCode.DATA_NOT_FOUND, message);
    }
}
