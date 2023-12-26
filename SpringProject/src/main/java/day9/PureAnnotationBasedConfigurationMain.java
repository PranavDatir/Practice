package day9;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import day2.Programmatic.SpringConfig;

public class PureAnnotationBasedConfigurationMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class<SpringAppConfiguration> configClass = SpringAppConfiguration.class;
		AnnotationConfigApplicationContext annoctx = new AnnotationConfigApplicationContext(configClass);
		//Loading bean of type : First Class
		FirstTest firstTest = annoctx.getBean(FirstTest.class);
		//Loading bean of type : Second Class
		SecondTest secondTest = annoctx.getBean(SecondTest.class);
		//Loading bean of type : Third Class
		Object obj = annoctx.getBean("third");
		ThirdTest thirdTest = (ThirdTest)obj;
		firstTest.doTest();
		secondTest.doTest();
		thirdTest.doTest();
	}

}
