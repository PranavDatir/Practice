package day11;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionMain2 {

	private static void printClassInfo(String className) throws ClassNotFoundException {
		//This method prints some information about the class where the class name is accepted by 'className' variable
		
		Class loadedClass = Class.forName(className);
		//Obtaining a list of methods available in this loaded class
		System.out.println("-----------Method Names-----------");
		Method[] allMethods = loadedClass.getDeclaredMethods();
		for(Method currentMethod : allMethods) {
			String methodName = currentMethod.getName();
			System.out.println(methodName);
		}
		
		//Obtaining a list of fields available in this loaded class
		System.out.println("-----------Field Names-----------");
		Field[] allFields = loadedClass.getDeclaredFields();
		for(Field currentField : allFields) {
			String fieldName = currentField.getName();
			System.out.println(fieldName);
		}
	}
	public static void main(String[] args) {
		try {
			printClassInfo("java.lang.Integer");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
