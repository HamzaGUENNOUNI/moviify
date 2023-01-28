package com.MR.MR.Backend.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.MR.MR.Backend.Model.Comment;
import com.MR.MR.Backend.Service.CommentService;

@RestController
@RequestMapping("/comments")
public class CommentController {
	@Autowired
	private CommentService commentService;
	
	@GetMapping("/getAll")
    public List<Comment> getAllComments() {
        return commentService.getAllComments();
    }
	
	@PostMapping("/add")
    public Comment addComment(@RequestBody Comment comment) {
        return commentService.addComment(comment);
    }
	 @DeleteMapping("/{id}")
	    public void deleteComment(@PathVariable Long id) {
	        commentService.deleteComment(id);
	    }

	

}
