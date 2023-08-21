REM   Script: Session 03
REM   Tobein Git

create table salesman;

create table salesman from salesman_id int, salesman_name varchar2(20),salesman_city varchar2(20),comission int;

create table salesman (salesman_id int, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


create table salesman (salesman_id int primary, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


create table salesman (salesman_id int primary, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

update table salesman (salesman_id int primary, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


insert into salesman values ( 5001 , 'James Hoong', 'New york' , 15 );

insert into salesman values ( 5002 , 'Niel Knight', 'Paris' , 39 );

insert into salesman values ( 5005 , 'Pit Alex', 'London' , 11 );

insert into salesman values ( 5006 , 'Mc Lincon', 'Paris' , 14 );

insert into salesman values ( 5007 , 'Paul Adam', 'Rome' , 13 );

insert into salesman values ( 5003 , 'Lauson Hen', 'Son jose' , 12 );

describe salesman


select * from salesman;

select * from salesman Asc;

create table salesman (salesman_id int, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


insert into salesman values ( 5001 , 'James Hoong', 'New york' , 15 );

insert into salesman values ( 5002 , 'Niel Knight', 'Paris' , 39 );

insert into salesman values ( 5005 , 'Pit Alex', 'London' , 11 );

insert into salesman values ( 5006 , 'Mc Lincon', 'Paris' , 14 );

insert into salesman values ( 5007 , 'Paul Adam', 'Rome' , 13 );

insert into salesman values ( 5003 , 'Lauson Hen', 'Son jose' , 12 );

select * from salesman by Asc;

select * from salesman by Asc;

select * from salesman;

create table salesman (salesman_id int, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


insert into salesman values ( 5001 , 'James Hoong', 'New york' , 15 );

insert into salesman values ( 5002 , 'Niel Knight', 'Paris' , 39 );

insert into salesman values ( 5005 , 'Pit Alex', 'London' , 11 );

insert into salesman values ( 5006 , 'Mc Lincon', 'Paris' , 14 );

insert into salesman values ( 5007 , 'Paul Adam', 'Rome' , 13 );

insert into salesman values ( 5003 , 'Lauson Hen', 'Son jose' , 12 );

select * from salesman;

select 1 from dual;

insert into salesman values ( 5001 , 'James Hoong', 'New york' , 15 );

insert into salesman values ( 5002 , 'Niel Knight', 'Paris' , 39 );

insert into salesman values ( 5005 , 'Pit Alex', 'London' , 11 );

insert into salesman values ( 5006 , 'Mc Lincon', 'Paris' , 14 );

insert into salesman values ( 5007 , 'Paul Adam', 'Rome' , 13 );

insert into salesman values ( 5003 , 'Lauson Hen', 'Son jose' , 12 );

select 1 from dual;

Select salesman_id and salesman_city from salesman;

select salesman_id , salesman_city from salesman;

select salesman_city where salesman_city is Paris from salesman;

select salesman_city is 'Paris' from salesman;

select * from salesman where salesman_city is 'Paris' ;

select * from salesman where salesman_city = 'Paris' ;

select salesman_id, commision where salesman_name = 'Paul Adam';

select salesman_id, commision from salesman where salesman_name = 'Paul Adam';

select salesman_id, commision from salesman where salesman_name = 'Paul Adam';

select salesman_id, comission from salesman where salesman_name = 'Paul Adam';

alter table salesman (salesman_id int, salesman_name varchar2(32),salesman_city varchar2(32),comission int);

alter table salesman (salesman_id int, salesman_name varchar2(32),salesman_city varchar(32),comission int);

alter table salesman salesman_name varchar2(32);

alter table salesman salesmann_name varchar2(32);

alter table salesman salesman_name column varchar2(32);

create table salesman (salesman_id int, salesman_name varchar2(20),salesman_city varchar2(20),comission int);

describe salesman


insert into salesman values ( 5001 , 'James Hoong', 'New york' , 15 );

insert into salesman values ( 5002 , 'Niel Knight', 'Paris' , 39 );

insert into salesman values ( 5005 , 'Pit Alex', 'London' , 11 );

insert into salesman values ( 5006 , 'Mc Lincon', 'Paris' , 14 );

insert into salesman values ( 5007 , 'Paul Adam', 'Rome' , 13 );

insert into salesman values ( 5003 , 'Lauson Hen', 'Son jose' , 12 );

select 1 from dual;

select * from salesman;

select salesman_id , salesman_city from salesman;

select * from salesman where salesman_city = 'Paris' ;

select salesman_id, comission from salesman where salesman_name = 'Paul Adam';

alter table salesman salesman_name column varchar2(32);

describe salesman


alter table salesman add column grade int;

alter table salesman add grade int;

describe salesman


update salesman grade = 100 where grade = null;

update salesman SET grade = 100 where grade = null;

update salesman SET grade = 100;

select * from salesman;

update salesman SET grade = 200 where salesman_city = "Rome";

update salesman SET grade = 200 where salesman_city = 'Rome';

select * from salesman where salesman_city = 'Rome';

update salesman SET grade = 300 where salesman_name = 'James Hoong';

update salesman SET salemsman_name = 'Pierre' where salesman_name = 'mc Lincon';

update salesman SET salesman_name = 'Pierre' where salesman_name = 'mc Lincon';

update salesman SET salesman_name = 'Pierre' where salesman_name = 'Mc Lincon';

select * from salesman;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no , order_date from order by Asc;

select order_no , order_date from order;

select order_no , order_date from orders;

select order_no , order_date from orders by Asc;

select order_no , order_date from orders order by order_date;

select order_no , order_date from orders order by order_date desc;

select order_no , order_date from orders order by order_date Asc;

select order_no , purchase_amount from orders order by purchase_amount desc;

select * from orders where purhcase_amount < 500;

select * from orders where purchase_amount < 500;

select * from orders where purchase_amount < 500 order by desc;

select * from orders where purchase_amount < 500 order by purchase_amount desc;

select * from orders where purchase_amount between (1000,2000);

select * from orders where purchase_amount between 1000 and 2000;

select purchase_amount from orders sum(purchase_amount);

select SUM(purchase_amount) as 'total sum' from orders;

create table orders( 
    order_no int primary key, purchase_amount float, order_date date, 
    customer_id int, salesman_id int);

INSERT ALL 
    INTO orders VALUES(70001, 150.5, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3005, 5002)  
    INTO orders VALUES(70009, 270.65, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3001, 5005) 
    INTO orders VALUES(70002, 65.26, TO_DATE('2012/10/05', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70004, 110.5, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70007, 948.5, TO_DATE('2012/09/10', 'YYYY/MM/DD'), 3005, 5002) 
    INTO orders VALUES(70005, 2400.6, TO_DATE('2012/07/27', 'YYYY/MM/DD'), 3007, 5001) 
    INTO orders VALUES(70008, 5760, TO_DATE('2012/08/15', 'YYYY/MM/DD'), 3002, 5001) 
    INTO orders VALUES(70010, 1983.43, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3004, 5006) 
    INTO orders VALUES(70003, 2480.4, TO_DATE('2012/10/10', 'YYYY/MM/DD'), 3009, 5003) 
    INTO orders VALUES(70012, 250.45, TO_DATE('2012/06/27', 'YYYY/MM/DD'), 3008, 5002) 
    INTO orders VALUES(70011, 75.29, TO_DATE('2012/08/17', 'YYYY/MM/DD'), 3003, 5007) 
    INTO orders VALUES(70013, 3045.6, TO_DATE('2012/04/25', 'YYYY/MM/DD'), 3002, 5001) 
SELECT 1 FROM DUAL;

select distinct salesman_id from orders;

select order_no , order_date from orders order by order_date Asc;

select order_no , purchase_amount from orders order by purchase_amount desc;

select * from orders where purchase_amount < 500 order by purchase_amount desc;

select * from orders where purchase_amount between 1000 and 2000;

// Activity 7 


select SUM(purchase_amount) as "total sum" from orders;

select SUM(purchase_amount) as "total sum" from orders;

select AVG(purchase_amount) as "Average value" from orders;

select Max(purchase_amount) as " Max value of order" from orders;

select Min(purchase_amount) as " Min value of order" from orders;

select number(purchase_amount) as "number of orders" from orders;

select COUNT(purchase_amount) as "number of orders" from orders;

select COUNT(distint salesman_id) as "Total count" from orders;

select count(distint salesman_id) as "Total count" from orders;

select count(DISTINCT salesman_id) as "Total count" from orders;

