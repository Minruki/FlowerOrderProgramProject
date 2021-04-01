create user 'user_native_jdbc'@'localhost' identified by '1234567';

grant all
   on user_native_jdbc.*
   to 'user_native_jdbc'@'localhost'
      identified by 'rootroot';
      
     select * from title;
     DELETE FROM title where tno = 7;