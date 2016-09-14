/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50159
Source Host           : localhost:3306
Source Database       : sharesdata

Target Server Type    : MYSQL
Target Server Version : 50159
File Encoding         : 65001

Date: 2016-09-14 16:52:24
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for shares_list
-- ----------------------------
DROP TABLE IF EXISTS `shares_list`;
CREATE TABLE `shares_list` (
  `symbol` varchar(20) NOT NULL COMMENT '代码',
  `name` varchar(50) DEFAULT NULL COMMENT '名称',
  `trade` varchar(20) DEFAULT NULL COMMENT '最新价',
  `pricechange` varchar(20) DEFAULT NULL COMMENT '涨跌额',
  `changepercent` varchar(20) DEFAULT NULL COMMENT '涨跌幅',
  `buy` varchar(20) DEFAULT NULL COMMENT '买入价',
  `sell` varchar(20) DEFAULT NULL COMMENT '卖出价',
  `settlement` varchar(20) DEFAULT NULL COMMENT '昨收',
  `open` varchar(20) DEFAULT NULL COMMENT '今开',
  `high` varchar(20) DEFAULT NULL COMMENT '最高',
  `low` varchar(20) DEFAULT NULL COMMENT '最低',
  `volume` varchar(20) DEFAULT NULL COMMENT '成交量',
  `amount` varchar(20) DEFAULT NULL COMMENT '成交额',
  `code` varchar(50) DEFAULT NULL COMMENT '简码',
  `ticktime` varchar(50) DEFAULT NULL COMMENT '时间',
  PRIMARY KEY (`symbol`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
