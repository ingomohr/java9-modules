import modules.demo.greetingprovider.GreetingProvider;

module modules.demo.app {
	
	requires java.base;
	requires modules.demo.greetingprovider;
	
//	requires modules.demo.greetingprovider.impl1;
//	requires modules.demo.greetingprovider.impl2;
	
	uses GreetingProvider;
	
	
}