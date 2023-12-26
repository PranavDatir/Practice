package day2.Programmatic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import day1.GreetingService;
import day1.Hello;
import day1.UserGreetingServices;
import day1.UserService;

@Configuration
@ComponentScan
public class SpringConfig {

	@Bean
	public GreetingService helloBean() {
		GreetingService service = new Hello();
		return service;
	}
	 @Bean 
	 public GreetingService userBean(){
		 GreetingService service = new UserService();
		 return service;
	 }
	@Bean("greetingBean")
	@Lazy
	public GreetingService userGreetingBean(){
		 GreetingService service = new UserGreetingServices();
		 return service;
	 }
}
