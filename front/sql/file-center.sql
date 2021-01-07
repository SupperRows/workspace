/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : 127.0.0.1:3306
 Source Schema         : file-center

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 07/01/2021 16:37:47
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for file_info
-- ----------------------------
DROP TABLE IF EXISTS `file_info`;
CREATE TABLE `file_info`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件md5',
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `is_img` tinyint(1) NOT NULL,
  `content_type` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `size` int(11) NOT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物理路径',
  `url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `source` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `create_time`(`create_time`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of file_info
-- ----------------------------
INSERT INTO `file_info` VALUES ('028ef3eb083f2d66d0d913322bbdff74', '默认图片.jpg', 1, 'image/jpeg', 14041, 'D:\\uploadshp/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', 'LOCAL', '2020-11-04 20:29:22');
INSERT INTO `file_info` VALUES ('06367db73e61c25d348db3947295bed0', 'Snipaste_2020-10-21_20-44-41.png', 1, 'image/png', 139097, 'D:\\uploadshp/2020/10/21/06367db73e61c25d348db3947295bed0.png', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/06367db73e61c25d348db3947295bed0.png', 'LOCAL', '2020-10-21 20:45:01');
INSERT INTO `file_info` VALUES ('0ff3434eb828358e90da43cb94a87fc0', 'Snipaste_2020-10-21_20-43-06.png', 1, 'image/png', 142034, 'D:\\uploadshp/2020/10/21/0ff3434eb828358e90da43cb94a87fc0.png', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/0ff3434eb828358e90da43cb94a87fc0.png', 'LOCAL', '2020-10-21 20:43:33');
INSERT INTO `file_info` VALUES ('12a83d8531f073d3ddc2cff5c5509398', '59bd196690a841a498e9d1ea63340a86!400x400.jpeg', 1, 'image/jpeg', 52003, 'D:\\uploadshp/2020/10/21/12a83d8531f073d3ddc2cff5c5509398.jpeg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/12a83d8531f073d3ddc2cff5c5509398.jpeg', 'LOCAL', '2020-10-21 20:05:02');
INSERT INTO `file_info` VALUES ('19237806dbb28e648a26f30910e77954', '影音线材.jpg', 1, 'image/jpeg', 118626, 'D:\\uploadshp/2020/11/05/19237806dbb28e648a26f30910e77954.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/19237806dbb28e648a26f30910e77954.jpg', 'LOCAL', '2020-11-05 14:44:44');
INSERT INTO `file_info` VALUES ('1ce3a724459dc1fe7138c6b74977cb56', 'magazine-unlock-05-2.3.6062-70166586ED9F575170628E535BE79208.jpg', 1, 'image/jpeg', 147418, 'D:\\uploadshp/2020/11/03/1ce3a724459dc1fe7138c6b74977cb56.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/03/1ce3a724459dc1fe7138c6b74977cb56.jpg', 'LOCAL', '2020-11-03 14:19:26');
INSERT INTO `file_info` VALUES ('2448566c77af2cd9f57b7eecc340d375', '热水器.jpg', 1, 'image/jpeg', 47131, 'D:\\uploadshp/2020/11/05/2448566c77af2cd9f57b7eecc340d375.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/2448566c77af2cd9f57b7eecc340d375.jpg', 'LOCAL', '2020-11-05 14:49:06');
INSERT INTO `file_info` VALUES ('2789cc02b5b1976f62de9a4ea2dc5559', '扫地机器人.jpg', 1, 'image/jpeg', 108273, 'D:\\uploadshp/2020/11/04/2789cc02b5b1976f62de9a4ea2dc5559.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/2789cc02b5b1976f62de9a4ea2dc5559.jpg', 'LOCAL', '2020-11-04 21:29:41');
INSERT INTO `file_info` VALUES ('329351b77d16b4af658abb088ace71d3', '家庭影院.jpg', 1, 'image/jpeg', 141534, 'D:\\uploadshp/2020/11/04/329351b77d16b4af658abb088ace71d3.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/329351b77d16b4af658abb088ace71d3.jpg', 'LOCAL', '2020-11-04 21:21:54');
INSERT INTO `file_info` VALUES ('343845fa72f3707e42e876fe59dec9ca', '电动牙刷.jpg', 1, 'image/jpeg', 17457, 'D:\\uploadshp/2020/11/04/343845fa72f3707e42e876fe59dec9ca.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/343845fa72f3707e42e876fe59dec9ca.jpg', 'LOCAL', '2020-11-04 21:24:58');
INSERT INTO `file_info` VALUES ('345d280dc5000db654c1ba4f4f2150d5', '洗衣机.jpg', 1, 'image/jpeg', 111233, 'D:\\uploadshp/2020/11/04/345d280dc5000db654c1ba4f4f2150d5.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/345d280dc5000db654c1ba4f4f2150d5.jpg', 'LOCAL', '2020-11-04 20:30:42');
INSERT INTO `file_info` VALUES ('37efb44bdc1a8f7e20f042dd5331c884', '饮水机.jpg', 1, 'image/jpeg', 60792, 'D:\\uploadshp/2020/11/05/37efb44bdc1a8f7e20f042dd5331c884.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/37efb44bdc1a8f7e20f042dd5331c884.jpg', 'LOCAL', '2020-11-05 15:01:24');
INSERT INTO `file_info` VALUES ('38d918ba4d68ccb63dddcd53fe799820', '微波炉.jpg', 1, 'image/jpeg', 92664, 'D:\\uploadshp/2020/11/05/38d918ba4d68ccb63dddcd53fe799820.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/38d918ba4d68ccb63dddcd53fe799820.jpg', 'LOCAL', '2020-11-05 14:56:06');
INSERT INTO `file_info` VALUES ('414b14825780978df8695ac9eac7bc52', '5a5219185e67bc0e6137208019ac5909.jpg', 1, 'image/jpeg', 215215, 'D:\\uploadshp/2020/12/28/414b14825780978df8695ac9eac7bc52.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/12/28/414b14825780978df8695ac9eac7bc52.jpg', 'LOCAL', '2020-12-28 17:26:35');
INSERT INTO `file_info` VALUES ('428f9fd8896b864f2c70789ecd8747cf', '宋燕飞150123199802147519.jpg', 1, 'image/jpeg', 108593, 'D:\\uploadshp/2020/10/27/428f9fd8896b864f2c70789ecd8747cf.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/27/428f9fd8896b864f2c70789ecd8747cf.jpg', 'LOCAL', '2020-10-27 21:48:52');
INSERT INTO `file_info` VALUES ('42dc9d139f267dba8d3cce5247f4d5e3', '空气炸锅.jpg', 1, 'image/jpeg', 130164, 'D:\\uploadshp/2020/11/05/42dc9d139f267dba8d3cce5247f4d5e3.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/42dc9d139f267dba8d3cce5247f4d5e3.jpg', 'LOCAL', '2020-11-05 14:55:07');
INSERT INTO `file_info` VALUES ('442fac0f673f29e616edd4e7aa199884', '吸尘器.jpg', 1, 'image/jpeg', 104573, 'D:\\uploadshp/2020/11/04/442fac0f673f29e616edd4e7aa199884.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/442fac0f673f29e616edd4e7aa199884.jpg', 'LOCAL', '2020-11-04 21:29:25');
INSERT INTO `file_info` VALUES ('4657016fb4cf2fcc91abad42363c7e5e', '冰箱.jpg', 1, 'image/jpeg', 31408, 'D:\\uploadshp/2020/11/05/4657016fb4cf2fcc91abad42363c7e5e.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/4657016fb4cf2fcc91abad42363c7e5e.jpg', 'LOCAL', '2020-11-05 14:39:37');
INSERT INTO `file_info` VALUES ('4fec74dd7d1c5d47b14b9838a1b68bc3', '音箱.jpg', 1, 'image/jpeg', 34216, 'D:\\uploadshp/2020/11/05/4fec74dd7d1c5d47b14b9838a1b68bc3.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/4fec74dd7d1c5d47b14b9838a1b68bc3.jpg', 'LOCAL', '2020-11-05 14:44:06');
INSERT INTO `file_info` VALUES ('537cbdf6d26d2f2b72e845be1edac3ae', '537cbdf6d26d2f2b72e845be1edac3ae.jpg', 1, 'image/jpeg', 147315, 'D:\\uploadshp/2020/10/21/537cbdf6d26d2f2b72e845be1edac3ae.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/537cbdf6d26d2f2b72e845be1edac3ae.jpg', 'LOCAL', '2020-10-21 20:22:55');
INSERT INTO `file_info` VALUES ('55de34ae81bd0160f3e924c48d5ee7bf', 'Screenshot_20201030_151527_com.dangdang.buy2.jpg', 1, 'image/jpeg', 387688, 'D:\\uploadshp/2020/10/30/55de34ae81bd0160f3e924c48d5ee7bf.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/30/55de34ae81bd0160f3e924c48d5ee7bf.jpg', 'LOCAL', '2020-10-30 22:48:57');
INSERT INTO `file_info` VALUES ('5ae22f9297facb1a60d5c8180d6d5c15', '电饭煲.jpg', 1, 'image/jpeg', 184949, 'D:\\uploadshp/2020/11/04/5ae22f9297facb1a60d5c8180d6d5c15.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/5ae22f9297facb1a60d5c8180d6d5c15.jpg', 'LOCAL', '2020-11-04 21:27:03');
INSERT INTO `file_info` VALUES ('6afb79b3c25cd0758b0739009f0af5d1', '咖啡机.jpg', 1, 'image/jpeg', 110398, 'D:\\uploadshp/2020/11/05/6afb79b3c25cd0758b0739009f0af5d1.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/6afb79b3c25cd0758b0739009f0af5d1.jpg', 'LOCAL', '2020-11-05 14:59:39');
INSERT INTO `file_info` VALUES ('6fe893f219b4d05f0c6614048ab75b45', '6fe893f219b4d05f0c6614048ab75b45.jpg', 1, 'image/jpeg', 102087, 'D:\\uploadshp/2020/10/21/6fe893f219b4d05f0c6614048ab75b45.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/6fe893f219b4d05f0c6614048ab75b45.jpg', 'LOCAL', '2020-10-21 20:06:04');
INSERT INTO `file_info` VALUES ('703c6d5adc0b0af30fd4cd704e1280b1', '703c6d5adc0b0af30fd4cd704e1280b1.jpg', 1, 'image/jpeg', 149345, 'D:\\uploadshp/2020/10/21/703c6d5adc0b0af30fd4cd704e1280b1.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/703c6d5adc0b0af30fd4cd704e1280b1.jpg', 'LOCAL', '2020-10-21 20:06:13');
INSERT INTO `file_info` VALUES ('76eb5d881b097506e9700f075e266de9', '脱毛器.jpg', 1, 'image/jpeg', 81539, 'D:\\uploadshp/2020/11/04/76eb5d881b097506e9700f075e266de9.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/76eb5d881b097506e9700f075e266de9.jpg', 'LOCAL', '2020-11-04 21:25:15');
INSERT INTO `file_info` VALUES ('79f41c69b04f0c539c93417d67146a87', '榨汁机.jpg', 1, 'image/jpeg', 97977, 'D:\\uploadshp/2020/11/05/79f41c69b04f0c539c93417d67146a87.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/79f41c69b04f0c539c93417d67146a87.jpg', 'LOCAL', '2020-11-05 14:58:51');
INSERT INTO `file_info` VALUES ('7e1da0e85fafd3771c85ad49899c782e', '电视机.jpg', 1, 'image/jpeg', 248712, 'D:\\uploadshp/2020/11/04/7e1da0e85fafd3771c85ad49899c782e.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/7e1da0e85fafd3771c85ad49899c782e.jpg', 'LOCAL', '2020-11-04 20:29:44');
INSERT INTO `file_info` VALUES ('804fe9f4c8d4a6aae49e830633a4bc31', 'magazine-unlock-01-2.3.6202-956E7D7C94BD00BE3B27665ECD18997E.jpg', 1, 'image/jpeg', 203338, 'D:\\uploadshp/2020/11/18/804fe9f4c8d4a6aae49e830633a4bc31.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/18/804fe9f4c8d4a6aae49e830633a4bc31.jpg', 'LOCAL', '2020-11-18 17:30:37');
INSERT INTO `file_info` VALUES ('893d5be1a0acbbc302f5e2d37c90e5b6', 'magazine-unlock-01-2.3.6062-E409FB0BA2681FEFFA02CEBF8D15989C.jpg', 1, 'image/jpeg', 281158, 'D:\\uploadshp/2020/11/03/893d5be1a0acbbc302f5e2d37c90e5b6.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/03/893d5be1a0acbbc302f5e2d37c90e5b6.jpg', 'LOCAL', '2020-11-03 14:10:37');
INSERT INTO `file_info` VALUES ('8b970f2fadcf3b431cac39638abeb2b0', '电水壶.jpg', 1, 'image/jpeg', 108962, 'D:\\uploadshp/2020/11/05/8b970f2fadcf3b431cac39638abeb2b0.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/8b970f2fadcf3b431cac39638abeb2b0.jpg', 'LOCAL', '2020-11-05 15:00:26');
INSERT INTO `file_info` VALUES ('8e3b1c2de551d0ade5fbe5d7c3e134f8', '1604072245863.jpg', 1, 'image/jpeg', 166083, 'D:\\uploadshp/2020/10/30/8e3b1c2de551d0ade5fbe5d7c3e134f8.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/30/8e3b1c2de551d0ade5fbe5d7c3e134f8.jpg', 'LOCAL', '2020-10-30 23:37:27');
INSERT INTO `file_info` VALUES ('90e41629ff069b115de0007a35d69db7', 'Snipaste_2020-10-21_20-46-09.png', 1, 'image/png', 53363, 'D:\\uploadshp/2020/10/21/90e41629ff069b115de0007a35d69db7.png', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/90e41629ff069b115de0007a35d69db7.png', 'LOCAL', '2020-10-21 20:46:41');
INSERT INTO `file_info` VALUES ('9163b0d5c88bcd7900355f43c614f998', '足浴盆.jpg', 1, 'image/jpeg', 51088, 'D:\\uploadshp/2020/11/04/9163b0d5c88bcd7900355f43c614f998.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/9163b0d5c88bcd7900355f43c614f998.jpg', 'LOCAL', '2020-11-04 21:27:27');
INSERT INTO `file_info` VALUES ('956f5b6a44bf07fe7fe7f8ce21fa3aa0', '1605256928580.dcloud.HBuilder.jpg', 1, 'image/jpeg', 165582, 'D:\\uploadshp/2020/11/13/956f5b6a44bf07fe7fe7f8ce21fa3aa0.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/13/956f5b6a44bf07fe7fe7f8ce21fa3aa0.jpg', 'LOCAL', '2020-11-13 16:42:22');
INSERT INTO `file_info` VALUES ('9c47da2b5878abb23ef4f8b7196746c9', '电炖锅.jpg', 1, 'image/jpeg', 43546, 'D:\\uploadshp/2020/11/05/9c47da2b5878abb23ef4f8b7196746c9.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/9c47da2b5878abb23ef4f8b7196746c9.jpg', 'LOCAL', '2020-11-05 14:54:11');
INSERT INTO `file_info` VALUES ('a3419822b356f702333ccefb85435ee6', '集成灶.jpg', 1, 'image/jpeg', 50472, 'D:\\uploadshp/2020/11/05/a3419822b356f702333ccefb85435ee6.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a3419822b356f702333ccefb85435ee6.jpg', 'LOCAL', '2020-11-05 14:46:59');
INSERT INTO `file_info` VALUES ('a4bd1f1ab3a3a54cdadd0491e40f5220', '剃须刀.jpg', 1, 'image/jpeg', 95806, 'D:\\uploadshp/2020/11/04/a4bd1f1ab3a3a54cdadd0491e40f5220.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/a4bd1f1ab3a3a54cdadd0491e40f5220.jpg', 'LOCAL', '2020-11-04 21:24:42');
INSERT INTO `file_info` VALUES ('a736f29cc7e0aa17d48b50d490b0d4fd', '烤箱.jpg', 1, 'image/jpeg', 95623, 'D:\\uploadshp/2020/11/05/a736f29cc7e0aa17d48b50d490b0d4fd.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a736f29cc7e0aa17d48b50d490b0d4fd.jpg', 'LOCAL', '2020-11-05 14:56:54');
INSERT INTO `file_info` VALUES ('a90eb29c2b1e0f5537043a70880c9f2b', 'Screenshot_20201030_151608_com.dangdang.buy2.jpg', 1, 'image/jpeg', 268173, 'D:\\uploadshp/2020/10/30/a90eb29c2b1e0f5537043a70880c9f2b.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/30/a90eb29c2b1e0f5537043a70880c9f2b.jpg', 'LOCAL', '2020-10-30 22:51:40');
INSERT INTO `file_info` VALUES ('a9a462a8bb0c2e7abb83ba3702abc5ee', '电火锅.jpg', 1, 'image/jpeg', 178471, 'D:\\uploadshp/2020/11/05/a9a462a8bb0c2e7abb83ba3702abc5ee.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a9a462a8bb0c2e7abb83ba3702abc5ee.jpg', 'LOCAL', '2020-11-05 14:53:51');
INSERT INTO `file_info` VALUES ('aed402153696094c835d0efd061b09d7', '空气净化器.jpg', 1, 'image/jpeg', 88664, 'D:\\uploadshp/2020/11/04/aed402153696094c835d0efd061b09d7.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/aed402153696094c835d0efd061b09d7.jpg', 'LOCAL', '2020-11-04 21:28:35');
INSERT INTO `file_info` VALUES ('afbc0117de7f5474b8eb4f4566305d83', '油烟机.jpg', 1, 'image/jpeg', 100894, 'D:\\uploadshp/2020/11/04/afbc0117de7f5474b8eb4f4566305d83.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/afbc0117de7f5474b8eb4f4566305d83.jpg', 'LOCAL', '2020-11-04 21:23:46');
INSERT INTO `file_info` VALUES ('b4b11ea0c4535043186b5f0738c71988', '电压力锅.jpg', 1, 'image/jpeg', 78594, 'D:\\uploadshp/2020/11/05/b4b11ea0c4535043186b5f0738c71988.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/b4b11ea0c4535043186b5f0738c71988.jpg', 'LOCAL', '2020-11-05 14:53:32');
INSERT INTO `file_info` VALUES ('b7c311934d9eaa7cd1be85afce98a73c', '电磁炉.jpg', 1, 'image/jpeg', 32335, 'D:\\uploadshp/2020/11/05/b7c311934d9eaa7cd1be85afce98a73c.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/b7c311934d9eaa7cd1be85afce98a73c.jpg', 'LOCAL', '2020-11-05 14:47:41');
INSERT INTO `file_info` VALUES ('b9142edd2233c79ceb051b36ed3b9648', '空调.jpg', 1, 'image/jpeg', 21747, 'D:\\uploadshp/2020/11/04/b9142edd2233c79ceb051b36ed3b9648.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/b9142edd2233c79ceb051b36ed3b9648.jpg', 'LOCAL', '2020-11-04 20:30:23');
INSERT INTO `file_info` VALUES ('bc9cb2c66c013abcc19108bfded672b9', '酸奶机.jpg', 1, 'image/jpeg', 150185, 'D:\\uploadshp/2020/11/05/bc9cb2c66c013abcc19108bfded672b9.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bc9cb2c66c013abcc19108bfded672b9.jpg', 'LOCAL', '2020-11-05 14:59:18');
INSERT INTO `file_info` VALUES ('bded0ca6a5aa333b3edd8effc241f47d', '电热水龙头.jpg', 1, 'image/jpeg', 77085, 'D:\\uploadshp/2020/11/05/bded0ca6a5aa333b3edd8effc241f47d.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bded0ca6a5aa333b3edd8effc241f47d.jpg', 'LOCAL', '2020-11-05 14:49:33');
INSERT INTO `file_info` VALUES ('bf9c39bb8439f8e80e1ebe37091143a9', '浴霸.jpg', 1, 'image/jpeg', 50873, 'D:\\uploadshp/2020/11/05/bf9c39bb8439f8e80e1ebe37091143a9.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bf9c39bb8439f8e80e1ebe37091143a9.jpg', 'LOCAL', '2020-11-05 14:50:01');
INSERT INTO `file_info` VALUES ('c3772e3344ff516b071e9eff1ea26d54', 'c3772e3344ff516b071e9eff1ea26d54.jpg', 1, 'image/jpeg', 111750, 'D:\\uploadshp/2020/10/21/c3772e3344ff516b071e9eff1ea26d54.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/c3772e3344ff516b071e9eff1ea26d54.jpg', 'LOCAL', '2020-10-21 20:24:08');
INSERT INTO `file_info` VALUES ('c514a2af81afcd9db29989851e4fa9f9', '电吹风.jpg', 1, 'image/jpeg', 73665, 'D:\\uploadshp/2020/11/04/c514a2af81afcd9db29989851e4fa9f9.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/c514a2af81afcd9db29989851e4fa9f9.jpg', 'LOCAL', '2020-11-04 21:24:09');
INSERT INTO `file_info` VALUES ('c7f11517f085d10f868d4c85e609c670', '豆浆机.jpg', 1, 'image/jpeg', 100881, 'D:\\uploadshp/2020/11/05/c7f11517f085d10f868d4c85e609c670.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/c7f11517f085d10f868d4c85e609c670.jpg', 'LOCAL', '2020-11-05 14:58:05');
INSERT INTO `file_info` VALUES ('c918c161b1a51369975161c38c42faa0', '11041Q14203-11.jpg', 1, 'image/jpeg', 437868, 'D:\\uploadshp/2020/12/28/c918c161b1a51369975161c38c42faa0.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/12/28/c918c161b1a51369975161c38c42faa0.jpg', 'LOCAL', '2020-12-28 17:09:13');
INSERT INTO `file_info` VALUES ('cda2116ad044b5a59569eb1849d01e32', '净水器.jpg', 1, 'image/jpeg', 91323, 'D:\\uploadshp/2020/11/05/cda2116ad044b5a59569eb1849d01e32.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/cda2116ad044b5a59569eb1849d01e32.jpg', 'LOCAL', '2020-11-05 15:01:51');
INSERT INTO `file_info` VALUES ('cf6534bd66cd795a2c061a3046b35f3e', '洗碗机.jpg', 1, 'image/jpeg', 102290, 'D:\\uploadshp/2020/11/05/cf6534bd66cd795a2c061a3046b35f3e.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/cf6534bd66cd795a2c061a3046b35f3e.jpg', 'LOCAL', '2020-11-05 14:51:38');
INSERT INTO `file_info` VALUES ('d144ab05c29ebee79fd29885951ab9cc', 'd144ab05c29ebee79fd29885951ab9cc.jpg', 1, 'image/jpeg', 112162, 'D:\\uploadshp/2020/10/21/d144ab05c29ebee79fd29885951ab9cc.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/d144ab05c29ebee79fd29885951ab9cc.jpg', 'LOCAL', '2020-10-21 20:06:21');
INSERT INTO `file_info` VALUES ('d52a0da68cf6769fdc456ba623248d96', '消毒柜.jpg', 1, 'image/jpeg', 169883, 'D:\\uploadshp/2020/11/05/d52a0da68cf6769fdc456ba623248d96.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/d52a0da68cf6769fdc456ba623248d96.jpg', 'LOCAL', '2020-11-05 14:52:45');
INSERT INTO `file_info` VALUES ('d5a491cd3d8d071e3212c3478e8e35a1', '2d1d2363f896380f3e6b279f8a68f2ee.jpg', 1, 'image/jpeg', 25550, 'D:\\uploadshp/2020/10/22/d5a491cd3d8d071e3212c3478e8e35a1.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/22/d5a491cd3d8d071e3212c3478e8e35a1.jpg', 'LOCAL', '2020-10-22 19:56:45');
INSERT INTO `file_info` VALUES ('d6c2d99de8c25ce446275466d7d21303', 'Snipaste_2020-10-21_20-47-48.png', 1, 'image/png', 32435, 'D:\\uploadshp/2020/10/21/d6c2d99de8c25ce446275466d7d21303.png', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/d6c2d99de8c25ce446275466d7d21303.png', 'LOCAL', '2020-10-21 20:47:54');
INSERT INTO `file_info` VALUES ('dbebc162ce75d643a3df166239500140', 'dbebc162ce75d643a3df166239500140.jpg', 1, 'image/jpeg', 135164, 'D:\\uploadshp/2020/10/21/dbebc162ce75d643a3df166239500140.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/dbebc162ce75d643a3df166239500140.jpg', 'LOCAL', '2020-10-21 20:06:29');
INSERT INTO `file_info` VALUES ('dc2cbac87fd68c918cddd6ff23462c13', '煎药壶.jpg', 1, 'image/jpeg', 145208, 'D:\\uploadshp/2020/11/05/dc2cbac87fd68c918cddd6ff23462c13.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/dc2cbac87fd68c918cddd6ff23462c13.jpg', 'LOCAL', '2020-11-05 15:00:48');
INSERT INTO `file_info` VALUES ('de1b8a3e7d46aeeb54651f8c5b77c1a7', '按摩器.jpg', 1, 'image/jpeg', 32983, 'D:\\uploadshp/2020/11/04/de1b8a3e7d46aeeb54651f8c5b77c1a7.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/de1b8a3e7d46aeeb54651f8c5b77c1a7.jpg', 'LOCAL', '2020-11-04 21:27:43');
INSERT INTO `file_info` VALUES ('deeeadeeea95003b91b18b52630adb85', '电暖器.jpg', 1, 'image/jpeg', 88575, 'D:\\uploadshp/2020/11/04/deeeadeeea95003b91b18b52630adb85.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/deeeadeeea95003b91b18b52630adb85.jpg', 'LOCAL', '2020-11-04 21:28:55');
INSERT INTO `file_info` VALUES ('e14b6a4637d46bae2973291ca95c3fb2', '001.jpg', 1, 'image/jpeg', 22516, 'D:\\uploadshp/2020/10/30/e14b6a4637d46bae2973291ca95c3fb2.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/30/e14b6a4637d46bae2973291ca95c3fb2.jpg', 'LOCAL', '2020-10-30 21:56:26');
INSERT INTO `file_info` VALUES ('e1808e278d9e65ab2643057bf9269920', '电饼铛.jpg', 1, 'image/jpeg', 55888, 'D:\\uploadshp/2020/11/05/e1808e278d9e65ab2643057bf9269920.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/e1808e278d9e65ab2643057bf9269920.jpg', 'LOCAL', '2020-11-05 14:56:25');
INSERT INTO `file_info` VALUES ('e44e19767e7b82576b1fb3ed688eb9e8', '美容仪.jpg', 1, 'image/jpeg', 88469, 'D:\\uploadshp/2020/11/04/e44e19767e7b82576b1fb3ed688eb9e8.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/e44e19767e7b82576b1fb3ed688eb9e8.jpg', 'LOCAL', '2020-11-04 21:25:35');
INSERT INTO `file_info` VALUES ('e57e4f65de8003497172b51264b86ee3', '电视配件.jpg', 1, 'image/jpeg', 41321, 'D:\\uploadshp/2020/11/05/e57e4f65de8003497172b51264b86ee3.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/e57e4f65de8003497172b51264b86ee3.jpg', 'LOCAL', '2020-11-05 14:41:34');
INSERT INTO `file_info` VALUES ('e5bcb4b5a6324af7327688a0f6d0c744', '电子秤.jpg', 1, 'image/jpeg', 17698, 'D:\\uploadshp/2020/11/04/e5bcb4b5a6324af7327688a0f6d0c744.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/e5bcb4b5a6324af7327688a0f6d0c744.jpg', 'LOCAL', '2020-11-04 21:28:10');
INSERT INTO `file_info` VALUES ('eabd6da34c9e49ee8fe5c46e64232c28', 'eabd6da34c9e49ee8fe5c46e64232c28.jpg', 1, 'image/jpeg', 78630, 'D:\\uploadshp/2020/10/21/eabd6da34c9e49ee8fe5c46e64232c28.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/eabd6da34c9e49ee8fe5c46e64232c28.jpg', 'LOCAL', '2020-10-21 20:06:39');
INSERT INTO `file_info` VALUES ('ef91f399eb8908fca3bdc0371b96f355', '酒柜.jpg', 1, 'image/jpeg', 183654, 'D:\\uploadshp/2020/11/05/ef91f399eb8908fca3bdc0371b96f355.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/ef91f399eb8908fca3bdc0371b96f355.jpg', 'LOCAL', '2020-11-05 14:41:10');
INSERT INTO `file_info` VALUES ('efdb5b4a21b2cdd3d3ccc68d9678498e', '美发器.jpg', 1, 'image/jpeg', 83250, 'D:\\uploadshp/2020/11/04/efdb5b4a21b2cdd3d3ccc68d9678498e.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/efdb5b4a21b2cdd3d3ccc68d9678498e.jpg', 'LOCAL', '2020-11-04 21:26:01');
INSERT INTO `file_info` VALUES ('f1799fe638fa224adeec4b48c78d5b48', '冷柜.jpg', 1, 'image/jpeg', 96941, 'D:\\uploadshp/2020/11/05/f1799fe638fa224adeec4b48c78d5b48.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/f1799fe638fa224adeec4b48c78d5b48.jpg', 'LOCAL', '2020-11-05 14:40:39');
INSERT INTO `file_info` VALUES ('fe6eb5e9e208185d7c1fc09d0501bbd7', 'Screenshot_20201030_223624_com.tencent.mm.jpg', 1, 'image/jpeg', 381448, 'D:\\uploadshp/2020/10/30/fe6eb5e9e208185d7c1fc09d0501bbd7.jpg', 'http://127.0.0.1:9200/api-file/statics/2020/10/30/fe6eb5e9e208185d7c1fc09d0501bbd7.jpg', 'LOCAL', '2020-10-30 22:40:27');

-- ----------------------------
-- Table structure for file_info_extend
-- ----------------------------
DROP TABLE IF EXISTS `file_info_extend`;
CREATE TABLE `file_info_extend`  (
  `id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件md5',
  `guid` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '文件分片id',
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `size` int(11) NOT NULL,
  `path` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '物理路径',
  `url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `source` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `file_id` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `create_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '文件拓展表' ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
