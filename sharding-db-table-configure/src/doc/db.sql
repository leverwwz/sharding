CREATE DATABASE IF NOT EXISTS `acold` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `acold`;SET NAMES utf8mb4; SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `one`;
CREATE TABLE `one`
(
    `id`         bigint(20) NOT NULL,
    `address`    varchar(255) DEFAULT NULL,
    `applyno`    varchar(255) DEFAULT NULL,
    `count`      varchar(255) DEFAULT NULL,
    `type`       bigint(20) DEFAULT NULL,
    `username`   varchar(255) DEFAULT NULL,
    `usernumber` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `two`;
CREATE TABLE `two`
(
    `id`         bigint(20) NOT NULL,
    `address`    varchar(255) DEFAULT NULL,
    `applyno`    varchar(255) DEFAULT NULL,
    `count`      varchar(255) DEFAULT NULL,
    `type`       bigint(20) DEFAULT NULL,
    `username`   varchar(255) DEFAULT NULL,
    `usernumber` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;


CREATE DATABASE IF NOT EXISTS `acnew` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci */;
USE `acnew`;SET NAMES utf8mb4; SET FOREIGN_KEY_CHECKS = 0;

DROP TABLE IF EXISTS `one`;
CREATE TABLE `one`
(
    `id`         bigint(20) NOT NULL,
    `address`    varchar(255) DEFAULT NULL,
    `applyno`    varchar(255) DEFAULT NULL,
    `count`      varchar(255) DEFAULT NULL,
    `type`       bigint(20) DEFAULT NULL,
    `username`   varchar(255) DEFAULT NULL,
    `usernumber` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;

DROP TABLE IF EXISTS `two`;
CREATE TABLE `two`
(
    `id`         bigint(20) NOT NULL,
    `address`    varchar(255) DEFAULT NULL,
    `applyno`    varchar(255) DEFAULT NULL,
    `count`      varchar(255) DEFAULT NULL,
    `type`       bigint(20) DEFAULT NULL,
    `username`   varchar(255) DEFAULT NULL,
    `usernumber` varchar(255) DEFAULT NULL,
    PRIMARY KEY (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8mb4;