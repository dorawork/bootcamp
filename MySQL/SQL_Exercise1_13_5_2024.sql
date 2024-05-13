use bootcamp_database_exercise1;
-- ans 1,2
create table regions(
region_id integer primary key auto_increment,
region_name varchar(25)
);

create table countries(
country_id varchar (2) primary key,
country_name varchar (40),
region_id integer,
constraint FK_region_id foreign key (region_id) references regions(region_id)
);

create table locations(
location_id integer primary key auto_increment,
street_address varchar(25),
postal_code varchar(12),
city varchar(30),
state_province varchar(12),
country_id varchar(2),
constraint FK_country_id foreign key (country_id) references countries(country_id) 
);

create table departments(
department_id integer primary key auto_increment,
department_name varchar(30),
manager_id integer,
location_id integer,
constraint FK_location_id foreign key (location_id) references locations(location_id)
);

create table jobs(
job_id varchar(10) primary key,
job_title varchar(35),
min_salary integer,
max_salary integer
);

create table job_history(
employee_id integer primary key auto_increment,
start_date date,
end_date date,
job_id varchar(10),
department_id integer,
constraint FK_job_id foreign key (job_id) references jobs(job_id),
constraint FK_department_id foreign key (department_id) references departments(department_id)
);

create table employees(
employee_id integer,
first_name varchar(20),
last_name varchar(25),
email varchar(25),
phone_number varchar(20),
hire_date date,
job_id varchar(10),
salary integer,
commission_pct integer,
manager_id integer,
department_id integer,
constraint M_employee_id foreign key (employee_id) references job_history(employee_id),
constraint M_job_id foreign key (job_id) references jobs(job_id),
constraint M_department_id foreign key (department_id) references departments(department_id)
);

-- REGIONS
INSERT INTO REGIONS (REGION_ID, REGION_NAME) VALUES
(1, 'North America'),
(2, 'Europe'),
(3, 'Asia');

-- COUNTRIES
INSERT INTO COUNTRIES (COUNTRY_ID, COUNTRY_NAME, REGION_ID) VALUES
(1, 'United States', 1),
(2, 'United Kingdom', 2),
(3, 'Japan', 3);

-- LOCATIONS
INSERT INTO LOCATIONS (LOCATION_ID, STREET_ADDRESS, POSTAL_CODE, CITY, STATE_PROVINCE, COUNTRY_ID) VALUES
(1001, '123 Main St', '12345', 'New York', 'NY', 1),
(1002, '456 Elm St', '67890', 'London', NULL, 2),
(1003, '789 Oak St', '98765', 'Tokyo', NULL, 3);

-- DEPARTMENTS
INSERT INTO DEPARTMENTS (DEPARTMENT_ID, DEPARTMENT_NAME, MANAGER_ID, LOCATION_ID) VALUES
(10, 'Sales', 101, 1001),
(20, 'HR', 102, 1002),
(30, 'IT', 103, 1003);

-- JOBS
INSERT INTO JOBS (JOB_ID, JOB_TITLE, MIN_SALARY, MAX_SALARY) VALUES
('SALESMAN', 'Salesman', 30000, 60000),
('HR_REP', 'HR Representative', 35000, 70000),
('IT_PROG', 'IT Programmer', 40000, 80000);

-- EMPLOYEES
INSERT INTO EMPLOYEES (EMPLOYEE_ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE_NUMBER, HIRE_DATE, JOB_ID, SALARY, COMMISSION_PCT, MANAGER_ID, DEPARTMENT_ID) VALUES
(101, 'John', 'Doe', 'john@example.com', '123-456-7890', '2023-01-15', 'SALESMAN', 50000, 0.05, 103, 10),
(102, 'Jane', 'Smith', 'jane@example.com', '987-654-3210', '2023-02-20', 'HR_REP', 55000, 0.07, 103, 20),
(103, 'Michael', 'Johnson', 'michael@example.com', '555-123-4567', '2023-03-25', 'IT_PROG', 60000, 0.06, 103,30);

-- JOB_HISTORY
INSERT INTO JOB_HISTORY (START_DATE, END_DATE, JOB_ID, DEPARTMENT_ID, EMPLOYEE_ID) VALUES
('2023-01-15', '2023-05-15', 'SALESMAN', 10, 101),
('2023-02-20', '2023-06-20', 'HR_RP', 20, 102),
('2023-03-25', NULL, 'IT_PROG', 30, 103);


select * from departments;

-- 3
select l.street_address, l.city, l.state_province, c.country_name 
from locations l left join countries c on l.country_id = c.country_id;

-- 4
select first_name, last_name, job_id, department_id from employees;

-- 5  如何找country Japen?
select e.first_name, e.last_name,e.job_id,e.department_id
from employees e left join departments d on e.department_id = d.department_id
			     left join locations l on d.location_id = l.location_id
				 left join countries c on l.country_id = c.country_id
                 where c.country_name = 'Japen';
                     
-- 6 
select employee_id, last_name, manager_id from employees;


-- 7 方法錯??
select  e.first_name, e.last_name
from employees e
join employees d on e.employee_id = d.employee_id 
where e.hire_date >'1987-06-19';

-- 8 
select d.department_name, count(e.department_id) as number_of_employees
from departments d left join employees e on d.department_id = e.department_id
group by d.department_name;

-- 9
select e.employee_id, j.job_title, jh.start_date, jh.end_date
from employees e left join jobs j on e.job_id = j.job_id
                 left join job_history jh on e.employee_id = jh.employee_id
                 where e.department_id = '30' 
                 or jh.end_date >(select min(end_date) from job_history)
                 and jh.start_date < (select max(start_date) from job_history)
                 group by e.employee_id, j.job_title, jh.start_date, jh.end_date;
                 

-- 10  counties_name 未搵到
with country_name as(
	select c.country_name
    from locations l 
                   inner join countries c on l.country_id = c.country_id
                   group by c.country_name
)
select d.department_name, concat(e.first_name,e.last_name) as manager_name, l.city
from departments d  
                   left join employees e on d.manager_id = e.manager_id
                   left join locations l on d.LOCATION_ID = l.LOCATION_ID
				   group by d.department_name, concat(e.first_name,e.last_name), l.city;
                   
-- 11 average salary each department
select d.department_id, d.department_name, avg(j.max_salary)
from employees e
				inner join jobs j on e.job_id = j.job_id
                left  join departments d on e.department_id = d.department_id
				group by d.department_id;

-- 12
select j.job_id, j.job_title, j.min_salary, j.max_salary
from jobs j
union all
select jg.grade_level, jg.lowest_sal, jg.highest_sal 
from job_grades jg
                   
                   



                     
