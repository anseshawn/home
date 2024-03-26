show tables;

create table insa2(
	idx int not null auto_increment primary key,		/* 고유번호 */
	name varchar(10) not null,			/* 이름 */
	age int not null,								/* 나이 */
	gender char(2) default '여자',		/* 성별 */
	ipsail datetime default now()		/* 입사일 */
);

desc insa2;

insert into insa2 values (default,'홍길동',25,'남자',default);

select * from insa2;
