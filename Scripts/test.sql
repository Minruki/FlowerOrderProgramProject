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

select flower_code, flower_name, flower_price flower_information from flower_information where flower_code = 'A011';
-- INSERT
insert into flower_information values('A011', '국화', 9000);

-- update test
update flower_information set flower_price = 10000 where flower_code = 'A011';

-- insert test
select * from flower_information;

DELETE FROM flower_information
where flower_code ='A011';
-- 

select ono, order_number, order_date, op.id as id, order_count, choice,
 sale_price, member_name, phone_number, cumulative_amount, ci.membership_title as membership, discount_rate, fi.flower_code as flower_code, flower_name, flower_price
  from order_program op 
  	join customer_information ci on op.id= ci.id
  	join membership_discount md on ci.membership_title = md.membership_title 
  	join flower_information fi on op.flower_code = fi.flower_code ;
