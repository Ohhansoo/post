package com.example.post.controller;

import com.example.post.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
        public PostRequestDto put(@RequestBody PostRequestDto requestDto){
            System.out.println(requestDto);
            return requestDto;
        }

    @PutMapping("/put/{userId}")
    public PostRequestDto putUserId(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long id){
        System.out.println(requestDto);
        return requestDto;
    }

}
