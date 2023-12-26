package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class SpringGreetingMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String configPath = "spring-config.xml";
		ApplicationContext ctx = new FileSystemXmlApplicationContext(configPath);
		
		Object obj = ctx.getBean("myBean");
		GreetingService gs = (GreetingService)obj;
		String reply = gs.SayGreeting();
		System.out.println(reply);
	}

}
