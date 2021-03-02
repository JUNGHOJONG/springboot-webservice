package com.davinci.springboot.web.dto;

import com.davinci.springboot.domain.posts.Posts;
import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class PostsListResponseDto {
    private Long id;
    private String author;
    private String title;
    private LocalDateTime modifiedDate;

    public PostsListResponseDto(Posts posts) {
        this.id = posts.getId();
        this.author = posts.getAuthor();
        this.title = posts.getTitle();
        this.modifiedDate = posts.getModifiedDate();
    }
}
