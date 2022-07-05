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

CREATE TABLE pets(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    breed_id BIGINT
);

CREATE TABLE breeds(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR2(256)
);

AlTER TABLE pets add foreign key (breed_id) references breeds(id);