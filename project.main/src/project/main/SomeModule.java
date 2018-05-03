package project.main;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

import some.SomeInterface;
import some.impl.HelloProvider;

import org.osgi.service.component.annotations.Component;
import static org.apache.felix.service.command.CommandProcessor.COMMAND_FUNCTION;
import static org.apache.felix.service.command.CommandProcessor.COMMAND_SCOPE;

@Component(
		immediate = true,
		service = {SomeModule.class},
		property = {
				COMMAND_SCOPE + "=com",
				COMMAND_FUNCTION + "=hello",
				COMMAND_FUNCTION + "=someHello"
		}
)
public class SomeModule extends AbstractModule {
	private static final Named ANNOTATION = Names.named("hello");

	@Override
	protected void configure() {
		bind(Integer.class).annotatedWith(ANNOTATION).toInstance(2);
	}
	
	public void hello() {
		Injector injector = Guice.createInjector(this);
		Integer someInt = injector.getInstance(Key.get(Integer.class, ANNOTATION));
		System.out.printf("Hello Jetbrains - injected Int: %d\n", someInt);
	}
	
	public void someHello() {
		SomeInterface hello = HelloProvider.sayHello();
		hello.sayHello();
	}
}
