-- New Product table
create table Product(
id integer
);

select * from product;
alter table product add name varchar(255);
alter table product add price decimal(10,2);
alter table product add description text;
alter table product add create_at date;

alter table product drop column created_at;
delete from product where id = 1;
insert into product values(1, 'Laptop','999.99', 'High-performance laptop with SSD storage.', CURRENT_TIMESTAMP);
insert into product values(2, 'Smartphone', '559.50',  '4G smartphone with advanced camera features.',  CURRENT_TIMESTAMP);
insert into product values(3, 'Headphones', '79.99',  'Wireless headphones with noise-canceling technology.',  CURRENT_TIMESTAMP);

-- Tip: max()
select * from product where name is not null order by name; -- name in ascending order
select * from product where price = (select max(price) from product); -- highest price

-- Tip: count()
select count(*) as product_count from product; --  the count of products

-- Tips: lower()
select * from product where name like 'laptop'; -- contains the word "laptop"

-- tips: avg()
select avg(price) as price from product; --  average price

-- tips: limit
select * from product order by create_at asc limit 1; -- earliest created

-- tips: sum()
select sum(price) as Total_price from product; -- the sum of prices for all products

-- tips: min()
select min(price) as 'Max_Price_for_Phones' from product where lower(name) like '%phone%'; -- the lowest price among products

-- tips: lower() and like
select *, description as 'Poduct Description' from product where lower(description) like '%wireless%';

-- New table "Sales"

create table Sales(
id integer,
product_id integer,
product_name varchar(255),
unit_price decimal(10,2),
quantity_sold integer,
discount_amount decimal(10,2),
tax_rate decimal(5,2),
shipping_cost decimal(10,2),
hanlding_fee decimal(10,2)
);

select* from Sales;
insert into sales values(1, 1, 'Laptop', 999.99, 2, 0, 5, 10.50, 5.25);
insert into sales values(2, 2, 'Smartphone', 599.50, 5, 0, 5, 10.50, 5.25);
insert into sales values(3, 3, 'Headphones', 79.99, 10, 5, 5, 2.99, 1.50);

select concat('$', unit_price) from Sales; 
select concat(tax_rate, '%') from Sales;






