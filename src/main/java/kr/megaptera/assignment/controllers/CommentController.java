package kr.megaptera.assignment.controllers;


import kr.megaptera.assignment.models.Comment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comments")
public class CommentController {
    @GetMapping
    public Comment getComment(){
        return null;
    }
}
