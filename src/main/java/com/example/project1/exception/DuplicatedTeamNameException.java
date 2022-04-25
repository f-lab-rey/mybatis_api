package com.example.project1.exception;

import com.example.project1.common.model.ResultTypeCode;

public class DuplicatedTeamNameException extends BaseException {
    private static final long serialVersionUID = 6480997198403980632L;

    public DuplicatedTeamNameException() {
        super(ResultTypeCode.DUPLICATED_TEAM_NAME, null);
    }
    public DuplicatedTeamNameException(String message) {
        super(ResultTypeCode.DUPLICATED_TEAM_NAME, message);
    }
}
