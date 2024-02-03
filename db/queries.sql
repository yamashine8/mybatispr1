create table users(
    id int primary key,
    name VARCHAR(20),
    salary VARCHAR(20)
);


INSERT INTO users (id, name, salary)
VALUES (1, 'Егор', '45000' ),
       (2, 'Сергей', '46000' ),
       (3, 'Иван', '48000' ),
       (4, 'Алексей', '45000' );
