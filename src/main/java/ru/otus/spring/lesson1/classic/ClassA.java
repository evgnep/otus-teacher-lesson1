package ru.otus.spring.lesson1.classic;

public class ClassA {
	private final ClassB b;

	public ClassA() {
		this.b = new ClassB(new ClassC());
	}

	public void f() {
		b.f();
		System.out.println("world");
	}
}
