package ru.itsjava.dao;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.JdbcTest;
import org.springframework.context.annotation.Import;
import ru.itsjava.domain.Faculty;
import ru.itsjava.domain.User;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

@JdbcTest
@Import(UserDaoImpl.class)
public class UserDaoImplTest {
    private static final String DEFAULT_NAME = "User";
    private static final int DEFAULT_AGE = 100;
    private static final long FIRST_ID = 1L;
    private static final Faculty DEFAULT_FACULTY = new Faculty(1L, "Java Development");

    @Autowired
    private UserDao userDao;

    @Test
    public void shouldHaveCorrectCount() {
        int actualUsersCount = userDao.count();

        assertEquals(1, actualUsersCount);
    }

    @Test
    public void shouldHaveCorrectInsert() {
        User expectedUser = new User(DEFAULT_NAME, DEFAULT_AGE, DEFAULT_FACULTY);
        long idFromDB = userDao.insert(expectedUser);
        User actualUser = userDao.findById(idFromDB);

        assertAll(() -> assertEquals(expectedUser.getName(), actualUser.getName()),
                () -> assertEquals(expectedUser.getAge(), actualUser.getAge()));
    }

    @Test
    public void shouldHaveCorrectUpdate() {
        User expectedUser = new User(FIRST_ID, DEFAULT_NAME, DEFAULT_AGE, DEFAULT_FACULTY);
        userDao.update(expectedUser);
        User actualUser = userDao.findById(FIRST_ID);

        assertEquals(expectedUser, actualUser);
    }

    @Test
    public void shouldHaveCorrectDelete() {
        User deletedUser = userDao.findById(FIRST_ID);
        userDao.delete(deletedUser);

        assertEquals(0, userDao.count());
    }
}