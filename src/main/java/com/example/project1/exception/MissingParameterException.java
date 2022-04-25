package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class MissingParameterException extends BaseException {
    private static final long serialVersionUID = -6615163305068115107L;

    public MissingParameterException() {
        super(ResultTypeCode.MISSING_PARAMETER, null);
    }

    public MissingParameterException(String message) {
        super(ResultTypeCode.MISSING_PARAMETER, message);
    }
}
