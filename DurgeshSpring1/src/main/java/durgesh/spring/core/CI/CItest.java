package durgesh.spring.core.CI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CItest {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("ciConfig.xml");
		Person p = (Person) context.getBean("person");
		System.out.println(p);
		Addition add = (Addition) context.getBean("add");
		add.doSum();

	}
}
//end of program 
