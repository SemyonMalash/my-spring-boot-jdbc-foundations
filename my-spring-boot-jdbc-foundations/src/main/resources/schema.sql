DROP TABLE IF EXISTS users, faculties;

CREATE TABLE users(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR2(256),
    age INT,
    faculty_id BIGINT
);

CREATE TABLE faculties(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    fName VARCHAR2(256)
);

AlTER TABLE users add foreign key (faculty_id) references faculties(id);