package com.example.project1.handler;

import com.example.project1.common.model.ExceptionResult;
import com.example.project1.common.model.ResultTypeCode;
import com.example.project1.exception.BaseException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.HttpMediaTypeNotSupportedException;
import org.springframework.web.HttpRequestMethodNotSupportedException;
import org.springframework.web.bind.MissingPathVariableException;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.ServletWebRequest;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;
import org.springframework.web.servlet.NoHandlerFoundException;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.util.Iterator;

@Slf4j
@RestControllerAdvice
public class GlobalControllerExceptionHandler extends ResponseEntityExceptionHandler {
    private void printException(Exception e, WebRequest request) {
        log.error("##################################################################################################");
        log.error("Session Id : {}", ((ServletWebRequest) request).getRequest().getRequestedSessionId());
        log.error("URL : {}", ((ServletWebRequest) request).getRequest().getRequestURI());
        log.error("Method : {}", ((ServletWebRequest) request).getHttpMethod());
        log.error("Headers : ");
        Iterator<String> headers = request.getHeaderNames();
        while (headers.hasNext()) {
            String header = headers.next();
            log.error("{} - {}", header, request.getHeader(header));
        }
        log.error("Parameters : ");
        Iterator<String> parameterNames = request.getParameterNames();
        while (parameterNames.hasNext()) {
            String parameterName = parameterNames.next();
            log.error("{} - {}", parameterName, request.getParameter(parameterName));
        }
        log.error("Exception!!", e);
        log.error("##################################################################################################");
    }

    @ExceptionHandler(value = BaseException.class)
    protected ExceptionResult handleBaseException(BaseException e, WebRequest request) {
        this.printException(e, request);
        return e.getExceptionResult();
    }

    @ExceptionHandler(value = RuntimeException.class)
    protected ExceptionResult handlerRuntimeException(RuntimeException e, WebRequest request) {
        this.printException(e, request);
        return new ExceptionResult(ResultTypeCode.INTERNAL_SERVER_ERROR, ResultTypeCode.INTERNAL_SERVER_ERROR.getMessage());
    }

    @ExceptionHandler(value = IllegalArgumentException.class)
    protected ExceptionResult handleIllegalArgumentException(IllegalArgumentException e, WebRequest request) {
        this.printException(e, request);
        return new ExceptionResult(ResultTypeCode.ILLEGAL_ARGUMENT, ResultTypeCode.ILLEGAL_ARGUMENT.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleNoHandlerFoundException(NoHandlerFoundException ex,
                                                                   HttpHeaders headers, HttpStatus status,
                                                                   WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.PAGE_NOT_FOUND,
                ResultTypeCode.PAGE_NOT_FOUND.getMessage()), ResultTypeCode.PAGE_NOT_FOUND.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleHttpRequestMethodNotSupported(HttpRequestMethodNotSupportedException ex,
                                                                         HttpHeaders headers, HttpStatus status,
                                                                         WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.REQUEST_METHOD_NOT_ALLOWED,
                ResultTypeCode.REQUEST_METHOD_NOT_ALLOWED.getMessage()),
                ResultTypeCode.REQUEST_METHOD_NOT_ALLOWED.getStatus());
    }

    @ExceptionHandler(value = MethodArgumentTypeMismatchException.class)
    protected ExceptionResult handlerMethodArgumentTypeMismatchException(MethodArgumentTypeMismatchException e,
                                                                         WebRequest request) {
        this.printException(e, request);
        return new ExceptionResult(ResultTypeCode.ILLEGAL_ARGUMENT, ResultTypeCode.ILLEGAL_ARGUMENT.getMessage());
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotSupported(HttpMediaTypeNotSupportedException ex,
                                                                     HttpHeaders headers, HttpStatus status,
                                                                     WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.UNSUPPORTED_MEDIA_TYPE,
                ResultTypeCode.UNSUPPORTED_MEDIA_TYPE.getMessage()), ResultTypeCode.UNSUPPORTED_MEDIA_TYPE.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleHttpMediaTypeNotAcceptable(HttpMediaTypeNotAcceptableException ex,
                                                                      HttpHeaders headers, HttpStatus status,
                                                                      WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.NOT_ACCEPTABLE,
                ResultTypeCode.NOT_ACCEPTABLE.getMessage()), ResultTypeCode.NOT_ACCEPTABLE.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException ex,
                                                                  HttpHeaders headers, HttpStatus status,
                                                                  WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.MISSING_PARAMETER,
                ResultTypeCode.MISSING_PARAMETER.getMessage()), ResultTypeCode.MISSING_PARAMETER.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMissingPathVariable(MissingPathVariableException ex, HttpHeaders headers,
                                                               HttpStatus status, WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.PAGE_NOT_FOUND,
                ResultTypeCode.PAGE_NOT_FOUND.getMessage()), ResultTypeCode.PAGE_NOT_FOUND.getStatus());
    }

    @Override
    protected ResponseEntity<Object> handleMissingServletRequestParameter(MissingServletRequestParameterException ex,
                                                                          HttpHeaders headers, HttpStatus status,
                                                                          WebRequest request) {
        this.printException(ex, request);
        return new ResponseEntity<>(new ExceptionResult(ResultTypeCode.MISSING_PARAMETER,
                ResultTypeCode.MISSING_PARAMETER.getMessage()), ResultTypeCode.MISSING_PARAMETER.getStatus());
    }
}
