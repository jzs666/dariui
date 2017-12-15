package lt.itmokymai.spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("application-context.xml");
		ServiceA serviceA = (ServiceA) context.getBean("ServiceA");
		System.out.println(serviceA.getResult());
		((ConfigurableApplicationContext) context).close();
		// ApplicationContext context = new
		// ClassPathXmlApplicationContext("application-context.xml");
		// ServiceB serviceB = (ServiceB) context.getBean("serviceBBean");
		// ((ClassPathXmlApplicationContext) context).close();
		// System.out.println("Hello world");
		// ApplicationContext context = new
		// AnnotationConfigApplicationContext(AppConfig.class);
		// System.out.println("Hello world");
		// ServiceB serviceB = new ServiceB();
		// serviceB = null;
		// ServiceB serviceB = (ServiceB)context.getBean(ServiceB.class);
		// System.out.println(serviceB.getResult());
		// serviceB = null;
		// ((AnnotationConfigApplicationContext) context).close();

	}
}

/*
 * http://www.springframework.org/schema/beans/spring-beans.xsd"
 * http://www.springframework.org/schema/beans/spring-beans-3.0.xsd
 * http://www.springframework.org/schema/context
 * http://www.springframework.org/schema/context/spring-context-3.0.xsd">
 */