/*
 Navicat Premium Data Transfer

 Source Server         : newlocal
 Source Server Type    : MySQL
 Source Server Version : 50733
 Source Host           : localhost:3306
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50733
 File Encoding         : 65001

 Date: 04/07/2022 19:01:54
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for buku
-- ----------------------------
DROP TABLE IF EXISTS `buku`;
CREATE TABLE `buku`  (
  `buku_id` int(11) NOT NULL AUTO_INCREMENT,
  `judul_buku` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `pengarang` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `penerbit` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `tahun_terbit` int(4) NOT NULL,
  `status` tinyint(1) NOT NULL DEFAULT 0 COMMENT '0 = not available, 1 = available',
  PRIMARY KEY (`buku_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for sewabuku
-- ----------------------------
DROP TABLE IF EXISTS `sewabuku`;
CREATE TABLE `sewabuku`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nama_peminjam` varchar(255) CHARACTER SET latin1 COLLATE latin1_swedish_ci NOT NULL,
  `buku_id` int(11) NOT NULL,
  `tanggal_pinjam` date NOT NULL,
  `tanggal_harus_kembali` date NULL DEFAULT NULL,
  `tanggal_kembali` date NULL DEFAULT NULL,
  `denda` int(11) NULL DEFAULT NULL,
  `biaya_sewa` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1 CHARACTER SET = latin1 COLLATE = latin1_swedish_ci ROW_FORMAT = Compact;

SET FOREIGN_KEY_CHECKS = 1;
