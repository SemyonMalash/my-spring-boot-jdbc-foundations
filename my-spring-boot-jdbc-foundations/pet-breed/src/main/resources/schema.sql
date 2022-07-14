DROP TABLE IF EXISTS pets, breeds;

CREATE TABLE pets(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    breed_id BIGINT
);

CREATE TABLE breeds(
    id BIGINT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR2(256)
);

AlTER TABLE pets add foreign key (breed_id) references breeds(id);