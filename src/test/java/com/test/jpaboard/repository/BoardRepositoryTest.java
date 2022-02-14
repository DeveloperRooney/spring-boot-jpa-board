package com.test.jpaboard.repository;

import com.test.jpaboard.entity.Board;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;


@SpringBootTest
public class BoardRepositoryTest {

    @Autowired
    private BoardRepository boardRepository;

    @Test
    public void insert() {
        String userId = "test01";

        Board board = Board.builder()
                        .userId(userId)
                        .userPass("test01")
                        .userName("test01")
                        .userEmail("test01@gmail.com")
                        .build();

        boardRepository.save(board);

        assertThat(boardRepository.findAll().get(0).getUserId()).isEqualTo(userId);
    }
}
