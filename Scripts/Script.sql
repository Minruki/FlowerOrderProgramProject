-- 계정 권한 부여	
grant all 
   on flowerorderprogram.* 
   to 'user_flower'@'localhost'
identified by 'rootroot';

grant File
   on *.*
   to 'user_flower'@localhost;