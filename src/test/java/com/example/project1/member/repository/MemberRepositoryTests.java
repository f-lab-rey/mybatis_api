package com.example.project1.member.repository;

import com.example.project1.member.model.Member;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@Slf4j
@SpringBootTest
class MemberRepositoryTests {
    private MemberRepository memberRepository;

    @Autowired
    public void setMemberRepository(MemberRepository memberRepository) {
        this.memberRepository = memberRepository;
    }

    @Test
    void getMembers() {
//        log.info("MemberRepository : {}", memberRepository);
        List<Member> members = memberRepository.getMembers();
        assertNotNull(members);
    }

    @Test
    void getMember() {
        Member member = memberRepository.getMember("test", "ttt");
        assertNull(member);
    }
}