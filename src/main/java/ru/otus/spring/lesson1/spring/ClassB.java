package ru.otus.spring.lesson1.spring;

import org.springframework.stereotype.Component;

@Component
public class ClassB {
	private final ClassC c;

	public ClassB(ClassC c) {
		this.c = c;
	}
	public void f() {
		System.out.println(c.getMessage());
	}
}
