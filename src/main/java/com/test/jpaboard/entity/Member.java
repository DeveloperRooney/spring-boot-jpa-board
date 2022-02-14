package com.test.jpaboard.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer memberNum;

    @Column(length = 30)
    private String memberId;

    @Column(length = 300)
    private String memberPass;

    @Builder
    public Member(Integer memberNum, String memberId, String memberPass) {
        this.memberNum = memberNum;
        this.memberId = memberId;
        this.memberPass = memberPass;
    }
}
