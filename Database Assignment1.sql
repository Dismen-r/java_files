create table employee(empid int primary key,empname varchar(100), department varchar(50),contactno bigint, emaildid varchar(100), empheadid int);
insert into employee VALUES (101, 'Isha', 'E-101', 1234567890, 'isha@gmail.com', 105);
insert into employee VALUES (102, 'Priya', 'E-104', 1234567890, 'priya@yahoo.com', 103);
insert into employee VALUES (103, 'Neha', 'E-101', 1234567890, 'neha@gmail.com', 101);
insert into employee VALUES (104, 'Rahul', 'E-102', 1234567890, 'rahul@yahoo.com', 105);
insert into employee VALUES (105, 'Abhishek', 'E-101', 1234567890, 'abhishek@gmail.com', 102);


create table empdept(deptid varchar(50) primary key,deptname varchar(100), dept_off varchar(100), depthead int, foreign key(depthead) references employee(empid));
insert into empdept VALUES ('E-101', 'HR', 'Monday', 105);
insert into empdept VALUES ('E-102', 'Development', 'Tuesday', 101);
insert into empdept VALUES ('E-103', 'Hous Keeping', 'Saturday', 103);
insert into empdept VALUES ('E-104', 'Sales', 'Sunday', 104);
insert into empdept VALUES ('E-105', 'Purchage', 'Tuesday', 104);


create table empsalary(empid int ,foreign key(empid) references employee(empid), salary bigint, ispermanent varchar(3));
insert into empsalary VALUES (101, 2000, 'Yes');
insert into empsalary VALUES (102, 10000, 'Yes');
insert into empsalary VALUES (103, 5000, 'No');
insert into empsalary VALUES (104, 1900, 'Yes');
insert into empsalary VALUES (105, 2300, 'Yes');


create table project(projectid varchar(50) primary key, duration int);
insert into project VALUES ('p-1', 23);
insert into project VALUES ('p-2', 15);
insert into project VALUES ('p-3', 45);
insert into project VALUES ('p-4', 2);
insert into project VALUES ('p-5', 30);


create table country(cid varchar(50) primary key, cname varchar(100));
insert into country VALUES ('c-1', 'India');
insert into country VALUES ('c-2', 'USA');
insert into country VALUES ('c-3', 'China');
insert into country VALUES ('c-4', 'Pakistan');
insert into country VALUES ('c-5', 'Russia');


create table clienttable(clientid varchar(50) primary key, clientname varchar(100), cid varchar(50) references country(cid));
insert into clienttable VALUES ('cl-1', 'ABC Group', 'c-1');
insert into clienttable VALUES ('cl-2', 'PQR', 'c-1');
insert into clienttable VALUES ('cl-3', 'XYZ', 'c-2');
insert into clienttable VALUES ('cl-4', 'tech altum', 'c-3');
insert into clienttable VALUES ('cl-5', 'mnp', 'c-5');


create table empproject(empid int,foreign key(empid) references employee(empid), projectid varchar(50), foreign key(projectid) references project(projectid), clientid varchar(50), foreign key(clientid) references clienttable(clientid),startyear int, endyear int);
insert into empproject VALUES (101, 'p-1', 'cl-1', 2010, 2010);
insert into empproject VALUES (102, 'p-2', 'cl-2', 2010, 2012);
insert into empproject VALUES (103, 'p-1', 'cl-3', 2013, 0);
insert into empproject VALUES (104, 'p-4', 'cl-1', 2014, 2015);
insert into empproject VALUES (105, 'p-4', 'cl-5', 2015, 0);



--Select the detail of the employee whose name start with P.
select * from employee where empname like 'p%';

--How many permanent candidate take salary more than 5000.
select count(salary) as count from empsalary where ispermanent='yes' and salary>5000;

--Select the detail of employee whose emailId is in gmail.
select * from employee where emaildid like '%@gmail.com';

--Select the details of the employee who work either for department E-104 or E-102.
select * from employee where department='E-102' or department='E-104';

--What is the department name for DeptID E-102?
select deptname from empdept where deptid ='E-102';

-- What is total salarythat is paid to permanent employees?
select sum(salary) as salary from empsalary where ispermanent='yes';

--List name of all employees whose name ends with a.
select * from employee where empname like '%a';

-- List the number of department of employees in each project.
select count(empid) as employee, projectid from empproject group by projectid;
