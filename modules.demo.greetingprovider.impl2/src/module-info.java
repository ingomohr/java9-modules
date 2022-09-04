import modules.demo.greetingprovider.GreetingProvider;
import modules.demo.greetingprovider.impl2.GreetingProviderImpl;

module modules.demo.greetingprovider.impl2 {

	requires java.base;
	requires modules.demo.greetingprovider;

	exports modules.demo.greetingprovider.impl2;

	provides GreetingProvider with GreetingProviderImpl;

}