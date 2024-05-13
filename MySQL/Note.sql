use sys;

-- Create Table Statment
create table Circle (
radius decimal(3,2)
);

-- Basic select Statment
select * from Circle;

-- Insert data

-- Approach 1 insert into xx (colum_name...) values (...);
insert into Circle(RADIUS) VALUES (2.34); -- Decimal(3,2) -> integer , 2. decimal places 
-- insert into Circle (Radius) values (10.34); 不可以
insert into Circle(Radius) values (1.346); -- 小數位有限

-- Approach 2: insert into xxx values (...);
insert into Circle values (0.37);

-- Delete data
delete from Circle where radius >= 3.35;

-- Updata data (UPDATE table_name set columa_name = XXX WHERE...)
update circle set radius = 1.99 where radius < 1;

-- Add column
alter table circle add color varchar(20);

select * from Circle;

-- insert
insert into circle (color, radius) values ('RED', 3.14); -- 調位可以輸入alter color先後radius
insert into circle values (1.99, 'YELLOW'); -- follow the defalt ordering

alter table circle add emailw varchar(20);

INSERT INTO circle (radius, color, emailw) VALUES (1.35, 'YELLOW', 'email1');

-- deleteI成行列
ALTER TABLE circle DROP COLUMN emailw;


INSERT INTO circle (radius, color, emailw) VALUES (1.35, 'YELLOW', 'email1');
delete from Circle where radius = 1.99;

-- Select where and
select * from circle where color = 'READ' and radius < 3;
select * from circle where color = 'READ' or radius < 3;

-- delete
delete from circle where color = 'YELLOW' and radius > 4;
delete from circle where color = 'YELLOW' or radius > 4;

-- update
update circle set color = 'BLACK' where color = 'RED' or color = 'YELLOW';

select * from circle where color is null;
select * from circle where color is not null;

-- Math Operator
-- =, => <= > < ><
select * from circle where color <> 'BLACK';  -- not equals to BLACK, not INCLUDING null values
select * from circle where color = 'BLACK' or color is null; -- 找出 BLACK AND NULL

-- dual
select l, 'hello' from dual; 
select * from circle; -- * mean all colums in table
select radius, color from cicle; -- 只更改之前alter
select radius, color, "hello" from circle; -- 新增一行做HELLO 全部都是ABC
select radius as c_radius, color as c_color, "hello" as abc from circle; --

delete from circle;
truncate circle;
select * from circle;

insert into Circle values (3.15, 'YELLOW', 'FE'); 
insert into Circle values (7.8, 'RED','FE'); 
insert into Circle values (9.99, 'RED','FE'); 

-- DISTINCT
select distinct color from cicle;
select distinct color from circle where radius > 7;

-- Between (numbers or date)
select * from circle where radius between 6 and 9.99; -- incluesive

alter table circle add create_date date;

insert into Circle values(9.43, 'WHITE', str_to_date('2012,12,13', '%Y,%m,%d'));
insert into Circle values(2.19, 'RED', str_to_date('2010,12,13', '%Y,%m,%d'));

select * from circle order by create_date asc;
select * from circle where create_date is not null order by create_date asc;
select * from circle where create_date is not null order by create_date; -- by default "ascending" order
select * from circle where create_date is not null order by create_date desc; -- descending order
select * from circle order by create_date desc; -- null value is in the last ordering

select round (radius * radius * pi(),2)  as area, radius ,color from circle; -- 將所有變成4寫5入

-- LIMIT (ues it with ordering 只找出一行滿足下方條件)
select * from circle where create_date is not null order by create_date desc limit 1;

-- LIKE
select * from circle where color like 'R%' ; -- ALL COLOR STARTS WITH R CHARACTER
select * from circle where color like 'Y%' ; -- ALL COLOR STARTS WITH Y CHARACTER

select * from circle where color like '%W' ; -- ALL COLOR ENDS WITH W CHARACTER

select * from circle where color like '%E%' ; -- ALL COLOR CONTAINS E CHARACTERS
select * from circle where color like '%ED%' ; -- ALL COLOR CONTAINS ED

select * from circle where clolor in ('YELLOW' , 'RED') ;-- OR

create table customer2 (
 id integer,
 first_name varchar(20),
 last_name varchar(20),
 phone varchar(50),
 email varchar(50)
 );
 
 insert into customer2 values (1, 'Vincert', 'Lau', '852 123425627', 'vincent@gmail.com'),
                              (2, 'Oscar', 'Lo', '852 12345678', 'vincent@gmail.com');
                              
 insert into customer2 values (3, 'Jenny', 'Lau', '852 123425627', 'vincent@gmail.com');

                              
select concat(first_name, ' ', last_name) as full_name from customer2; -- 合拚
select substring(last_name, 1, 1) as first_character from customer2;-- 選L的姓氏
select length(first_name), length(last_name) from customer2; -- 計字數
select upper(first_name), lower(first_name), concat(first_name, ' ', upper(last_name)) from customer2; -- 大草 + 細草

select c.*, length(trim(c.phone)), length(c.phone) from customer2 c; -- 要比個名 C 裝往佢地數字

select replace(concat(first_name, ' ' , last_name), 'Lau' , 'Chan') new_name from customer2; -- 新一行要新名兩個合拚alter

select left(first_name, 2), right(first_name,2) from customer2; -- 選擇字數位置alter

select concat_ws(' ', first_name, last_name), concat(first_name, '' , last_name) as full_name from customer2; -- 合新名full name

-- indexOf
select c.*, instr(c.first_name, 'i') from customer2 c;
select c.*, instr(c.first_name, 'in') from customer2 c;
select c.*, instr(c.first_name, 'Jenny') from customer2 c;

-- MYSQL case insensitive (product specific feature)
select* from customer2 where last_name = 'Lau';
select* from customer2 where last_name = 'lau';
select* from customer2 where last_name = 'LAU';

-- correct way
select* from customer2 where upper (last_name) = ' LAU';-- 大草是LAU
select* from customer2 where lower (last_name) = ' lau'; -- 細草是lau

-- Like% (zero or more character), _(single character)
select * from customer2 where first_name like '%ncert'; -- OK
select * from customer2 where first_name like '_ncert';-- NOT OK 因為隱藏兩隻字
select * from customer2 where first_name like '_incert'; -- OK 因為1隻字

select ceil(4.3) from dual; -- 5
select ceil(4.333) from dual; -- 5
select floor(4.3) from dual; -- 4
select floor(4.3333) from dual; -- 4
select round(4.353,1), round(4.353,2) from dual; -- 4.4 ,4.35
select abs(-5), abs(5) from dual; -- 5, 5
select power(2,3) ,power(-2,3)from dual; -- 8 , -8

-- DATEADD
select date_add('2023-07-15', interval 3 month) from dual; -- +3個月
select date_add('2023-07-15', interval 1 day) from dual; -- +1日
select str_to_date('2023-07-15','%Y-%m-%d') +1 from dual; -- 不能
select date_sub('2024-01-02', interval 2 day) from dual; -- 減2日

select now() from dual; -- timestamp 現在時間

select extract(month from '2023-12-31')from dual; -- 只要月份
select extract(day from '2023-12-31')from dual; -- 只要日子

select ifnull(null,0) from dual;

select * from customer2;

insert into circle values (null, 'BLACK', null);
-------------------------------------------------------------------------
select c.*,
         case
			when color ='RED' and c.radius > 3 then 'R' -- You can use and, or in case statement
            when color = 'YELLOW' then 'Y'
            else 'B'
            end as color_short_name
            from circle c ;

select * from customer2;
alter table customer2 add membership varchar(1);
update customer2 set membership = 'G' where upper(coalesce(last_name,'x'))='LAU';
update customer2 set membership = 'S' where upper(coalesce(last_name,'x'))<>'LAU';

 insert into customer2 values (4, 'Paul', 'CHAN', '852 123425627', 'vincent@gmail.com', 'S');

-- G 2
-- S 1

select distinct membership, count(membership);

select membership, count(membership), avg(age), max(age), min(age)
from customer2
group by membership; -- 先EXECUTE 行

alter table customer2 add age int;
update customer2 set age = 13 where first_name = 'Vincent'; -- 額外加AGE 及更改AGE
update customer2 set age = 18 where first_name = 'Jenny';
update customer2 set age = 30 where first_name not in ('Vincent', 'Jenny');

select first_name, count(membership), avg(age), max(age), min(age) -- 選擇 aggreagation function together with group by
from customer2
group by first_name; -- 先EXECUTE 行 命令GROUP咩

-- wrong sql
select phone
from customer2
group by last_name;

-- where can work with "group by"
select membership, count(1) as count
from customer2
where upper(ifnull(last_name, 'x')) <> 'LAU' -- execute before "group by"
group by membership;

-- having group by
select last_name, count(last_name) as count -- 5. 選擇番LAST NAME 餘下的條件
from customer2 -- 1.在customer裡找
where upper(ifnull(last_name, 'x')) <> 'LO' -- 2.條件 last name 不是'LO'
group by last_name  -- 3.在LAST NAME
having count(last_name) > 1; -- 4.餘下LAST NAME 大過 1 或 = 2的條件

select c.*, 'hello' as greeting
from customer2 c;

select count(1)
from customer2 c;

select count('hello')
from customer2 c;

-- customer vs order
create table order2 (
    id int,
    customer_id int,
    delivery_address varchar(100),
    total_amount decimal(10,2)
    );
    
insert into customer3 values (1, 'Vincent', 'Lau', '852 12345678', 'vincent@gmail.com'),
							 (2, 'Oscar', 'Lo', '852 87654321', 'oscar@gmail.com');

insert into customer3 values (3, 'Jenny', 'Lau', ' 852 43121234 ', 'vincent@gmail.com');

insert into order3 values (1, 2, 'ABC XYZ', 100.44);
insert into order3 values (2, 2, 'xxxABC XYZ', 22.88);
insert into order3 values (3, 1, 'aaABC XYZ', 12.12);
insert into order3 values (4, 3, 'aaAfffffBC XYZ', 90.12);

-- With Foreign Key: you cannnot add a child row with foreign key value not exists in parent primary key column
insert into order3 values (5, 4, 'XYZ', 90.12); -- NOT OK

create table customer3 (
	id integer primary key auto_increment,
	first_name varchar(20),
    last_name varchar(20),
	phone varchar(50),
    email varchar(50)
);

create table order3 (
	id integer auto_increment,
    customer_id integer,
    delivery_address varchar(100),
    total_amount decimal(10,2),
    primary key (id), -- another way to create primary key
    constraint FK_CustomerOrder foreign key (customer_id) references customer3(id)
);

insert into customer3 values (1, 'Vincent', 'Lau', '852 12345678', 'vincent@gmail.com'),
							 (2, 'Oscar', 'Lo', '852 87654321', 'oscar@gmail.com');

insert into customer3 values (3, 'Jenny', 'Lau', ' 852 43121234 ', 'vincent@gmail.com');


insert into order3 values (1, 2, 'ABC XYZ', 100.44);
insert into order3 values (2, 2, 'xxxABC XYZ', 22.88);
insert into order3 values (3, 1, 'aaABC XYZ', 12.12);
insert into order3 values (4, 3, 'aaAfffffBC XYZ', 90.12);

-- With Foreign Key: you cannnot add a child row with foreign key value not exists in parent primary key column
insert into order3 values (5, 4, 'XYZ', 90.12); -- NOT OK customer 只有3  foreign key value


-- Inner Join
select c.first_name, c.last_name, o.delivery_address, o.total_amount
from customer3 c inner join order3 o on c.id = o.customer_id;

-- Left Join (all customers, no matter with orders or not)
-- all data in customer3 retains in the result set.
select c.first_name, c.last_name, o.delivery_address, ifnull(o.total_amount,0)
from customer3 c left join order3 o on c.id = o.customer_id;

-- Left Join (Customers without orders)
-- similar to "NOT EXISTS"
select c.first_name, c.last_name, o.delivery_address, ifnull(o.total_amount,0)
from customer3 c left join order3 o on c.id = o.customer_id
where o.customer_id is null
;
-- Union /Union All

select 'hello' as ab from dual
union 
select 'goodbye' as abc from dual;

-- Apprend the wlhole result
select 'hello' as ab from dual  -- 合拚
union  all
select 'hello' as abc from dual;

-- apend the result , removing dupliacted
select 'hello' as ab from dual
union 
select 'hello' as abc from dual;

drop table student2;
drop table teacher2;
drop table subject2;
drop table student_subject;

create table student2(
id integer primary key auto_increment,
first_name varchar(20),
last_name varchar(20)
);

create table subject2(
id integer primary key auto_increment,
description varchar(20)
);

create table student_subject2(
id integer primary key auto_increment,
subject_id integer not null,
student_id integer
);

create table teacher2 (
	id integer primary key auto_increment,
    first_name varchar(20),
    last_name varchar(20)
);

create table student_subject (
id integer primary key auto_increment,
student_id integer,
subject_id integer,
foreign key (student_id)  references student2(id),
foreign key (subject_id)  references subject2(id)
);

insert into student2 values (1, 'Vincent', 'Lau');
insert into student2 values (2, 'ABC', 'Chan');

insert into subject2 values (1, 'Maths');
insert into subject2 values (2, 'English');

insert into student_subject values (1, 1, 2);

insert into teacher2 values (1, 'XYZ', 'Lau');
insert into teacher2 values (2, 'ABC', 'Chan');
insert into teacher2 values (3, 'IJK', 'Lo');

select first_name, last_name  -- CHECK名
from student2
union all
select last_name, first_name
from teacher2;

create view student_view -- 可以控制唔比人睇
as
select * from student2 where last_name in ('Lau','Chan');

select * from student_view;

insert into student2 values (3, 'sally' , 'f');