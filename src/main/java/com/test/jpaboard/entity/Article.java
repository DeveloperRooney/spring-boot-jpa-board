package com.test.jpaboard.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Article extends BaseTime{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long articleId;

    @Column(length = 50)
    private String title;

    @Column(columnDefinition = "text")
    private String content;

    @Builder
    public Article(Long articleId, String title, String content) {
        this.articleId = articleId;
        this.title = title;
        this.content = content;
    }
}
