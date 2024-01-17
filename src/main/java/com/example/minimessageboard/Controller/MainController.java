package com.example.minimessageboard.Controller;


import com.example.minimessageboard.Model.Post;
import com.example.minimessageboard.Service.PostService;
import com.example.minimessageboard.Service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    private final UserService userService;

    private final PostService postService;

    public MainController(UserService userService, PostService postService) {
        this.userService = userService;
        this.postService = postService;
    }


    @GetMapping("/")
    public String mainPage(Model model){
        model.addAttribute("posts", postService.getPosts());
        model.addAttribute("newPost", new Post());

        return "index";
    }

    @PostMapping("/new")
    public String addNewPost(Post post){
        postService.addPost(post);
        return "redirect:/";
    }



}
