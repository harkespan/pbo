/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MariaDB
 Source Server Version : 100136
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MariaDB
 Target Server Version : 100136
 File Encoding         : 65001

 Date: 27/06/2021 22:22:48
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for sewabuku
-- ----------------------------
DROP TABLE IF EXISTS `sewabuku`;
CREATE TABLE `sewabuku`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `judul` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tanggal_pinjam` date NOT NULL,
  `tanggal_harus_kembali` date NULL DEFAULT NULL,
  `tanggal_kembali` date NULL DEFAULT NULL,
  `denda` int(11) NULL DEFAULT NULL,
  `biaya_sewa` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
