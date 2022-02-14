package com.test.jpaboard.repository;

import com.test.jpaboard.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository memberRepository;

    @Test
    public void insert() {
        Member member = Member.builder()
                .memberId("test01")
                .memberPass("test01")
                .build();

        memberRepository.save(member);

        assertThat(memberRepository.findAll().get(0).getMemberId()).isEqualTo("test01");
    }
}
