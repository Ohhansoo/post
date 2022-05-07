package com.example.post;

import com.example.post.dto.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PostApplicationTests {

	@Test
	void contextLoads() throws JsonProcessingException {
		System.out.println("------------");

		//TEXT JSON -> Object
		//Object -> Text Json

		// controller req json(text) -> object
		// response object -> json(text)

		var objectMapper = new ObjectMapper();

		//object -> text
		//object mapper get method를 활용한다.
		var user = new User("steve", 10);
		//2개 인자 받는 생성자 메서드 필요
		var text = objectMapper.writeValueAsString(user);
		System.out.println(text);

		//text -> object
		//default 생성자 필요
		var objectUser = objectMapper.readValue(text, User.class);
		System.out.println(objectUser);
	}

}
