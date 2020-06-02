# 'ALLEN' 의 급여와 동일하거나 더 많이 받는 
# 사원의 이름과 급여를 출력해 보세요. 

SELECT ename, sal
FROM emp
WHERE sal >= (SELECT sal FROM emp WHERE ename='ALLEN');

# 'DALLAS' 에서 근무하는 사원의 이름, 부서번호를 출력

SELECT ename, deptno
FROM emp
WHERE  deptno = (SELECT deptno FROM dept WHERE loc='DALLAS');

# 'SALES' 부서에서 근무하는 모든 사원의 이름과 급여를 출력
SELECT ename, sal
FROM emp
WHERE deptno = (SELECT deptno FROM dept WHERE dname='SALES');

# 자신의 직속 상관이 'KING' 인 사원의 이름과 급여를 출력

SELECT ename, sal
FROM emp
WHERE mgr = (SELECT empno FROM emp WHERE ename='KING');

#급여를 3000 이상받는 사원이 소속된 부서와 동일한 부서에서 
#근무하는 사원들의 이름과 급여, 부서번호를 출력

SELECT ename, sal, deptno
FROM emp
WHERE deptno IN (SELECT deptno FROM emp where sal >= 3000);

# IN 연산자를 이용하여 부서별로 가장 급여를 많이 받는 
# 사원의 사원번호, 급여, 부서번호를 출력

SELECT empno, sal, deptno
FROM emp
WHERE sal IN(SELECT  MAX(sal) FROM emp GROUP BY deptno);

#직책이 MANAGER 인 사원이 속한 부서의 
#부서번호와 부서명과 부서의 위치를 출력

SELECT deptno 
FROM emp
WHERE job = 'MANAGER';
# 10 20 30

SELECT deptno, dname, loc
FROM dept
WHERE deptno = 10 OR deptno = 20 OR deptno = 30;

#sub query
SELECT deptno, dname, loc
FROM dept
WHERE deptno IN (SELECT deptno 
FROM emp
WHERE job = 'MANAGER');

#직책이 'SALESMAN' 보다 급여를 많이 받는 
#사원들의 이름과 급여를 출력 (ANY 연산자 이용) 

SELECT sal
FROM emp
WHERE job = 'SALESMAN';

SELECT ename, sal
FROM emp
WHERE sal > (SELECT MIN(sal) FROM emp WHERE job = 'SALESMAN');

SELECT ename, sal
FROM emp
WHERE sal > ANY(SELECT sal FROM emp WHERE job = 'SALESMAN');

# EMP 테이블에 아래와 같은 사원을 추가
#EMPNO : 8001 , ENAME : 최수만, JOB : 방장, MGR : 7900
#HIREDATE : 오늘 , SAL : 2000, COMM : 100 , DEPTNO : 40 

#date => curdate() : 2020-06-02
#datetime => now() : 2020-06-02 11:25:45
INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm, 
deptno)VALUES(8001, '최수만','방장',7900,CURDATE(), 2000,100,40);

SELECT *
FROM emp;

# member 테이블의 내용중 num 칼럼이 3 인 회원의 
# 주소를 한국 으로 수정.

UPDATE member
SET addr = '한국'
WHERE num = 3;

SELECT * FROM member;

# member 테이블 내용중 num 칼럼이 2인 회원의 
# 이름과 주소를 '손마사요시' , '일본' 으로 수정

UPDATE member
SET NAME = '손마사요시', addr = '일본'
WHERE num = 2; 

# member 테이블에서 num 칼럼이 3인  회원의 정보를 삭제.

DELETE FROM member WHERE num = 3;

#트랜잭션 시작
START TRANSACTION;

INSERT INTO member(num , NAME, addr) VALUES(10,'베조스1','미국');
INSERT INTO member(num , NAME, addr) VALUES(11,'머스크1','미국');
INSERT INTO member(num , NAME, addr) VALUES(12,'이재용1','한국');

#트랜잭션 끝 : 모두 수행
COMMIT;
#트랜잭션 끝 : 모두 취소
ROLLBACK;

SELECT * FROM member;

SELECT @@autocommit;
#autocommit : 0 => 자동 커밋을 지원하지 않음
#autocommit : 1 => 자동 커밋을 지원함.
SET autocommit = 1;

#varchar(크기) : 크기는 21842
CREATE TABLE test(
num INT,
NAME VARCHAR(21842)
);

#테이블 구조 확인하기
DESC member1;

#테이블 이름 변경하기
ALTER TABLE member RENAME member1;

#테이블 삭제 하기
DROP TABLE test;

SELECT * FROM emp;


CREATE TABLE dept2(
deptno TINYINT  PRIMARY KEY,
dname VARCHAR(15) DEFAULT '영업부',
loc CHAR(1) CHECK(loc IN('1','2'))
);

INSERT INTO dept2(deptno, dname, loc) VALUES(10,'관리부','1');
INSERT INTO dept2(deptno, dname, loc) VALUES(20,'관리부','3');
INSERT INTO dept2(deptno,  loc) VALUES(30,'2');
INSERT INTO dept2(deptno, dname, loc) VALUES(30,'관리부','3');
SELECT * FROM dept2;

CREATE TABLE dept3(
deptno TINYINT PRIMARY KEY,
dname VARCHAR(15) NOT null
);

INSERT INTO dept3(deptno, dname) VALUES(10,'총무부');
INSERT INTO dept3(deptno, dname) VALUES(10,NULL);

CREATE TABLE emp2(
empno SMALLINT PRIMARY KEY,
ename VARCHAR(15) NOT NULL,
deptno TINYINT,
FOREIGN KEY(deptno) REFERENCES dept2(deptno)
);

INSERT INTO emp2(empno, ename, deptno) VALUES(1000,'KIM',10);
INSERT INTO emp2(empno, ename, deptno) VALUES(2000,'LEE',20);
#외래키를 사용할때 부모 테이블에 존재하는 정보를 사용해야 함.
INSERT INTO emp2(empno, ename, deptno) VALUES(3000,'PARK',40);
INSERT INTO emp2(empno, ename) VALUES(3000,'PARK');


# 칼럼 추가
ALTER TABLE dept3 ADD(loc CHAR(1));
DESC dept3;

#컬럼 수정
ALTER TABLE dept3 MODIFY loc CHAR(2);
DESC dept3;

#컬럼 이름 수정
ALTER TABLE dept3 CHANGE loc location CHAR(2);
DESC dept3;

#컬럼 삭제
ALTER TABLE dept3 DROP location;
DESC dept3;

CREATE TABLE dept4(
deptno TINYINT,
dname VARCHAR(15),
loc VARCHAR(13)
);
# 테이블 복사1
INSERT INTO dept4 SELECT * FROM dept;
SELECT * FROM dept4;

# 테이블 복사2 => 제약조건은 복사 안됨
CREATE TABLE dept5 AS SELECT * FROM dept;
DESC dept5;
SELECT * FROM dept5;
# 테이블 구조만 복사하는 방법
CREATE TABLE dept6 AS SELECT * FROM dept WHERE 1=2;
DESC dept6;
SELECT * FROM dept6;

