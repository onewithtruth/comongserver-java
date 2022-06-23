package com.hands.comongjava.domain.posts;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class PostsRepositoryTest {
    @Autowired
    PostsRepository postsRepository;

    @AfterEach
    public void cleanup() {
        postsRepository.deleteAll();
    }

    @Test
    @DisplayName("req posts")
    public void requestPostTest() {
        //given
        String title = "Test_post";
        String content = "Test_content";

        postsRepository.save(Posts.builder()
                .title(title)
                .content(content)
                .author("test_author")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);
        Assertions.assertThat(posts.getTitle()).isEqualTo(title);
        Assertions.assertThat(posts.getContent()).isEqualTo(content);
    }

    @Test
    @DisplayName("BaseTimeEntity_reg")
    public void BaseTimeEntityRegistryTest() {
        //given
        LocalDateTime now = LocalDateTime.of(2022, 6, 4, 0, 0, 0);
        postsRepository.save(Posts.builder()
                .title("test_title")
                .content("test_content")
                .author("test_author")
                .build());

        //when
        List<Posts> postsList = postsRepository.findAll();

        //then
        Posts posts = postsList.get(0);

        System.out.println(">>>>>>>>> createAt = " + posts.getCreateAt() + ", updatedAt = "
                + posts.getUpdatedAt());
        Assertions.assertThat(posts.getCreateAt()).isAfter(now);
        Assertions.assertThat(posts.getUpdatedAt()).isAfter(now);

    }
}