package ru.itsjava;

import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import ru.itsjava.dao.UserDao;
import ru.itsjava.domain.User;

import java.sql.SQLException;

@SpringBootApplication
public class MySpringBootJdbcFoundationsApplication {

	public static void main(String[] args) throws SQLException {
		ApplicationContext context = SpringApplication.run(MySpringBootJdbcFoundationsApplication.class, args);

		UserDao userDao = context.getBean(UserDao.class);
		System.out.println("userDao.count() = " + userDao.count());

		User user = new User("User", 33);
		userDao.insert(user);

		System.out.println("userDao.count() = " + userDao.count());

		User updatedUser = new User("User 2", 100);
		updatedUser.setId(1L);
		userDao.update(updatedUser);

		System.out.println("userDao.findById(1L) = " + userDao.findById(1L));
		System.out.println("userDao.findByName(\"User 2\") = " + userDao.findByName("User 2"));

		userDao.delete(updatedUser);

		System.out.println("userDao.count() = " + userDao.count());

		Console.main(args);
	}
}


