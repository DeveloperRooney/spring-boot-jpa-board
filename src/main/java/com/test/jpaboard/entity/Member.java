package com.test.jpaboard.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Member extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberIdx;

    @Column(length = 30)
    private String memberId;

    @Column(length = 250)
    private String memberPass;

    @Column(length = 30)
    private String memberName;

    @Builder
    public Member(Long memberIdx, String memberId, String memberPass, String memberName) {
        this.memberIdx = memberIdx;
        this.memberId = memberId;
        this.memberPass = memberPass;
        this.memberName = memberName;
    }
}
