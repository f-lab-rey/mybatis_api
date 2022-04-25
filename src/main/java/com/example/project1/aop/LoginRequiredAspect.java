package com.example.project1.aop;

import com.example.project1.member.service.MemberService;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@Aspect
public class LoginRequiredAspect {
    private MemberService memberService;

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }

    @Around(value = "@annotation(loginRequired)")
    public Object loginRequired(ProceedingJoinPoint pjp, LoginRequired loginRequired) throws Throwable {
        // TODO : 로그인 안 되어 있을 때 처리
        return pjp.proceed();
    }
}
