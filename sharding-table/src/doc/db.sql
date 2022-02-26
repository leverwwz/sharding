CREATE TABLE t_user
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    name        varchar(64)        DEFAULT NULL COMMENT '名称',
    cert_no     varchar(255)        DEFAULT NULL COMMENT '身份证号码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    password    varchar(32)        DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE t_user0
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    name        varchar(64)        DEFAULT NULL COMMENT '名称',
    cert_no     varchar(255)        DEFAULT NULL COMMENT '身份证号码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    password    varchar(32)        DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE t_user1
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    name        varchar(64)        DEFAULT NULL COMMENT '名称',
    cert_no     varchar(255)        DEFAULT NULL COMMENT '身份证号码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    password    varchar(32)        DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--t_user not work for sharding, so that we change to tb_user0
CREATE TABLE tb_user0
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    name        varchar(64)        DEFAULT NULL COMMENT '名称',
    cert_no     varchar(255)        DEFAULT NULL COMMENT '身份证号码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    password    varchar(32)        DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
CREATE TABLE tb_user1
(
    id          bigint(20) NOT NULL AUTO_INCREMENT,
    name        varchar(64)        DEFAULT NULL COMMENT '名称',
    cert_no     varchar(255)        DEFAULT NULL COMMENT '身份证号码',
    create_time timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
    password    varchar(32)        DEFAULT NULL COMMENT '密码',
    PRIMARY KEY (id)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;