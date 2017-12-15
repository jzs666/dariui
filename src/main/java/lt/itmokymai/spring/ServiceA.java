package lt.itmokymai.spring;

import javax.annotation.*;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Service;

//implements  BeanPostProcessor
//@Service
public class ServiceA  {
	
	private String message = "Hello world";

	public ServiceA() {
		System.out.println("ServiceA");
	}

	public String getResult() {
		return getMessage();
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	@PostConstruct
	public void preconstruct()
	{
		System.out.println("preconstruct");
	}
	@PreDestroy
	public void predestroy()
	{
		System.out.println("predestroy");
	}

//	public void afterPropertiesSet() throws Exception {
//		System.out.println("After properties set");
//
//	}
//
//	public void destroy() throws Exception {
//		System.out.println("ServiceAB destroyed");
//
//	}
//
//	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("BeforeInitialization : " + beanName);
//		return bean;
//	}
//
//	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
//		System.out.println("PostInitialization : " + beanName);
//		return bean;
//	}
	
	
}