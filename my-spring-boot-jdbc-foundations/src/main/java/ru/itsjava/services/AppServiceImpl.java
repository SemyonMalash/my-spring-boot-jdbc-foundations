package ru.itsjava.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.itsjava.dao.FacultyDao;
import ru.itsjava.domain.Faculty;
import ru.itsjava.domain.User;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AppServiceImpl implements AppService {
    private final UserService userService;
    private final IOService ioService;
    private final FacultyDao facultyDao;

    @Override
    public void start() {
        System.out.println("Добро пожаловать!");
        while (true) {
            System.out.println("Введите номер меню");
            System.out.println("1 -- напечать всех пользователей, 2 - добавить пользователя, остальное выход");
            int menuNum = ioService.inputInt();


            if (menuNum == 1) {
                printAllUsers();
            } else if (menuNum == 2) {
                insertUser();
            } else {
                System.exit(0);
            }
        }
    }

    @Override
    public void insertUser() {
        System.out.println("Введите пользователя");
        System.out.println("Введите имя");
        String name = ioService.input();
        System.out.println("Введите возраст");
        int age = ioService.inputInt();
        System.out.println("Введите факультет");
        String faculty = ioService.input();
        Faculty usersFaculty = facultyDao.findByName(faculty);

        User user = new User(name, age, usersFaculty);
        userService.insert(user);
    }

    @Override
    public void printAllUsers() {
        List<User> userList = userService.findAll();

        System.out.println("Список пользователей" + userList);
    }
}
