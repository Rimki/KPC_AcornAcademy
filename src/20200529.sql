#emp 테이블에서 사원번호, 사원이름, 직업을 출력. 
SELECT empno, ename, job
FROM emp;

#emp 테이블에서 사원번호,급여,부서번호를 출력하세요. 
#단, 급여가 많은 순서대로 출력
SELECT empno, sal, deptno
FROM emp
ORDER BY sal;

#emp 테이블 에서 사원번호,급여,입사일을 출력. 
#단,급여가 적은 순서대로.

SELECT empno, sal, hiredate
FROM emp
ORDER BY sal ASC

#emp 테이블에서 직업,급여를 출력. 
#단,직업명으로 오름차순, 급여로 내림차순 정렬해서

SELECT job, sal
FROM emp
ORDER BY job ASC, sal DESC;

#emp 테이블에서 empno는 사원번호로 ename 사원이름 으로
#컬럼 정보를 바꿔서 출력하시오

SELECT empno AS "사원 번호", ename AS "사원 이름"
FROM emp;

SELECT empno AS 사원번호, ename AS 사원이름
FROM emp;

SELECT empno 사원번호, ename 사원이름
FROM emp;

SELECT empno "사원 번호", ename "사원 이름"
FROM emp;

#emp 테이블에서 부서번호가 10 번인 사원들의 부서번호와 
#급여와 10% 인상된 금액을  출력
SELECT deptno , sal , sal * 1.2
FROM emp
WHERE deptno = 10

#emp 테이블에서 부서번호가 10 번인 사원들의 부서번호와 
#급여와 급여+커미션  출력


SELECT deptno , sal , sal + ifnull(comm,0)
FROM emp
WHERE deptno = 10;

#emp 테이블에서 급여가 3000 이상인 사원들의 
#모든 정보를 출력

SELECT empno, ename, job, mgr, hiredate, sal, comm, deptno
FROM emp
WHERE sal >= 3000;

#emp 테이블에서 부서번호가 30번이 아닌 사람들의 
#이름과 부서번호를 출력해보세요. 

SELECT ename, deptno
FROM emp
WHERE deptno != 30;

#emp 테이블에서 부서번호가 10번이고 
#급여가 3000 이상인 사원들의 이름과 급여를 출력. 

SELECT ename, sal
FROM emp
WHERE deptno = 10 AND sal >=3000 ;


#emp 테이블에서 직업이 SALESMAN 이거나 
#MANAGER 인 사원의 사원번호와 부서번호를 출력

SELECT empno, deptno , job
FROM emp
WHERE job = 'salesman' OR job = 'manager' ;

SELECT empno, deptno, job
FROM emp
WHERE job = 'salesman'
UNION ALL
SELECT empno, deptno, job
FROM emp
WHERE job = 'manager'

SELECT empno, deptno, job
FROM emp
WHERE job != 'clerk' AND job != 'analyst' 
AND job != 'president';

#부서번호가 10번이거나 20번인 사원의 
#사원번호와 이름, 부서번호 출력. 

SELECT ename, deptno
FROM emp
WHERE deptno = 10 OR deptno = 20;

SELECT ename, deptno
FROM emp
WHERE deptno IN (10,20);

SELECT ename, deptno
FROM emp
WHERE deptno != 30;

#급여가 1000 과 2000 사이인 사원들의 
#사원번호,이름,급여를 출력 

SELECT empno, ename, sal
FROM emp
WHERE sal >= 1000 AND sal <= 2000;

SELECT empno, ename, sal
FROM emp
WHERE sal BETWEEN 1000 AND 2000;

#사원이름이 'FORD' 와 'SCOTT' 사이의 사원들의 
#사원번호,이름을 출력. 

SELECT deptno, ename
FROM emp
WHERE ename >= 'ford' AND ename <= 'scott'
ORDER BY ename ASC;

#사원이름이 'J' 로 시작하는 
#사원의 사원이름과 부서번호를 출력

SELECT ename, deptno
FROM emp
WHERE ename LIKE 'j%'

#사원이름에서  'J' 를 포함하는 
#사원의 사원이름과 부서번호를 출력하기

SELECT ename, deptno
FROM emp
WHERE ename LIKE '%j%';

#사원이름의 두번째 글자가 'A' 인 
#사원의 이름,급여,입사일을 출력

SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '_A%';

#사원 이름이 'ES' 로 끝나는 
#사원의 이름,급여,입사일을 출력해 보세요.

SELECT ename, sal, hiredate
FROM emp
WHERE ename LIKE '%ES';


#입사년도가 81년 인 
#사원들의 입사일과 사원번호를 출력

SELECT ename, hiredate , empno
FROM emp
WHERE hiredate LIKE '1981%';

#커미션이 NULL 인 사원의 사원이름과 커미션을 출력. 

SELECT ename, comm
FROM emp
WHERE comm IS NULL;

#커미션이 NULL 이 아닌 사원의 사원이름과 커미션을 출력. 

SELECT ename, comm
FROM emp
WHERE comm IS NOT NULL 

SELECT CONCAT(ename,'의 직업은', job, ' 입니다.') intro
FROM emp;

SELECT CHAR(97);

SELECT CONCAT(ename,'님') NAME
FROM emp;

SELECT LOWER(ename)
FROM emp;

SELECT UPPER(ename)
FROM emp;

SELECT LPAD('123', 10, '0');

SELECT RPAD('123',10,'0');

#length : 영문일때 1 btye, 한글 3 byte
SELECT LENGTH('스 미쓰');

SELECT ename, LEFT(ename,3)
FROM emp;

SELECT ename, rpad(LEFT(ename,3),length(ename),'*')
FROM emp;

SELECT ename, RIGHT(ename,3)
FROM emp;

SELECT ename, lpad(RIGHT(ename,3),length(ename),'*')
FROM emp;

SELECT ename, SUBSTRING(ename, 3,3)
FROM emp;

SELECT FORMAT(123456.34355,2);

SELECT ename, ifnull(comm, 0) 
FROM emp;

SELECT ABS(-50000000);

SELECT CEIL(4.06789);

SELECT FLOOR(4.99999);

SELECT ROUND(2345.345,2);

SELECT MOD(10,3);

SELECT TRUNCATE(123123.123567,3);

SELECT CURDATE();

SELECT CURTIME();

SELECT NOW();


SELECT NOW(), ADDDATE(NOW(), INTERVAL 2 DAY);

CREATE TABLE test(
id VARCHAR(50) PRIMARY KEY,
sdate DATETIME,
edate DATETIME
);

INSERT INTO test(id, sdate, edate) 
VALUES('syh1011',NOW(), ADDDATE(NOW(), INTERVAL 2 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh2022',NOW(), ADDDATE(NOW(), INTERVAL 20 DAY));

INSERT INTO test(id, sdate, edate) 
VALUES('syh3033',NOW(), ADDDATE(NOW(), INTERVAL 40 DAY));


INSERT INTO test(id, sdate, edate) 
VALUES('syh4044',NOW(), ADDDATE(NOW(), INTERVAL 40 HOUR));


SELECT id, sdate, edate
FROM test;

SELECT NOW(), SUBDATE(NOW() , INTERVAL 2 HOUR );

SELECT DATEDIFF('2020-04-29','2020-05-21');

SELECT id, DATEDIFF(edate, sdate) diff
FROM test;

SELECT id, TIMESTAMPDIFF(minute, sdate, edate)
FROM test;

SELECT id, date_format(sdate,'%Y/%m/%d') sdate, 
DATE_FORMAT(edate, '%Y.%m.%d %h:%i:%s') edate , edate
FROM test;








