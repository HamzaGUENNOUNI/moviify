package com.MR.MR.Backend.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.MR.MR.Backend.Model.Comment;

public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findAll();

}
