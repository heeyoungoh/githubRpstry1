package com.mysite.sbb;

import java.time.LocalDateTime;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.mysite.sbb.question.QuestionService;

@SpringBootTest
class SbbApplicationTests {
	@Autowired
	private QuestionService questionService;
	
	@Test
	void testJpa() {
		for(int i=0; i<=300; i++) {
			String subject = String.format("데이타 대량이다 : [%03d]", i);
			String content = "프로세스임";
			this.questionService.create(subject, content);
		}
	}
	

}
