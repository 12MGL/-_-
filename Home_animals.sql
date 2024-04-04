DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;

-- все команды 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick', 'Meow', 'Paw', 'Pounce', 'Roll', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'

DROP TABLE IF EXISTS Pets;
CREATE TABLE Pets (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
birthdate DATE NOT NULL,
commands SET('command1', 'command2', 'command3', 'command4', 'command5')
);

DROP TABLE IF EXISTS Pack_animals;
CREATE TABLE Pack_animals (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
birthdate DATE NOT NULL,
commands SET('command1', 'command2', 'command3', 'command4', 'command5')
);

insert into Pets VALUES
('Fido',		'Dog',		'2020-01-01'),
('Whiskers',	'Cat',		'2019-05-15'),
('Hammy',		'Hamster',	'2021-03-10'),
('Buddy',		'Dog',		'2018-12-10'),
('Smudge',		'Cat',		'2020-02-20'),
('Peanut',		'Hamster',	'2021-08-01'),
('Bella',		'Dog',		'2019-11-11'),
('Oliver',		'Cat',		'2020-06-30');

insert into Pets (commands) VALUES
('Sit', 	'Stay', 	'Fetch'),
('Sit', 	'Pounce'),
('Roll', 	'Hide'),
('Sit', 	'Paw', 		'Bark'),
('Sit', 	'Pounce', 	'Scratch'),
('Roll',	'Spin'),
('Sit', 	'Stay', 	'Roll'),
('Meow', 	'Scratch', 	'Jump');

insert into Pack_animals VALUES
('Thunder',	'Horse',	'2015-07-21'),
('Sandy',	'Camel',	'2016-11-03'),
('Eeyore',	'Donkey',	'2017-09-18'),
('Storm',	'Horse',	'2014-05-05'),
('Dune',	'Camel',	'2018-12-12'),
('Burro',	'Donkey',	'2019-01-23'),
('Blaze',	'Horse',	'2016-02-29'),
('Sahara',	'Camel',	'2015-08-14');

insert into Pack_animals (commands) VALUES
('Trot', 'Canter', 		'Gallop'),
('Walk', 'Carry Load'),
('Walk', 'Carry Load', 	'Bray'),
('Trot', 'Canter'),
('Walk', 'Sit'),
('Walk', 'Bray', 		'Kick'),
('Trot', 'Jump', 		'Gallop'),
('Walk', 'Run');