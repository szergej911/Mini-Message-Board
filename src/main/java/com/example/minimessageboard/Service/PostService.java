package com.example.minimessageboard.Service;


import com.example.minimessageboard.Model.Post;

import java.util.List;

public interface PostService {


    List<Post> getPosts();

    public void addPost(Post post);
}
