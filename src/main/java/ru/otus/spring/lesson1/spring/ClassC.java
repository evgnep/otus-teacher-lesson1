package ru.otus.spring.lesson1.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassC {
	private String message = "Hello";
	public String getMessage() { return message; }
}
