package lt.itmokymai.spring;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;


public class ServiceB {
	
	@Autowired
	private ServiceA serviceA;
	private Integer age;
	private String name;
	
	public ServiceB() {
		System.out.println("Constructor B");
	}
//	public ServiceB(ServiceA serviceA)
//	{
//		System.out.println("Constructor");
//		this.serviceA = serviceA;
//	}
	@PreDestroy
	public void preDestroy() {
		System.out.println("preDestroy");
	}
	
	@PostConstruct
	public void postProduction() {
		System.out.println("postProduction");
	}
	
	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getAge() {
		return age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	public String getResult()
	{
		serviceA.setMessage("Hello, from message B");
		return "Method";
	}

}
