package com.husseinabdallah.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static com.husseinabdallah.codewars.CodeWars.mask;

@SpringBootTest
class CodewarsApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void maskString() {
		Assertions.assertEquals("#############4321", mask("12345678987654321"));
	}

}
