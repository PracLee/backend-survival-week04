package kr.megaptera.assignment.dtos;

import kr.megaptera.assignment.models.Post;

public class PostDto {
    private String id;

    private String title;

    private String author;

    private String content;

    public PostDto(String id, String title, String author, String content) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.content = content;
    }

    public PostDto(Post post) {
        this(post.id(),post.title(),post.author(),post.content());
    }

}