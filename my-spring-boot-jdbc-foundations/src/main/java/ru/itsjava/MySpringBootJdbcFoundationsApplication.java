package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class MySpringBootJdbcFoundationsApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = SpringApplication.run(MySpringBootJdbcFoundationsApplication.class, args);
//		context.getBean(UserService.class).insert(new User("1", 1));

		Console.main(args);
	}
}


