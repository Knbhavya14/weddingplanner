use wedding;
create table employee(
emp_id int not null primary key,
emp_name varchar(100) not null,
emp_salary bigint not null,
emp_designation varchar(100) not null,
emp_doj date not null,
emp_dob date not null,
emp_age int not null,
department_id int,
foreign key(department_id) references department(department_id));
desc employee;
create table department(
department_id int not null primary key,
department_name varchar(100) not null
);
desc department;
create table project(
project_id int not null primary key,
project_name varchar(100)
);
desc project;
alter table employee drop emp_age;
alter table project modify project_id varchar(100) not null;
alter table department modify department_id varchar(100) not null;
insert into project values('p1','Retail');
insert into project values('p2','Insurance');
insert into project values('p3','Resources');
insert into project values('p4','Banking');
select * from project;
insert into department values(1001,'LKM');
insert into department values(1002,'JAVACAP');
insert into department values(1003,'.NETCAP');
select * from department;
alter table employee add column department_name varchar(100) not null;
insert into employee values(7001,'Cynthya',80000.00,'CEO','1997-Feb-14','1975-May-12',1001,null);
insert into employee values(7002,'Mario',50000.00,'MD','1998-Apr-16','1976-Feb-14',1001,'JAVACAP');
insert into employee values(7003,'Jacob',40000.00,'MD','1998-May-16','1976-Feb-14',1001,'.NETCAP');
insert into employee values(7004,'Lucy',42000.00,'MD','2000-Jul-15','1976-Feb-14',1001,'LKM');
insert into employee values(7005,'Amy',24000.00,'SM','2000-Nov-16','1976-Feb-14',1002,'JAVACAP');
insert into employee values(7006,'Frank',22000.00,'SM','2000-Sept-19','1976-Feb-14',1003,'.NETCAP');
insert into employee values(7007,'Phil',22000.00,'SM','2000-Nov-12','1976-Feb-14',1004,'LKM');
insert into employee values(7008,'Arnold',80000.00,'TL','1998-Apr-16','1976-Feb-14',1005,'JAVACAP');
insert into employee values(7009,'Jack',88000.00,'TL','1998-Apr-16','1976-Feb-14',1006,'.NETCAP');
insert into employee values(7010,'Justin',86000.00,'TL','1998-Apr-16','1976-Feb-14',1007,'LKM');
insert into employee values(7011,'Megan',87000.00,'TL','1998-Apr-16','1976-Feb-14',1007,'LKM');
insert into employee values(7012,'Stuart',35000.00,'SSE','1998-Apr-16','1976-Feb-14',1008,'JAVACAP');
insert into employee values(7013,'Clarket',32000.00,'SSE','1998-Apr-16','1976-Feb-14',1008,'JAVACAP');
insert into employee values(7014,'Darwin',30000.00,'SE','1998-Apr-16','1976-Feb-14',1009,'.NETCAP');
insert into employee values(7015,'Chelsea',38000.00,'SSE','1998-Apr-16','1976-Feb-14',1010,'LKM');
insert into employee values(7016,'Dan',30000.00,'SE','1998-Apr-16','1976-Feb-14',1009,'.NETCAP');
insert into employee values(7017,'Jimmy',32000.00,'SE','1998-Apr-16','1976-Feb-14',1010,'LKM');
insert into employee values(7018,'James',35000.00,'SE','1998-Apr-16','1976-Feb-14',NULL,'.NETCAP');
insert into employee values(7019,'Joseph',30000.00,'SE','1998-Apr-16','1976-Feb-14',NULL,'.NETCAP');
