use sys;

-- "primaty key" -->unqiue, not null, index
-- "auto increment- > existing  overwrl value +1
create table scientists (
ID integer primary key auto_increment,
First_name varchar(255),
Last_name varchar(255),
Date_of_Birth date,
Nationality varchar(2)
);

create table winners (
ID integer primary key auto_increment,
Recipient integer not null,
Year varchar(4) not null -- 留意
);

create table countries (
ID varchar (2) primary key,
Country_Name varchar(50)
);

create table awards (
ID integer primary key auto_increment,
Main_contribution varchar(50)
);

select * from scientists;

insert into scientists values (21, 'Shafrira', 'Lau', date_format('1953-12-31','%Y-%m-%d'), 'US');
insert into scientists values (22, 'xxxx', 'Lau', date_format('1952-12-31','%Y-%m-%d'), 'UK');
insert into scientists values (23, 'yyyy', 'Lau', date_format('1951-09-30','%Y-%m-%d'), 'IL');
insert into scientists values (24, 'ssss', 'Lau', date_format('1955-10-30','%Y-%m-%d'), 'US');
insert into scientists values (25, 'vvvv', 'Lau', date_format('1954-04-03','%Y-%m-%d'), 'US');
insert into scientists values (26, 'aaa', 'Lau', date_format('1965-02-04','%Y-%m-%d'), 'US');
insert into scientists values (27, 'qqqq', 'Lau', date_format('1963-11-15','%Y-%m-%d'), 'US');
insert into scientists values (28, 'kkkk', 'Lau', date_format('1963-10-27','%Y-%m-%d'), 'IT');

insert into winners values (1, 23, '2011');
insert into winners values (2, 21, '2012');
insert into winners values (3, 28, '2012');
insert into winners values (4, 24, '2013');
insert into winners values (5, 25, '2014');
insert into winners values (6, 26, '2015');
insert into winners values (7, 27, '2015');

insert into countries values ('IL', 'Israel');
insert into countries values ('IT', 'Italy');
insert into countries values ('UK', 'United Kingdom');
insert into countries values ('US', 'United States');

insert into awards values ('2011', 'xxxx yyyy');
insert into awards values ('2012', 'abc abc');
insert into awards values ('2013', 'ijkijk');
insert into awards values ('2014', 'pulu pulu');
insert into awards values ('2015', 'ijk abc');

-- find the scientists getting the award in 2015, 
-- show scientists first and last name and awards contubtion

select scientists.First_name, scientists.Last_name, awards.Main_contribution
from winner w
       inner join scientissts s on w.recipient = s.id
       inner join awards a on w.year = a.id
where w.year = 2015;




----
from scientists s inner join winners w on s.id = w.recipient
inner join awards a on w.year = a.id
where w.year = 2015;