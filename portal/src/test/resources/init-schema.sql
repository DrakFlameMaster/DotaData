drop TABLE  if exists  tdb_user;

CREATE Table tdb_user
(
  pkid					int(20) not null auto_increment,
  name         VARCHAR(64) not NULL comment "姓名",
  nick_name 		VARCHAR(64) comment "昵称",
  sex  					char(1)  comment "性别",
  phone 				VARCHAR(32) comment "手机",
  email_address VARCHAR(32) comment "邮箱",
  state 				VARCHAR(8) not null comment "状态： 0注销 1有效",
  version  			int(11)   not null comment "version",
  remark   			VARCHAR(256)  comment "备注",
  create_time   datetime not null comment "创建时间",
  creator 			VARCHAR(128) not null comment "创建人",
  modify_time 	datetime not null comment "修改时间",
  operator 			VARCHAR(128) not null comment "操作人",
  sys_state  		char(1)  not null comment  "数据状态：0无效 1：有效",
  PRIMARY key  (pkid)
);

drop TABLE  if exists  tdb_login;

CREATE Table tdb_login
(
  pkid					int(20) not null auto_increment,
  login_name    VARCHAR(64) not nULL comment "登陆名",
  password 		  VARCHAR(128) not null comment "密码",
  user_id				int(20) not null comment "用户表主键",
  type 				  VARCHAR(32) not null comment "登陆账号类型 0:手机 1:邮箱 2：昵称",
  salt          VARCHAR(32) not null comment "盐",
  state 				VARCHAR(8) not null comment "状态： 0注销 1有效",
  version  			int(11)   not null comment "version",
  remark   			VARCHAR(256)  comment "备注",
  create_time   datetime not null comment "创建时间",
  creator 			VARCHAR(128) not null comment "创建人",
  modify_time 	datetime not null comment "修改时间",
  operator 			VARCHAR(128) not null comment "操作人",
  sys_state  		char(1)  not null comment  "数据状态：0无效 1：有效",
  PRIMARY key  (pkid)
);