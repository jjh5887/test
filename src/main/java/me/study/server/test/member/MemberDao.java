package me.study.server.test.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberDao {

    @Autowired
    MemberRepository memberRepository;

    public Member createMember(Member member){
        Member save = memberRepository.save(member);
        return save;
    }

}
