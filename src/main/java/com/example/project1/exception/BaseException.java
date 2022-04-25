package com.example.project1.exception;

import com.example.project1.common.model.ExceptionResult;
import com.example.project1.common.model.ResultTypeCode;
import lombok.Getter;
import org.springframework.util.StringUtils;

public class BaseException extends RuntimeException {
    private static final long serialVersionUID = -6616229096275978764L;

    @Getter
    private final ResultTypeCode type;
    private final String message;

    public BaseException(ResultTypeCode type, String message) {
        this.type = type;
        if (StringUtils.isEmpty(message)) {
            this.message = type.getMessage();
        } else {
            this.message = message;
        }
    }

    public ExceptionResult getExceptionResult() {
        return new ExceptionResult(this.type, this.message);
    }
}
