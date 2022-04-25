package com.example.project1.common.model;

import lombok.Getter;

@Getter
public class ExceptionResult extends Result {
    public ExceptionResult(ResultTypeCode type, String message) {
        super(type, message);
    }
}
