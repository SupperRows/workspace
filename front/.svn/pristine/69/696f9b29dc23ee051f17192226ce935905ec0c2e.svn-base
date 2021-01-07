/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : 127.0.0.1:3306
 Source Schema         : oauth-center

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 07/01/2021 16:37:03
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for oauth_client_details
-- ----------------------------
DROP TABLE IF EXISTS `oauth_client_details`;
CREATE TABLE `oauth_client_details`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `client_id` varchar(48) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL COMMENT '应用标识',
  `resource_ids` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '资源限定串(逗号分割)',
  `client_secret` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用密钥(bcyt) 加密',
  `client_secret_str` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '应用密钥(明文)',
  `scope` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '范围',
  `authorized_grant_types` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '5种oauth授权方式(authorization_code,password,refresh_token,client_credentials)',
  `web_server_redirect_uri` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '回调地址 ',
  `authorities` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '权限',
  `access_token_validity` int(11) NULL DEFAULT NULL COMMENT 'access_token有效期',
  `refresh_token_validity` int(11) NULL DEFAULT NULL COMMENT 'refresh_token有效期',
  `additional_information` varchar(4096) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT '{}' COMMENT '{}',
  `autoapprove` varchar(256) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '是否自动授权 是-true',
  `status` int(1) NULL DEFAULT NULL,
  `if_limit` int(11) NOT NULL DEFAULT 0 COMMENT '是否应用限流',
  `limit_count` int(11) NOT NULL DEFAULT 10000 COMMENT '限流阈值',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of oauth_client_details
-- ----------------------------
INSERT INTO `oauth_client_details` VALUES (1, 'webApp', NULL, '$2a$10$06msMGYRH8nrm4iVnKFNKOoddB8wOwymVhbUzw/d3ZixD7Nq8ot72', 'webApp', 'app', 'authorization_code,password,refresh_token,client_credentials', NULL, NULL, 180000, NULL, '{}', 'true', 1, 0, 10000);
INSERT INTO `oauth_client_details` VALUES (2, 'mobile', NULL, '$2a$10$cfMziot6/5oJSwWI7x1dEe5So7pPabktCCOLe8uYvzGfDoGV8QyUW', 'mobile', 'app', 'client_credentials,password,authorization_code,refresh_token', NULL, NULL, 18000, 18000, '{}', 'true', 1, 0, 10000);

-- ----------------------------
-- Table structure for sys_client_service
-- ----------------------------
DROP TABLE IF EXISTS `sys_client_service`;
CREATE TABLE `sys_client_service`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `client_id` int(11) NOT NULL COMMENT '应用主键ID',
  `service_id` int(11) NOT NULL COMMENT '服务主键ID',
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `client_id`(`client_id`, `service_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_gateway_routes
-- ----------------------------
DROP TABLE IF EXISTS `sys_gateway_routes`;
CREATE TABLE `sys_gateway_routes`  (
  `id` char(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'id',
  `uri` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT 'uri路径',
  `predicates` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '判定器',
  `filters` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '过滤器',
  `order` int(11) NULL DEFAULT NULL COMMENT '排序',
  `description` varchar(500) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '描述',
  `delFlag` int(11) NULL DEFAULT 0 COMMENT '删除标志 0 不删除 1 删除',
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '服务网关路由表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_gateway_routes
-- ----------------------------
INSERT INTO `sys_gateway_routes` VALUES ('1', 'lb://eureka-server', '- Path=/api-eureka/**', '- StripPrefix=1', 8000, '注册中心', 0, '2020-11-16 15:58:25', '2020-11-16 16:13:01');

-- ----------------------------
-- Table structure for sys_service
-- ----------------------------
DROP TABLE IF EXISTS `sys_service`;
CREATE TABLE `sys_service`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `path` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sort` int(11) NOT NULL,
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  `is_service` int(11) NULL DEFAULT NULL COMMENT '是否服务 1 是 2 不是',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 19 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_service
-- ----------------------------
INSERT INTO `sys_service` VALUES (1, -1, '认证中心', '/api-auth', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (2, -1, '用户中心', '/api-user', 2, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (3, -1, '文件中心', '/api-file', 3, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (4, -1, '短信中心', '/api/sms', 4, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (5, -1, '日志中心', '/api-log', 5, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (6, -1, '注册中心', '/api-eureka', 6, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (7, 1, '应用管理', '/api-user/client**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (8, 1, '认证管理', '/api-auth/oauth**/**', 2, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (9, 1, 'redis监控', '/api-auth/redis**/**', 3, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (10, 1, '服务管理', '/api-auth/services**/**', 4, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (11, 2, '用户管理', '/api-user/users**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (12, 2, '角色管理', '/api-user/roles**/**', 2, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (13, 2, '菜单管理', '/api-user/menus**/**', 3, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (14, 2, '权限管理', '/api-user/permissions**/**', 4, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (15, 3, '文件管理', '/api-file/files**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (16, 4, '短信管理', '/api/sms/sms**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (17, 5, '日志管理', '/api-log/sysLog**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);
INSERT INTO `sys_service` VALUES (18, 6, '服务治理', '/api-eureka/eureka**/**', 1, '2018-04-09 12:37:57', '2018-04-09 12:37:57', 1);

SET FOREIGN_KEY_CHECKS = 1;
