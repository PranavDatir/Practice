package day1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringBeanScopeMain {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring-config.xml");
		//-------------------------SingleTon------------------------------//
//		Object obj = ctx.getBean("myBean3");
//		Object obj1 = ctx.getBean("myBean3");
//		Object obj2 = ctx.getBean("myBean3");
//		System.out.println(obj == obj1);
//		System.out.println(obj1 == obj2);
		
		//-------------------------Prototype------------------------------//
		Object obj = ctx.getBean("myBean4");
		Object obj1 = ctx.getBean("myBean4");
		Object obj2 = ctx.getBean("myBean4");
		System.out.println(obj == obj1);
		System.out.println(obj1 == obj2);
	}

}
