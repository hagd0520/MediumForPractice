package com.ll.mediumforpractice.domain.member.member.controller;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/member")
@RequiredArgsConstructor
public class MemberController {
    @GetMapping("/join")
    public String showJoin() {
        return "domain/member/member/join";
    }

    @Getter
    @Setter
    public static class JoinForm {
        public String username;
        public String password;
    }

    @PostMapping("/join")
    public String join(JoinForm joinForm) {
        return "redirect:/";
    }
}
