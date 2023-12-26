package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterAndConstructorMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		System.out.println("--------Setter Injection------");
		Object obj = ctx.getBean("myBean5");
		GreetingService gs = (GreetingService)obj;
		String greeting = gs.SayGreeting();
		System.out.println(greeting);
		
		System.out.println("--------Constructor Injection------");
		obj = ctx.getBean("myBean6");
		gs = (GreetingService)obj;
		greeting = gs.SayGreeting();
		System.out.println(greeting);

	}

}
