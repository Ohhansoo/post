package com.example.post.controller;

import com.example.post.dto.PostDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class PostApiController {

    @PostMapping("/post") // dto 사용
    public void post(@RequestBody PostDto postDto){
        System.out.println("postDto = " + postDto);
    }
    //dto 없이
 /*   public void post(@RequestBody Map<String, Object> requestData){
        requestData.entrySet().forEach(stringObjectEntry -> {
            System.out.println("key = " + stringObjectEntry.getKey());
            System.out.println("value = " + stringObjectEntry.getValue());
        });
    }*/
}
