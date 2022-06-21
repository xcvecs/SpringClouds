/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.29 : Database - Test
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`Test` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `Test`;

/*Table structure for table `Course` */

DROP TABLE IF EXISTS `Course`;

CREATE TABLE `Course` (
  `CId` varchar(10) DEFAULT NULL,
  `Cname` varchar(10) CHARACTER SET utf8mb3 COLLATE utf8_general_ci DEFAULT NULL,
  `TId` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `Course` */

insert  into `Course`(`CId`,`Cname`,`TId`) values 
('01','语文','02'),
('02','数学','01'),
('03','英语','03');

/*Table structure for table `SC` */

DROP TABLE IF EXISTS `SC`;

CREATE TABLE `SC` (
  `SId` varchar(10) DEFAULT NULL,
  `CId` varchar(10) DEFAULT NULL,
  `score` decimal(18,1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `SC` */

insert  into `SC`(`SId`,`CId`,`score`) values 
('01','01',80.0),
('01','02',90.0),
('01','03',99.0),
('02','01',70.0),
('02','02',60.0),
('02','03',80.0),
('03','01',80.0),
('03','02',80.0),
('03','03',80.0),
('04','01',50.0),
('04','02',30.0),
('04','03',20.0),
('05','01',76.0),
('05','02',87.0),
('06','01',31.0),
('06','03',34.0),
('07','02',89.0),
('07','03',98.0),
('08','01',91.0),
('09','02',93.0),
('10','03',96.0);

/*Table structure for table `Student` */

DROP TABLE IF EXISTS `Student`;

CREATE TABLE `Student` (
  `SId` varchar(10) DEFAULT NULL,
  `Sname` varchar(10) DEFAULT NULL,
  `Sage` datetime DEFAULT NULL,
  `Ssex` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `Student` */

insert  into `Student`(`SId`,`Sname`,`Sage`,`Ssex`) values 
('01','赵雷','1990-01-01 00:00:00','男'),
('02','钱电','1990-12-21 00:00:00','男'),
('03','孙风','1990-12-20 00:00:00','男'),
('04','李云','1990-12-06 00:00:00','男'),
('05','周梅','1991-12-01 00:00:00','女'),
('06','吴兰','1992-01-01 00:00:00','女'),
('07','郑竹','1989-01-01 00:00:00','女'),
('09','张三','2017-12-20 00:00:00','女'),
('10','李四','2017-12-25 00:00:00','女'),
('11','李四','2012-06-06 00:00:00','女'),
('12','赵六','2013-06-13 00:00:00','女'),
('13','孙七','2014-06-01 00:00:00','女');

/*Table structure for table `Teacher` */

DROP TABLE IF EXISTS `Teacher`;

CREATE TABLE `Teacher` (
  `TId` varchar(10) DEFAULT NULL,
  `Tname` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `Teacher` */

insert  into `Teacher`(`TId`,`Tname`) values 
('01','张三'),
('02','李四'),
('03','王五');

/*Table structure for table `tb_article1` */

DROP TABLE IF EXISTS `tb_article1`;

CREATE TABLE `tb_article1` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_id` int NOT NULL COMMENT '作者',
  `category_id` int DEFAULT NULL COMMENT '文章分类',
  `article_cover` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '文章缩略图',
  `article_title` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '标题',
  `article_content` longtext CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '内容',
  `type` tinyint(1) NOT NULL DEFAULT '0' COMMENT '文章类型 1原创 2转载 3翻译',
  `original_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci DEFAULT NULL COMMENT '原文链接',
  `is_top` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否置顶 0否 1是',
  `is_delete` tinyint(1) NOT NULL DEFAULT '0' COMMENT '是否删除  0否 1是',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '状态值 1公开 2私密 3评论可见',
  `create_time` datetime NOT NULL COMMENT '发表时间',
  `update_time` datetime DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `tb_article1` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
