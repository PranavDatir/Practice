package day2.Programmatic;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringConfig> configUnit = SpringConfig.class;
		AnnotationConfigApplicationContext annoctx = new AnnotationConfigApplicationContext(configUnit);
		Test obj = annoctx.getBean(Test.class);
		obj.doTest();
	}

}
