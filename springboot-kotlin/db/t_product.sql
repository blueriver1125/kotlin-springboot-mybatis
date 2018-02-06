
CREATE TABLE t_product (
id INT ( 10 ) UNSIGNED NOT NULL PRIMARY KEY AUTO_INCREMENT COMMENT "自增ID",
CODE VARCHAR ( 50 ) UNIQUE NOT NULL COMMENT "产品编码",
NAME VARCHAR ( 100 ) COMMENT "产品名称",
create_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP COMMENT "创建时间",
update_time TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT "修改时间"
) ENGINE = INNODB AUTO_INCREMENT = 10000 DEFAULT CHARSET = utf8 COMMENT '产品信息表';


insert into t_product (code, name) VALUES("p1","笔记本电脑");
insert into t_product (code, name) VALUES("p2","显示器");
insert into t_product (code, name) VALUES("p3","杯子");
insert into t_product (code, name) VALUES("p4","台历");
insert into t_product (code, name) VALUES("p5","笔");
insert into t_product (code, name) VALUES("p6","花盆");
insert into t_product (code, name) VALUES("p7","眼镜");
insert into t_product (code, name) VALUES("p8","手机");
insert into t_product (code, name) VALUES("p9","U盘");
insert into t_product (code, name) VALUES("p10","插线板");
insert into t_product (code, name) VALUES("p11","啦啦啦");
insert into t_product (code, name) VALUES("p12","不知道啥");