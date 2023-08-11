package durgesh.spring.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpTest {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("empConfig.xml");
		Emp emp1 = (Emp) context.getBean("emp1");
		
		System.out.println(emp1.getName());
		//System.out.println(emp1.getClass());
		System.out.println(emp1.getAddress()); // set
		System.out.println(emp1.getPhones()); //list
		System.out.println(emp1.getCourses()); //map
		System.out.println(emp1.getProps()); //props
	}
}
