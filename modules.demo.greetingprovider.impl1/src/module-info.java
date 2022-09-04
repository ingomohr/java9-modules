import modules.demo.greetingprovider.GreetingProvider;
import modules.demo.greetingprovider.impl1.GreetingProviderImpl;

module modules.demo.greetingprovider.impl1 {
	
	requires modules.demo.greetingprovider;
	exports modules.demo.greetingprovider.impl1;
	
	provides GreetingProvider with GreetingProviderImpl;
}