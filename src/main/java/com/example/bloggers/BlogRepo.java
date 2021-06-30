package com.example.bloggers;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.bloggers.Blog;
import java.util.List;

public interface BlogRepo extends JpaRepository<Blog, Long> {
    // List<Blog> findByPublished(boolean published);

    List<Blog> findByTitle(String title);
}
