/*
SQLyog Ultimate v11.24 (32 bit)
MySQL - 5.5.37 : Database - spring-mybatis
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`spring-mybatis` /*!40100 DEFAULT CHARACTER SET utf8 COLLATE utf8_bin */;

USE `spring-mybatis`;

/*Table structure for table `t_class` */

DROP TABLE IF EXISTS `t_class`;

CREATE TABLE `t_class` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `cls_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_class` */

insert  into `t_class`(`id`,`cls_name`) values (1,'J135');

/*Table structure for table `t_game` */

DROP TABLE IF EXISTS `t_game`;

CREATE TABLE `t_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `game_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_game` */

insert  into `t_game`(`id`,`game_name`) values (1,'LOL'),(2,'DOTA'),(3,'扫雷'),(4,'斗地主');

/*Table structure for table `t_hus` */

DROP TABLE IF EXISTS `t_hus`;

CREATE TABLE `t_hus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `hus_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_hus` */

insert  into `t_hus`(`id`,`hus_name`) values (4,'文章');

/*Table structure for table `t_pet` */

DROP TABLE IF EXISTS `t_pet`;

CREATE TABLE `t_pet` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `bone` int(11) DEFAULT NULL,
  `fish` int(11) DEFAULT NULL,
  `type` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_pet` */

insert  into `t_pet`(`id`,`name`,`bone`,`fish`,`type`) values (1,'小黄',10,NULL,1),(2,'小辉',NULL,20,2);

/*Table structure for table `t_player` */

DROP TABLE IF EXISTS `t_player`;

CREATE TABLE `t_player` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `player_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player` */

insert  into `t_player`(`id`,`player_name`) values (1,'小王'),(2,'小高'),(3,'小李');

/*Table structure for table `t_player_game` */

DROP TABLE IF EXISTS `t_player_game`;

CREATE TABLE `t_player_game` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `fk_player_id` bigint(20) DEFAULT NULL,
  `fk_game_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_player_game` */

insert  into `t_player_game`(`id`,`fk_player_id`,`fk_game_id`) values (1,1,1),(2,1,2),(3,1,3),(4,1,4),(5,3,1),(6,3,2),(7,3,3),(8,3,4),(9,2,1),(10,2,2),(11,2,3),(12,2,4);

/*Table structure for table `t_stus` */

DROP TABLE IF EXISTS `t_stus`;

CREATE TABLE `t_stus` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `stu_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_cls_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_stus` */

insert  into `t_stus`(`id`,`stu_name`,`fk_cls_id`) values (1,'小强',1),(2,'小袁',1),(3,'小蒋',1),(4,'小苏',1);

/*Table structure for table `t_user` */

DROP TABLE IF EXISTS `t_user`;

CREATE TABLE `t_user` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `password` varchar(32) COLLATE utf8_bin DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `login_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `login_index` (`login_name`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_user` */

insert  into `t_user`(`id`,`user_name`,`password`,`age`,`login_name`) values (8,'小妹','123456',18,'a3'),(15,'小马','123456',18,'a4'),(16,'小马','123456',18,'a5'),(17,'小黑','123456',18,'a6'),(18,'小狗蛋','123456',18,'a7'),(19,'大老黑','123456',18,'a8'),(20,'小强强','123456',26,'b1'),(21,'小强','123456',2,'b2'),(22,'小妹子','123456',18,'a9');

/*Table structure for table `t_wife` */

DROP TABLE IF EXISTS `t_wife`;

CREATE TABLE `t_wife` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `wife_name` varchar(20) COLLATE utf8_bin DEFAULT NULL,
  `fk_hus_id` bigint(20) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

/*Data for the table `t_wife` */

insert  into `t_wife`(`id`,`wife_name`,`fk_hus_id`) values (3,'老马',4);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
