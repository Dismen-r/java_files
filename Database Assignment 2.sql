create table salesman(salesman_id int primary key,name varchar(20),city varchar(20),commission float);
insert into salesman VALUES(5001,'James Hoog','New York',0.15);
insert into salesman VALUES(5002,'Nail Knite','Paris',0.13);
insert into salesman VALUES(5005,'Pit Alex','London',0.11);
insert into salesman VALUES(5006,'Mc Lyon','Paris',0.14);
insert into salesman VALUES(5007,'Paul Adam','Rome',0.13);
insert into salesman VALUES(5003,'Lauson Hen','San Jose',0.12);

create TABLE customer(customer_id int primary key,cust_name varchar(20),city varchar(20),grade int,salesman_id int);
insert into customer values(3002 ,'Nick Rimando' , 'New York' , 100 , 5001);
insert into customer values(3007 , 'Brad Davis' , 'New York' , 200 , 5001);
insert into customer values(3005 , 'Graham Zusi' , 'California' , 200 , 5002);
insert into customer values(3008 , 'Julian Green' , 'London' , 300 , 5002);
insert into customer values(3004 , 'Fabian Johnson' , 'Paris' , 300 , 5006);
insert into customer values(3009 , 'Geoff Cameron' , 'Berlin' , 100 , 5003);
insert into customer values(3003 , 'Jozy Altidor' , 'Moscow' , 200 , 5007);
insert into customer values(3001 , 'Brad Guzan' , 'London' , 0 , 5005);

CREATE TABLE orders(ord_no int primary key,purch_amt float,ord_date varchar(20),customer_id int,salesman_id int);
insert into orders values(70001, 150.5 ,'2012-10-05', 3005 ,5002);
insert into orders values(70009, 270.65 ,'2012-09-10', 3001, 5005);
insert into orders values(70002, 65.26 ,'2012-10-05', 3002 ,5001);
insert into orders values(70004, 110.5 ,'2012-08-17', 3009, 5003);
insert into orders values(70007 ,948.5 ,'2012-09-10', 3005, 5002);
insert into orders values(70005 ,2400.6, '2012-07-27', 3007, 5001);
insert into orders values(70008 ,5760 ,'2012-09-10', 3002, 5001);
insert into orders values(70010 ,1983.43 ,'2012-10-10', 3004, 5006);
insert into orders values(70003 ,2480.4 ,'2012-10-10', 3009 ,5003);
insert into orders values(70012 ,250.45 ,'2012-06-27', 3008, 5002);
insert into orders values(70011 ,75.29 ,'2012-08-17', 3003 ,5007);
insert into orders values(70013 ,3045.6, '2012-04-25', 3002, 5001);

--1)From the following tables, write a SQL query to find the salespersons and customers who live in same city. 
--Return customer name, salesperson name and salesperson city.
SELECT customer.cust_name,salesman.name,salesman.city FROM salesman,customer 
WHERE salesman.city=customer.city;


--From the following tables write a SQL query to find those orders where order amount exists between 500 and 2000. 
--Return ord_no, purch_amt, cust_name, city
select orders.ord_no,orders.purch_amt,customer.cust_name,customer.city from orders,customer
where customer.customer_id=orders.customer_id and orders.purch_amt between 500 and 2000;


--2)From the following tables write a SQL query to find the salesperson(s) and the customer(s) he handle. 
--Return Customer Name, city, Salesman, commission.
SELECT customer.cust_name,customer.city,salesman.name,salesman.commission from customer,salesman
WHERE customer.salesman_id=salesman.salesman_id


--From the following tables write a SQL query to find those salespersons who received a commission from the company more than 12%.
--Return Customer Name, customer city, Salesman, commission.
SELECT customer.cust_name,customer.city,salesman.name,salesman.commission from customer,salesman
WHERE customer.salesman_id=salesman.salesman_id AND salesman.commission>0.12;


--From the following tables write a SQL query to find those salespersons do not live in the same city where their customers live and received a commission from the company more than 12%. 
--Return Customer Name, customer city, Salesman, salesman city, commission.
SELECT customer.cust_name,customer.city,salesman.name,salesman.commission from customer,salesman
WHERE customer.salesman_id=salesman.salesman_id AND salesman.commission>0.12 and customer.city != salesman.city;


--From the following tables write a SQL query to find the details of an order. 
--Return ord_no, ord_date, purch_amt, Customer Name, grade, Salesman, commission
SELECT orders.ord_no,orders.purch_amt,customer.cust_name,customer.grade,salesman.name,salesman.commission
FROM orders,customer,salesman
where orders.customer_id=customer.customer_id and orders.salesman_id=salesman.salesman_id;




































