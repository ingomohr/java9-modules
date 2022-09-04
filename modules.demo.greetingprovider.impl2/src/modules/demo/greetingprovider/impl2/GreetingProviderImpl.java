package modules.demo.greetingprovider.impl2;

import modules.demo.greetingprovider.GreetingProvider;

public class GreetingProviderImpl implements GreetingProvider {

	public GreetingProviderImpl(String name) {
		System.out.println("GP2 instantiated for name: " + name);
	}

	@Override
	public String greet(String info) {
		return "Hello " + info + " (GP2)";
	}

	/**
	 * A service impl that has no no-args constructor needs to have a public static
	 * method called "provider".
	 */
	public static GreetingProviderImpl provider() {
		return new GreetingProviderImpl("Provided!");
	}

}
