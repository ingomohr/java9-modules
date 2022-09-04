package modules.demo.app;

import java.util.ServiceLoader;

import modules.demo.greetingprovider.GreetingProvider;

public class App {

	public static void main(String[] args) {
		
		System.out.println("Loading services into ServiceLoader (this is lazy loading)...");
		ServiceLoader<GreetingProvider> loader = ServiceLoader.load(GreetingProvider.class);

		System.out.println("Done");
		System.out.println("\nCalling service impls...");

		loader.forEach(p -> System.out.println(p.greet("Joe")));
		System.out.println("Done");

	}

}
