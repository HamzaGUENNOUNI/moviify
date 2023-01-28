package com.MR.MR.Backend.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.MR.MR.Backend.Model.Comment;
import com.MR.MR.Backend.Repository.CommentRepository;

@Service
public class CommentServiceImpl implements CommentService {
	@Autowired
	private CommentRepository commentRepository;
	
	@Override
    public List<Comment> getAllComments() {
        return commentRepository.findAll();
    }
	
	@Override
    public Comment addComment(Comment comment) {
        return commentRepository.save(comment);
    }
	
	@Override
    public void deleteComment(Long id) {
        commentRepository.deleteById(id);
    }

	


}
