package com.example.project1.member.model;

import lombok.*;

import java.io.Serializable;

@Data
public class Member implements Serializable {
    private static final long serialVersionUID = 1438474424280305220L;

    private String userId;
    private String password;
    private String name;
}
