/*
SQLyog Community v13.1.9 (64 bit)
MySQL - 8.0.29 : Database - cd_blog
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`cd_blog` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;

USE `cd_blog`;

/*Table structure for table `bl_article` */

DROP TABLE IF EXISTS `bl_article`;

CREATE TABLE `bl_article` (
  `id` int NOT NULL AUTO_INCREMENT,
  `user_auth_id` int NOT NULL,
  `category_id` int NOT NULL,
  `article_cover` varchar(1024) NOT NULL,
  `article_title` varchar(1024) NOT NULL,
  `article_content` varchar(1024) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB AUTO_INCREMENT=55 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci ROW_FORMAT=DYNAMIC;

/*Data for the table `bl_article` */

/*Table structure for table `bl_article_tag` */

DROP TABLE IF EXISTS `bl_article_tag`;

CREATE TABLE `bl_article_tag` (
  `id` int NOT NULL AUTO_INCREMENT,
  `article_id` int NOT NULL,
  `tag_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_article_tag` */

/*Table structure for table `bl_comment` */

DROP TABLE IF EXISTS `bl_comment`;

CREATE TABLE `bl_comment` (
  `id` int NOT NULL AUTO_INCREMENT,
  `blog_id` int NOT NULL,
  `user_id` int NOT NULL,
  `reply_user_id` int NOT NULL,
  `parent_id` int NOT NULL,
  `create_time` datetime NOT NULL,
  `update_time` datetime NOT NULL,
  `is_delete` blob NOT NULL,
  `is_review` blob NOT NULL,
  `comment_content` varchar(45) NOT NULL,
  `commentcol` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_comment` */

/*Table structure for table `bl_oss_file_info` */

DROP TABLE IF EXISTS `bl_oss_file_info`;

CREATE TABLE `bl_oss_file_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `filename` varchar(45) NOT NULL,
  `isimg` blob NOT NULL,
  `content_type` varchar(45) NOT NULL,
  `path` varchar(45) NOT NULL,
  `url` varchar(45) NOT NULL,
  `source` varchar(45) NOT NULL,
  `create_time` varchar(45) NOT NULL,
  `update_time` varchar(45) NOT NULL,
  `tenant_id` varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_oss_file_info` */

/*Table structure for table `bl_role` */

DROP TABLE IF EXISTS `bl_role`;

CREATE TABLE `bl_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uuid` varchar(45) NOT NULL,
  `user_auth_id` int NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_role` */

/*Table structure for table `bl_role_authority` */

DROP TABLE IF EXISTS `bl_role_authority`;

CREATE TABLE `bl_role_authority` (
  `idrole_authority` int NOT NULL AUTO_INCREMENT,
  `role_id` int NOT NULL,
  `authority_id` int NOT NULL,
  `authority_type` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `create_by` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`idrole_authority`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_role_authority` */

/*Table structure for table `bl_tag` */

DROP TABLE IF EXISTS `bl_tag`;

CREATE TABLE `bl_tag` (
  `id` int NOT NULL AUTO_INCREMENT,
  `tag_name` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_tag` */

/*Table structure for table `bl_user_auth` */

DROP TABLE IF EXISTS `bl_user_auth`;

CREATE TABLE `bl_user_auth` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uuid` varchar(45) DEFAULT NULL,
  `username` varchar(45) DEFAULT NULL,
  `password` varchar(45) DEFAULT NULL,
  `ip_address` varchar(45) DEFAULT NULL,
  `ip_source` varchar(45) DEFAULT NULL,
  `create_time` datetime DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `last_login_time` datetime DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_user_auth` */

/*Table structure for table `bl_user_info` */

DROP TABLE IF EXISTS `bl_user_info`;

CREATE TABLE `bl_user_info` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uuid` varchar(45) DEFAULT NULL,
  `user_auth_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_user_info` */

/*Table structure for table `bl_user_role` */

DROP TABLE IF EXISTS `bl_user_role`;

CREATE TABLE `bl_user_role` (
  `id` int NOT NULL AUTO_INCREMENT,
  `uuid` varchar(45) DEFAULT NULL,
  `user_auth_id` int DEFAULT NULL,
  `role_id` int DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

/*Data for the table `bl_user_role` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
