create database weddingplanner
use weddingplanner
drop database weddingplanner
create database wedding
use wedding
drop table wedding
create table wedding(
     customer_id int not null,
     customer_name varchar(100) not null,
     customer_surname varchar(100) not null,
     customer_phonenumber int not null,
     customer_address varchar(100) not null,
     customer_email varchar(100) not null
     );
describe wedding;
alter table wedding
add customer_age int not null
after customer_surname,
add customer_gender varchar(10) not null
after customer_address;
alter table wedding
drop column customer_email;
alter table wedding change column customer_phonenumber customer_number int not null;
alter table wedding modify customer_surname varchar(100) null;
alter table wedding rename to planner;
alter table wedding modify customer_number bigint not null;
insert into wedding values(1,'Rani','Kariyam',9441573001,'Tirupati','rani@gmail.com');
insert into wedding values(2,'bharath','kn',9000554148,'nagari','bharath@gmail.com',);
insert into wedding values(3,'bhavya','narayanaswamy',7207114500,'bangalore','bhavya8@gmail.com,');
insert into wedding values(4,'raju','kk',8019403508,'vijayawada','raju20@gmail.com');
insert into wedding values(5,'mounika','putlur',9987627134,'dhermavaram','mounikaputlur@gmail.com');
alter table wedding add  customer_age int;
insert into wedding values(11,'bhavi','kn',8976567896,'chittoor','bhavi@gmail.com',21);
select * from wedding;
truncate table wedding;
create table event(
event_id int ,
event_name varchar(100) not null,
event_date int not null,
event_place varchar(100) not null,
event_address varchar(100) not null);
insert into event values(6,'sangeeth','1998-04-14','tirupati','4-6,s v koil street');
insert into event values(7,'marriage','1997-08-06','nagari','3-7,main road,nagari');
insert into event values(8,'engagement','1996-03-15','puttur','0-6,balaji road,puttur');
insert into event values(9,'marriage','1995-06-18','chennai','1-4,msv nagar,chennai');
insert into event values(10,'engagement','1994-12-16','tirutani','14-37,reddy colony,tirutani');
select * from event;
alter table event modify event_date bigint not null;
alter table event modify event_date date not null;
select * from event where event_place='tirupati' and event_id=6;
truncate table event;
desc event;
alter table event change column event_date eve_date date not null;
set sql_safe_updates=0;
update event set event_name='engagement' where event_id=6;
select * from event where (event_name='engagement' and event_place='puttur')or (event_id<8);
select distinct event_name,event_id from event;
select * from event  where event_name='marriage' order by event_id desc;
select event_place,
event_name
from event where event_id<9 
order by 
event_place desc,event_name asc;
select event_address, count(*)
from event
group by event_address;
select event_name from event where event_name like  '%e';
select event_place from event where event_place like 'p_tt_r';
select event_name from event where event_name not like '%e';
select * from event where event_place not in('chennai','tirupati');
select * from event where event_id between 6 and 8;
select * from event where event_date between cast('2020-04-14' as date) and cast('2020-06-18' as date);

