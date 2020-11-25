package me.study.server.test;

import me.study.server.test.member.Member;
import me.study.server.test.member.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class MySQLRunner implements ApplicationRunner {

    @Autowired
    MemberRepository memberRepository;


    @Override
    public void run(ApplicationArguments args) throws Exception {
        Member member = new Member();
        member.setPassword("1234");
        member.setName("aaa");
        memberRepository.save(member);
    }
}
