  create database if not exists native_jdbc;
  
 -- 계정 권한 부여	
grant all 
   on native_jdbc.* 
   to 'user_native_jdbc'@'localhost'
  	identified by 'rootroot';

grant File
   on *.*
   to 'user_native_jdbc'@localhost;
   
  
