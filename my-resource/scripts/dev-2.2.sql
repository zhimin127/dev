/*
Navicat MySQL Data Transfer

Source Server         : my
Source Server Version : 50702
Source Host           : localhost:3306
Source Database       : dev

Target Server Type    : MYSQL
Target Server Version : 50702
File Encoding         : 65001

Date: 2015-03-16 08:07:15
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for ad_info
-- ----------------------------
DROP TABLE IF EXISTS `ad_info`;
CREATE TABLE `ad_info` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `TYPE` tinyint(1) NOT NULL,
  `TITLE` varchar(255) DEFAULT NULL,
  `CONTENT` varchar(255) DEFAULT NULL,
  `IMG_PATH` varchar(255) DEFAULT NULL,
  `URL` varchar(255) DEFAULT NULL,
  `STYLE` varchar(255) DEFAULT NULL,
  `COMPANY` varchar(255) DEFAULT NULL,
  `RECORDER` varchar(36) DEFAULT NULL,
  `RECORD_TIME` datetime DEFAULT NULL,
  `UPDATER` varchar(36) DEFAULT NULL,
  `UPDATE_TIME` datetime DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ad_info
-- ----------------------------

-- ----------------------------
-- Table structure for company
-- ----------------------------
DROP TABLE IF EXISTS `company`;
CREATE TABLE `company` (
  `ID` int(11) NOT NULL,
  `UID` int(11) NOT NULL,
  `NAME` varchar(55) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of company
-- ----------------------------

-- ----------------------------
-- Table structure for persistent_logins
-- ----------------------------
DROP TABLE IF EXISTS `persistent_logins`;
CREATE TABLE `persistent_logins` (
  `USERNAME` varchar(55) DEFAULT NULL,
  `SERIES` varchar(36) NOT NULL,
  `TOKEN` varchar(55) DEFAULT NULL,
  `LAST_USED` timestamp NULL DEFAULT NULL ON UPDATE CURRENT_TIMESTAMP,
  PRIMARY KEY (`SERIES`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='Spring Remember me 持久化';

-- ----------------------------
-- Records of persistent_logins
-- ----------------------------

-- ----------------------------
-- Table structure for sys_authorities
-- ----------------------------
DROP TABLE IF EXISTS `sys_authorities`;
CREATE TABLE `sys_authorities` (
  `AUTHORITY_ID` varchar(36) NOT NULL,
  `AUTHORITY_MARK` varchar(255) DEFAULT NULL,
  `AUTHORITY_NAME` varchar(55) NOT NULL,
  `AUTHORITY_DESC` varchar(255) DEFAULT NULL,
  `MESSAGE` varchar(255) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `IS_SYS` char(1) DEFAULT NULL,
  `MODULE_ID` varchar(36) DEFAULT NULL,
  KEY `AUTHORITY_ID` (`AUTHORITY_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_authorities
-- ----------------------------

-- ----------------------------
-- Table structure for sys_authorities_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_authorities_resources`;
CREATE TABLE `sys_authorities_resources` (
  `ID` varchar(36) NOT NULL,
  `RESOURCE_ID` varchar(36) NOT NULL,
  `AUTHORITY_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_AUTH_REFERENCE_SYS_AUTH` (`AUTHORITY_ID`),
  KEY `FK_SYS_AUTH_REFERENCE_SYS_RESO` (`RESOURCE_ID`),
  CONSTRAINT `FK_SYS_AUTH_RESOURCE_REFERENCE_SYS_AUTH` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `sys_authorities` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_AUTH_RESOURCE_REFERENCE_SYS_RESOURCE` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `sys_resources` (`RESOURCE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_authorities_resources
-- ----------------------------

-- ----------------------------
-- Table structure for sys_modules
-- ----------------------------
DROP TABLE IF EXISTS `sys_modules`;
CREATE TABLE `sys_modules` (
  `MODULE_ID` varchar(36) NOT NULL,
  `MODULE_NAME` varchar(55) NOT NULL,
  `MODULE_DESC` varchar(255) DEFAULT NULL,
  `MODULE_TYPE` varchar(55) DEFAULT NULL,
  `PARENT` varchar(55) DEFAULT NULL,
  `MODULE_URL` varchar(255) DEFAULT NULL,
  `LEVEL` varchar(55) DEFAULT NULL,
  `LEAF` varchar(55) DEFAULT NULL,
  `APPLICATION` varchar(255) DEFAULT NULL,
  `CONTROLLER` varchar(255) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `PRIORITY` int(11) DEFAULT NULL,
  PRIMARY KEY (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_modules
-- ----------------------------
INSERT INTO `sys_modules` VALUES ('818181ec4b028f87014b028f870e0000', '导航', '导航', '0', null, 'NAVIGATION', '0', null, null, null, '1', '0');
INSERT INTO `sys_modules` VALUES ('818181ec4b0291b6014b0291b6800000', '用户管理', '用户管理', '1', '818181ec4b028f87014b028f870e0000', 'user', '1', null, null, null, '1', '1');
INSERT INTO `sys_modules` VALUES ('818181ec4b029314014b029314d70000', '角色管理', '角色管理', '1', '818181ec4b028f87014b028f870e0000', '/role', '1', null, null, null, '1', '2');
INSERT INTO `sys_modules` VALUES ('818181ec4b02941c014b02941cf10000', '资源管理', '资源管理', '1', '818181ec4b028f87014b028f870e0000', 'module', '1', null, null, null, '1', '3');
INSERT INTO `sys_modules` VALUES ('818181ec4b029f70014b029f70150000', '用户列表', '用户列表', '2', '818181ec4b0291b6014b0291b6800000', 'user/', '2', null, null, null, '1', '100');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a02d014b02a02da30000', '新增用户', '新增用户', '2', '818181ec4b0291b6014b0291b6800000', 'user/new', '2', null, null, null, '1', '101');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a1c6014b02a1c6620000', '角色列表', '角色列表', '2', '818181ec4b029314014b029314d70000', 'role/', '2', null, null, null, '1', '103');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a23f014b02a23fa70000', '新增角色', '新增角色', '2', '818181ec4b029314014b029314d70000', 'role/new', '2', null, null, null, '1', '104');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a30e014b02a30e420000', '分配角色', '分配角色', '3', '818181ec4b029f70014b029f70150000', 'user/role', '2', null, null, null, '1', '105');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a7be014b02a7be280000', '资源列表', '资源列表', '2', '818181ec4b02941c014b02941cf10000', 'module/', '2', null, null, null, '1', '107');
INSERT INTO `sys_modules` VALUES ('818181ec4b02a812014b02a812fb0000', '添加资源', '添加资源', '2', '818181ec4b02941c014b02941cf10000', 'module/new', '2', null, null, null, '1', '108');

-- ----------------------------
-- Table structure for sys_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources`;
CREATE TABLE `sys_resources` (
  `RESOURCE_ID` varchar(36) NOT NULL,
  `RESOURCE_TYPE` varchar(55) DEFAULT NULL COMMENT '0菜单，1按钮, 2图片, 3音乐, 4视频',
  `RESOURCE_NAME` varchar(255) DEFAULT NULL,
  `RESOURCE_DESC` varchar(255) DEFAULT NULL,
  `RESOURCE_PATH` varchar(255) DEFAULT NULL,
  `PARENT_ID` varchar(36) DEFAULT NULL COMMENT '父资源ID',
  `PRIORITY` int(11) DEFAULT NULL,
  `ENABLED` char(1) DEFAULT NULL,
  `IS_SYS` char(1) DEFAULT NULL,
  `MODULE_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`RESOURCE_ID`),
  KEY `FK_SYS_RESO_REFERENCE_SYS_MODU` (`MODULE_ID`),
  CONSTRAINT `FK_SYS_RESOUCE_REFERENCE_SYS_MODULE` FOREIGN KEY (`MODULE_ID`) REFERENCES `sys_modules` (`MODULE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resources
-- ----------------------------
INSERT INTO `sys_resources` VALUES ('2a7a59c6-661c-41a5-bf14-228339e0dc24', '0', '首页', null, '/index.html', 'fb92c079-274c-4cce-9ab0-190f6a7e8a9b', '1', '1', '1', null);
INSERT INTO `sys_resources` VALUES ('2cdc3c34-cd9a-42da-923f-4ba413a9074d', '0', '用户管理', null, null, 'fb92c079-274c-4cce-9ab0-190f6a7e8a9b', '2', '1', '1', null);
INSERT INTO `sys_resources` VALUES ('563e9d1f-9214-46af-97d7-ed1312359efb', '0', '角色管理', null, null, 'fb92c079-274c-4cce-9ab0-190f6a7e8a9b', '3', '1', '1', null);
INSERT INTO `sys_resources` VALUES ('d4e2095f-fe2b-4677-83c6-a191bbdb1fc4', '0', '资源管理', null, '/resource.html', 'fb92c079-274c-4cce-9ab0-190f6a7e8a9b', '4', '1', '1', null);
INSERT INTO `sys_resources` VALUES ('d7a79a3e-d5f3-4da2-b9bd-397502800ee6', '1', '添加资源', null, '/resource/create.html', 'd4e2095f-fe2b-4677-83c6-a191bbdb1fc4', '6', '1', '1', null);
INSERT INTO `sys_resources` VALUES ('fb92c079-274c-4cce-9ab0-190f6a7e8a9b', '0', '导航', 'NAVIGATION', null, null, '0', '1', '1', null);

-- ----------------------------
-- Table structure for sys_resources_styles
-- ----------------------------
DROP TABLE IF EXISTS `sys_resources_styles`;
CREATE TABLE `sys_resources_styles` (
  `ID` varchar(36) NOT NULL,
  `RESOURCE_ID` varchar(36) DEFAULT NULL,
  `STYLE_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `RESOURCE_ID` (`RESOURCE_ID`),
  KEY `FK_SYS_STYLE_REFERENCE_SYS_STYLE` (`STYLE_ID`),
  CONSTRAINT `FK_SYS_RESOUCE_STYLE_REFERENCE_SYS_RESOURCE` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `sys_resources` (`RESOURCE_ID`),
  CONSTRAINT `FK_SYS_RESOUCE_STYLE_REFERENCE_SYS_STYLE` FOREIGN KEY (`STYLE_ID`) REFERENCES `sys_styles` (`STYLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_resources_styles
-- ----------------------------
INSERT INTO `sys_resources_styles` VALUES ('1', 'fb92c079-274c-4cce-9ab0-190f6a7e8a9b', 'ab21ae83-9e7d-47f9-a5b9-f8c8869a6c35');
INSERT INTO `sys_resources_styles` VALUES ('2', '2a7a59c6-661c-41a5-bf14-228339e0dc24', '344cfbcb-fb03-4b21-8432-305e4a45c088');
INSERT INTO `sys_resources_styles` VALUES ('3', '2cdc3c34-cd9a-42da-923f-4ba413a9074d', 'd533f560-4377-40a2-b640-9322be208853');
INSERT INTO `sys_resources_styles` VALUES ('4', '563e9d1f-9214-46af-97d7-ed1312359efb', '9e5c9059-b8d9-46c3-8f4e-203b7de50c02');
INSERT INTO `sys_resources_styles` VALUES ('5', 'd4e2095f-fe2b-4677-83c6-a191bbdb1fc4', '9d4de254-457c-4220-b504-39d6daa2f3c1');

-- ----------------------------
-- Table structure for sys_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles`;
CREATE TABLE `sys_roles` (
  `ROLE_ID` varchar(36) NOT NULL COMMENT '角色ID',
  `ROLE_NAME` varchar(55) DEFAULT NULL COMMENT '角色名称',
  `ROLE_DESC` varchar(255) DEFAULT NULL COMMENT '角色描述',
  `ENABLED` char(1) DEFAULT NULL COMMENT '是否可用',
  `IS_SYS` char(1) DEFAULT NULL COMMENT '是否系统权限',
  `MODULE_ID` varchar(36) DEFAULT NULL COMMENT '模块ID',
  PRIMARY KEY (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles
-- ----------------------------
INSERT INTO `sys_roles` VALUES ('818181ec4ad85c9a014ad85c9ad60000', '登录用户', '登录用户', '1', '0', null);
INSERT INTO `sys_roles` VALUES ('818181ec4ad85da7014ad85da78b0000', '系统管理员', '系统管理员', '1', '1', null);
INSERT INTO `sys_roles` VALUES ('818181ec4ad85ebd014ad85ebd2b0000', '普通用户', '普通用户', '1', '0', null);

-- ----------------------------
-- Table structure for sys_roles_authorities
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_authorities`;
CREATE TABLE `sys_roles_authorities` (
  `ID` varchar(36) NOT NULL,
  `AUTHORITY_ID` varchar(36) NOT NULL,
  `ROLE_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_ROLE` (`ROLE_ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_AUTH` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_ROLE_AUTH_REFERENCE_SYS_AUTH` FOREIGN KEY (`AUTHORITY_ID`) REFERENCES `sys_authorities` (`AUTHORITY_ID`),
  CONSTRAINT `FK_SYS_ROLE_AUTH_REFERENCE_SYS_ROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles_authorities
-- ----------------------------

-- ----------------------------
-- Table structure for sys_roles_modules
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_modules`;
CREATE TABLE `sys_roles_modules` (
  `ID` varchar(36) NOT NULL,
  `MODULE_ID` varchar(36) NOT NULL,
  `ROLE_ID` varchar(36) NOT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_MODU` (`MODULE_ID`),
  KEY `FK_SYS_ROLE_REFERENCE_SYS_ROLE2` (`ROLE_ID`),
  CONSTRAINT `FK_SYS_ROLE_MODULE_REFERENCE_SYS_MODULE` FOREIGN KEY (`MODULE_ID`) REFERENCES `sys_modules` (`MODULE_ID`),
  CONSTRAINT `FK_SYS_ROLE_MODULE_REFERENCE_SYS_ROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles_modules
-- ----------------------------
INSERT INTO `sys_roles_modules` VALUES ('1', '818181ec4b028f87014b028f870e0000', '818181ec4ad85c9a014ad85c9ad60000');
INSERT INTO `sys_roles_modules` VALUES ('2', '818181ec4b0291b6014b0291b6800000', '818181ec4ad85da7014ad85da78b0000');
INSERT INTO `sys_roles_modules` VALUES ('3', '818181ec4b029314014b029314d70000', '818181ec4ad85da7014ad85da78b0000');
INSERT INTO `sys_roles_modules` VALUES ('4', '818181ec4b02941c014b02941cf10000', '818181ec4ad85da7014ad85da78b0000');
INSERT INTO `sys_roles_modules` VALUES ('5', '818181ec4b0291b6014b0291b6800000', '818181ec4ad85ebd014ad85ebd2b0000');

-- ----------------------------
-- Table structure for sys_roles_resources
-- ----------------------------
DROP TABLE IF EXISTS `sys_roles_resources`;
CREATE TABLE `sys_roles_resources` (
  `ID` varchar(36) NOT NULL,
  `ROLE_ID` varchar(36) DEFAULT NULL,
  `RESOURCE_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_ROLE_RESOURCE_REFERENCE_SYS_ROLES` (`ROLE_ID`),
  KEY `FK_SYS_ROLE_RESOURCE_REFERENCE_SYS_RESOURCES` (`RESOURCE_ID`),
  CONSTRAINT `FK_SYS_ROLE_RESOURCE_REFERENCE_SYS_RESOURCES` FOREIGN KEY (`RESOURCE_ID`) REFERENCES `sys_resources` (`RESOURCE_ID`),
  CONSTRAINT `FK_SYS_ROLE_RESOURCE_REFERENCE_SYS_ROLES` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_roles_resources
-- ----------------------------
INSERT INTO `sys_roles_resources` VALUES ('1', '818181ec4ad85c9a014ad85c9ad60000', '2a7a59c6-661c-41a5-bf14-228339e0dc24');
INSERT INTO `sys_roles_resources` VALUES ('4c9e6933-60a8-41f1-bce2-1347aa4480a5', '818181ec4ad85da7014ad85da78b0000', '2a7a59c6-661c-41a5-bf14-228339e0dc24');
INSERT INTO `sys_roles_resources` VALUES ('86feaac9-c414-40ae-9459-732bd2cb941e', '818181ec4ad85da7014ad85da78b0000', 'd7a79a3e-d5f3-4da2-b9bd-397502800ee6');
INSERT INTO `sys_roles_resources` VALUES ('930cf06c-4bdf-41aa-9aea-d793a4e9eff7', '818181ec4ad85da7014ad85da78b0000', '563e9d1f-9214-46af-97d7-ed1312359efb');
INSERT INTO `sys_roles_resources` VALUES ('a13f5ebc-0858-4ec2-a345-0812d13474a8', '818181ec4ad85da7014ad85da78b0000', 'd4e2095f-fe2b-4677-83c6-a191bbdb1fc4');
INSERT INTO `sys_roles_resources` VALUES ('b85faf92-5b1a-4415-bcf5-077a4a6b7e23', '818181ec4ad85da7014ad85da78b0000', '2cdc3c34-cd9a-42da-923f-4ba413a9074d');

-- ----------------------------
-- Table structure for sys_styles
-- ----------------------------
DROP TABLE IF EXISTS `sys_styles`;
CREATE TABLE `sys_styles` (
  `STYLE_ID` varchar(36) NOT NULL,
  `STYLE_NAME` varchar(55) DEFAULT NULL,
  `STYLE_CLASS` varchar(55) DEFAULT NULL,
  `STYLE_CSS` varchar(255) DEFAULT NULL,
  `STYLE_DESC` varchar(255) DEFAULT NULL,
  `ICON_NAME` varchar(55) DEFAULT NULL,
  `ICON_CSS` varchar(255) DEFAULT NULL COMMENT '图标样式',
  `ICON_DESC` varchar(255) DEFAULT NULL,
  `REMARK` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`STYLE_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_styles
-- ----------------------------
INSERT INTO `sys_styles` VALUES ('344cfbcb-fb03-4b21-8432-305e4a45c088', '首页', null, null, null, 'icon-home', null, null, null);
INSERT INTO `sys_styles` VALUES ('9d4de254-457c-4220-b504-39d6daa2f3c1', '资源管理', null, null, null, 'icon-star', null, null, null);
INSERT INTO `sys_styles` VALUES ('9e5c9059-b8d9-46c3-8f4e-203b7de50c02', '角色管理', null, null, null, 'icon-food', null, null, null);
INSERT INTO `sys_styles` VALUES ('ab21ae83-9e7d-47f9-a5b9-f8c8869a6c35', '导航', 'nav-header', null, null, null, null, null, null);
INSERT INTO `sys_styles` VALUES ('d533f560-4377-40a2-b640-9322be208853', '用户管理', null, null, null, 'icon-user', null, null, null);

-- ----------------------------
-- Table structure for sys_users
-- ----------------------------
DROP TABLE IF EXISTS `sys_users`;
CREATE TABLE `sys_users` (
  `USER_ID` varchar(36) NOT NULL COMMENT '用户ID',
  `USERNAME` varchar(55) NOT NULL COMMENT '用户名',
  `NAME` varchar(55) DEFAULT NULL COMMENT '真实姓名',
  `PASSWORD` varchar(55) NOT NULL COMMENT '密码',
  `CREATE_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `LAST_LOGIN_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后登录时间',
  `DEADLINE` timestamp NULL DEFAULT NULL COMMENT '过期时间',
  `LOGIN_IP` varchar(100) DEFAULT NULL COMMENT '最后登录IP地址',
  `DEPARTMENT_ID` varchar(36) DEFAULT NULL COMMENT '部门ID',
  `DEPARTMENT_NAME` varchar(55) DEFAULT NULL COMMENT '部门名称',
  `ENABLED` char(1) NOT NULL DEFAULT '0' COMMENT '是否可用',
  `ACCOUNT_NON_EXPIRED` char(1) DEFAULT NULL COMMENT '用户是否过期',
  `ACCOUNT_NON_LOCKED` char(1) DEFAULT NULL COMMENT '用户是否锁定',
  `CREDENTIALS_NON_EXPIRED` char(1) DEFAULT '' COMMENT '用户证书是否有效',
  PRIMARY KEY (`USER_ID`),
  UNIQUE KEY `USERNAME` (`USERNAME`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users
-- ----------------------------
INSERT INTO `sys_users` VALUES ('0feb50a5-3826-44a8-afa6-574f6f50859d', 'abc', '管理员', '08MYoO/sGClK/PTQmMRiCw==', '2015-02-07 18:47:09', '2015-02-07 18:47:09', null, null, null, null, '1', null, null, null);
INSERT INTO `sys_users` VALUES ('818181ec4ad457c6014ad457c6dc0000', 'admin', '管理员', 'zrTzIyXtphQr1lIV9MDzcQ==', '2015-01-19 00:55:04', '2015-02-07 19:21:44', null, null, null, null, '1', '1', '1', '1');

-- ----------------------------
-- Table structure for sys_users_roles
-- ----------------------------
DROP TABLE IF EXISTS `sys_users_roles`;
CREATE TABLE `sys_users_roles` (
  `ID` varchar(36) NOT NULL,
  `ROLE_ID` varchar(36) DEFAULT NULL,
  `USER_ID` varchar(36) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `FK_SYS_USER_REFERENCE_SYS_ROLE` (`ROLE_ID`),
  KEY `FK_SYS_USER_REFERENCE_SYS_USER` (`USER_ID`),
  CONSTRAINT `FK_SYS_USER_ROLE_REFERENCE_SYS_ROLE` FOREIGN KEY (`ROLE_ID`) REFERENCES `sys_roles` (`ROLE_ID`),
  CONSTRAINT `FK_SYS_USER_ROLE_REFERENCE_SYS_USER` FOREIGN KEY (`USER_ID`) REFERENCES `sys_users` (`USER_ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sys_users_roles
-- ----------------------------
INSERT INTO `sys_users_roles` VALUES ('12759078-34ca-40a3-9697-8a5780943bef', '818181ec4ad85da7014ad85da78b0000', '818181ec4ad457c6014ad457c6dc0000');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `ID` int(11) NOT NULL AUTO_INCREMENT COMMENT '用户ID',
  `USERNAME` varchar(55) NOT NULL COMMENT '用户名',
  `PASSWORD` varchar(55) NOT NULL COMMENT '用户密码',
  `EMAIL` varchar(55) NOT NULL COMMENT '用户邮箱',
  `REAL_NAME` varchar(55) NOT NULL COMMENT '真实姓名',
  `IDCARD_NUMBER` varchar(55) NOT NULL COMMENT '身份证号',
  `TELEPHONE` varchar(55) DEFAULT NULL COMMENT '电话',
  `MOBILE` varchar(55) DEFAULT NULL COMMENT '手机号',
  `ADDRESS` varchar(55) DEFAULT NULL COMMENT '地址',
  `USER_TYPE` char(1) NOT NULL DEFAULT '0' COMMENT '用户类型',
  `STATUS` int(11) DEFAULT NULL COMMENT '状态',
  `REG_TIME` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '注册时间',
  `LAST_LOGIN_TIME` timestamp NULL DEFAULT NULL COMMENT '最后登录时间',
  `LAST_LOGIN_IP` timestamp NULL DEFAULT NULL COMMENT '最后登录IP',
  `REMARK` varchar(255) DEFAULT NULL COMMENT '备注',
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
