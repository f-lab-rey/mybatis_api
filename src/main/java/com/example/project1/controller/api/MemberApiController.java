package com.example.project1.controller.api;

import com.example.project1.aop.LoginRequired;
import com.example.project1.member.model.Member;
import com.example.project1.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/member")
public class MemberApiController {
    private final MemberService memberService;

    @LoginRequired
    @GetMapping(value = "/list")
    public List<Member> getMembers() {
        throw new NullPointerException("tt");
//        return memberService.getMembers();
    }
}