/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50530
Source Host           : localhost:3306
Source Database       : test

Target Server Type    : MYSQL
Target Server Version : 50530
File Encoding         : 65001

Date: 2018-04-12 14:22:23
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `permission`
-- ----------------------------
DROP TABLE IF EXISTS `permission`;
CREATE TABLE `permission` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `resource` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of permission
-- ----------------------------
INSERT INTO `permission` VALUES ('1', '我最帅', '00000000');
INSERT INTO `permission` VALUES ('2', '我宇宙最帅', '111111');
INSERT INTO `permission` VALUES ('3', '葵花点却手', '2222222');
INSERT INTO `permission` VALUES ('4', '天龙八部', '3333333');
INSERT INTO `permission` VALUES ('5', '葵花宝典', '44444444');
INSERT INTO `permission` VALUES ('6', 'jack', '123456789');
