package com.test.jpaboard.repository;

import com.test.jpaboard.entity.Article;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArticleRepositoryTest {
    
    @Autowired
    private ArticleRepository articleRepository;

    @AfterEach
    public void after() {
        articleRepository.deleteAll();
    }

    @Test
    @DisplayName("게시글 작성 테스트")
    public void insert() {
        LocalDateTime now = LocalDateTime.of(2021,12,12,0,0,0);

        Article article = Article.builder()
                .title("test title")
                .content("test content")
                .build();

        articleRepository.save(article);

        System.out.println(articleRepository.findAll().get(0).getTitle());
        System.out.println(articleRepository.findAll().get(0).getCreatedDate());

        assertThat(articleRepository.findAll().get(0).getCreatedDate()).isAfter(now);
    }
    
}
