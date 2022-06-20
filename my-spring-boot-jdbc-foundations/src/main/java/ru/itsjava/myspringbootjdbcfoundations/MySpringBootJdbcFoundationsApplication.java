package ru.itsjava.myspringbootjdbcfoundations;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;


@SpringBootApplication
public class MySpringBootJdbcFoundationsApplication {

	public static void main(String[] args) throws SQLException {
		SpringApplication.run(MySpringBootJdbcFoundationsApplication.class, args);

		Console.main(args);
	}
}


