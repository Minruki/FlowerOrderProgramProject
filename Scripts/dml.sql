 insert 
   into membership_discount
 values ('소나무', '30%'),
 		('꽃', '20%'),
 		('꽃봉오리', '10%'),
 		('새싹', '5%');
 	
insert
  into customer_information
values ('lys6009', '이용수', '010-1234-5678', 1000000, '소나무'),
       ('yjw6101', '염정원', '010-4321-5678', 750000 ,'꽃' ),
       ('Minruki', '이민정', '010-4321-8765', 115000, '꽃봉오리'),
   	   ('lee.daeung', '이대응', '010-5678-1234',10000, '새싹');
 
 	
insert 
  into flower_information 
values ('A001','장미', 9000),
	   ('A002','라넌큘러스',10000),
	   ('A003','백합',7000),
	   ('A004','튤립',5000),
	   ('A005','해바라기', 6000),
	   ('A006','피오니',10000),
	   ('A007','프리지아', 13000),
	   ('A008','카네이션',8000),
	   ('A009','안개꽃', 15000);
	  

insert
  into order_program 
values (default, '0001', now(),'minruki', 'A002', 1, '꽃바구니', 0);
	
insert
  into order_program 
values (default, '0002', now() ,'lys6009', 'A001', 1, '꽃다발', 0);

insert
  into order_program 
values (default, '0002', now() ,'lys6009', 'A001', 1, '꽃다발', null);


select * from membership_discount;  	  
select * from customer_information;
select * from flower_information;
select * from order_program;