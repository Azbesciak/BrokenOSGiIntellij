package some.impl;

import some.SomeInterface;

public class HelloProvider {
	public static SomeInterface sayHello() {
		return () -> System.out.println("Did I say hello?");
	}
}
