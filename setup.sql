CREATE SCHEMA bio;
CREATE USER 'bio'@'%' IDENTIFIED BY 'bio';
GRANT ALL PRIVILEGES ON bio.* TO 'bio'@'%';

USE bio;
CREATE TABLE test (
	id INT NOT NULL AUTO_INCREMENT,
	content TEXT NOT NULL,
	PRIMARY KEY (id)
);
INSERT INTO test (content) VALUES
	('test0'),
	('test1'),
	('test2');
