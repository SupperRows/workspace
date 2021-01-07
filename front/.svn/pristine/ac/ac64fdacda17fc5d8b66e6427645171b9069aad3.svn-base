/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50553
 Source Host           : 127.0.0.1:3306
 Source Schema         : user-center

 Target Server Type    : MySQL
 Target Server Version : 50553
 File Encoding         : 65001

 Date: 07/01/2021 16:35:27
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for brands
-- ----------------------------
DROP TABLE IF EXISTS `brands`;
CREATE TABLE `brands`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `brands_id` int(255) NULL DEFAULT NULL,
  `brands_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `brands_introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `brands_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,
  `create_time` datetime NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `brands_id`(`brands_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 76 CHARACTER SET = utf8 COLLATE = utf8_bin COMMENT = '商品品牌信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of brands
-- ----------------------------
INSERT INTO `brands` VALUES (1, 0, 'TCL', 'TCL集团股份有限公司创立于1981年，是中国最大的、全球性规模经营的消费类电子企业集团之一，旗下拥有三家上市公司：TCL集团（SZ.000100）、TCL多媒体科技（HK.1070）、TCL通讯科技（HK.2618）。2011年销售额达到608亿元，品牌价值501.18亿元。', 'https://img14.360buyimg.com/n0/jfs/t1/135045/10/1159/46955/5ed5f40fE4bbf54a6/2f1ddd105cb1b940.jpg', '2020-03-30 20:30:35');
INSERT INTO `brands` VALUES (2, 2020050647, 'LG电子', '韩国LG集团于1947年成立于韩国首尔，位于首尔市永登浦区汝矣岛洞20号。是领导世界产业发展的国际性企业集团。LG集团目前在171个国家与地区建立了300多家海外办事机构。事业领域覆盖化学能源、电子电器、通讯与服务等领域。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930333509471.gif', '2020-05-06 21:51:04');
INSERT INTO `brands` VALUES (3, 0, '创维', '创维成立于1988年，总部坐落在具有创新“硅谷”之称的深圳高新技术产业园，拥有3万多名员工，2000年在香港主板上市（HK00751）。经过25年发展，创维已跻身世界十大彩电品牌、中国显示行业领导品牌和中国电子百强第十四位，2012年创维品牌价值达352.95亿元。', 'https://img.chinapp.com/uploadfile/pdc_pinpai/06/3mTc9MVsbs.jpg', '2020-03-30 20:31:05');
INSERT INTO `brands` VALUES (4, 0, '海信', '\n海信集团是特大型电子信息产业集团公司，成立于1969年。\n\n海信坚持“技术立企、稳健经营”的发展战略，以优化产业结构为基础、技术创新为动力、资本运营为杠杆，持续健康发展。进入21世纪，海信以强大的研发实力为后盾，以优秀的国际化经营管理团队为支撑，加快了产业扩张的速度，已形成了以数字多媒体技术、现代通信技术和智能信息系统技术为支撑，涵盖多媒体、家电、通信、智能信息系统和现代地产与服务的产业格局', 'https://img.chinapp.com/uploadfile/Pinpai/2015-07-28/14380626631191.png', '2020-03-30 20:31:16');
INSERT INTO `brands` VALUES (5, 2020033018, '康佳', '深圳市康佳视讯系统工程有限公司是康佳集团投资控股的全资子公司，成立于2001年6月份，公司注册资金1500万元。', 'https://img.chinapp.com/uploadfile/Pinpai/2015-04-29/14302779108697.jpg', '2020-03-30 20:31:32');
INSERT INTO `brands` VALUES (6, 2020033045, '海尔', '海尔集团创立于1984年，从开始单一生产冰箱起步，拓展到家电、通讯、IT数码产品、家居、物流、金融、房地产、生物制药等领域，成为全球领先的美好生活解决方案提供商。2014年，海尔全球营业额2007亿元，利润总额150亿元，利润增长3倍于收入增长，线上交易额548亿元，同比增长2391%。据消费市场权威调查机构欧睿国际（Euromonitor）的数据，2014年海尔品牌全球零售量份额为10.2%，连续六年蝉联全球大型家电第一品牌。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-19/14925933821650.gif', '2020-03-30 20:31:42');
INSERT INTO `brands` VALUES (7, 2020033055, 'iPhone苹果', 'iPhone苹果\niPhone，是苹果公司研发的智能时尚手机，它搭载苹果公司研发的iOS操作系统。第一代iPhone于2007年1月9日由苹果公司前首席执行官史蒂夫·乔布斯发布，并在同年6月29日正式发售。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930400424408.gif', '2020-04-22 04:03:54');
INSERT INTO `brands` VALUES (8, 2020033085, 'HUAWEI华为', '华为是谁？华为是全球领先的信息与通信技术(ICT)解决方案供应商，专注于ICT领域，坚持稳健经营、持续创新、开放合作，在电信运营商、企业、终端和云计算等领域构筑了端到端的解决方案优势，为运营商客户、企业客户和消费者提供有竞争力的ICT解决方案、产品和服务，并致力于使能未来信息社会、构建更美好的全联接世界。目前，华为有17万多名员工，业务遍及全球170多个国家和地区，服务全世界三分之一以上的人口。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180906/fa7d0c5b749d93081e24f8d800b791a8.gif', '2020-04-22 04:16:30');
INSERT INTO `brands` VALUES (9, 2020042793, 'ZTE中兴', '中兴通讯是全球领先的综合通信解决方案提供商。公司成立于1985年，是在香港和深圳两地上市的大型通讯设备公众公司。公司通过为全球160多个国家和地区的电信运营商和企业网客户提供创新技术与产品解决方案，让全世界用户享有语音、数据、多媒体、无线宽带等全方位沟通。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180914/289b6ef5a3b2505443db7d373a2a56ea.gif', '2020-04-27 19:06:38');
INSERT INTO `brands` VALUES (10, 2020042715, 'OPPO', 'OPPO用简单的文字来表达，就是“年轻、清新、国际化”横空出世、强势杀入\n从2006年5月12日开始，在主题为“我的音乐梦想”广告中，俊男美女在地铁中相遇，暗藏情愫，在妙曼音乐中展开一段罗曼蒂克的联想。抒情的流行乐、优雅学生气的装束，再加上满天飞舞的粉红花瓣、青树和一对璧人，这条广告几乎在短短的十几秒给我们上演了一出韩剧。在央视一、二、三套的黄金时间播出、一时间海量广告铺天盖地席卷而来。几乎一夜之间，OPPO的牌子已经家喻户晓。', 'https://img.chinapp.com/uploadfile/Pinpai/2015-08-04/14386542087109.png', '2020-04-27 19:07:24');
INSERT INTO `brands` VALUES (11, 2020042757, '一加Oneplus', '2013年12月，一个平常的日子一加降生\n\n一家由信仰不将就的人构成的公司\n\n从一开始\n\n我们就希望做点不一样的事情，去影响甚至改变这个将就的世界\n\n我们选择了智能手机作为我们实践梦想的第一步\n\n我们同样信仰这个世界上有这样一群你们\n\n热衷互联网生活、有品位、乐分享', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930400611811.gif', '2020-04-27 19:09:29');
INSERT INTO `brands` VALUES (12, 2020042718, ' VIVO', 'vivo是专为年轻、时尚的城市主流年轻群体，打造拥有卓越外观、专业级音质享受、极致影像的乐趣、惊喜和愉悦体验的智能产品，并将敢于追求极致创造惊喜作为vivo的持续追求，vivo为步步高旗下智能手机品牌。', 'https://img.chinapp.com/uploadfile/pinpai/original/20200227/762957121e165223ddc42cdd667ea1fe.png', '2020-04-27 19:10:23');
INSERT INTO `brands` VALUES (14, 2020042745, 'honor荣耀', '荣耀是华为旗下互联网手机品牌。荣耀品牌追求以更快变化来适应移动互联网时代，荣耀品牌准确认知互联网本质：平等，开放，去中心化，保持与受、观众完全对等沟通，聆听观众的呼声，为受众提供更多满足需求的高性价产品。荣耀产品遵循华为品质，追求更酷的，更极致体验。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180927/da8dda1d6ffceb2b221218b09842052b.jpg', '2020-04-27 19:12:40');
INSERT INTO `brands` VALUES (16, 2020042785, 'MI小米', '小米公司正式成立于2010年4月，是一家专注于高端智能手机、互联网电视以及智能家居生态链建设的创新型科技企业。\n“让每个人都可享受科技的乐趣”是小米公司的愿景。小米公司应用了互联网开发模式开发产品的模式，用极客精神做产品，用互联网模式干掉中间环节，致力于让全球每个人，都能享用来自中国的优质科技产品。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930338852192.gif', '2020-04-27 19:28:24');
INSERT INTO `brands` VALUES (18, 2020042790, '飞利浦PHILIPS', '飞利浦，全球医疗保健、优质生活和照明领域的领导者之一。飞利浦基于对客户需求的了解以及“精于心 简于形”的品牌承诺，将技术和设计融入到了以人为本的解决方案中。\n\n飞利浦电子是世界上最大的电子公司之一。创立百年来一直锐意创新，为世界贡献了录音卡带、CD、可重写DVD、100赫兹彩电等众多发明，在彩色电视、照明、电动剃须刀、医疗诊断影像和病人监护仪、以及单芯片电视产品领域世界领先。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180914/a66c39853e312a3451b48c8861e38909.gif', '2020-05-06 15:29:41');
INSERT INTO `brands` VALUES (20, 2020042842, 'Panasonic松下', '松下Panasonic是全球最大的电子厂商之一。Panasonic的中文为“松下”。早期叫National，1986年开始逐步更改为Panasonic，2008年10月1日起全部统一为Panasonic。\n\n松下电器由被誉为“经营之神”的松下幸之助先生创建于1918年，创立之初是由3人组成的小作坊，主营的是电灯灯座。经过几代人的努力，如今已经成为世界著名的国际综合性电子技术企业集团。松下Panasonic产品涉及家电、数码视听电子、办公产品、航空等诸多领域而享誉全球。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930333525750.gif', '2020-04-28 02:01:57');
INSERT INTO `brands` VALUES (24, 2020042873, ' Bear小熊', '广东小熊电器有限公司成立于2006年，总部设在有“小家电王国”之称的广东顺德，是集研发、生产、销售为一体的企业，为国内创意小家电领域的领军企业。\n\n公司视人才为核心竞争力，拥有经验丰富的研发团队和营销团队，骨干人员具有10多年优秀小家电企业的工作经验；主营产品为酸奶机，上市以来得到了国内外消费者的一致认可，在行业内享有“自制酸奶专家”的美誉。目前系列产品包括酸奶机、煮蛋器、营养隔水炖', 'https://img.chinapp.com/uploadfile/pinpai/original/20180928/ae856d1dcfeb774d2a2e024029983757.jpg', '2020-04-28 00:20:59');
INSERT INTO `brands` VALUES (25, 2020050665, 'Midea美的', '美的集团（SZ.000333）是一家以家电制造业为主的大型综合性企业集团，于2013年9月18日在深交所上市，旗下拥有小天鹅（SZ000418）、威灵控股（HK00382）两家子上市公司。\n\n美的是一家领先的消费家电及暖通空调系统全球性企业，提供多元化的产品种类，包括空调、冰箱、洗衣机、厨房家电、及各类小型家电。美的坚守“为客户创造价值”的原则，致力创造美好生活。美的专注于持续的技术革新，以提升产品及服务质量，令生活更舒适、更美好。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180930/282312731eb8736fe8c384f7f709e0d7.jpg', '2020-05-06 17:09:41');
INSERT INTO `brands` VALUES (26, 2020050630, 'GREE格力', '珠海格力电器股份有限公司是一家集研发、生产、销售、服务于一体的国际化家电企业，拥有格力、TOSOT、晶弘三大品牌，主营家用空调、中央空调、空气能热水器、手机、生活电器等产品。公司总部位于中国风景如画的南海滨城——珠海，在全球建有重庆、合肥、郑州、武汉、石家庄、芜湖、长沙、巴西、巴基斯坦等10大生产基地以及长沙、郑州、石家庄、芜湖、天津等5大再生资源基地，下辖凌达压缩机、格力电工、凯邦电机、新元电子、智能装备、精密模具等6大子公司，拥有7.8万多名员工，覆盖了从上游零部件生产到下游废弃产品回收的全产业链条。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930334804630.gif', '2020-05-06 17:12:04');
INSERT INTO `brands` VALUES (27, 2020050626, 'SIEMENS西门子', '自1906年第一台西门子品牌的吸尘器在德国诞生，1935年推出世界第一台可调温的自动烤箱，到1959年首次提出嵌入式厨房电器理念，西门子家电产品在德国多年稳居销量第一的家电品牌冠军宝座。在德国，西门子家电就代表着优良的品质、时尚的设计、可靠的性能。\n作为世界排名第三、欧洲排名第一的知名家电品牌，西门子家电致力于在技术、创新和设计方面引领全球，努力为消费者带来高品质的生活，其产品销售遍及40多个国家。西门子家电是行业的领跑者，体现先进的思想，追求优良的性能，满足广泛的现代生活需求。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180930/2a08f32a080db65ec3bed5fff688e386.jpg', '2020-05-06 17:12:59');
INSERT INTO `brands` VALUES (28, 2020050628, 'SUPOR苏泊尔', '浙江苏泊尔股份有限公司是中国最大、全球第二的炊具研发制造商和中国小家电领先品牌。控股股东为拥有150余年历史，在小型家用电器具和厨具行业占据全球领导地位的GroupeSEB集团。第二股东为苏泊尔集团。苏泊尔是中国炊具行业首家上市公司（股票代码：002032）。苏泊尔在全球（杭州、玉环、绍兴、武汉和越南胡志明市）建立5大研发制造基地，拥有员工10，000多名。', 'https://img.chinapp.com/uploadfile/pinpai/original/20190820/0fe81581ef2528d4206b11ecdc7d1950.gif', '2020-05-06 17:15:32');
INSERT INTO `brands` VALUES (29, 2020050697, 'ROBAM老板', '始创于1979年的老板电器（股票代码：002508），是中国厨房电器行业的领导者，也是迄今为止历史最悠久的专业厨房电器品牌。从缔造中国第一代吸油烟机，到今天，已有超过3500万户家庭正享受着老板电器带来的轻松烹饪生活。在吸油烟机市场，全国销量前茅的成绩，老板已成为吸油烟机在中国的代名词。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180927/53fd71662083e6460e3355f23c0b3d35.jpg', '2020-05-06 21:38:39');
INSERT INTO `brands` VALUES (30, 2020050688, 'Vatti华帝', '华帝股份有限公司自1992年创立至今，专注厨电领域24年，始终以产品创新为企业战略重心，在新时代厨电变革的浪潮下，华帝积极打造中国民族品牌的全球化之路，从一家立足于珠三角经济区的小型乡镇企业，稳步成长为全国知名的上市企业。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-19/14925933779020.gif', '2020-05-06 21:42:08');
INSERT INTO `brands` VALUES (31, 2020050693, 'Fotile方太', '方太集团（以下简称“方太”）创建于1996年。二十一周年来忠于初心，始终专注于高端嵌入式厨房电器的研发和制造，致力于为追求高品质生活的人们提供无与伦比的高品质产品和服务，打造健康环保有品位有文化的生活方式，让千万家庭享受更加幸福安心的生活。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180927/6c48f235d8867f0d8225bcddaeb58b58.jpg', '2020-05-06 21:42:34');
INSERT INTO `brands` VALUES (32, 2020050627, 'Joyoung九阳', '九阳，豆浆机行业的开创者和领导者。1994年，全世界第一台全自动家用豆浆机在九阳问世。今日，九阳已经成为豆浆机的代名词。累计拥有豆浆机工艺上的20多项国家专属专利。近年来，九阳更是不断领导着豆浆机的技术革新，全面超越现有制浆工艺，蔚然成风。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930355289545.gif', '2020-05-06 21:43:29');
INSERT INTO `brands` VALUES (33, 2020050652, 'A.O.史密斯', '艾欧史密斯（中国）热水器有限公司，是美国A.O.史密斯公司在1998年投资成立的位于南京经济技术开发区的独资公司，包括新启用的全球超级产研基地，总投资额1.8亿美元。A.O.史密斯已经在中国建立了完善的研发、生产、销售及服务一体化的现代化管理体系，产品跨家用、商用两大领域：家用产品包括电热水器、燃气热水器、空气源热泵热水器、太阳能热水器、家庭中央热水、家庭采暖、净水机、家庭中央净水、空气净化器、软水机十大品类，商用产品包括热水炉、热水锅炉、净水机三大品类。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-19/14925933631562.gif', '2020-05-06 21:44:01');
INSERT INTO `brands` VALUES (34, 2020052012, '安吉尔', '深圳安吉尔饮水产业集团有限公司是中国创建最早的饮水设备研究与开发、制造及销售专业公司之一，从1992年第一台安吉尔净水机到现在，产品已涵盖了饮水机、饮水专用净水器、净水设备、管线饮水机、袋装水饮水机、袋装水包装设备、商务工程设备等。\n\n安吉尔的崛起，才使饮水机真正成为一个产业，也因此奠定了安吉尔的行业领头羊的地位。公司从1995年—2006年，连续11年销售量保持同行业第一，曾位居深圳工业百强企业之列。', 'https://img.chinapp.com/uploadfile/2012/0510/20120510052517756.png', '2020-05-20 12:01:39');
INSERT INTO `brands` VALUES (35, 2020052054, '艾美特', '艾美特于1973年创始于台湾，其品牌名称源于空气良伴(Airmate)，长期专注于空气品质改善类家用电器产品，创业初期以电风扇的制造与出口贸易为主。凭着品质至上的敬业态度与务实创新兼具的研发精神，艾美特不断茁壮与成长。自1997年起更专注于拓展中国市场自有品牌的发展，经过多年的市场深耕，艾美特深入中国各地，更跨足电暖器与健康小家电等新产品领域。艾美特于2013年3月成功在台湾挂牌上市，并于2014年5月签约设立艾美特九江小家电产业园。', 'https://img.chinapp.com/uploadfile/Pinpai/2015-04-28/14302022309822.jpg', '2020-05-20 12:02:23');
INSERT INTO `brands` VALUES (36, 2020052075, '统帅', '统帅是海尔集团继海尔、卡萨帝之后的第三个子品牌，是海尔集团在互联网时代背景下推出的定制家电品牌。1998年，统帅品牌作为海外行销平台出口欧洲市场，2011年，统帅以“定制家电品牌”全新定位亮相。', 'https://img.chinapp.com/uploadfile/pdc_pinpai/29/pENCf49CNK.jpg', '2020-05-20 12:03:13');
INSERT INTO `brands` VALUES (37, 2020052067, '云米', '今日，一直致力于为家庭提供安全、智能的全屋互联网家电解决方案的云米推出了新款空调——云米互联网变频空调Milano，它搭载了原装松下压缩机，不仅持久耐用还具备超一级能效，并在噪音控制、高效制冷制热、自清洁能力、智能互联等方面具备一定竞争优势。眼看夏季即将来临，如果你刚好想换掉老空调，让家里重获干爽清凉的宜居环境，那么不要错过云米这款功能全面，质量过硬的互联网变频空调Milano。', 'https://img.chinapp.com/uploadfile/pinpai/original/20200424/aa5790026707c624f5c0da549a382bc0.jpg', '2020-05-20 12:04:24');
INSERT INTO `brands` VALUES (38, 2020052047, '小天鹅', '佛山金天鹅陶瓷有限公司旗下品牌小天鹅瓷砖专业供应工程瓷砖13年，企业实力雄厚，引进意大利先进的陶瓷设备，数万平方的物流仓储中心，建立了比欧洲标准和国家标准更为严格的企业内控标准，产品规格齐全、花色新颖时尚，全方位满足不同层次的需求。小天鹅提供的产品均通过了ISO9001质量管理体系认证,ISO14001环境管理体系认证和中国环境标志产品认证。', 'https://img.chinapp.com/uploadfile/pinpai/original/20200110/fcdbe6a23eaa29492150fd8dee5796b9.jpg', '2020-05-20 12:05:30');
INSERT INTO `brands` VALUES (39, 2020052059, '美菱', '合肥美菱股份有限公司是国内知名的电器制造商，拥有合肥、绵阳和景德镇三大冰箱（柜）制造基地，以及冰箱、冷柜、洗衣机等多条产品线。公司主导产品美菱冰箱在业内较为有名。\n\n1983年，美菱走上专业制造家用电冰箱的道路，标志着一个享誉全国品牌的诞生，美菱成为了家喻户晓、响彻大江南北的一个名字。30余年来，美菱始终坚持“自主创新，中国创造”，一直矢志不移地专注制冷行业，以技术创新和产品创新精心打造企业核心竞争力。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180927/687feae9bfa384cc350c08380128ca52.jpg', '2020-05-20 12:08:16');
INSERT INTO `brands` VALUES (40, 2020052071, 'AUX奥克斯', '始创于1986年的奥克斯集团，产业涵盖电力、家电、医疗、地产、金融等领域，位列2016中国企业500强第229位。\n\n全球领先的智能配用电系统整体解决方案提供商\n\n电力，是集团发展的摇篮产业，旗下三星医疗电气（601567.SH）是全球领先的智能配用电系统整体解决方案提供商。主营业务涵盖智能配电、智能用电、能效及运维。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930334639060.gif', '2020-05-20 12:09:58');
INSERT INTO `brands` VALUES (41, 2020052078, '卡萨帝', '卡萨帝，海尔集团旗下品牌，是源自意式优雅的国际高端艺术家电和嵌入一体化橱电品牌，她经过全球8个研发中心、28个合作研发机构（如麻省理工等）、300多位设计师（来自意大利、英国、德国、法国、美国、日本、中国等12个国家）的倾力研发设计，经过全球29个制造基地200多位工程人员5年的努力，于2007年9月20日在中国面世。', 'https://img.chinapp.com/uploadfile/pdc_pinpai/04/5OrKzO58Fw.jpg', '2020-05-20 12:11:34');
INSERT INTO `brands` VALUES (42, 2020052051, '红米Redmi', '小米公司在2013年7月推出的全新手机产品线，主打性价比，2019年官方宣布“红米Redmi”成独立品牌\n\n红米是小米在2013年7月推出的全新产品线，2019年，小米公司宣布“红米Redmi”成独立品牌。', 'https://img.chinapp.com/uploadfile/spider_img/2019-07-03/1562166152.gif', '2020-05-20 12:12:24');
INSERT INTO `brands` VALUES (43, 2020052049, '华凌HL', '山东华凌电缆有限公司，成立于1997年，位于济南市经十东路圣井高科技园，是一个集电线电缆的研发、生产、销售、安装、服务于一体的企业。公司注册资本2亿元，80余套国内全自动生产线，40多套国际检测设备，具有国内外电子加速器。', 'https://img.chinapp.com/uploadfile/spider_img/2019-07-04/1562238451.gif', '2020-05-20 12:13:14');
INSERT INTO `brands` VALUES (44, 2020052070, '能率', '能率NORITZ，1951年诞生于日本神户，其创始人及终身名誉社长即是在全球燃气具及温水文化领域备受尊崇的著名燃气具专家、企业家、财富人生英雄榜嘉宾、\"近代燃气具之父\"太田敏郎先生。能率集团的母公司\"日本国能率株式会社\"。', 'https://img.chinapp.com/uploadfile/pdc_pinpai/39/ODY90vsTaX.jpg', '2020-05-20 12:14:04');
INSERT INTO `brands` VALUES (45, 2020052065, '阿诗丹顿USATON', '双胆速热电热水器专家，以电热水器/吸油烟机/集成环保灶/浴霸等系列产品为主，集研发、制造、销售和服务为一体的科技型企业\n广东阿诗丹顿电气有限公司是一家立足于科技、节能、环保的家电企业，于2003年在中国家电产业生产基地广东省中山市建立大规模的家电制造基地，专业于研发、生产、销售电热水器、烟机、灶具、保洁柜、碗柜灶和净水器等家用厨卫电器，是集产品专业研发、制造、销售和服务为一体的大规模的实业公司', 'https://img.chinapp.com/uploadfile/spider_img/2019-07-03/1562133667.gif', '2020-05-20 12:15:59');
INSERT INTO `brands` VALUES (46, 2020052009, '飞科', '飞科公司创建于1999年，历经10多年的跨越式发展,现已成为一家以“研发设计”和“品牌运营”为核心竞争力，集剃须刀及个人护理电器研发、制造、销售于一体的企业。飞科公司现拥有100多项自主创新专利；是剃须刀行业国家标准制订单位。是中国剃须刀行业公认的第一品牌。', 'https://img.chinapp.com/uploadfile/Pinpai/2015-04-04/14281536807969.jpg', '2020-05-20 12:17:22');
INSERT INTO `brands` VALUES (47, 2020052020, 'Vanward万和', '万和是国内A股上市公司，股票代码002543，公司成立于1993年8月，已发展成为国内热水器、厨房电器、热水系统专业制造龙头企业，在顺德、中山、高明、合肥等地拥有七大生产制造基地，占地面积超过100万平方米，年产能超过1500万台。据世界权威独立调研机构英国建筑服务研究与信息协会（BSRIA）发布的调研结果，万和是国内仅有的两个“全球十大热水器品牌”之一。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180928/fd15b9135f5bb9ba852aaec2cf5488f8.jpg', '2020-05-20 12:27:03');
INSERT INTO `brands` VALUES (48, 2020052036, ' 万家乐', '广东万家乐股份有限公司，始创于1988年，燃气热水器标准主要起草单位，专业研发/生产/销售燃气热水器/燃气灶具等产品的高新技术企业。\n\n万家乐是一家专业从事清洁能源（燃气）和可再生能源高效利用，以科技、节能、环保、时尚为核心价值的低碳型企业。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180928/2c8a15c382258bed7238cc6202521b2c.jpg', '2020-05-20 12:26:58');
INSERT INTO `brands` VALUES (49, 2020052027, 'SHARP夏普', '日本电子巨头（Sharp）夏普，被冠以“世界液晶之父”：发明了全球第一台液晶显示计算机、液晶电视、液晶摄录像机，也是苹果显示面板重要供应商之一。\n\n夏普的历史是从创始人早川德次先生1912年在东京创立金属加工业开始的。1915年早川先生发明了名为“Ever-ReadySharpPencil”的金属活芯铅笔，这在当年可谓风靡一时。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930333573553.gif', '2020-05-20 12:27:40');
INSERT INTO `brands` VALUES (50, 2020052079, 'Goldlion金利来', '金利来，男人的世界。发端于香港，从领带起步兢兢业业，不懈追求三十余年，金利来打造了一个中国品味男人的品牌。作为中国35-45岁社会中坚男士的首选品牌，金利来自创立伊始，就以“经典与创新”为核心概念，立志成为“男人世界”里独树一帜的品牌。', 'https://img.chinapp.com/uploadfile/pinpai/original/20190718/6bff3b946a47da5ea9f910911df172a1.gif', '2020-05-20 12:30:44');
INSERT INTO `brands` VALUES (51, 2020052058, '倍轻松', '深圳市倍轻松科技股份有限公司（以下简称“倍轻松”），成立于2000年，集研发、生产、销售于一体，是便捷式按摩产品的国家高新技术企业。经过14年的持续发展，成长为便携式健康护理行业的领导品牌。  \n\n公司的品牌为“倍轻松（breo®）”。公司产品分为头部、眼部、颈部、手部、MINI等系列产品，由公司科研人员根据传统的中医经络学按摩原理，结合现代科学技术自行研制而成', 'https://img.chinapp.com/uploadfile/pdc_pinpai/55/05eFOLypkj.jpg', '2020-05-20 12:31:25');
INSERT INTO `brands` VALUES (52, 2020052029, '新科', '常州市新科汽车电子有限公司成立于2008年，是一家从事汽车导航和卫星通信设备开发和制造的高科技企业，位于江苏省常州市新北区。\n\n新科汽车电子拥有出色的生产设备、严格的管理流程及高素质的管理人员和技术熟练的员工，产品得到了广大客户的认可，成为各行业大型公司的合格供应商。', 'https://img.chinapp.com/uploadfile/spider_img/2019-07-03/1562171738.gif', '2020-05-20 12:32:00');
INSERT INTO `brands` VALUES (53, 2020052093, '科龙', '海信科龙电器股份有限公司是中国最大的白电产品制造企业之一，创立于1984年，总部位于中国广东顺德，主要生产冰箱、空调、冷柜和洗衣机等系列产品。1996年和1999年，公司股票分别在香港和深圳两地发行上市。\n\n1996年，海信凭借变频技术高起点进入空调产业;2002年，海信通过并购北京雪花进入冰箱业;2006年底，海信成功收购科龙电器，由此诞生了中国白色家电的新航母——海信科龙。', 'https://img.chinapp.com/uploadfile/Pinpai/2015-08-03/14385832769825.png', '2020-05-20 12:32:35');
INSERT INTO `brands` VALUES (54, 2020052062, 'Pioneer先锋', '先锋电子（中国）投资有限公司是2001年4月16日由日本先锋株式会社出资成立。是日本先锋株式会社在中国、香港地区所投资的包括销售、研发、生产领域的14家公司之一。\n\n先锋中国是先锋品牌在中国地区的统括公司，负责中国地区的统括业务及先锋相关产品的销售业务。本着\"与更多人分享感动\"的企业精神，不断推出高性能产品，努力创造永恒的视听奇迹，成为全球娱乐领域中的领航先锋。', 'https://img.chinapp.com/uploadfile/Pinpai/2017-04-24/14930341075918.gif', '2020-05-20 12:33:25');
INSERT INTO `brands` VALUES (55, 2020052017, '容声', '海信科龙电器股份有限公司是中国最大的白电产品制造企业之一，创立于1984年，总部位于中国广东顺德，主要生产冰箱、空调、冷柜和洗衣机等系列产品。1996年和1999年，公司股票分别在香港和深圳两地发行上市。\n\n1996年，海信凭借变频技术高起点进入空调产业;2002年，海信通过并购北京雪花进入冰箱业;2006年底，海信成功收购科龙电器，由此诞生了中国白色家电的新航母——海信科龙。', 'https://img.chinapp.com/uploadfile/2010/1228/20101228045846755.jpg', '2020-05-20 12:34:52');
INSERT INTO `brands` VALUES (56, 2020052072, '酷风coolfree', '酷风，创立于2017年，隶属于美的集团股份有限公司的品牌，Coolfree酷风家用中央空调以“臻于心静界，舒适新居所”为产品目标，以“我行我酷，舒适有度”为品牌主张，以严苛的品质、人性化设计、智能化产品、贴心化服务，为“轻中产”人士提供自己的舒适新居所。', 'https://img.chinapp.com/uploadfile/pinpai/original/20191212/5d91799c830b2.jpg', '2020-05-20 12:35:48');
INSERT INTO `brands` VALUES (57, 2020052061, '博世', '博世电动工具是全球领先的电动工具及附件生产商，其产品在品质、技术革新及售后服务方面一直保持高标准。现在，博世电动工具的产品主要包括5大类：手持式电动工具，台式电动工具，测量工具，园林工具和电动工具附件。\n\n博世电动工具(中国)有限公司成立于1995年，总部座落于浙江省杭州市,当时名为杭州博世电动工具有限公司，是博世与杭州汽轮动力集团有限公司以及中国的销售合作伙伴美最时洋行（不来梅）的合资企业。2003年，博世购买了合资伙伴杭州汽轮动力集团在合资企业的股份，成为外商独资企业。', 'https://img.chinapp.com/uploadfile/pinpai/original/20191125/d52f26a81482fb6d14460e3b1fa9da56.jpg', '2020-05-20 12:36:32');
INSERT INTO `brands` VALUES (58, 2020052042, '火星人Marssenger', '浙江火星人厨具有限公司，知名（著名）集成灶品牌，集成水槽知名品牌，中国健康厨房领航品牌，以厨房电器研发、制造和销售为核心业务的现代化科技企业。\n      浙江火星人厨具有限公司是以厨房电器研发、制造和销售为核心业务的现代化科技企业，总投资逾亿元，打造产业航母。公司对传统抽油烟技术进行革新，研发出“厨房油烟净化率高达99.95%”的革命性产品——“火星人无烟灶”，并获得多项国家专利。', 'https://img.chinapp.com/uploadfile/pinpai/original/20191211/bl-fWCwdMJZr5.gif', '2020-05-20 12:37:35');
INSERT INTO `brands` VALUES (59, 2020052022, 'Rinnai林内', '林内集团成立于1920年，拥有90多年的历史，是世界家用燃气具生产企业中最强大的集团公司之一。目前，在全球17个国家和地区设有29家生产或销售子公司，消费者遍布多个国家和地区。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180928/7fbbe260e8464d8d9c3dc4331992f0b0.jpg', '2020-05-20 12:38:20');
INSERT INTO `brands` VALUES (60, 2020052085, '四季沐歌', '四季沐歌集团成立于2000年，2012年5月21日于沪市A股主板上市（股票代码：603366），是全球新能源热利用领军企业、中国航天事业合作伙伴。\n\n2013年，企业立足“升级转型”战略，以消费者需求为中心、以光热业务为基础，实现品牌延伸。企业经营范围涉及：太阳能、空气能、厨房电器、净水器、五金卫浴等产品的研发、生产制造、销售及服务', 'https://img.chinapp.com/uploadfile/pinpai/original/20181008/0305bd6488ef8cb5e988a58279175fe0.jpg', '2020-05-20 12:39:22');
INSERT INTO `brands` VALUES (61, 2020052068, 'Changhong长虹', '长虹创始于1958年，公司前身国营长虹机器厂是我国“一五”期间的156项重点工程，是当时国内唯一的机载火控雷达生产基地。从军工立业、彩电兴业，到信息电子的多元拓展，已成为集军工、消费电子、核心器件研发与制造为一体的综合型跨国企业集团，并正向具有全球竞争力的信息家电内容与服务提供商挺进。', 'https://img.chinapp.com/uploadfile/pinpai/original/20180928/138c3d7c4c5ae1c3608849f2fe793363.jpg', '2020-05-20 12:39:52');
INSERT INTO `brands` VALUES (66, 204551, '', '', '', '2020-10-15 19:57:25');
INSERT INTO `brands` VALUES (70, 205716, '佳能', '佳能公司是以光学为核心的相机与办公设备制造商,始终以创造世界一流产品为目标,积极推动事业向多元化和全球化发展', 'http://www.canon.com.cn/Public/Front/images/logo1.png', '2020-10-27 20:33:17');
INSERT INTO `brands` VALUES (71, 205775, '中雀', '辅导费挖方芹儿', 'https://img.chinapp.com/uploadfile/pinpai/original/20190830/3432cfaf5b3101456dc00b3f8770cadf.jpg', '2020-10-27 20:39:08');
INSERT INTO `brands` VALUES (72, 20310218, '酷酷酷', '酷酷酷', '酷酷酷', '2020-11-02 21:46:49');
INSERT INTO `brands` VALUES (73, 20310294, '哈哈哈', '哈哈哈', '哈哈哈', '2020-11-02 21:47:50');
INSERT INTO `brands` VALUES (74, 20310366, '', '', '', '2020-11-03 11:09:03');
INSERT INTO `brands` VALUES (75, 20310303, '冰箱', '', '13231', '2020-11-03 11:11:18');

-- ----------------------------
-- Table structure for cart
-- ----------------------------
DROP TABLE IF EXISTS `cart`;
CREATE TABLE `cart`  (
  `car_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户表id',
  `goods_id` bigint(255) NULL DEFAULT NULL COMMENT '商品id',
  `quantity` int(11) NULL DEFAULT NULL COMMENT '数量',
  `checked` int(11) NULL DEFAULT NULL COMMENT '是否选择,1=已勾选,0=未勾选',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`car_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '购物车信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of cart
-- ----------------------------
INSERT INTO `cart` VALUES ('1231321', '4142', 41234124, 21, 1, '2020-10-14 19:44:11', '2020-10-28 19:44:14');

-- ----------------------------
-- Table structure for classfiy
-- ----------------------------
DROP TABLE IF EXISTS `classfiy`;
CREATE TABLE `classfiy`  (
  `classfiy_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL DEFAULT '' COMMENT '二级分类编号',
  `classfiy_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类名称',
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '二级分类图片地址',
  `parent_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '父编号',
  `is_show` tinyint(4) NULL DEFAULT 1 COMMENT '是否显示',
  `update_time` datetime NULL DEFAULT NULL COMMENT '最后更新时间',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `data_flag` int(5) NOT NULL DEFAULT 1 COMMENT '数据有效性(1:有效;0:无效)',
  PRIMARY KEY (`classfiy_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci COMMENT = '商品分类信息表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of classfiy
-- ----------------------------
INSERT INTO `classfiy` VALUES ('0cbfaf8776f944c88b73f872c0dfff6d', '电炖锅', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/9c47da2b5878abb23ef4f8b7196746c9.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:54:12', 1);
INSERT INTO `classfiy` VALUES ('1495161b1642471da9052e07c10626b2', '厨卫电器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, '2021-01-04 15:02:24', '2020-11-04 21:19:46', 1);
INSERT INTO `classfiy` VALUES ('1df4cfbe922d4b3bb72549596e51bee3', '油烟机', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/afbc0117de7f5474b8eb4f4566305d83.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:32', '2020-11-04 21:23:47', 1);
INSERT INTO `classfiy` VALUES ('217ffa8aa854481bbaf0af1c2331de8a', '电视配件', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/e57e4f65de8003497172b51264b86ee3.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-05 14:41:53', 1);
INSERT INTO `classfiy` VALUES ('2aa03f5811d04fa7ae1e2b6a6ff1be12', '空调', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/b9142edd2233c79ceb051b36ed3b9648.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-04 20:30:24', 1);
INSERT INTO `classfiy` VALUES ('31aad2f03d2047359687066b00fdc561', '烤箱', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a736f29cc7e0aa17d48b50d490b0d4fd.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:56:55', 1);
INSERT INTO `classfiy` VALUES ('3b162f950142475cb1e5e6e7276eec20', '微波炉', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/38d918ba4d68ccb63dddcd53fe799820.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:56:07', 1);
INSERT INTO `classfiy` VALUES ('402ca224fc3046dfadafab8acb6c1383', '美发器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/efdb5b4a21b2cdd3d3ccc68d9678498e.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, NULL, '2020-11-04 21:26:03', 1);
INSERT INTO `classfiy` VALUES ('42f58bea09c542668476daade54e59ff', '电视机', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/7e1da0e85fafd3771c85ad49899c782e.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, '2020-11-04 20:29:57', '2020-11-04 20:29:48', 1);
INSERT INTO `classfiy` VALUES ('52beaaeecc5740afa6f2d34ae0c8e569', '空气炸锅', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/42dc9d139f267dba8d3cce5247f4d5e3.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:55:08', 1);
INSERT INTO `classfiy` VALUES ('52ec3b18124544bd81938884bedc9d65', '电饼铛', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/e1808e278d9e65ab2643057bf9269920.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:56:26', 1);
INSERT INTO `classfiy` VALUES ('54794f27df714f12a3f5b3c12b09afe3', '足浴盆', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/9163b0d5c88bcd7900355f43c614f998.jpg', 'd831c15843324685bf590e50593e29de', 1, NULL, '2020-11-04 21:27:28', 1);
INSERT INTO `classfiy` VALUES ('54ed6658027d48a2a2a7c09ba4c731d1', '大家电', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 20:29:24', 1);
INSERT INTO `classfiy` VALUES ('56c4673bde744c24b554d179fc2a0eb8', '饮水机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/37efb44bdc1a8f7e20f042dd5331c884.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 15:01:25', 1);
INSERT INTO `classfiy` VALUES ('58c9eb61bb4d45dabf176459a6a686ec', '扫地机器人', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/2789cc02b5b1976f62de9a4ea2dc5559.jpg', '78a42fe69e23442fbe5b1e1d0a70a42a', 1, NULL, '2020-11-04 21:29:41', 1);
INSERT INTO `classfiy` VALUES ('5eda6cd5aded4d10bcb178ddb22d5601', '迷你音响', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/4fec74dd7d1c5d47b14b9838a1b68bc3.jpg', '85af141a065f4f36b574badf12e1a9b5', 1, NULL, '2020-11-05 14:44:08', 1);
INSERT INTO `classfiy` VALUES ('679e3f20d70e4e078506dcf408e80d07', '个人护理', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 21:21:07', 1);
INSERT INTO `classfiy` VALUES ('67f08f2c5b5543da8b3abece4248168f', '消毒柜', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/d52a0da68cf6769fdc456ba623248d96.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:34', '2020-11-05 14:52:46', 1);
INSERT INTO `classfiy` VALUES ('6838bc558dc34fcb89fad7afeae91151', '吸尘器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/442fac0f673f29e616edd4e7aa199884.jpg', '78a42fe69e23442fbe5b1e1d0a70a42a', 1, NULL, '2020-11-04 21:29:26', 1);
INSERT INTO `classfiy` VALUES ('74fa8f2018c442bc8db4f5b6c9f8f9f0', '热水器', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/2448566c77af2cd9f57b7eecc340d375.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:37', '2020-11-05 14:49:17', 1);
INSERT INTO `classfiy` VALUES ('75127e9a544c44e5a72e5b11147af28c', '洗衣机', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/345d280dc5000db654c1ba4f4f2150d5.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-04 20:30:44', 1);
INSERT INTO `classfiy` VALUES ('7570e6a1ec184b0d88e8f13a22d94d36', '电热水龙头', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bded0ca6a5aa333b3edd8effc241f47d.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:37', '2020-11-05 14:49:34', 1);
INSERT INTO `classfiy` VALUES ('7673610ffbc04f28b32a10e68399d25c', '酸奶机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bc9cb2c66c013abcc19108bfded672b9.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:59:19', 1);
INSERT INTO `classfiy` VALUES ('78a42fe69e23442fbe5b1e1d0a70a42a', '生活家电', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 21:20:38', 1);
INSERT INTO `classfiy` VALUES ('7c92fedc733a4abea346705e137ae2f7', '电暖器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/deeeadeeea95003b91b18b52630adb85.jpg', '78a42fe69e23442fbe5b1e1d0a70a42a', 1, NULL, '2020-11-04 21:28:56', 1);
INSERT INTO `classfiy` VALUES ('7d8133267e7a4084a63ccd61d8443236', '冷冻柜', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/f1799fe638fa224adeec4b48c78d5b48.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-05 14:40:41', 1);
INSERT INTO `classfiy` VALUES ('8172b771809e4c5ba2e8aaa5537ca1bf', '按摩器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/de1b8a3e7d46aeeb54651f8c5b77c1a7.jpg', 'd831c15843324685bf590e50593e29de', 1, NULL, '2020-11-04 21:27:44', 1);
INSERT INTO `classfiy` VALUES ('85af141a065f4f36b574badf12e1a9b5', '影音家电', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 21:19:18', 1);
INSERT INTO `classfiy` VALUES ('88dc8dd4c6cc4557bc8ad29ff008f127', '电子秤', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/e5bcb4b5a6324af7327688a0f6d0c744.jpg', 'd831c15843324685bf590e50593e29de', 1, NULL, '2020-11-04 21:28:11', 1);
INSERT INTO `classfiy` VALUES ('8930443b88d44527a86f89177f7d235d', '家庭影院', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/329351b77d16b4af658abb088ace71d3.jpg', '85af141a065f4f36b574badf12e1a9b5', 1, NULL, '2020-11-05 14:43:02', 1);
INSERT INTO `classfiy` VALUES ('97e728b961fd4dfdb02b4f497ed2d14a', '影音线材', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/19237806dbb28e648a26f30910e77954.jpg', '85af141a065f4f36b574badf12e1a9b5', 1, NULL, '2020-11-05 14:44:46', 1);
INSERT INTO `classfiy` VALUES ('9a8168c76d364f1d93d15a5175a2bb4a', '豆浆机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/c7f11517f085d10f868d4c85e609c670.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:58:06', 1);
INSERT INTO `classfiy` VALUES ('9d44a9afc308483ab1ea94507f2dce58', '洗碗机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/cf6534bd66cd795a2c061a3046b35f3e.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:39', '2020-11-05 14:51:39', 1);
INSERT INTO `classfiy` VALUES ('a5d85a79c46946f299c1141419e5eb37', '电火锅', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a9a462a8bb0c2e7abb83ba3702abc5ee.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:53:52', 1);
INSERT INTO `classfiy` VALUES ('a5f74f6d14ed465b9d46e14bf1fe489e', '电动牙刷', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/343845fa72f3707e42e876fe59dec9ca.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, NULL, '2020-11-04 21:24:59', 1);
INSERT INTO `classfiy` VALUES ('a6b9953d5d0e4a34b15d48d3ff85d995', '料理/榨汁机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/79f41c69b04f0c539c93417d67146a87.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:58:52', 1);
INSERT INTO `classfiy` VALUES ('aed4b94a688d451ca0d29a105c7d4efa', '咖啡机', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/6afb79b3c25cd0758b0739009f0af5d1.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:59:40', 1);
INSERT INTO `classfiy` VALUES ('b2d36e69e6db46afa2597898da2ff9e4', '电压力锅', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/b4b11ea0c4535043186b5f0738c71988.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:53:33', 1);
INSERT INTO `classfiy` VALUES ('bb811b8c13324fd69f49dbac27a9cd65', '集成灶', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/a3419822b356f702333ccefb85435ee6.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:39', '2020-11-05 14:47:14', 1);
INSERT INTO `classfiy` VALUES ('c04c663c99d54ef9bc62766e49c8a375', '冰箱', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/4657016fb4cf2fcc91abad42363c7e5e.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-05 14:39:40', 1);
INSERT INTO `classfiy` VALUES ('c58693e750324fe5bd0a0e585ac68eab', '美容仪', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/e44e19767e7b82576b1fb3ed688eb9e8.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, '2020-11-05 15:19:03', '2020-11-04 21:25:36', 1);
INSERT INTO `classfiy` VALUES ('c80a4ce7b2214ccaa59e4fdd3928b050', '浴霸', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/bf9c39bb8439f8e80e1ebe37091143a9.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:40', '2020-11-05 14:50:01', 1);
INSERT INTO `classfiy` VALUES ('ced40b390277455b8f3d920819901242', '电吹风', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/c514a2af81afcd9db29989851e4fa9f9.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, NULL, '2020-11-04 21:24:11', 1);
INSERT INTO `classfiy` VALUES ('cfec652eaa074a94892f6ea6edf064ae', '脱毛器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/76eb5d881b097506e9700f075e266de9.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, NULL, '2020-11-04 21:25:16', 1);
INSERT INTO `classfiy` VALUES ('d831c15843324685bf590e50593e29de', '健康生活', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 21:21:33', 1);
INSERT INTO `classfiy` VALUES ('d83a9790f7eb4cdd9407102d71c0bf7a', '电水壶', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/8b970f2fadcf3b431cac39638abeb2b0.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 15:00:27', 1);
INSERT INTO `classfiy` VALUES ('dacd7b1a0799458785974481a7d1f126', '电饭煲', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/5ae22f9297facb1a60d5c8180d6d5c15.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-04 21:27:04', 1);
INSERT INTO `classfiy` VALUES ('dbaa9f8eadaa422096969166fae84509', '空气净化器', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/aed402153696094c835d0efd061b09d7.jpg', '78a42fe69e23442fbe5b1e1d0a70a42a', 1, NULL, '2020-11-04 21:28:36', 1);
INSERT INTO `classfiy` VALUES ('dc58a44d4bc74a94ace268ada1bb081b', '净水器', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/cda2116ad044b5a59569eb1849d01e32.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 15:01:52', 1);
INSERT INTO `classfiy` VALUES ('e2d23d3545a240a493179f8e2e4f4608', '养生壶/煎药壶', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/dc2cbac87fd68c918cddd6ff23462c13.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 15:00:49', 1);
INSERT INTO `classfiy` VALUES ('ef97eb8c10144738a70d84c71e8c2ef4', '电磁灶', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/b7c311934d9eaa7cd1be85afce98a73c.jpg', '1495161b1642471da9052e07c10626b2', 1, '2020-11-16 18:53:41', '2020-11-05 14:47:42', 1);
INSERT INTO `classfiy` VALUES ('fd604b34842b4d3e8c40830a96a0d7f7', '酒柜', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/ef91f399eb8908fca3bdc0371b96f355.jpg', '54ed6658027d48a2a2a7c09ba4c731d1', 1, NULL, '2020-11-05 14:41:11', 1);
INSERT INTO `classfiy` VALUES ('fda21412a49f4dd39e499d7f14408396', '电磁炉', 'http://127.0.0.1:9200/api-file/statics/2020/11/05/b7c311934d9eaa7cd1be85afce98a73c.jpg', 'ff9b2f1c74c5477691b5d26f8379878f', 1, NULL, '2020-11-05 14:55:20', 1);
INSERT INTO `classfiy` VALUES ('ff505400b5c744d3acfd51add77562c8', '剃须刀', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/a4bd1f1ab3a3a54cdadd0491e40f5220.jpg', '679e3f20d70e4e078506dcf408e80d07', 1, '2020-11-04 21:26:16', '2020-11-04 21:24:43', 1);
INSERT INTO `classfiy` VALUES ('ff9b2f1c74c5477691b5d26f8379878f', '厨房小家电', 'http://127.0.0.1:9200/api-file/statics/2020/11/04/028ef3eb083f2d66d0d913322bbdff74.jpg', '0', 1, NULL, '2020-11-04 21:20:21', 1);

-- ----------------------------
-- Table structure for evaluate
-- ----------------------------
DROP TABLE IF EXISTS `evaluate`;
CREATE TABLE `evaluate`  (
  `id` int(30) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `order_id` bigint(255) NOT NULL,
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,
  `goods_id` bigint(255) NOT NULL,
  `img_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品图片',
  `evaluate` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品评论',
  `score` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品评分',
  `transportation_score` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '运输评分',
  `service` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '服务评分',
  `data_flag` int(10) NULL DEFAULT 1 COMMENT '删除标志1：有效0：无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for goods
-- ----------------------------
DROP TABLE IF EXISTS `goods`;
CREATE TABLE `goods`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `goods_id` bigint(20) NULL DEFAULT NULL,
  `goods_introduce` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品介绍',
  `page_price` decimal(10, 0) NULL DEFAULT NULL,
  `purchase_price` decimal(10, 0) NULL DEFAULT NULL,
  `goods_model` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品型号',
  `goods_img` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '商品图片',
  `page_url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '页面链接',
  `promotion_time` date NULL DEFAULT NULL COMMENT '促销时间',
  `classfiy_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '分类编号',
  `brands_id` int(11) NULL DEFAULT NULL COMMENT '品牌编号',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `is_sale` int(11) NOT NULL DEFAULT 1 COMMENT '是否上架',
  `is_hot` int(11) NOT NULL DEFAULT 0 COMMENT '是否热销',
  `visit_num` int(11) NULL DEFAULT NULL COMMENT '浏览量',
  `appraise_num` int(11) NULL DEFAULT NULL COMMENT '评论量',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE,
  INDEX `brands_id`(`brands_id`) USING BTREE,
  INDEX `classfiy_id`(`classfiy_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 601 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of goods
-- ----------------------------
INSERT INTO `goods` VALUES (1, 5026592, '容声(Ronshen) 252升 三门冰箱 电脑中控 风冷变频 抗菌 BCD-252WD11NPA 【能效升级 随机发货】 ', 2299, 2299, '', 'https://m.360buyimg.com/mobilecms/jfs/t1/109406/24/5199/26285/5e34efa2E8eb88592/4cd041a7d82aef88.jpg', 'https://item.jd.com/5026592.html', '2020-11-03', '6847c43c8f43449b9aacb2923abfcb92', 2020052017, '2020-10-16 18:00:06', 1, 0, 7505, 7860);
INSERT INTO `goods` VALUES (2, 100011006352, '苏泊尔 (SUPOR) 家用智能电压力锅 双胆球釜压力煲 特有低温烹饪功能 开盖收汁 SY-50FC9057Q 5L高压锅 ', 429, 429, '', 'https://m.360buyimg.com/mobilecms/jfs/t1/106011/22/13960/313353/5e61eb3dE75329aa8/9123d568934d06e5.jpg', 'https://item.jd.com/100011006352.html', '2020-11-03', 'd58a5a39ec3e4bf79a17248ca5da2e0e', 2020050628, '2020-10-16 18:00:06', 1, 0, 4547, 8566);
INSERT INTO `goods` VALUES (3, 100014192550, '苏泊尔（SUPOR）刀筷消毒架 智能家用紫外线杀菌消毒机 烘干筷子餐具菜刀刀具收纳架刀座 DK02C ', 299, 299, '', 'https://m.360buyimg.com/mobilecms/jfs/t1/124353/25/7077/76207/5f0c3c51E6916da71/54da51081415df77.jpg', 'https://item.jd.com/100014192550.html', '2020-11-11', '6847c43c8f43449b9aacb2923abfcb92', 2020050628, '2020-10-16 18:00:06', 1, 0, 6728, 6905);
INSERT INTO `goods` VALUES (4, 100007938903, 'LG 10.5公斤AI智慧变频直驱 洗烘一体 滚筒洗衣机 95℃高温除菌 14分钟快洗 6种智能手洗 白色 FLX10M4W ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120672/40/7859/62853/5f1a7c8fEab127e0f/2df689f957e23904.jpg', 'https://item.jd.com/100007938903.html', NULL, '3', 2020050647, '2020-10-16 18:00:06', 1, 0, 6095, 1145);
INSERT INTO `goods` VALUES (5, 100008528684, '华帝（VATTI）空气能热水器+回水泵套餐 75℃高温水 300升电热水器 300JG+12GD全屋零冷水套餐（三层） ', 14799, 14799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109460/32/3088/201939/5e0eabfaE17037845/f14b2c707b7fde82.jpg', 'https://item.jd.com/100008528684.html', NULL, '8', 2020050688, '2020-10-16 18:00:06', 1, 0, 2832, 3413);
INSERT INTO `goods` VALUES (6, 100011764088, '海尔（Haier）13升水气双调精控恒温燃气热水器智能厨宝洗三重防冻JSQ25-13JH1(12T)天然气 ', 1149, 1149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109163/34/9098/206421/5e702443E3f4d5352/bc942122ebdb5347.jpg', 'https://item.jd.com/100011764088.html', NULL, '8', 2020033045, '2020-10-16 18:00:06', 1, 0, 1389, 1804);
INSERT INTO `goods` VALUES (7, 100011978536, '海尔（Haier）波轮洗衣机全自动 双动力 防缠绕 10公斤直驱变频 低磨损ES100BZ169 ', 3299, 3299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106590/25/19728/201459/5ea0609dE10f9c825/fba9c1885d3bc058.jpg', 'https://item.jd.com/100011978536.html', NULL, '3', 2020033045, '2020-10-16 18:00:06', 1, 0, 7092, 3288);
INSERT INTO `goods` VALUES (8, 100008337791, '苏泊尔(SUPOR) 家用多功能专业35升大容量烘焙电烤箱 带旋转烤叉烤笼烧烤签 精准定时上下独立控温 K35FK612 ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/144733/1/6810/98844/5f45f933E0784b5cc/dfab2df93eb8d76c.jpg', 'https://item.jd.com/100008337791.html', NULL, '13', 2020050628, '2020-10-16 18:00:06', 1, 0, 6946, 8265);
INSERT INTO `goods` VALUES (9, 10020844253516, '喜临门乳胶床垫 双层弹簧护脊床垫 纽扣弹簧适中偏硬 亲肤针织面料护脊垫子 正反可睡 双芯 双芯舒适版 180*200cm ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/128799/24/12884/494342/5f659794E76022eb6/9f15718226773f80.jpg!q80.dpg', 'https://item.jd.com/10020844253516.html', NULL, '14', NULL, '2020-10-16 18:00:06', 1, 0, 8806, 6306);
INSERT INTO `goods` VALUES (10, 6064068, '能率（NORITZ）油烟机 欧式抽油烟机 大吸力油烟机 A1881 ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106860/27/11457/86688/5e350c08E7df36636/5ac4652834fdd733.jpg', 'https://item.jd.com/6064068.html', NULL, '4', 2020052070, '2020-10-16 18:00:06', 1, 0, 4746, 3727);
INSERT INTO `goods` VALUES (11, 983507, '小熊（Bear）电煮锅迷你多功能分体式电热锅电热杯小1-2人学生宿舍小锅煮面电火锅泡面电锅DRG-210GA ', 70, 70, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96216/19/12437/123528/5e4b3d35Ecd6614d2/95b3319a4c8ba826.jpg', 'https://item.jd.com/983507.html', NULL, '14', 2020042873, '2020-10-16 18:00:06', 1, 0, 5198, 1172);
INSERT INTO `goods` VALUES (12, 1430834, '飞利浦（PHILIPS）男士电动剃须刀干湿双剃防水剃胡刀胡须刀刮胡刀AT800x2F16 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109176/40/8882/118808/5e6f48a5Ea7678767/6bb6903c12646eee.jpg', 'https://item.jd.com/1430834.html', NULL, '15', 2020042790, '2020-10-16 18:00:06', 1, 0, 6007, 5610);
INSERT INTO `goods` VALUES (13, 4797199, '苏泊尔（SUPOR)电压力锅高压锅 CYSB50FCW20QT-100球釜 ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/21197/10/15322/402671/5cafeff3E3ab6db24/61fcf17b605726ff.jpg', 'https://item.jd.com/4797199.html', NULL, '14', 2020050628, '2020-10-16 18:00:06', 1, 0, 2948, 9666);
INSERT INTO `goods` VALUES (14, 100002017499, '美的（Midea）京品家电 油烟机 17爆炒大吸力 侧吸抽油烟机 立体环吸 家用吸油烟机 J30 ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/58761/9/15911/119771/5dd1f5a0E6e74519e/c7c5c6e93fcf7b19.jpg', 'https://item.jd.com/100002017499.html', NULL, '4', 2020050665, '2020-10-16 18:00:06', 1, 0, 5888, 4025);
INSERT INTO `goods` VALUES (15, 100005901017, '小熊（Bear）豆浆机 家用多功能破壁料理机全自动搅拌机免滤易清洗 DJJ-A03K1 ', 219, 219, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109427/24/3216/62282/5e0edfc9E8999dde0/4faae3601789314a.jpg', 'https://item.jd.com/100005901017.html', NULL, '14', 2020042873, '2020-10-16 18:00:06', 1, 0, 6841, 2893);
INSERT INTO `goods` VALUES (16, 100005801565, '苏泊尔（SUPOR）26L家用台式蒸烤箱 蒸箱烤箱二合一 烘焙发酵 智能预约 蒸烤一体 电烤箱ZK26FC801 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97205/1/11392/130837/5e341647Eba586ede/1fa9d875e83c0732.jpg', 'https://item.jd.com/100005801565.html', NULL, '13', 2020050628, '2020-10-16 18:00:06', 1, 0, 1680, 6036);
INSERT INTO `goods` VALUES (17, 7213912, '美的 Midea 9公斤全自动波轮洗衣机 自清洗更洁净 自编程随心调节 MB90VN13 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t16918/212/1248978556/63262/a0e6048c/5ac1a900N39d9daec.jpg', 'https://item.jd.com/7213912.html', NULL, '3', 2020050665, '2020-10-16 18:00:06', 1, 0, 6571, 3234);
INSERT INTO `goods` VALUES (18, 8174066, '苏泊尔（SUPOR）电压力锅 6升大容量 鲜呼吸SY-60FC22Q 铜晶球釜 智能高压锅 ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/21289/23/15297/394445/5caff40fE6f0952c3/05a4970b6dcaf6a8.jpg', 'https://item.jd.com/8174066.html', NULL, '14', 2020050628, '2020-10-16 18:00:06', 1, 0, 7054, 9979);
INSERT INTO `goods` VALUES (19, 100002049159, '美的（Midea）M3-L232F 变频家用微波炉 光波烧烤炉 微波烤箱一体机 变频文武火 900W大火力 双模烧烤 23升 ', 469, 469, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86900/18/14875/294934/5e69f8b7E743222a3/faeb41745b7531de.jpg', 'https://item.jd.com/100002049159.html', NULL, '13', 2020050665, '2020-10-16 18:00:06', 1, 0, 3459, 7658);
INSERT INTO `goods` VALUES (20, 1064407, '美的（Midea）60升电热水器 无线遥控 加长防电墙 健康抑菌 8年包修 F60-21BA1(HY) ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98632/35/15206/171742/5e6f3a0bE97a11221/988ea912b2eaa1c5.jpg', 'https://item.jd.com/1064407.html', NULL, '8', 2020050665, '2020-10-16 18:00:06', 1, 0, 1580, 5209);
INSERT INTO `goods` VALUES (21, 1096381, '美的（Midea）无废水 保留矿物质 家用净水器 即滤型超滤机 长寿命滤芯 不用电 MU131A-5 ', 599, 599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92600/26/8017/112649/5e01b456E12ed0fa8/e191b88c832a5cdb.jpg', 'https://item.jd.com/1096381.html', NULL, '14', 2020050665, '2020-10-16 18:00:06', 1, 0, 4666, 5441);
INSERT INTO `goods` VALUES (22, 100006537833, '海尔 （Haier）325升风冷无霜变频三门冰箱干湿分储超导料理盘厨装一体电冰箱BCD-325WDGB ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/85899/13/18756/53982/5e983d10E18c83490/6ef2a38a2c6836b9.jpg!q80.dpg', 'https://item.jd.com/100006537833.html', NULL, '2', 2020033045, '2020-10-16 18:00:06', 1, 0, 8022, 9621);
INSERT INTO `goods` VALUES (23, 100006602581, '海尔（Haier）100升家用冰柜冷藏冷冻转换冷柜 节能单温冰箱 BCBD-100HDB ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95238/38/12751/84467/5e4ffc9fE5f2e06b8/165c2749be3d5765.jpg', 'https://item.jd.com/100006602581.html', NULL, '11', 2020033045, '2020-10-16 18:00:06', 1, 0, 4527, 3201);
INSERT INTO `goods` VALUES (24, 100003536175, '海尔(Haier)吸顶式空调天花机 5匹中央空调 变频三菱压机 5p嵌入式空调 380V KFRd-120QW22DAH22 18米包安装 ', 19604, 19604, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125694/13/419/87980/5eb5103aE9008fd48/b85d2e3a8242ec12.jpg', 'https://item.jd.com/100003536175.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 8931, 8254);
INSERT INTO `goods` VALUES (25, 100001194383, '利仁（Liven）电饼铛家用双面加热煎烤机25MM加深烤盘可调温煎饼烙饼锅三明治早餐机LR-X2901(海贝) ', 108, 108, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/112482/25/9059/389795/5ed5ec44E4d451a56/20715d8ae0fd012e.jpg!q80.dpg', 'https://item.jd.com/100001194383.html', NULL, '14', NULL, '2020-10-16 18:00:06', 1, 0, 9781, 7381);
INSERT INTO `goods` VALUES (26, 100011606016, '创维（SKYWORTH）55H10 55英寸4K高清电视机 智能网络全面屏 液晶平板超薄彩电 教育电视 3+64G ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98254/19/14128/185397/5e61e744E40bd1d56/edcd46693be6e99e.jpg', 'https://item.jd.com/100011606016.html', NULL, '1', 2020033015, '2020-10-16 18:00:06', 1, 0, 7617, 8049);
INSERT INTO `goods` VALUES (27, 100003536181, '海尔(Haier)吸顶式空调天花机 5匹中央空调 5p嵌入式商用空调 6年包修 380V KFRd-125QW21DAH13 18米包安装 ', 16184, 16184, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122674/10/416/88555/5eb51066E98ffc1a9/d6406b5e122d78ef.jpg', 'https://item.jd.com/100003536181.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 3801, 6961);
INSERT INTO `goods` VALUES (28, 100001158131, '米的(mediy)(32-65英寸)电视挂架 电视架 电视支架 仰角调节 40/50/55/60小米海信海尔TCL夏普 M10T ', 69, 69, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105344/21/3634/259650/5de219efEb980901f/b9fa85a97e4609d9.jpg', 'https://item.jd.com/100001158131.html', NULL, '1', NULL, '2020-10-16 18:00:06', 1, 0, 1908, 7591);
INSERT INTO `goods` VALUES (29, 100005885800, '海尔(Haier)3匹吸顶式空调天花机 3匹商用中央空调 3p嵌入式空调 变频八面出风KFRd-72QW23DAH22 18米包安装 ', 14609, 14609, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110088/35/14983/91966/5eb50ff7E639d72b0/ce52a40216259c32.jpg', 'https://item.jd.com/100005885800.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 5419, 3237);
INSERT INTO `goods` VALUES (30, 100005885820, '海尔(Haier)吸顶式空调天花机 3匹中央空调商用空调八面出风3p嵌入式空调6年包修KFRd-75Q21DAH13 18米包安装 ', 13609, 13609, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/127708/21/406/91094/5eb51010Ef5524fd0/1027dbd932677ee6.jpg', 'https://item.jd.com/100005885820.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 6009, 8286);
INSERT INTO `goods` VALUES (31, 100015786920, '美菱（MELING）电热水龙头 快速加热厨房宝冷热两用 即热式电热水器下进水 MF-D308 ', 219, 219, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/137596/32/9619/24559/5f71ba90E8a6f0955/0f388e52a0803770.jpg', 'https://item.jd.com/100015786920.html', NULL, '8', 2020052059, '2020-10-16 18:00:06', 1, 0, 7558, 3952);
INSERT INTO `goods` VALUES (32, 100005885810, '海尔(Haier)5匹机房空调 落地立柜式中央空调5匹基站商用工程空调380V全天运转KFR-120LW71FAJ12 18米包安装 ', 18113, 18113, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111306/4/5621/89793/5eb4ee3cEce46b377/f124ac41e7455a22.jpg', 'https://item.jd.com/100005885810.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 5390, 4954);
INSERT INTO `goods` VALUES (33, 100005885786, '海尔((Haier)5匹商用空调 落地立柜式中央空调 380V直流变频商用柜机6年包修KFRd-120LW50BBC22 18米包安装 ', 16165, 16165, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114913/26/5721/90129/5eb4ee0fEb934c773/ee90a9a1098a8ff2.jpg', 'https://item.jd.com/100005885786.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 1712, 4946);
INSERT INTO `goods` VALUES (34, 100005885798, '海尔((Haier)中央空调10匹柜机立柜式空调商用10P停电记忆故障自检冷暖定速380V KFRd-260L730A 18米包安装 ', 33520, 33520, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/124275/2/382/127045/5eb50fddE9b0ef37c/0a477533d9dc8337.jpg', 'https://item.jd.com/100005885798.html', NULL, '5', 2020033045, '2020-10-16 18:00:06', 1, 0, 4851, 8271);
INSERT INTO `goods` VALUES (35, 100013081482, '小熊（Bear）电煮锅电蒸锅电热锅火锅锅多功能锅电锅宿舍小锅煮面泡面锅DRG-D12Q3 ', 109, 109, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/132732/21/23/188333/5ec7a134E22f4ca07/211cf242e867df8e.jpg', 'https://item.jd.com/100013081482.html', NULL, '14', 2020042873, '2020-10-16 18:00:06', 1, 0, 3216, 8743);
INSERT INTO `goods` VALUES (36, 100008161659, '美的（Midea）新能效 1.5匹 直流变频挂机 三级能效KFR-35GW2FBP2DN8Y-TP300(3) ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/110974/13/15329/28387/5f36485cE88755091/1fe489841034959f.jpg!q80.dpg', 'https://item.jd.com/100008161659.html', NULL, '14', 2020050665, '2020-10-16 18:00:06', 1, 0, 5836, 1832);
INSERT INTO `goods` VALUES (37, 100005048887, '卡萨帝（Casarte）420升自由嵌入式多门冰箱 细胞级养鲜 干湿分储 BCD-420WDCTU1 ', 13999, 13999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88642/4/15222/41521/5e6efadbEda2f9f71/a00196ab24079e07.jpg', 'https://item.jd.com/100005048887.html', NULL, '2', 2020052078, '2020-10-16 18:00:06', 1, 0, 6405, 4175);
INSERT INTO `goods` VALUES (38, 7553224, '方太（FOTILE）烤箱 43L容积 家用嵌入式电烤箱 一键智控 4大烘焙模式 1度精准控温 KQD43F-E5 ', 5129, 5129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101722/15/15001/294750/5e6ce5cfE69a7990b/d992457157ab5701.jpg', 'https://item.jd.com/7553224.html', NULL, '13', 2020050693, '2020-10-16 18:00:06', 1, 0, 4623, 6867);
INSERT INTO `goods` VALUES (39, 100006800567, '美的（Midea）风管机一拖一 1匹家用中央空调 定速1p嵌入式 6年包修 0元安装 KFR-26T2WD-TR ', 4399, 4399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106647/21/17793/215152/5e8aa392Ed547b529/8ba730f6617f482e.jpg', 'https://item.jd.com/100006800567.html', NULL, '5', 2020050665, '2020-10-16 18:00:06', 1, 0, 9988, 4243);
INSERT INTO `goods` VALUES (40, 2098733, '飞利浦（PHILIPS）咖啡机 家用滴漏式美式MINI咖啡壶 HD7432x2F20 ', 229, 229, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t21631/354/368108415/78069/19f2b11d/5b0bb2afNf67fac47.jpg', 'https://item.jd.com/2098733.html', NULL, '14', 2020042790, '2020-10-16 18:00:06', 1, 0, 2230, 1812);
INSERT INTO `goods` VALUES (41, 100007221273, '云米（VIOMI ）355升变频无霜 一级能效 四门冰箱多门 电脑控温 草本杀菌电冰箱BCD-355WMSAF03A ', 2899, 2899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114438/6/7120/101605/5ec101e9E7057b52a/92b7acb2dc239a78.jpg', 'https://item.jd.com/100007221273.html', NULL, '2', 2020052067, '2020-10-16 18:00:07', 1, 0, 4400, 8881);
INSERT INTO `goods` VALUES (42, 5523403, '卡萨帝（Casarte）京品家电 621升艺术级外观十字对开门冰箱 干湿分储 智能杀菌 BCD-621WDVZU1 ', 11599, 11599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92650/21/15277/138526/5e6efc2bE5cf099a6/61178025077b4608.jpg', 'https://item.jd.com/5523403.html', NULL, '2', 2020052078, '2020-10-16 18:00:07', 1, 0, 9742, 4980);
INSERT INTO `goods` VALUES (43, 100011623582, '老板（Robam）8113 欧式大吸力吸油烟机 ', 3080, 3080, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101400/24/14305/53970/5e61a4b1E58884d9b/4e8bc0c87db251db.jpg', 'https://item.jd.com/100011623582.html', NULL, '4', 2020050697, '2020-10-16 18:00:07', 1, 0, 4461, 7193);
INSERT INTO `goods` VALUES (44, 100011674192, '美的（Midea）无线手持吸尘器P6 Master 家用吸尘立式无线吸尘器 ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99789/16/15282/105299/5e719ef4E4427edc7/86085df7011ad328.jpg', 'https://item.jd.com/100011674192.html', NULL, '14', 2020050665, '2020-10-16 18:00:07', 1, 0, 2316, 7575);
INSERT INTO `goods` VALUES (45, 100004615645, '格力（GREE）取暖器 x2F电暖器x2F电暖气家用 静音速热可折叠暖风踢脚线取暖器NDJA-X6022B ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89747/4/11817/107932/5e3bbed5E31675dd0/9ab2d6fa405e9e3f.jpg', 'https://item.jd.com/100004615645.html', NULL, '14', 2020050630, '2020-10-16 18:00:07', 1, 0, 5407, 5041);
INSERT INTO `goods` VALUES (46, 7123225, '美的（Midea）T1-108B 家用多功能迷你小烤箱 10升家用容量 双层烤位 ', 99, 99, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/42250/4/11359/166736/5d4aec08E2bc1a3f2/eb448c9af810373b.jpg', 'https://item.jd.com/7123225.html', NULL, '13', 2020050665, '2020-10-16 18:00:07', 1, 0, 9272, 8167);
INSERT INTO `goods` VALUES (47, 100011653464, '卡萨帝（Casarte）80升电热水器家用 钛金恒护系统 纤巧小体积 10倍大水量 净水洗一级能效CEC-80MAX3(U1) ', 4799, 4799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104961/29/15313/113221/5e7040f5Ee0bfbc34/ad379787ed55b40b.jpg', 'https://item.jd.com/100011653464.html', NULL, '8', 2020052078, '2020-10-16 18:00:07', 1, 0, 2249, 8562);
INSERT INTO `goods` VALUES (48, 100006585527, '老板（Robam）欧式大吸力吸油烟机套装 8113+7B19（液化气） ', 3780, 3780, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/101400/24/14305/53970/5e61a4b1E58884d9b/4e8bc0c87db251db.jpg!q80.dpg', 'https://item.jd.com/100006585527.html', NULL, '4', 2020050697, '2020-10-16 18:00:07', 1, 0, 9559, 6517);
INSERT INTO `goods` VALUES (49, 100006294169, '小天鹅（LittleSwan）迷你洗衣机全自动 3公斤波轮 小洗衣机 儿童宝宝专享 母婴洗 线下同款TB30V80MINI ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96937/30/13425/50846/5e576b9eEb013f51e/70331b8edc293fba.jpg', 'https://item.jd.com/100006294169.html', NULL, '3', 2020052047, '2020-10-16 18:00:07', 1, 0, 5447, 2315);
INSERT INTO `goods` VALUES (50, 100006585531, '老板（Robam）欧式大吸力吸油烟机套装 8113+7B19（天燃气） ', 3780, 3780, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/113403/2/3543/164779/5ea8038fE8dc0cde5/e06a607f54f8cf79.jpg!q80.dpg', 'https://item.jd.com/100006585531.html', NULL, '4', 2020050697, '2020-10-16 18:00:07', 1, 0, 2329, 3346);
INSERT INTO `goods` VALUES (51, 2886754, '松下（Panasonic）刷头 WEW0966-W405 适用于DS13x2FDS18x2FDS19电动牙刷 ', 49, 49, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t14236/213/1413642645/199900/ab758301/5a4d9b35Nf824ffea.jpg', 'https://item.jd.com/2886754.html', NULL, '15', 2020042842, '2020-10-16 18:00:07', 1, 0, 3105, 7260);
INSERT INTO `goods` VALUES (52, 100012036798, '小天鹅（LittleSwan）迷你洗衣机全自动 3公斤波轮 小洗衣机 儿童宝宝专享 除螨洗 TB30V80HMINI ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109965/37/10427/80745/5e7da591Ef79523c8/dd08d86d8fdd7a13.jpg', 'https://item.jd.com/100012036798.html', NULL, '3', 2020052047, '2020-10-16 18:00:07', 1, 0, 3569, 4252);
INSERT INTO `goods` VALUES (53, 100001172974, '美的（Midea）扫地机器人i5 扫拖一体机 4000Pa大吸力 全自动智能规划路线 擦地拖地扫地机 家用吸尘器 ', 849, 849, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102447/14/13255/120211/5e54b679Efc6cf694/f05cadca0a6dde4a.jpg', 'https://item.jd.com/100001172974.html', NULL, '14', 2020050665, '2020-10-16 18:00:07', 1, 0, 7232, 9727);
INSERT INTO `goods` VALUES (54, 100010768498, '老板（Robam）7B26聚中劲火家用双灶具燃气灶（液化气） ', 2399, 2399, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/93086/30/7135/172342/5df9b677Eb4da8f5c/4fcbeb79e169cd0e.jpg!q80.dpg', 'https://item.jd.com/100010768498.html', NULL, '6', 2020050697, '2020-10-16 18:00:07', 1, 0, 4495, 1452);
INSERT INTO `goods` VALUES (55, 906266, '星星（XINGX） 140升 家用小冰柜 冷冻冷藏转换冷柜 单温母婴母乳冰箱 安全门锁 顶开门 BDx2FBC-140E ', 849, 849, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t24493/2/2560405535/118279/b1a606bc/5b84b3c5N727406c8.jpg', 'https://item.jd.com/906266.html', NULL, '11', NULL, '2020-10-16 18:00:07', 1, 0, 4142, 6844);
INSERT INTO `goods` VALUES (56, 100001905311, '方太（FOTILE）蒸箱 40L大容积 家用嵌入式电蒸箱 双倍大蒸汽 9大智能菜单 SCD40-E5 ', 5799, 5799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/82721/25/14977/96267/5dca7899E1753f0a6/330353aefeded901.jpg', 'https://item.jd.com/100001905311.html', NULL, '14', 2020050693, '2020-10-16 18:00:07', 1, 0, 8912, 5469);
INSERT INTO `goods` VALUES (57, 100006585529, '美的（Midea）欧式21立方大吸力一级能效 烟灶套装TJD1+JDQ1（天然气） ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98412/5/14905/99682/5e6ca078E889f82ef/ccade590ecc7098b.jpg', 'https://item.jd.com/100006585529.html', NULL, '14', 2020050665, '2020-10-16 18:00:07', 1, 0, 3709, 5635);
INSERT INTO `goods` VALUES (58, 100008150789, '美的（Midea）新能效 风客 智能变频冷暖 大2匹客厅立式柜机KFR-51LWN8MFA3 ', 4299, 4299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119449/13/13888/81507/5f365ac6E9ef08477/e855b609f4728785.jpg', 'https://item.jd.com/100008150789.html', NULL, '14', 2020050665, '2020-10-16 18:00:07', 1, 0, 9845, 6182);
INSERT INTO `goods` VALUES (59, 100004456051, '美的(Midea)513升 纤薄无霜十字对开多门冰箱 一级变频 WIFI操控 炫晶灰BCD-513WTPZM(E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/79409/14/7702/57227/5d5bba08Eb061c968/ea8a38a85a81d66f.jpg', 'https://item.jd.com/100004456051.html', NULL, '2', 2020050665, '2020-10-16 18:00:07', 1, 0, 9065, 9154);
INSERT INTO `goods` VALUES (60, 100011528088, '华凌WAHIN大吸力侧吸抽烟机燃气灶消毒柜 家用集成灶JJZY-JW8011-G 液化气 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95941/22/12902/67079/5e50d918E422cc302/a44e7084f37a4566.jpg', 'https://item.jd.com/100011528088.html', NULL, '9', 2020052049, '2020-10-16 18:00:07', 1, 0, 7544, 5890);
INSERT INTO `goods` VALUES (61, 8615224, '小天鹅(LittleSwan)10公斤变频 滚筒洗衣机全自动 水魔方护色护形 智能家电 小京鱼APP控制TG100V86WMDY5 ', 5599, 5599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95264/7/3391/50157/5ddf75e3E56230f26/b69682c4c97ba9a5.jpg', 'https://item.jd.com/8615224.html', NULL, '3', 2020052047, '2020-10-16 18:00:07', 1, 0, 2257, 4566);
INSERT INTO `goods` VALUES (62, 100012534258, '海尔（Haier）60升电热水器家用储水式变频速热 APP智控 一级能效专利2.0安全防电墙EC6002-YG3(U1) ', 1349, 1349, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110285/38/13780/213803/5ea2bf8bE820044c1/5015132638d4cba9.jpg', 'https://item.jd.com/100012534258.html', NULL, '8', 2020033045, '2020-10-16 18:00:07', 1, 0, 2390, 5166);
INSERT INTO `goods` VALUES (63, 100008800694, '美的 （Midea）滚筒洗衣机全自动 洗烘一体机 10公斤变频 东芝DD直驱 除菌蒸汽洗 真丝柔洗 MD100KQ5 ', 5799, 5799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93133/33/12765/85380/5e4f854eE880cfc7b/8fc0976a3fb49ee7.jpg', 'https://item.jd.com/100008800694.html', NULL, '3', 2020050665, '2020-10-16 18:00:07', 1, 0, 8546, 5041);
INSERT INTO `goods` VALUES (64, 100006377076, '美的（Midea）60升电热水器2200W三档宽压变频速热遥控预约 健康抑菌漏电断电F6022-ZA2(HEY) ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96608/19/15227/87345/5e6f208fEa5fb0be4/846096da39ad26e5.jpg', 'https://item.jd.com/100006377076.html', NULL, '8', 2020050665, '2020-10-16 18:00:07', 1, 0, 1305, 7316);
INSERT INTO `goods` VALUES (65, 100008427379, '美的 Midea 家用油烟机抽油烟机套装20立方大吸力挥手控制一键蒸汽洗B69+Q70-Y ', 5298, 5298, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119552/2/14976/62289/5f4a4ac5E7e0d0bc2/78b772b839ebdb01.jpg', 'https://item.jd.com/100008427379.html', NULL, '4', 2020050665, '2020-10-16 18:00:07', 1, 0, 7336, 1700);
INSERT INTO `goods` VALUES (66, 100013308754, '美的（Midea）20立方米大吸力家用侧吸抽油烟机 侧吸式挥手触控B65 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/130851/40/1646/125503/5edb4d22Eba0078f2/43d654fc52a040ee.jpg!q80.dpg', 'https://item.jd.com/100013308754.html', NULL, '4', 2020050665, '2020-10-16 18:00:07', 1, 0, 5052, 1196);
INSERT INTO `goods` VALUES (67, 100012048586, '美的（Midea）JD100家用直饮水 低废水 自吸泵纯水机 MRO1683D-100G ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95890/21/15847/82363/5e735525E57182987/f48d61be587b4223.jpg', 'https://item.jd.com/100012048586.html', NULL, '14', 2020050665, '2020-10-16 18:00:07', 1, 0, 8136, 9619);
INSERT INTO `goods` VALUES (68, 100006914633, '小天鹅（LittleSwan）10公斤波轮洗衣机全自动 水电双宽 阻尼玻璃门盖 全新免清洗除螨洗TB100PURE ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/109283/11/14770/92927/5ea80364E86e5c51f/ab963a84b541386e.jpg!q80.dpg', 'https://item.jd.com/100006914633.html', NULL, '3', 2020052047, '2020-10-16 18:00:07', 1, 0, 2185, 6998);
INSERT INTO `goods` VALUES (69, 100013705246, '美的（Midea）T3-L326B 家用多功能电烤箱 35升 上下管独立控温 防爆照明灯易操作 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122934/36/8461/196953/5f24dd68E48da6d96/e4b587f3a45e8ba7.jpg', 'https://item.jd.com/100013705246.html', NULL, '13', 2020050665, '2020-10-16 18:00:07', 1, 0, 7591, 1061);
INSERT INTO `goods` VALUES (70, 100006252221, '美的（Midea）60升电热水器 健康活水内胆清洁 晨浴晚浴手机APP智控安全防漏电F6030-JD3(HEY) ', 3099, 3099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100951/32/12827/214728/5e4f9c67E1d93af3f/098f9626b01afc31.jpg', 'https://item.jd.com/100006252221.html', NULL, '8', 2020050665, '2020-10-16 18:00:07', 1, 0, 3470, 4360);
INSERT INTO `goods` VALUES (71, 100013495024, '美的 Midea JZT-QTW10 燃气灶 家用 煤气灶 台嵌两用 双灶（天然气） ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107535/24/19473/83788/5ece4c40E36c2a31f/8f14c91b8aac44a5.jpg', 'https://item.jd.com/100013495024.html', NULL, '6', 2020050665, '2020-10-16 18:00:07', 1, 0, 2380, 2720);
INSERT INTO `goods` VALUES (72, 100005885790, '海尔(Haier)3匹机房空调 落地立柜式中央空调 3匹基站商用工程空调380V全天运转KFR-72LW71CAJ13 18米包安装 ', 12539, 12539, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122070/38/351/91910/5eb4ed95E5d279213/8b2dc422517fcbd7.jpg', 'https://item.jd.com/100005885790.html', NULL, '5', 2020033045, '2020-10-16 18:00:08', 1, 0, 9332, 4820);
INSERT INTO `goods` VALUES (73, 100013154664, '美的（Midea）滚筒洗衣机全自动 洗烘一体机 9公斤变频 东芝DD直驱 祛味空气洗 WIFI智能 MD90CQ7PRO ', 4599, 4599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115589/37/5899/87486/5eb680d3E1e14764a/d6f5adaffe190ca5.jpg', 'https://item.jd.com/100013154664.html', NULL, '3', 2020050665, '2020-10-16 18:00:08', 1, 0, 6681, 2712);
INSERT INTO `goods` VALUES (74, 100007482247, '小天鹅（LittleSwan）10公斤水魔方滚筒+10公斤热泵烘干机 洗烘套装 TG100V86WMDY5+TH100-H32Y ', 8999, 8999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/139230/3/816/71145/5ee8a721Ee1c5d788/71ea661bea9a59e2.jpg!q80.dpg', 'https://item.jd.com/100007482247.html', NULL, '12', 2020052047, '2020-10-16 18:00:08', 1, 0, 7243, 7209);
INSERT INTO `goods` VALUES (75, 100002598289, '美的（Midea）侧吸式油烟机 20立方爆炒大吸力 自动开合 一级能效 CXW-280-B68C ', 2698, 2698, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/28330/20/11491/99687/5c907fcfEa26cba10/899d73bd18f6c3ff.jpg', 'https://item.jd.com/100002598289.html', NULL, '4', 2020050665, '2020-10-16 18:00:08', 1, 0, 2997, 6472);
INSERT INTO `goods` VALUES (76, 100011850696, '美的（Midea）燃气灶 家用 5.0KW大火力 嵌入式双灶JZT-JDQ1（天然气） ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97101/7/14865/139667/5e6c81a1E0c6a311a/db2ab526064d0910.jpg', 'https://item.jd.com/100011850696.html', NULL, '6', 2020050665, '2020-10-16 18:00:08', 1, 0, 6986, 2036);
INSERT INTO `goods` VALUES (77, 100006450743, '美的（Midea）侧吸式油烟机 21立方爆炒大吸力 自动开合 一级能效烟机 CXW-280-JJD1 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101709/1/15615/64936/5e72e6c4E9bb6e1c7/bc61ae7c28264c1d.jpg', 'https://item.jd.com/100006450743.html', NULL, '4', 2020050665, '2020-10-16 18:00:08', 1, 0, 4358, 6510);
INSERT INTO `goods` VALUES (78, 100012955046, '美的（Midea）滚筒洗衣机全自动 10公斤变频除螨洗烘一体 双蒸汽恒温洗 祛味空气洗 深层除螨 MD100A5 ', 3699, 3699, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/108217/22/14431/75730/5ea6b040Eabc4465e/ff89f3decb8ef5dd.jpg!q80.dpg', 'https://item.jd.com/100012955046.html', NULL, '3', 2020050665, '2020-10-16 18:00:08', 1, 0, 9435, 3314);
INSERT INTO `goods` VALUES (79, 100008150757, '美的（Midea） 新能效 风客 智能变频冷暖 大3匹客厅立式柜机KFR-72LWN8MFA3 ', 5299, 5299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/143267/4/5406/87452/5f365a98Ed67714e0/865c8ed2f9f6e635.jpg', 'https://item.jd.com/100008150757.html', NULL, '14', 2020050665, '2020-10-16 18:00:08', 1, 0, 6298, 3176);
INSERT INTO `goods` VALUES (80, 100013495000, '美的 Midea JZY-QTW10燃气灶 家用 煤气灶 台嵌两用 双灶（液化气） ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/135469/8/529/83788/5ece4e74E5e2d7bb1/5129fb77172c60e4.jpg', 'https://item.jd.com/100013495000.html', NULL, '6', 2020050665, '2020-10-16 18:00:08', 1, 0, 1817, 3550);
INSERT INTO `goods` VALUES (81, 100012755636, '小天鹅（LittleSwan）10公斤滚筒洗衣机全自动 智能家电 超微净泡水魔方 除菌洗TG100RFTEC ', 5599, 5599, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/112237/26/2361/141483/5ea16623Eec8fa88d/e9de64972bfb949e.jpg!q80.dpg', 'https://item.jd.com/100012755636.html', NULL, '3', 2020052047, '2020-10-16 18:00:08', 1, 0, 7567, 2218);
INSERT INTO `goods` VALUES (82, 100002329883, '美的（Midea）13升智能精控恒温多重安防 智能变升 抑菌水箱专利侧焰稳燃气热水器天然气JSQ25-ZC3 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92870/30/15271/106876/5e6f1761E282df1bd/510869bb3404e5ca.jpg', 'https://item.jd.com/100002329883.html', NULL, '8', 2020050665, '2020-10-16 18:00:08', 1, 0, 3417, 3823);
INSERT INTO `goods` VALUES (83, 100013494404, '万家乐油烟机侧吸式挥手wifi智控22立方爆炒风 4.5kw大火力燃气灶煤气灶 烟灶套装(液化气)AL232+KJ052B ', 2198, 2198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115504/34/11367/226577/5efdd929E38995fa4/3d86336496559daa.jpg', 'https://item.jd.com/100013494404.html', NULL, '6', 2020052036, '2020-10-16 18:00:08', 1, 0, 3218, 1915);
INSERT INTO `goods` VALUES (84, 100007152116, '美的(Midea)446升 十字对开门多门冰箱 19分钟急速净味 一级能效双变频电冰箱 莫兰迪灰BCD-446WTPZM(E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103787/23/15624/94540/5e72dd10E23f4e615/b25831ae286dba25.jpg', 'https://item.jd.com/100007152116.html', NULL, '2', 2020050665, '2020-10-16 18:00:08', 1, 0, 3360, 1967);
INSERT INTO `goods` VALUES (85, 100011323842, '美的（Midea）80升电热水器变频速热晨浴晚浴智能零电洗 一级节能APP控制渐变大屏F8030-J3S(HEY) ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85729/34/15243/201773/5e6f2bc8E7242f3e9/6a81ecd280c2e0da.jpg', 'https://item.jd.com/100011323842.html', NULL, '8', 2020050665, '2020-10-16 18:00:08', 1, 0, 9577, 8023);
INSERT INTO `goods` VALUES (86, 100012349612, '美的（Midea）ZTD-JD210 嵌入式消毒柜 高温 玻璃 ', 1799, 1799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113388/9/229/105710/5e88a1ccEcfed6c4f/86c20489eba0f74e.jpg', 'https://item.jd.com/100012349612.html', NULL, '9', 2020050665, '2020-10-16 18:00:09', 1, 0, 2384, 8883);
INSERT INTO `goods` VALUES (87, 5354053, '美的(Midea)476升 十字对开门冰箱 一级能效 多维智能双变频无霜 电冰箱 伯爵咖BCD-476WGPM(E) ', 5099, 5099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97342/8/15530/223704/5e6f3ae2E17576ed1/992bb4d8f9dd19e7.png', 'https://item.jd.com/5354053.html', NULL, '2', 2020050665, '2020-10-16 18:00:09', 1, 0, 2618, 6562);
INSERT INTO `goods` VALUES (88, 100002598401, '美的（Midea）侧吸式抽油烟机灶具套装 20立方爆炒大吸力 自动开合 4.2KW大火力双灶B68C+Q60-Y （液化气） ', 3299, 3299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/82668/8/12321/153966/5d9c02acE55cd47e5/ab0db35821c52f84.jpg', 'https://item.jd.com/100002598401.html', NULL, '4', 2020050665, '2020-10-16 18:00:09', 1, 0, 6514, 4918);
INSERT INTO `goods` VALUES (89, 100006365335, '华凌WAHIN大吸力侧吸抽烟机燃气灶消毒柜 家用集成灶JJZT-JW8011-G 天然气 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93629/28/13118/67079/5e50d93eEa74f6762/783cef9c3d97de87.jpg', 'https://item.jd.com/100006365335.html', NULL, '9', 2020052049, '2020-10-16 18:00:09', 1, 0, 3424, 5767);
INSERT INTO `goods` VALUES (90, 100012210014, '比佛利（BEVERLY）60升电热水器 钛芯智护免换镁棒 磁净化健康洗涡旋速热APP控制F6032-GT5(HEY) ', 3299, 3299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/118282/19/384/91459/5e8b7f94E72a22964/9005809aaeacb1b9.jpg', 'https://item.jd.com/100012210014.html', NULL, '8', NULL, '2020-10-16 18:00:09', 1, 0, 9137, 1051);
INSERT INTO `goods` VALUES (91, 100015884294, '小天鹅 LittleSwan 超微净泡水魔方系列 10公斤滚筒洗衣机全自动 智能家电 除菌洗 物理去渍TG100RFTEC-T61C ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/155526/2/1563/58612/5f7be5d2Ec9afeb9b/9179d9e4307cc6f1.jpg', 'https://item.jd.com/100015884294.html', NULL, '3', 2020052047, '2020-10-16 18:00:09', 1, 0, 4747, 9115);
INSERT INTO `goods` VALUES (92, 100004009722, '美的（Midea）侧吸式烟灶套装 17立方大吸力宽屏拢烟抽油烟机 4.2KW大火力嵌入式双灶 B61A+Q60-Y（液化气） ', 2199, 2199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/26542/24/10486/139828/5c878bf3Efd71933a/f1049947ad97b0b4.jpg', 'https://item.jd.com/100004009722.html', NULL, '4', 2020050665, '2020-10-16 18:00:09', 1, 0, 1302, 7387);
INSERT INTO `goods` VALUES (93, 100006564027, '美的（Midea）13升恒温芯精控恒温 智能变升 侧焰稳燃节能手机APP控制 燃气热水器天然气JSQ25-13C1 ', 1299, 1299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99105/27/15612/209531/5e7200deEbcfdf53d/84f1ce99c3b35553.jpg', 'https://item.jd.com/100006564027.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 8172, 1436);
INSERT INTO `goods` VALUES (94, 100007418437, '美的 (Midea)603升 对开门冰箱 时尚外观 风冷无霜一级能效 智能双变频 WIFI智能 伯爵咖BCD-603WKGPZM(E) ', 5299, 5299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110919/19/8430/205217/5ecf1c19E1aa28644/d056d1bcff8e03ac.jpg', 'https://item.jd.com/100007418437.html', NULL, '2', 2020050665, '2020-10-16 18:00:09', 1, 0, 2940, 3035);
INSERT INTO `goods` VALUES (95, 100005441544, '创维 (SKYWORTH) 178升 冰箱小型双门两门 风冷无霜 家用宿舍租房老人迷你 节能省电 小巧不占地 BCD-178WY ', 949, 949, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92451/30/15442/128727/5e6f2648E356f8393/1b8734bdf3d8363a.jpg', 'https://item.jd.com/100005441544.html', NULL, '2', 2020033015, '2020-10-16 18:00:09', 1, 0, 8000, 8543);
INSERT INTO `goods` VALUES (96, 100008550197, '美的（Midea）80升电热水器智能磁净活水 水质监测 智能杀菌安全零电洗手机APP控制F80-F32CQ8(HEY) ', 4599, 4599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114548/34/17213/129364/5f55e5e3E573221d2/81c5c5c656d902d9.jpg', 'https://item.jd.com/100008550197.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 1360, 2034);
INSERT INTO `goods` VALUES (97, 100008830665, '美的 Midea 抽油烟机CXW-280-B62P 侧吸 蒸汽洗 家用油烟机19m³大吸力挥手控制 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/135603/32/10919/43969/5f6c617cEe7ab003b/802543f92ff98480.jpg', 'https://item.jd.com/100008830665.html', NULL, '4', 2020050665, '2020-10-16 18:00:09', 1, 0, 7783, 9708);
INSERT INTO `goods` VALUES (98, 100015589216, '美的 Midea CXW-260-B89S高温蒸汽洗家用抽油烟机22大吸力 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/154673/8/731/46242/5f6c612fE9a6d62f7/1775d7307c541ce3.jpg', 'https://item.jd.com/100015589216.html', NULL, '4', 2020050665, '2020-10-16 18:00:09', 1, 0, 3561, 1403);
INSERT INTO `goods` VALUES (99, 6963418, '美的(Midea)213升 三门冰箱 节能静音 风冷无霜 家用冰箱 阳光米 BCD-213WTM(E) ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101829/40/15294/218503/5e6f3d45Ea4a4e7ae/89fbfd0474022845.png', 'https://item.jd.com/6963418.html', NULL, '2', 2020050665, '2020-10-16 18:00:09', 1, 0, 8390, 3552);
INSERT INTO `goods` VALUES (100, 100002584651, '美的 Midea 钢化玻璃 4.2KW大火力嵌入式双灶 一级能效 JZY-Q60（液化气） ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/31099/19/5690/58908/5c876ffeE9fc22dce/e8286fce6e77ad42.jpg', 'https://item.jd.com/100002584651.html', NULL, '14', 2020050665, '2020-10-16 18:00:09', 1, 0, 3853, 5745);
INSERT INTO `goods` VALUES (101, 100006980173, '比佛利（BEVERLY）15公斤变频复式洗衣机 B1FGV150IEG6 高端滚筒洗衣机全自动 线下同款 煮洗消毒 ', 13999, 13999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/93675/20/16682/308541/5e7d9327E7673e117/192c23c7d52a8069.jpg!q80.dpg', 'https://item.jd.com/100006980173.html', NULL, '3', NULL, '2020-10-16 18:00:09', 1, 0, 1585, 6618);
INSERT INTO `goods` VALUES (102, 100005217021, '美的（Midea）13升燃气热水器天然气 水气双调自检安防 燃气用量显示智能随温感WIFI操控JSQ25-JM3 ', 1799, 1799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101033/11/15230/99401/5e6f1664Eb178cd45/d9eadb49dbfc3dde.jpg', 'https://item.jd.com/100005217021.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 4806, 8104);
INSERT INTO `goods` VALUES (103, 100011578306, '美的（Midea）16升燃气热水器天然气全屋零冷水 磁净化健康洗安防自检智能变升手机APP控制JSQ30-JD5 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104853/9/15275/93593/5e6f6a36Eb59418bd/bcb8efd247ab2cf7.jpg', 'https://item.jd.com/100011578306.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 7350, 8967);
INSERT INTO `goods` VALUES (104, 2469956, '美的（Midea）M1-L213C 快捷微波炉 微电脑操控 360°转盘加热 智能蒸煮菜单 21升 ', 339, 339, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107546/17/8535/214728/5e69f83bEc38d07bf/55a71947653c0ba6.jpg', 'https://item.jd.com/2469956.html', NULL, '14', 2020050665, '2020-10-16 18:00:09', 1, 0, 2778, 1907);
INSERT INTO `goods` VALUES (105, 100004812073, '美的（ Midea）厨下式家用直饮一级水效RO反渗透无罐净水机 MRO1598A-400G ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/42313/31/15280/64554/5d804647Efcbb3ed0/72cbb0c3b1876fa0.jpg', 'https://item.jd.com/100004812073.html', NULL, '14', 2020050665, '2020-10-16 18:00:09', 1, 0, 7639, 4630);
INSERT INTO `goods` VALUES (106, 100006410989, '美的（Midea）80升电热水器3200W三档变频健康净浴低耗保温漏电断电手机APP控制F80-32DH6(HEY)  ', 2399, 2399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106102/19/15524/160418/5e71ec2cE498c3d5b/6f273037ce7a6dbc.jpg', 'https://item.jd.com/100006410989.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 4145, 2926);
INSERT INTO `goods` VALUES (107, 100012720752, '小天鹅（LittleSwan）10公斤洗烘一体 TD100PURE 滚筒洗衣机全自动 智能家电 除菌除螨 快舒省高温蒸汽烘干 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/109066/7/10244/139660/5e7b1656E21235dac/e99dd41142782220.jpg!q80.dpg', 'https://item.jd.com/100012720752.html', NULL, '3', 2020052047, '2020-10-16 18:00:09', 1, 0, 9778, 3638);
INSERT INTO `goods` VALUES (108, 100007889289, '华凌 美的出品 60升电热水器3200W涡旋速热智能零电洗 AI节能健康洗智能APP控制F60-32WJ3 ', 1299, 1299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/134498/30/5144/292417/5f1a35f6E92916176/7da096f2408a4d4d.jpg', 'https://item.jd.com/100007889289.html', NULL, '8', 2020052049, '2020-10-16 18:00:09', 1, 0, 8867, 6138);
INSERT INTO `goods` VALUES (109, 100011850694, '美的（Midea）燃气灶 家用 5.0KW大火力 嵌入式双灶 JZY-JDQ1 ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103777/15/15021/139667/5e6c81d7Eac3322d6/f7be647ee5cb2184.jpg', 'https://item.jd.com/100011850694.html', NULL, '6', 2020050665, '2020-10-16 18:00:09', 1, 0, 6503, 1674);
INSERT INTO `goods` VALUES (110, 100013081124, '美的(Midea)321升 多门冰箱法式对开门冷冻冷藏双变频一级能效风冷无霜节能静音BCD-321WFPM(E) ', 3599, 3599, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/117401/31/4863/118697/5eb11490E7f05b362/b4c32b857a9daefd.jpg!q80.dpg', 'https://item.jd.com/100013081124.html', NULL, '2', 2020050665, '2020-10-16 18:00:09', 1, 0, 6248, 6250);
INSERT INTO `goods` VALUES (111, 100015588392, '美的（Midea）12升燃气热水器线下同款 恒温芯精控恒温开机自检 双重防冻节能JSQ22-12HM1液化气 ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/142706/28/8954/178178/5f686a8aEcae87d4d/3871a35c0aeb78eb.jpg', 'https://item.jd.com/100015588392.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 5470, 8058);
INSERT INTO `goods` VALUES (112, 6413305, '美的(Midea)226升 风冷无霜 电脑控温三门冰箱 中门宽幅变温 芙蓉金 BCD-226WTM(E) ', 2099, 2099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98360/5/15790/71018/5e72e93cEc4c11cf4/2903e503e146fd63.jpg', 'https://item.jd.com/6413305.html', NULL, '2', 2020050665, '2020-10-16 18:00:09', 1, 0, 4532, 6465);
INSERT INTO `goods` VALUES (113, 100002987337, '美的 3-5人用 快捷微波炉 360°转盘加热 旋钮操控 精准控温 五档火力 23升 M1-230E ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/34231/30/495/124984/5cb6c666Ec3ee4604/643875f6b8d7e72e.jpg', 'https://item.jd.com/100002987337.html', NULL, '14', 2020050665, '2020-10-16 18:00:09', 1, 0, 4170, 7949);
INSERT INTO `goods` VALUES (114, 100003679849, '美的（Midea）60升电热水器3200W宽压变频速热 健康抑菌 手机APP遥控 加长防电墙F60-32ZA6(HEY) ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92641/19/15216/182407/5e6f2348E3c7ebffb/bca38c81d054f46f.jpg', 'https://item.jd.com/100003679849.html', NULL, '8', 2020050665, '2020-10-16 18:00:09', 1, 0, 6527, 2708);
INSERT INTO `goods` VALUES (115, 100011947358, '华凌60升电热水器 2100W速热5倍增容健康洗 无线遥控预约洗浴安全防电墙F6021-YJ2(HY) ', 649, 649, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103844/4/15623/151879/5e72eb1dE00f7aa2a/a7b74b41964ddf4e.jpg', 'https://item.jd.com/100011947358.html', NULL, '8', 2020052049, '2020-10-16 18:00:09', 1, 0, 1319, 6109);
INSERT INTO `goods` VALUES (116, 100013639728, '小天鹅（LittleSwan）10公斤超微净泡水魔方+10公斤热泵烘干机 洗烘套装TG100-14366WMUDT+TH100-H36WT ', 11999, 11999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/126300/39/5021/83445/5ee97b9dEa7ea287b/4d67b37380d638bd.jpg!q80.dpg', 'https://item.jd.com/100013639728.html', NULL, '12', 2020052047, '2020-10-16 18:00:09', 1, 0, 7577, 8188);
INSERT INTO `goods` VALUES (117, 100013494338, '美的（Midea)侧吸式烟机装饰罩下单专用链接 下单前请咨询客服适用型号JJD1B68CB61A ', 199, 199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/127544/33/7037/170591/5f0bfb12E6b2531fb/bf48bd6a9044050c.jpg', 'https://item.jd.com/100013494338.html', NULL, '14', 2020050665, '2020-10-16 18:00:09', 1, 0, 8204, 5540);
INSERT INTO `goods` VALUES (118, 1175436, '美的（Midea）消毒柜家用 碗柜 碗筷紫外线 二星级 86L 嵌入式 100Q33 ', 1259, 1259, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86208/15/7952/97350/5e002f73E22be75ae/322308507e05de8e.jpg', 'https://item.jd.com/1175436.html', NULL, '9', 2020050665, '2020-10-16 18:00:09', 1, 0, 8003, 5623);
INSERT INTO `goods` VALUES (119, 2983863, '美的（Midea）M1-L201B 变频微波炉家用 微波炉烤箱一体机 光波烧烤炉 智能解冻 低噪音 一机多用 20升 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106994/14/14862/310242/5e69f861Eb6293bb2/47c6f8062f3f4128.jpg', 'https://item.jd.com/2983863.html', NULL, '13', 2020050665, '2020-10-16 18:00:09', 1, 0, 2947, 3624);
INSERT INTO `goods` VALUES (120, 100012755652, '比佛利（BEVERLY）10公斤洗烘一体 高端滚筒洗衣机全自动 洗烘一小时 TFT彩屏 智能家电 B1DV100TG ', 7999, 7999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/87654/18/16479/243791/5e7d92f3E4a15856a/6220fd6689096e3b.jpg!q80.dpg', 'https://item.jd.com/100012755652.html', NULL, '3', NULL, '2020-10-16 18:00:09', 1, 0, 5625, 1914);
INSERT INTO `goods` VALUES (121, 100011701842, '美的（Midea）消毒柜家用 嵌入式 紫外线 碗柜 碗筷 WIFI控制 110L 负离子净味 120BX10 ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113098/21/3200/120921/5ea67fabEad7a59a6/d37829e39c901f6a.jpg', 'https://item.jd.com/100011701842.html', NULL, '9', 2020050665, '2020-10-16 18:00:10', 1, 0, 1329, 4144);
INSERT INTO `goods` VALUES (122, 100011976566, '美的（Midea）侧吸式油烟机 21立方爆炒大吸力 5.0大火力 烟灶套装JJD1+JDQ1（液化气） ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94017/27/15606/138989/5e731df2Ea3f74c58/5ffd563fbf40f14a.jpg', 'https://item.jd.com/100011976566.html', NULL, '4', 2020050665, '2020-10-16 18:00:10', 1, 0, 1086, 5328);
INSERT INTO `goods` VALUES (123, 8826867, '小天鹅（LittleSwan）10公斤洗烘一体 滚筒洗衣机全自动 水魔方护色护形 智能控制 蒸汽烘干机TD100V86WMADY5 ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/41196/12/11655/151778/5d52641bE883d7729/e681144301ea0c8b.jpg', 'https://item.jd.com/8826867.html', NULL, '12', 2020052047, '2020-10-16 18:00:10', 1, 0, 8643, 5679);
INSERT INTO `goods` VALUES (124, 100002598397, '美的（Midea）欧式抽油烟机灶具套装 20立方大吸力 4.2KW大火力双燃气灶 B89C+Q60-Y（液化气） ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/29272/23/11590/129289/5c909da9E3f2a653f/6e856b5d547b8f93.jpg', 'https://item.jd.com/100002598397.html', NULL, '6', 2020050665, '2020-10-16 18:00:10', 1, 0, 2462, 8507);
INSERT INTO `goods` VALUES (125, 100006023627, '美的(Midea)508升 多门电冰箱 19分钟急速净味 双变频风冷无霜 一级能效 莫兰迪灰BCD-508WTPZM(E) ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/62889/34/15963/169739/5dd65c1aEd69c1cc3/36b489cbd65096b5.png', 'https://item.jd.com/100006023627.html', NULL, '2', 2020050665, '2020-10-16 18:00:10', 1, 0, 8012, 7475);
INSERT INTO `goods` VALUES (126, 100012759824, '美的（Midea）华凌80升电热水器 2100W变频速热无线遥控预约五倍增容健康洗加长安全防电墙8年包修F80-21WS1G ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111393/39/5138/218238/5eb25827Ed91fd34e/1027e7a2b2cc2717.jpg', 'https://item.jd.com/100012759824.html', NULL, '8', 2020050665, '2020-10-16 18:00:10', 1, 0, 9109, 5736);
INSERT INTO `goods` VALUES (127, 100002598387, '美的（Midea）17立方大吸力宽屏拢烟侧吸式抽油烟机 B61A ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/10894/35/14398/106272/5c88c030E26e9211b/c38f02b583b843ea.jpg', 'https://item.jd.com/100002598387.html', NULL, '4', 2020050665, '2020-10-16 18:00:10', 1, 0, 8772, 2792);
INSERT INTO `goods` VALUES (128, 100004858465, '美的（Midea）60升电热水器速热电子免换镁棒 一级节能智能杀菌 手机APP智控出水断电F6030-FA3(HEY) ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86205/39/15595/227910/5e6f2375E81820a6a/671fa355a43e6007.jpg', 'https://item.jd.com/100004858465.html', NULL, '8', 2020050665, '2020-10-16 18:00:10', 1, 0, 5765, 5932);
INSERT INTO `goods` VALUES (129, 100006588137, '美的（Midea）侧吸式油烟机 21立方爆炒大吸力 5.0大火力 烟灶套装JJD1+JDQ1（天然气） ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97586/37/15415/138989/5e731829Ecbd3cc21/97a0dfc206244062.jpg', 'https://item.jd.com/100006588137.html', NULL, '4', 2020050665, '2020-10-16 18:00:10', 1, 0, 9788, 4125);
INSERT INTO `goods` VALUES (130, 100007285333, '美的(Midea)果润维C冰箱 323升多门 家用四开门 变频一级能效 智能电冰箱BCD-323WFPZM(E) ', 4799, 4799, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/128760/9/2182/120164/5ec35657Eeda30de1/e408f2f733f714c0.jpg!q80.dpg', 'https://item.jd.com/100007285333.html', NULL, '2', 2020050665, '2020-10-16 18:00:10', 1, 0, 7674, 4775);
INSERT INTO `goods` VALUES (131, 100015800684, '美的（Midea）MG38CB-AA 家用多功能电烤箱 38升大容量烤箱 广域控温 ', 319, 319, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115431/9/18273/105994/5f6e07a3E5cb136a8/46897dff0ad4e0d3.jpg', 'https://item.jd.com/100015800684.html', NULL, '13', 2020050665, '2020-10-16 18:00:10', 1, 0, 4032, 4468);
INSERT INTO `goods` VALUES (132, 1106432, '美的（Midea）2100W速热电热水器60升 遥控预约洗浴 健康洗一级节能 加长防电墙F60-15WB5(Y) ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91671/3/15264/211509/5e6f39d8E73bc145c/f60436aa47fb687f.jpg', 'https://item.jd.com/1106432.html', NULL, '8', 2020050665, '2020-10-16 18:00:10', 1, 0, 3916, 4240);
INSERT INTO `goods` VALUES (133, 100003503887, '利仁（Liven）电饼铛家用双面加热可拆洗煎饼烙饼锅25MM加深烤盘早餐机LR-D3020S（美猴王） ', 239, 239, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109484/20/6113/317581/5e466376E5491e7f9/1308e8af33a398f4.jpg', 'https://item.jd.com/100003503887.html', NULL, '14', NULL, '2020-10-16 18:00:10', 1, 0, 7364, 8948);
INSERT INTO `goods` VALUES (134, 100006315618, '小天鹅（LittleSwan）8公斤 波轮洗衣机全自动 健康免清洗 一键脱水 品质电机 TB80V20 ', 1199, 1199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/50389/6/3605/119856/5d15bea2Edd07bc2f/81f0bb0f1d51264e.jpg', 'https://item.jd.com/100006315618.html', NULL, '3', 2020052047, '2020-10-16 18:00:10', 1, 0, 5169, 1544);
INSERT INTO `goods` VALUES (135, 100001036627, '美的（Midea）养生壶电水壶烧水壶多功能花茶壶电茶壶煮水壶开水壶玻璃水壶MK-YS12Colour101 ', 89, 89, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86998/1/14563/285111/5e67270eE04978892/0102bc05faa9291b.jpg', 'https://item.jd.com/100001036627.html', NULL, '14', 2020050665, '2020-10-16 18:00:10', 1, 0, 4211, 7750);
INSERT INTO `goods` VALUES (136, 100011695178, '美的（Midea）滚筒洗衣机全自动10公斤洗烘一体 全时全驱 阿尔法水流 莫比乌斯环 CLDQ10 ', 11999, 11999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92040/6/13886/54484/5e5f6b60E90fb168d/f7383afa067e4ab3.jpg', 'https://item.jd.com/100011695178.html', NULL, '3', 2020050665, '2020-10-16 18:00:10', 1, 0, 8860, 6184);
INSERT INTO `goods` VALUES (137, 100000725306, '美的(Midea) 448升 十字对开门多门冰箱 变频风冷无霜 一级能效节能 爵士棕BCD-448WTPZM(E) ', 4199, 4199, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/106910/28/15489/84057/5e72f8bdEd5c85d8b/336319027fa2a2b7.jpg!q80.dpg', 'https://item.jd.com/100000725306.html', NULL, '2', 2020050665, '2020-10-16 18:00:10', 1, 0, 7757, 3260);
INSERT INTO `goods` VALUES (138, 100005718744, '华凌40升电热水器2100W大功率 经济节能保温型安全防电墙 蓝钻内胆8年包修 美的出品F4021-Y1 ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108036/18/8998/173464/5e6f27a2E31d8ff42/61b0aafbb4fb7719.jpg', 'https://item.jd.com/100005718744.html', NULL, '8', 2020052049, '2020-10-16 18:00:10', 1, 0, 7023, 7316);
INSERT INTO `goods` VALUES (139, 100006927564, '美的(Midea)639升 对开门冰箱 19分钟急速净味 双变频风冷无霜一级能效 WIFI智能 莫兰迪灰BCD-639WKPZM(E) ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104381/7/15398/92213/5e72cfbaE5bbb8cdb/6fc0bcc9f8e4481d.jpg', 'https://item.jd.com/100006927564.html', NULL, '2', 2020050665, '2020-10-16 18:00:10', 1, 0, 7342, 6704);
INSERT INTO `goods` VALUES (140, 100012755648, '比佛利（BEVERLY）15公斤变频复式洗衣机 高端滚筒洗衣机全自动BVL1FD150ITY6大洗大烘分区同步 国际羊毛绿标 ', 15999, 15999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/132787/17/1253/49927/5ed741acEed614f2e/d79737224f0cf0ec.jpg!q80.dpg', 'https://item.jd.com/100012755648.html', NULL, '3', NULL, '2020-10-16 18:00:10', 1, 0, 1215, 7188);
INSERT INTO `goods` VALUES (141, 100007482275, '美的 （Midea）10公斤美的变频银离子杀菌洗衣机 配 10公斤热泵干衣机MG100T1WDQC+MH100-H1WY ', 9999, 9999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/119646/40/8907/286971/5ee867ddEa4151c93/78487c23bd57df2e.jpg!q80.dpg', 'https://item.jd.com/100007482275.html', NULL, '3', 2020050665, '2020-10-16 18:00:10', 1, 0, 4995, 2415);
INSERT INTO `goods` VALUES (142, 8615274, '小天鹅(LittleSwan)10公斤变频 波轮洗衣机全自动 水魔方防缠绕 智能家电 小京鱼APP控制TB100V80WDCLG ', 3799, 3799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t21703/27/2470119991/79373/3c888f9/5b559875Nf59d2b65.jpg', 'https://item.jd.com/8615274.html', NULL, '3', 2020052047, '2020-10-16 18:00:10', 1, 0, 2530, 3732);
INSERT INTO `goods` VALUES (143, 100011783118, '美的（Midea）燃气灶 钢化玻璃面板 多重安全防护 一级能效 单眼灶 JZY-MQ4501 液化气 ', 599, 599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93368/37/14490/116492/5e687ba0Ed487102b/d4c64e4b437abd56.jpg', 'https://item.jd.com/100011783118.html', NULL, '6', 2020050665, '2020-10-16 18:00:10', 1, 0, 6397, 7027);
INSERT INTO `goods` VALUES (144, 100006410991, '美的（Midea）60升电热水器3200W三档变频健康净浴低耗保温漏电断电手机APP控制F60-32DH6(HEY)  ', 2099, 2099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101333/15/15594/160418/5e71e509Ebb23bdfa/93ce23738e0d7b09.jpg', 'https://item.jd.com/100006410991.html', NULL, '8', 2020050665, '2020-10-16 18:00:10', 1, 0, 3083, 1682);
INSERT INTO `goods` VALUES (145, 100012955050, '美的（Midea）滚筒洗衣机全自动 10公斤变频除螨 双蒸汽恒温洗 高温筒自洁 深层除螨 MG100A5 ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/113914/23/2508/83439/5ea25223E2f447b48/6fa679705d8d0782.jpg!q80.dpg', 'https://item.jd.com/100012955050.html', NULL, '3', 2020050665, '2020-10-16 18:00:10', 1, 0, 7154, 4538);
INSERT INTO `goods` VALUES (146, 100011783312, '美的（Midea）欧式21立方大吸力不碰头一级能效 不锈钢 抽油烟机 CXW-230-TJD1 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98412/5/14905/99682/5e6ca078E889f82ef/ccade590ecc7098b.jpg', 'https://item.jd.com/100011783312.html', NULL, '4', 2020050665, '2020-10-16 18:00:11', 1, 0, 7335, 9823);
INSERT INTO `goods` VALUES (147, 100007889269, '华凌 美的出品 80升电热水器3200W涡旋速热智能零电洗 AI节能健康洗智能APP控制F80-32WJ3 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121082/10/7783/292417/5f1a360dE700590ab/20fa5a8050f2048e.jpg', 'https://item.jd.com/100007889269.html', NULL, '8', 2020052049, '2020-10-16 18:00:11', 1, 0, 9909, 3184);
INSERT INTO `goods` VALUES (148, 100002329687, '美的（Midea）80升电热水器 无线遥控 加长防电墙 健康抑菌 8年包修F80-21BA1(HY) ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108276/13/9110/171742/5e6f3a24E3a6cd5c4/8a747d1b7db844a4.jpg', 'https://item.jd.com/100002329687.html', NULL, '8', 2020050665, '2020-10-16 18:00:11', 1, 0, 2289, 1017);
INSERT INTO `goods` VALUES (149, 100002520317, '美的(Midea)531升 对开门冰箱 双变频 一级能效 温湿精控 铂金净味电冰箱 炫晶灰 BCD-531WKPZM(E) ', 3899, 3899, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/96799/38/15529/81621/5e732754E5e22ee61/d831d0a18270fe0f.jpg!q80.dpg', 'https://item.jd.com/100002520317.html', NULL, '2', 2020050665, '2020-10-16 18:00:11', 1, 0, 2731, 8497);
INSERT INTO `goods` VALUES (150, 100002584447, '美的（Midea）侧吸式抽油烟机灶具套装 20立方爆炒大吸力 自动开合 4.2KW大火力双灶B68C+Q60-T （天然气） ', 3299, 3299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105493/1/13496/168147/5e5cb4cfEd5285a61/3fff0eea66c0aa4d.jpg', 'https://item.jd.com/100002584447.html', NULL, '4', 2020050665, '2020-10-16 18:00:11', 1, 0, 7899, 7705);
INSERT INTO `goods` VALUES (151, 100015779056, '美的（Midea）18升大水量燃气热水器天然气 增压零冷水磁净化健康洗 智能APP控制JSQ34-18HTL7 ', 4799, 4799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112826/5/18952/199511/5f7192e7E203e54dd/76bbbe684fd6bf02.jpg', 'https://item.jd.com/100015779056.html', NULL, '8', 2020050665, '2020-10-16 18:00:11', 1, 0, 2178, 3772);
INSERT INTO `goods` VALUES (152, 100006585533, '美的（Midea）欧式21立方大吸力一级能效 烟灶套装TJD1+JDQ1（液化气） ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98412/5/14905/99682/5e6ca078E889f82ef/ccade590ecc7098b.jpg', 'https://item.jd.com/100006585533.html', NULL, '14', 2020050665, '2020-10-16 18:00:11', 1, 0, 2976, 7468);
INSERT INTO `goods` VALUES (153, 100007834495, '美的 Midea MU163A-4 家用净水器，超滤净水器 ', 1998, 1998, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116199/36/12019/212092/5f093002E609d1bde/845f88519f515562.jpg', 'https://item.jd.com/100007834495.html', NULL, '14', 2020050665, '2020-10-16 18:00:11', 1, 0, 4651, 3377);
INSERT INTO `goods` VALUES (154, 100007440547, '美的（Midea）PT2531 家用多功能电烤箱 25升 机械式操控 上下独立控温 专业烘焙易操作烘烤蛋糕面包 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119500/20/6735/566201/5ec940b2E100c7559/9ac5956d6d31d0d1.jpg', 'https://item.jd.com/100007440547.html', NULL, '13', 2020050665, '2020-10-16 18:00:11', 1, 0, 7540, 1062);
INSERT INTO `goods` VALUES (155, 100003982052, '美的（Midea） 钢化玻璃 4.2KW大火力嵌入式双灶 一级能效 JZT-Q60（天然气） ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/29825/9/10387/58908/5c876ed0E556ee8c7/258017aa42d21744.jpg', 'https://item.jd.com/100003982052.html', NULL, '14', 2020050665, '2020-10-16 18:00:11', 1, 0, 4945, 4012);
INSERT INTO `goods` VALUES (156, 100003028674, '美的60升美的电热水器2100W大功率 经济节能保温型安全防电墙 蓝钻内胆8年包修 美的出品F6021-Y1 ', 599, 599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98752/20/15280/173464/5e6f2898E86cc0acd/1695d1f8b275dbc6.jpg', 'https://item.jd.com/100003028674.html', NULL, '8', 2020050665, '2020-10-16 18:00:11', 1, 0, 2793, 8047);
INSERT INTO `goods` VALUES (157, 100011426470, '美的（Midea）12升燃气热水器天然气线下同款 恒温芯精控恒温开机自检 双重防冻节能JSQ22-12HM1 ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109344/27/8947/85161/5e6f6810E78906645/724e500e29d44108.jpg', 'https://item.jd.com/100011426470.html', NULL, '8', 2020050665, '2020-10-16 18:00:11', 1, 0, 6399, 5047);
INSERT INTO `goods` VALUES (158, 100002858948, '美的（Midea）京品家电 油烟机 欧式抽油烟机 烟灶套装 家用吸油烟机 煤气灶 燃气灶 T33P+Q216B-T（天然气） ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109012/13/1174/57670/5dfb1b1dE66feaffb/c381f6e4ecdd291c.jpg', 'https://item.jd.com/100002858948.html', NULL, '6', 2020050665, '2020-10-16 18:00:11', 1, 0, 6873, 5793);
INSERT INTO `goods` VALUES (159, 100000582149, '小天鹅(LittleSwan)10公斤变频 滚筒洗衣机全自动 智能家电 纳米银离子除菌 全触摸屏 TG100V62WADY5 ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94879/17/3390/57630/5ddf75bfEbec36457/61b41e528f4509ee.jpg', 'https://item.jd.com/100000582149.html', NULL, '3', 2020052047, '2020-10-16 18:00:11', 1, 0, 8687, 4568);
INSERT INTO `goods` VALUES (160, 100004059861, '美的(Midea)426升 多门冰箱 19分钟急速净味 双变频风冷无霜 一级能效 WIFI智能 莫兰迪灰BCD-426WTPZM(E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101251/9/15569/79268/5e72d05dE830f617f/28fc2ce4ec5f5a92.jpg', 'https://item.jd.com/100004059861.html', NULL, '2', 2020050665, '2020-10-16 18:00:11', 1, 0, 5108, 9131);
INSERT INTO `goods` VALUES (161, 100007841479, '美的（Midea）T1-108B 家用多功能迷你小烤箱 10升家用容量 双层烤位 ', 199, 199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129982/20/4070/200043/5f06f980Ead85a400/cc2d09a3feba8058.jpg', 'https://item.jd.com/100007841479.html', NULL, '13', 2020050665, '2020-10-16 18:00:12', 1, 0, 2073, 1580);
INSERT INTO `goods` VALUES (162, 100005217019, '美的（Midea）16升燃气热水器天然气 水气双调自检安防 抑菌水箱智能随温感WIFI操控JSQ30-JM3 ', 2099, 2099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/90968/31/15221/99401/5e6f1688E0966ddb1/8c66b4deb5c95006.jpg', 'https://item.jd.com/100005217019.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 5733, 8426);
INSERT INTO `goods` VALUES (163, 100007482273, '美的 （Midea） 10公斤洗烘套装 美的DD直驱洗衣机 配10公斤热泵式紫外线除菌烘干机 MG100V70WD5+MH100-H1W ', 8999, 8999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/138417/12/1339/101687/5ef16131E230f9953/90921eee3b73fb5d.jpg!q80.dpg', 'https://item.jd.com/100007482273.html', NULL, '12', 2020050665, '2020-10-16 18:00:12', 1, 0, 2922, 7105);
INSERT INTO `goods` VALUES (164, 100007285331, '美的(Midea)325升 三门冰箱19分钟急速净味除菌一级能效双变频智能WiFi操控家用电冰箱 BCD-325WTPZM(E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/125067/17/3707/50105/5ed49890E81335d52/f35176f68fb551de.jpg!q80.dpg', 'https://item.jd.com/100007285331.html', NULL, '2', 2020050665, '2020-10-16 18:00:12', 1, 0, 5974, 9125);
INSERT INTO `goods` VALUES (165, 100008800696, '美的 (Midea)滚筒洗衣机全自动 10公斤变频 东芝DD直驱 除菌蒸汽洗 真丝柔洗 95度筒自洁 MG100KQ5 ', 4699, 4699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89573/24/12881/85199/5e4f8575Ef7ec802a/c1841cf5096e4e61.jpg', 'https://item.jd.com/100008800696.html', NULL, '3', 2020050665, '2020-10-16 18:00:12', 1, 0, 8351, 4614);
INSERT INTO `goods` VALUES (166, 100008049861, '飞利浦（PHILIPS）电动剃须刀野兽派联名款S9041七夕节礼盒 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/147440/25/5130/114352/5f30ab07Ec5bfcaf9/5535304571002e66.jpg', 'https://item.jd.com/100008049861.html', NULL, '15', 2020042790, '2020-10-16 18:00:12', 1, 0, 7909, 2156);
INSERT INTO `goods` VALUES (167, 1453401, '美的（Midea）X3-233A 变频家用微波炉 光波烧烤炉 微波炉电烤一体机 智能湿度感应 900W大火力 低噪音 23升 ', 579, 579, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105772/36/14913/265615/5e69f933E55e85028/02ff3d88b126e3e9.jpg', 'https://item.jd.com/1453401.html', NULL, '14', 2020050665, '2020-10-16 18:00:12', 1, 0, 4166, 9261);
INSERT INTO `goods` VALUES (168, 100002584695, '美的（Midea）侧吸油烟机 宽屏拢烟 直吸直排 17立方+4.2KW燃气灶 B61A+Q60-T（天然气） ', 2199, 2199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/11788/35/11514/139828/5c88c076E65dfcb69/389e03c952f66c31.jpg', 'https://item.jd.com/100002584695.html', NULL, '6', 2020050665, '2020-10-16 18:00:12', 1, 0, 5784, 6661);
INSERT INTO `goods` VALUES (169, 100007097109, '美的（Midea）60升电热水器2200W速热健康洗 安全防漏电一级节能低耗保温APP控制 F6022-J7(HE) ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112792/33/4283/230222/5ead06deE76290d31/6d2f351c20c64dae.jpg', 'https://item.jd.com/100007097109.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 1666, 9930);
INSERT INTO `goods` VALUES (170, 100002584449, '美的（Midea）欧式抽油烟机灶具套装 20立方大吸力 4.2KW大火力双燃气灶 B89C+Q60-T（天然气） ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/81658/24/8416/148629/5d634401Ef7904289/3e7d53c1bd2ab838.jpg', 'https://item.jd.com/100002584449.html', NULL, '6', 2020050665, '2020-10-16 18:00:12', 1, 0, 3286, 5642);
INSERT INTO `goods` VALUES (171, 100013577792, '美的 (Midea)603升 对开门冰箱 大容量 风冷无霜一级能效 智能双变频 WIFI智能 炫晶灰BCD-603WKPZM(E) ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117815/34/8596/245291/5ed06436Efa428fe7/b86300da3d2a3ce4.jpg', 'https://item.jd.com/100013577792.html', NULL, '2', 2020050665, '2020-10-16 18:00:12', 1, 0, 9448, 5971);
INSERT INTO `goods` VALUES (172, 100011621212, '美的 Midea 壁挂式温热两用饮水机 温热一体管线机 MG907-R ', 699, 699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103642/13/13489/89206/5e59d578Ee0b8e2ee/c5bb15f38711cd11.jpg', 'https://item.jd.com/100011621212.html', NULL, '14', 2020050665, '2020-10-16 18:00:12', 1, 0, 7847, 9074);
INSERT INTO `goods` VALUES (173, 100006377098, '美的（Midea）50升电热水器2200W三档宽压变频速热遥控预约 健康抑菌漏电断电F5022-ZA2(HEY) ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92491/19/15117/87345/5e6f1fe8E8e45bc6f/e8acc1f5020693f9.jpg', 'https://item.jd.com/100006377098.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 1095, 5804);
INSERT INTO `goods` VALUES (174, 100011947382, '华凌50升电热水器 2100W速热5倍增容健康洗 无线遥控预约洗浴安全防电墙F5021-YJ2(HY) ', 599, 599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102586/18/15647/151879/5e72ec19E4618cabc/b816211dc7283661.jpg', 'https://item.jd.com/100011947382.html', NULL, '8', 2020052049, '2020-10-16 18:00:12', 1, 0, 3204, 7900);
INSERT INTO `goods` VALUES (175, 100008427397, '美的 Midea 家用油烟机抽油烟机套装 20立方大吸力挥手控制一键蒸汽洗B69+Q70-T ', 5298, 5298, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/147962/15/7145/62289/5f4a49c1E4eebbc62/7dd745155a355be8.jpg', 'https://item.jd.com/100008427397.html', NULL, '4', 2020050665, '2020-10-16 18:00:12', 1, 0, 3514, 6303);
INSERT INTO `goods` VALUES (176, 100015237138, '美的（Midea）60升电热水器智能磁净活水 水质监测 智能杀菌安全零电洗手机APP控制F60-F32CQ8(HEY) ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/143996/32/7806/129364/5f55e5fcE121c8c45/a6ec4d30dfb95225.jpg', 'https://item.jd.com/100015237138.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 4309, 8126);
INSERT INTO `goods` VALUES (177, 100002598301, '美的（Midea）欧式20立方大吸力一级能效 抽油烟机 CXW-260-B89C ', 2699, 2699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/11384/8/12196/73881/5c908a0fEa532a589/3b9265d44531a262.jpg', 'https://item.jd.com/100002598301.html', NULL, '4', 2020050665, '2020-10-16 18:00:12', 1, 0, 7726, 7940);
INSERT INTO `goods` VALUES (178, 100008494476, '小天鹅 （LittleSwan）9公斤 波轮洗衣机全自动 水电双宽 阻尼玻璃门盖 时尚外观 全新免清洗 TB90PURE ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/61006/11/9431/84035/5d721881E7d60bc80/bea5b8b6f9786c80.jpg', 'https://item.jd.com/100008494476.html', NULL, '3', 2020052047, '2020-10-16 18:00:12', 1, 0, 9138, 9924);
INSERT INTO `goods` VALUES (179, 100008224425, '美的 Midea 家用油烟机CXW-280-B69抽油烟机 20立方大吸力挥手控制一键蒸汽洗 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/137200/3/8277/42955/5f471bebE3018e67f/af0c32068fb58526.jpg', 'https://item.jd.com/100008224425.html', NULL, '4', 2020050665, '2020-10-16 18:00:12', 1, 0, 6123, 5248);
INSERT INTO `goods` VALUES (180, 100015237140, '华凌 美的出品13升零冷水燃气热水器天然气 健康净浴智能节能变升开机自检手机APP控制JSQ25-L9 ', 1299, 1299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/140110/37/7694/108354/5f544a26E4c567d8a/039238c9ab2aed49.jpg', 'https://item.jd.com/100015237140.html', NULL, '8', 2020052049, '2020-10-16 18:00:12', 1, 0, 6166, 9236);
INSERT INTO `goods` VALUES (181, 100015588432, '美的 Midea JZT-QW32嵌入式5.0KW大火力燃气灶 ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126117/38/13427/58869/5f6c62d9Ec3fa67b0/4bc1ef332881d5d4.jpg', 'https://item.jd.com/100015588432.html', NULL, '6', 2020050665, '2020-10-16 18:00:12', 1, 0, 8547, 3029);
INSERT INTO `goods` VALUES (182, 100004460497, '美的（Midea）80升电热水器3200W宽压变频速热 健康抑菌 手机APP遥控 加长防电墙F80-32ZA6(HEY) ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99782/27/15215/182407/5e6f239dEcc954bdd/8f56bad6dc396029.jpg', 'https://item.jd.com/100004460497.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 4014, 2896);
INSERT INTO `goods` VALUES (183, 100002347787, '美的（Midea）京品家电 油烟机 欧式抽油烟机 烟灶套装 家用吸油烟机 煤气灶 燃气灶 T33P+Q216B-Y（液化气） ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109612/33/1159/57670/5dfb1cd6Ead6d95f8/509f262a918e58d5.jpg', 'https://item.jd.com/100002347787.html', NULL, '6', 2020050665, '2020-10-16 18:00:12', 1, 0, 4081, 5122);
INSERT INTO `goods` VALUES (184, 100000544374, '美的（Midea）京品家电2100W速热电热水器80升遥控预约洗浴健康洗一键保温加长防电墙F80-15WB5(Y) ', 1049, 1049, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100550/16/15079/211509/5e6f39f1Eb9244477/eb9bfd8e82e55b68.jpg', 'https://item.jd.com/100000544374.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 5292, 4691);
INSERT INTO `goods` VALUES (185, 100011596112, '美的（Midea）13升燃气热水器天然气 水气双调三档节能变升一键厨房洗 双显大屏健康浴JSQ25-JM2 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99070/31/14633/166282/5e68aa31Ede4d1a1f/b936ef1affe1e59c.jpg', 'https://item.jd.com/100011596112.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 3092, 9234);
INSERT INTO `goods` VALUES (186, 100007285321, '美的(Midea) 果润维C冰箱 540升双开门 家用对开门 变频一级能效 智能电冰箱BCD-540WKPZM(E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/116918/14/7374/162754/5ec3561eEd5e48819/fa8d6a5dc13b29a9.jpg!q80.dpg', 'https://item.jd.com/100007285321.html', NULL, '2', 2020050665, '2020-10-16 18:00:12', 1, 0, 3757, 4084);
INSERT INTO `goods` VALUES (187, 100015588420, '美的 Midea JZY-QW32嵌入式燃气灶5.0KW大火力 ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/154747/24/718/58869/5f6c628aEc6495548/4d9c410eb448f32c.jpg', 'https://item.jd.com/100015588420.html', NULL, '6', 2020050665, '2020-10-16 18:00:12', 1, 0, 1893, 3524);
INSERT INTO `goods` VALUES (188, 100006962607, '小天鹅（LittleSwan）10公斤变频 滚筒洗衣机全自动 TG100PURE 智能家电 特色高温除螨洗 BLDC变频电机 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/126494/14/1253/83052/5ebb5574Ed06658b9/e00ce74bd6bf049f.jpg!q80.dpg', 'https://item.jd.com/100006962607.html', NULL, '3', 2020052047, '2020-10-16 18:00:12', 1, 0, 1701, 8582);
INSERT INTO `goods` VALUES (189, 100008550233, '华凌 美的出品 40升电热水器 2100W速热5倍增容健康洗 预约洗浴安全防电墙F4021-YJ2(HY) ', 549, 549, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/118409/21/17199/114295/5f5593a7E9f1de37a/4c33865c10f5b392.jpg', 'https://item.jd.com/100008550233.html', NULL, '8', 2020052049, '2020-10-16 18:00:12', 1, 0, 4394, 5156);
INSERT INTO `goods` VALUES (190, 100006573733, '美的（Midea）16升无级恒温舱零冷水 磁净化健康洗 智能随温感APP控制燃气热水器天然气JSQ30-16HTL8 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105082/29/15174/244111/5e7046e6Ea0663f64/0fff87eb35fac4f6.jpg', 'https://item.jd.com/100006573733.html', NULL, '8', 2020050665, '2020-10-16 18:00:12', 1, 0, 1891, 3813);
INSERT INTO `goods` VALUES (191, 100011720408, '比佛利（BEVERLY）10公斤洗烘一体 全自动滚筒洗衣机 超薄变频 TFT彩屏 高端品质之选 BVL1D100TT ', 8999, 8999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108631/6/7826/122541/5e60a290E6c49a120/9332991d03252b3a.jpg', 'https://item.jd.com/100011720408.html', NULL, '3', NULL, '2020-10-16 18:00:12', 1, 0, 4203, 2009);
INSERT INTO `goods` VALUES (192, 2178964, '美的（Midea）M1-L202B 快捷微波炉 平板加热一键启动 多角度反射内胆 20升 ', 359, 359, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109592/12/8557/251341/5e69f8cbEc93066b0/8c8855afd4465f3a.jpg', 'https://item.jd.com/2178964.html', NULL, '14', 2020050665, '2020-10-16 18:00:12', 1, 0, 6513, 3458);
INSERT INTO `goods` VALUES (193, 100011721202, '比佛利（BEVERLY）洗衣机滚筒 10公斤洗烘一体机 家用大容量 水魔方科技 国际羊毛绿标 BVL1D100EY ', 7999, 7999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108812/15/7761/83579/5e60ac2bE2c2a590d/73a3596576a13f25.jpg', 'https://item.jd.com/100011721202.html', NULL, '3', NULL, '2020-10-16 18:00:12', 1, 0, 3999, 3081);
INSERT INTO `goods` VALUES (194, 100009498998, '美的(Midea)256升 三门冰箱 双变频无霜 小型家用三开门电冰箱 摩卡棕BCD-256WTGPM(E) ', 3399, 3399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86972/31/15307/218773/5e6f3f59Eeb720de2/68b05fd26064fb7d.png', 'https://item.jd.com/100009498998.html', NULL, '2', 2020050665, '2020-10-16 18:00:12', 1, 0, 2281, 3103);
INSERT INTO `goods` VALUES (195, 100007285309, '美的(Midea) 果润维C冰箱 503升十字 家用四开门 双变频一级能效 三档变温智能电冰箱BCD-503WSPZM(E) ', 6099, 6099, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/123190/32/2156/140263/5ec356a7Ef66b268a/d83382934daf2aa4.jpg!q80.dpg', 'https://item.jd.com/100007285309.html', NULL, '2', 2020050665, '2020-10-16 18:00:12', 1, 0, 6385, 1918);
INSERT INTO `goods` VALUES (196, 100012755642, '小天鹅（ LittleSwan）10公斤洗烘一体 水魔方滚筒洗衣机全自动 智能家电 物理去渍更健康 TD100RFTEC 除菌洗 ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/116633/3/2418/146519/5ea165e5E454f2a6d/6e96e349c40f008b.jpg!q80.dpg', 'https://item.jd.com/100012755642.html', NULL, '3', 2020052047, '2020-10-16 18:00:12', 1, 0, 5306, 1918);
INSERT INTO `goods` VALUES (197, 874319, '美的（Midea）EM7KCGW3-NR 快捷微波炉 微电脑操控 平板加热 智能蒸煮菜单 20升 ', 369, 369, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107138/38/8594/342373/5e69f8e8Ee320a092/1a50ecb0e90c1881.jpg', 'https://item.jd.com/874319.html', NULL, '14', 2020050665, '2020-10-16 18:00:12', 1, 0, 1065, 4550);
INSERT INTO `goods` VALUES (198, 100011345076, '小天鹅(LittleSwan)10公斤洗烘一体 滚筒洗衣机全自动 智能家电 银离子除菌 全触摸屏TD100V62WADY5 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85640/12/12739/86314/5e4b8c45E2e6ac9b5/26aeaa64b60e3ed1.jpg', 'https://item.jd.com/100011345076.html', NULL, '3', 2020052047, '2020-10-16 18:00:12', 1, 0, 4348, 8850);
INSERT INTO `goods` VALUES (199, 100008977695, '小天鹅 LittleSwan 超微净泡水魔方系列 10公斤洗烘一体 滚筒洗衣机全自动 智能家电 除菌洗TD100RFTEC-T50C ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125399/2/14127/61817/5f7be58cE91ea11a5/41e044ffb3e186e9.jpg', 'https://item.jd.com/100008977695.html', NULL, '3', 2020052047, '2020-10-16 18:00:12', 1, 0, 8965, 1023);
INSERT INTO `goods` VALUES (200, 100007576046, '美的（Midea）欧式 17大吸力宽屏拢烟不锈钢抽油烟机B80S ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/45330/16/5178/48408/5d2effbeE900d84a8/cbc4eef2a4769270.jpg', 'https://item.jd.com/100007576046.html', NULL, '4', 2020050665, '2020-10-16 18:00:12', 1, 0, 3833, 5653);
INSERT INTO `goods` VALUES (201, 100003028676, '美的（Midea） 华凌50升电热水器2100W大功率 经济节能保温型安全防电墙 蓝钻内胆8年包修F5021-Y1 ', 549, 549, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97100/31/16161/173464/5e78afcfE337b5006/d159de7190def1ba.jpg', 'https://item.jd.com/100003028676.html', NULL, '8', 2020050665, '2020-10-16 18:00:13', 1, 0, 8806, 1573);
INSERT INTO `goods` VALUES (202, 100003061465, '创维（SKYWORTH）75Q80 75英寸4K超高清HDR 超大屏物联网 网络WIFI 液晶平板电视机 线下同款 ', 29999, 29999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105740/19/8210/161743/5e01e901Ea2cfcb7c/a7fdd110a7da0d0a.jpg', 'https://item.jd.com/100003061465.html', NULL, '1', 2020033015, '2020-10-16 18:00:13', 1, 0, 5334, 8657);
INSERT INTO `goods` VALUES (203, 2607373, '西门子（SIEMENS）大吸力 大风压 自清洁 油烟机套装 智能联动抽油烟机燃气灶两件套 欧式吸烟机45SK92+233MP ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/52293/35/12299/160577/5d922217E35c9dac7/9f08aca46cbdd99b.jpg', 'https://item.jd.com/2607373.html', NULL, '6', 2020050626, '2020-10-16 18:00:13', 1, 0, 1732, 6933);
INSERT INTO `goods` VALUES (204, 859430, '西门子（SIEMENS）原装进口 省空间除菌独立式家用洗碗机 9套SR23E850TI ', 5990, 5990, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t172/4/2768266395/106370/9338ea6e/53d8a890N1ec3ecb8.jpg', 'https://item.jd.com/859430.html', NULL, '10', 2020050626, '2020-10-16 18:00:13', 1, 0, 1299, 6660);
INSERT INTO `goods` VALUES (205, 100015786944, '美菱（MELING）电热水龙头 冷热两用快速加热厨房宝 数显即热式下进水电热水器 MF-D305 ', 229, 229, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125664/39/13598/46668/5f71bd05E1e6c4958/210b31ea5038ecc3.jpg', 'https://item.jd.com/100015786944.html', NULL, '8', 2020052059, '2020-10-16 18:00:13', 1, 0, 7823, 9009);
INSERT INTO `goods` VALUES (206, 7652511, '西门子（SIEMENS）德国进口 8种洗涤 专利晶蕾烘干 家居互联 半嵌式家用洗碗机 （银色）13套SN578S06TC ', 17099, 17099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/137980/18/2302/325396/5f03137cE65ecebe6/b9f2c037e3a9d297.jpg', 'https://item.jd.com/7652511.html', NULL, '10', 2020050626, '2020-10-16 18:00:13', 1, 0, 5453, 3681);
INSERT INTO `goods` VALUES (207, 4656114, '西门子（SIEMENS）高端不锈钢燃气灶 智能烟灶联动 嵌入式煤气灶自营天然气灶双灶 K25EMP（天然气） ', 2949, 2949, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108861/18/197/258418/5df33edeE7bac4a4a/96856d97c4a969e4.jpg', 'https://item.jd.com/4656114.html', NULL, '6', 2020050626, '2020-10-16 18:00:13', 1, 0, 9713, 4416);
INSERT INTO `goods` VALUES (208, 4432170, '西门子（SIEMENS）ER71F23EMP 钢化玻璃 快速点火 嵌入式燃气灶（天然气）JZT- ER71F23EMP ', 2090, 2090, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/16224/4/10837/76594/5c8b2025Ef8f6820e/f23af9d5dba74154.jpg', 'https://item.jd.com/4432170.html', NULL, '6', 2020050626, '2020-10-16 18:00:13', 1, 0, 8657, 6626);
INSERT INTO `goods` VALUES (209, 100007251364, '老板（Robam） 大吸力免拆洗触控侧吸式家用抽油烟机燃气灶洗碗机套装 27A3H+57B2+W771（天然气） ', 9118, 9118, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/76941/33/6565/125917/5d4a232cEce722773/a422b9a45116c2ad.jpg', 'https://item.jd.com/100007251364.html', NULL, '10', 2020050697, '2020-10-16 18:00:13', 1, 0, 7067, 7945);
INSERT INTO `goods` VALUES (210, 100003753081, '小米 米家照片打印机 特惠套装 ', 699, 699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89869/4/14748/150472/5e68dc33Eb639d837/67764a9af12905b6.jpg', 'https://item.jd.com/100003753081.html', NULL, '14', 2020042785, '2020-10-16 18:00:13', 1, 0, 4014, 9104);
INSERT INTO `goods` VALUES (211, 1571541, '西门子（SIEMENS）61升 10A 原装进口电烤箱 HB23AB522W ', 5550, 5550, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/22257/9/14771/175081/5cab2eb7E833d6fba/ad42f00597c12a03.jpg', 'https://item.jd.com/1571541.html', NULL, '13', 2020050626, '2020-10-16 18:00:13', 1, 0, 7389, 5080);
INSERT INTO `goods` VALUES (212, 2607366, '西门子（SIEMENS抽油烟机烟灶套装大吸力吸油烟机侧吸式油烟机灶具套装 天然气 SA95EW+EA23JMP ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119431/3/2513/209869/5eaab85cE55e97a4b/e8e3c69d66322111.jpg', 'https://item.jd.com/2607366.html', NULL, '4', 2020050626, '2020-10-16 18:00:13', 1, 0, 6637, 5705);
INSERT INTO `goods` VALUES (213, 100014567198, '西门子（SIEMENS）502升超薄对开门冰箱 新款纤薄 易嵌入 风冷无霜 白色 KA50NE20TI ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119036/22/14101/27316/5f293c75E6cb6bd10/eff8b74e2bc64ad0.jpg', 'https://item.jd.com/100014567198.html', NULL, '2', 2020050626, '2020-10-16 18:00:13', 1, 0, 6467, 6094);
INSERT INTO `goods` VALUES (214, 100004750972, '老板（Robam）挥手智控欧式触屏大吸力油烟机燃气灶具洗碗机套装67A1H+56B0+W771（天然气） ', 8198, 8198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/29696/4/13939/115351/5cb4982dE757b58ac/6edd54d6da48f7d1.jpg', 'https://item.jd.com/100004750972.html', NULL, '10', 2020050697, '2020-10-16 18:00:13', 1, 0, 3840, 6103);
INSERT INTO `goods` VALUES (215, 100002407694, '老板（Robam）魔厨MAX 侧吸式抽油烟机燃气灶具蒸烤套装27A3H+37B2T+S273+R073（天然气） ', 13038, 13038, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102765/9/1226/134920/5dbbee0cE866db142/12639f39f80522b3.jpg', 'https://item.jd.com/100002407694.html', NULL, '6', 2020050697, '2020-10-16 18:00:13', 1, 0, 4799, 4080);
INSERT INTO `goods` VALUES (216, 1777021, '西门子（SIEMENS）原装进口 新平台除菌独立式家用洗碗机 13套SN23E232TI ', 6390, 6390, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/36169/8/591/171184/5cab1d61E48c8b4b4/6fd38135b454b2f0.jpg', 'https://item.jd.com/1777021.html', NULL, '10', 2020050626, '2020-10-16 18:00:13', 1, 0, 1449, 4201);
INSERT INTO `goods` VALUES (217, 100014557392, '万家乐 50升电热水器 2500W速热 出水断电零电洗 健康除菌 机控分离遥控款D50-S3.1 ', 1398, 1398, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/141320/33/4589/198017/5f290f3cEf8f36e4a/b9e92d1a17c4a6b8.jpg', 'https://item.jd.com/100014557392.html', NULL, '8', 2020052036, '2020-10-16 18:00:13', 1, 0, 8488, 9541);
INSERT INTO `goods` VALUES (218, 100001487498, '米的(mediy)(37-70英寸)电视挂架 电视架 电视支架 仰角调节 50/55/60/70小米海信海尔TCL夏普 M20T ', 79, 79, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93107/17/3696/253042/5de219b5Ee10c205f/cee534153bb2a091.jpg', 'https://item.jd.com/100001487498.html', NULL, '1', NULL, '2020-10-16 18:00:13', 1, 0, 7566, 2418);
INSERT INTO `goods` VALUES (219, 100007251382, '老板（Robam） 大吸力免拆洗触控侧吸式家用抽油烟机燃气灶蒸烤一体机套装 27A3H+57B2+C973A（天然气） ', 10858, 10858, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/82722/30/6528/149215/5d4a2386Ed98dfe50/aa50b5fc01ddfc66.jpg', 'https://item.jd.com/100007251382.html', NULL, '6', 2020050697, '2020-10-16 18:00:13', 1, 0, 8435, 3773);
INSERT INTO `goods` VALUES (220, 100000899338, '松下（Panasonic）MC-SD787吸擦两用无线除螨大吸力充电式吸尘器 （熔岩灰） ', 3299, 3299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105881/6/13543/49591/5e58c828E9602f71e/6a82ad9d7be1c90e.jpg', 'https://item.jd.com/100000899338.html', NULL, '14', 2020042842, '2020-10-16 18:00:13', 1, 0, 5391, 8871);
INSERT INTO `goods` VALUES (221, 100007477721, '康佳 KONKA 55英寸会议平板电视 智能触摸一体机电子白板 无线传屏投影 显示器一体机视频会议商用电视55K1 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/148564/12/330/221639/5ee0b2fdEa2e0b622/6d89e4cc318c7dd5.jpg', 'https://item.jd.com/100007477721.html', NULL, '1', 2020033018, '2020-10-16 18:00:13', 1, 0, 3144, 8358);
INSERT INTO `goods` VALUES (222, 100007822395, '康佳KONKA智能会议平板双系统全新西柚互联远程视频会议交互式电子白板一体机65英寸+i5模块（PC模块）65K1 ', 19999, 19999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/139661/13/2647/121996/5f0824c0Eea92cb37/6273905efd88cb00.jpg', 'https://item.jd.com/100007822395.html', NULL, '14', 2020033018, '2020-10-16 18:00:13', 1, 0, 9657, 9894);
INSERT INTO `goods` VALUES (223, 100014276602, '康佳 KONKA 55英寸会议平板电视 含移动推车一体机电子白板 无线传屏投影 西柚互联视频会议商用电视55K1 ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/147383/38/3365/70135/5f151b7dE39583f36/5a5c0ad19ab17d36.jpg', 'https://item.jd.com/100014276602.html', NULL, '1', 2020033018, '2020-10-16 18:00:13', 1, 0, 3063, 5512);
INSERT INTO `goods` VALUES (224, 100014228786, '康佳 KONKA 55英寸会议平板电视 双系统麦克风摄像头一体机电子白板 传屏投影 西柚互联视频会议商用电视55K1 ', 9999, 9999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121054/2/7335/123804/5f0ecccaE6002d761/2ee6afd354ddde72.jpg', 'https://item.jd.com/100014228786.html', NULL, '1', 2020033018, '2020-10-16 18:00:13', 1, 0, 5794, 1848);
INSERT INTO `goods` VALUES (225, 8302286, '松下 Panasonic MC-WDC85充电式手持无线无绳大功率大吸力除螨家用吸尘器（红色） ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100553/5/12773/53062/5e50a1caE3aa32ba9/fbd755ce4211dc3a.jpg', 'https://item.jd.com/8302286.html', NULL, '14', 2020042842, '2020-10-16 18:00:13', 1, 0, 6227, 8924);
INSERT INTO `goods` VALUES (226, 7731581, '小熊（Bear）干衣机x2F烘干机 家用多功能衣服暖风机 高温除菌智能定时小型烘被机HGJ-A08Q1 ', 369, 369, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/39135/18/1886/189233/5cbea948Ea8217d09/46f03d0f9c369d5a.jpg', 'https://item.jd.com/7731581.html', NULL, '12', 2020042873, '2020-10-16 18:00:13', 1, 0, 8219, 1596);
INSERT INTO `goods` VALUES (227, 100014146446, '康佳 KONKA 65英寸会议平板电视含移动推车 智能触摸电子白板显示器一体机视频会议商用电视65K1 ', 15999, 15999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116524/15/11991/109389/5f082606Ee57b60fa/d12ccdbb696f972b.jpg', 'https://item.jd.com/100014146446.html', NULL, '1', 2020033018, '2020-10-16 18:00:13', 1, 0, 3865, 7986);
INSERT INTO `goods` VALUES (228, 100010772050, '老板（Robam）5300挥手感应大吸力侧吸油烟机 ', 3690, 3690, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105786/28/7247/110287/5df9b3c2Ea7fdfdd5/7e018898228a8f75.jpg', 'https://item.jd.com/100010772050.html', NULL, '4', 2020050697, '2020-10-16 18:00:13', 1, 0, 6028, 3426);
INSERT INTO `goods` VALUES (229, 100011618794, '老板（Robam）7B19聚中劲火家用双灶具燃气灶（天然气） ', 1380, 1380, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/90585/18/14062/137184/5e61a6d0E2adf65cc/f10e31c54be2b3c1.jpg!q80.dpg', 'https://item.jd.com/100011618794.html', NULL, '6', 2020050697, '2020-10-16 18:00:13', 1, 0, 7780, 3964);
INSERT INTO `goods` VALUES (230, 100005984379, '老板（Robam）7B26聚中劲火家用双灶具燃气灶（天然气） ', 2399, 2399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87206/8/7067/172342/5df9b6b8E313653d5/5decc438962f0a28.jpg', 'https://item.jd.com/100005984379.html', NULL, '6', 2020050697, '2020-10-16 18:00:13', 1, 0, 8934, 3379);
INSERT INTO `goods` VALUES (231, 100003335847, '飞利浦(PHILIPS)电动剃须刀水洗往复式干湿两用升级版小T刀男女士剃毛器胡须刮胡刀One blade QP2533x2F10 ', 249, 249, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/66113/33/4792/50442/5d2d7afeEc503f59e/3e6946312564208c.jpg', 'https://item.jd.com/100003335847.html', NULL, '15', 2020042790, '2020-10-16 18:00:13', 1, 0, 5557, 7796);
INSERT INTO `goods` VALUES (232, 3200732, '能率（NORITZ）燃气热水器16升 智能精控恒温 水量伺服器 一键节能 防冻GQ-16E4AFEX（天然气）（JSQ31-E4） ', 3498, 3498, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99807/24/15325/186539/5e6f3399Ec6e5e328/3fb4ee61f80c9845.jpg', 'https://item.jd.com/3200732.html', NULL, '8', 2020052070, '2020-10-16 18:00:13', 1, 0, 8518, 2185);
INSERT INTO `goods` VALUES (233, 100005864524, '海信（Hisense）HZ55E3D-PRO 55英寸 AI声控 MEMC防抖 无边全面屏 教育电视 ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101680/18/4895/302181/5dea1424E37e3ba0b/b0f51145e633a983.jpg', 'https://item.jd.com/100005864524.html', NULL, '1', 2020033057, '2020-10-16 18:00:13', 1, 0, 5074, 7634);
INSERT INTO `goods` VALUES (234, 100005864524, '海信（Hisense）HZ55E3D-PRO 55英寸 AI声控 MEMC防抖 无边全面屏 教育电视 ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101680/18/4895/302181/5dea1424E37e3ba0b/b0f51145e633a983.jpg', 'https://item.jd.com/100005864524.html', NULL, '1', 2020033057, '2020-10-16 18:00:14', 1, 0, 4710, 9006);
INSERT INTO `goods` VALUES (235, 3596581, '松下（Panasonic）NN-DS1000 变频蒸汽微波炉 烧烤烘焙一体 一级能效 27升 ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t20059/91/1016646407/142257/22ffe589/5b110523Nab5b48c2.jpg', 'https://item.jd.com/3596581.html', NULL, '14', 2020042842, '2020-10-16 18:00:14', 1, 0, 8364, 9186);
INSERT INTO `goods` VALUES (236, 100001108821, '米的(mediy)(32-65英寸)多功能旋转伸缩电视挂架 电视架 电视支架 48/50/55/60海尔夏普小米 M50 ', 219, 219, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91767/39/3752/272340/5de21a07E0bac527d/e3119aa413610a3f.jpg', 'https://item.jd.com/100001108821.html', NULL, '1', NULL, '2020-10-16 18:00:14', 1, 0, 9982, 5200);
INSERT INTO `goods` VALUES (237, 100001487510, '米的(mediy)(37-70英寸)多功能旋转伸缩电视挂架 电视架 电视支架 50/55/60/70海尔夏普小米 M51 ', 219, 219, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96466/12/3752/267181/5de21a38Ee0f57278/9948e4318c133d65.jpg', 'https://item.jd.com/100001487510.html', NULL, '1', NULL, '2020-10-16 18:00:14', 1, 0, 8621, 6196);
INSERT INTO `goods` VALUES (238, 100002685149, '美的( Midea)200升空气能热水器 E+蓝钻内胆家用分体式热水器十年包修RSJF-V40x2FRN1-B01-200-(E1)（1级能效） ', 12699, 12699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107560/28/4410/157860/5e1fda5fEaba33014/0e8508235bec886c.jpg', 'https://item.jd.com/100002685149.html', NULL, '8', 2020050665, '2020-10-16 18:00:14', 1, 0, 6873, 4195);
INSERT INTO `goods` VALUES (239, 100007879677, '松下(Panasonic)滚筒洗衣机全自动10公斤 洗烘一体机 智能烘干 除螨除菌 曲美喷涂视窗XQG100-EGASD ', 5298, 5298, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/116087/36/12279/67605/5f0fab11E8d61d503/4c122fff24936185.jpg!q80.dpg', 'https://item.jd.com/100007879677.html', NULL, '3', 2020042842, '2020-10-16 18:00:14', 1, 0, 6006, 7107);
INSERT INTO `goods` VALUES (240, 100007879705, '松下(Panasonic)滚筒洗衣机全自动10公斤 高温除菌 变频三维立体洗 曲美喷涂视窗 XQG100-E10SD银色 ', 4298, 4298, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/145674/3/3085/67377/5f0fabd3E838f4e82/806a7212b46cfdb6.jpg!q80.dpg', 'https://item.jd.com/100007879705.html', NULL, '3', 2020042842, '2020-10-16 18:00:14', 1, 0, 9347, 4324);
INSERT INTO `goods` VALUES (241, 100006252795, '华帝（VATTI）油烟机 侧吸式抽油烟机燃气灶具烟灶套装 22大吸力挥手 自动清洗防干烧CXW-260-i11140(天然气) ', 4499, 4499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91409/22/15158/158997/5e6f1d0bE00ccf395/220b7f73ab1ce484.jpg', 'https://item.jd.com/100006252795.html', NULL, '6', 2020050688, '2020-10-16 18:00:15', 1, 0, 1981, 1079);
INSERT INTO `goods` VALUES (242, 100013737178, '飞科 FLYCO电吹风机家用LED温度显示 FH6286 1800W ', 269, 269, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126733/36/4446/65066/5ede1a44Ef796e00f/09771386f8fcb6bf.jpg', 'https://item.jd.com/100013737178.html', NULL, '15', 2020052009, '2020-10-16 18:00:15', 1, 0, 7974, 9199);
INSERT INTO `goods` VALUES (243, 7390441, '卡萨帝（Casarte）358升无霜变频意式三门冰箱 干湿分储 细胞级养鲜 红外恒温 BCD-358WDCQU1 ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91684/12/15440/62729/5e6efabdE9ad38bab/9a3c339d4a33a9eb.jpg', 'https://item.jd.com/7390441.html', NULL, '2', 2020052078, '2020-10-16 18:00:15', 1, 0, 3081, 9038);
INSERT INTO `goods` VALUES (244, 100013736530, '海信（Hisense）43E2F-PRO 43英寸 Unibody圆角设计 蓝牙遥控语音 多屏互动 教育 悬浮全面屏智慧语音电视 ', 1449, 1449, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/111873/39/12521/121108/5f117170Edb1fa374/8239cd1671a4f976.jpg!q80.dpg', 'https://item.jd.com/100013736530.html', NULL, '1', 2020033057, '2020-10-16 18:00:15', 1, 0, 4041, 7776);
INSERT INTO `goods` VALUES (245, 10021220186875, 'TCL壁挂式空调 新三级能效 静音省电 冷暖空调 直流变频 柔湿制冷 健康除菌智清洁 KFRd-35GWD-XA81Bp(B3) ', 1799, 1799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121570/35/11921/133913/5f534a1eEcc453382/c6eff4f00014a168.jpg', 'https://item.jd.com/10021220186875.html', NULL, '5', 2020033093, '2020-10-16 18:00:15', 1, 0, 9388, 8376);
INSERT INTO `goods` VALUES (246, 100008118245, '松下 Panasonic MC-S11V 蒸汽清洁机 蒸汽拖把 家用擦地拖地 高温蒸汽除菌除螨 手持吸尘器（紫色） ', 699, 699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113983/16/14243/23496/5f2b6e1fE8772e38b/a078fb9d6ffd623d.jpg', 'https://item.jd.com/100008118245.html', NULL, '14', 2020042842, '2020-10-16 18:00:15', 1, 0, 1569, 6776);
INSERT INTO `goods` VALUES (247, 100013228758, '方太（FOTILE） EM72T.S+HC8BE（液化气） 油烟机 烟灶套装 大火力烟灶套装 自动升降云魔方 ', 6099, 6099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120907/24/2747/354848/5ec80e2eEdc1858ce/f8e025213d9f7cf2.jpg', 'https://item.jd.com/100013228758.html', NULL, '4', 2020050693, '2020-10-16 18:00:15', 1, 0, 5505, 1239);
INSERT INTO `goods` VALUES (248, 100007693052, '帅康（Sacon） 高端家用台式洗碗机 智能高温除菌洗带烘干 6-8人家用快速洗嵌入式洗碗机 XTD6T-S521 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/74201/27/7800/80189/5d5cddb4Ef8d44cef/cfcb6201de8cb5de.jpg', 'https://item.jd.com/100007693052.html', NULL, '10', NULL, '2020-10-16 18:00:15', 1, 0, 6633, 9534);
INSERT INTO `goods` VALUES (249, 100003717794, '能率（NORITZ）燃气热水器16升 京品家电 智能精控恒温 双控温技术 防冻GQ-16JD01FEX（天然气JSQ31-JD01） ', 2998, 2998, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94567/24/15128/208012/5e6f349bE2d2e4b4c/da0f9bcc74a5aaae.jpg', 'https://item.jd.com/100003717794.html', NULL, '8', 2020052070, '2020-10-16 18:00:15', 1, 0, 4466, 7089);
INSERT INTO `goods` VALUES (250, 10021220186874, 'TCL壁挂式空调 新三级能效 静音省电 冷暖空调 直流变频 柔湿制冷 健康除菌智清洁 KFRd-26GWD-XA81Bp(B3) ', 1649, 1649, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/138195/31/7581/134652/5f534a0fEb933b920/d3c4cd118d562f27.jpg', 'https://item.jd.com/10021220186874.html', NULL, '5', 2020033093, '2020-10-16 18:00:15', 1, 0, 6517, 2682);
INSERT INTO `goods` VALUES (251, 100005179484, '创维（SKYWORTH）82Q80 82英寸4K超高清HDR 超大屏物联网 网络WIFI 液晶平板电视机 线下同款 ', 39999, 39999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100265/11/8251/161864/5e01e927Ec554bf95/db9417f09f3a04ed.jpg', 'https://item.jd.com/100005179484.html', NULL, '1', 2020033015, '2020-10-16 18:00:15', 1, 0, 1879, 1371);
INSERT INTO `goods` VALUES (252, 7457406, '美的（Midea）名爵 34L嵌入式微蒸烤一体机 功能三合一 家用多功能烘焙嵌入式微波炉蒸箱烤箱 TR934FMJ-SSW ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93593/36/11438/117996/5e37985fE6024e203/cda938d2b7682cb7.jpg', 'https://item.jd.com/7457406.html', NULL, '13', 2020050665, '2020-10-16 18:00:15', 1, 0, 8020, 5261);
INSERT INTO `goods` VALUES (253, 100003343611, '老板（Robam）蒸箱 嵌入式 35L全屏触控外置水箱蒸汽炉ZQB350-S271A ', 4299, 4299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/38634/2/7897/290024/5cf22545Eebf0d612/28c473e160f6c7f1.jpg', 'https://item.jd.com/100003343611.html', NULL, '14', 2020050697, '2020-10-16 18:00:15', 1, 0, 7546, 1661);
INSERT INTO `goods` VALUES (254, 100008167523, '老板 （Robam） 28A0+57B2+701A+CQ975顶侧双吸油烟机燃气灶消毒柜套装烟灶消蒸烤箱一体机套装（天然气） ', 14797, 14797, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122732/15/9320/63744/5f31fe0cE86062c05/64e53b89a943ff54.jpg', 'https://item.jd.com/100008167523.html', NULL, '13', 2020050697, '2020-10-16 18:00:15', 1, 0, 9662, 9031);
INSERT INTO `goods` VALUES (255, 100008967894, '松下（Panasonic）空气消毒机净化器家用 除细菌病毒除甲醛除PM2.5雾霾 加湿净化 入门款F-VJL55C2 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/138417/16/6024/62298/5f3e4c9cEa112f7f6/90921eee3b73fb5d.jpg!q80.dpg', 'https://item.jd.com/100008967894.html', NULL, '14', 2020042842, '2020-10-16 18:00:15', 1, 0, 9958, 8641);
INSERT INTO `goods` VALUES (256, 100013272206, '万家乐 60升扁桶电热水器 3200W双擎速热 双胆节能洗 遥控预约洗浴 自动保温 剩余水量显示 智能防冻D60-DB1 ', 1798, 1798, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116606/33/11099/330139/5ef71279E0f5be26a/94b176e6a569baf9.jpg', 'https://item.jd.com/100013272206.html', NULL, '8', 2020052036, '2020-10-16 18:00:15', 1, 0, 4615, 3750);
INSERT INTO `goods` VALUES (257, 100014952546, '老板（Robam）27A2H+57B2+CQ975A+W770A 侧吸式油烟机燃气灶具嵌入式蒸烤一体机洗碗机四件套装 ', 16297, 16297, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120177/18/10815/80212/5f437380E66877be4/3c0092a98ec59c3b.jpg', 'https://item.jd.com/100014952546.html', NULL, '10', 2020050697, '2020-10-16 18:00:15', 1, 0, 1370, 6598);
INSERT INTO `goods` VALUES (258, 100010494006, '老板（Robam） 侧吸式油烟机四件套 抽油烟机燃气灶具嵌入式蒸烤一体机洗碗机套装27A3H+37B2+C973A+W770A ', 15397, 15397, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105762/38/9493/137083/5e103aa1Ec1e41393/2eaa2a88ec87a868.jpg', 'https://item.jd.com/100010494006.html', NULL, '10', 2020050697, '2020-10-16 18:00:15', 1, 0, 3960, 4143);
INSERT INTO `goods` VALUES (259, 100014152412, '美的（Midea）新能效KFR-35GWBP2DN8Y-DH400(3) 1.5匹 变频冷暖 空调挂机 三级能效（标准安装企业购） ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125063/32/6667/119627/5f06c61fE2ddfd7f4/346af215a1ba9565.jpg', 'https://item.jd.com/100014152412.html', NULL, '5', 2020050665, '2020-10-16 18:00:15', 1, 0, 3582, 6919);
INSERT INTO `goods` VALUES (260, 100014952514, '老板（Robam）27A2H+57B2+XB701A侧吸式家用22立方吸油烟机燃气灶消毒柜烟灶消三件套 （天然气） ', 7898, 7898, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/131203/19/8025/72653/5f437060E3f97ee34/3a497f30779ee69c.jpg', 'https://item.jd.com/100014952514.html', NULL, '9', 2020050697, '2020-10-16 18:00:15', 1, 0, 2247, 3145);
INSERT INTO `goods` VALUES (261, 100014665422, '老板（ Robam ）28A0+57B2T+XB701A顶侧双吸式抽油烟机燃气灶消毒柜三件套（天然气） ', 9498, 9498, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/136956/27/6627/50119/5f31fd43Ea71c74fe/de1540dc84a33100.jpg', 'https://item.jd.com/100014665422.html', NULL, '9', 2020050697, '2020-10-16 18:00:15', 1, 0, 8182, 6242);
INSERT INTO `goods` VALUES (262, 1865259, '美的（Midea）取暖器x2F电暖器x2F电暖气片家用 节能省电 静音加湿烘衣 13片大面积劲暖电热油汀NY2513-16JW ', 359, 359, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105525/12/10604/254129/5e1ee2e9E5b4be63c/6968202a0728cd48.jpg', 'https://item.jd.com/1865259.html', NULL, '14', 2020050665, '2020-10-16 18:00:15', 1, 0, 4398, 5743);
INSERT INTO `goods` VALUES (263, 100009253888, '方太（FOTILE） 抽油烟机燃气灶13L燃气热水器 欧式油烟机搭配大面板灶具 烟灶热三件套 EMC5+HC26BE+13DES ', 7599, 7599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106714/19/15175/171884/5e6ccc13E8663f262/4e6716e997959712.jpg', 'https://item.jd.com/100009253888.html', NULL, '8', 2020050693, '2020-10-16 18:00:15', 1, 0, 5752, 7484);
INSERT INTO `goods` VALUES (264, 100004516487, '海信（Hisense）HZ50E3D 50英寸 4K HDR 无边全面屏 AI人工智能 智慧语音 教育电视 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95236/2/4997/243844/5dea2274E2e9b3dac/bb6a621ec66b45cb.jpg', 'https://item.jd.com/100004516487.html', NULL, '1', 2020033057, '2020-10-16 18:00:15', 1, 0, 1737, 2401);
INSERT INTO `goods` VALUES (265, 100004516487, '海信（Hisense）HZ50E3D 50英寸 4K HDR 无边全面屏 AI人工智能 智慧语音 教育电视 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95236/2/4997/243844/5dea2274E2e9b3dac/bb6a621ec66b45cb.jpg', 'https://item.jd.com/100004516487.html', NULL, '1', 2020033057, '2020-10-16 18:00:15', 1, 0, 7488, 7978);
INSERT INTO `goods` VALUES (266, 100008822413, '老板Robam 60A1+57B2+XB701A+CQ975欧式双腔大吸力挥手智控吸油烟机燃气灶消毒柜蒸烤一体机套装（天然气） ', 14097, 14097, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/140443/12/9119/61413/5f6aee81Eb7ee3298/89e9843a472b68e7.jpg', 'https://item.jd.com/100008822413.html', NULL, '9', 2020050697, '2020-10-16 18:00:15', 1, 0, 7264, 9630);
INSERT INTO `goods` VALUES (267, 100013054910, '方太（FOTILE） JCD7+HT8BE.S+J45ES 油烟机 抽油烟机燃气灶 消毒柜 烟灶消三件套侧吸式 挥手智控 ', 7599, 7599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/118726/13/4723/85804/5eafaa3fE6b4a28b3/ba17d5eadf534f1d.jpg', 'https://item.jd.com/100013054910.html', NULL, '9', 2020050693, '2020-10-16 18:00:15', 1, 0, 5707, 3334);
INSERT INTO `goods` VALUES (268, 100015024672, '方太（FOTILE）EMC5+HT8BE.S+J45ES 油烟机 抽油烟机家用 消毒柜 欧式烟灶消套餐 纯平触控云魔方 ', 6799, 6799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120385/27/10980/96868/5f47713fEd8c7041c/acd6938117e36344.jpg', 'https://item.jd.com/100015024672.html', NULL, '9', 2020050693, '2020-10-16 18:00:15', 1, 0, 9340, 3739);
INSERT INTO `goods` VALUES (269, 100006961352, '九阳（Joyoung）破壁机多功能家用预约加热破壁绞肉榨汁机豆浆机料理机 果汁机辅食机 L18-Y31【邓伦推荐】 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93060/23/13560/87674/5e577433Ea9e8f0d3/c0e660cf0007ab8a.jpg', 'https://item.jd.com/100006961352.html', NULL, '14', 2020050627, '2020-10-16 18:00:15', 1, 0, 6004, 3441);
INSERT INTO `goods` VALUES (270, 100006961352, '九阳（Joyoung）破壁机多功能家用预约加热破壁绞肉榨汁机豆浆机料理机 果汁机辅食机 L18-Y31【邓伦推荐】 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93060/23/13560/87674/5e577433Ea9e8f0d3/c0e660cf0007ab8a.jpg', 'https://item.jd.com/100006961352.html', NULL, '14', 2020050627, '2020-10-16 18:00:15', 1, 0, 4634, 7163);
INSERT INTO `goods` VALUES (271, 100007678937, '方太（FOTILE）JCD2+HT8BE.S+D13F1 油烟机 抽油烟机燃气灶 热水器 烟灶热三件套 挥手智控 大风量 ', 7299, 7299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/147181/34/2551/80680/5f07b3f6Ecab5c77b/22a28dff3a21c92f.jpg', 'https://item.jd.com/100007678937.html', NULL, '8', 2020050693, '2020-10-16 18:00:15', 1, 0, 8174, 6241);
INSERT INTO `goods` VALUES (272, 100006427693, '卡萨帝 （Casarte）60升电热水器家用 钛金恒护系统 纤巧小体积 10倍大水量 净水洗 一级能效CEC-60MAX3(U1) ', 4599, 4599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99837/27/15247/145885/5e7040b6E46dee3bd/8faeec21093393a4.jpg', 'https://item.jd.com/100006427693.html', NULL, '8', 2020052078, '2020-10-16 18:00:15', 1, 0, 9524, 9081);
INSERT INTO `goods` VALUES (273, 100015652710, '老板（Robam）60A1+57B2T+CQ975欧式双腔双拢大吸力挥手智控吸油烟机燃气灶蒸烤一体机多件套（天然气） ', 10499, 10499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/128879/37/13166/101442/5f6adf75E6b1eb5f8/731b6fa33c87aa89.jpg', 'https://item.jd.com/100015652710.html', NULL, '6', 2020050697, '2020-10-16 18:00:15', 1, 0, 6555, 5518);
INSERT INTO `goods` VALUES (274, 100013931648, '方太（FOTILE） JCD2+HT8BE.S+J45ES 油烟机 抽油烟机燃气灶 消毒柜 烟灶消三件套侧吸式 挥手智控 ', 7399, 7399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/128881/11/5374/349113/5eef6f6fE9f5c508f/3bc127ce6110f9fd.jpg', 'https://item.jd.com/100013931648.html', NULL, '9', 2020050693, '2020-10-16 18:00:15', 1, 0, 6124, 9197);
INSERT INTO `goods` VALUES (275, 100007130261, '方太（FOTILE）JCD7+HT8BE.S+D13F1 油烟机 抽油烟机燃气灶 热水器 烟灶热三件套侧吸式 挥手智控 ', 8499, 8499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117045/16/4611/92803/5eafaaeeE0f3d7c12/8da93eccb8f28043.jpg', 'https://item.jd.com/100007130261.html', NULL, '8', 2020050693, '2020-10-16 18:00:15', 1, 0, 3180, 6961);
INSERT INTO `goods` VALUES (276, 100000207092, '方太（FOTILE）油烟机 侧吸式抽油烟机燃气灶具套装三件套 一键启动风魔方 JQD6T+HT8BE+J45ES ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88970/5/15178/185776/5e6cdb6cEb340ef8c/9246212bf8e5a6b1.jpg', 'https://item.jd.com/100000207092.html', NULL, '6', 2020050693, '2020-10-16 18:00:15', 1, 0, 1792, 6693);
INSERT INTO `goods` VALUES (277, 100007739193, '老板Robam 27A7+57B2+701A+C973A侧吸油烟机燃气灶具消毒柜蒸烤一体机（天然气） ', 14897, 14897, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/142797/19/1868/145431/5efbdd98E710b3170/10e09c44e16a89a4.jpg', 'https://item.jd.com/100007739193.html', NULL, '9', 2020050697, '2020-10-16 18:00:15', 1, 0, 2949, 7194);
INSERT INTO `goods` VALUES (278, 100014665416, '老板 （Robam） 28A0+57B2+CQ975+WB770A顶侧双吸油烟机燃气灶蒸烤箱洗碗机套装（天然气） ', 16897, 16897, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129273/12/9453/64365/5f321cfbEe5e1edd9/1c07693f0d406453.jpg', 'https://item.jd.com/100014665416.html', NULL, '13', 2020050697, '2020-10-16 18:00:15', 1, 0, 4260, 6318);
INSERT INTO `goods` VALUES (279, 100014527280, '老板（ Robam）67A1H+56B0+C973A 厨房多件套欧式抽油烟机灶具蒸烤一体机套装家用（天然气） ', 10198, 10198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/136506/4/6044/102728/5f299744E79465e6d/9528f31d12be9621.jpg', 'https://item.jd.com/100014527280.html', NULL, '4', 2020050697, '2020-10-16 18:00:15', 1, 0, 7057, 7291);
INSERT INTO `goods` VALUES (280, 100006170983, '创维（SKYWORTH）65W81 Pro 65英寸OLED自发光电视 分体式壁纸电视 变色龙画质芯片 杜比全景声 智慧屏家电 ', 38999, 38999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102463/39/10444/174958/5e1bd25eEa966596a/15f0c85cd95c5f76.jpg', 'https://item.jd.com/100006170983.html', NULL, '1', 2020033015, '2020-10-16 18:00:15', 1, 0, 7496, 9544);
INSERT INTO `goods` VALUES (281, 100006077563, '倍轻松 breo 倍轻松头部头皮按摩器scalp mini金鼠版礼品盒 淋浴可用送礼 颈部肩部背部腰部腿部可用 ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109929/20/6680/182671/5e5237d8E76a3a2b0/b9c7bc153effa217.jpg', 'https://item.jd.com/100006077563.html', NULL, '15', 2020052058, '2020-10-16 18:00:16', 1, 0, 4098, 7545);
INSERT INTO `goods` VALUES (282, 100008338537, '华帝（VATTI） i11143+i10049B 油烟机 欧式抽油烟机燃气灶具套装22大吸力 热水自动洗超体专用(天然气) ', 4799, 4799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/124574/20/10229/122676/5f3f2e19E824bbb79/334c436b4601adc9.jpg', 'https://item.jd.com/100008338537.html', NULL, '6', 2020050688, '2020-10-16 18:00:16', 1, 0, 2044, 4496);
INSERT INTO `goods` VALUES (283, 100015296886, '老板（Robam）67X3H+57B2+CQ975+WB770A（天然气）5.0KW大火力挥手智控21立方大吸力烟灶蒸烤箱洗碗机厨房多件套 ', 15299, 15299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/142144/1/7954/66377/5f5876b3E2d8a8a1a/e35fe69fae63873c.jpg', 'https://item.jd.com/100015296886.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 3552, 4888);
INSERT INTO `goods` VALUES (284, 100007292036, '华帝（VATTI）油烟机 侧吸式抽油烟机家用吸油烟机 21立方米大吸力 挥手触控 热水自动清洗 CXW-240-i11105 ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87307/7/2571/39658/5dd26c9fE2c3c8b5f/469612275d925124.jpg', 'https://item.jd.com/100007292036.html', NULL, '4', 2020050688, '2020-10-16 18:00:16', 1, 0, 8855, 2098);
INSERT INTO `goods` VALUES (285, 100014527220, '老板（Robam）27A3H+57B2+S273+R073魔厨MAX侧吸式抽油烟机燃气灶具蒸烤套装（天然气） ', 13098, 13098, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126753/6/8739/77920/5f291862E67f284b6/c4b5787f09b4e6f7.jpg', 'https://item.jd.com/100014527220.html', NULL, '6', 2020050697, '2020-10-16 18:00:16', 1, 0, 2899, 9432);
INSERT INTO `goods` VALUES (286, 100015652768, '老板（Robam）60A1+57B2+WB770A欧式双腔双拢大吸力挥手智控吸油烟机燃气灶8套洗碗机套装（天然气） ', 9299, 9299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125127/27/13190/50256/5f6aee21Efe78b8a8/dbda5942f21bf046.jpg', 'https://item.jd.com/100015652768.html', NULL, '10', 2020050697, '2020-10-16 18:00:16', 1, 0, 7544, 7522);
INSERT INTO `goods` VALUES (287, 100011522344, '老板（Robam）x26林内（Rinnai）欧式抽油烟机灶具热水器套装67A1H+56B0+RUS-16QD06 (JSQ31-D06)（天然气） ', 9279, 9279, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94383/38/13203/149519/5e57b518E2ece8d3c/7b2bbea431b5ffbb.jpg', 'https://item.jd.com/100011522344.html', NULL, '8', 2020050697, '2020-10-16 18:00:16', 1, 0, 3176, 3035);
INSERT INTO `goods` VALUES (288, 100014952532, '老板（Robam）27A2H+57B2+CQ975A+XB701A 侧吸式油烟机燃气灶具嵌入式蒸烤一体机消毒柜四件套装 ', 13697, 13697, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/149350/16/6525/79168/5f437592E09ac967d/3e1d08ae5799aba0.jpg', 'https://item.jd.com/100014952532.html', NULL, '9', 2020050697, '2020-10-16 18:00:16', 1, 0, 9639, 5539);
INSERT INTO `goods` VALUES (289, 100015265496, '老板（Robam）CQ972A嵌入式大容量蒸烤一体机多功能家用烘焙智能蒸箱烤箱二合一蒸烤箱一体机 ', 6399, 6399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125753/26/12207/89031/5f5ad5caE4be923a9/b6e64c207b23482c.jpg', 'https://item.jd.com/100015265496.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 5652, 3689);
INSERT INTO `goods` VALUES (290, 100005823967, '华帝（VATTI）油烟机 烟灶套装 欧式抽油烟机燃气灶具 瞬吸蒸水洗 京品家电 超体专用CXW-270-i11106(天然气) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/95887/34/2508/85855/5dd2677dEedc94b92/e1e889c32791b87a.jpg', 'https://item.jd.com/100005823967.html', NULL, '6', 2020050688, '2020-10-16 18:00:16', 1, 0, 1588, 8833);
INSERT INTO `goods` VALUES (291, 100014527504, '华帝（VATTI） i11150+49B 油烟机 侧吸式抽油烟机燃气灶具烟灶套装 21大吸力挥手 智感恒吸 自动洗(天然气) ', 5099, 5099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/133186/24/5932/61514/5f29035cE8bc3b3b4/abc83518823d1f20.jpg', 'https://item.jd.com/100014527504.html', NULL, '6', 2020050688, '2020-10-16 18:00:16', 1, 0, 9191, 2766);
INSERT INTO `goods` VALUES (292, 100003618501, '方太（FOTILE）油烟机 抽油烟机燃气灶消毒柜 家用 欧式烟灶消套装 一键瞬吸云魔方 EMC5+HT8BE+J45ES ', 6699, 6699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102785/40/15085/142580/5e6cc7f4Edbd61f72/b1d48dc7e80b4bde.jpg', 'https://item.jd.com/100003618501.html', NULL, '9', 2020050693, '2020-10-16 18:00:16', 1, 0, 4218, 5671);
INSERT INTO `goods` VALUES (293, 100006858541, '华帝（VATTI）i11123+i8H01B+ i12058-16 油烟机 欧式抽油烟机燃气灶具热水器厨房三件套 超体专用(天然气) ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100117/30/17826/164742/5e8bee16Ed3c8036c/3a3f0b6e246da265.jpg', 'https://item.jd.com/100006858541.html', NULL, '8', 2020050688, '2020-10-16 18:00:16', 1, 0, 6023, 1862);
INSERT INTO `goods` VALUES (294, 100007886223, '老板（ Robam）67A9+57B2T+S273+R073 全钢机身隐翼深腔拢烟欧式抽油烟机燃气灶蒸箱烤箱四件套（天然气） ', 13398, 13398, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113616/16/12502/60644/5f101f70E4db0d7f7/6ad74a6284e8b763.jpg', 'https://item.jd.com/100007886223.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 3909, 3600);
INSERT INTO `goods` VALUES (295, 100008075933, '老板（Robam）67A1H+56B0+S273+R073挥手智控欧式触屏大吸力油烟机燃气灶蒸箱烤箱具套装（天然气） ', 12598, 12598, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117875/21/14081/74394/5f291476Ee1ebd6ea/395ea0cf7af24281.jpg', 'https://item.jd.com/100008075933.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 4874, 9042);
INSERT INTO `goods` VALUES (296, 100014527282, '老板（Robam）67A1H+56B0+WB775A挥手智控欧式触屏大吸力油烟机燃气灶具洗消一体洗碗机套装（天然气） ', 8698, 8698, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114070/10/14045/69988/5f290e9bE039b9ffb/90d1e7e63e8be153.jpg', 'https://item.jd.com/100014527282.html', NULL, '10', 2020050697, '2020-10-16 18:00:16', 1, 0, 3932, 2968);
INSERT INTO `goods` VALUES (297, 100009641548, '老板（Robam）8套洗消一体嵌入式家用洗碗机WQP8-WB770A ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105932/26/15093/157266/5e6f1bd7E13f4b272/b2a348a61e52c67d.jpg', 'https://item.jd.com/100009641548.html', NULL, '10', 2020050697, '2020-10-16 18:00:16', 1, 0, 5840, 1797);
INSERT INTO `goods` VALUES (298, 100005823973, '华帝（VATTI）油烟机 侧吸式抽油烟机家用吸油烟机 21立方米大吸力 挥手触控 超体专用 CXW-240-i11105 ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/67914/25/17077/58017/5de46b64E0ed10c57/aa5580f53ae91b43.jpg', 'https://item.jd.com/100005823973.html', NULL, '4', 2020050688, '2020-10-16 18:00:16', 1, 0, 5301, 7181);
INSERT INTO `goods` VALUES (299, 100007992601, '老板（Robam）S270A+R070A嵌入式蒸烤箱 40L+40L大容量全屏触控蒸箱烤箱套餐 ', 9499, 9499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/149071/26/3939/160461/5f1fcb81Ebe6d0e06/a513898fc4f2a27b.jpg', 'https://item.jd.com/100007992601.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 6966, 3894);
INSERT INTO `goods` VALUES (300, 100013114038, '华帝（VATTI） i11143+49B 油烟机家用 烟灶套装欧式抽油烟机燃气灶具套装 22大吸力挥手即开 热水洗(液化气) ', 5099, 5099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/124910/2/170/162031/5eb3b8f6E8277c596/bb531ae1ad17b42c.jpg', 'https://item.jd.com/100013114038.html', NULL, '6', 2020050688, '2020-10-16 18:00:16', 1, 0, 2000, 5523);
INSERT INTO `goods` VALUES (301, 100000306987, '方太（FOTILE）油烟机 侧吸抽油烟机燃气灶 燃气热水器 13升 风魔方天然气三件套 JQD6T+HT8BE+13DES ', 6899, 6899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102019/27/15029/200670/5e6cdb14E1df506f4/c0d3f04a6734050a.jpg', 'https://item.jd.com/100000306987.html', NULL, '8', 2020050693, '2020-10-16 18:00:16', 1, 0, 7220, 6633);
INSERT INTO `goods` VALUES (302, 100005274394, '老板（Robam）挥手智控欧式触屏油烟机燃气灶具台式蒸烤一体机套装67A1H+56B0T+CT73A ', 7098, 7098, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/40821/39/210/156827/5cc12d37E0807b56b/9645524096fdc514.jpg', 'https://item.jd.com/100005274394.html', NULL, '6', 2020050697, '2020-10-16 18:00:16', 1, 0, 3636, 5312);
INSERT INTO `goods` VALUES (303, 100014524378, '老板（Robam）27A3H+57B2+C973A 大吸力免拆洗触控侧吸式家用抽油烟机燃气灶蒸烤一体机套装 （天然气） ', 10698, 10698, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116680/12/13854/93292/5f299894E20d17639/409b22401b22e4e2.jpg', 'https://item.jd.com/100014524378.html', NULL, '6', 2020050697, '2020-10-16 18:00:16', 1, 0, 7429, 3707);
INSERT INTO `goods` VALUES (304, 100011522326, '老板（Robam）x26史密斯（A.O.SMITH）欧式抽油烟机燃气灶具电热水器套装67A1H+56B0+E60VDW（天然气） ', 7657, 7657, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/92029/30/13211/111199/5e562432E5e48e589/10f6c227df2ef76b.jpg', 'https://item.jd.com/100011522326.html', NULL, '8', 2020050697, '2020-10-16 18:00:16', 1, 0, 3414, 3883);
INSERT INTO `goods` VALUES (305, 100013021564, '方太（FOTILE） JQD11T+HC8BE（天然气）油烟机 侧吸式抽油烟机搭配4.5KW猛火燃气灶 挥手智控风魔方 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112271/6/3666/201825/5ea95bc3E7acf46d2/4cca9aab40688e9a.jpg', 'https://item.jd.com/100013021564.html', NULL, '6', 2020050693, '2020-10-16 18:00:16', 1, 0, 1814, 3988);
INSERT INTO `goods` VALUES (306, 100014307176, '老板（Robam）CQ971A家用大容量嵌入式蒸烤一体机多功能烘焙蒸箱烤箱二合一蒸烤箱 ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125490/23/7962/136779/5f1aaea4Ea249498b/dc6a285a36aa24be.jpg', 'https://item.jd.com/100014307176.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 5814, 6645);
INSERT INTO `goods` VALUES (307, 100005224497, '方太（FOTILE）油烟机 抽油烟机灶具套装 4.5KW大火力燃气灶 侧吸式烟灶套装2T 一键启动风魔方 JQD6T+HC8BE ', 4199, 4199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110288/26/8450/227171/5e6cdcddE2767e6e4/49ff1a4b7582dcf6.jpg', 'https://item.jd.com/100005224497.html', NULL, '6', 2020050693, '2020-10-16 18:00:16', 1, 0, 5926, 5080);
INSERT INTO `goods` VALUES (308, 100014952500, '老板（Robam）27A2H+57B2+CQ975 大吸力免拆洗触控侧吸式家用抽油烟机燃气灶蒸烤一体机三件套装 （天然气） ', 11598, 11598, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/128516/21/10661/84872/5f43723fE49cb0af2/25b479276df9b292.jpg', 'https://item.jd.com/100014952500.html', NULL, '6', 2020050697, '2020-10-16 18:00:16', 1, 0, 5528, 5003);
INSERT INTO `goods` VALUES (309, 100014175350, '老板（Robam）67A7+56B0+S273+R073 欧式塔形油烟机燃气灶蒸烤套装烟机灶具蒸箱烤箱多件套（天然气） ', 15428, 15428, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/135808/8/4320/331005/5f0bd083E9f7b1708/c7ba06171ad2aaaf.jpg', 'https://item.jd.com/100014175350.html', NULL, '13', 2020050697, '2020-10-16 18:00:16', 1, 0, 3180, 3406);
INSERT INTO `goods` VALUES (310, 100014233554, '老板（Robam）67A7+57B2T+W770A欧式油烟机三件套 抽油烟机燃气灶具洗碗机套装 ', 9998, 9998, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/149005/25/2977/85994/5f101200E75babc46/0ecdda36f0d23a8f.jpg', 'https://item.jd.com/100014233554.html', NULL, '10', 2020050697, '2020-10-16 18:00:16', 1, 0, 3985, 1489);
INSERT INTO `goods` VALUES (311, 100005558822, '华帝（VATTI）油烟机 欧式抽油烟机燃气灶具烟灶套装 21大吸力挥手触控 蒸水自动清洗CXW-270-i11123(天然气) ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109748/5/8919/166312/5e6f24ffE7bde9660/b3094db0b631c68d.jpg', 'https://item.jd.com/100005558822.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 4659, 3929);
INSERT INTO `goods` VALUES (312, 100005808669, '华帝（VATTI）油烟机 欧式顶吸抽油烟机家用吸油烟机 21立方米大吸力 挥手触控 蒸水自动清洗 CXW-270-i11123 ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103481/35/3531/53291/5de0d40eE1aa3d046/6bb2121b072f7b22.jpg', 'https://item.jd.com/100005808669.html', NULL, '4', 2020050688, '2020-10-16 18:00:17', 1, 0, 6307, 6812);
INSERT INTO `goods` VALUES (313, 100013054906, '方太（FOTILE） JCD2+HC8BE 油烟机 抽油烟机燃气灶 侧吸式油烟机灶具套装 挥手智控 ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108009/4/15717/77995/5eafa6e8E9754a0ed/45f32c0194f3cf88.jpg', 'https://item.jd.com/100013054906.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 8558, 7350);
INSERT INTO `goods` VALUES (314, 100004769317, '小米 米家喷墨打印机 大容量连供彩色无线多功能一体机（打印 手机复印 扫描 Wifi 微信 远程打印 作业 ） ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94850/32/14608/198499/5e68dba4E7748e769/c2bd4a757d821c3c.jpg', 'https://item.jd.com/100004769317.html', NULL, '14', 2020042785, '2020-10-16 18:00:17', 1, 0, 8617, 1889);
INSERT INTO `goods` VALUES (315, 100010984560, '华帝（VATTI）消毒柜 100L容量嵌入式消毒碗柜家用 紫外线碗筷消毒柜 创新两门三抽 二星消毒 超体专用i13025 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102556/31/14761/163951/5e687d4dE7bcd49a9/7dcc2cdf075531e5.jpg', 'https://item.jd.com/100010984560.html', NULL, '9', 2020050688, '2020-10-16 18:00:17', 1, 0, 1456, 4763);
INSERT INTO `goods` VALUES (316, 100013263736, '华帝（VATTI） i11150+49B 油烟机 侧吸式抽油烟机燃气灶具烟灶套装 21大吸力挥手 智感恒吸 自动洗(液化气) ', 5099, 5099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113574/29/6756/166943/5ebdf092E27d35a66/77af26c142dc369e.jpg', 'https://item.jd.com/100013263736.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 2426, 4129);
INSERT INTO `goods` VALUES (317, 100007678917, '方太（FOTILE） JCD2+HT8BE.S(液化气)油烟机 抽油烟机燃气灶 烟灶套装 侧吸式 挥手智控风魔方 ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/139364/36/1955/314765/5efdeda1E620bc24f/998bab61aff576ea.jpg', 'https://item.jd.com/100007678917.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 3563, 9307);
INSERT INTO `goods` VALUES (318, 100014527506, '华帝（VATTI） i11143+49B 油烟机家用 烟灶套装欧式抽油烟机燃气灶具套装 22大吸力挥手即开 热水洗(天然气) ', 5099, 5099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115937/17/13986/89761/5f2903d0Ee5fe15a0/9fb5bf114e8eb595.jpg', 'https://item.jd.com/100014527506.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 7249, 7373);
INSERT INTO `goods` VALUES (319, 100003140631, '华帝（VATTI）油烟机 侧吸式抽油烟机燃气灶具烟灶套装 21大吸力挥手即开 自动清洗 CXW-240-i11105(天然气) ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106784/18/15190/138549/5e6f1ea3E66ea7dc4/510d0fc71abdbc01.jpg', 'https://item.jd.com/100003140631.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 1265, 2311);
INSERT INTO `goods` VALUES (320, 100007803771, '方太（FOTILE）JCD2+TH26B(天然气) 油烟机 抽油烟机燃气灶 烟灶套装 侧吸式 挥手智控风魔方 ', 5639, 5639, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126742/20/6538/142614/5f044c3fEa6f62f77/18be265d01d41965.jpg', 'https://item.jd.com/100007803771.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 4695, 1916);
INSERT INTO `goods` VALUES (321, 100011113734, '华帝（VATTI）油烟机 欧式抽油烟机燃气灶具烟灶套装 21大吸力挥手触控自动清洗 防干烧 i11123+53BF(天然气) ', 2399, 2399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104217/25/15141/166930/5e6f24cdEea506ddc/10f6bca53cf6e595.jpg', 'https://item.jd.com/100011113734.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 8563, 6789);
INSERT INTO `goods` VALUES (322, 100008305365, '方太（FOTILE）JQD11T+TH33G油烟机燃气灶 烟灶套餐家用 抽排吸油烟机不沾油灶 侧吸挥手智控 ', 5699, 5699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117210/7/15948/123654/5f44ae34Ef0c0f8f6/3cb6c6ae7ff78b60.jpg', 'https://item.jd.com/100008305365.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 8012, 4018);
INSERT INTO `goods` VALUES (323, 100012758408, '方太（FOTILE）油烟机 抽油烟机燃气灶 油烟机灶具套装 侧吸式 挥手智控风魔方 JCD2+HT8BE.S(天然气) ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89768/34/19423/58987/5e9e4269Ee333de53/db5ae0145cafee0d.jpg', 'https://item.jd.com/100012758408.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 5431, 9915);
INSERT INTO `goods` VALUES (324, 100013507172, '方太（FOTILE）JQD11T+HT8BE.S(天然气)油烟机 抽油烟机灶具套装 4.5KW大火力燃气灶 侧吸挥手智控风魔方 ', 6499, 6499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/128836/21/3135/61806/5ecf4e6dEa2885fbd/940a4671d3ca7ea7.jpg', 'https://item.jd.com/100013507172.html', NULL, '6', 2020050693, '2020-10-16 18:00:17', 1, 0, 1502, 5104);
INSERT INTO `goods` VALUES (325, 100014449094, 'LG 10.5公斤AI智慧变频直驱滚筒洗衣机 95℃高温煮洗 14分钟快洗 白色 FLX10N4W ', 4599, 4599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129239/30/8711/141448/5f27c648E94f8e5f3/5a928749d641352e.jpg', 'https://item.jd.com/100014449094.html', NULL, '3', 2020050647, '2020-10-16 18:00:17', 1, 0, 5780, 1291);
INSERT INTO `goods` VALUES (326, 100012533458, '华凌60升电热水器 2100W变频速热无线遥控预约五倍增容健康洗加长安全防电墙8年包修F60-21WS1G ', 849, 849, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117423/32/1531/180755/5e995eb5E00018561/7e1eee147ce1d7a6.jpg', 'https://item.jd.com/100012533458.html', NULL, '8', 2020052049, '2020-10-16 18:00:17', 1, 0, 5235, 7665);
INSERT INTO `goods` VALUES (327, 8547526, '华帝（VATTI）燃气灶液化气 煤气灶双灶具 台式嵌入式煤气炉 4.5KW猛火家用 钢化玻璃 JZY-i10049B（液化气） ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/73091/8/15593/85906/5dd26d35E1794a5f7/47be1616ca9afa88.jpg', 'https://item.jd.com/8547526.html', NULL, '6', 2020050688, '2020-10-16 18:00:17', 1, 0, 3417, 4381);
INSERT INTO `goods` VALUES (328, 100005603428, '海信 (Hisense) 239升一级能效双变频三门电冰箱 绿色净化仓抗菌净化 风冷无霜中门变温室BCD-239WYK1DPS ', 2199, 2199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109932/38/7936/123229/5e62159cE9521804e/e1d1a37930c6ce71.jpg', 'https://item.jd.com/100005603428.html', NULL, '2', 2020033057, '2020-10-16 18:00:17', 1, 0, 1244, 1484);
INSERT INTO `goods` VALUES (329, 8760041, '华帝（VATTI）燃气灶天然气 煤气灶双灶具 台式嵌入式 4.5KW猛火家用 钢化玻璃 JZT-i10049B（天然气） ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98871/36/14387/178687/5e65ec15E5a890cab/e0df5e09246b032a.jpg', 'https://item.jd.com/8760041.html', NULL, '6', 2020050688, '2020-10-16 18:00:18', 1, 0, 2352, 4514);
INSERT INTO `goods` VALUES (330, 100010603702, '华帝（VATTI）大火力煤气双眼灶 家用台式嵌入式燃气灶具 钢化玻璃升级妈妈灶 超体专用JZT-i10049B(天然气) ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103454/35/14434/178687/5e65ec52E602c1d16/83e57a633098bcd3.jpg', 'https://item.jd.com/100010603702.html', NULL, '6', 2020050688, '2020-10-16 18:00:18', 1, 0, 3744, 2417);
INSERT INTO `goods` VALUES (331, 100004241289, '华帝（VATTI）油烟机 侧吸式抽油烟机燃气灶具烟灶套装 21大吸力挥手即开 热水自动清洗 i11105+49B(天然气) ', 4499, 4499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88210/19/2607/92919/5dd3afe0E020889e7/a3f15a12900f81e1.jpg', 'https://item.jd.com/100004241289.html', NULL, '6', 2020050688, '2020-10-16 18:00:18', 1, 0, 2853, 1202);
INSERT INTO `goods` VALUES (332, 3200758, '能率（NORITZ）燃气热水器13升 智能精控恒温 水量伺服器 一键节能 防冻GQ-13E4AFEX（天然气）（JSQ25-E4） ', 2898, 2898, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102887/34/15322/186316/5e6f3368E6dc5cbc7/86688b181f43a457.jpg', 'https://item.jd.com/3200758.html', NULL, '8', 2020052070, '2020-10-16 18:00:18', 1, 0, 7937, 1404);
INSERT INTO `goods` VALUES (333, 100014322386, '华帝（VATTI）i11143+01B+13025 油烟机 欧式抽油烟机燃气灶具消毒柜厨房三件套 22大吸力挥手即开(天然气) ', 5599, 5599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/145555/14/3372/57040/5f16a7fdE29f04770/365a1c6723bd5346.jpg', 'https://item.jd.com/100014322386.html', NULL, '9', 2020050688, '2020-10-16 18:00:18', 1, 0, 9902, 9381);
INSERT INTO `goods` VALUES (334, 7475324, '松下脱毛器剃毛器男 刮毛刀腋毛私处脱毛 刮毛器 ER-WGK6AT405 ', 369, 369, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/8105/10/4895/59126/5bdc11eeE7409c0aa/2191ef560338de41.jpg', 'https://item.jd.com/7475324.html', NULL, '14', 2020042842, '2020-10-16 18:00:18', 1, 0, 6661, 5781);
INSERT INTO `goods` VALUES (335, 100007292082, '华帝（VATTI）油烟机 侧吸式抽油烟机燃气灶具消毒柜厨房三件套 21大吸力挥手触控 i11105+51B+13025(天然气) ', 4499, 4499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/44232/37/11290/154889/5d4a715eEa04e8d55/ba54737a603ad66f.jpg', 'https://item.jd.com/100007292082.html', NULL, '9', 2020050688, '2020-10-16 18:00:18', 1, 0, 1066, 8328);
INSERT INTO `goods` VALUES (336, 7009172, '华帝（VATTI）消毒柜 100升大容量嵌入式消毒碗柜家用 紫外线碗筷消毒柜 创新两门三抽 二星级臭氧消毒i13025 ', 1799, 1799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85952/14/14687/163951/5e687d36Efc5b5162/71d6cdb7b69aaba8.jpg', 'https://item.jd.com/7009172.html', NULL, '9', 2020050688, '2020-10-16 18:00:18', 1, 0, 2480, 2250);
INSERT INTO `goods` VALUES (337, 100004097339, '苏泊尔 SUPOR 家用多功能电烤箱 30L大容量烤箱家用易操作 广域控温 K30FK806 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/54348/1/6414/314210/5d3e9410E403f656f/12ca354ab66f2197.jpg', 'https://item.jd.com/100004097339.html', NULL, '13', 2020050628, '2020-10-16 18:00:18', 1, 0, 2377, 3674);
INSERT INTO `goods` VALUES (338, 100003761916, '苏泊尔 （SUPOR）家用多功能电烤箱 12L迷你复古小烤箱家用 带出式烤盘易清洁易操作 瓷釉白 K12FK604 ', 249, 249, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/17599/40/15459/191550/5caff4ddE739dafbc/c5d918b09669b467.jpg', 'https://item.jd.com/100003761916.html', NULL, '13', 2020050628, '2020-10-16 18:00:18', 1, 0, 8801, 8049);
INSERT INTO `goods` VALUES (339, 100005836703, '海信（Hisense）43E2F 43英寸 Unibody 悬浮全面屏 一键图搜 HD高清 网络 智慧教育 液晶电视 ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85420/38/4116/608932/5de4e599Ea076332a/960251d9a7848953.jpg', 'https://item.jd.com/100005836703.html', NULL, '1', 2020033057, '2020-10-16 18:00:18', 1, 0, 1476, 4921);
INSERT INTO `goods` VALUES (340, 100005836703, '海信（Hisense）43E2F 43英寸 Unibody 悬浮全面屏 一键图搜 HD高清 网络 智慧教育 液晶电视 ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85420/38/4116/608932/5de4e599Ea076332a/960251d9a7848953.jpg', 'https://item.jd.com/100005836703.html', NULL, '1', 2020033057, '2020-10-16 18:00:18', 1, 0, 4269, 8960);
INSERT INTO `goods` VALUES (341, 100011778168, '松下 Panasonic 家用中央空调多联机MASTER S 系列 5匹一拖四适用90-120㎡ 0元安装 ME45BS6 ', 40199, 40199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105106/40/14718/175501/5e676782E9dce950a/aed31805b3829bd2.jpg', 'https://item.jd.com/100011778168.html', NULL, '5', 2020042842, '2020-10-16 18:00:18', 1, 0, 6166, 7318);
INSERT INTO `goods` VALUES (342, 100005668846, '海尔（Haier)变频波轮洗衣机全自动 智能称重量衣进水 健康桶自洁 8KG EB80BM029 ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110109/3/9148/196443/5e6f7babE63813a80/880edce20d69fa78.jpg', 'https://item.jd.com/100005668846.html', NULL, '3', 2020033045, '2020-10-16 18:00:18', 1, 0, 3991, 3815);
INSERT INTO `goods` VALUES (343, 100004955487, '康佳（KONKA）65X5 65英寸 4K超高清 全面屏 远场语音 AI人工智能 2+16GB内存 网络平板液晶电视机 ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86035/29/14102/39036/5e6218e6E94026b14/f990bac93d7f4e7e.jpg', 'https://item.jd.com/100004955487.html', NULL, '1', 2020033018, '2020-10-16 18:00:18', 1, 0, 9510, 3758);
INSERT INTO `goods` VALUES (344, 100005578808, '康佳（KONKA）LED65K520 65英寸 4K超高清 人工智能语音 全民K歌 智能网络平板液晶电视 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/57646/25/1267/166875/5cefd393Ed60ff866/a3b8c85aa1457407.jpg', 'https://item.jd.com/100005578808.html', NULL, '1', 2020033018, '2020-10-16 18:00:18', 1, 0, 2115, 1052);
INSERT INTO `goods` VALUES (345, 100015264904, '海尔（Haier）燃气灶 4.5KW大火力 嵌入式双眼灶 液化气灶 JZY-Q7B0(20Y) ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114909/7/17870/46869/5f607d65Ee3051e08/afcf5dee7746bfa0.jpg', 'https://item.jd.com/100015264904.html', NULL, '6', 2020033045, '2020-10-16 18:00:18', 1, 0, 1782, 8634);
INSERT INTO `goods` VALUES (346, 100007804887, '华帝（VATTI）空气能热水器 75°高温 200升家用一体式电热水器 200TF ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/123940/21/6520/349164/5f05207eE6c46a196/bb6b8f1ba7f47cf1.jpg', 'https://item.jd.com/100007804887.html', NULL, '8', 2020050688, '2020-10-16 18:00:18', 1, 0, 7897, 2704);
INSERT INTO `goods` VALUES (347, 100009968728, '苏泊尔（SUPOR）K10FK610 家用烤箱 定时控温 多功能10L迷你小烤箱 瓷釉白 ', 129, 129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109588/1/5118/264900/5e340740E2ab5d4d9/f634a22cdb59504f.jpg', 'https://item.jd.com/100009968728.html', NULL, '13', 2020050628, '2020-10-16 18:00:18', 1, 0, 7924, 6208);
INSERT INTO `goods` VALUES (348, 100009559734, '万家乐 50升电热水器 3200W速热瀑布洗 短款 净流系统 智能管家 节能模式 剩余水量显示 6倍增容D50-G7 ', 2498, 2498, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88448/10/15227/262802/5e6f2d7eE0080a92f/d4f16ae1ad27b9da.jpg', 'https://item.jd.com/100009559734.html', NULL, '8', 2020052036, '2020-10-16 18:00:18', 1, 0, 4687, 8912);
INSERT INTO `goods` VALUES (349, 100012441756, '海信（Hisense）32E2F 32英寸 高清 VIDAA AI智能系统 Unibody悬浮全面屏 一键图搜 教育资源 液晶平板电视机 ', 949, 949, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/93781/1/17870/332133/5e8f02d1E52440cd7/95201bdc100040d9.jpg!q80.dpg', 'https://item.jd.com/100012441756.html', NULL, '1', 2020033057, '2020-10-16 18:00:18', 1, 0, 2610, 1097);
INSERT INTO `goods` VALUES (350, 100002844211, 'AEG 欧洲原装进口9套独嵌两用家用洗碗机 360°无死角卫星喷淋 双重烘干 玻璃呵护 浊度感知 FFB51400ZM ', 5490, 5490, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104265/26/15170/70579/5e6f54a2Ecd7ba676/26917747a9bc5164.jpg', 'https://item.jd.com/100002844211.html', NULL, '10', NULL, '2020-10-16 18:00:18', 1, 0, 1187, 7707);
INSERT INTO `goods` VALUES (351, 941189, 'TCL L32F3301B 32英寸窄边框蓝光LED液晶电视机（黑色） ', 799, 799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/45522/7/1399/198800/5cf25f66Ecfcf88e0/f3863e9853dffb54.jpg', 'https://item.jd.com/941189.html', NULL, '1', 2020033093, '2020-10-16 18:00:18', 1, 0, 3684, 2974);
INSERT INTO `goods` VALUES (352, 100007528447, 'TCL 55L8 55英寸液晶平板电视 4K超高清HDR 智能网络WiFi 超薄影视教育资源电视 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/143715/2/1645/269765/5ef968eeEfdf0a0ce/e17322d48b770476.jpg', 'https://item.jd.com/100007528447.html', NULL, '1', 2020033093, '2020-10-16 18:00:18', 1, 0, 3922, 5318);
INSERT INTO `goods` VALUES (353, 100011790176, '海信(Hisense) 1.5匹 新一级能效 全直流变频冷暖 自清洁 智能 壁挂式空调挂机 KFR-35GW2FH620-X1 ', 2799, 2799, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/117619/17/7748/305543/5ec64b90Ed0169cbe/4e77dda3d278ccb9.jpg!q80.dpg', 'https://item.jd.com/100011790176.html', NULL, '5', 2020033057, '2020-10-16 18:00:18', 1, 0, 3517, 9402);
INSERT INTO `goods` VALUES (354, 100014524210, '小熊（Bear）颈椎按摩器 按摩靠垫腰部肩部按摩器 按摩枕肩颈按摩仪 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/135306/16/8267/201896/5f485fa3E44d60a2b/aca2a6c84e43c1e7.jpg', 'https://item.jd.com/100014524210.html', NULL, '15', 2020042873, '2020-10-16 18:00:18', 1, 0, 6123, 5714);
INSERT INTO `goods` VALUES (355, 100014577822, 'TCL 32L8H 32英寸液晶平板 智能网络 4GB内存 高清电视机 ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112614/29/14268/161395/5f2bc9e1Ed263c4ec/cc5c58b047387d12.jpg', 'https://item.jd.com/100014577822.html', NULL, '1', 2020033093, '2020-10-16 18:00:18', 1, 0, 6791, 5007);
INSERT INTO `goods` VALUES (356, 100003686999, '小熊（Bear）电水壶折叠水壶便携式烧水壶 旅行家用保温养生冲奶保温热水壶电热水壶ZDH-A06G1 ', 129, 129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/78239/8/13960/109827/5db17d63E80b47f10/56205ee7b402b839.jpg', 'https://item.jd.com/100003686999.html', NULL, '14', 2020042873, '2020-10-16 18:00:18', 1, 0, 7119, 4452);
INSERT INTO `goods` VALUES (357, 100007067786, '华帝（VATTI）空气能热水器 75°高温 150升家用一体式电热水器 150TS ', 7599, 7599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107854/40/9171/185110/5e7027c1E0588f213/739b655d1eed08f1.jpg', 'https://item.jd.com/100007067786.html', NULL, '8', 2020050688, '2020-10-16 18:00:18', 1, 0, 7309, 4899);
INSERT INTO `goods` VALUES (358, 100005171131, '云米（VIOMI）VBH130 破壁机料理机小Q 一机多用智能预约一键自动清洗自动保温榨汁机豆浆机辅食机 ', 349, 349, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105450/37/14883/234713/5e6a483dE0522f8bd/afcbb8599c04ec64.jpg', 'https://item.jd.com/100005171131.html', NULL, '14', 2020052067, '2020-10-16 18:00:18', 1, 0, 7892, 8121);
INSERT INTO `goods` VALUES (359, 100003322383, '格力（GREE）加湿器 静音迷你办公室卧室家用带香薰盒加湿孕妇婴儿可用SC-25X68 ', 179, 179, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86954/39/10280/127660/5e16d526E528c7ba3/ca02eb3490cb2b5e.jpg', 'https://item.jd.com/100003322383.html', NULL, '14', 2020050630, '2020-10-16 18:00:18', 1, 0, 1702, 1275);
INSERT INTO `goods` VALUES (360, 1015710, '海尔（Haier）6.6升上出水小厨宝1500W家用厨房速热电热水器小巧尺寸专利防电墙ES6.6U(W) ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86705/8/15229/78195/5e702e14Eec1fc111/f726df9d0319b3e1.jpg', 'https://item.jd.com/1015710.html', NULL, '8', 2020033045, '2020-10-16 18:00:18', 1, 0, 7667, 6881);
INSERT INTO `goods` VALUES (361, 100007452909, '格力（GREE）大1匹 品悦一级能效 变频冷暖 智能 壁挂式卧室空调挂机 KFR-26GW(26592)FNhAc-A1(WIFI) ', 2699, 2699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122767/1/6707/121469/5f059764Ee9ee0554/e94fa8c4bcd0d4a9.jpg', 'https://item.jd.com/100007452909.html', NULL, '5', 2020050630, '2020-10-16 18:00:19', 1, 0, 6332, 8688);
INSERT INTO `goods` VALUES (362, 100013593046, '格力（GREE）正1.5匹 品悦一级能效 变频冷暖 智能 壁挂式卧室空调挂机 KFR-35GW(35592)FNhAc-A1(WIFI) ', 2899, 2899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129591/37/2877/122475/5ef0d122E7caf01ae/a6886a344103c1e6.jpg', 'https://item.jd.com/100013593046.html', NULL, '5', 2020050630, '2020-10-16 18:00:19', 1, 0, 1284, 1619);
INSERT INTO `goods` VALUES (363, 708237, '格兰仕(Galanz)P70F23P-G5(S0)家用23升微波炉 旋钮操作平板加热 精准控温 五档火力 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t20647/362/393549451/460189/55924660/5b0bdc8fN720c3331.jpg', 'https://item.jd.com/708237.html', NULL, '14', NULL, '2020-10-16 18:00:19', 1, 0, 1237, 3320);
INSERT INTO `goods` VALUES (364, 100008570932, '格力（GREE）大1匹 品悦 一级能效 变频冷暖 智能WiFi 空调挂机 KFR-26GWx2F(26592)FNhAa-A1 （清爽白） ', 2699, 2699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94854/10/5927/78187/5df04773E5e13312f/87e5f3f8fe748e7d.jpg', 'https://item.jd.com/100008570932.html', NULL, '5', 2020050630, '2020-10-16 18:00:19', 1, 0, 9622, 7244);
INSERT INTO `goods` VALUES (365, 50317449417, 'TCL指纹锁智能锁指纹锁防盗门智能门锁密码锁 指纹锁家用防盗门锁 【全镜面设计+WIFI直连 无需另购网关】 ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/123296/21/13862/542574/5f729f66E58d42d10/9b885951f82c7f82.png!q80.dpg', 'https://item.jd.com/50317449417.html', NULL, '14', 2020033093, '2020-10-16 18:00:19', 1, 0, 5729, 7920);
INSERT INTO `goods` VALUES (366, 6846553, '松下（Panasonic）电熨斗家用 手持蒸汽挂烫机 高温蒸汽杀菌 30秒快速启动 NI-GHA046-PN ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t26317/79/519285087/89490/5d7d20e8/5bb04e5dNedfbac22.jpg', 'https://item.jd.com/6846553.html', NULL, '14', 2020042842, '2020-10-16 18:00:19', 1, 0, 4533, 4526);
INSERT INTO `goods` VALUES (367, 100007761925, '美的 Midea 新能效 变频圆柱 冷暖柜机 KFR-72LWBP2DN8Y-YA400(3) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122543/32/6993/48005/5f0c1281Ef10e66e0/ed053e2926200afb.jpg', 'https://item.jd.com/100007761925.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 5123, 5765);
INSERT INTO `goods` VALUES (368, 100012309014, '华帝（VATTI）油烟机 烟灶套装 侧吸式抽油烟机燃气灶具套装 21大吸力 挥手即开自动清洗i11135+53BF(天然气) ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88166/35/17104/199896/5e83fe85Ed38a9c65/f903b002191cd33d.jpg', 'https://item.jd.com/100012309014.html', NULL, '6', 2020050688, '2020-10-16 18:00:19', 1, 0, 7583, 4637);
INSERT INTO `goods` VALUES (369, 100007761933, '美的 Midea 新一级能效 2匹 家用柜机 KFR-51LWBP3DN8Y-YH200(1) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/138299/5/2789/167707/5f0bfbe6E293de400/37e9955c2b8a1375.jpg', 'https://item.jd.com/100007761933.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 6116, 6124);
INSERT INTO `goods` VALUES (370, 100000561934, '松下（Panasonic）电熨斗家用 手持蒸汽挂烫机 高温杀菌 30秒快速启动 礼盒套装 NI-GHA046-PJ ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t27841/309/1718058985/65701/6662f348/5beaa205N322bfd63.jpg', 'https://item.jd.com/100000561934.html', NULL, '14', 2020042842, '2020-10-16 18:00:19', 1, 0, 1401, 3288);
INSERT INTO `goods` VALUES (371, 100014055568, '美的 Midea 新一级能效 1.5匹 变频冷暖 挂式智能空调 KFR-35GWBP3DN8Y-PH200(1) ', 2599, 2599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129156/6/6914/167765/5f0bebd4E20fd5943/4c21773b6f75be06.jpg', 'https://item.jd.com/100014055568.html', NULL, '5', 2020050665, '2020-10-16 18:00:19', 1, 0, 2561, 9214);
INSERT INTO `goods` VALUES (372, 100007457407, '美的（Midea）M刻3匹一级能效 变频智能WiFi柜机 KFR- 72LWBP3DN8Y-YB300(B1)A3匹 ', 7299, 7299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108695/39/14654/166996/5ea8e99fEf5f1d792/cc5c7c35109824cf.jpg', 'https://item.jd.com/100007457407.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 5575, 2931);
INSERT INTO `goods` VALUES (373, 100014055532, '美的 Midea 新一级能 1匹家用 壁挂式空调KFR-26GWBP3DN8Y-PH200(1) ', 2399, 2399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/133713/23/4261/167765/5f0beb62Ebf99295b/a9c96bb8621d30f0.jpg', 'https://item.jd.com/100014055532.html', NULL, '5', 2020050665, '2020-10-16 18:00:19', 1, 0, 9700, 8589);
INSERT INTO `goods` VALUES (374, 52370280949, 'TCL指纹锁智能锁家用防盗门锁 指纹密码电子锁 标配经典款K1C ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/141588/30/9564/692163/5f729f7eEaf4c00aa/42dba91b188b9dce.png!q80.dpg', 'https://item.jd.com/52370280949.html', NULL, '14', 2020033093, '2020-10-16 18:00:19', 1, 0, 8856, 4989);
INSERT INTO `goods` VALUES (375, 28574664663, '【京东旗舰店】安吉尔净水器家用 厨房纯水机 自来水过滤器 厨下式反渗透直饮净水机 T1C新品 J1105-ROB8 ', 1498, 1498, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88529/34/17163/160585/5e830b52E1aa0a3c2/721820fb38a1fdb4.jpg', 'https://item.jd.com/28574664663.html', NULL, '14', NULL, '2020-10-16 18:00:19', 1, 0, 7466, 2197);
INSERT INTO `goods` VALUES (376, 6846555, '松下（Panasonic）电熨斗家用 手持蒸汽挂烫机 高温蒸汽杀菌 30秒快速启动 NI-GHA046-DA ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t25042/90/1396371626/95284/f11d5233/5bb04e3fNeb20ea55.jpg', 'https://item.jd.com/6846555.html', NULL, '14', 2020042842, '2020-10-16 18:00:19', 1, 0, 7902, 8519);
INSERT INTO `goods` VALUES (377, 100014055534, '美的 Midea 新一级能效 1匹 冷暖变频 智能控制 KFR-26GWBP3DN8Y-TP200(1) ', 2799, 2799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119824/24/10841/62955/5f0bf34dE9632ba8a/a6b4c09e5d76a732.jpg', 'https://item.jd.com/100014055534.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 8115, 7117);
INSERT INTO `goods` VALUES (378, 1625101, '松下（Panasonic）挂烫机 家用熨斗 手持蒸汽挂烫机 双重加热 NI-GWC140 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t21313/37/437207016/50601/5ccfa1de/5b0d17d8N5e42e048.jpg', 'https://item.jd.com/1625101.html', NULL, '14', 2020042842, '2020-10-16 18:00:19', 1, 0, 1897, 3007);
INSERT INTO `goods` VALUES (379, 100007457361, '美的(Midea)大1.5匹全直流一级变频智能挂机空调 KFR-35GWBP3DN8Y-TP200(B1）线下同款 ', 2699, 2699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119157/8/8300/178958/5ecdd63cEe929788a/2fd07a1fa000239d.jpg', 'https://item.jd.com/100007457361.html', NULL, '5', 2020050665, '2020-10-16 18:00:19', 1, 0, 9275, 8111);
INSERT INTO `goods` VALUES (380, 100000561936, '松下（Panasonic）电熨斗家用 手持蒸汽挂烫机 高温杀菌 30秒快速启动 礼盒套装 NI-GHA046-DJ ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t25420/143/2585638856/73488/29fed741/5beaa1c6N80af844f.jpg', 'https://item.jd.com/100000561936.html', NULL, '14', 2020042842, '2020-10-16 18:00:19', 1, 0, 7170, 8218);
INSERT INTO `goods` VALUES (381, 100014055542, '美的 Midea 新一级能效 变频柜机 2匹 KFR-51LWBP3DN8Y-YB300(1) ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/147047/22/2768/166996/5f0bff57E2bbe611a/df181665061de9f2.jpg', 'https://item.jd.com/100014055542.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 2489, 3688);
INSERT INTO `goods` VALUES (382, 100007761901, '美的 Midea 新一级能效 1.5匹 家用挂式空调 KFR-35GWBP3DN8Y-TP200(1) ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117159/23/12286/62955/5f0bf42aEf49e9828/b7599563283834d7.jpg', 'https://item.jd.com/100007761901.html', NULL, '5', 2020050665, '2020-10-16 18:00:19', 1, 0, 5386, 6169);
INSERT INTO `goods` VALUES (383, 100013599878, '美的（Midea）锋行大1匹 一级变频WIFI冷暖挂机空调 线下同款 KFR- 26GWBP3DN8Y-TP200(B1) ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116929/6/3600/174235/5ea8e931E09e1e8be/8222c75f2002a954.jpg', 'https://item.jd.com/100013599878.html', NULL, '5', 2020050665, '2020-10-16 18:00:19', 1, 0, 3461, 8321);
INSERT INTO `goods` VALUES (384, 100007761923, '美的 Midea 新能效 变频冷暖 家用立式柜机 KFR-51LWBP2DN8Y-YA400(3) ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/140812/8/2745/48005/5f0bf6bdE0f915048/7d91535ef6e73786.jpg', 'https://item.jd.com/100007761923.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 5937, 2321);
INSERT INTO `goods` VALUES (385, 100014055514, '美的 Midea 新一级能效 3匹 家用变频柜机 KFR-72LWBP3DN8Y-YH200(1) ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/141080/39/2855/167707/5f0c12dbE69f68642/7823a1a1b9397d43.jpg', 'https://item.jd.com/100014055514.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 9506, 6849);
INSERT INTO `goods` VALUES (386, 4118243, '万家乐 80升双防漏电保护 无线遥控 预约洗浴 ECO节能 家用商用 电热水器D80-H21A ', 798, 798, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98514/34/16134/170873/5e78a489E4ac69cc0/e9742b94f03c4e21.jpg', 'https://item.jd.com/4118243.html', NULL, '8', 2020052036, '2020-10-16 18:00:19', 1, 0, 7952, 5012);
INSERT INTO `goods` VALUES (387, 100009564188, '美的（Midea）电压力锅 球形双胆压力煲 一键排气 匀火速热电高压锅 YL50Easy203（李现推荐） ', 359, 359, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/84665/34/14257/248765/5db28f3bEead98866/2862b3dc3dc39933.jpg', 'https://item.jd.com/100009564188.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 7158, 4837);
INSERT INTO `goods` VALUES (388, 1447319, '九阳（Joyoung）热水壶烧水壶电水壶 双层防烫304不锈钢 家用大容量电热水壶 K15-F626（邓伦推荐） ', 66, 66, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91814/38/11527/120449/5e392e14E22d1ef85/702248926a19ff1e.jpg', 'https://item.jd.com/1447319.html', NULL, '14', 2020050627, '2020-10-16 18:00:19', 1, 0, 2707, 8043);
INSERT INTO `goods` VALUES (389, 1447319, '九阳（Joyoung）热水壶烧水壶电水壶 双层防烫304不锈钢 家用大容量电热水壶 K15-F626（邓伦推荐） ', 66, 66, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91814/38/11527/120449/5e392e14E22d1ef85/702248926a19ff1e.jpg', 'https://item.jd.com/1447319.html', NULL, '14', 2020050627, '2020-10-16 18:00:19', 1, 0, 9500, 8861);
INSERT INTO `goods` VALUES (390, 100007722345, '美的 Midea 新一级能效 1匹 冷暖变频 智能控制 KFR-26GWBP3DN8Y-TP200(1) ', 3099, 3099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/123768/27/6165/178958/5efece22E23c7bdf0/4f5b46c9149108c2.jpg', 'https://item.jd.com/100007722345.html', NULL, '14', 2020050665, '2020-10-16 18:00:19', 1, 0, 3306, 3027);
INSERT INTO `goods` VALUES (391, 100007999529, '康佳（KONKA）10公斤全自动波轮洗衣机 大容量 家用租房 金属机身 一键启动智能洗 快洗自洁XQB100-912G ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125003/32/10732/32777/5f438d7bEe97d0f1e/c523e83d881c525f.jpg', 'https://item.jd.com/100007999529.html', NULL, '3', 2020033018, '2020-10-16 18:00:19', 1, 0, 3533, 2265);
INSERT INTO `goods` VALUES (392, 942300, '九阳（Joyoung）料理机电动多功能四杯榨汁机研磨绞肉机婴儿辅食机搅拌机果汁机豆浆JYL-C022E【邓伦推荐】 ', 179, 179, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/72233/28/15089/452802/5dcb6393Ed8331c2c/9daf130c52939cde.jpg', 'https://item.jd.com/942300.html', NULL, '14', 2020050627, '2020-10-16 18:00:19', 1, 0, 1209, 4836);
INSERT INTO `goods` VALUES (393, 942300, '九阳（Joyoung）料理机电动多功能四杯榨汁机研磨绞肉机婴儿辅食机搅拌机果汁机豆浆JYL-C022E【邓伦推荐】 ', 179, 179, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/72233/28/15089/452802/5dcb6393Ed8331c2c/9daf130c52939cde.jpg', 'https://item.jd.com/942300.html', NULL, '14', 2020050627, '2020-10-16 18:00:19', 1, 0, 1832, 7924);
INSERT INTO `goods` VALUES (394, 100013344874, '小米 MI 小米行车记录仪2 2K版 140°超广角 智能语音声控 3D降噪夜视+32G卡套装 ', 439, 439, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/131666/4/1080/126074/5ed4d829E9ad48d6c/772976f4f23a39a2.jpg', 'https://item.jd.com/100013344874.html', NULL, '14', 2020042785, '2020-10-16 18:00:19', 1, 0, 7543, 8987);
INSERT INTO `goods` VALUES (395, 1788774, '海尔（Haier）60升家用速热电热水器3000W大功率储水式双管7倍增容一级能效节能2.0安全防电墙EC6003-G6 ', 1299, 1299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102201/24/15196/117242/5e6f55a5E41479ec5/a2dfe68ef35f02f7.jpg', 'https://item.jd.com/1788774.html', NULL, '8', 2020033045, '2020-10-16 18:00:19', 1, 0, 3801, 5942);
INSERT INTO `goods` VALUES (396, 100014234988, '格力（GREE）加湿器 5升大容量 上加水 多重净化静音 加湿器家用 高出雾 办公室 卧室空气加湿器SCK-50X62 ', 369, 369, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125931/16/7193/37505/5f100d65E50bd4c8d/f2746900c6d54b56.jpg', 'https://item.jd.com/100014234988.html', NULL, '14', 2020050630, '2020-10-16 18:00:19', 1, 0, 5185, 2326);
INSERT INTO `goods` VALUES (397, 5055452, '格力（GREE）加湿器 静音迷你办公室卧室家用带香薰盒加湿孕妇婴儿可用 SC-2002-WG 椭圆白 ', 289, 289, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93531/20/2273/75691/5dce0cdbEd8915fe4/6501150574abba2d.jpg', 'https://item.jd.com/5055452.html', NULL, '14', 2020050630, '2020-10-16 18:00:19', 1, 0, 2079, 7018);
INSERT INTO `goods` VALUES (398, 8963193, '格力（GREE）加湿器 5L大水箱 智能恒湿静音办公室卧室家用带香薰盒加湿SCK-50X60C ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/77506/1/15250/57387/5dce0d21E73b5c993/ff964e7ec195fd46.jpg', 'https://item.jd.com/8963193.html', NULL, '14', 2020050630, '2020-10-16 18:00:19', 1, 0, 2272, 5732);
INSERT INTO `goods` VALUES (399, 100005352561, '倍轻松（breo）石墨烯热敷眼罩 双面真丝面料 USB插口快速发热随时呵护双眼睡眠遮光透气眼罩眼贴 ', 159, 159, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108468/27/6733/100016/5e52376eE18fec884/0603d45c50dbbb90.jpg', 'https://item.jd.com/100005352561.html', NULL, '14', 2020052058, '2020-10-16 18:00:19', 1, 0, 4032, 9427);
INSERT INTO `goods` VALUES (400, 100007296379, '飞科（FLYCO）毛球修剪器 FR5218 充电式剃去毛球器 剪毛器 ', 30, 30, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115796/15/7706/165330/5ec4f89bE2593a82e/5e2f7ba7ada75b7d.jpg', 'https://item.jd.com/100007296379.html', NULL, '15', 2020052009, '2020-10-16 18:00:19', 1, 0, 8131, 8843);
INSERT INTO `goods` VALUES (401, 100014120186, '华帝（VATTI）空气能热水器 75°高温 150升家用一体式电热水器 150TF ', 6199, 6199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115131/35/11839/349164/5f05208cE5cdae7f3/5d4d6aa1fb8afc38.jpg', 'https://item.jd.com/100014120186.html', NULL, '8', 2020050688, '2020-10-16 18:00:20', 1, 0, 6807, 4159);
INSERT INTO `goods` VALUES (402, 100003503979, '格力（GREE）京品家电加湿器 静音 上加水 空气加湿办公室卧室家用 香薰 母婴可用 双重防漏水SC-30X76 ', 139, 139, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/50900/7/15832/57430/5dce0ca7E7c173d86/9a1365522e1edd09.jpg', 'https://item.jd.com/100003503979.html', NULL, '14', 2020050630, '2020-10-16 18:00:20', 1, 0, 7648, 3015);
INSERT INTO `goods` VALUES (403, 4986983, '格力（GREE）加湿器 5L大水箱 智能恒湿静音办公室卧室家用带香薰盒加湿SCK-50X60b 白 ', 389, 389, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85131/15/2293/84400/5dce0ceeE171b14bf/7f278dca751fad68.jpg', 'https://item.jd.com/4986983.html', NULL, '14', 2020050630, '2020-10-16 18:00:20', 1, 0, 3139, 9796);
INSERT INTO `goods` VALUES (404, 8484043, '格力（GREE）加湿器 3L静音迷你办公室卧室家用带香薰盒加湿孕妇婴儿可用 SC-30X60 椭圆白 ', 319, 319, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96181/35/2285/82831/5dce0d0fE75b9a69e/ea4873a243fa1ce4.jpg', 'https://item.jd.com/8484043.html', NULL, '14', 2020050630, '2020-10-16 18:00:20', 1, 0, 7701, 4804);
INSERT INTO `goods` VALUES (405, 100013735592, '格力（GREE）加湿器 4升大容量 上加水 多重净化静音 加湿器家用 高出雾 办公室 卧室空气加湿器SCK-40X71 ', 219, 219, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/138341/14/789/231700/5ee7a2b5E5903d59d/451cc7369dbc2562.jpg', 'https://item.jd.com/100013735592.html', NULL, '14', 2020050630, '2020-10-16 18:00:20', 1, 0, 7935, 9136);
INSERT INTO `goods` VALUES (406, 100007049726, '华帝 VATTI 3C认证新沪泵系列回水器 家用循环泵 热水循环系统 热水器内置水泵循环泵120-9XH ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100122/37/9351/159146/5e0ea918Ecc0a7cb9/27179b3cfe5a1f9d.jpg', 'https://item.jd.com/100007049726.html', NULL, '8', 2020050688, '2020-10-16 18:00:20', 1, 0, 5643, 5282);
INSERT INTO `goods` VALUES (407, 100013375178, '飞科（FLYCO）毛球修剪器 FR5255 充电式剃去毛球器 剪毛器 ', 79, 79, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/128519/3/2382/106333/5ec4f7a7E21fbc87b/c6ac66e3aa4909df.jpg', 'https://item.jd.com/100013375178.html', NULL, '15', 2020052009, '2020-10-16 18:00:20', 1, 0, 7695, 1388);
INSERT INTO `goods` VALUES (408, 100003336073, '万家乐 12升双重净浴燃热 一键智能浴 智能宽频调温 燃气热水器(天然气)JSQ24-D2 ', 848, 848, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99173/13/16153/272664/5e789459E525ef6db/eba9df8911ca3ee9.jpg', 'https://item.jd.com/100003336073.html', NULL, '8', 2020052036, '2020-10-16 18:00:20', 1, 0, 4740, 9412);
INSERT INTO `goods` VALUES (409, 7427648, '创维 (SKYWORTH) 455升 冰箱双开门 对开门 四开门十字门 家用风冷无霜 ACS净味保鲜 大冷冻 BCD-455WY ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87000/16/15208/157732/5e6f2744E04c90f1f/577452a451381b1e.jpg', 'https://item.jd.com/7427648.html', NULL, '2', 2020033015, '2020-10-16 18:00:20', 1, 0, 5978, 7014);
INSERT INTO `goods` VALUES (410, 100004705033, '长虹65D5P 65英寸液晶电视机 超薄全面屏 远场语音 智慧屏 AIoT物联 人工智能 4K HDR 教育电视（黑色） ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/70196/1/10108/290893/5d79fb4cE88571981/2abcf24ca7888aaf.jpg', 'https://item.jd.com/100004705033.html', NULL, '1', 2020052068, '2020-10-16 18:00:20', 1, 0, 3135, 6490);
INSERT INTO `goods` VALUES (411, 100007130395, '九阳（Joyoung）热水壶烧水壶电水壶 1.7L无缝内胆双层锁温防烫 家用电热水壶K17-F629【邓伦推荐】 ', 129, 129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87844/25/17480/112458/5e86de3eE35dfa1b6/7a43183d6571c9fe.jpg', 'https://item.jd.com/100007130395.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 5472, 8949);
INSERT INTO `goods` VALUES (412, 100007130395, '九阳（Joyoung）热水壶烧水壶电水壶 1.7L无缝内胆双层锁温防烫 家用电热水壶K17-F629【邓伦推荐】 ', 129, 129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87844/25/17480/112458/5e86de3eE35dfa1b6/7a43183d6571c9fe.jpg', 'https://item.jd.com/100007130395.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 3140, 7440);
INSERT INTO `goods` VALUES (413, 64975615292, '海信（Hisense）多门双开门冰箱变频无霜小型家用电冰箱 322升 BCD-322WNK1DPUS ', 2799, 2799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89200/16/17042/81533/5e8216fcE6d0f4d70/a4a4b918df2415ee.jpg', 'https://item.jd.com/64975615292.html', NULL, '2', 2020033057, '2020-10-16 18:00:20', 1, 0, 9672, 6955);
INSERT INTO `goods` VALUES (414, 100012954822, 'TCL 55T7D 55英寸高色域画质 超薄金属机身 全场景AI 2+32GB大内存 全面屏4K超高清智能电视机 ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110746/27/8722/162800/5eb8c0caE074e246a/e09778c18768a30d.jpg', 'https://item.jd.com/100012954822.html', NULL, '1', 2020033093, '2020-10-16 18:00:20', 1, 0, 4647, 9331);
INSERT INTO `goods` VALUES (415, 100015623874, '米家 小米吸尘器家用无线手持 拖地机 吸拖一体机 干湿两用 150AW大吸力可除螨 K10 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/153467/37/1055/19424/5f72eaf6Ec4daafb8/21eb22dbac6dd6fb.jpg', 'https://item.jd.com/100015623874.html', NULL, '14', NULL, '2020-10-16 18:00:20', 1, 0, 8849, 7345);
INSERT INTO `goods` VALUES (416, 100004685357, '美的（Midea）取暖器电暖器电暖气家用 居浴两用 浴室防水 电热炉 欧式快热炉HDY20K ', 229, 229, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105348/31/10705/198735/5e1fbdb3E32c1a833/a561e8d1ce8257e3.jpg', 'https://item.jd.com/100004685357.html', NULL, '14', 2020050665, '2020-10-16 18:00:20', 1, 0, 1983, 9050);
INSERT INTO `goods` VALUES (417, 100015103862, '方太（FOTILE）EMD16A+HC8BE 油烟机灶具(天然气) 家用抽吸油烟机燃气灶 欧式触控挥手套装下潜环吸 ', 5299, 5299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121394/12/11549/57650/5f4d18e9Efab58acf/817a0063e79502e9.jpg', 'https://item.jd.com/100015103862.html', NULL, '6', 2020050693, '2020-10-16 18:00:20', 1, 0, 2756, 2175);
INSERT INTO `goods` VALUES (418, 100014006174, '九阳（Joyoung）热水壶烧水壶电水壶1.7L 内外双钢无缝双层防烫304不锈钢家用开水壶K17-F67【邓伦推荐】 ', 109, 109, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/145040/6/957/274620/5eeb4b46E909778bf/b06bd9193e176536.jpg', 'https://item.jd.com/100014006174.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 8824, 5481);
INSERT INTO `goods` VALUES (419, 100014006174, '九阳（Joyoung）热水壶烧水壶电水壶1.7L 内外双钢无缝双层防烫304不锈钢家用开水壶K17-F67【邓伦推荐】 ', 109, 109, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/145040/6/957/274620/5eeb4b46E909778bf/b06bd9193e176536.jpg', 'https://item.jd.com/100014006174.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 1477, 9261);
INSERT INTO `goods` VALUES (420, 100013683972, '小米 MI 移动电源3 30000mAh 18W快充版 白色 适用苹果安卓手机平板电脑 充电宝 ', 169, 169, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/138427/22/1899/213278/5efd83ebE48fd2e9e/29d2e7e23d06afd1.jpg', 'https://item.jd.com/100013683972.html', NULL, '14', 2020042785, '2020-10-16 18:00:20', 1, 0, 9676, 4925);
INSERT INTO `goods` VALUES (421, 6313460, 'LG 10公斤DD变频直驱洗烘一体蒸汽洗全自动洗衣机 蒸汽除菌 奢华银 WD-C51QHD45 ', 4399, 4399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104942/31/12199/89953/5e43c2adE2419e999/2225348b8edcaf25.jpg', 'https://item.jd.com/6313460.html', NULL, '3', 2020050647, '2020-10-16 18:00:20', 1, 0, 4938, 2063);
INSERT INTO `goods` VALUES (422, 100010793474, '九阳（Joyoung） 养生壶 煎药壶花茶壶 玻璃炖蛊 煮茶器 烧水壶 液体加热器1.5L DGD1506BQ ', 209, 209, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89543/27/6393/175494/5df3357dEc0d43dff/efe216ad64d84717.jpg', 'https://item.jd.com/100010793474.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 9967, 8719);
INSERT INTO `goods` VALUES (423, 100010793474, '九阳（Joyoung） 养生壶 煎药壶花茶壶 玻璃炖蛊 煮茶器 烧水壶 液体加热器1.5L DGD1506BQ ', 209, 209, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89543/27/6393/175494/5df3357dEc0d43dff/efe216ad64d84717.jpg', 'https://item.jd.com/100010793474.html', NULL, '14', 2020050627, '2020-10-16 18:00:20', 1, 0, 1855, 1569);
INSERT INTO `goods` VALUES (424, 100002092729, '新科（Shinco）KY-20F1 移动空调1P单冷一体机免排水立式免安装出租房小空调 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/78781/22/4078/140248/5d23ed9cEc22c399c/faa924acfd15d203.jpg', 'https://item.jd.com/100002092729.html', NULL, '5', 2020052029, '2020-10-16 18:00:20', 1, 0, 4045, 4174);
INSERT INTO `goods` VALUES (425, 100002607015, '新科（Shinco） 移动空调1P单冷一体机免排水立式免安装出租房小空调 KY-20F1 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/36396/28/1648/115576/5cb3ee97Effaef190/7751e950ac375807.jpg', 'https://item.jd.com/100002607015.html', NULL, '5', 2020052029, '2020-10-16 18:00:20', 1, 0, 5303, 2779);
INSERT INTO `goods` VALUES (426, 7534952, '创维（Skyworth）160升双门冰箱 金属无痕面板 快速冷冻 节能实用型冰箱（炫银）BCD-160 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/10470/32/6892/48677/5c247cefE08cf90db/64773e2c38b27a9a.jpg', 'https://item.jd.com/7534952.html', NULL, '2', 2020033015, '2020-10-16 18:00:20', 1, 0, 6224, 1056);
INSERT INTO `goods` VALUES (427, 100014240042, '方太（FOTILE）EM72T.S+TH26B 油烟机灶具 欧式烟灶套装 抽油烟机 燃气灶4.5kW（天然气） 自动升降12T ', 7399, 7399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/141981/39/3035/71557/5f0fe84cEfe010b63/6a36fd92fe63ccc5.jpg', 'https://item.jd.com/100014240042.html', NULL, '6', 2020050693, '2020-10-16 18:00:20', 1, 0, 9702, 7301);
INSERT INTO `goods` VALUES (428, 100014464252, '方太（FOTILE） EM72T.S+HT8BE.S 油烟机灶具套装 家用大火力燃气灶（天然气）欧式自动升降吸油烟机 ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111185/35/14008/71838/5f2a146fEbdffb100/e278565253cb598e.jpg', 'https://item.jd.com/100014464252.html', NULL, '6', 2020050693, '2020-10-16 18:00:20', 1, 0, 7568, 2756);
INSERT INTO `goods` VALUES (429, 100011021514, '创维（SKYWORTH）55Q30 55英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86970/18/9412/78488/5e0e9617E5f03da91/e9acd4a113196165.jpg', 'https://item.jd.com/100011021514.html', NULL, '1', 2020033015, '2020-10-16 18:00:20', 1, 0, 7687, 7881);
INSERT INTO `goods` VALUES (430, 8390929, 'LG 8kg蒸汽除菌洗 除菌率高达99.99% 智能手洗直驱变频全自动滚筒洗烘一体机洗衣机 FLD80R2L ', 3799, 3799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/75768/19/15592/146554/5dd21264Ef66c533d/cba87957c5b6859f.jpg', 'https://item.jd.com/8390929.html', NULL, '3', 2020050647, '2020-10-16 18:00:20', 1, 0, 9252, 5211);
INSERT INTO `goods` VALUES (431, 100011141500, '创维（SKYWORTH）75Q91 75英寸8K智能AI画质引擎电视 声控语音 升降式摄像头 智慧屏家电 8+128G内存 全面屏 ', 49999, 49999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110668/2/4323/137036/5e1bcf11E268d626b/04ad6849e4a55dd2.jpg', 'https://item.jd.com/100011141500.html', NULL, '1', 2020033015, '2020-10-16 18:00:20', 1, 0, 8282, 3372);
INSERT INTO `goods` VALUES (432, 100006111095, '创维（SKYWORTH）55Q40 55英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102266/28/9404/159662/5e0e97a8E721eefd5/98ccdecd2ca83f89.jpg', 'https://item.jd.com/100006111095.html', NULL, '1', 2020033015, '2020-10-16 18:00:20', 1, 0, 8241, 2420);
INSERT INTO `goods` VALUES (433, 100007012847, '创维（SKYWORTH）55G71 55英寸4K全民AI娱乐电视 声控语音 升降式摄像头 2+32G内存 全面屏 防蓝光护眼 ', 5999, 5999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111277/24/2261/171889/5ea0f209E340fb576/d8dc36070aa8314c.jpg', 'https://item.jd.com/100007012847.html', NULL, '1', 2020033015, '2020-10-16 18:00:20', 1, 0, 6792, 5775);
INSERT INTO `goods` VALUES (434, 100008263907, '方太 FOTILE EMD22A+HT8BE.S油烟机燃气灶套餐 抽吸油烟机灶具 挥手智控 ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121576/9/10673/102687/5f43daf3Ea2939914/b4a26a499f0854d5.jpg', 'https://item.jd.com/100008263907.html', NULL, '6', 2020050693, '2020-10-16 18:00:20', 1, 0, 7446, 4066);
INSERT INTO `goods` VALUES (435, 100003336055, '创维（SKYWORTH）75Q40 75英寸4K超高清 全面屏 人工智能语音 网络WIFI 液晶平板物联网电视机 线下同款 ', 29999, 29999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87729/23/7570/159680/5dfc67b5E080f7ad5/9cab1ffeeb082ff4.jpg', 'https://item.jd.com/100003336055.html', NULL, '1', 2020033015, '2020-10-16 18:00:20', 1, 0, 9056, 2520);
INSERT INTO `goods` VALUES (436, 100011021516, '创维（SKYWORTH）65Q30 65英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 8999, 8999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96505/20/9400/78421/5e0e96e7E04b0b164/0cc2d2120993ffaf.jpg', 'https://item.jd.com/100011021516.html', NULL, '1', 2020033015, '2020-10-16 18:00:21', 1, 0, 7753, 4391);
INSERT INTO `goods` VALUES (437, 100015588496, '方太（FOTILE）EMD11A+TH33G 油烟机灶具(天然气) 燃气灶家用抽吸不锈钢油烟机 欧式触控挥手烟灶套装 ', 6599, 6599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/116598/1/18397/70191/5f685883Ee3340cf6/91a9c12d2688c4d1.jpg', 'https://item.jd.com/100015588496.html', NULL, '6', 2020050693, '2020-10-16 18:00:21', 1, 0, 4049, 2043);
INSERT INTO `goods` VALUES (438, 6116339, '老板（Robam）烤箱 嵌入式 60L大容量触控 家用嵌入式电烤箱 KQWS-2600-R073 ', 4299, 4299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86788/4/12677/157754/5e4f7450Ebaf26ac3/f2d40d64034b1579.jpg', 'https://item.jd.com/6116339.html', NULL, '13', 2020050697, '2020-10-16 18:00:21', 1, 0, 8057, 5949);
INSERT INTO `goods` VALUES (439, 100003138413, '方太（FOTILE）油烟机 烟灶套装 欧式油烟机灶具套装 立体环吸一键瞬吸云魔方 EMC5+HT8BE ', 4199, 4199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85093/20/15058/172303/5e6cc960E59df8496/e172ce1a28556ad3.jpg', 'https://item.jd.com/100003138413.html', NULL, '4', 2020050693, '2020-10-16 18:00:21', 1, 0, 1331, 7100);
INSERT INTO `goods` VALUES (440, 100002998526, '新科（Shinco）KY-26S3 移动空调大1匹 单冷 免安装 免排水 独立除湿家用厨房客厅 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t28822/167/1095751411/43865/1c67ffe3/5cd633eaN93474d12.jpg', 'https://item.jd.com/100002998526.html', NULL, '5', 2020052029, '2020-10-16 18:00:21', 1, 0, 3946, 3283);
INSERT INTO `goods` VALUES (441, 100002998526, '新科（Shinco）KY-26S3 移动空调大1匹 单冷 免安装 免排水 独立除湿家用厨房客厅 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t28822/167/1095751411/43865/1c67ffe3/5cd633eaN93474d12.jpg', 'https://item.jd.com/100002998526.html', NULL, '5', 2020052029, '2020-10-16 18:00:22', 1, 0, 3518, 8946);
INSERT INTO `goods` VALUES (442, 100011021520, '创维（SKYWORTH）43Q40 43英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 4499, 4499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98331/34/9394/159863/5e0e970aEbbc8e14d/a7fc954dc809035d.jpg', 'https://item.jd.com/100011021520.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 6790, 7878);
INSERT INTO `goods` VALUES (443, 100008138757, '方太（FOTILE）EM72T.S+TH33G天然气 油烟机灶具套装 家用抽吸油烟机不锈钢燃气灶 ', 6099, 6099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125149/15/9452/123448/5f326ce6Ef010a80e/2c57024b02f10c2e.jpg', 'https://item.jd.com/100008138757.html', NULL, '6', 2020050693, '2020-10-16 18:00:22', 1, 0, 4779, 3688);
INSERT INTO `goods` VALUES (444, 100006452085, '美的（Midea）消毒柜家用 消毒碗柜 碗筷 小型 94L XC61 ', 1299, 1299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89130/7/15014/80714/5e6b5875E0032912e/b76dd00e01d5e8ad.jpg', 'https://item.jd.com/100006452085.html', NULL, '9', 2020050665, '2020-10-16 18:00:22', 1, 0, 4753, 8998);
INSERT INTO `goods` VALUES (445, 100004516437, '创维（SKYWORTH）65Q60 55英寸4K超高清 悬浮全面屏 声控AI电视 升降式摄像头 液晶平板电视 3+64G 线下同款 ', 10999, 10999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87726/33/5630/111954/5def0bf5Ec785ef79/ca9973c872a8a571.jpg', 'https://item.jd.com/100004516437.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 2319, 4664);
INSERT INTO `goods` VALUES (446, 100011021518, '创维（SKYWORTH）50Q40 50英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 5699, 5699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97271/25/9360/159682/5e0e9795E3fe3e702/6f3d93e10a9af7a4.jpg', 'https://item.jd.com/100011021518.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 5706, 7100);
INSERT INTO `goods` VALUES (447, 100009253892, '方太（FOTILE）油烟机 抽油烟机灶具套装 欧式自动升降旗舰云魔方烟灶套装EM72T.S+HT8BE(天然气) ', 5899, 5899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109289/21/8974/60115/5e6cd471Eaefc37fb/03e8dca8c4bba347.jpg', 'https://item.jd.com/100009253892.html', NULL, '4', 2020050693, '2020-10-16 18:00:22', 1, 0, 1984, 7648);
INSERT INTO `goods` VALUES (448, 100011516554, '苏泊尔（SUPOR）4L小快电饭煲电饭锅多功能家用智能电饭煲2-5人20分钟柴火饭SF40FC661 ', 339, 339, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98166/35/13859/299683/5e5f6703Ec8514178/24ec36fb7439047a.jpg', 'https://item.jd.com/100011516554.html', NULL, '14', 2020050628, '2020-10-16 18:00:22', 1, 0, 2087, 9583);
INSERT INTO `goods` VALUES (449, 100006191945, '创维（SKYWORTH）75G25 75英寸4K超高清电视 人工智能语音 超大屏电视 蓝牙WiFi平板电视机 线下同款 ', 9499, 9499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107538/17/4389/99605/5e1d69deE513f5473/3c5d23beed8f77b5.jpg', 'https://item.jd.com/100006191945.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 1386, 3057);
INSERT INTO `goods` VALUES (450, 100002351802, '美的（Midea）油烟机 欧式抽油烟机 烟灶套装 家用吸油烟机 煤气灶 4.2KW燃气灶 T33+Q216B-Y（液化气） ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/51120/18/8334/137230/5d5a063fE238b0530/ff44b139b82ee2f8.jpg', 'https://item.jd.com/100002351802.html', NULL, '6', 2020050665, '2020-10-16 18:00:22', 1, 0, 4514, 6572);
INSERT INTO `goods` VALUES (451, 100011021528, '创维（SKYWORTH）65Q40 65英寸智能声控电视 4K超高清HDR AIoT物联网 网络WIFI 液晶电视 智慧屏 线下同款 ', 9999, 9999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107614/17/3200/159725/5e0e987cEa846cc17/7eecee558a700d9e.jpg', 'https://item.jd.com/100011021528.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 7407, 7104);
INSERT INTO `goods` VALUES (452, 100014251778, '创维 Skyworth 98G91 98英寸 超高清电视智能防蓝光护眼网络液晶电视 4+64G大内存无卡顿 AI画质芯片 ', 69999, 69999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/136616/13/4583/123402/5f111166E3cf2229e/b99322005a849e05.jpg', 'https://item.jd.com/100014251778.html', NULL, '1', 2020033015, '2020-10-16 18:00:22', 1, 0, 7368, 6278);
INSERT INTO `goods` VALUES (453, 4602883, '海尔((Haier)5匹柜机空调 落地立柜式中央空调 380V直流变频健康自清洁WiFi智控6年包修 KFRd-120LWx2F50BBC22 ', 10999, 10999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104480/19/14475/141316/5e662aeaE76697a8b/193b962f11fd1fe2.jpg', 'https://item.jd.com/4602883.html', NULL, '5', 2020033045, '2020-10-16 18:00:22', 1, 0, 1556, 8011);
INSERT INTO `goods` VALUES (454, 8132300, '海尔(Haier)5匹柜机空调 落地立柜式中央空调 5p机房基站商用空调 380V 24小时连续运转 KFR-120LWx2F71FAJ12 ', 11780, 11780, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/67817/12/9965/144607/5d78b471E84e7cc35/11d05580dd587c43.jpg', 'https://item.jd.com/8132300.html', NULL, '5', 2020033045, '2020-10-16 18:00:22', 1, 0, 9586, 7219);
INSERT INTO `goods` VALUES (455, 100002351834, '美的（Midea）油烟机 欧式抽油烟机 烟灶套装 家用吸油烟机 煤气灶 4.2KW燃气灶 T33+Q216B-T（天然气） ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/56953/30/8101/137230/5d5a061aE25b2f213/43a7c3ab63db1e68.jpg', 'https://item.jd.com/100002351834.html', NULL, '6', 2020050665, '2020-10-16 18:00:22', 1, 0, 9406, 8986);
INSERT INTO `goods` VALUES (456, 100008696195, '松下微波炉PanasonicCS1100蒸汽烤箱多功能微波炉烤箱一体机30升大容量智能微蒸烤一体机 NN-CS1100XPE ', 8999, 8999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/151997/4/619/41607/5f6af7adEc0e9be62/4dfbb566eea3d9eb.jpg', 'https://item.jd.com/100008696195.html', NULL, '13', 2020042842, '2020-10-16 18:00:22', 1, 0, 9673, 2273);
INSERT INTO `goods` VALUES (457, 100015189852, '云米 （VIOMI）451L变频风冷大屏智慧十字门电冰箱 APP远程控制 静音长久保鲜 BCD-451WMLAZ03A ', 3699, 3699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112799/32/16942/57601/5f50941dE4dd79525/e1608e8e4b2592fd.jpg', 'https://item.jd.com/100015189852.html', NULL, '2', 2020052067, '2020-10-16 18:00:22', 1, 0, 6252, 6663);
INSERT INTO `goods` VALUES (458, 100008891260, '云米 (VIOMI) 525L对开门冰箱 21FACE 静音长久保鲜 APP远程控制 21英寸大屏 BCD-525WMLA(U2) ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/84735/7/15115/146671/5e6f1adeE2664dec5/bc4b513ac9478d9d.jpg', 'https://item.jd.com/100008891260.html', NULL, '2', 2020052067, '2020-10-16 18:00:22', 1, 0, 8273, 9095);
INSERT INTO `goods` VALUES (459, 100006875532, '松下（Panasonic）NN-CS1000 蒸汽微波炉 烧烤烘焙一体 一级能效 30升 ', 6999, 6999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97868/3/6283/121578/5df1d7d9E54d7c775/b6c9524ccf82bdbd.jpg', 'https://item.jd.com/100006875532.html', NULL, '14', 2020042842, '2020-10-16 18:00:22', 1, 0, 1224, 5074);
INSERT INTO `goods` VALUES (460, 100007848253, '万家乐 集成灶一体灶家用一级能效 侧吸式抽油烟机燃气灶具套装 环保灶JJZY-KLA832C(B)（液化气） ', 4199, 4199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/149046/8/2741/307273/5f0bcb0cE85486408/2c43a1199e81c7bd.jpg', 'https://item.jd.com/100007848253.html', NULL, '7', 2020052036, '2020-10-16 18:00:22', 1, 0, 7679, 8870);
INSERT INTO `goods` VALUES (461, 100007049730, '华帝 VATTI 3C认证新沪泵系列回水器 家用循环泵 热水循环系统 热水器内置水泵循环泵100-6XB ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104114/15/9412/96849/5e0eacebEde3a6063/6d9c56e14d7b57ee.jpg', 'https://item.jd.com/100007049730.html', NULL, '8', 2020050688, '2020-10-16 18:00:22', 1, 0, 9300, 5062);
INSERT INTO `goods` VALUES (462, 100003327695, '倍轻松（breo）颈部腰部按摩器BM1801腰枕颈枕 智能按摩送礼 可车载礼品 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110627/30/8718/237794/5e69f812Efe840fac/a0d9281fa91fbc57.jpg', 'https://item.jd.com/100003327695.html', NULL, '15', 2020052058, '2020-10-16 18:00:22', 1, 0, 2358, 9816);
INSERT INTO `goods` VALUES (463, 100002764651, '格力（GREE）电饭煲 家用电饭煲 焖香电饭锅 智能定时预约 3L大容量饭煲GDF-3019D ', 199, 199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t27988/151/1342006728/169979/c589aee1/5cdd6c5aNa654bbd2.jpg', 'https://item.jd.com/100002764651.html', NULL, '14', 2020050630, '2020-10-16 18:00:22', 1, 0, 4070, 2217);
INSERT INTO `goods` VALUES (464, 100006994468, '苏泊尔 SUPOR 电蒸锅多功能多用途锅 蒸包子锅32CM电锅 加厚304不锈钢电炒锅电煮锅 电火锅 11L ZN32YK11 ', 279, 279, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/54851/9/6977/396952/5d48e5e0Ee9cea270/07bc5df28620f06a.jpg', 'https://item.jd.com/100006994468.html', NULL, '14', 2020050628, '2020-10-16 18:00:22', 1, 0, 7891, 9074);
INSERT INTO `goods` VALUES (465, 100012523500, '长虹 43D5PF 43英寸智能 语音 蓝光高清4K解码 手机投屏 全面屏平板液晶LED电视机（黑色） ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97372/33/18074/222728/5e8ef1c8E35ec4ce9/73d59dbc8c6e2d83.jpg', 'https://item.jd.com/100012523500.html', NULL, '1', 2020052068, '2020-10-16 18:00:22', 1, 0, 2630, 4054);
INSERT INTO `goods` VALUES (466, 100015137102, '长虹 55D6H 55英寸超薄语音智慧屏AIoT物联 人工智能全面屏4KHDR液晶LED电视机 ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/143668/21/7543/123335/5f508828Ed6e4d328/f6674358432264bd.jpg', 'https://item.jd.com/100015137102.html', NULL, '1', 2020052068, '2020-10-16 18:00:22', 1, 0, 7731, 8863);
INSERT INTO `goods` VALUES (467, 100008170669, '方太（FOTILE）JZY-TH26B（液化气）燃气灶 家用嵌入式双灶具 5.0KW大火力聚能罩猛火灶台 无级顺畅调火 ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/134511/40/6814/67575/5f3378bfE37fac701/30796f5880fbf71e.jpg', 'https://item.jd.com/100008170669.html', NULL, '6', 2020050693, '2020-10-16 18:00:22', 1, 0, 5699, 2159);
INSERT INTO `goods` VALUES (468, 100002764649, '格力（GREE）家用电饭煲 焖香电饭锅 定时预约 5L大容量饭煲GDF-5025C ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t10135/216/2983949643/264214/17d53580/5cdd6c46N1911ab12.jpg', 'https://item.jd.com/100002764649.html', NULL, '14', 2020050630, '2020-10-16 18:00:22', 1, 0, 9845, 9838);
INSERT INTO `goods` VALUES (469, 100007884239, '方太（FOTILE）EMD16T.D+TH25B 油烟机灶具 抽油烟机家用 大火力燃气灶（天然气） 挥手智控欧式烟灶套装 ', 5899, 5899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/140574/26/3078/69397/5f0fe7f6Ed1385fa6/d7b69c7ac453bc8b.jpg', 'https://item.jd.com/100007884239.html', NULL, '6', 2020050693, '2020-10-16 18:00:22', 1, 0, 4895, 4463);
INSERT INTO `goods` VALUES (470, 100005878876, '格力（GREE）董明珠推荐 高压锅电压力锅 家用多功能压力电饭煲揭盖式压力锅4L CY-40X66 ', 229, 229, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t29143/36/1608793555/147507/4292b5b9/5ce6403aNdcde9886.jpg', 'https://item.jd.com/100005878876.html', NULL, '14', 2020050630, '2020-10-16 18:00:22', 1, 0, 1603, 1633);
INSERT INTO `goods` VALUES (471, 100005878856, '格力（GREE）电压力锅双内胆家用电饭煲多功能智能电饭锅高压锅5L CY-50X66S ', 279, 279, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/46353/2/775/121772/5ce6376eEd1053b80/42393cac5b126dee.jpg', 'https://item.jd.com/100005878856.html', NULL, '14', 2020050630, '2020-10-16 18:00:22', 1, 0, 1132, 7638);
INSERT INTO `goods` VALUES (472, 100008581995, '长虹 65D6H 65英寸超薄语音智慧屏AIoT物联 人工智能全面屏4KHDR液晶LED电视机 ', 4199, 4199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/136427/40/9365/176626/5f57287bEe33436ef/5151e489d7960799.jpg', 'https://item.jd.com/100008581995.html', NULL, '1', 2020052068, '2020-10-16 18:00:22', 1, 0, 1239, 1440);
INSERT INTO `goods` VALUES (473, 100012586600, 'TCL 208升 三门冰箱 玻璃门体 三温区中间软冷冻 小型便捷实用电冰箱 翡冷翠 BCD-208TBZ50 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97633/34/18558/66253/5e9536c0E83854206/2194cd49b7646712.jpg', 'https://item.jd.com/100012586600.html', NULL, '2', 2020033093, '2020-10-16 18:00:22', 1, 0, 6264, 6844);
INSERT INTO `goods` VALUES (474, 100013746378, '方太（FOTILE）TH26B（天然气）燃气灶 嵌入式煤气灶双灶 5.0KW大火力 一级能效 ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126605/11/6015/258779/5efed673E89b1072b/92c046adfd5fc2e4.jpg', 'https://item.jd.com/100013746378.html', NULL, '6', 2020050693, '2020-10-16 18:00:22', 1, 0, 7861, 3336);
INSERT INTO `goods` VALUES (475, 2605531, '海尔（Haier）抽油烟机 侧吸式 一级能效 家用 吸油烟机 CXW-200-E800C2 ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108263/40/9049/172169/5e6f2d2eE510fce40/502cc469fb4408c2.jpg', 'https://item.jd.com/2605531.html', NULL, '4', 2020033045, '2020-10-16 18:00:22', 1, 0, 9413, 7692);
INSERT INTO `goods` VALUES (476, 4411970, '奥马(Homa) 118升 双门小冰箱 家用小型两门电冰箱 宿舍 租房 办公室 迷你节能 PS6环保内胆 金色 BCD-118A5 ', 799, 799, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/100393/4/15217/39245/5e6f23a1E2bd32da5/40edfb49b6a5d115.jpg!q80.dpg', 'https://item.jd.com/4411970.html', NULL, '2', NULL, '2020-10-16 18:00:22', 1, 0, 6212, 4749);
INSERT INTO `goods` VALUES (477, 100006564137, '小熊（Bear）颈椎按摩器 迷你按摩器穴位电疗便携式按摩仪贴片 ', 99, 99, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/104992/18/18935/185567/5e982f65Ee1b7a72e/b1ada0a7e6aa129f.jpg', 'https://item.jd.com/100006564137.html', NULL, '15', 2020042873, '2020-10-16 18:00:22', 1, 0, 5929, 9378);
INSERT INTO `goods` VALUES (478, 629009, '倍轻松（breo）头部按摩器iDream 3S眼部按摩仪 头眼一体 按摩头盔送礼 头皮按摩器礼品（新老款随机发货） ', 939, 939, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/39732/5/15537/102717/5d68d623Eb64b84f1/4306cd514d346f83.jpg', 'https://item.jd.com/629009.html', NULL, '15', 2020052058, '2020-10-16 18:00:22', 1, 0, 9385, 1123);
INSERT INTO `goods` VALUES (479, 100000236747, '美的（Midea）13套 热风烘干 独嵌两用 洗烘一体 家用独立式智能除菌洗碗机 Q7 ', 4299, 4299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100618/38/15183/136680/5e6f7433E4a9c0f25/3dff2a888540dc30.jpg', 'https://item.jd.com/100000236747.html', NULL, '10', 2020050665, '2020-10-16 18:00:22', 1, 0, 5540, 5338);
INSERT INTO `goods` VALUES (480, 4251527, '海尔（Haier）抽油烟机 欧式 家用 18立方大吸力 一级能效 吸油烟机 CXW-200-E900T2S ', 1089, 1089, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/85593/15/15431/127010/5e6f2ebfEf2026abb/2ac0e13ef84b271a.jpg', 'https://item.jd.com/4251527.html', NULL, '4', 2020033045, '2020-10-16 18:00:22', 1, 0, 7219, 2356);
INSERT INTO `goods` VALUES (481, 1015684, '海尔（Haier） 二星级 消毒柜 家用 立式 小型 消毒碗柜 光波巴氏消毒 厨房碗筷餐具消毒 ZTD100-A ', 789, 789, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98752/14/17827/183062/5e8bd5bdEbce72cc3/1695d1f8b275dbc6.jpg', 'https://item.jd.com/1015684.html', NULL, '9', 2020033045, '2020-10-16 18:00:23', 1, 0, 6063, 9705);
INSERT INTO `goods` VALUES (482, 3939873, '美的（Midea）美的范免安装家用台式除菌洗碗机 M1-香槟金 ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105469/5/15176/274187/5e6f7357E045ca214/63f8bdbdb298cfc3.jpg', 'https://item.jd.com/3939873.html', NULL, '10', 2020050665, '2020-10-16 18:00:23', 1, 0, 8407, 5033);
INSERT INTO `goods` VALUES (483, 100003862357, '美的（Midea）饮水机 茶吧机家用下置式 多功能智能自主控温 立式冷热型饮水机 YD1103S-X ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/60734/26/3662/43029/5d1d60a2E30f8a448/e26a0815c5a28aed.jpg', 'https://item.jd.com/100003862357.html', NULL, '14', 2020050665, '2020-10-16 18:00:23', 1, 0, 5977, 9066);
INSERT INTO `goods` VALUES (484, 100006022775, '美菱（MELING）528升冰柜商用 单温一室冷冻冷藏冷柜 卧式低温雪柜BCx2FBD-528DTX ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93566/12/9450/133452/5e0ec9a0E0c61e454/9448bf48e4ba6f4d.jpg', 'https://item.jd.com/100006022775.html', NULL, '11', 2020052059, '2020-10-16 18:00:23', 1, 0, 4209, 1816);
INSERT INTO `goods` VALUES (485, 5639503, '万家乐 12升ECO节能燃热 水气双调 智能变升 贴心管家燃气热水器（天然气）JSQ24-T51 ', 1198, 1198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99350/38/15145/185415/5e6f24f7E71e548a0/20d21bcc65b4339a.jpg', 'https://item.jd.com/5639503.html', NULL, '8', 2020052036, '2020-10-16 18:00:23', 1, 0, 8290, 9735);
INSERT INTO `goods` VALUES (486, 100012645168, '美菱（MELING）96升家用冷柜 迷你单门小型欧式酒柜 冷藏展示茶叶水果保鲜冰吧SC-96FL ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/90835/36/18522/63443/5e95b04eE20abcdba/368414076ad6ad23.jpg', 'https://item.jd.com/100012645168.html', NULL, '11', 2020052059, '2020-10-16 18:00:23', 1, 0, 9250, 1641);
INSERT INTO `goods` VALUES (487, 5991813, '星星（XINGX） 1.8米 超市立玻柜 水果蔬菜保鲜柜 鲜奶饮料冷藏柜 商用立式玻璃门展示柜 IVC-375WG ', 14420, 14420, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/3412/25/10881/292313/5bcd3402E2fb5f3e2/af3b863116b1f71d.jpg', 'https://item.jd.com/5991813.html', NULL, '14', NULL, '2020-10-16 18:00:23', 1, 0, 8379, 1803);
INSERT INTO `goods` VALUES (488, 6831609, '倍轻松（breo）头部按摩器Scalp Mini Pro龙抓手 头皮按摩仪送礼 颈部肩部背部腰部腿部可用新老款随机发货 ', 890, 890, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97388/19/14089/161978/5e61ed9dEdcbad5a0/d949f3e494c3d349.jpg', 'https://item.jd.com/6831609.html', NULL, '15', 2020052058, '2020-10-16 18:00:23', 1, 0, 9073, 4475);
INSERT INTO `goods` VALUES (489, 100012660276, '海尔（Haier）燃气灶 智能防干烧 4.5KW大火力 一级能效 家用 嵌入式 天然气灶具JZT-QE9B1(12T) ', 1189, 1189, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112725/12/1342/141845/5e96d6b0E2645ef9b/4501ba190b666a21.jpg', 'https://item.jd.com/100012660276.html', NULL, '6', 2020033045, '2020-10-16 18:00:23', 1, 0, 6897, 6753);
INSERT INTO `goods` VALUES (490, 100003730742, '美菱（MELING）279升卧式展示柜冷柜 单温一室冰柜 雪糕冰箱玻璃门商用小卖店 SCx2FSD-279GT ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105332/17/9413/155968/5e0ebcaaE392e46c9/2c9ebc297d592371.jpg', 'https://item.jd.com/100003730742.html', NULL, '11', 2020052059, '2020-10-16 18:00:23', 1, 0, 6028, 3516);
INSERT INTO `goods` VALUES (491, 100015603590, 'TCL 65Q7D 65英寸高色域AI社交智慧屏 4K超高清 超薄全面屏智能液晶电视机 3+32GB 分体式摄像头 ', 5399, 5399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126322/5/13174/72919/5f689318E056fe99a/17aac79c2d07e0d6.jpg', 'https://item.jd.com/100015603590.html', NULL, '1', 2020033093, '2020-10-16 18:00:23', 1, 0, 1434, 2290);
INSERT INTO `goods` VALUES (492, 100006689897, '松下 Panasonic 家用中央空调多联机MASTER S带W-nanoe X系列 7匹一拖六适用160-180㎡ 0元安装 ME63BS6 ', 64899, 64899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117697/6/16737/128110/5f520861E975667fc/00429613768ed771.jpg', 'https://item.jd.com/100006689897.html', NULL, '5', 2020042842, '2020-10-16 18:00:23', 1, 0, 9553, 6642);
INSERT INTO `goods` VALUES (493, 100012047554, '小熊（Bear）烧水壶电热水壶电水壶 0.6L迷你保温家用旅行便携式冲奶热水壶ZDH-A06H1（米黄色） ', 129, 129, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96180/27/15691/115371/5e743be2E7db6f0d6/0b68de629761f31b.jpg', 'https://item.jd.com/100012047554.html', NULL, '14', 2020042873, '2020-10-16 18:00:23', 1, 0, 2333, 1363);
INSERT INTO `goods` VALUES (494, 100000505005, 'TCL 取暖器2F暖风机2F电暖器2F电暖气2F取暖器家用2F台式暖风机 可摇头 速热TN-T15F ', 80, 80, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/59963/26/16164/169407/5dd75abaE1824d12c/a106d911a5a669b6.jpg!q80.dpg', 'https://item.jd.com/100000505005.html', NULL, '14', 2020033093, '2020-10-16 18:00:23', 1, 0, 6139, 2840);
INSERT INTO `goods` VALUES (495, 100010179052, '万家乐 60升电热水器 3200W速热瀑布洗 短款 净流系统 智能管家 节能模式 剩余水量显示 6倍增容D60-G7 ', 2598, 2598, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109705/28/8949/262802/5e6f5e51Edcca7328/6250131aeadb5c7f.jpg', 'https://item.jd.com/100010179052.html', NULL, '8', 2020052036, '2020-10-16 18:00:23', 1, 0, 1959, 3043);
INSERT INTO `goods` VALUES (496, 100003197693, '容声(Ronshen) 172升 小型两门冰箱 风冷无霜 抗菌 静音节能 经济实用 双门冰箱 金BCD-172WD11D ', 1399, 1399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94855/1/9436/112322/5e0eeb73Ec32b8fcb/a8f347e0d4ccd62c.jpg', 'https://item.jd.com/100003197693.html', NULL, '2', 2020052017, '2020-10-16 18:00:23', 1, 0, 2082, 9075);
INSERT INTO `goods` VALUES (497, 100014306442, '华凌 美的出品 80升电热水器 2100W速热5倍增容健康洗 预约洗浴安全防电墙F8021-YJ2(HY) ', 799, 799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/135861/36/4932/278490/5f164991E22a6813d/e429db04d54a4104.jpg', 'https://item.jd.com/100014306442.html', NULL, '8', 2020052049, '2020-10-16 18:00:23', 1, 0, 6759, 1065);
INSERT INTO `goods` VALUES (498, 100007067808, '华帝（VATTI）空气能热水器 双能动力75°高温 300升家用分体式电热水器 300ETV ', 8699, 8699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99052/37/15303/227374/5e7027ebE77569d37/c62d0ecd86cd1167.jpg', 'https://item.jd.com/100007067808.html', NULL, '8', 2020050688, '2020-10-16 18:00:23', 1, 0, 5623, 8825);
INSERT INTO `goods` VALUES (499, 100005308403, '小米极简都市双肩包2 蓝色 耐磨防水|方形简约造型|轻巧坚固 ', 149, 149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89804/6/15967/307245/5e74bc6dE68684618/12143205317a0bef.jpg', 'https://item.jd.com/100005308403.html', NULL, '14', 2020042785, '2020-10-16 18:00:23', 1, 0, 6653, 3315);
INSERT INTO `goods` VALUES (500, 100009421982, '小米极简都市双肩包2 浅灰色 耐磨防水|方形简约造型|轻巧坚固 ', 149, 149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105847/14/583/81361/5db15770Efafbec43/d44c23d7cefc2392.jpg', 'https://item.jd.com/100009421982.html', NULL, '14', 2020042785, '2020-10-16 18:00:23', 1, 0, 6255, 4030);
INSERT INTO `goods` VALUES (501, 100014331422, '创维（SKYWORTH）40H4 40英寸 人工智能 1+8G大内存 25核处理器 蓝牙语音 防蓝光护眼全面屏电视 ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113599/1/12999/93669/5f170a73E45e375f8/3acddb08e282d6ab.jpg', 'https://item.jd.com/100014331422.html', NULL, '1', 2020033015, '2020-10-16 18:00:23', 1, 0, 6657, 9529);
INSERT INTO `goods` VALUES (502, 100012340902, '【京东智能空调】长虹(CHANGHONG)大2匹 变频 一级能效 熊猫懒一键智享 自清洁 圆柱空调KFR-51LWZDTTW1+R2 ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/98379/28/18082/73940/5e90095cE9b89b8b8/be484bc452fe0599.jpg', 'https://item.jd.com/100012340902.html', NULL, '5', NULL, '2020-10-16 18:00:23', 1, 0, 5739, 8770);
INSERT INTO `goods` VALUES (503, 100000411569, '格力 （GREE）取暖器x2F电暖器x2F电暖气片家用 145MM宽片x2F节能省电 静音加湿烘衣 13片电热油汀 NDY11-X6026a ', 329, 329, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93713/40/11890/113655/5e3bb9bcEe72b00f4/e36f8085b06f413f.jpg', 'https://item.jd.com/100000411569.html', NULL, '14', 2020050630, '2020-10-16 18:00:23', 1, 0, 9138, 6748);
INSERT INTO `goods` VALUES (504, 100009421950, '小米极简都市双肩包2 深灰色 耐磨防水|方形简约造型|轻巧坚固 ', 149, 149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/84966/39/13883/147704/5e5e15ddE021b4541/2c6306f14deaf9d2.jpg', 'https://item.jd.com/100009421950.html', NULL, '14', 2020042785, '2020-10-16 18:00:24', 1, 0, 2898, 1358);
INSERT INTO `goods` VALUES (505, 100011764064, '万家乐线下同款 60升电热水器 出水断电零电洗 3000W双管变频速热 节能模式 1级能效 预约遥控款D60-S6.2 ', 2098, 2098, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99260/22/14267/90728/5e626745Ea0efdda3/ff8b61be71bbf405.jpg', 'https://item.jd.com/100011764064.html', NULL, '8', 2020052036, '2020-10-16 18:00:24', 1, 0, 2787, 2853);
INSERT INTO `goods` VALUES (506, 100006438988, '飞利浦（PHILIPS）男士电动剃须刀漫威系列蜘蛛侠剃胡刀胡须刀刮胡刀MVL3798x2F07 ', 599, 599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/72458/26/2785/217183/5d11b717E51a1bd17/969d2fbeb478fae2.jpg', 'https://item.jd.com/100006438988.html', NULL, '15', 2020042790, '2020-10-16 18:00:24', 1, 0, 9320, 9876);
INSERT INTO `goods` VALUES (507, 100004940849, '小米口袋照片打印机 便携小巧 AR视频照片 趣玩打印 热敏打印机 ', 349, 349, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86217/11/14686/97532/5e68dbe0E514cc3ca/5ec9713334bd11f4.jpg', 'https://item.jd.com/100004940849.html', NULL, '14', 2020042785, '2020-10-16 18:00:24', 1, 0, 1206, 8630);
INSERT INTO `goods` VALUES (508, 100005919747, '澳柯玛（AUCMA）制冰机商用 智能全自动大型制冰器冰块机 奶茶店酒吧ktv制冰设备 90冰格120公斤 AZH-120NE ', 3199, 3199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101558/24/9959/144452/5e143249E55a1acc5/9dfa86e4960978ed.jpg', 'https://item.jd.com/100005919747.html', NULL, '14', 2020052060, '2020-10-16 18:00:24', 1, 0, 9923, 4385);
INSERT INTO `goods` VALUES (509, 100011902546, '万家乐 16升增压零冷水燃气热水器(天然气) 流光玻璃屏 APP控制 智能防护提醒 稳流降噪 防冻款JSQ30-16Z8 ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99375/38/14842/86392/5e6b7661Ecd8f3247/778bf2fa6ba9fd2c.jpg', 'https://item.jd.com/100011902546.html', NULL, '8', 2020052036, '2020-10-16 18:00:24', 1, 0, 6998, 4367);
INSERT INTO `goods` VALUES (510, 1121698, '飞利浦(PHILIPS)卧式吸尘器家用大功率大吸力多种吸嘴无尘袋FC8471x2F81 ', 449, 449, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t22198/129/362653453/91416/1b2f6c94/5b0b83dfNba71b3c5.jpg', 'https://item.jd.com/1121698.html', NULL, '14', 2020042790, '2020-10-16 18:00:24', 1, 0, 9749, 6194);
INSERT INTO `goods` VALUES (511, 100014152244, '海信（Hisense）55E3F 55英寸 4K超高清 智慧语音 超薄悬浮全面屏大屏精致圆角液晶电视机 教育电视 人工智能 ', 2199, 2199, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/154692/27/1058/158340/5f72e8f5E81277c03/86a222668849accd.jpg!q80.dpg', 'https://item.jd.com/100014152244.html', NULL, '1', 2020033057, '2020-10-16 18:00:24', 1, 0, 5384, 8946);
INSERT INTO `goods` VALUES (512, 100007834655, '奥克斯 (AUX) 大1匹 京裕 一级能效 变频冷暖 京品家电 壁挂式空调挂机(KFR-26GWBpR3TYF1+1) 全直流变频 ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/141656/27/2591/212860/5f07c9f8Eebd31b18/3c5039322bc62b73.jpg', 'https://item.jd.com/100007834655.html', NULL, '5', 2020052071, '2020-10-16 18:00:24', 1, 0, 8446, 1575);
INSERT INTO `goods` VALUES (513, 100012179642, '创维（Skyworth）55A20 55英寸高配智慧屏 AI美颜拍摄 远场语音 家电语音互联 光学防蓝光 酷开教育后台电视 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94601/29/16614/327928/5e7da72aE2c7ce748/c45542f3fc3aabac.jpg', 'https://item.jd.com/100012179642.html', NULL, '1', 2020033015, '2020-10-16 18:00:24', 1, 0, 3657, 2775);
INSERT INTO `goods` VALUES (514, 100004129361, '华帝（VATTI）空气能热水器 “聚能仓”保温75°高温 500升家用分体式电热水器 500JG ', 23899, 23899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88458/8/15254/182978/5e7027a7Ec66bfd15/21f191bd1e2270c0.jpg', 'https://item.jd.com/100004129361.html', NULL, '8', 2020050688, '2020-10-16 18:00:24', 1, 0, 5647, 5304);
INSERT INTO `goods` VALUES (515, 100005504228, '倍轻松（breo）脉冲颈椎按摩器 BR110 颈部按摩仪 办公室护颈仪 热敷 富贵包 充电便携送礼 新一代护颈仪礼品 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/83927/21/8627/108445/5d68d3aaE5adb0a3b/921c20755b15effa.jpg', 'https://item.jd.com/100005504228.html', NULL, '15', 2020052058, '2020-10-16 18:00:24', 1, 0, 8242, 8627);
INSERT INTO `goods` VALUES (516, 1326132, '倍轻松（breo）颈椎按摩器SK-2017L礼盒版 肩颈按摩披肩 颈部肩部腰部背部送礼 捶打热敷送礼必备礼品 ', 159, 159, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/96614/2/5560/260205/5dedf8a8E150f5edf/fb8cac1abef59fbd.jpg', 'https://item.jd.com/1326132.html', NULL, '15', 2020052058, '2020-10-16 18:00:24', 1, 0, 9867, 6195);
INSERT INTO `goods` VALUES (517, 3369356, '小熊（Bear）打蛋器 电动料理机家用迷你打奶油机搅拌器烘焙手持DDQ-B01K1 ', 47, 47, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/71998/9/15185/197240/5dcb6aacEe51b4bae/ddc6b3babf9da59e.jpg', 'https://item.jd.com/3369356.html', NULL, '14', 2020042873, '2020-10-16 18:00:24', 1, 0, 2739, 9696);
INSERT INTO `goods` VALUES (518, 8776551, '万家乐 16升燃气热水器(天然气) 四驱恒温 水气双调 智能变升 ECO节能 四季随温感 京品家电JSQ30-D5 ', 1298, 1298, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99723/22/15275/271236/5e6f5cb8Eac4bf16e/b9a789b5937f7ccc.jpg', 'https://item.jd.com/8776551.html', NULL, '8', 2020052036, '2020-10-16 18:00:24', 1, 0, 4578, 8600);
INSERT INTO `goods` VALUES (519, 7009202, '海尔（Haier）16升水气双调精控恒温燃气热水器智能变升随温感四重净化JSQ31-16WD3(12T)天然气 京品家电 ', 1499, 1499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86234/18/15395/206729/5e6f6b46E3f03fc26/79420a8bb42afc64.jpg', 'https://item.jd.com/7009202.html', NULL, '8', 2020033045, '2020-10-16 18:00:24', 1, 0, 8074, 2698);
INSERT INTO `goods` VALUES (520, 100007366411, '飞利浦(PHILIPS)空气净化器家用 京东智能家电过滤细菌除雾霾除过敏原(AC295800除甲醛升级款) ', 2199, 2199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/126156/16/4540/69424/5edf30d9E00c55899/bc081c0f0db8f9d7.jpg', 'https://item.jd.com/100007366411.html', NULL, '14', 2020042790, '2020-10-16 18:00:24', 1, 0, 7861, 7489);
INSERT INTO `goods` VALUES (521, 100014694776, '美菱(MELING)405升 十字对开多门冰箱四开门 十分钟快速净味 彩晶玻璃 一级能效双变频 星云紫 BCD-405WPU9BT ', 5499, 5499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120819/27/10921/90142/5f477b1eE7c432b8e/35950b31b10aa18a.jpg', 'https://item.jd.com/100014694776.html', NULL, '2', 2020052059, '2020-10-16 18:00:25', 1, 0, 7824, 5892);
INSERT INTO `goods` VALUES (522, 100004212475, '康佳KKTV K39K5 39吋8G内存 高速流畅33核 互动投屏 丰富教育资源 高清画质 人工智能语音网络液晶平板电视机 ', 1199, 1199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/90443/31/12053/110693/5e425ca9E8585d3a0/113f4ab172eae4f6.jpg', 'https://item.jd.com/100004212475.html', NULL, '1', 2020033018, '2020-10-16 18:00:25', 1, 0, 8385, 3280);
INSERT INTO `goods` VALUES (523, 100000695577, '亿田（entive） 集成灶S3E 75L大容量一体式侧吸环保灶 钢化玻璃 130°高温蒸箱款 左排天然气 ', 12800, 12800, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/115965/10/11137/463196/5ef9860fEcf4cf26d/1ffccd627f9566ad.jpg!q80.dpg', 'https://item.jd.com/100000695577.html', NULL, '7', NULL, '2020-10-16 18:00:25', 1, 0, 5840, 4234);
INSERT INTO `goods` VALUES (524, 100009505246, '小熊（Bear）美式滴漏咖啡机煮茶器泡茶壶电热水壶咖啡壶 KFJ-A05F1 ', 499, 499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109693/16/5068/82095/5e3130ebEa62bb5d0/6bf114006cb6d35a.jpg', 'https://item.jd.com/100009505246.html', NULL, '14', 2020042873, '2020-10-16 18:00:25', 1, 0, 2507, 5091);
INSERT INTO `goods` VALUES (525, 100012176674, '松下 Panasonic 家用中央空调多联机MASTER S系列 9匹一拖八适用200-220㎡ 0元安装 ME81BYS6 ', 74299, 74299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/121723/5/11681/136413/5f52084aE44020e0a/175da6b11f350a34.jpg', 'https://item.jd.com/100012176674.html', NULL, '5', 2020042842, '2020-10-16 18:00:25', 1, 0, 3528, 4744);
INSERT INTO `goods` VALUES (526, 100007286639, '小米 MI 小米行车记录仪2 2K版 140°超广角 智能语音声控 3D降噪夜视+64G卡套装 ', 469, 469, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111616/32/9321/126094/5ed4d83cE409f0ab0/edb3fbde84c14bda.jpg', 'https://item.jd.com/100007286639.html', NULL, '14', 2020042785, '2020-10-16 18:00:25', 1, 0, 1967, 8428);
INSERT INTO `goods` VALUES (527, 100013523644, '飞利浦（PHILIPS）电动剃须刀全身水洗刮胡刀S321 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113496/33/8316/61315/5ecde49aE77e7c716/31669158b977acbc.jpg', 'https://item.jd.com/100013523644.html', NULL, '15', 2020042790, '2020-10-16 18:00:25', 1, 0, 4536, 9303);
INSERT INTO `goods` VALUES (528, 100006535034, '美的(Midea)446升 十字对开门冰箱 19分钟急速净味 杀菌一级能效双变频 WIFI智能 莫兰迪灰BCD-446WTPZM（E) ', 4999, 4999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91631/18/15225/70838/5e6f77a0Ee0ca53d7/ef36b448ba50673d.jpg', 'https://item.jd.com/100006535034.html', NULL, '2', 2020050665, '2020-10-16 18:00:25', 1, 0, 6986, 3662);
INSERT INTO `goods` VALUES (529, 100012176676, '松下 Panasonic 家用中央空调多联机MASTER S带W-nanoe X系列 8匹一拖七适用180-200㎡ 0元安装 ME72BYS6 ', 74799, 74799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112811/3/15272/152852/5f3cc244E4278f058/dc259bda64040882.jpg', 'https://item.jd.com/100012176676.html', NULL, '5', 2020042842, '2020-10-16 18:00:25', 1, 0, 6145, 4774);
INSERT INTO `goods` VALUES (530, 100011902476, '万家乐 80升电热水器 2500W家用智能遥控款 出水断电零电洗 1级能效 断电记忆 高温灭菌 多重安防D80-SE2 ', 2398, 2398, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105472/39/15023/74666/5e6b7da2E9af465b1/3e7255dd081cc70f.jpg', 'https://item.jd.com/100011902476.html', NULL, '8', 2020052036, '2020-10-16 18:00:25', 1, 0, 5585, 3771);
INSERT INTO `goods` VALUES (531, 7592857, '西门子（SIEMENS）SZ02AXCFI 嵌入式洗碗机玻璃门 白色 ', 790, 790, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/14497/16/14792/103108/5cab1fd8Efbef8af2/33c33555ddec7ef0.jpg', 'https://item.jd.com/7592857.html', NULL, '10', 2020050626, '2020-10-16 18:00:25', 1, 0, 3356, 4324);
INSERT INTO `goods` VALUES (532, 100011902474, '万家乐 60升电热水器 2500W家用智能遥控款 出水断电零电洗 1级能效 断电记忆 高温灭菌 多重安防D60-SE2 ', 2298, 2298, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/106555/12/15034/74666/5e6b7d46E0f0908f0/e617dfbafd616eea.jpg', 'https://item.jd.com/100011902474.html', NULL, '8', 2020052036, '2020-10-16 18:00:25', 1, 0, 3581, 8996);
INSERT INTO `goods` VALUES (533, 100013043294, '奥克斯 (AUX) 1.5匹 京裕 一级能效 全直流变频 变频冷暖 大风量 壁挂式空调挂机(KFR-35GWBpR3TYF1+1) ', 2499, 2499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/122353/9/4393/176196/5edcb507E5908fa2e/c5318118b4c6fc3a.jpg', 'https://item.jd.com/100013043294.html', NULL, '5', 2020052071, '2020-10-16 18:00:25', 1, 0, 7510, 1258);
INSERT INTO `goods` VALUES (534, 100004366803, '西门子(SIEMENS) 10公斤 变频滚筒洗衣机 升级外观 智感洗涤 智能添加（金色） XQG100-WG54A1A30W ', 5299, 5299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/102888/1/15050/68834/5e6ee077E7e7f520f/dfc3a553f7d16851.jpg', 'https://item.jd.com/100004366803.html', NULL, '3', 2020050626, '2020-10-16 18:00:25', 1, 0, 1037, 4001);
INSERT INTO `goods` VALUES (535, 3018245, '松下（Panasonic）美容仪 蒸脸器 家用补水仪 冷热喷 温冷自动 纳米香薰美容器 7种护肤模式 SA97 ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/77271/30/1695/61883/5cff4ef4E1dda9f0d/e81c2d2bbef1aaa0.jpg', 'https://item.jd.com/3018245.html', NULL, '15', 2020042842, '2020-10-16 18:00:25', 1, 0, 2324, 2520);
INSERT INTO `goods` VALUES (536, 100012176710, '松下 Panasonic 家用中央空调多联机 S系列 7匹一拖六适用160-180㎡ 0元安装 ME63BS6 ', 58099, 58099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/141708/28/7649/128110/5f520756Ee3d28588/cb6af71d835584fe.jpg', 'https://item.jd.com/100012176710.html', NULL, '5', 2020042842, '2020-10-16 18:00:25', 1, 0, 6915, 6081);
INSERT INTO `goods` VALUES (537, 100011763994, '万家乐线下同款 50升电热水器 出水断电零电洗 3000W双管变频速热 节能模式 1级能效 预约遥控款D50-S6.2 ', 1998, 1998, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/105543/40/14269/90728/5e626776E7f0ea7a4/932778b02e4f304b.jpg', 'https://item.jd.com/100011763994.html', NULL, '8', 2020052036, '2020-10-16 18:00:25', 1, 0, 4354, 4244);
INSERT INTO `goods` VALUES (538, 100012504802, '万家乐烟灶消厨房三件套20立方爆炒风一级能效侧吸式抽油烟机 大火力燃气灶(天然气)AL253+K401B+IM6 ', 2298, 2298, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91424/40/19601/159813/5e9fdf87Ebdcbf991/72f6a40d14d76533.jpg', 'https://item.jd.com/100012504802.html', NULL, '6', 2020052036, '2020-10-16 18:00:25', 1, 0, 3269, 3761);
INSERT INTO `goods` VALUES (539, 100005403246, '海尔（Haier）80升家用电热水器小尺寸储水式8倍增容智能遥控预约3D聚能速热厨房电热EC8005-EA ', 4499, 4499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/109873/4/9020/144350/5e6f5198E314ab202/155efeb80a97db9b.jpg', 'https://item.jd.com/100005403246.html', NULL, '8', 2020033045, '2020-10-16 18:00:25', 1, 0, 8257, 8382);
INSERT INTO `goods` VALUES (540, 100005283446, '飞利浦（PHILIPS）脱毛仪 剃毛器 刮毛器 脱毛机 脉冲光激光脱毛仪 剃毛 刮毛刀 无绳 BG9041x2F83 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/78494/3/4059/101308/5d244d97E5703a021/1a7ac76be35cef13.jpg', 'https://item.jd.com/100005283446.html', NULL, '15', 2020042790, '2020-10-16 18:00:25', 1, 0, 7649, 9850);
INSERT INTO `goods` VALUES (541, 100003020595, '飞利浦（PHILIPS）电动剃须刀刮胡刀漫威系列礼盒MVL9998BP ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99575/20/19102/215879/5e9a9d45E18fb37d3/8c673afc085fe52e.jpg', 'https://item.jd.com/100003020595.html', NULL, '15', 2020042790, '2020-10-16 18:00:25', 1, 0, 1675, 3508);
INSERT INTO `goods` VALUES (542, 100012176678, '松下 Panasonic 家用中央空调多联机MASTER S带W-nanoe X系列 6.5匹一拖五适用140-160㎡ 0元安装 ME58BS6 ', 56099, 56099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/146882/29/7488/136831/5f520ee3Ec7af2901/10446e2a398c4e81.jpg', 'https://item.jd.com/100012176678.html', NULL, '5', 2020042842, '2020-10-16 18:00:25', 1, 0, 2265, 6659);
INSERT INTO `goods` VALUES (543, 100006420000, '美的( Midea) 150升空气能电热水器E+蓝钻内胆分体式150L热水器 十年包修 KF66x2F150L-MH(E3)（3级能效） ', 4399, 4399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87555/24/14512/153593/5e660813Ebad78765/9b4f9eed1d245381.jpg', 'https://item.jd.com/100006420000.html', NULL, '8', 2020050665, '2020-10-16 18:00:25', 1, 0, 8233, 9322);
INSERT INTO `goods` VALUES (544, 100007049728, '华帝 VATTI 3C认证新沪泵系列回水器 家用循环泵 热水循环系统 热水器内置水泵循环泵100-6XJ ', 1199, 1199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/103194/28/9447/247153/5e0eaf5bEd54b381b/55d5a5d2489e84d8.jpg', 'https://item.jd.com/100007049728.html', NULL, '8', 2020050688, '2020-10-16 18:00:25', 1, 0, 4089, 2614);
INSERT INTO `goods` VALUES (545, 100004405436, '美的(Midea)426升 多门对开冰箱 19分钟急速净味 杀菌双变频风冷无霜 一级能效智能 莫兰迪灰BCD-426WTPZM(E) ', 4799, 4799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87605/31/15370/249061/5e6f770dE95e4b8e5/fd3437ade9e3f106.png', 'https://item.jd.com/100004405436.html', NULL, '2', 2020050665, '2020-10-16 18:00:25', 1, 0, 6897, 3269);
INSERT INTO `goods` VALUES (546, 100008528670, '华帝（VATTI）空气能热水器+回水泵套餐 双能动力75°高温 300升电热水器 300ETV+12GD全屋零冷水套餐（三层） ', 11499, 11499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86081/30/9435/214573/5e0eaff8E574a43e6/5627ed2efe3430c9.jpg', 'https://item.jd.com/100008528670.html', NULL, '8', 2020050688, '2020-10-16 18:00:25', 1, 0, 6302, 2933);
INSERT INTO `goods` VALUES (547, 100013499552, '华帝（VATTI）空气能热水器家用200升WIFI语音控制水温75°C松下压缩机二级能效ETH200升 ', 6099, 6099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/131704/12/836/341701/5ed35c1cEc8301bbf/84fa1c655e86f777.jpg', 'https://item.jd.com/100013499552.html', NULL, '8', 2020050688, '2020-10-16 18:00:25', 1, 0, 4940, 5953);
INSERT INTO `goods` VALUES (548, 100009216568, '云米 VIOMI 互联网浴霸风暖触控版集成吊顶嵌入式多功能智能 风暖浴霸VXYB01-FN ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101437/21/3077/59753/5ddc180bE2119bc74/87ede002c13c02ac.jpg', 'https://item.jd.com/100009216568.html', NULL, '14', 2020052067, '2020-10-16 18:00:25', 1, 0, 7407, 6417);
INSERT INTO `goods` VALUES (549, 100013736476, '海信（Hisense）32E2F-PRO 32英寸 Unibody圆角设计 蓝牙遥控语音 多屏互动 教育 悬浮全面屏智慧语音电视 ', 1049, 1049, NULL, 'https://m.360buyimg.com/mobilecms/s750x750_jfs/t1/126279/11/11986/184280/5f535c89Eb69e2900/d4688ddca839d3df.jpg!q80.dpg', 'https://item.jd.com/100013736476.html', NULL, '1', 2020033057, '2020-10-16 18:00:25', 1, 0, 6817, 8692);
INSERT INTO `goods` VALUES (550, 100013191788, '万家乐 20立方爆炒风 欧式家用吸油烟机 一级能效 智能挥手感应 抽油烟机 CXW-300-AT213 ', 1498, 1498, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115841/40/5897/86534/5eb695e0E4f902bde/71b853accc2a4a2e.jpg', 'https://item.jd.com/100013191788.html', NULL, '4', 2020052036, '2020-10-16 18:00:26', 1, 0, 5880, 5612);
INSERT INTO `goods` VALUES (551, 100013553112, '美的（Midea）电热饭盒 上班族插电式保温饭盒便携式加热饭盒 PD08A2 ', 229, 229, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/124137/35/5974/260563/5efc2ef6E3e5f69d6/9305eed28a640767.jpg', 'https://item.jd.com/100013553112.html', NULL, '14', 2020050665, '2020-10-16 18:00:26', 1, 0, 3553, 4654);
INSERT INTO `goods` VALUES (552, 100011376186, '美的（Midea）13升燃气热水器天然气线下同款双智控恒温智能APP智控安防自检一键高温洗JSQ25-13HS4 ', 2699, 2699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/89699/33/15122/106369/5e6f68b4E114e8ef4/6baa5ca337d0171d.jpg', 'https://item.jd.com/100011376186.html', NULL, '8', 2020050665, '2020-10-16 18:00:26', 1, 0, 7445, 9796);
INSERT INTO `goods` VALUES (553, 7705887, '海信（Hisense）80L5 80英寸 4K人工智能影院 教育电视 线下同款 激光电视机 ', 16999, 16999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97852/20/4972/200960/5dea24adE9b359eed/3240e5fc289db809.jpg', 'https://item.jd.com/7705887.html', NULL, '1', 2020033057, '2020-10-16 18:00:26', 1, 0, 2643, 1500);
INSERT INTO `goods` VALUES (554, 7705887, '海信（Hisense）80L5 80英寸 4K人工智能影院 教育电视 线下同款 激光电视机 ', 16999, 16999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/97852/20/4972/200960/5dea24adE9b359eed/3240e5fc289db809.jpg', 'https://item.jd.com/7705887.html', NULL, '1', 2020033057, '2020-10-16 18:00:26', 1, 0, 3944, 5306);
INSERT INTO `goods` VALUES (555, 100013526620, '容声 波轮洗衣机全自动 9公斤 大容量 家用 10大程序 超快洗 省水节能静音 桶自洁 RB90D1551JZ ', 1099, 1099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115293/23/10003/456395/5ee48de2E8ae69f99/718f6b517d0a8c38.jpg', 'https://item.jd.com/100013526620.html', NULL, '3', 2020052017, '2020-10-16 18:00:26', 1, 0, 4047, 6356);
INSERT INTO `goods` VALUES (556, 4114350, '佳能（Canon）MG3080 无线家用彩色喷墨打印一体机（学生打印、家庭打印、照片打印）（打印、复印、扫描） ', 459, 459, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t27136/230/1569657811/105831/dc7944e5/5be56674N227fb86f.jpg', 'https://item.jd.com/4114350.html', NULL, '14', NULL, '2020-10-16 18:00:26', 1, 0, 5293, 1682);
INSERT INTO `goods` VALUES (557, 100013382070, '万家乐 18立方欧式烟机一级能效家用吸油烟机CXW-220-AT141 ', 1098, 1098, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/134372/5/706/451332/5ed0645eE10bb977e/3485e65a0e54b733.jpg', 'https://item.jd.com/100013382070.html', NULL, '4', 2020052036, '2020-10-16 18:00:26', 1, 0, 9606, 7231);
INSERT INTO `goods` VALUES (558, 100014152482, '西门子(SIEMENS) 9公斤 变频滚筒洗衣机 除菌液程序 高温筒清洁 XQG90-WB24ULZ01W ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/127409/16/10973/121511/5f464456Eac1b38db/9390ae5307dc346b.jpg', 'https://item.jd.com/100014152482.html', NULL, '3', 2020050626, '2020-10-16 18:00:26', 1, 0, 8191, 2982);
INSERT INTO `goods` VALUES (559, 100011237498, '小米 65W 三口大功率 快充版 快充头x2F充电器x2F电源适配器 支持switchx2F小米x2F苹果笔记本充电 （2A1C） ', 149, 149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100115/31/10806/24402/5e21675fE6eb06fd7/a316e068adc89cb0.jpg', 'https://item.jd.com/100011237498.html', NULL, '14', 2020042785, '2020-10-16 18:00:26', 1, 0, 1063, 9723);
INSERT INTO `goods` VALUES (560, 100015412392, '小熊（Bear）挂烫机熨斗 家用蒸汽手持挂烫机 商用迷你便携蒸汽熨斗熨烫机GTJ-B10S1浅绿 ', 99, 99, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119983/26/13507/51798/5f70587eEa70cafc1/b03dea711606a687.jpg', 'https://item.jd.com/100015412392.html', NULL, '14', 2020042873, '2020-10-16 18:00:26', 1, 0, 5111, 7448);
INSERT INTO `goods` VALUES (561, 100014152482, '西门子(SIEMENS) 9公斤 变频滚筒洗衣机 除菌液程序 高温筒清洁 XQG90-WB24ULZ01W ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/127409/16/10973/121511/5f464456Eac1b38db/9390ae5307dc346b.jpg', 'https://item.jd.com/100014152482.html', NULL, '3', 2020050626, '2020-10-16 18:00:27', 1, 0, 1947, 7948);
INSERT INTO `goods` VALUES (562, 100011237498, '小米 65W 三口大功率 快充版 快充头x2F充电器x2F电源适配器 支持switchx2F小米x2F苹果笔记本充电 （2A1C） ', 149, 149, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/100115/31/10806/24402/5e21675fE6eb06fd7/a316e068adc89cb0.jpg', 'https://item.jd.com/100011237498.html', NULL, '14', 2020042785, '2020-10-16 18:00:27', 1, 0, 9576, 3325);
INSERT INTO `goods` VALUES (563, 100015412392, '小熊（Bear）挂烫机熨斗 家用蒸汽手持挂烫机 商用迷你便携蒸汽熨斗熨烫机GTJ-B10S1浅绿 ', 99, 99, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/119983/26/13507/51798/5f70587eEa70cafc1/b03dea711606a687.jpg', 'https://item.jd.com/100015412392.html', NULL, '14', 2020042873, '2020-10-16 18:00:27', 1, 0, 4760, 4159);
INSERT INTO `goods` VALUES (564, 100013140976, '云米（VIOMI）Link（长续航版）不带天地钩 指纹锁密码锁智能门锁 家用防盗门 C级锁芯 ', 1699, 1699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117970/16/5626/44560/5eb51462E19bdd605/3600f7e21f9bee8b.jpg', 'https://item.jd.com/100013140976.html', NULL, '14', 2020052067, '2020-10-16 18:00:27', 1, 0, 3896, 6315);
INSERT INTO `goods` VALUES (565, 6045065, '能率（NORITZ）超强吸力 20立方米瞬吸 侧吸式抽油烟机 CXW-220-C1882 ', 2799, 2799, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99668/24/11434/79176/5e350bdaEa059458f/5b53954d1c706680.jpg', 'https://item.jd.com/6045065.html', NULL, '4', 2020052070, '2020-10-16 18:00:27', 1, 0, 2275, 5456);
INSERT INTO `goods` VALUES (566, 100015599828, '小熊（Bear）挂烫机熨斗 家用蒸汽手持挂烫机 商用迷你便携蒸汽熨斗熨烫机GTJ-B10S1象白 ', 99, 99, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/143903/9/9408/62144/5f6fe0cfE6052a7d7/6b852c86c505e9ae.jpg', 'https://item.jd.com/100015599828.html', NULL, '14', 2020042873, '2020-10-16 18:00:27', 1, 0, 9334, 6573);
INSERT INTO `goods` VALUES (567, 100008206745, '飞科（FLYCO）电吹风机 家用 旋转调温 LED温度显示 负离子吹风筒 FH6288 ', 269, 269, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125164/9/10101/86261/5f3de567E5363d26b/234f335b4dc75f22.jpg', 'https://item.jd.com/100008206745.html', NULL, '15', 2020052009, '2020-10-16 18:00:27', 1, 0, 8256, 2301);
INSERT INTO `goods` VALUES (568, 100003688219, '小米 翻译机 英语学习机学生AI家教机电子词典离线多国语言录音笔随身WIFI 小爱老师4G网络尊享版白色 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/51208/31/7534/48392/5d525b5aEed550268/0bec0b516df00768.jpg', 'https://item.jd.com/100003688219.html', NULL, '14', 2020042785, '2020-10-16 18:00:27', 1, 0, 2153, 7631);
INSERT INTO `goods` VALUES (569, 100004890136, '海尔（Haier）60升家用电热水器小尺寸储水式8倍增容智能遥控预约3D聚能速热厨房电热EC6005-EA ', 4299, 4299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/101042/27/14600/144350/5e6f51bfE81fadbdf/26504a32cddcb461.jpg', 'https://item.jd.com/100004890136.html', NULL, '8', 2020033045, '2020-10-16 18:00:27', 1, 0, 3582, 2312);
INSERT INTO `goods` VALUES (570, 1749610, '飞利浦（PHILIPS）男士电动剃须刀荷兰进口多功能理容剃胡刀胡须刀刮胡刀（配胡须修剪器）S9151x2F12 ', 1599, 1599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/93932/2/4976/92021/5dea1a2bE150f7b67/c4034afc23b7bd6c.jpg', 'https://item.jd.com/1749610.html', NULL, '15', 2020042790, '2020-10-16 18:00:27', 1, 0, 6099, 2913);
INSERT INTO `goods` VALUES (571, 7350010, '净主义 AC-2P 空调支架外机架不锈钢架子加厚室外空调托架配件 2匹 送膨胀螺丝 海尔美的志高科龙等适用 ', 85, 85, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/68932/40/6757/248704/5d4d2f59E197adb76/7edffea6c1ea2537.jpg', 'https://item.jd.com/7350010.html', NULL, '5', NULL, '2020-10-16 18:00:27', 1, 0, 9588, 1941);
INSERT INTO `goods` VALUES (572, 100013150830, '飞利浦（PHILIPS）电动剃须刀刮胡刀SP9861父亲节礼盒 ', 3999, 3999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/120906/37/2636/164412/5ec795c3E0d4619e0/6f47fc62651ecd18.jpg', 'https://item.jd.com/100013150830.html', NULL, '15', 2020042790, '2020-10-16 18:00:27', 1, 0, 6672, 7735);
INSERT INTO `goods` VALUES (573, 100013414292, '美菱（MELING）卧式商用冰柜 玻璃门展示岛柜 冷藏冷冻冷饮海鲜冷柜SCSD-518GPZSY ', 3499, 3499, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/129066/22/2561/113720/5ec65420E3655c876/09acd6f351498a20.jpg', 'https://item.jd.com/100013414292.html', NULL, '11', 2020052059, '2020-10-16 18:00:27', 1, 0, 8421, 3199);
INSERT INTO `goods` VALUES (574, 100015323286, '海尔（Haier）60升电热水器3D聚能速热8倍增容 智能随温感双温双显 一级能效 EC6005-JK(U1)彩 ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/117552/31/18053/57415/5f61d526E31789019/8d777e306fa4c61b.jpg', 'https://item.jd.com/100015323286.html', NULL, '8', 2020033045, '2020-10-16 18:00:27', 1, 0, 9956, 2827);
INSERT INTO `goods` VALUES (575, 100013736462, '创维 Skyworth 32X8 32英寸 8G大内存 教育资源 家庭型专享电视 性价比之选 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/142082/13/270/349144/5edef228E146d1a45/e11b01c095994fb4.jpg', 'https://item.jd.com/100013736462.html', NULL, '1', 2020033015, '2020-10-16 18:00:27', 1, 0, 9312, 3547);
INSERT INTO `goods` VALUES (576, 100012798064, '苏泊尔（SUPOR）养生壶 煮茶器 煮茶壶加厚玻璃1.5L电水壶电热水壶花茶壶电茶壶SW-15YT38 ', 159, 159, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/115770/24/5379/168117/5eb3b605E6c87f814/07f80366180b38a0.jpg', 'https://item.jd.com/100012798064.html', NULL, '14', 2020050628, '2020-10-16 18:00:27', 1, 0, 7879, 1427);
INSERT INTO `goods` VALUES (577, 100007192329, '创维（SKYWORTH）65V40 65英寸4K超高清HDR 超薄全面屏 2+16G大内存 防蓝光 教育资源 蓝牙网络WIFI ', 3099, 3099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/110426/2/17638/208634/5eba0753Eea6e1b1a/3ac31cd2ea9cfa79.jpg', 'https://item.jd.com/100007192329.html', NULL, '14', 2020033015, '2020-10-16 18:00:27', 1, 0, 4030, 6447);
INSERT INTO `goods` VALUES (578, 100011274766, '博世 BOSCH BCD-271W KGN28V2Q0C 271升 变频 风冷无霜 三门冰箱 大容量 智能温控(金色) ', 4899, 4899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/112336/39/9632/278937/5edc6583Eef862702/c0bf94427e5900e8.jpg', 'https://item.jd.com/100011274766.html', NULL, '2', 2020052061, '2020-10-16 18:00:27', 1, 0, 8514, 3976);
INSERT INTO `goods` VALUES (579, 3304325, '小米 米兔故事机 智能故事机机器人智能机器人儿童早教机Wifi学习机可充电内容可下载 ', 199, 199, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/44434/20/9101/165019/5d5fc7bdE8b8919e4/ed61dde6bbe4949c.jpg', 'https://item.jd.com/3304325.html', NULL, '14', 2020042785, '2020-10-16 18:00:27', 1, 0, 6146, 4805);
INSERT INTO `goods` VALUES (580, 100011756644, '飞利浦（PHILIPS）男士电动剃须刀全身水洗干湿双剃1000系列升级版快充胡须刀刮胡刀S2302 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/77012/2/5791/152493/5d3fba1cE0dfc9388/821e6ec950c7b3ba.jpg', 'https://item.jd.com/100011756644.html', NULL, '15', 2020042790, '2020-10-16 18:00:27', 1, 0, 6453, 8243);
INSERT INTO `goods` VALUES (581, 100013774718, '美的(Midea) 231升新风冷无霜家用小冰箱三门变频节能静音铂金净味双系统制冷 BCD-231WTPZM(E) ', 2299, 2299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/114796/25/11528/110029/5efc696cE78a4cdc2/d9cade5b703a86ad.jpg', 'https://item.jd.com/100013774718.html', NULL, '2', 2020050665, '2020-10-16 18:00:27', 1, 0, 9414, 2766);
INSERT INTO `goods` VALUES (582, 100008461498, '云米 VIOMI 10公斤大容量洗烘一体 变频节能智能滚筒全自动洗衣机 【除菌洗】空气洗 高温烘干 WD10FM-G1A ', 1999, 1999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/86885/1/15122/255296/5e6f2948E38cd4440/d0236137a98a8848.jpg', 'https://item.jd.com/100008461498.html', NULL, '3', 2020052067, '2020-10-16 18:00:27', 1, 0, 1313, 4505);
INSERT INTO `goods` VALUES (583, 100007002752, '苏泊尔 SUPOR 6L大容量家用电压力锅 安全易用 3-8人 SY-60YA9051高压锅 ', 399, 399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/59750/22/5429/289108/5d391062E51a7f945/4684b3083552f0d0.jpg', 'https://item.jd.com/100007002752.html', NULL, '14', 2020050628, '2020-10-16 18:00:27', 1, 0, 6304, 3856);
INSERT INTO `goods` VALUES (584, 100015072358, '海尔 （Haier） 嵌入式蒸烤一体机 52L大容量 智能控制 家用蒸烤箱 CQG-E52U1 ', 4399, 4399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125188/3/13290/73434/5f696388Eb5290b00/8127ac3fb1572901.jpg', 'https://item.jd.com/100015072358.html', NULL, '13', 2020033045, '2020-10-16 18:00:27', 1, 0, 4183, 4058);
INSERT INTO `goods` VALUES (585, 100013180964, '创维（SKYWORTH）55V40 55英寸4K超高清HDR 超薄全面屏 2+16G大内存 防蓝光 教育资源 蓝牙网络WIFI ', 2099, 2099, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/125756/30/1175/200099/5eba06a6Eb810b1e2/7cf7a3862c11b3ce.jpg', 'https://item.jd.com/100013180964.html', NULL, '14', 2020033015, '2020-10-16 18:00:27', 1, 0, 8645, 9479);
INSERT INTO `goods` VALUES (586, 100006294123, '苏泊尔 (SUPOR) 鲜呼吸 家用智能电压力锅 精钢内胆 SY-50FC31Q 5L高压锅 ', 999, 999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/87758/32/12713/291400/5e4df185E21d74e98/61ca7283616de4df.jpg', 'https://item.jd.com/100006294123.html', NULL, '14', 2020050628, '2020-10-16 18:00:27', 1, 0, 5173, 3872);
INSERT INTO `goods` VALUES (587, 142688, '倍轻松（breo）儿童眼部按摩仪iSee100 眼睛按摩器 眼保仪护眼仪送礼 振动磁疗礼品 ', 198, 198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/63072/6/8598/84353/5d68d552E717c8f34/48a6d00ce1b3c279.jpg', 'https://item.jd.com/142688.html', NULL, '15', 2020052058, '2020-10-16 18:00:27', 1, 0, 1411, 9172);
INSERT INTO `goods` VALUES (588, 100007715755, '万家乐 集成灶一体灶保洁款 家用环保大吸力油烟机燃气灶一体机节能易清洁JJZT-KLJ822C(B)（天然气） ', 3599, 3599, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113415/4/11428/217695/5efdab53Ec238d360/033e247e341c75e9.jpg', 'https://item.jd.com/100007715755.html', NULL, '7', 2020052036, '2020-10-16 18:00:27', 1, 0, 2257, 1738);
INSERT INTO `goods` VALUES (589, 4160243, '能率（NORITZ）燃气热水器16升 静音智能恒温 CPU智能控制系统 防冻家用GQ-16F3FEX（天然气）（JSQ31-F3） ', 3198, 3198, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/107469/20/8959/166502/5e6f33d4Eec0ab641/66903169397be623.jpg', 'https://item.jd.com/4160243.html', NULL, '8', 2020052070, '2020-10-16 18:00:27', 1, 0, 9927, 8816);
INSERT INTO `goods` VALUES (590, 100006489943, '松下 Panasonic 家用中央空调多联机MASTER S 带W-nanoe X系列 4匹一拖三适用60-90㎡ 0元安装 ME36BS6 ', 35399, 35399, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/99182/3/14625/155454/5e676754E8a95aa36/ba74581cfeeccd12.jpg', 'https://item.jd.com/100006489943.html', NULL, '5', 2020042842, '2020-10-16 18:00:27', 1, 0, 7296, 6565);
INSERT INTO `goods` VALUES (591, 8129503, '伏兴万能空调遥控器万能遥控器通用格力美的海尔海信科龙长虹奥克斯松下志高三菱日立新科空调FX608 ', 23, 23, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/54061/5/3581/201698/5d1456a6Ed58239c1/bcbb06fa622c0b3b.jpg', 'https://item.jd.com/8129503.html', NULL, '5', NULL, '2020-10-16 18:00:27', 1, 0, 7140, 2216);
INSERT INTO `goods` VALUES (592, 100006854321, '万家乐20立方侧吸式油烟机4.5KW大火力燃气灶16升大水量天然气热水器三件套AL253+K401B+16LD5 ', 2698, 2698, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/113831/14/2189/242124/5e9ff090E7e97f593/6cbbf9d5e537e18f.jpg', 'https://item.jd.com/100006854321.html', NULL, '8', 2020052036, '2020-10-16 18:00:27', 1, 0, 7449, 4829);
INSERT INTO `goods` VALUES (593, 100009127980, '美的( Midea) 200升空气能热水器 E+蓝钻内胆 分体式200L家用热水器 十年包修 KF66x2F200L-MH(E3)（3级能效） ', 4699, 4699, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108416/15/4521/159300/5e1fd8e0E19ae8f10/a3466fe361c32d10.jpg', 'https://item.jd.com/100009127980.html', NULL, '8', 2020050665, '2020-10-16 18:00:27', 1, 0, 4164, 3064);
INSERT INTO `goods` VALUES (594, 1272489, '天章(TANGO)新橙天章80gA4复印纸 500张/包 5包/箱(2500张) ', 116, 116, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/88717/36/2303/186177/5dce4d5fEc25ef646/922e65fb7c15743b.jpg', 'https://item.jd.com/1272489.html', NULL, '14', NULL, '2020-10-16 18:00:27', 1, 0, 7210, 1328);
INSERT INTO `goods` VALUES (595, 100007970394, '康佳KKTV U50K6 50英寸全面屏 4K超高清 金属边框 华为海思芯片 智慧屏 京品家电 网络平板液晶教育电视机 ', 1899, 1899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/91826/14/12057/121627/5e426276E6339c5de/33087c2d0becf5e7.jpg', 'https://item.jd.com/100007970394.html', NULL, '1', 2020033018, '2020-10-16 18:00:27', 1, 0, 4979, 8343);
INSERT INTO `goods` VALUES (596, 100005439566, '飞利浦(PHILIPS)男士电动剃须刀漫威系列钢铁侠刮胡刀多功能全身水洗MVL9998x2F72 ', 2999, 2999, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/52369/40/2754/212039/5d08b078Ef0048d1c/473efb3a838707f9.jpg', 'https://item.jd.com/100005439566.html', NULL, '15', 2020042790, '2020-10-16 18:00:27', 1, 0, 3908, 1526);
INSERT INTO `goods` VALUES (597, 100013451420, '海尔（Haier）LE32J51 32英寸高清 人工智能 语音遥控 LED液晶电视 16G大内存（黑色） ', 899, 899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111618/29/7980/104724/5ec79b8dEe760b1c8/4831d9cd7e72dab8.jpg', 'https://item.jd.com/100013451420.html', NULL, '1', 2020033045, '2020-10-16 18:00:27', 1, 0, 4072, 5627);
INSERT INTO `goods` VALUES (598, 100012283858, '飞利浦（PHILIPS）鼻毛修剪器全身水洗剃脱毛器NT5600 ', 299, 299, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/111265/40/544/150090/5e8d8451E108b326d/7feeeebe1a3e66f8.jpg', 'https://item.jd.com/100012283858.html', NULL, '15', 2020042790, '2020-10-16 18:00:27', 1, 0, 2891, 7746);
INSERT INTO `goods` VALUES (599, 100005493614, '西门子 SIEMENS SZ06AXCFI 嵌入式洗碗机玻璃门（全嵌式） 黑色 ', 790, 790, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/108545/9/9030/114970/5e6ee0e1E907026d1/e6b61f01e99fb1d1.jpg', 'https://item.jd.com/100005493614.html', NULL, '10', 2020050626, '2020-10-16 18:00:27', 1, 0, 9752, 1595);
INSERT INTO `goods` VALUES (600, 100011323662, '西门子(SIEMENS) 10公斤 变频滚筒洗衣机 XQG100-WG54B2X00W ', 4899, 4899, NULL, 'https://m.360buyimg.com/mobilecms/jfs/t1/94678/8/14890/153543/5e6b513fEc996bd30/f7abeb484a160f70.jpg', 'https://item.jd.com/100011323662.html', NULL, '3', 2020050626, '2020-10-16 18:00:27', 1, 0, 3503, 6411);

-- ----------------------------
-- Table structure for orders
-- ----------------------------
DROP TABLE IF EXISTS `orders`;
CREATE TABLE `orders`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `user_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户编号',
  `order_id` bigint(255) NULL DEFAULT NULL COMMENT '订单编号',
  `goods_id` bigint(255) NULL DEFAULT NULL COMMENT '商品编号',
  `transport_id` bigint(255) NULL DEFAULT NULL COMMENT '快递单号',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收件人姓名',
  `user_phone` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '联系方式',
  `user_address` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '收件地址',
  `goods_num` int(11) NULL DEFAULT NULL COMMENT '商品数量',
  `goods_amount` decimal(10, 2) NULL DEFAULT NULL COMMENT '商品单价',
  `order_delivery` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '快递公司',
  `deliver_money` decimal(11, 2) NULL DEFAULT 0.00 COMMENT '运费',
  `order_amount` decimal(10, 2) NULL DEFAULT 0.00 COMMENT '商品总金额(商品总价格=未进行任何折扣的总价格)',
  `total_money` decimal(11, 2) NULL DEFAULT 0.00 COMMENT '订单总金额(包括运费)',
  `real_total_money` decimal(11, 2) NULL DEFAULT 0.00 COMMENT '实际订单总金额(进行各种折扣之后的金额)',
  `note_struct` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '备注',
  `flag` int(4) NULL DEFAULT NULL COMMENT '订单状态1：待付款2：待收货3：已完成4：已评价',
  `data_flag` int(3) NOT NULL DEFAULT 1 COMMENT '订单有效状态',
  `is_invoice` int(4) NOT NULL DEFAULT 0 COMMENT '是否需要发票(0：不需要 1：需要)',
  `invoice_client` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '发票抬头',
  `need_pay` decimal(11, 2) NULL DEFAULT 0.00 COMMENT '需缴费用',
  `create_time` datetime NULL DEFAULT NULL COMMENT '下单时间',
  `delivery_time` datetime NULL DEFAULT NULL COMMENT '发货时间',
  `receive_time` datetime NULL DEFAULT NULL COMMENT '收货时间',
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `goods_id`(`goods_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of orders
-- ----------------------------
INSERT INTO `orders` VALUES (1, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693028000395, 100014192550, NULL, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 299.00, NULL, 0.00, 299.00, 299.00, 299.00, '', 1, 1, 0, NULL, NULL, '2021-01-06 17:50:26', NULL, NULL);
INSERT INTO `orders` VALUES (2, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693036000336, 100007938903, NULL, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 5499.00, NULL, 0.00, 5499.00, 5499.00, 5499.00, '', 8, 1, 0, NULL, NULL, '2021-01-06 17:50:34', NULL, NULL);
INSERT INTO `orders` VALUES (3, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693046000168, 100008337791, NULL, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 499.00, NULL, 0.00, 499.00, 499.00, 499.00, '', 7, 1, 0, NULL, NULL, '2021-01-06 17:50:44', NULL, NULL);
INSERT INTO `orders` VALUES (4, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693057000717, 100005901017, 1548466315781215, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 219.00, '百世快递', 0.00, 219.00, 219.00, 219.00, '', 4, 1, 0, NULL, NULL, '2020-11-18 17:50:55', '2020-11-18 17:56:26', NULL);
INSERT INTO `orders` VALUES (5, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693068000898, 1096381, 154312554987655131, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 599.00, '安达速递', 0.00, 599.00, 599.00, 599.00, '', 3, 1, 0, NULL, NULL, '2020-11-18 17:51:06', '2020-11-18 17:56:54', NULL);
INSERT INTO `orders` VALUES (6, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 1605693077000434, 100005885800, NULL, '宋燕飞', '15746646466', '山西省太原市市辖区哈哈哈哈哈哈哈哈哈哈', 1, 14609.00, NULL, 0.00, 14609.00, 14609.00, 14609.00, '', 2, 1, 0, NULL, NULL, '2020-11-18 17:51:15', NULL, NULL);

-- ----------------------------
-- Table structure for payinfo
-- ----------------------------
DROP TABLE IF EXISTS `payinfo`;
CREATE TABLE `payinfo`  (
  `pay_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `order_id` bigint(255) NULL DEFAULT NULL COMMENT '订单id',
  `user_id` varchar(64) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '用户表id',
  `pay_platform` int(10) NULL DEFAULT NULL COMMENT '支付平台:1-支付宝,2-微信',
  `platform_number` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付流水号',
  `platform_status` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '支付状态',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`pay_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of payinfo
-- ----------------------------
INSERT INTO `payinfo` VALUES ('13412', 313, '3131', 1, '133', '已支付', '2020-10-15 20:11:56', '2020-10-15 20:12:02');
INSERT INTO `payinfo` VALUES ('4848', 313245, '313222', 3, '133', '已支付', '2020-10-15 20:11:56', '2020-10-15 20:12:02');
INSERT INTO `payinfo` VALUES ('545454', 3132, '3132', 2, '133', '待支付', '2020-10-15 20:11:56', '2020-10-15 20:12:02');

-- ----------------------------
-- Table structure for refund
-- ----------------------------
DROP TABLE IF EXISTS `refund`;
CREATE TABLE `refund`  (
  `id` int(11) NOT NULL AUTO_INCREMENT COMMENT 'ID',
  `order_id` bigint(50) NOT NULL COMMENT '订单ID',
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户编号',
  `refund_to` int(11) NOT NULL DEFAULT 0 COMMENT '管理员退款方向(0：微信 1: 支付宝 2:银联)',
  `refund_direction` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '用户退款说明',
  `refund_other_reson` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '用户申请退款原因',
  `back_money` decimal(11, 2) NULL DEFAULT 0.00 COMMENT '用户退款金额',
  `refund_trade_no` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员退款流水号',
  `refund_remark` varchar(400) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '管理员退款备注',
  `refund_time` datetime NULL DEFAULT NULL COMMENT '管理员退款时间',
  `shop_reject_reason` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '店铺不同意拒收原因(原因)',
  `refund_status` tinyint(4) NOT NULL DEFAULT 0 COMMENT '退款状态(0：申请中 1：已退款 -1: 已驳回)',
  `create_time` datetime NULL DEFAULT NULL COMMENT '用户申请退款时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of refund
-- ----------------------------
INSERT INTO `refund` VALUES (1, 1605693046000168, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', 0, '质量问题', '产品存在质量问题', 499.00, NULL, NULL, '2020-11-18 17:52:49', NULL, 1, '2020-11-18 17:52:18');

-- ----------------------------
-- Table structure for swipper
-- ----------------------------
DROP TABLE IF EXISTS `swipper`;
CREATE TABLE `swipper`  (
  `id` int(10) NOT NULL AUTO_INCREMENT COMMENT 'id',
  `type` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '类型',
  `url` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '路径',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 7 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of swipper
-- ----------------------------
INSERT INTO `swipper` VALUES (2, 'image', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/6fe893f219b4d05f0c6614048ab75b45.jpg', '2020-10-14 18:46:25', '2020-10-21 20:06:06');
INSERT INTO `swipper` VALUES (3, 'image', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/703c6d5adc0b0af30fd4cd704e1280b1.jpg', '2020-10-14 19:39:54', '2020-10-21 20:06:14');
INSERT INTO `swipper` VALUES (4, 'image', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/d144ab05c29ebee79fd29885951ab9cc.jpg', '2020-10-14 19:49:29', '2020-10-21 20:06:22');
INSERT INTO `swipper` VALUES (5, 'image', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/dbebc162ce75d643a3df166239500140.jpg', '2020-10-14 20:52:13', '2020-10-21 20:06:30');
INSERT INTO `swipper` VALUES (6, 'image', 'http://127.0.0.1:9200/api-file/statics/2020/10/21/eabd6da34c9e49ee8fe5c46e64232c28.jpg', '2020-10-14 20:52:27', '2020-10-21 20:06:39');

-- ----------------------------
-- Table structure for sys_dict
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict`;
CREATE TABLE `sys_dict`  (
  `dict_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `dict_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict
-- ----------------------------
INSERT INTO `sys_dict` VALUES ('1cbd9e9d7e5948e5ae495b3dc3766529', '退款原因');
INSERT INTO `sys_dict` VALUES ('47dc7e98decd4b919b9300e19f8e9725', '性别');
INSERT INTO `sys_dict` VALUES ('58f61a8e35ea44e58754b38a56eef8cd', '是否上架');
INSERT INTO `sys_dict` VALUES ('80342014af3b4e188d373cb9d304a803', '配送方式');
INSERT INTO `sys_dict` VALUES ('afd35863cf814ac6b9204e9a357a572b', '默认');
INSERT INTO `sys_dict` VALUES ('c71d1762ae1b409db8617298246acdbc', '积分来源');
INSERT INTO `sys_dict` VALUES ('d4e44f720b28401bb6e416f7a981d1f3', '是否热销');
INSERT INTO `sys_dict` VALUES ('e125dd1ea41c4ada9f3fade186ba9fd3', '订单状态');

-- ----------------------------
-- Table structure for sys_dict_detail
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_detail`;
CREATE TABLE `sys_dict_detail`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '编号',
  `dict_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '字典列表ID',
  `value` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '数据值',
  `label` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '标签名',
  `type` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '类型',
  `description` varchar(100) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '描述',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `last_update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `remarks` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '备注信息',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 553 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '字典表' ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict_detail
-- ----------------------------
INSERT INTO `sys_dict_detail` VALUES (14, '58f61a8e35ea44e58754b38a56eef8cd', '1', '上架商品', 'int', '', NULL, '2020-10-07 20:24:02', '');
INSERT INTO `sys_dict_detail` VALUES (15, '58f61a8e35ea44e58754b38a56eef8cd', '0', '下架商品', 'int', '', NULL, '2020-10-07 20:24:14', '');
INSERT INTO `sys_dict_detail` VALUES (18, '47dc7e98decd4b919b9300e19f8e9725', '1', '男', 'int', '性别字典类型', '2020-10-05 15:17:31', '2020-10-09 19:16:52', '');
INSERT INTO `sys_dict_detail` VALUES (19, '47dc7e98decd4b919b9300e19f8e9725', '0', '女', 'int', '性别字典类型', '2020-10-05 15:18:10', '2020-10-09 19:16:57', '');
INSERT INTO `sys_dict_detail` VALUES (20, 'd4e44f720b28401bb6e416f7a981d1f3', '1', '正在热销', 'int', '热销状态', '2020-10-05 15:20:38', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (21, 'd4e44f720b28401bb6e416f7a981d1f3', '0', '一般状态', 'int', '热销状态', '2020-10-05 15:22:53', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (22, 'e125dd1ea41c4ada9f3fade186ba9fd3', '1', '待付款', 'int', '订单状态', '2020-10-06 09:52:49', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (23, 'e125dd1ea41c4ada9f3fade186ba9fd3', '2', '待发货', 'int', '订单状态', '2020-10-06 09:57:08', '2020-10-06 16:11:31', '');
INSERT INTO `sys_dict_detail` VALUES (24, 'e125dd1ea41c4ada9f3fade186ba9fd3', '4', '待评价', 'int', '订单状态', '2020-10-06 09:58:07', '2020-10-06 16:11:51', '');
INSERT INTO `sys_dict_detail` VALUES (25, '80342014af3b4e188d373cb9d304a803', 'A2U速递', 'A2U速递', 'int', 'A2U速递', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (26, '80342014af3b4e188d373cb9d304a803', 'AAE快递', 'AAE快递', 'int', 'AAE快递', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (27, '80342014af3b4e188d373cb9d304a803', '安能物流', '安能物流', 'int', '安能物流', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (28, '80342014af3b4e188d373cb9d304a803', '安迅物流', '安迅物流', 'int', '安迅物流', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (29, '80342014af3b4e188d373cb9d304a803', '澳邮中国快运', '澳邮中国快运', 'int', '澳邮中国快运', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (30, '80342014af3b4e188d373cb9d304a803', '安鲜达', '安鲜达', 'int', '安鲜达', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (31, '80342014af3b4e188d373cb9d304a803', '安捷物流', '安捷物流', 'int', '安捷物流', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (32, '80342014af3b4e188d373cb9d304a803', 'ANTS EXPRESS', 'ANTS EXPRESS', 'int', 'ANTS EXPRESS', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (33, '80342014af3b4e188d373cb9d304a803', '安世通快递', '安世通快递', 'int', '安世通快递', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (34, '80342014af3b4e188d373cb9d304a803', '澳世速递', '澳世速递', 'int', '澳世速递', '2020-10-06 15:29:30', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (35, '80342014af3b4e188d373cb9d304a803', 'Aplus物流', 'Aplus物流', 'int', 'Aplus物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (36, '80342014af3b4e188d373cb9d304a803', '安达速递', '安达速递', 'int', '安达速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (37, '80342014af3b4e188d373cb9d304a803', '安达易国际速递', '安达易国际速递', 'int', '安达易国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (38, '80342014af3b4e188d373cb9d304a803', '澳洲迈速快递', '澳洲迈速快递', 'int', '澳洲迈速快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (39, '80342014af3b4e188d373cb9d304a803', '昂威物流', '昂威物流', 'int', '昂威物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (40, '80342014af3b4e188d373cb9d304a803', '澳天速运', '澳天速运', 'int', '澳天速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (41, '80342014af3b4e188d373cb9d304a803', '澳洲飞跃物流', '澳洲飞跃物流', 'int', '澳洲飞跃物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (42, '80342014af3b4e188d373cb9d304a803', '艾菲尔国际速递', '艾菲尔国际速递', 'int', '艾菲尔国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (43, '80342014af3b4e188d373cb9d304a803', '澳速通国际速递', '澳速通国际速递', 'int', '澳速通国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (44, '80342014af3b4e188d373cb9d304a803', '澳德物流', '澳德物流', 'int', '澳德物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (45, '80342014af3b4e188d373cb9d304a803', '爱拜物流', '爱拜物流', 'int', '爱拜物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (46, '80342014af3b4e188d373cb9d304a803', '安家同城', '安家同城', 'int', '安家同城', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (47, '80342014af3b4e188d373cb9d304a803', 'Austa国际速递', 'Austa国际速递', 'int', 'Austa国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (48, '80342014af3b4e188d373cb9d304a803', '澳捷物流', '澳捷物流', 'int', '澳捷物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (49, '80342014af3b4e188d373cb9d304a803', '澳达国际物流', '澳达国际物流', 'int', '澳达国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (50, '80342014af3b4e188d373cb9d304a803', '百世快运', '百世快运', 'int', '百世快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (51, '80342014af3b4e188d373cb9d304a803', '百世快递', '百世快递', 'int', '百世快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (52, '80342014af3b4e188d373cb9d304a803', '包裹/平邮/挂号信', '包裹/平邮/挂号信', 'int', '包裹/平邮/挂号信', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (53, '80342014af3b4e188d373cb9d304a803', '百福东方物流', '百福东方物流', 'int', '百福东方物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (54, '80342014af3b4e188d373cb9d304a803', '百千诚物流', '百千诚物流', 'int', '百千诚物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (55, '80342014af3b4e188d373cb9d304a803', '佰麒快递', '佰麒快递', 'int', '佰麒快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (56, '80342014af3b4e188d373cb9d304a803', '百成大达物流', '百成大达物流', 'int', '百成大达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (57, '80342014af3b4e188d373cb9d304a803', '百腾物流', '百腾物流', 'int', '百腾物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (58, '80342014af3b4e188d373cb9d304a803', '百事亨通', '百事亨通', 'int', '百事亨通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (59, '80342014af3b4e188d373cb9d304a803', '堡昕德速递', '堡昕德速递', 'int', '堡昕德速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (60, '80342014af3b4e188d373cb9d304a803', '北极星快运', '北极星快运', 'int', '北极星快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (61, '80342014af3b4e188d373cb9d304a803', '北京丰越供应链', '北京丰越供应链', 'int', '北京丰越供应链', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (62, '80342014af3b4e188d373cb9d304a803', '败欧洲', '败欧洲', 'int', '败欧洲', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (63, '80342014af3b4e188d373cb9d304a803', '标杆物流', '标杆物流', 'int', '标杆物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (64, '80342014af3b4e188d373cb9d304a803', '邦通国际', '邦通国际', 'int', '邦通国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (65, '80342014af3b4e188d373cb9d304a803', '贝业物流', '贝业物流', 'int', '贝业物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (66, '80342014af3b4e188d373cb9d304a803', '八达通快递', '八达通快递', 'int', '八达通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (67, '80342014af3b4e188d373cb9d304a803', '帮帮发', '帮帮发', 'int', '帮帮发', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (68, '80342014af3b4e188d373cb9d304a803', '报通快递', '报通快递', 'int', '报通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (69, '80342014af3b4e188d373cb9d304a803', '百通物流', '百通物流', 'int', '百通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (70, '80342014af3b4e188d373cb9d304a803', '邦泰快运', '邦泰快运', 'int', '邦泰快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (71, '80342014af3b4e188d373cb9d304a803', '佰乐捷通', '佰乐捷通', 'int', '佰乐捷通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (72, '80342014af3b4e188d373cb9d304a803', 'COE（东方快递）', 'COE（东方快递）', 'int', 'COE（东方快递）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (73, '80342014af3b4e188d373cb9d304a803', '出口易', '出口易', 'int', '出口易', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (74, '80342014af3b4e188d373cb9d304a803', '程光快递', '程光快递', 'int', '程光快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (75, '80342014af3b4e188d373cb9d304a803', '传喜物流', '传喜物流', 'int', '传喜物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (76, '80342014af3b4e188d373cb9d304a803', '春风物流', '春风物流', 'int', '春风物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (77, '80342014af3b4e188d373cb9d304a803', '村通快递', '村通快递', 'int', '村通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (78, '80342014af3b4e188d373cb9d304a803', '长风物流', '长风物流', 'int', '长风物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (79, '80342014af3b4e188d373cb9d304a803', '长江国际速递', '长江国际速递', 'int', '长江国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (80, '80342014af3b4e188d373cb9d304a803', 'C&C国际速递', 'C&C国际速递', 'int', 'C&C国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (81, '80342014af3b4e188d373cb9d304a803', '诚一物流', '诚一物流', 'int', '诚一物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (82, '80342014af3b4e188d373cb9d304a803', '承诺达', '承诺达', 'int', '承诺达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (83, '80342014af3b4e188d373cb9d304a803', '曹操到', '曹操到', 'int', '曹操到', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (84, '80342014af3b4e188d373cb9d304a803', '昌宇国际', '昌宇国际', 'int', '昌宇国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (85, '80342014af3b4e188d373cb9d304a803', '河北橙配', '河北橙配', 'int', '河北橙配', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (86, '80342014af3b4e188d373cb9d304a803', '臣邦同城', '臣邦同城', 'int', '臣邦同城', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (87, '80342014af3b4e188d373cb9d304a803', 'CE易欧通国际速递', 'CE易欧通国际速递', 'int', 'CE易欧通国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (88, '80342014af3b4e188d373cb9d304a803', '创运物流', '创运物流', 'int', '创运物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (89, '80342014af3b4e188d373cb9d304a803', 'DHL中国', 'DHL中国', 'int', 'DHL中国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (90, '80342014af3b4e188d373cb9d304a803', 'DHL国际', 'DHL国际', 'int', 'DHL国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (91, '80342014af3b4e188d373cb9d304a803', 'DHL德国', 'DHL德国', 'int', 'DHL德国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (92, '80342014af3b4e188d373cb9d304a803', '德邦快递', '德邦快递', 'int', '德邦快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (93, '80342014af3b4e188d373cb9d304a803', '东方快递', '东方快递', 'int', '东方快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (94, '80342014af3b4e188d373cb9d304a803', '递四方', '递四方', 'int', '递四方', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (95, '80342014af3b4e188d373cb9d304a803', '大洋物流', '大洋物流', 'int', '大洋物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (96, '80342014af3b4e188d373cb9d304a803', '东方汇', '东方汇', 'int', '东方汇', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (97, '80342014af3b4e188d373cb9d304a803', '东西E全运', '东西E全运', 'int', '东西E全运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (98, '80342014af3b4e188d373cb9d304a803', 'D速物流', 'D速物流', 'int', 'D速物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (99, '80342014af3b4e188d373cb9d304a803', '达方物流', '达方物流', 'int', '达方物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (100, '80342014af3b4e188d373cb9d304a803', '大众佐川急便', '大众佐川急便', 'int', '大众佐川急便', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (101, '80342014af3b4e188d373cb9d304a803', '德方物流', '德方物流', 'int', '德方物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (102, '80342014af3b4e188d373cb9d304a803', '多道供应链', '多道供应链', 'int', '多道供应链', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (103, '80342014af3b4e188d373cb9d304a803', '德中快递', '德中快递', 'int', '德中快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (104, '80342014af3b4e188d373cb9d304a803', '德坤物流', '德坤物流', 'int', '德坤物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (105, '80342014af3b4e188d373cb9d304a803', '达速物流', '达速物流', 'int', '达速物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (106, '80342014af3b4e188d373cb9d304a803', '德豪驿', '德豪驿', 'int', '德豪驿', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (107, '80342014af3b4e188d373cb9d304a803', 'DHL Paket', 'DHL Paket', 'int', 'DHL Paket', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (108, '80342014af3b4e188d373cb9d304a803', '德国云快递', '德国云快递', 'int', '德国云快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (109, '80342014af3b4e188d373cb9d304a803', '大马鹿', '大马鹿', 'int', '大马鹿', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (110, '80342014af3b4e188d373cb9d304a803', '递五方云仓', '递五方云仓', 'int', '递五方云仓', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (111, '80342014af3b4e188d373cb9d304a803', 'db-station', 'db-station', 'int', 'db-station', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (112, '80342014af3b4e188d373cb9d304a803', '大道物流', '大道物流', 'int', '大道物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (113, '80342014af3b4e188d373cb9d304a803', '德尚国际速递', '德尚国际速递', 'int', '德尚国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (114, '80342014af3b4e188d373cb9d304a803', '德国 EUC POST', '德国 EUC POST', 'int', '德国 EUC POST', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (115, '80342014af3b4e188d373cb9d304a803', '丹鸟', '丹鸟', 'int', '丹鸟', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (116, '80342014af3b4e188d373cb9d304a803', '丹递56', '丹递56', 'int', '丹递56', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (117, '80342014af3b4e188d373cb9d304a803', 'EU-EXPRESS', 'EU-EXPRESS', 'int', 'EU-EXPRESS', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (118, '80342014af3b4e188d373cb9d304a803', 'EMS快递查询', 'EMS快递查询', 'int', 'EMS快递查询', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (119, '80342014af3b4e188d373cb9d304a803', 'EMS国际快递查询', 'EMS国际快递查询', 'int', 'EMS国际快递查询', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (120, '80342014af3b4e188d373cb9d304a803', '俄顺达', '俄顺达', 'int', '俄顺达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (121, '80342014af3b4e188d373cb9d304a803', 'EWE全球快递', 'EWE全球快递', 'int', 'EWE全球快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (122, '80342014af3b4e188d373cb9d304a803', 'EASYEXPRESS国际速递', 'EASYEXPRESS国际速递', 'int', 'EASYEXPRESS国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (123, '80342014af3b4e188d373cb9d304a803', 'e直运', 'e直运', 'int', 'e直运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (124, '80342014af3b4e188d373cb9d304a803', 'E跨通', 'E跨通', 'int', 'E跨通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (125, '80342014af3b4e188d373cb9d304a803', 'E速达', 'E速达', 'int', 'E速达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (126, '80342014af3b4e188d373cb9d304a803', 'EFS（平安快递）', 'EFS（平安快递）', 'int', 'EFS（平安快递）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (127, '80342014af3b4e188d373cb9d304a803', 'ETEEN专线', 'ETEEN专线', 'int', 'ETEEN专线', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (128, '80342014af3b4e188d373cb9d304a803', 'FedEx快递查询', 'FedEx快递查询', 'int', 'FedEx快递查询', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (129, '80342014af3b4e188d373cb9d304a803', 'FedEx美国', 'FedEx美国', 'int', 'FedEx美国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (130, '80342014af3b4e188d373cb9d304a803', 'FedEx英国', 'FedEx英国', 'int', 'FedEx英国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (131, '80342014af3b4e188d373cb9d304a803', 'FOX国际速递', 'FOX国际速递', 'int', 'FOX国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (132, '80342014af3b4e188d373cb9d304a803', '飞豹快递', '飞豹快递', 'int', '飞豹快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (133, '80342014af3b4e188d373cb9d304a803', '泛捷国际速递', '泛捷国际速递', 'int', '泛捷国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (134, '80342014af3b4e188d373cb9d304a803', '番薯国际货运', '番薯国际货运', 'int', '番薯国际货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (135, '80342014af3b4e188d373cb9d304a803', '颿达国际快递', '颿达国际快递', 'int', '颿达国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (136, '80342014af3b4e188d373cb9d304a803', '飞力士物流', '飞力士物流', 'int', '飞力士物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (137, '80342014af3b4e188d373cb9d304a803', '飞邦快递', '飞邦快递', 'int', '飞邦快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (138, '80342014af3b4e188d373cb9d304a803', '丰程物流', '丰程物流', 'int', '丰程物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (139, '80342014af3b4e188d373cb9d304a803', '泛远国际物流', '泛远国际物流', 'int', '泛远国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (140, '80342014af3b4e188d373cb9d304a803', '疯狂快递', '疯狂快递', 'int', '疯狂快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (141, '80342014af3b4e188d373cb9d304a803', '法翔速运', '法翔速运', 'int', '法翔速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (142, '80342014af3b4e188d373cb9d304a803', '富腾达快递', '富腾达快递', 'int', '富腾达快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (143, '80342014af3b4e188d373cb9d304a803', '方舟国际速递', '方舟国际速递', 'int', '方舟国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (144, '80342014af3b4e188d373cb9d304a803', '飞云快递系统', '飞云快递系统', 'int', '飞云快递系统', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (145, '80342014af3b4e188d373cb9d304a803', '锋鸟物流', '锋鸟物流', 'int', '锋鸟物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (146, '80342014af3b4e188d373cb9d304a803', '飞洋快递', '飞洋快递', 'int', '飞洋快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (147, '80342014af3b4e188d373cb9d304a803', 'FedRoad 联邦转运', 'FedRoad 联邦转运', 'int', 'FedRoad 联邦转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (148, '80342014af3b4e188d373cb9d304a803', '富吉速运', '富吉速运', 'int', '富吉速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (149, '80342014af3b4e188d373cb9d304a803', '丰羿', '丰羿', 'int', '丰羿', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (150, '80342014af3b4e188d373cb9d304a803', 'GSM', 'GSM', 'int', 'GSM', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (151, '80342014af3b4e188d373cb9d304a803', 'GATI快递', 'GATI快递', 'int', 'GATI快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (152, '80342014af3b4e188d373cb9d304a803', 'GTS快递', 'GTS快递', 'int', 'GTS快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (153, '80342014af3b4e188d373cb9d304a803', '挂号信/国内邮件', '挂号信/国内邮件', 'int', '挂号信/国内邮件', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (154, '80342014af3b4e188d373cb9d304a803', '国通快递', '国通快递', 'int', '国通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (155, '80342014af3b4e188d373cb9d304a803', '港中能达物流', '港中能达物流', 'int', '港中能达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (156, '80342014af3b4e188d373cb9d304a803', '共速达', '共速达', 'int', '共速达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (157, '80342014af3b4e188d373cb9d304a803', 'GE2D跨境物流', 'GE2D跨境物流', 'int', 'GE2D跨境物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (158, '80342014af3b4e188d373cb9d304a803', '广东诚通物流', '广东诚通物流', 'int', '广东诚通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (159, '80342014af3b4e188d373cb9d304a803', 'GHT物流', 'GHT物流', 'int', 'GHT物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (160, '80342014af3b4e188d373cb9d304a803', '高捷快运', '高捷快运', 'int', '高捷快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (161, '80342014af3b4e188d373cb9d304a803', '共联配', '共联配', 'int', '共联配', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (162, '80342014af3b4e188d373cb9d304a803', 'GTT EXPRESS快递', 'GTT EXPRESS快递', 'int', 'GTT EXPRESS快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (163, '80342014af3b4e188d373cb9d304a803', 'GLS快递', 'GLS快递', 'int', 'GLS快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (164, '80342014af3b4e188d373cb9d304a803', 'GPI物流集团', 'GPI物流集团', 'int', 'GPI物流集团', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (165, '80342014af3b4e188d373cb9d304a803', '华宇物流', '华宇物流', 'int', '华宇物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (166, '80342014af3b4e188d373cb9d304a803', '恒路物流', '恒路物流', 'int', '恒路物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (167, '80342014af3b4e188d373cb9d304a803', '好来运快递', '好来运快递', 'int', '好来运快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (168, '80342014af3b4e188d373cb9d304a803', '环国运物流', '环国运物流', 'int', '环国运物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (169, '80342014af3b4e188d373cb9d304a803', '海航天天', '海航天天', 'int', '海航天天', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (170, '80342014af3b4e188d373cb9d304a803', '華信物流WTO', '華信物流WTO', 'int', '華信物流WTO', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (171, '80342014af3b4e188d373cb9d304a803', '华企快运', '华企快运', 'int', '华企快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (172, '80342014af3b4e188d373cb9d304a803', '户通物流', '户通物流', 'int', '户通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (173, '80342014af3b4e188d373cb9d304a803', '黄马甲快递', '黄马甲快递', 'int', '黄马甲快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (174, '80342014af3b4e188d373cb9d304a803', '合众速递（UCS）', '合众速递（UCS）', 'int', '合众速递（UCS）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (175, '80342014af3b4e188d373cb9d304a803', '皇家物流', '皇家物流', 'int', '皇家物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (176, '80342014af3b4e188d373cb9d304a803', '猴急送', '猴急送', 'int', '猴急送', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (177, '80342014af3b4e188d373cb9d304a803', '航宇快递', '航宇快递', 'int', '航宇快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (178, '80342014af3b4e188d373cb9d304a803', '环球速运', '环球速运', 'int', '环球速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (179, '80342014af3b4e188d373cb9d304a803', '航空快递', '航空快递', 'int', '航空快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (180, '80342014af3b4e188d373cb9d304a803', '好又快物流', '好又快物流', 'int', '好又快物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (181, '80342014af3b4e188d373cb9d304a803', '韩润物流', '韩润物流', 'int', '韩润物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (182, '80342014af3b4e188d373cb9d304a803', '荷兰 Sky Post', '荷兰 Sky Post', 'int', '荷兰 Sky Post', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (183, '80342014af3b4e188d373cb9d304a803', '汇通天下物流', '汇通天下物流', 'int', '汇通天下物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (184, '80342014af3b4e188d373cb9d304a803', '恒通快递', '恒通快递', 'int', '恒通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (185, '80342014af3b4e188d373cb9d304a803', '恒宇运通', '恒宇运通', 'int', '恒宇运通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (186, '80342014af3b4e188d373cb9d304a803', '恒瑞物流', '恒瑞物流', 'int', '恒瑞物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (187, '80342014af3b4e188d373cb9d304a803', '河南全速通', '河南全速通', 'int', '河南全速通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (188, '80342014af3b4e188d373cb9d304a803', '华瀚快递', '华瀚快递', 'int', '华瀚快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (189, '80342014af3b4e188d373cb9d304a803', '海淘物流', '海淘物流', 'int', '海淘物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (190, '80342014af3b4e188d373cb9d304a803', '海沧无忧', '海沧无忧', 'int', '海沧无忧', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (191, '80342014af3b4e188d373cb9d304a803', '鸿泰物流', '鸿泰物流', 'int', '鸿泰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (192, '80342014af3b4e188d373cb9d304a803', '海硕高铁速递', '海硕高铁速递', 'int', '海硕高铁速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (193, '80342014af3b4e188d373cb9d304a803', '海联快递', '海联快递', 'int', '海联快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (194, '80342014af3b4e188d373cb9d304a803', '海带宝转运', '海带宝转运', 'int', '海带宝转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (195, '80342014af3b4e188d373cb9d304a803', '花瓣转运', '花瓣转运', 'int', '花瓣转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (196, '80342014af3b4e188d373cb9d304a803', '瀚朝物流', '瀚朝物流', 'int', '瀚朝物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (197, '80342014af3b4e188d373cb9d304a803', '红远物流', '红远物流', 'int', '红远物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (198, '80342014af3b4e188d373cb9d304a803', '浩博物流', '浩博物流', 'int', '浩博物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (199, '80342014af3b4e188d373cb9d304a803', '华夏国际速递', '华夏国际速递', 'int', '华夏国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (200, '80342014af3b4e188d373cb9d304a803', '黑猫宅急便', '黑猫宅急便', 'int', '黑猫宅急便', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (201, '80342014af3b4e188d373cb9d304a803', '海信物流', '海信物流', 'int', '海信物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (202, '80342014af3b4e188d373cb9d304a803', '货运皇国际物流', '货运皇国际物流', 'int', '货运皇国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (203, '80342014af3b4e188d373cb9d304a803', '红背心', '红背心', 'int', '红背心', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (204, '80342014af3b4e188d373cb9d304a803', '皇家云仓', '皇家云仓', 'int', '皇家云仓', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (205, '80342014af3b4e188d373cb9d304a803', '翰丰快递', '翰丰快递', 'int', '翰丰快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (206, '80342014af3b4e188d373cb9d304a803', '华欣物流', '华欣物流', 'int', '华欣物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (207, '80342014af3b4e188d373cb9d304a803', '环球快运', '环球快运', 'int', '环球快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (208, '80342014af3b4e188d373cb9d304a803', '环旅快运', '环旅快运', 'int', '环旅快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (209, '80342014af3b4e188d373cb9d304a803', '华夏货运', '华夏货运', 'int', '华夏货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (210, '80342014af3b4e188d373cb9d304a803', '汇森速运', '汇森速运', 'int', '汇森速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (211, '80342014af3b4e188d373cb9d304a803', '宏递快运', '宏递快运', 'int', '宏递快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (212, '80342014af3b4e188d373cb9d304a803', '汇达物流', '汇达物流', 'int', '汇达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (213, '80342014af3b4e188d373cb9d304a803', '华美快递', '华美快递', 'int', '华美快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (214, '80342014af3b4e188d373cb9d304a803', '佳怡物流', '佳怡物流', 'int', '佳怡物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (215, '80342014af3b4e188d373cb9d304a803', '加运美快递', '加运美快递', 'int', '加运美快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (216, '80342014af3b4e188d373cb9d304a803', '急先达物流', '急先达物流', 'int', '急先达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (217, '80342014af3b4e188d373cb9d304a803', '京广速递', '京广速递', 'int', '京广速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (218, '80342014af3b4e188d373cb9d304a803', '京东物流', '京东物流', 'int', '京东物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (219, '80342014af3b4e188d373cb9d304a803', '久易快递', '久易快递', 'int', '久易快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (220, '80342014af3b4e188d373cb9d304a803', '九曳供应链', '九曳供应链', 'int', '九曳供应链', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (221, '80342014af3b4e188d373cb9d304a803', '佳家通', '佳家通', 'int', '佳家通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (222, '80342014af3b4e188d373cb9d304a803', '锦程国际物流', '锦程国际物流', 'int', '锦程国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (223, '80342014af3b4e188d373cb9d304a803', '景光物流', '景光物流', 'int', '景光物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (224, '80342014af3b4e188d373cb9d304a803', '嘉里大通', '嘉里大通', 'int', '嘉里大通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (225, '80342014af3b4e188d373cb9d304a803', '佳成快递', '佳成快递', 'int', '佳成快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (226, '80342014af3b4e188d373cb9d304a803', '锦程快递', '锦程快递', 'int', '锦程快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (227, '80342014af3b4e188d373cb9d304a803', '捷安达国际速递', '捷安达国际速递', 'int', '捷安达国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (228, '80342014af3b4e188d373cb9d304a803', '家家通快递', '家家通快递', 'int', '家家通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (229, '80342014af3b4e188d373cb9d304a803', '吉祥邮（澳洲）', '吉祥邮（澳洲）', 'int', '吉祥邮（澳洲）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (230, '80342014af3b4e188d373cb9d304a803', '佳捷翔物流', '佳捷翔物流', 'int', '佳捷翔物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (231, '80342014af3b4e188d373cb9d304a803', '极地快递', '极地快递', 'int', '极地快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (232, '80342014af3b4e188d373cb9d304a803', '加州猫速递', '加州猫速递', 'int', '加州猫速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (233, '80342014af3b4e188d373cb9d304a803', '捷邦物流', '捷邦物流', 'int', '捷邦物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (234, '80342014af3b4e188d373cb9d304a803', '集先锋速递', '集先锋速递', 'int', '集先锋速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (235, '80342014af3b4e188d373cb9d304a803', '嘉诚速达', '嘉诚速达', 'int', '嘉诚速达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (236, '80342014af3b4e188d373cb9d304a803', '景顺物流', '景顺物流', 'int', '景顺物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (237, '80342014af3b4e188d373cb9d304a803', '加拿大联通快运', '加拿大联通快运', 'int', '加拿大联通快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (238, '80342014af3b4e188d373cb9d304a803', '柬埔寨中通', '柬埔寨中通', 'int', '柬埔寨中通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (239, '80342014af3b4e188d373cb9d304a803', '嘉荣物流', '嘉荣物流', 'int', '嘉荣物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (240, '80342014af3b4e188d373cb9d304a803', '聚盟共建', '聚盟共建', 'int', '聚盟共建', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (241, '80342014af3b4e188d373cb9d304a803', '极兔速递', '极兔速递', 'int', '极兔速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (242, '80342014af3b4e188d373cb9d304a803', '加拿大雷霆快递', '加拿大雷霆快递', 'int', '加拿大雷霆快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (243, '80342014af3b4e188d373cb9d304a803', '冀速物流', '冀速物流', 'int', '冀速物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (244, '80342014af3b4e188d373cb9d304a803', '聚鼎物流', '聚鼎物流', 'int', '聚鼎物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (245, '80342014af3b4e188d373cb9d304a803', '加拿大龙行速运', '加拿大龙行速运', 'int', '加拿大龙行速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (246, '80342014af3b4e188d373cb9d304a803', '吉捷国际速递', '吉捷国际速递', 'int', '吉捷国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (247, '80342014af3b4e188d373cb9d304a803', '佳辰国际速递', '佳辰国际速递', 'int', '佳辰国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (248, '80342014af3b4e188d373cb9d304a803', '加佳物流', '加佳物流', 'int', '加佳物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (249, '80342014af3b4e188d373cb9d304a803', '捷祥物流', '捷祥物流', 'int', '捷祥物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (250, '80342014af3b4e188d373cb9d304a803', 'JDIEX', 'JDIEX', 'int', 'JDIEX', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (251, '80342014af3b4e188d373cb9d304a803', '跨越速运', '跨越速运', 'int', '跨越速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (252, '80342014af3b4e188d373cb9d304a803', '快达物流', '快达物流', 'int', '快达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (253, '80342014af3b4e188d373cb9d304a803', '开心快递', '开心快递', 'int', '开心快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (254, '80342014af3b4e188d373cb9d304a803', '快速递', '快速递', 'int', '快速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (255, '80342014af3b4e188d373cb9d304a803', '快服务', '快服务', 'int', '快服务', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (256, '80342014af3b4e188d373cb9d304a803', '快8速运', '快8速运', 'int', '快8速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (257, '80342014af3b4e188d373cb9d304a803', '快捷快物流', '快捷快物流', 'int', '快捷快物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (258, '80342014af3b4e188d373cb9d304a803', '联昊通物流', '联昊通物流', 'int', '联昊通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (259, '80342014af3b4e188d373cb9d304a803', '乐天速递', '乐天速递', 'int', '乐天速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (260, '80342014af3b4e188d373cb9d304a803', '乐递供应链', '乐递供应链', 'int', '乐递供应链', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (261, '80342014af3b4e188d373cb9d304a803', '论道国际物流', '论道国际物流', 'int', '论道国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (262, '80342014af3b4e188d373cb9d304a803', '林安物流', '林安物流', 'int', '林安物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (263, '80342014af3b4e188d373cb9d304a803', '6LS EXPRESS', '6LS EXPRESS', 'int', '6LS EXPRESS', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (264, '80342014af3b4e188d373cb9d304a803', '联运通物流', '联运通物流', 'int', '联运通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (265, '80342014af3b4e188d373cb9d304a803', '龙枫国际快递', '龙枫国际快递', 'int', '龙枫国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (266, '80342014af3b4e188d373cb9d304a803', '联通快递', '联通快递', 'int', '联通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (267, '80342014af3b4e188d373cb9d304a803', '联合快递', '联合快递', 'int', '联合快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (268, '80342014af3b4e188d373cb9d304a803', '陆本速递 LUBEN EXPRESS', '陆本速递 LUBEN EXPRESS', 'int', '陆本速递 LUBEN EXPRESS', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (269, '80342014af3b4e188d373cb9d304a803', '龙邦物流', '龙邦物流', 'int', '龙邦物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (270, '80342014af3b4e188d373cb9d304a803', '联合速运', '联合速运', 'int', '联合速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (271, '80342014af3b4e188d373cb9d304a803', 'LUCFLOW EXPRESS', 'LUCFLOW EXPRESS', 'int', 'LUCFLOW EXPRESS', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (272, '80342014af3b4e188d373cb9d304a803', '楽道物流', '楽道物流', 'int', '楽道物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (273, '80342014af3b4e188d373cb9d304a803', '蓝天物流', '蓝天物流', 'int', '蓝天物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (274, '80342014af3b4e188d373cb9d304a803', '龙行天下', '龙行天下', 'int', '龙行天下', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (275, '80342014af3b4e188d373cb9d304a803', '联合速递', '联合速递', 'int', '联合速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (276, '80342014af3b4e188d373cb9d304a803', '民航快递', '民航快递', 'int', '民航快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (277, '80342014af3b4e188d373cb9d304a803', '美国快递', '美国快递', 'int', '美国快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (278, '80342014af3b4e188d373cb9d304a803', '美邦国际快递', '美邦国际快递', 'int', '美邦国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (279, '80342014af3b4e188d373cb9d304a803', '木春货运', '木春货运', 'int', '木春货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (280, '80342014af3b4e188d373cb9d304a803', '美快国际物流', '美快国际物流', 'int', '美快国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (281, '80342014af3b4e188d373cb9d304a803', '美通快递', '美通快递', 'int', '美通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (282, '80342014af3b4e188d373cb9d304a803', '马珂博逻', '马珂博逻', 'int', '马珂博逻', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (283, '80342014af3b4e188d373cb9d304a803', '明辉物流', '明辉物流', 'int', '明辉物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (284, '80342014af3b4e188d373cb9d304a803', '魔速达', '魔速达', 'int', '魔速达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (285, '80342014af3b4e188d373cb9d304a803', '猛犸速递', '猛犸速递', 'int', '猛犸速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (286, '80342014af3b4e188d373cb9d304a803', '美泰物流', '美泰物流', 'int', '美泰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (287, '80342014af3b4e188d373cb9d304a803', '明达国际速递', '明达国际速递', 'int', '明达国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (288, '80342014af3b4e188d373cb9d304a803', '明通国际速递', '明通国际速递', 'int', '明通国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (289, '80342014af3b4e188d373cb9d304a803', 'MoreLink', 'MoreLink', 'int', 'MoreLink', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (290, '80342014af3b4e188d373cb9d304a803', '能达速递', '能达速递', 'int', '能达速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (291, '80342014af3b4e188d373cb9d304a803', '偌亚奥国际', '偌亚奥国际', 'int', '偌亚奥国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (292, '80342014af3b4e188d373cb9d304a803', '诺尔国际物流', '诺尔国际物流', 'int', '诺尔国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (293, '80342014af3b4e188d373cb9d304a803', '尼尔快递', '尼尔快递', 'int', '尼尔快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (294, '80342014af3b4e188d373cb9d304a803', '能装能送', '能装能送', 'int', '能装能送', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (295, '80342014af3b4e188d373cb9d304a803', '南方传媒物流', '南方传媒物流', 'int', '南方传媒物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (296, '80342014af3b4e188d373cb9d304a803', '牛仔速运', '牛仔速运', 'int', '牛仔速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (297, '80342014af3b4e188d373cb9d304a803', 'OCS', 'OCS', 'int', 'OCS', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (298, '80342014af3b4e188d373cb9d304a803', '欧亚专线', '欧亚专线', 'int', '欧亚专线', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (299, '80342014af3b4e188d373cb9d304a803', '欧洲UEX', '欧洲UEX', 'int', '欧洲UEX', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (300, '80342014af3b4e188d373cb9d304a803', 'PCA Express', 'PCA Express', 'int', 'PCA Express', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (301, '80342014af3b4e188d373cb9d304a803', '平安达腾飞', '平安达腾飞', 'int', '平安达腾飞', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (302, '80342014af3b4e188d373cb9d304a803', '品骏快递', '品骏快递', 'int', '品骏快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (303, '80342014af3b4e188d373cb9d304a803', '鹏远国际速递', '鹏远国际速递', 'int', '鹏远国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (304, '80342014af3b4e188d373cb9d304a803', 'PostElbe', 'PostElbe', 'int', 'PostElbe', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (305, '80342014af3b4e188d373cb9d304a803', '品信快递', '品信快递', 'int', '品信快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (306, '80342014af3b4e188d373cb9d304a803', '全一快递', '全一快递', 'int', '全一快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (307, '80342014af3b4e188d373cb9d304a803', '秦邦快运', '秦邦快运', 'int', '秦邦快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (308, '80342014af3b4e188d373cb9d304a803', '全速通国际快递', '全速通国际快递', 'int', '全速通国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (309, '80342014af3b4e188d373cb9d304a803', '秦远物流', '秦远物流', 'int', '秦远物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (310, '80342014af3b4e188d373cb9d304a803', '启辰国际物流', '启辰国际物流', 'int', '启辰国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (311, '80342014af3b4e188d373cb9d304a803', '千顺快递', '千顺快递', 'int', '千顺快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (312, '80342014af3b4e188d373cb9d304a803', '全时速运', '全时速运', 'int', '全时速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (313, '80342014af3b4e188d373cb9d304a803', '全联速运', '全联速运', 'int', '全联速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (314, '80342014af3b4e188d373cb9d304a803', '青云物流', '青云物流', 'int', '青云物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (315, '80342014af3b4e188d373cb9d304a803', '签收快递', '签收快递', 'int', '签收快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (316, '80342014af3b4e188d373cb9d304a803', '7E速递', '7E速递', 'int', '7E速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (317, '80342014af3b4e188d373cb9d304a803', '全网物流', '全网物流', 'int', '全网物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (318, '80342014af3b4e188d373cb9d304a803', '启邦国际物流', '启邦国际物流', 'int', '启邦国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (319, '80342014af3b4e188d373cb9d304a803', '日昱物流', '日昱物流', 'int', '日昱物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (320, '80342014af3b4e188d373cb9d304a803', '日日顺物流', '日日顺物流', 'int', '日日顺物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (321, '80342014af3b4e188d373cb9d304a803', '日日顺快线', '日日顺快线', 'int', '日日顺快线', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (322, '80342014af3b4e188d373cb9d304a803', '容智快运', '容智快运', 'int', '容智快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (323, '80342014af3b4e188d373cb9d304a803', '日日通国际', '日日通国际', 'int', '日日通国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (324, '80342014af3b4e188d373cb9d304a803', '睿和泰速运', '睿和泰速运', 'int', '睿和泰速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (325, '80342014af3b4e188d373cb9d304a803', '日日顺智慧物联', '日日顺智慧物联', 'int', '日日顺智慧物联', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (326, '80342014af3b4e188d373cb9d304a803', '人人转运', '人人转运', 'int', '人人转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (327, '80342014af3b4e188d373cb9d304a803', '顺丰速运', '顺丰速运', 'int', '顺丰速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (328, '80342014af3b4e188d373cb9d304a803', '申通快递', '申通快递', 'int', '申通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (329, '80342014af3b4e188d373cb9d304a803', '速尔快递', '速尔快递', 'int', '速尔快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (330, '80342014af3b4e188d373cb9d304a803', '盛辉物流', '盛辉物流', 'int', '盛辉物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (331, '80342014af3b4e188d373cb9d304a803', '世运快递', '世运快递', 'int', '世运快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (332, '80342014af3b4e188d373cb9d304a803', '盛丰物流', '盛丰物流', 'int', '盛丰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (333, '80342014af3b4e188d373cb9d304a803', '三态速递', '三态速递', 'int', '三态速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (334, '80342014af3b4e188d373cb9d304a803', '申通E物流', '申通E物流', 'int', '申通E物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (335, '80342014af3b4e188d373cb9d304a803', '圣安物流', '圣安物流', 'int', '圣安物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (336, '80342014af3b4e188d373cb9d304a803', '穗佳物流', '穗佳物流', 'int', '穗佳物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (337, '80342014af3b4e188d373cb9d304a803', '上海林道货运', '上海林道货运', 'int', '上海林道货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (338, '80342014af3b4e188d373cb9d304a803', '速舟物流', '速舟物流', 'int', '速舟物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (339, '80342014af3b4e188d373cb9d304a803', '顺捷丰达', '顺捷丰达', 'int', '顺捷丰达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (340, '80342014af3b4e188d373cb9d304a803', '速必达物流', '速必达物流', 'int', '速必达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (341, '80342014af3b4e188d373cb9d304a803', '速腾物流', '速腾物流', 'int', '速腾物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (342, '80342014af3b4e188d373cb9d304a803', '速方国际物流', '速方国际物流', 'int', '速方国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (343, '80342014af3b4e188d373cb9d304a803', '速递中国', '速递中国', 'int', '速递中国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (344, '80342014af3b4e188d373cb9d304a803', '苏宁物流', '苏宁物流', 'int', '苏宁物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (345, '80342014af3b4e188d373cb9d304a803', '顺时达物流', '顺时达物流', 'int', '顺时达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (346, '80342014af3b4e188d373cb9d304a803', 'Superb Grace', 'Superb Grace', 'int', 'Superb Grace', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (347, '80342014af3b4e188d373cb9d304a803', 'SQK国际速递', 'SQK国际速递', 'int', 'SQK国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (348, '80342014af3b4e188d373cb9d304a803', '顺士达速运', '顺士达速运', 'int', '顺士达速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (349, '80342014af3b4e188d373cb9d304a803', 'SYNSHIP快递', 'SYNSHIP快递', 'int', 'SYNSHIP快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (350, '80342014af3b4e188d373cb9d304a803', '申通国际', '申通国际', 'int', '申通国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (351, '80342014af3b4e188d373cb9d304a803', '三象速递', '三象速递', 'int', '三象速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (352, '80342014af3b4e188d373cb9d304a803', '商桥物流', '商桥物流', 'int', '商桥物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (353, '80342014af3b4e188d373cb9d304a803', '速配鸥翼', '速配鸥翼', 'int', '速配鸥翼', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (354, '80342014af3b4e188d373cb9d304a803', '速派快递', '速派快递', 'int', '速派快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (355, '80342014af3b4e188d373cb9d304a803', '苏通快运', '苏通快运', 'int', '苏通快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (356, '80342014af3b4e188d373cb9d304a803', '捎客物流', '捎客物流', 'int', '捎客物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (357, '80342014af3b4e188d373cb9d304a803', '速达通跨境物流', '速达通跨境物流', 'int', '速达通跨境物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (358, '80342014af3b4e188d373cb9d304a803', '速通物流', '速通物流', 'int', '速通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (359, '80342014af3b4e188d373cb9d304a803', '顺达快递', '顺达快递', 'int', '顺达快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (360, '80342014af3b4e188d373cb9d304a803', '顺心捷达', '顺心捷达', 'int', '顺心捷达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (361, '80342014af3b4e188d373cb9d304a803', '盛通快递', '盛通快递', 'int', '盛通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (362, '80342014af3b4e188d373cb9d304a803', '三真驿道', '三真驿道', 'int', '三真驿道', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (363, '80342014af3b4e188d373cb9d304a803', '尚途国际货运', '尚途国际货运', 'int', '尚途国际货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (364, '80342014af3b4e188d373cb9d304a803', '上海缤纷物流', '上海缤纷物流', 'int', '上海缤纷物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (365, '80342014af3b4e188d373cb9d304a803', '叁虎物流', '叁虎物流', 'int', '叁虎物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (366, '80342014af3b4e188d373cb9d304a803', '世华通物流', '世华通物流', 'int', '世华通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (367, '80342014af3b4e188d373cb9d304a803', '速风快递', '速风快递', 'int', '速风快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (368, '80342014af3b4e188d373cb9d304a803', '时达通', '时达通', 'int', '时达通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (369, '80342014af3b4e188d373cb9d304a803', '速佳达快运', '速佳达快运', 'int', '速佳达快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (370, '80342014af3b4e188d373cb9d304a803', '四方格', '四方格', 'int', '四方格', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (371, '80342014af3b4e188d373cb9d304a803', '闪货极速达', '闪货极速达', 'int', '闪货极速达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (372, '80342014af3b4e188d373cb9d304a803', '天天快递', '天天快递', 'int', '天天快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (373, '80342014af3b4e188d373cb9d304a803', 'TNT快递', 'TNT快递', 'int', 'TNT快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (374, '80342014af3b4e188d373cb9d304a803', '天地华宇', '天地华宇', 'int', '天地华宇', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (375, '80342014af3b4e188d373cb9d304a803', '天美快递', '天美快递', 'int', '天美快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (376, '80342014af3b4e188d373cb9d304a803', '同舟行物流', '同舟行物流', 'int', '同舟行物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (377, '80342014af3b4e188d373cb9d304a803', '腾达速递', '腾达速递', 'int', '腾达速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (378, '80342014af3b4e188d373cb9d304a803', '泰国138', '泰国138', 'int', '泰国138', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (379, '80342014af3b4e188d373cb9d304a803', '通达兴物流', '通达兴物流', 'int', '通达兴物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (380, '80342014af3b4e188d373cb9d304a803', '淘韩国际快递', '淘韩国际快递', 'int', '淘韩国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (381, '80342014af3b4e188d373cb9d304a803', '特急送', '特急送', 'int', '特急送', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (382, '80342014af3b4e188d373cb9d304a803', '天天快物流', '天天快物流', 'int', '天天快物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (383, '80342014af3b4e188d373cb9d304a803', '天马迅达', '天马迅达', 'int', '天马迅达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (384, '80342014af3b4e188d373cb9d304a803', '天翔快递', '天翔快递', 'int', '天翔快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (385, '80342014af3b4e188d373cb9d304a803', '同城快寄', '同城快寄', 'int', '同城快寄', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (386, '80342014af3b4e188d373cb9d304a803', '驼峰国际', '驼峰国际', 'int', '驼峰国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (387, '80342014af3b4e188d373cb9d304a803', 'TransRush', 'TransRush', 'int', 'TransRush', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (388, '80342014af3b4e188d373cb9d304a803', 'TST速运通', 'TST速运通', 'int', 'TST速运通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (389, '80342014af3b4e188d373cb9d304a803', '泰国中通CTO', '泰国中通CTO', 'int', '泰国中通CTO', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (390, '80342014af3b4e188d373cb9d304a803', '泰国中通ZTO', '泰国中通ZTO', 'int', '泰国中通ZTO', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (391, '80342014af3b4e188d373cb9d304a803', '铁中快运', '铁中快运', 'int', '铁中快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (392, '80342014af3b4e188d373cb9d304a803', '淘布斯国际物流', '淘布斯国际物流', 'int', '淘布斯国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (393, '80342014af3b4e188d373cb9d304a803', '泰进物流', '泰进物流', 'int', '泰进物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (394, '80342014af3b4e188d373cb9d304a803', '天天欧洲物流', '天天欧洲物流', 'int', '天天欧洲物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (395, '80342014af3b4e188d373cb9d304a803', 'UPS快递查询', 'UPS快递查询', 'int', 'UPS快递查询', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (396, '80342014af3b4e188d373cb9d304a803', 'UC优速快递', 'UC优速快递', 'int', 'UC优速快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (397, '80342014af3b4e188d373cb9d304a803', 'UCS（合众速递）', 'UCS（合众速递）', 'int', 'UCS（合众速递）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (398, '80342014af3b4e188d373cb9d304a803', 'USPS美国邮政', 'USPS美国邮政', 'int', 'USPS美国邮政', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (399, '80342014af3b4e188d373cb9d304a803', 'UEQ快递', 'UEQ快递', 'int', 'UEQ快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (400, '80342014af3b4e188d373cb9d304a803', 'UEX国际物流', 'UEX国际物流', 'int', 'UEX国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (401, '80342014af3b4e188d373cb9d304a803', 'UTAO 优到', 'UTAO 优到', 'int', 'UTAO 优到', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (402, '80342014af3b4e188d373cb9d304a803', '万家物流', '万家物流', 'int', '万家物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (403, '80342014af3b4e188d373cb9d304a803', '万家通', '万家通', 'int', '万家通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (404, '80342014af3b4e188d373cb9d304a803', '威时沛运', '威时沛运', 'int', '威时沛运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (405, '80342014af3b4e188d373cb9d304a803', '微转运', '微转运', 'int', '微转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (406, '80342014af3b4e188d373cb9d304a803', '万通快递', '万通快递', 'int', '万通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (407, '80342014af3b4e188d373cb9d304a803', '渥途国际速运', '渥途国际速运', 'int', '渥途国际速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (408, '80342014af3b4e188d373cb9d304a803', '豌豆物流', '豌豆物流', 'int', '豌豆物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (409, '80342014af3b4e188d373cb9d304a803', '万家康物流', '万家康物流', 'int', '万家康物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (410, '80342014af3b4e188d373cb9d304a803', '维普恩物流', '维普恩物流', 'int', '维普恩物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (411, '80342014af3b4e188d373cb9d304a803', '51跨境通', '51跨境通', 'int', '51跨境通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (412, '80342014af3b4e188d373cb9d304a803', '万达美', '万达美', 'int', '万达美', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (413, '80342014af3b4e188d373cb9d304a803', '沃埃家', '沃埃家', 'int', '沃埃家', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (414, '80342014af3b4e188d373cb9d304a803', '潍鸿', '潍鸿', 'int', '潍鸿', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (415, '80342014af3b4e188d373cb9d304a803', '万运国际快递', '万运国际快递', 'int', '万运国际快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (416, '80342014af3b4e188d373cb9d304a803', '武汉优进汇', '武汉优进汇', 'int', '武汉优进汇', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (417, '80342014af3b4e188d373cb9d304a803', '威速递', '威速递', 'int', '威速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (418, '80342014af3b4e188d373cb9d304a803', '迅达速递', '迅达速递', 'int', '迅达速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (419, '80342014af3b4e188d373cb9d304a803', '信丰物流', '信丰物流', 'int', '信丰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (420, '80342014af3b4e188d373cb9d304a803', '喜来快递', '喜来快递', 'int', '喜来快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (421, '80342014af3b4e188d373cb9d304a803', '新顺丰（NSF）', '新顺丰（NSF）', 'int', '新顺丰（NSF）', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (422, '80342014af3b4e188d373cb9d304a803', '新速航', '新速航', 'int', '新速航', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (423, '80342014af3b4e188d373cb9d304a803', '西邮寄', '西邮寄', 'int', '西邮寄', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (424, '80342014af3b4e188d373cb9d304a803', '新杰物流', '新杰物流', 'int', '新杰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (425, '80342014af3b4e188d373cb9d304a803', '心怡物流', '心怡物流', 'int', '心怡物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (426, '80342014af3b4e188d373cb9d304a803', '新时速物流', '新时速物流', 'int', '新时速物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (427, '80342014af3b4e188d373cb9d304a803', '翔腾物流', '翔腾物流', 'int', '翔腾物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (428, '80342014af3b4e188d373cb9d304a803', '西翼物流', '西翼物流', 'int', '西翼物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (429, '80342014af3b4e188d373cb9d304a803', '小熊物流', '小熊物流', 'int', '小熊物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (430, '80342014af3b4e188d373cb9d304a803', '西安运逸快递', '西安运逸快递', 'int', '西安运逸快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (431, '80342014af3b4e188d373cb9d304a803', '星空国际', '星空国际', 'int', '星空国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (432, '80342014af3b4e188d373cb9d304a803', '雪域快递', '雪域快递', 'int', '雪域快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (433, '80342014af3b4e188d373cb9d304a803', '西游寄', '西游寄', 'int', '西游寄', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (434, '80342014af3b4e188d373cb9d304a803', 'xLobo', 'xLobo', 'int', 'xLobo', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (435, '80342014af3b4e188d373cb9d304a803', '迅速快递', '迅速快递', 'int', '迅速快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (436, '80342014af3b4e188d373cb9d304a803', '香港伟豪国际物流', '香港伟豪国际物流', 'int', '香港伟豪国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (437, '80342014af3b4e188d373cb9d304a803', '鑫远东速运', '鑫远东速运', 'int', '鑫远东速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (438, '80342014af3b4e188d373cb9d304a803', '新元国际', '新元国际', 'int', '新元国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (439, '80342014af3b4e188d373cb9d304a803', '鑫正一快递', '鑫正一快递', 'int', '鑫正一快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (440, '80342014af3b4e188d373cb9d304a803', '雪域易购', '雪域易购', 'int', '雪域易购', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (441, '80342014af3b4e188d373cb9d304a803', '鑫宸物流', '鑫宸物流', 'int', '鑫宸物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (442, '80342014af3b4e188d373cb9d304a803', '圆通速递', '圆通速递', 'int', '圆通速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (443, '80342014af3b4e188d373cb9d304a803', '韵达快递', '韵达快递', 'int', '韵达快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (444, '80342014af3b4e188d373cb9d304a803', '韵达美国件', '韵达美国件', 'int', '韵达美国件', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (445, '80342014af3b4e188d373cb9d304a803', '邮政国内', '邮政国内', 'int', '邮政国内', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (446, '80342014af3b4e188d373cb9d304a803', '邮政国际', '邮政国际', 'int', '邮政国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (447, '80342014af3b4e188d373cb9d304a803', '邮政EMS速递', '邮政EMS速递', 'int', '邮政EMS速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (448, '80342014af3b4e188d373cb9d304a803', '运通快递', '运通快递', 'int', '运通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (449, '80342014af3b4e188d373cb9d304a803', '宇鑫物流', '宇鑫物流', 'int', '宇鑫物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (450, '80342014af3b4e188d373cb9d304a803', '远成物流', '远成物流', 'int', '远成物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (451, '80342014af3b4e188d373cb9d304a803', '优速快递', '优速快递', 'int', '优速快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (452, '80342014af3b4e188d373cb9d304a803', '越丰物流', '越丰物流', 'int', '越丰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (453, '80342014af3b4e188d373cb9d304a803', '源安达快递', '源安达快递', 'int', '源安达快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (454, '80342014af3b4e188d373cb9d304a803', '原飞航物流', '原飞航物流', 'int', '原飞航物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (455, '80342014af3b4e188d373cb9d304a803', '亚风速递', '亚风速递', 'int', '亚风速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (456, '80342014af3b4e188d373cb9d304a803', '邮必佳', '邮必佳', 'int', '邮必佳', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (457, '80342014af3b4e188d373cb9d304a803', '英脉物流', '英脉物流', 'int', '英脉物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (458, '80342014af3b4e188d373cb9d304a803', '云豹国际货运', '云豹国际货运', 'int', '云豹国际货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (459, '80342014af3b4e188d373cb9d304a803', '云南中诚', '云南中诚', 'int', '云南中诚', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (460, '80342014af3b4e188d373cb9d304a803', '永昌物流', '永昌物流', 'int', '永昌物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (461, '80342014af3b4e188d373cb9d304a803', '优速通达', '优速通达', 'int', '优速通达', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (462, '80342014af3b4e188d373cb9d304a803', '优莎速运', '优莎速运', 'int', '优莎速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (463, '80342014af3b4e188d373cb9d304a803', '易客满', '易客满', 'int', '易客满', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (464, '80342014af3b4e188d373cb9d304a803', '英超物流', '英超物流', 'int', '英超物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (465, '80342014af3b4e188d373cb9d304a803', '远洋国际', '远洋国际', 'int', '远洋国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (466, '80342014af3b4e188d373cb9d304a803', '一号仓', '一号仓', 'int', '一号仓', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (467, '80342014af3b4e188d373cb9d304a803', '远成快运', '远成快运', 'int', '远成快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (468, '80342014af3b4e188d373cb9d304a803', '一号线', '一号线', 'int', '一号线', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (469, '80342014af3b4e188d373cb9d304a803', '壹品速递', '壹品速递', 'int', '壹品速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (470, '80342014af3b4e188d373cb9d304a803', '易达通快递', '易达通快递', 'int', '易达通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (471, '80342014af3b4e188d373cb9d304a803', '易优包裹', '易优包裹', 'int', '易优包裹', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (472, '80342014af3b4e188d373cb9d304a803', '韵丰物流', '韵丰物流', 'int', '韵丰物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (473, '80342014af3b4e188d373cb9d304a803', '驿扬国际速运', '驿扬国际速运', 'int', '驿扬国际速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (474, '80342014af3b4e188d373cb9d304a803', '韵达快运', '韵达快运', 'int', '韵达快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (475, '80342014af3b4e188d373cb9d304a803', '洋包裹', '洋包裹', 'int', '洋包裹', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (476, '80342014af3b4e188d373cb9d304a803', '优联吉运', '优联吉运', 'int', '优联吉运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (477, '80342014af3b4e188d373cb9d304a803', '优邦速运', '优邦速运', 'int', '优邦速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (478, '80342014af3b4e188d373cb9d304a803', '玥玛速运', '玥玛速运', 'int', '玥玛速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (479, '80342014af3b4e188d373cb9d304a803', '易转运', '易转运', 'int', '易转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (480, '80342014af3b4e188d373cb9d304a803', '一起送', '一起送', 'int', '一起送', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (481, '80342014af3b4e188d373cb9d304a803', '永邦国际物流', '永邦国际物流', 'int', '永邦国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (482, '80342014af3b4e188d373cb9d304a803', '易航物流', '易航物流', 'int', '易航物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (483, '80342014af3b4e188d373cb9d304a803', '一速递', '一速递', 'int', '一速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (484, '80342014af3b4e188d373cb9d304a803', '洋口岸', '洋口岸', 'int', '洋口岸', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (485, '80342014af3b4e188d373cb9d304a803', '优优速递', '优优速递', 'int', '优优速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (486, '80342014af3b4e188d373cb9d304a803', '易普递', '易普递', 'int', '易普递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (487, '80342014af3b4e188d373cb9d304a803', '雅澳物流', '雅澳物流', 'int', '雅澳物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (488, '80342014af3b4e188d373cb9d304a803', '易邮国际', '易邮国际', 'int', '易邮国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (489, '80342014af3b4e188d373cb9d304a803', '壹米滴答', '壹米滴答', 'int', '壹米滴答', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (490, '80342014af3b4e188d373cb9d304a803', '邮邦国际', '邮邦国际', 'int', '邮邦国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (491, '80342014af3b4e188d373cb9d304a803', '云邮跨境快递', '云邮跨境快递', 'int', '云邮跨境快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (492, '80342014af3b4e188d373cb9d304a803', '邮来速递', '邮来速递', 'int', '邮来速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (493, '80342014af3b4e188d373cb9d304a803', '易达国际速递', '易达国际速递', 'int', '易达国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (494, '80342014af3b4e188d373cb9d304a803', '一辉物流', '一辉物流', 'int', '一辉物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (495, '80342014af3b4e188d373cb9d304a803', '亚洲顺物流', '亚洲顺物流', 'int', '亚洲顺物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (496, '80342014af3b4e188d373cb9d304a803', '越中国际物流', '越中国际物流', 'int', '越中国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (497, '80342014af3b4e188d373cb9d304a803', '宇航通物流', '宇航通物流', 'int', '宇航通物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (498, '80342014af3b4e188d373cb9d304a803', '耀飞同城快递', '耀飞同城快递', 'int', '耀飞同城快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (499, '80342014af3b4e188d373cb9d304a803', 'YCG物流', 'YCG物流', 'int', 'YCG物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (500, '80342014af3b4e188d373cb9d304a803', '远航国际快运', '远航国际快运', 'int', '远航国际快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (501, '80342014af3b4e188d373cb9d304a803', '易邮速运', '易邮速运', 'int', '易邮速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (502, '80342014af3b4e188d373cb9d304a803', '优海国际速递', '优海国际速递', 'int', '优海国际速递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (503, '80342014af3b4e188d373cb9d304a803', '易达快运', '易达快运', 'int', '易达快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (504, '80342014af3b4e188d373cb9d304a803', '一智通', '一智通', 'int', '一智通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (505, '80342014af3b4e188d373cb9d304a803', '优拜物流', '优拜物流', 'int', '优拜物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (506, '80342014af3b4e188d373cb9d304a803', 'YDH', 'YDH', 'int', 'YDH', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (507, '80342014af3b4e188d373cb9d304a803', '宇捷通', '宇捷通', 'int', '宇捷通', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (508, '80342014af3b4e188d373cb9d304a803', '中通快递', '中通快递', 'int', '中通快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (509, '80342014af3b4e188d373cb9d304a803', '宅急送', '宅急送', 'int', '宅急送', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (510, '80342014af3b4e188d373cb9d304a803', '中远快运', '中远快运', 'int', '中远快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (511, '80342014af3b4e188d373cb9d304a803', '中铁物流', '中铁物流', 'int', '中铁物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (512, '80342014af3b4e188d373cb9d304a803', '中国东方(COE)', '中国东方(COE)', 'int', '中国东方(COE)', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (513, '80342014af3b4e188d373cb9d304a803', '中通国际', '中通国际', 'int', '中通国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (514, '80342014af3b4e188d373cb9d304a803', '中国邮政快递', '中国邮政快递', 'int', '中国邮政快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (515, '80342014af3b4e188d373cb9d304a803', '郑州建华', '郑州建华', 'int', '郑州建华', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (516, '80342014af3b4e188d373cb9d304a803', '中速快件', '中速快件', 'int', '中速快件', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (517, '80342014af3b4e188d373cb9d304a803', '郑州速捷', '郑州速捷', 'int', '郑州速捷', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (518, '80342014af3b4e188d373cb9d304a803', '众辉达物流', '众辉达物流', 'int', '众辉达物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (519, '80342014af3b4e188d373cb9d304a803', '转运四方', '转运四方', 'int', '转运四方', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (520, '80342014af3b4e188d373cb9d304a803', '卓志速运', '卓志速运', 'int', '卓志速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (521, '80342014af3b4e188d373cb9d304a803', '纵通速运', '纵通速运', 'int', '纵通速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (522, '80342014af3b4e188d373cb9d304a803', '直德邮', '直德邮', 'int', '直德邮', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (523, '80342014af3b4e188d373cb9d304a803', '中邮电商', '中邮电商', 'int', '中邮电商', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (524, '80342014af3b4e188d373cb9d304a803', '中骅物流', '中骅物流', 'int', '中骅物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (525, '80342014af3b4e188d373cb9d304a803', '中远e环球', '中远e环球', 'int', '中远e环球', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (526, '80342014af3b4e188d373cb9d304a803', '珠峰速运', '珠峰速运', 'int', '珠峰速运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (527, '80342014af3b4e188d373cb9d304a803', '中通快运', '中通快运', 'int', '中通快运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (528, '80342014af3b4e188d373cb9d304a803', '中翼国际物流', '中翼国际物流', 'int', '中翼国际物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (529, '80342014af3b4e188d373cb9d304a803', '中集冷云', '中集冷云', 'int', '中集冷云', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (530, '80342014af3b4e188d373cb9d304a803', '增速跨境', '增速跨境', 'int', '增速跨境', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (531, '80342014af3b4e188d373cb9d304a803', '众川国际', '众川国际', 'int', '众川国际', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (532, '80342014af3b4e188d373cb9d304a803', '中环转运', '中环转运', 'int', '中环转运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (533, '80342014af3b4e188d373cb9d304a803', '中环快递', '中环快递', 'int', '中环快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (534, '80342014af3b4e188d373cb9d304a803', '转运中国', '转运中国', 'int', '转运中国', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (535, '80342014af3b4e188d373cb9d304a803', '中骅物流', '中骅物流', 'int', '中骅物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (536, '80342014af3b4e188d373cb9d304a803', '志腾物流', '志腾物流', 'int', '志腾物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (537, '80342014af3b4e188d373cb9d304a803', '转瞬达集运', '转瞬达集运', 'int', '转瞬达集运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (538, '80342014af3b4e188d373cb9d304a803', '振捷国际货运', '振捷国际货运', 'int', '振捷国际货运', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (539, '80342014af3b4e188d373cb9d304a803', '中运全速', '中运全速', 'int', '中运全速', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (540, '80342014af3b4e188d373cb9d304a803', '正途供应链', '正途供应链', 'int', '正途供应链', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (541, '80342014af3b4e188d373cb9d304a803', '中欧物流', '中欧物流', 'int', '中欧物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (542, '80342014af3b4e188d373cb9d304a803', '众邮快递', '众邮快递', 'int', '众邮快递', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (543, '80342014af3b4e188d373cb9d304a803', '中强物流', '中强物流', 'int', '中强物流', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (544, '80342014af3b4e188d373cb9d304a803', '芝麻开门', '芝麻开门', 'int', '芝麻开门', '2020-10-06 15:29:31', NULL, NULL);
INSERT INTO `sys_dict_detail` VALUES (545, 'e125dd1ea41c4ada9f3fade186ba9fd3', '3', '待收货', 'int', '订单状态', '2020-10-06 16:12:18', '2020-10-06 16:17:41', '');
INSERT INTO `sys_dict_detail` VALUES (546, 'e125dd1ea41c4ada9f3fade186ba9fd3', '5', '交易成功', 'int', '订单状态', '2020-10-06 16:22:59', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (547, 'c71d1762ae1b409db8617298246acdbc', '1', '订单', 'int', '订单', '2020-10-24 19:53:10', '2020-10-24 19:53:27', '');
INSERT INTO `sys_dict_detail` VALUES (548, 'c71d1762ae1b409db8617298246acdbc', '2', '评价', 'int', '评价', '2020-10-24 19:54:21', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (549, 'c71d1762ae1b409db8617298246acdbc', '3', '订单取消返还', 'int', '订单取消返还', '2020-10-24 19:54:47', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (550, 'c71d1762ae1b409db8617298246acdbc', '4', '拒收返还', 'int', '拒收返还', '2020-10-24 19:55:04', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (551, '1cbd9e9d7e5948e5ae495b3dc3766529', '1', '产品存在质量问题', 'int', '退款原因', '2020-11-13 21:30:12', NULL, '');
INSERT INTO `sys_dict_detail` VALUES (552, '1cbd9e9d7e5948e5ae495b3dc3766529', '2', '多拍/错拍', 'int', '退款原因', '2020-11-13 21:31:14', NULL, '');

-- ----------------------------
-- Table structure for sys_dict_tree
-- ----------------------------
DROP TABLE IF EXISTS `sys_dict_tree`;
CREATE TABLE `sys_dict_tree`  (
  `dict_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '唯一标识',
  `dict_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '字典名称(0为顶级目录)',
  `parent_id` varchar(100) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '父id',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `update_time` datetime NULL DEFAULT NULL COMMENT '更新时间',
  `creator_id` bigint(20) NULL DEFAULT NULL COMMENT '创建人ID',
  `creator` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '创建人',
  `remark` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '备注',
  `
updator` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '更新人',
  `del` tinyint(255) NOT NULL DEFAULT 1 COMMENT '是否删除(1为正常,0为删除)',
  PRIMARY KEY (`dict_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_dict_tree
-- ----------------------------
INSERT INTO `sys_dict_tree` VALUES ('1cbd9e9d7e5948e5ae495b3dc3766529', '退款原因', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('47dc7e98decd4b919b9300e19f8e9725', '性别', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('58f61a8e35ea44e58754b38a56eef8cd', '是否上架', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('80342014af3b4e188d373cb9d304a803', '配送方式', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('afd35863cf814ac6b9204e9a357a572b', '默认', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('c71d1762ae1b409db8617298246acdbc', '积分来源', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('c71d1762ae1b409db8617298246acdbs', 'hi hi', 'd4e44f720b28401bb6e416f7a981d1f9', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('d4e44f720b28401bb6e416f7a981d1f1', '不合格', 'd4e44f720b28401bb6e416f7a981d1f3', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('d4e44f720b28401bb6e416f7a981d1f3', '是否热销', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('d4e44f720b28401bb6e416f7a981d1f9', '哈哈', 'd4e44f720b28401bb6e416f7a981d1f3', NULL, NULL, NULL, NULL, NULL, NULL, 1);
INSERT INTO `sys_dict_tree` VALUES ('e125dd1ea41c4ada9f3fade186ba9fd3', '订单状态', '0', NULL, NULL, NULL, NULL, NULL, NULL, 1);

-- ----------------------------
-- Table structure for sys_image
-- ----------------------------
DROP TABLE IF EXISTS `sys_image`;
CREATE TABLE `sys_image`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `img_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `img_url` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Table structure for sys_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL,
  `name` varchar(64) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `path` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `css` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sort` int(11) NOT NULL,
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  `is_menu` int(11) NULL DEFAULT NULL COMMENT '是否菜单 1 是 2 不是',
  `hidden` int(11) NULL DEFAULT NULL COMMENT '是否隐藏,0 false 1 true',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 139 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_menu
-- ----------------------------
INSERT INTO `sys_menu` VALUES (1, -1, '后台管理', 'javascript:;', '', 'iconfont icon-contacts-fill', 10, '2019-09-05 11:37:02', '2020-10-05 20:01:21', 1, 0);
INSERT INTO `sys_menu` VALUES (2, 1, '用户管理', '#!user', 'system/user.html', 'layui-icon-friends', 101, '2017-11-17 16:56:59', '2020-10-05 20:01:55', 1, 0);
INSERT INTO `sys_menu` VALUES (3, 1, '角色管理', '#!role', 'system/role.html', 'layui-icon-friends', 102, '2017-11-17 16:56:59', '2020-10-05 20:02:05', 1, 0);
INSERT INTO `sys_menu` VALUES (4, 1, '菜单管理', '#!menus', 'system/menus.html', 'layui-icon-menu-fill', 104, '2017-11-17 16:56:59', '2020-10-05 20:02:24', 1, 0);
INSERT INTO `sys_menu` VALUES (5, 1, '权限管理', '#!permissions', 'system/permissions.html', 'layui-icon-password', 103, '2017-11-17 16:56:59', '2020-10-05 20:02:13', 1, 0);
INSERT INTO `sys_menu` VALUES (6, 1, '我的信息', '#!myInfo', 'system/myInfo.html', '', 105, '2017-11-17 16:56:59', '2020-10-05 20:02:32', 1, 1);
INSERT INTO `sys_menu` VALUES (7, -1, '认证中心', 'javascript:;', '', 'iconfont icon-shield-line', 12, '2017-11-17 16:56:59', '2020-10-05 20:04:19', 1, 0);
INSERT INTO `sys_menu` VALUES (8, 7, '应用管理', '#!app', 'attestation/app.html', 'layui-icon-app', 122, '2017-11-17 16:56:59', '2020-10-05 20:04:37', 1, 0);
INSERT INTO `sys_menu` VALUES (9, 7, '服务管理', '#!services', 'attestation/services.html', 'layui-icon-website', 121, '2017-11-17 16:56:59', '2020-10-05 20:04:27', 1, 0);
INSERT INTO `sys_menu` VALUES (10, 7, '令牌管理', '#!token', 'attestation/token.html', 'layui-icon-util', 123, '2018-09-08 13:19:56', '2020-10-05 20:04:43', 1, 0);
INSERT INTO `sys_menu` VALUES (11, -1, '系统监控', 'javascript:;', '', 'iconfont icon-line-chart-line', 11, '2018-08-25 10:41:58', '2020-10-05 20:02:55', 1, 0);
INSERT INTO `sys_menu` VALUES (12, 11, '注册中心', '#!register', 'http://127.0.0.1:1111/', 'layui-icon-engine', 112, '2017-11-17 16:56:59', '2020-10-05 20:03:18', 1, 0);
INSERT INTO `sys_menu` VALUES (13, 11, '服务治理', '#!eureka', 'eureka/list.html', 'layui-icon-engine', 111, '2018-08-30 15:30:19', '2020-10-05 20:03:07', 1, 0);
INSERT INTO `sys_menu` VALUES (14, 11, '慢查询', '#!sql', 'system/sql.html', 'layui-icon-util', 115, '2017-11-17 16:56:59', '2020-10-05 20:03:45', 1, 0);
INSERT INTO `sys_menu` VALUES (15, 118, '文件中心', '#!files', 'files/files.html', 'layui-icon-file', 135, '2017-11-17 16:56:59', '2020-10-15 11:08:54', 1, 0);
INSERT INTO `sys_menu` VALUES (16, 11, '文档中心', '#!swagger', 'http://127.0.0.1:9200/swagger-ui.html', 'layui-icon-app', 113, '2017-11-17 16:56:59', '2020-10-05 20:03:29', 1, 0);
INSERT INTO `sys_menu` VALUES (17, 118, '代码生成器', '#!generator', 'generator/list.html', 'layui-icon-app', 133, '2018-09-05 13:43:06', '2020-10-05 20:05:21', 1, 0);
INSERT INTO `sys_menu` VALUES (18, 11, '日志中心', '#!log', 'system/log.html', 'layui-icon-engine', 116, '2019-03-11 06:30:01', '2020-10-05 20:03:52', 1, 0);
INSERT INTO `sys_menu` VALUES (19, 11, 'prometheus监控', '#!prometheus', 'http://127.0.0.1:9090', 'layui-icon-engine', 117, '2019-03-27 11:23:31', '2020-10-05 20:04:02', 1, 0);
INSERT INTO `sys_menu` VALUES (20, -1, '任务中心', 'javascript:;', '', 'iconfont icon-numbers-fill', 14, '2018-08-28 16:59:44', '2020-10-05 20:06:22', 1, 0);
INSERT INTO `sys_menu` VALUES (21, 20, '任务管理', '#!jobinfo', 'http://127.0.0.1:8888/jobinfo', 'layui-icon-senior', 141, '2018-08-28 17:02:00', '2020-10-05 20:06:32', 1, 0);
INSERT INTO `sys_menu` VALUES (22, 20, '调度日志', '#!joblog', 'http://127.0.0.1:8888/joblog', 'layui-icon-senior', 142, '2018-08-28 18:20:53', '2020-10-05 20:06:37', 1, 0);
INSERT INTO `sys_menu` VALUES (23, 20, '执行器管理', '#!jobgroup', 'http://127.0.0.1:8888/jobgroup', 'layui-icon-senior', 143, '2018-08-28 18:22:04', '2020-10-05 20:06:43', 1, 0);
INSERT INTO `sys_menu` VALUES (24, -1, '用户地图', '#!map', 'baiduMap/userMap.html', 'layui-icon-engine', 111111, '2019-06-14 21:28:54', '2019-06-14 21:28:54', 1, 0);
INSERT INTO `sys_menu` VALUES (25, -1, '路由管理', '#!route', 'route/route.html', 'layui-icon-engine', 111111, '2019-06-14 21:28:54', '2019-06-14 21:28:54', 1, 0);
INSERT INTO `sys_menu` VALUES (111, -1, '商品管理', 'javascript:;', '', 'iconfont icon-leaf-line', 1, '2020-09-11 11:18:11', '2020-10-05 19:58:04', 1, 0);
INSERT INTO `sys_menu` VALUES (112, 111, '商品分类', '#!goodsclassfiy', 'goods/classfiy.html', 'layui-icon-website', 11, '2020-09-11 11:21:28', '2020-10-05 19:58:00', 1, 0);
INSERT INTO `sys_menu` VALUES (113, 111, '品牌信息', '#!brandInfo', 'goods/brands.html', 'iconfont icon-medal-line', 12, '2020-09-12 23:25:27', '2020-10-05 19:58:31', 1, 0);
INSERT INTO `sys_menu` VALUES (114, 111, '商品信息', '#!goodsInfo', 'goods/goods.html', 'iconfont icon-bill-fill', 13, '2020-09-12 23:27:37', '2020-10-05 19:58:38', 1, 0);
INSERT INTO `sys_menu` VALUES (118, -1, '系统工具', 'javascropt:;', '', 'iconfont icon-hammer-fill', 13, '2020-09-16 10:08:10', '2020-10-05 20:04:55', 1, 0);
INSERT INTO `sys_menu` VALUES (119, 118, '图标库', '#!icon', '../assets/fonts/fonts_index.html', 'layui-icon-set', 134, '2020-09-16 10:13:23', '2020-10-05 20:05:28', 1, 0);
INSERT INTO `sys_menu` VALUES (120, 118, '数据字典', '#!dict', 'system/dict.html', 'iconfont icon-book-3-fill', 132, '2020-09-16 11:34:41', '2020-10-24 19:35:30', 1, 0);
INSERT INTO `sys_menu` VALUES (121, 118, '接口文档', '#!userdocx', 'http://127.0.0.1:7000/doc.html', 'iconfont icon-file-text-line', 131, '2020-09-21 15:37:23', '2020-10-05 20:05:04', 1, 0);
INSERT INTO `sys_menu` VALUES (122, -1, '订单管理', 'javascript:;', '', 'iconfont icon-numbers-fill', 2, '2020-10-05 19:39:33', '2020-10-05 19:58:50', 1, 0);
INSERT INTO `sys_menu` VALUES (123, 122, '交易订单', '#!order', 'order/order.html', 'iconfont icon-article-line', 22, '2020-10-05 19:41:55', '2020-10-05 19:59:14', 1, 0);
INSERT INTO `sys_menu` VALUES (124, 122, '购物车', '#!cart', 'order/cart.html', 'iconfont icon-shopping-cart-fill', 21, '2020-10-05 19:50:06', '2020-10-15 19:20:21', 1, 0);
INSERT INTO `sys_menu` VALUES (125, -1, '用户管理', 'javascript:;', '', 'iconfont icon-user-add-fill', 3, '2020-10-05 19:53:20', '2020-10-05 20:29:29', 1, 0);
INSERT INTO `sys_menu` VALUES (126, -1, '评价管理', 'javascript:;', '', 'iconfont icon-bar-chart-fill', 4, '2020-10-05 19:54:52', '2020-10-08 19:29:04', 1, 0);
INSERT INTO `sys_menu` VALUES (127, 125, '用户信息', '#!appUser', 'app/user.html', 'iconfont icon-user-line', 31, '2020-10-05 19:57:37', '2020-10-24 19:33:40', 1, 0);
INSERT INTO `sys_menu` VALUES (128, 126, '商品评价', '#!evaluate', 'app/evaluate.html', 'iconfont icon-flag-fill', 41, '2020-10-05 20:09:04', '2020-10-24 19:33:08', 1, 0);
INSERT INTO `sys_menu` VALUES (129, 125, '用户等级', '#!ranks', 'app/ranks.html', 'iconfont icon-medal-2-fill', 32, '2020-10-05 20:11:54', '2020-10-24 19:33:50', 1, 0);
INSERT INTO `sys_menu` VALUES (130, 126, '商品评分', '#!score', 'app/score.html', 'iconfont icon-star-s-fill', 42, '2020-10-05 20:13:42', '2020-10-24 19:33:18', 1, 0);
INSERT INTO `sys_menu` VALUES (131, 125, '用户积分', '#!scores', 'app/scores.html', 'iconfont icon-medal-line', 33, '2020-10-05 20:17:17', '2020-10-24 19:33:58', 1, 0);
INSERT INTO `sys_menu` VALUES (132, 125, '收货地址', '#!address', 'app/address.html', 'iconfont icon-lightbulb-fill', 34, '2020-10-05 20:18:09', '2020-10-24 19:34:05', 1, 0);
INSERT INTO `sys_menu` VALUES (133, 122, '快递查询', '#!kuaidi', 'order/kuaidi100.html', 'iconfont icon-search-2-line', 23, '2020-10-08 15:11:30', '2020-10-08 15:33:52', 1, 0);
INSERT INTO `sys_menu` VALUES (134, -1, '广告管理', 'javascript:;', '', 'iconfont icon-window-fill', 5, '2020-10-14 19:05:33', '2020-10-14 19:07:53', 1, 0);
INSERT INTO `sys_menu` VALUES (135, 134, '轮播管理', '#!swipper', 'app/swipper.html', 'iconfont icon-brush-2-fill', 51, '2020-10-14 19:06:56', '2020-10-24 19:34:12', 1, 0);
INSERT INTO `sys_menu` VALUES (136, -1, '支付管理', 'javascript:;', '', 'iconfont icon-spam-fill', 6, '2020-10-15 19:13:38', '2020-10-15 19:22:13', 1, 0);
INSERT INTO `sys_menu` VALUES (137, 136, '支付信息', '#!payInfo', 'app/payInfo.html', 'iconfont icon-bill-fill', 61, '2020-10-15 19:15:01', '2020-10-24 19:34:31', 1, 0);
INSERT INTO `sys_menu` VALUES (138, 122, '订单退款', '#!refund', 'order/refund.html', 'layui-icon-rmb', 24, '2020-11-08 11:48:26', '2020-11-08 12:41:35', 1, 0);

-- ----------------------------
-- Table structure for sys_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_permission`;
CREATE TABLE `sys_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `permission` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `permission`(`permission`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1307949122904403971 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_permission
-- ----------------------------
INSERT INTO `sys_permission` VALUES (1, 'permission:post/permissions', '保存权限标识', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (2, 'permission:put/permissions', '修改权限标识', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (3, 'permission:delete/permissions/{id}', '删除权限标识', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (4, 'permission:get/permissions', '查询权限标识', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (5, '/permissions/{roleId}/permissions', '查看角色权限', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (6, '/permissions/granted', '角色分配权限', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (7, 'role:post/roles', '添加角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (8, 'role:put/roles', '修改角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (9, 'role:delete/roles/{id}', '删除角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (10, 'role:post/roles/{id}/permissions', '给角色分配权限', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (11, 'role:get/roles', '查询角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (12, 'role:get/roles/{id}/permissions', '获取角色的权限', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (13, 'user:post/users/{id}/roles', '给用户分配角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (14, 'user:post/users/{id}/resetPassword', '用户重置密码', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (15, 'user:get/users', '用户查询', '2018-01-18 17:12:00', '2018-01-18 17:12:05');
INSERT INTO `sys_permission` VALUES (16, 'user:put/users/me', '修改用户', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (17, 'user:get/users/{id}/roles', '获取用户的角色', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (18, 'user:post/users/saveOrUpdate', '新增用户', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (19, 'user:post/users/exportUser', '导出用户', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (20, 'user:get/users/updateEnabled', '用户状态修改', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (21, 'user:put/users/password', '修改密码', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (22, 'menu:get/menus/all', '查询菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (23, 'menu:post/menus/granted', '给角色分配菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (24, 'menu:get/menus/tree', '树形显示', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (25, 'menu:get/menus/{roleId}/menus', '获取角色的菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (26, 'menu:post/menus', '添加菜单', '2018-01-18 17:06:39', '2018-09-04 07:35:29');
INSERT INTO `sys_permission` VALUES (27, 'menu:put/menus', '修改菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (28, 'menu:delete/menus/{id}', '删除菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (29, 'menu:get/menus/current', '当前用户菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (30, 'menu:get/menus/findAlls', '所有菜单', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (31, 'client:post/clients', '保存应用', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (32, 'client:get/clients', '应用列表', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (33, 'client:get/clients/{id}', '根据id获取应用', '2018-01-18 17:06:39', '2018-01-18 17:06:39');
INSERT INTO `sys_permission` VALUES (34, 'client:delete/clients', '删除应用', '2018-01-18 17:06:39', '2018-01-18 17:06:42');
INSERT INTO `sys_permission` VALUES (35, 'service:get/service/findAlls', '查询所有服务', '2018-01-18 17:06:39', '2018-09-03 08:05:09');
INSERT INTO `sys_permission` VALUES (36, 'service:get/service/findOnes', '服务树', '2018-01-18 17:06:39', '2018-09-08 03:23:28');
INSERT INTO `sys_permission` VALUES (37, 'menu:get/menus/findOnes', '获取菜单以及顶层菜单', '2019-05-09 23:48:13', '2019-05-09 23:48:13');
INSERT INTO `sys_permission` VALUES (38, 'permission:get/permissions/{roleId}/permissions', '根据roleId获取权限', '2019-05-10 00:02:23', '2019-05-10 00:02:23');
INSERT INTO `sys_permission` VALUES (39, 'file:query', '获取文件列表', '2019-05-17 21:34:05', '2019-05-17 21:34:08');
INSERT INTO `sys_permission` VALUES (40, 'file:del', '删除文件', '2019-05-17 21:36:46', '2019-05-17 21:36:48');
INSERT INTO `sys_permission` VALUES (1304826614059646978, 'brandstb:list', '获取全部商品信息列表', '2020-09-13 00:58:01', '2020-09-13 01:00:18');
INSERT INTO `sys_permission` VALUES (1304827324830597122, 'brandstb:save', '新增品牌信息结果', '2020-09-13 01:00:51', '2020-10-23 16:00:17');
INSERT INTO `sys_permission` VALUES (1304827516271214593, 'brandstb:update', '保存商品信息修改结果', '2020-09-13 01:01:37', '2020-09-15 18:23:57');
INSERT INTO `sys_permission` VALUES (1304827717270650881, 'brandstb:delete', '删除品牌信息记录', '2020-09-13 01:02:24', '2020-10-23 16:00:37');
INSERT INTO `sys_permission` VALUES (1307948924564156417, 'sys_dict:sysdict:lis', '查询字典信息', '2020-09-21 15:44:58', '2020-09-21 15:44:58');
INSERT INTO `sys_permission` VALUES (1307949011579187202, 'sys_dict:sysdict:sav', '保存字典信息', '2020-09-21 15:45:19', '2020-09-21 15:45:19');
INSERT INTO `sys_permission` VALUES (1307949063722774530, 'sys_dict:sysdict:upd', '修改字典信息', '2020-09-21 15:45:31', '2020-09-21 15:45:31');
INSERT INTO `sys_permission` VALUES (1307949122904403970, 'sys_dict:sysdict:del', '删除字典信息', '2020-09-21 15:45:46', '2020-09-21 15:45:46');

-- ----------------------------
-- Table structure for sys_role
-- ----------------------------
DROP TABLE IF EXISTS `sys_role`;
CREATE TABLE `sys_role`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `code` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色code',
  `name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '角色名',
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `code`(`code`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role
-- ----------------------------
INSERT INTO `sys_role` VALUES (1, 'ADMIN', '管理员', '2017-11-17 16:56:59', '2017-11-17 16:56:59');
INSERT INTO `sys_role` VALUES (3, 'user', '普通用户', '2019-03-27 02:52:00', '2019-03-27 02:52:00');
INSERT INTO `sys_role` VALUES (4, 'goods', '商品管理', '2020-09-11 11:11:55', '2020-09-11 11:11:55');
INSERT INTO `sys_role` VALUES (5, 'program', '开发人员', '2020-10-27 14:24:42', '2020-10-27 14:24:42');

-- ----------------------------
-- Table structure for sys_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_menu`;
CREATE TABLE `sys_role_menu`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` bigint(20) NOT NULL,
  `menu_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `role_id`(`role_id`, `menu_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 692 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_menu
-- ----------------------------
INSERT INTO `sys_role_menu` VALUES (646, 1, 1);
INSERT INTO `sys_role_menu` VALUES (647, 1, 2);
INSERT INTO `sys_role_menu` VALUES (649, 1, 3);
INSERT INTO `sys_role_menu` VALUES (651, 1, 4);
INSERT INTO `sys_role_menu` VALUES (652, 1, 5);
INSERT INTO `sys_role_menu` VALUES (654, 1, 6);
INSERT INTO `sys_role_menu` VALUES (656, 1, 7);
INSERT INTO `sys_role_menu` VALUES (658, 1, 8);
INSERT INTO `sys_role_menu` VALUES (660, 1, 9);
INSERT INTO `sys_role_menu` VALUES (662, 1, 10);
INSERT INTO `sys_role_menu` VALUES (663, 1, 11);
INSERT INTO `sys_role_menu` VALUES (664, 1, 12);
INSERT INTO `sys_role_menu` VALUES (665, 1, 13);
INSERT INTO `sys_role_menu` VALUES (666, 1, 14);
INSERT INTO `sys_role_menu` VALUES (667, 1, 15);
INSERT INTO `sys_role_menu` VALUES (668, 1, 16);
INSERT INTO `sys_role_menu` VALUES (669, 1, 17);
INSERT INTO `sys_role_menu` VALUES (670, 1, 18);
INSERT INTO `sys_role_menu` VALUES (671, 1, 19);
INSERT INTO `sys_role_menu` VALUES (672, 1, 20);
INSERT INTO `sys_role_menu` VALUES (673, 1, 21);
INSERT INTO `sys_role_menu` VALUES (674, 1, 22);
INSERT INTO `sys_role_menu` VALUES (675, 1, 23);
INSERT INTO `sys_role_menu` VALUES (676, 1, 24);
INSERT INTO `sys_role_menu` VALUES (677, 1, 25);
INSERT INTO `sys_role_menu` VALUES (678, 1, 111);
INSERT INTO `sys_role_menu` VALUES (679, 1, 112);
INSERT INTO `sys_role_menu` VALUES (680, 1, 113);
INSERT INTO `sys_role_menu` VALUES (681, 1, 114);
INSERT INTO `sys_role_menu` VALUES (682, 1, 118);
INSERT INTO `sys_role_menu` VALUES (683, 1, 119);
INSERT INTO `sys_role_menu` VALUES (684, 1, 120);
INSERT INTO `sys_role_menu` VALUES (685, 1, 121);
INSERT INTO `sys_role_menu` VALUES (686, 1, 122);
INSERT INTO `sys_role_menu` VALUES (687, 1, 123);
INSERT INTO `sys_role_menu` VALUES (688, 1, 124);
INSERT INTO `sys_role_menu` VALUES (689, 1, 125);
INSERT INTO `sys_role_menu` VALUES (690, 1, 126);
INSERT INTO `sys_role_menu` VALUES (691, 1, 127);
INSERT INTO `sys_role_menu` VALUES (644, 1, 128);
INSERT INTO `sys_role_menu` VALUES (645, 1, 129);
INSERT INTO `sys_role_menu` VALUES (648, 1, 131);
INSERT INTO `sys_role_menu` VALUES (650, 1, 132);
INSERT INTO `sys_role_menu` VALUES (653, 1, 134);
INSERT INTO `sys_role_menu` VALUES (655, 1, 135);
INSERT INTO `sys_role_menu` VALUES (657, 1, 136);
INSERT INTO `sys_role_menu` VALUES (659, 1, 137);
INSERT INTO `sys_role_menu` VALUES (661, 1, 138);
INSERT INTO `sys_role_menu` VALUES (362, 3, 1);
INSERT INTO `sys_role_menu` VALUES (363, 3, 6);
INSERT INTO `sys_role_menu` VALUES (631, 4, 111);
INSERT INTO `sys_role_menu` VALUES (632, 4, 112);
INSERT INTO `sys_role_menu` VALUES (633, 4, 113);
INSERT INTO `sys_role_menu` VALUES (634, 4, 114);
INSERT INTO `sys_role_menu` VALUES (635, 4, 118);
INSERT INTO `sys_role_menu` VALUES (636, 4, 119);
INSERT INTO `sys_role_menu` VALUES (637, 4, 121);
INSERT INTO `sys_role_menu` VALUES (638, 4, 122);
INSERT INTO `sys_role_menu` VALUES (639, 4, 123);
INSERT INTO `sys_role_menu` VALUES (640, 4, 124);
INSERT INTO `sys_role_menu` VALUES (641, 4, 125);
INSERT INTO `sys_role_menu` VALUES (642, 4, 126);
INSERT INTO `sys_role_menu` VALUES (643, 4, 127);
INSERT INTO `sys_role_menu` VALUES (622, 4, 128);
INSERT INTO `sys_role_menu` VALUES (623, 4, 129);
INSERT INTO `sys_role_menu` VALUES (624, 4, 131);
INSERT INTO `sys_role_menu` VALUES (625, 4, 132);
INSERT INTO `sys_role_menu` VALUES (626, 4, 134);
INSERT INTO `sys_role_menu` VALUES (627, 4, 135);
INSERT INTO `sys_role_menu` VALUES (628, 4, 136);
INSERT INTO `sys_role_menu` VALUES (629, 4, 137);
INSERT INTO `sys_role_menu` VALUES (630, 4, 138);
INSERT INTO `sys_role_menu` VALUES (621, 5, 15);
INSERT INTO `sys_role_menu` VALUES (614, 5, 17);
INSERT INTO `sys_role_menu` VALUES (616, 5, 118);
INSERT INTO `sys_role_menu` VALUES (617, 5, 119);
INSERT INTO `sys_role_menu` VALUES (618, 5, 120);
INSERT INTO `sys_role_menu` VALUES (619, 5, 121);
INSERT INTO `sys_role_menu` VALUES (620, 5, 125);
INSERT INTO `sys_role_menu` VALUES (615, 5, 132);

-- ----------------------------
-- Table structure for sys_role_permission
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_permission`;
CREATE TABLE `sys_role_permission`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `permission_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `role_id`(`role_id`, `permission_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 333 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_permission
-- ----------------------------
INSERT INTO `sys_role_permission` VALUES (237, 1, 1);
INSERT INTO `sys_role_permission` VALUES (238, 1, 2);
INSERT INTO `sys_role_permission` VALUES (239, 1, 3);
INSERT INTO `sys_role_permission` VALUES (240, 1, 4);
INSERT INTO `sys_role_permission` VALUES (241, 1, 5);
INSERT INTO `sys_role_permission` VALUES (242, 1, 6);
INSERT INTO `sys_role_permission` VALUES (243, 1, 7);
INSERT INTO `sys_role_permission` VALUES (244, 1, 8);
INSERT INTO `sys_role_permission` VALUES (245, 1, 9);
INSERT INTO `sys_role_permission` VALUES (246, 1, 10);
INSERT INTO `sys_role_permission` VALUES (247, 1, 11);
INSERT INTO `sys_role_permission` VALUES (248, 1, 12);
INSERT INTO `sys_role_permission` VALUES (249, 1, 13);
INSERT INTO `sys_role_permission` VALUES (250, 1, 14);
INSERT INTO `sys_role_permission` VALUES (251, 1, 15);
INSERT INTO `sys_role_permission` VALUES (253, 1, 16);
INSERT INTO `sys_role_permission` VALUES (254, 1, 17);
INSERT INTO `sys_role_permission` VALUES (255, 1, 18);
INSERT INTO `sys_role_permission` VALUES (256, 1, 19);
INSERT INTO `sys_role_permission` VALUES (257, 1, 20);
INSERT INTO `sys_role_permission` VALUES (258, 1, 21);
INSERT INTO `sys_role_permission` VALUES (260, 1, 22);
INSERT INTO `sys_role_permission` VALUES (261, 1, 23);
INSERT INTO `sys_role_permission` VALUES (262, 1, 24);
INSERT INTO `sys_role_permission` VALUES (263, 1, 25);
INSERT INTO `sys_role_permission` VALUES (265, 1, 26);
INSERT INTO `sys_role_permission` VALUES (266, 1, 27);
INSERT INTO `sys_role_permission` VALUES (267, 1, 28);
INSERT INTO `sys_role_permission` VALUES (268, 1, 29);
INSERT INTO `sys_role_permission` VALUES (269, 1, 30);
INSERT INTO `sys_role_permission` VALUES (270, 1, 31);
INSERT INTO `sys_role_permission` VALUES (271, 1, 32);
INSERT INTO `sys_role_permission` VALUES (272, 1, 33);
INSERT INTO `sys_role_permission` VALUES (273, 1, 34);
INSERT INTO `sys_role_permission` VALUES (274, 1, 35);
INSERT INTO `sys_role_permission` VALUES (275, 1, 36);
INSERT INTO `sys_role_permission` VALUES (276, 1, 37);
INSERT INTO `sys_role_permission` VALUES (277, 1, 38);
INSERT INTO `sys_role_permission` VALUES (278, 1, 39);
INSERT INTO `sys_role_permission` VALUES (280, 1, 40);
INSERT INTO `sys_role_permission` VALUES (283, 1, 1304826614059646978);
INSERT INTO `sys_role_permission` VALUES (252, 1, 1304827324830597122);
INSERT INTO `sys_role_permission` VALUES (281, 1, 1304827516271214593);
INSERT INTO `sys_role_permission` VALUES (284, 1, 1304827717270650881);
INSERT INTO `sys_role_permission` VALUES (282, 1, 1307948924564156417);
INSERT INTO `sys_role_permission` VALUES (259, 1, 1307949011579187202);
INSERT INTO `sys_role_permission` VALUES (264, 1, 1307949063722774530);
INSERT INTO `sys_role_permission` VALUES (279, 1, 1307949122904403970);
INSERT INTO `sys_role_permission` VALUES (230, 3, 1);
INSERT INTO `sys_role_permission` VALUES (231, 3, 2);
INSERT INTO `sys_role_permission` VALUES (232, 3, 3);
INSERT INTO `sys_role_permission` VALUES (234, 3, 4);
INSERT INTO `sys_role_permission` VALUES (233, 3, 20);
INSERT INTO `sys_role_permission` VALUES (235, 3, 21);
INSERT INTO `sys_role_permission` VALUES (236, 3, 22);
INSERT INTO `sys_role_permission` VALUES (64, 4, 21);
INSERT INTO `sys_role_permission` VALUES (65, 4, 22);
INSERT INTO `sys_role_permission` VALUES (67, 4, 25);
INSERT INTO `sys_role_permission` VALUES (70, 4, 29);
INSERT INTO `sys_role_permission` VALUES (63, 4, 35);
INSERT INTO `sys_role_permission` VALUES (66, 4, 39);
INSERT INTO `sys_role_permission` VALUES (69, 4, 1304826614059646978);
INSERT INTO `sys_role_permission` VALUES (62, 4, 1304827324830597122);
INSERT INTO `sys_role_permission` VALUES (68, 4, 1304827516271214593);
INSERT INTO `sys_role_permission` VALUES (71, 4, 1304827717270650881);
INSERT INTO `sys_role_permission` VALUES (285, 5, 1);
INSERT INTO `sys_role_permission` VALUES (286, 5, 2);
INSERT INTO `sys_role_permission` VALUES (287, 5, 3);
INSERT INTO `sys_role_permission` VALUES (288, 5, 4);
INSERT INTO `sys_role_permission` VALUES (289, 5, 5);
INSERT INTO `sys_role_permission` VALUES (290, 5, 6);
INSERT INTO `sys_role_permission` VALUES (291, 5, 7);
INSERT INTO `sys_role_permission` VALUES (292, 5, 8);
INSERT INTO `sys_role_permission` VALUES (293, 5, 9);
INSERT INTO `sys_role_permission` VALUES (294, 5, 10);
INSERT INTO `sys_role_permission` VALUES (295, 5, 11);
INSERT INTO `sys_role_permission` VALUES (296, 5, 12);
INSERT INTO `sys_role_permission` VALUES (297, 5, 13);
INSERT INTO `sys_role_permission` VALUES (298, 5, 14);
INSERT INTO `sys_role_permission` VALUES (299, 5, 15);
INSERT INTO `sys_role_permission` VALUES (301, 5, 16);
INSERT INTO `sys_role_permission` VALUES (302, 5, 17);
INSERT INTO `sys_role_permission` VALUES (303, 5, 18);
INSERT INTO `sys_role_permission` VALUES (304, 5, 19);
INSERT INTO `sys_role_permission` VALUES (305, 5, 20);
INSERT INTO `sys_role_permission` VALUES (306, 5, 21);
INSERT INTO `sys_role_permission` VALUES (308, 5, 22);
INSERT INTO `sys_role_permission` VALUES (309, 5, 23);
INSERT INTO `sys_role_permission` VALUES (310, 5, 24);
INSERT INTO `sys_role_permission` VALUES (311, 5, 25);
INSERT INTO `sys_role_permission` VALUES (313, 5, 26);
INSERT INTO `sys_role_permission` VALUES (314, 5, 27);
INSERT INTO `sys_role_permission` VALUES (315, 5, 28);
INSERT INTO `sys_role_permission` VALUES (316, 5, 29);
INSERT INTO `sys_role_permission` VALUES (317, 5, 30);
INSERT INTO `sys_role_permission` VALUES (318, 5, 31);
INSERT INTO `sys_role_permission` VALUES (319, 5, 32);
INSERT INTO `sys_role_permission` VALUES (320, 5, 33);
INSERT INTO `sys_role_permission` VALUES (321, 5, 34);
INSERT INTO `sys_role_permission` VALUES (322, 5, 35);
INSERT INTO `sys_role_permission` VALUES (323, 5, 36);
INSERT INTO `sys_role_permission` VALUES (324, 5, 37);
INSERT INTO `sys_role_permission` VALUES (325, 5, 38);
INSERT INTO `sys_role_permission` VALUES (326, 5, 39);
INSERT INTO `sys_role_permission` VALUES (328, 5, 40);
INSERT INTO `sys_role_permission` VALUES (331, 5, 1304826614059646978);
INSERT INTO `sys_role_permission` VALUES (300, 5, 1304827324830597122);
INSERT INTO `sys_role_permission` VALUES (329, 5, 1304827516271214593);
INSERT INTO `sys_role_permission` VALUES (332, 5, 1304827717270650881);
INSERT INTO `sys_role_permission` VALUES (330, 5, 1307948924564156417);
INSERT INTO `sys_role_permission` VALUES (307, 5, 1307949011579187202);
INSERT INTO `sys_role_permission` VALUES (312, 5, 1307949063722774530);
INSERT INTO `sys_role_permission` VALUES (327, 5, 1307949122904403970);

-- ----------------------------
-- Table structure for sys_role_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_role_user`;
CREATE TABLE `sys_role_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `user_id` bigint(20) NOT NULL,
  `role_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `user_id`(`user_id`, `role_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 30 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_role_user
-- ----------------------------
INSERT INTO `sys_role_user` VALUES (4, 1275397643669949952, 1);
INSERT INTO `sys_role_user` VALUES (3, 1277056689447719936, 1);
INSERT INTO `sys_role_user` VALUES (2, 1277120261867529984, 1);
INSERT INTO `sys_role_user` VALUES (17, 1277137734524300032, 1);
INSERT INTO `sys_role_user` VALUES (18, 1277137734524300032, 4);
INSERT INTO `sys_role_user` VALUES (27, 1304255016814530562, 3);
INSERT INTO `sys_role_user` VALUES (26, 1304255016814530562, 4);
INSERT INTO `sys_role_user` VALUES (28, 1317076388037058561, 3);
INSERT INTO `sys_role_user` VALUES (29, 1320974805761748994, 5);

-- ----------------------------
-- Table structure for sys_user
-- ----------------------------
DROP TABLE IF EXISTS `sys_user`;
CREATE TABLE `sys_user`  (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `password` varchar(60) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `nick_name` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `head_img_url` varchar(1024) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL,
  `sex` tinyint(1) NULL DEFAULT NULL,
  `enabled` tinyint(1) NOT NULL DEFAULT 1,
  `type` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL,
  `create_time` datetime NULL,
  `update_time` datetime NULL,
  PRIMARY KEY (`id`) USING BTREE,
  UNIQUE INDEX `username`(`username`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1320974805761748995 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of sys_user
-- ----------------------------
INSERT INTO `sys_user` VALUES (1277137734524300032, 'admin', '$2a$10$MNEFy8s7V6IO9ic1aEZJa.q3XZRiWEziZRhiKuYbGaWkDa62HQE46', '管理员', 'http://127.0.0.1:9200/api-file/statics/2020/12/28/414b14825780978df8695ac9eac7bc52.jpg', '13106975707', 1, 1, 'BACKEND', '2017-11-17 16:56:59', '2020-12-28 17:26:36');
INSERT INTO `sys_user` VALUES (1304255016814530562, 'user1', '$2a$10$OdxLT9o6nW/HfACj7V9tjuFoTEy5J8Gad2Y/ir3S00J3aErdSU9WK', '商品管理员', 'https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1601896443187&di=92f681fbe0e07749c6418b325838bc2e&imgtype=0&src=http%3A%2F%2Fpic1.win4000.com%2Fwallpaper%2F3%2F537d8f04c30cb.jpg', '15875461246', 0, 1, 'BACKEND', '2020-09-11 11:06:42', '2020-10-05 17:25:26');
INSERT INTO `sys_user` VALUES (1317076388037058561, 'user2', '$2a$10$au1oi1sIcvDnxFyceY6hoeZVM.c30q26JBK.lX.bkK4CbjiuZgedi', '吴彦祖', 'http://192.168.0.187:9200/api-file/statics/2020/10/16/377b6109ee1ea729fc51bf12e5928e89.jfif', '15741246352', 0, 1, 'BACKEND', '2020-10-16 20:14:15', '2020-12-25 17:33:51');
INSERT INTO `sys_user` VALUES (1320974805761748994, 'wudalong', '$2a$10$y5YK1Cmj4X09xak8cd07k.Qp9ZMAMACa73NcOivkG71AxxM6f6ELa', '吴大龙', NULL, '15245648464', 0, 1, 'BACKEND', '2020-10-27 14:25:10', '2020-12-25 17:33:49');

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户编号',
  `open_id` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '唯一标识',
  `user_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户名',
  `user_gender` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '性别',
  `user_city` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '国家',
  `user_birthday` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '生日',
  `user_country` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '城市',
  `user_province` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '省份',
  `user_avatarUrl` varchar(500) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '用户头像',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  `data_flag` int(10) NULL DEFAULT 1 COMMENT '删除标志1：有效0：无效',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (2, 'f8e31fb464cc4c90a7e0e1105a463efe', 'oRrdQt7jyvM-h2O5GKr4gUMl6cTw', '一条小青瓜', '1', '', '', '', '', 'https://thirdwx.qlogo.cn/mmopen/vi_32/Q3auHgzwzM4M6vUAH9BEOzRicwXWFPH6MicjJAqOtZJj74ZSuZhBH5UMHkWsgWI0t10kuuodsHibNKBlj8jPlO7jQ/132', '2020-10-28 21:13:44', 1);
INSERT INTO `user` VALUES (4, 'f2e5b1730f3543c780d03234e8e38b62', 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', '风飘洋', '1', '', '', '波兰', '', 'https://thirdwx.qlogo.cn/mmopen/vi_32/5GVmsTMpibibSUKmCKWVIxMUmwYrSiclrfSial2ZdibhCWib9oHPv2zAh3H2NPBB3NmhLjxXUiamcnjSrkgf4Wq8bXliaA/132', '2020-11-01 12:31:59', 1);
INSERT INTO `user` VALUES (5, '59108dd9da0a4b359a3c44edb8698427', 'oRrdQt9VTBJGyWb2lmv4_blNEMsE', '京电代购小助手', '2', '', NULL, '阿拉伯联合酋长国', '阿布扎比', 'https://thirdwx.qlogo.cn/mmopen/vi_32/szfvsNia1yHEM5hGgf9pShuNziclJlVmsHVmO70tH4IMSicqWcFWhBGAzsTZX4pGqqqHS2d5Xb0Qg4wib1KdU41LibQ/132', '2020-11-01 12:32:03', 1);

-- ----------------------------
-- Table structure for user_address
-- ----------------------------
DROP TABLE IF EXISTS `user_address`;
CREATE TABLE `user_address`  (
  `address_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '用户编号',
  `user_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '收件人',
  `user_phone` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '联系方式',
  `province` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '省/直辖市/特别行政区',
  `city` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '城市',
  `area` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '区县',
  `twon` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '乡镇街道',
  `address` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NOT NULL COMMENT '详细地址',
  `isDefault` tinyint(4) NOT NULL DEFAULT 0 COMMENT '是否默认有效地址(0:否 1:是)',
  `data_flag` tinyint(4) NOT NULL DEFAULT 1 COMMENT '有效状态(1:有效 0:无效)',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`address_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 23 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_address
-- ----------------------------
INSERT INTO `user_address` VALUES (14, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', '宋燕飞', '15746646466', '山西省', '太原市', '市辖区', '哈哈哈哈哈', '哈哈哈哈哈', 1, 1, '2020-11-01 11:57:35');
INSERT INTO `user_address` VALUES (19, 'oRrdQt9VTBJGyWb2lmv4_blNEMsE', '刘备', '17643764949', '天津市', '市辖区', '河西区', '长安街', '捷哥胡同101号', 0, 1, '2020-11-02 14:21:45');
INSERT INTO `user_address` VALUES (20, 'oRrdQt7jyvM-h2O5GKr4gUMl6cTw', '用户1', '15634676766', '天津市', '市辖区', '和平区', '哈哈哈哈', '哈哈哈', 0, 1, '2020-11-02 19:32:52');
INSERT INTO `user_address` VALUES (21, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', '巧克力', '15366676999', '山东省', '济南市', '历下区', '来来来', '啦啦啦啦回来就好理解理解啦啦啦如果从就投特地可口啊咯额咯阿兰帮办卡啦具体时间长点啊咯了啊咯阿拉额咯啊老了不打了侧门考虑突突突', 0, 1, '2020-11-17 16:51:54');
INSERT INTO `user_address` VALUES (22, 'oRrdQt7Z67gvkhpWcAqElRBzyaK8', '今年', '17643316331', '北京市', '市辖区', '东城区', '明年', '明末', 0, 1, '2020-11-17 17:34:01');

-- ----------------------------
-- Table structure for user_ranks
-- ----------------------------
DROP TABLE IF EXISTS `user_ranks`;
CREATE TABLE `user_ranks`  (
  `rank_id` int(11) NOT NULL AUTO_INCREMENT COMMENT '自增ID',
  `rank_name` varchar(20) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '等级名称',
  `start_score` int(11) NULL DEFAULT 0 COMMENT '开始积分(大于开始积分)',
  `end_score` int(11) NULL DEFAULT 0 COMMENT '结束积分(包含开始积分)',
  `rebate` int(11) NULL DEFAULT 100 COMMENT '折扣',
  `userrank_img` varchar(150) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT NULL COMMENT '等级图标',
  `dataFlag` tinyint(4) NULL DEFAULT 1 COMMENT '删除标志(-1:删除 1:有效)',
  `createTime` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`rank_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 8 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_ranks
-- ----------------------------
INSERT INTO `user_ranks` VALUES (1, '普通会员', 0, 1000, 1, 'http://192.168.0.187:9200/api-file/statics/2020/10/15/3788e6c1e7baa60d62492ba72149499f.jpg', 1, '2020-10-09 14:57:50');
INSERT INTO `user_ranks` VALUES (2, '铜牌会员', 1000, 2000, 950, 'http://192.168.0.187:9200/api-file/statics/2020/10/13/ef1264b962d2f8f028d8d890f17ace09.png', 1, NULL);
INSERT INTO `user_ranks` VALUES (3, '银牌会员', 2000, 3000, 900, 'http://192.168.0.187:9200/api-file/statics/2020/10/13/a8acaf419e4ef2ddb5e9a1cabeae8197.png', 1, '2020-10-13 23:06:12');
INSERT INTO `user_ranks` VALUES (4, '钻石会员', 100, 200, 500, 'http://192.168.0.187:9200/api-file/statics/2020/10/22/d5a491cd3d8d071e3212c3478e8e35a1.jpg', 1, '2020-10-22 19:56:54');
INSERT INTO `user_ranks` VALUES (5, '', NULL, NULL, NULL, '', 0, '2020-10-22 19:58:24');
INSERT INTO `user_ranks` VALUES (6, '1', 0, 1, NULL, '', 1, '2020-10-24 19:29:26');
INSERT INTO `user_ranks` VALUES (7, '123', 10000, 22, 120, '', 1, '2020-10-27 21:53:27');

-- ----------------------------
-- Table structure for user_scores
-- ----------------------------
DROP TABLE IF EXISTS `user_scores`;
CREATE TABLE `user_scores`  (
  `score_id` int(11) NOT NULL AUTO_INCREMENT,
  `user_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '用户编号',
  `score` int(11) NULL DEFAULT 0 COMMENT '积分数',
  `change` int(11) NULL DEFAULT 0 COMMENT '积分变化',
  `data_src` int(11) NULL DEFAULT 0 COMMENT '来源(1:订单 2:评价 3:订单取消返还 4:拒收返还)',
  `data_id` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL DEFAULT '0' COMMENT '来源记录ID',
  `remarks` text CHARACTER SET utf8mb4 COLLATE utf8mb4_general_ci NULL COMMENT '描述',
  `score_type` int(11) NOT NULL DEFAULT 0 COMMENT '积分标识(1:收入 2:支出)',
  `create_time` datetime NULL DEFAULT NULL COMMENT '创建时间',
  PRIMARY KEY (`score_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 14 CHARACTER SET = utf8mb4 COLLATE = utf8mb4_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of user_scores
-- ----------------------------
INSERT INTO `user_scores` VALUES (3, '111', 50, NULL, 0, '213123', '兑换礼品', 0, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (4, '112', 90, 1, 1, '213123', '兑换优惠卷', 1, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (5, '111', 100, 1, 4, '213123', '', 0, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (6, '112', 100, 1, 4, '213123', '1111', 1, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (7, '117', 100, 1, 3, '213123', '1111', 0, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (8, '116', 100, 1, 2, '213123', '1111', 0, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (9, '114', 100, 1, 4, '213123', '1111', 1, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (10, '114', 100, 1, 3, '213123', '1111', 0, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (11, '111', 100, 1, 4, '213123', '1111', 1, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (12, '111', 100, 1, 4, '213123', '1111', 1, '2020-10-09 14:54:26');
INSERT INTO `user_scores` VALUES (13, '0', 0, 0, 0, '0', NULL, 0, NULL);

SET FOREIGN_KEY_CHECKS = 1;
