package durgesh.spring.refType;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class RefTypeTest {
public static void main(String[] args) {
	ApplicationContext context=new ClassPathXmlApplicationContext("refTypeConfig.xml");
	A a = (A) context.getBean("aref");
	System.out.println(a.getX());
	
	/*
	 * B b = (B) context.getBean("bref"); System.out.println(b.getY());
	 */
	System.out.println(a.getOb().getY()); //getting value of B from a
	System.out.println(a);
}
}
