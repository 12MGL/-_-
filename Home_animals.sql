DROP DATABASE IF EXISTS Human_Friends;
CREATE DATABASE Human_Friends;
USE Human_Friends;

-- все команды 'Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick', 'Meow', 'Paw', 'Pounce', 'Roll', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk'

DROP TABLE IF EXISTS Pets;
CREATE TABLE Pets (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
type VARCHAR(50) NOT NULL,
birthdate DATE NOT NULL,
commands SET('Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick', 'Meow', 'Paw', 'Pounce', 'Roll', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk')
);

DROP TABLE IF EXISTS Pack_animals;
CREATE TABLE Pack_animals (
id INT PRIMARY KEY AUTO_INCREMENT,
name VARCHAR(50) NOT NULL,
type VARCHAR(50) NOT NULL,
birthdate DATE,
commands SET('command1', 'command2', 'command3', 'command4', 'command5')
);

insert into Pets (name, type, birthdate) VALUES
('Fido',		'Dog', 		20200101),
('Whiskers',	'Cat',		20190515),
('Hammy',		'Hamster',	20210310),
('Buddy',		'Dog',		20181210),
('Smudge',		'Cat',		20200220),
('Peanut',		'Hamster',	20210801),
('Bella',		'Dog',		20191111),
('Oliver',		'Cat',		20200630);

insert into Pets (commands) VALUES
('Sit', 	'Stay', 	'Fetch'),
('Sit', 	'Pounce'),
('Roll', 	'Hide'),
('Sit', 	'Paw', 		'Bark'),
('Sit', 	'Pounce', 	'Scratch'),
('Roll',	'Spin'),
('Sit', 	'Stay', 	'Roll'),
('Meow', 	'Scratch', 	'Jump');

insert into Pack_animals (name, type, birthdate) VALUES
('Thunder',	'Horse',	20150721),
('Sandy',	'Camel',	20161103),
('Eeyore',	'Donkey',	20170918),
('Storm',	'Horse',	20140505),
('Dune',	'Camel',	20181212),
('Burro',	'Donkey',	20190123),
('Blaze',	'Horse',	20160229),
('Sahara',	'Camel',	20150814);

insert into Pack_animals (commands) VALUES
('Trot', 'Canter', 		'Gallop'),
('Walk', 'Carry Load'),
('Walk', 'Carry Load', 	'Bray'),
('Trot', 'Canter'),
('Walk', 'Sit'),
('Walk', 'Bray', 		'Kick'),
('Trot', 'Jump', 		'Gallop'),
('Walk', 'Run');

SELECT * FROM Pets;