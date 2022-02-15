package com.test.jpaboard.repository;

import com.test.jpaboard.entity.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class MemberRepositoryTest {

    @Autowired
    private MemberRepository repository;

    @Test
    @DisplayName("회원가입 테스트")
    public void join() {

        LocalDateTime now = LocalDateTime.of(2021,12,1,0,0,0);

        Member member = Member.builder()
                .memberId("test01")
                .memberPass("test01")
                .memberName("test01")
                .build();

        repository.save(member);

        assertThat(repository.findAll().get(0).getCreatedDate()).isAfter(now);

    }
}
