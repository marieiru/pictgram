package com.example.pictgram.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.pictgram.entity.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
}