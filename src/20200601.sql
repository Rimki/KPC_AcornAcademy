#ename 칼럼수를 검색
SELECT COUNT(ename) 
FROM emp;

#comm 칼럼수를 검색. 주의)null 칼럼은 카운트하지 않음.
SELECT COUNT(comm)
FROM emp;

#모든 컬럼을 검색
SELECT COUNT(*)
FROM emp;

SELECT COUNT(empno)
FROM emp;

#sal 총합을 구함

SELECT SUM(sal)
FROM emp;

#comm 총합을 구함. 주의) 총합을 구하는 sum() 함수는
#null이 있더라도 총합을 구해줌.
SELECT SUM(comm)
FROM emp;

SELECT sal, comm, sal + ifnull(comm,0)
FROM emp;

#sal의 평균과 comm평균 구하기. 주의) avg() 함수는
#null를 포함하지 않는다.
SELECT AVG(sal), AVG(comm) , AVG(IFNULL(comm,0)),
SUM(comm)/COUNT(comm) , SUM(comm) / COUNT(*)
FROM emp;


#sal를 가장 많이 받는 사람의 사원번호와 월급을 출력
SELECT empno , MAX(sal)
FROM emp;

#sal를 가장 적게 받는 사람의 사원번호와 월급을 출력
SELECT empno, MIN(sal)
FROM emp;

#부서별 급여의 총합을 출력하라. 
SELECT deptno , sal
FROM emp
ORDER BY deptno ASC;

#부서별 인원수,월급의 평균, 월급합을 검색 

SELECT deptno , COUNT(deptno), round(AVG(sal),1), SUM(sal)
FROM emp
GROUP BY deptno;

#직업별 최대 급여를 구하시오
SELECT job , MAX(sal) maxsal
FROM emp
GROUP BY deptno
ORDER BY maxsal DESC;

#급여가 1000 이상인 사원들의 부서별 평균 급여의 
#반올림 값을 부서번호로 내림차순 정렬해서 출력해보세요. 

SELECT deptno, round(AVG(sal))
FROM emp
WHERE sal >= 1000
GROUP BY deptno
ORDER BY deptno DESC;

#급여가 2000 이상인 사원들의 부서별 평균 급여의 반올림 값을 
#평균 급여의 반올림 값으로 오름차순정렬해서 출력해 보세요. 

SELECT deptno, round(AVG(sal)) avgsal
FROM emp
WHERE sal >= 2000
GROUP BY deptno
ORDER BY avgsal ASC;

#각 부서별 같은 직업(job)를 하는 사람의 인원수를 구해서 부서번호,
#직업(job), 인원수를 부서번호에 대해서 오름차순 정렬해서 출력해 보세요. 

SELECT deptno, job, COUNT(job) jobcount
FROM emp
GROUP BY deptno, job
ORDER BY deptno ASC, jobcount desc;


# 급여가 1000 이상인 사원들의 부서별 평균 급여를 출력해보세요 
# 단, 부서별 평균 급여가 2000 이상인 부서만 출력하세요. 

SELECT deptno, AVG(sal) avgsal
FROM emp
WHERE sal >= 1000
GROUP BY deptno 
HAVING avgsal >= 2000
ORDER BY deptno ASC;

# limit a, b : a는 시작위치 , b는 길이
# limit 0, 10 : 처음부터 10개를 가져옴
# limit 10, 20 : 11부터 20개를 가져옴
SELECT empno, ename, job
FROM emp
ORDER by hiredate DESC
LIMIT 20,30;

SELECT empno, ename, emp.deptno, dept.deptno, dname, loc
FROM emp, dept;

SELECT empno, ename, emp.deptno,dept.deptno, dname, loc
FROM emp , dept
WHERE dept.DEPTNO = emp.deptno;

#EMP 테이블의 모든 사원들의 이름, 부서번호, 부서명을 출력

SELECT ename, dept.deptno , dname
FROM emp , dept
WHERE dept.DEPTNO = emp.deptno;

# 테이블에 alias을 추가하는 경우
SELECT ename, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

#join ~ on 표현식을 사용하는 경우
select ename, d.DEPTNO, dname
FROM emp e JOIN  dept d
ON d.deptno = e.deptno;

#ansi join : join ~ using

SELECT ename, d.deptno , dname
FROM emp e JOIN dept d
USING(deptno);


#급여가 3000 에서 5000 사이의 사원이름과 부서명을 출력
SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno  and sal >= 3000 and sal <= 5000;

SELECT ename, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno  and sal between 3000 and  5000 ;
#부서명이 'ACCOUNTNG' 인 사원의 이름, 입사일, 부서번호, 
#부서명을 출력

SELECT ename, hiredate, d.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno and dname = 'ACCOUNTING';

#커미션이 null 이 아닌 사원의 이름, 입사일, 부서명을 출력
#단 입사일은 2020년 11월 20일 형식으로 출력
SELECT ename, date_format(hiredate,'%Y년%m월%d일'), dname
FROM emp e, dept d
WHERE d.DEPTNO = e.DEPTNO AND comm IS NOT NULL ;


#부서명이 'ACCOUNTNG' 인 사원의 이름, 입사일, 부서번호, 부서명을 출력
#단 입사일은 2020년 11월 20일 형식으로 출력

SELECT ename, DATE_FORMAT(hiredate, '%Y년 %m월 %d일'), 
e.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND dname = 'ACCOUNTING';

SELECT * FROM emp;

INSERT INTO emp(empno, ename, job, mgr, hiredate, sal, comm)
VALUES(8000,'ERIC','CLERK',7900,'1983-02-25',500,NULL);

#사원번호,부서번호,부서명을 출력하세요 
#단, 사원이 근무하지 않는 부서명도 같이 출력해보세요. 

SELECT empno , e.deptno, dname
FROM emp e, dept d
WHERE d.deptno = e.deptno;

SELECT empno, e.deptno, dname
FROM emp e LEFT JOIN dept d
ON d.DEPTNO = e.deptno;

#1. emp 테이블과 dept 테이블을 조인하여 
#부서번호, 부서명, 이름, 급여를 출력

SELECT d.deptno, dname, ename, sal
FROM emp e, dept d
WHERE d.deptno = e.deptno;

#2. 사원의 이름이 'ALLEN' 인 사원의 부서명을 출력

SELECT dname
FROM emp e, dept d
WHERE d.deptno = e.deptno AND ename = 'ALLEN';

#3. 모든 사원의 이름, 부서번호, 부서명, 급여를 출력 
#단, emp 테이블에 없는 부서도 출력

SELECT ename, d.deptno, dname, sal
FROM emp e LEFT JOIN dept d
ON d.deptno = e.deptno;

#4. 사원의 이름과 급여, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인해야 함.
SELECT ename, sal, grade
FROM emp e, salgrade s
WHERE sal BETWEEN losal AND hisal;

#5. 사원의 이름과, 부서명, 급여의 등급을 출력
#emp 테이블과 salgrade 테이블을 조인해야 함.

SELECT ename, dname, grade
FROM emp e, dept d, salgrade s
WHERE d.deptno = e.deptno AND sal BETWEEN losal AND hisal;

# 'SMITH' 가 근무하는 부서명을 서브쿼리를 이용해서 출력.

SELECT ename, dname
FROM emp e, dept d
WHERE d.DEPTNO = e.deptno AND ename = 'SMITH';

#'ALLEN' 과 같은 부서에서 근무하는 사원의 이름과 
# 부서의 번호를 출력
SELECT ename, deptno
FROM  emp 
WHERE deptno = (SELECT deptno
FROM emp 
WHERE ename = 'ALLEN');

#직업이 'SALESMAN' 사람의 사원번호와 직업을 출력

SELECT empno, job
FROM emp
WHERE job = 'SALESMAN';


SELECT empno, job
FROM (SELECT empno, job FROM emp WHERE job= 'SALESMAN') a;