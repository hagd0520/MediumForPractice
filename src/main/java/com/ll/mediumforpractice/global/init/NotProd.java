package com.ll.mediumforpractice.global.init;

import com.ll.mediumforpractice.domain.member.member.entity.Member;
import com.ll.mediumforpractice.domain.member.member.service.MemberService;
import com.ll.mediumforpractice.domain.post.post.entity.Post;
import com.ll.mediumforpractice.domain.post.post.service.PostService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Profile;
import org.springframework.core.annotation.Order;
import org.springframework.transaction.annotation.Transactional;

import java.util.stream.IntStream;

@Configuration
@Slf4j
@RequiredArgsConstructor
@Profile("!prod")
public class NotProd {
    @Autowired
    @Lazy
    private NotProd self;
    private final MemberService memberService;
    private final PostService postService;

    @Bean
    @Order(2)
    public ApplicationRunner initNotProd() {
        return args -> {
            if (memberService.findByUsername("user1").isPresent()) return;

            self.work1();
        };
    }

    @Transactional
    public void work1() {

        Member memberUser1 = memberService.join("user1", "1234").getData();
        Member memberUser2 = memberService.join("user2", "1234").getData();
        Member memberUser3 = memberService.join("user3", "1234").getData();
        Member memberUser4 = memberService.join("user4", "1234").getData();

        Post post1 = postService.write(memberUser1, "제목 1", "내용 1", true);
        Post post2 = postService.write(memberUser1, "제목 2", "내용 2", true);
        Post post3 = postService.write(memberUser1, "제목 3", "내용 3", false);
        Post post4 = postService.write(memberUser1, "제목 4", "내용 4", true);

        Post post5 = postService.write(memberUser2, "제목 5", "내용 5", true);
        Post post6 = postService.write(memberUser2, "제목 6", "내용 6", false);

        IntStream.rangeClosed(7, 50).forEach(i -> {
            postService.write(memberUser3, "제목 " + i, "내용 " + i, true);
        });

        post1.like(memberUser2);
        post1.like(memberUser3);
        post1.like(memberUser4);

        post2.like(memberUser2);
        post2.like(memberUser3);

        post3.like(memberUser2);
    }
}