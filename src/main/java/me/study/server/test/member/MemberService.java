package me.study.server.test.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberDao memberDao;

    @Autowired
    PasswordEncoder passwordEncoder;

    public Member createMember(String name, String password){
        Member m = new Member();
        m.setName(name);
        m.setPassword(password);
        m.encodedPassword(passwordEncoder);
        return memberDao.createMember(m);
    }
}
