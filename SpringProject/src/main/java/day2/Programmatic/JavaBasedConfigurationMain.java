package day2.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day1.GreetingService;

public class JavaBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext annoctx = new AnnotationConfigApplicationContext();
		Class<SpringConfig> configurationUnit = SpringConfig.class;
		annoctx.register(configurationUnit);
		annoctx.refresh();
		
		Object obj = annoctx.getBean("helloBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.SayGreeting();
		System.out.println(reply);
		
		obj = annoctx.getBean("userBean");
		gs = (GreetingService)obj;
		reply = gs.SayGreeting();
		System.out.println(reply);
		
		Object obj1 = annoctx.getBean("greetingBean");
		Object obj2 = annoctx.getBean("greetingBean");
		System.out.println(obj1==obj2);
		
		
	}

}
