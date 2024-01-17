package com.example.minimessageboard.Repository;

import com.example.minimessageboard.Model.Post;
import jakarta.persistence.Id;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface PostRepository extends JpaRepository<Post, Id> {
}
