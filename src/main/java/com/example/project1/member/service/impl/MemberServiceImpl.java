package com.example.project1.member.service.impl;

import com.example.project1.member.model.Member;
import com.example.project1.member.repository.MemberRepository;
import com.example.project1.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
@RequiredArgsConstructor
public class MemberServiceImpl implements MemberService {
    private final MemberRepository memberRepository;

    @Override
    public List<Member> getMembers() {
        return memberRepository.getMembers();
    }
}
