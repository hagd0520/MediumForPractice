package com.ll.mediumforpractice.domain.post.post.repository;

import com.ll.mediumforpractice.domain.post.post.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long>, PostRepositoryCustom {
    List<Post> findTop30ByIsPublishedOrderByIdDesc(boolean isPublished);
}
