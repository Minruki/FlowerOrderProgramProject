select * from membership_discount;  	  
select * from customer_information;
select * from flower_information;
select * from order_program;
-- view 생성
create view vm_flower as
select ono, order_number, order_date, op.id as id, order_count, choice,
 sale_price, member_name, phone_number, cumulative_amount, ci.membership_title as membership, discount_rate, fi.flower_code as flower_code, flower_name, flower_price
  from order_program op 
  	join customer_information ci on op.id= ci.id
  	join membership_discount md on ci.membership_title = md.membership_title 
  	join flower_information fi on op.flower_code = fi.flower_code;

select * from vm_flower vf ;
--
select id, member_name, phone_number from customer_information cus where id = 'lee.daeung';
select membership_title, discount_rate from membership_discount where membership_title = "꽃";
select flower_code, flower_name, flower_price flower_information from flower_information where flower_code = 'A011';
select membership_title, discount_rate from membership_discount;

-- INSERT
insert into flower_information values('A011', '국화', 9000);
insert into membership_discount values('씨앗', '2%');
-- update test
update flower_information set flower_price = 10000 where flower_code = 'A011';
update membership_discount set membership_title = '씨앗' where discount_rate = '3%';
-- insert test
select * from flower_information;

DELETE FROM flower_information
where flower_code ='A011';
-- 
select * from order_program;

DELETE FROM order_program 
where ono = 8;

delete from membership_discount where membership_title = '씨앗';
delete from order_program where id = 'min';
select * from membership_discount;

delete from membership_discount 
where discount_rate = '5%' ;

delete from membership_discount where membership_title = '씨앗';

select ono, order_number, order_date, op.id as id, order_count, choice,
 sale_price, member_name, phone_number, cumulative_amount, ci.membership_title as membership, discount_rate, fi.flower_code as flower_code, flower_name, flower_price
  from order_program op 
  	join customer_information ci on op.id= ci.id
  	join membership_discount md on ci.membership_title = md.membership_title 
  	join flower_information fi on op.flower_code = fi.flower_code ;

 delete from order_program where ono = 1; 
  
desc order_program;
select * from order_program;

insert into order_program values('A011', '국화', 9000);

select * from customer_information;
select * from flower_information;