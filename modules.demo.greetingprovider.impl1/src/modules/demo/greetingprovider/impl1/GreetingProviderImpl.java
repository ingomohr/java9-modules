package modules.demo.greetingprovider.impl1;

import modules.demo.greetingprovider.GreetingProvider;

public class GreetingProviderImpl implements GreetingProvider {
	
	public GreetingProviderImpl() {
		System.out.println("GP1 instantiated");
	}

	@Override
	public String greet(String info) {
		return "Hello " + info + " (GP1)";
	}

}
