DROP TABLE IF EXISTS `nova_user_info`;
CREATE TABLE `nova_user_info` (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `nick_name` varchar(50) DEFAULT NULL COMMENT '用户名',
  `login_name` varchar(50) DEFAULT NULL COMMENT '登录名',
  `password` varchar(255) DEFAULT NULL COMMENT '密码',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `usertype` int(1) NOT NULL DEFAULT '0' COMMENT '用户类型（0:普通用户，1:管理员）',
  `headimg` varchar(255) DEFAULT NULL COMMENT '头像url',
  `github_url` varchar(255) DEFAULT NULL COMMENT 'GitHub主页',
  `create_time` varchar(255) DEFAULT NULL COMMENT '注册时间',
  `github_id` varchar(255) DEFAULT NULL COMMENT 'github的login',
  `qqid` varchar(255) DEFAULT NULL COMMENT 'qq的openid',
  PRIMARY KEY (`id`),
  UNIQUE KEY `github_id_UNIQUE` (`github_id`),
  UNIQUE KEY `login_name_UNIQUE` (`login_name`),
  UNIQUE KEY `qqid_UNIQUE` (`qqid`)
) ENGINE=InnoDB AUTO_INCREMENT=32 DEFAULT CHARSET=utf8 COMMENT='用户信息表';


