package com.test.jpaboard.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Board extends BaseTimeEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userNum;

    @Column(length = 30, nullable = false)
    private String userId;

    @Column(length = 30, nullable = false)
    private String userName;

    @Column(length = 30, nullable = false)
    private String userPass;

    @Column(length = 100)
    private String userEmail;

    @Builder
    public Board(Integer userNum, String userId, String userName, String userPass, String userEmail) {
        this.userNum = userNum;
        this.userId = userId;
        this.userName = userName;
        this.userPass = userPass;
        this.userEmail = userEmail;
    }
}
