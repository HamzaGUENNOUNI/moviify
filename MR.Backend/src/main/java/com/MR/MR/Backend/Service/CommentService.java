package com.MR.MR.Backend.Service;

import java.util.List;

import com.MR.MR.Backend.Model.Comment;

public interface CommentService {
	public List<Comment> getAllComments();
	public Comment addComment(Comment comment);
	void deleteComment(Long id);

}

