package me.study.server.test.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberService memberService;

    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }


    @GetMapping("/signup")
    public Member signup(){
        Member member = memberService.createMember("jung", "1234");
        return member;
    }
}
