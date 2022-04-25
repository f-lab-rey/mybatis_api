package com.example.project1.common.model;

import lombok.Getter;
import org.springframework.http.HttpStatus;

@Getter
public enum ResultTypeCode {
    OK("200000", "OK", HttpStatus.OK),

    BAD_REQUEST("400001", "Bad Request", HttpStatus.BAD_REQUEST),
    ILLEGAL_ARGUMENT("400002", "Illegal argument", HttpStatus.BAD_REQUEST),
    MISSING_PARAMETER("400003", "Missing parameter", HttpStatus.BAD_REQUEST),
    INVALID_PARAMETER("400004", "Invalid parameter", HttpStatus.BAD_REQUEST),
    USER_ALREADY_ENROLLMENT("400005", "User already enrollment", HttpStatus.BAD_REQUEST),
    PASSWORD_LENGTH_INCORRECT("400006", "Password length incorrect", HttpStatus.BAD_REQUEST),
    NOT_ALLOW_PASSWORD("400007", "Not allow password", HttpStatus.BAD_REQUEST),
    DUPLICATED_TEAM_NAME("400008", "Duplicated Team Name", HttpStatus.BAD_REQUEST),

    UNKNOWN_USER("401001", "Unknown user", HttpStatus.UNAUTHORIZED),
    ACCESS_TOKEN_REQUIRED("401002", "Access Token Required", HttpStatus.UNAUTHORIZED),
    INVALID_TOKEN("401003", "Invalid token", HttpStatus.UNAUTHORIZED),
    EXPIRED_ACCESS_TOKEN("401004", "Expired Access Token", HttpStatus.UNAUTHORIZED),
    REFRESH_TOKEN_REQUIRED("401005", "Refresh Token Required", HttpStatus.UNAUTHORIZED),
    EXPIRED_REFRESH_TOKEN("401006", "Expired Refresh Token", HttpStatus.UNAUTHORIZED),
    UNAUTHORIZED("401007", "Unauthorized", HttpStatus.UNAUTHORIZED),
    ADMIN_TOKEN_REQUIRED("401008", "Admin Token Required", HttpStatus.UNAUTHORIZED),
    NO_ROLE("401009", "No Role", HttpStatus.UNAUTHORIZED),

    PAGE_NOT_FOUND("404001", "Page not found", HttpStatus.NOT_FOUND),
    DATA_NOT_FOUND("404002", "Data not found", HttpStatus.NOT_FOUND),

    REQUEST_METHOD_NOT_ALLOWED("405001", "Request method not supported", HttpStatus.METHOD_NOT_ALLOWED),

    NOT_ACCEPTABLE("406001", "Not acceptable", HttpStatus.NOT_ACCEPTABLE),

    UNSUPPORTED_MEDIA_TYPE("415001", "Unsupported media type", HttpStatus.UNSUPPORTED_MEDIA_TYPE),

    INTERNAL_SERVER_ERROR("500000", "Internal Server Error", HttpStatus.INTERNAL_SERVER_ERROR),
    DATA_ALREADY_EXIST("500001", "Data already exist", HttpStatus.INTERNAL_SERVER_ERROR),
    ALREADY_USE("500002", "Already use", HttpStatus.INTERNAL_SERVER_ERROR),
    NOT_ALLOWED_OPERATION("500003", "Not allowed operation", HttpStatus.INTERNAL_SERVER_ERROR)
    ;

    private String code;
    private String message;
    private HttpStatus status;

    ResultTypeCode(String code, String message, HttpStatus status) {
        this.code = code;
        this.message = message;
        this.status = status;
    }
}
