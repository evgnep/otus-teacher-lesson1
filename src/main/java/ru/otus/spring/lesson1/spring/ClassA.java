package ru.otus.spring.lesson1.spring;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class ClassA {
	private final ClassB b;

	public ClassA(ClassB b) {
		this.b = b;
	}

	@PostConstruct
	public void f() {
		b.f();
		System.out.println("world");
	}
}
