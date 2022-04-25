package com.example.project1.member.repository;

import com.example.project1.member.model.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface MemberRepository {
    List<Member> getMembers();
    Member getMember(@Param(value = "userId") String userId, @Param(value = "password") String password);
    Member setMember(String userId, String password, String name);
    Member setMember(Member member);
    void deleteMember(String userId, String password);
}
