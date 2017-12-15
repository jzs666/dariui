package lt.itmokymai.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration

public class AppConfig {
	
	@Bean("ServiceA")
	public ServiceA papildomasServisasA() {
		return new ServiceA();
	}
//
//	@Bean
//	public ServiceB papildomasServisasB() {
//		return new ServiceB();
//	}

}
