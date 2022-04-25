package com.example.project1.common.model;

import lombok.Getter;

@Getter
public class Result {
    protected ResultTypeCode type;
    protected String message;
    protected String code;
    private final Object value;

    public Result(Object value) {
        this.type = ResultTypeCode.OK;
        this.message = null;
        this.code = type.getCode();
        this.value = value;
    }

    public Result(ResultTypeCode type, String message) {
        this.type = type;
        this.message = message;
        this.code = type.getCode();
        this.value = null;
    }

    public Result(ResultTypeCode type, String message, Object value) {
        this.type = type;
        this.message = message;
        this.code = type.getCode();
        this.value = value;
    }
}
