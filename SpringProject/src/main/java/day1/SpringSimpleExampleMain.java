package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSimpleExampleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configPath = "spring-config.xml";
		ApplicationContext ctx = new ClassPathXmlApplicationContext(configPath);
		
		Object obj = ctx.getBean("myBean2");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.SayGreeting();
		System.out.println();
	}

}
