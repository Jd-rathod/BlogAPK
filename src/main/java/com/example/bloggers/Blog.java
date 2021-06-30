package com.example.bloggers;

import javax.persistence.*;

@Entity(name = "Blog")
@Table(
        name = "blog",
        uniqueConstraints = {
                @UniqueConstraint(
                        name = "user_id_unique",
                        columnNames = "user_id"
                )
        }
)
public class Blog {

    @Id
    @SequenceGenerator(
            name = "blog_seq",
            sequenceName = "blog_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "blog_seq"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @Column(
            name= "title",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String title;

    @Column(
            name= "body",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String body;

    @Column(
            name= "author",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String author;

    @Column(
            name= "user_id",
            nullable = false,
            columnDefinition = "TEXT"
    )
    private String user_id;

    public Blog() {
    }

    public Blog(String title, String body, String author, String user_id) {
        this.title = title;
        this.body = body;
        this.author = author;
        this.user_id = user_id;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", body='" + body + '\'' +
                ", author='" + author + '\'' +
                ", user_id='" + user_id + '\'' +
                '}';
    }
}
