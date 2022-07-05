package ru.itsjava;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.itsjava.services.AppService;

@SpringBootApplication
public class MySpringBootJdbcFoundationsApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MySpringBootJdbcFoundationsApplication.class, args);
		context.getBean(AppService.class).start();
	}
}


