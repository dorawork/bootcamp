
create table department(
	id serial primary key, -- serial = into + auto_increment
	department_name varchar(50)
);

f

create table emplyee (
	id serial primary key,
	emplyee_name varchar(50),
	department_id int references department(id) -- foreign key
	);


SELECT * FROM emplyee;
-- delete form
insert into insert into department values (1, 'IT') values (1, 'IT')
	
insert into department (department_name) values ('HK');
insert into department (department_name) values ('Sales');
insert into department (department_name) values ('IT');
insert into department (department_name) values ('mr');

SELECT * FROM department;

insert into emplyee (emplyee_name, department_id) values ('Vincent', 2);
insert into emplyee (emplyee_name, department_id) values ('Sally', 3);
insert into emplyee (emplyee_name, department_id) values ('Cherry', 4);
insert into emplyee (emplyee_name, department_id) values ('Jenny', 3);

SELECT * FROM emplyee;

select * from department d left join emplyee e on d.id = e.department_id;

select * from department d full outer join emplyee e on d.id = e.department_id;

--similar to not exists
select *
	from department d full outer join emplyee e on d.id = e.department_id;

-- 未寫哂