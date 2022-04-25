package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class PageNotFoundException extends BaseException {
    private static final long serialVersionUID = 6734912388651907897L;

    public PageNotFoundException() {
        super(ResultTypeCode.PAGE_NOT_FOUND, null);
    }

    public PageNotFoundException(String message) {
        super(ResultTypeCode.PAGE_NOT_FOUND, message);
    }
}
