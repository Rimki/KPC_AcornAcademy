CREATE TABLE member(
num INT PRIMARY KEY,
NAME VARCHAR(50),
addr VARCHAR(50));

DESC member;

INSERT INTO member (num, NAME, addr) VALUES (1,"성영한",'서울');
INSERT INTO member (num, NAME) VALUES(2,'손정의');
INSERT INTO member VALUES(3,'잡스','미국');
#에러 발생 - primary key 칼럼에는 중복된 값이 들어가면 안됨
INSERT INTO member (num,NAME, addr) VALUES(1,'조스','미국');
#에러 발생 - primary key 칼럼에는 값이 반드시 있어야 함.
INSERT INTO member (NAME, addr) VALUES('조스','미국');

SELECT * FROM member;




