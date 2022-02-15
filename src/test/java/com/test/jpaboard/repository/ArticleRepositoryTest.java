package com.test.jpaboard.repository;

import com.test.jpaboard.entity.Article;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class ArticleRepositoryTest {

    @Autowired
    private ArticleRepository repository;

    @Test
    @DisplayName("게시글 작성")
    public void write() {
        Article article = Article.builder()
                .title("test title")
                .content("test content")
                .build();

    repository.save(article);

    assertThat(repository.findAll().get(0).getCreatedDate()).isAfter(LocalDateTime.of(2021,12,1,0,0,0));
    }
}
