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
commands SET('Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick', 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk')
);

insert into Pets (name, type, birthdate, commands) VALUES
('Fido',		'Dog', 		20200101, 'Sit,Stay,Fetch'),
('Whiskers',	'Cat',		20190515, 'Sit,Pounce'),
('Hammy',		'Hamster',	20210310, 'Roll,Hide'),
('Buddy',		'Dog',		20181210, 'Sit,Paw,Bark'),
('Smudge',		'Cat',		20200220, 'Sit,Pounce,Scratch'),
('Peanut',		'Hamster',	20210801, 'Roll,Spin'),
('Bella',		'Dog',		20191111, 'Sit,Stay,Roll'),
('Oliver',		'Cat',		20200630, 'Meow,Scratch,Jump')
;


insert into Pack_animals (name, type, birthdate, commands) VALUES
('Thunder',	'Horse',	20150721, 'Trot,Canter,Gallop'),
('Sandy',	'Camel',	20161103, 'Walk,Carry Load'),
('Eeyore',	'Donkey',	20170918, 'Walk,Carry Load,Bray'),
('Storm',	'Horse',	20140505, 'Trot,Canter'),
('Dune',	'Camel',	20181212, 'Walk,Sit'),
('Burro',	'Donkey',	20190123, 'Walk,Bray,Kick'),
('Blaze',	'Horse',	20160229, 'Trot,Jump,Gallop'),
('Sahara',	'Camel',	20150814, 'Walk,Run');

DELETE FROM Pack_animals WHERE type = 'Camel';
UPDATE Pack_animals SET type = 'Horse/Donkey' WHERE type IN ('Horse', 'Donkey');
SELECT * FROM Pack_animals;


DROP TABLE IF EXISTS to3years;
CREATE TABLE to3years (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(50) NOT NULL,
    type VARCHAR(50) NOT NULL,
    birthdate DATE NOT NULL,
    age INT NOT NULL,
    commands SET('Bark', 'Bray', 'Canter', 'Carry Load', 'Fetch', 'Gallop', 'Hide', 'Jump', 'Kick', 'Meow', 'Paw', 'Pounce', 'Roll', 'Run', 'Sit', 'Stay', 'Spin', 'Scratch', 'Trot', 'Walk')
);
SELECT * FROM to3years;