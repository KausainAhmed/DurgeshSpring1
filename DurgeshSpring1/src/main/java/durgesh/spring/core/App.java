package durgesh.spring.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
   ApplicationContext context=new ClassPathXmlApplicationContext("studentConfig.xml");
   Student st1=(Student) context.getBean("student1");
   Student st2=(Student) context.getBean("student2");
   System.out.println(st1);
   System.out.println("-----------------------------");
   System.out.println(st2);
  
   
 
    }
}
