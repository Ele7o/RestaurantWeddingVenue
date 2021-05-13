-- MySQL dump 10.13  Distrib 8.0.24, for Win64 (x86_64)
--
-- Host: 127.0.0.1    Database: nhahangdb
-- ------------------------------------------------------
-- Server version	8.0.24

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `dich_vu`
--

DROP TABLE IF EXISTS `dich_vu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `dich_vu` (
  `id_dich_vu` int NOT NULL AUTO_INCREMENT,
  `ten_dich_vu` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `gia` double NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_dich_vu`)
) ENGINE=InnoDB AUTO_INCREMENT=35 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dich_vu`
--

LOCK TABLES `dich_vu` WRITE;
/*!40000 ALTER TABLE `dich_vu` DISABLE KEYS */;
INSERT INTO `dich_vu` VALUES (2,'ban',100000,NULL),(3,'ghe',500000,NULL);
/*!40000 ALTER TABLE `dich_vu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `don_hang`
--

DROP TABLE IF EXISTS `don_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `don_hang` (
  `id_don_hang` int NOT NULL AUTO_INCREMENT,
  `id_khach_hang` int NOT NULL,
  `id_sanh` int NOT NULL,
  `ngay_to_chuc` date NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_don_hang`),
  KEY `id_khach_hang_idx` (`id_khach_hang`),
  KEY `id_sanh_idx` (`id_sanh`),
  CONSTRAINT `id_khach_hang` FOREIGN KEY (`id_khach_hang`) REFERENCES `khach_hang` (`id_khach_hang`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `id_sanh` FOREIGN KEY (`id_sanh`) REFERENCES `sanh` (`id_sanh`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `don_hang`
--

LOCK TABLES `don_hang` WRITE;
/*!40000 ALTER TABLE `don_hang` DISABLE KEYS */;
INSERT INTO `don_hang` VALUES (7,2,4,'2021-05-13',''),(8,3,24,'2021-05-21',''),(9,5,24,'2021-05-29','');
/*!40000 ALTER TABLE `don_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `donhang_dichvu`
--

DROP TABLE IF EXISTS `donhang_dichvu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `donhang_dichvu` (
  `id_dh_dv` int NOT NULL AUTO_INCREMENT,
  `id_don_hang` int NOT NULL,
  `id_dich_vu` int NOT NULL,
  `so_luong` int NOT NULL,
  `tam_tinh` double NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_dh_dv`),
  KEY `id_dich_vu_dh_idx` (`id_dich_vu`),
  KEY `id_don_hang_dv` (`id_don_hang`),
  CONSTRAINT `id_dich_vu_dh` FOREIGN KEY (`id_dich_vu`) REFERENCES `dich_vu` (`id_dich_vu`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `id_don_hang_dv` FOREIGN KEY (`id_don_hang`) REFERENCES `don_hang` (`id_don_hang`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `donhang_dichvu`
--

LOCK TABLES `donhang_dichvu` WRITE;
/*!40000 ALTER TABLE `donhang_dichvu` DISABLE KEYS */;
INSERT INTO `donhang_dichvu` VALUES (5,7,2,0,0,''),(6,7,3,0,0,''),(7,8,3,0,0,''),(8,9,3,0,0,'');
/*!40000 ALTER TABLE `donhang_dichvu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `khach_hang`
--

DROP TABLE IF EXISTS `khach_hang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `khach_hang` (
  `id_khach_hang` int NOT NULL AUTO_INCREMENT,
  `so_dt` int NOT NULL,
  `ten_khach_hang` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_khach_hang`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `khach_hang`
--

LOCK TABLES `khach_hang` WRITE;
/*!40000 ALTER TABLE `khach_hang` DISABLE KEYS */;
INSERT INTO `khach_hang` VALUES (2,935115383,'hentai',''),(3,935115383,'hentai',''),(4,0,'',''),(5,0,'abc','');
/*!40000 ALTER TABLE `khach_hang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nghiep_vu`
--

DROP TABLE IF EXISTS `nghiep_vu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nghiep_vu` (
  `id_nghiep_vu` int NOT NULL AUTO_INCREMENT,
  `ten_nghiep_vu` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_nghiep_vu`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nghiep_vu`
--

LOCK TABLES `nghiep_vu` WRITE;
/*!40000 ALTER TABLE `nghiep_vu` DISABLE KEYS */;
INSERT INTO `nghiep_vu` VALUES (2,'bao ve',NULL),(3,'dau bep',NULL),(4,'le tan',NULL);
/*!40000 ALTER TABLE `nghiep_vu` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nhan_vien`
--

DROP TABLE IF EXISTS `nhan_vien`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nhan_vien` (
  `id_nhan_vien` int NOT NULL AUTO_INCREMENT,
  `ten_nhan_vien` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `id_nghiep_vu` int NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_nhan_vien`),
  KEY `id_nghiep_vu_idx` (`id_nghiep_vu`),
  CONSTRAINT `id_nghiep_vu` FOREIGN KEY (`id_nghiep_vu`) REFERENCES `nghiep_vu` (`id_nghiep_vu`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nhan_vien`
--

LOCK TABLES `nhan_vien` WRITE;
/*!40000 ALTER TABLE `nhan_vien` DISABLE KEYS */;
INSERT INTO `nhan_vien` VALUES (3,'TRAN VAN B',3,'fffff'),(6,'',2,''),(7,'Bui Thanh Son',2,'g');
/*!40000 ALTER TABLE `nhan_vien` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `nvien_dhang`
--

DROP TABLE IF EXISTS `nvien_dhang`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `nvien_dhang` (
  `id_nvien_dhang` int NOT NULL AUTO_INCREMENT,
  `id_nhanvien` int NOT NULL,
  `id_donhang` int NOT NULL,
  `ghi_chu` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id_nvien_dhang`),
  KEY `id_nhanvien_idx` (`id_nhanvien`),
  KEY `id_donhang_idx` (`id_donhang`),
  CONSTRAINT `id_donhang` FOREIGN KEY (`id_donhang`) REFERENCES `don_hang` (`id_don_hang`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `id_nhanvien` FOREIGN KEY (`id_nhanvien`) REFERENCES `nhan_vien` (`id_nhan_vien`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `nvien_dhang`
--

LOCK TABLES `nvien_dhang` WRITE;
/*!40000 ALTER TABLE `nvien_dhang` DISABLE KEYS */;
INSERT INTO `nvien_dhang` VALUES (1,3,7,NULL),(2,3,8,NULL),(3,7,7,NULL);
/*!40000 ALTER TABLE `nvien_dhang` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `phan_hoi`
--

DROP TABLE IF EXISTS `phan_hoi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `phan_hoi` (
  `id_phan_hoi` int NOT NULL AUTO_INCREMENT,
  `id_don_hang` int NOT NULL,
  `loai_phan_hoi` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `noi_dung` varchar(200) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ghi_chu` varchar(10000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_phan_hoi`),
  KEY `id_don_hang_idx` (`id_don_hang`),
  CONSTRAINT `id_don_hang_phan_hoi` FOREIGN KEY (`id_don_hang`) REFERENCES `don_hang` (`id_don_hang`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `phan_hoi`
--

LOCK TABLES `phan_hoi` WRITE;
/*!40000 ALTER TABLE `phan_hoi` DISABLE KEYS */;
INSERT INTO `phan_hoi` VALUES (3,8,'1','asdasdasd',''),(4,8,'dasdasd','asdasdasd','zcxcz');
/*!40000 ALTER TABLE `phan_hoi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `sanh`
--

DROP TABLE IF EXISTS `sanh`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `sanh` (
  `id_sanh` int NOT NULL AUTO_INCREMENT,
  `suc_chua` int NOT NULL,
  `gia` double NOT NULL,
  `tinh_trang` varchar(45) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci NOT NULL,
  `ghi_chu` varchar(1000) CHARACTER SET utf8mb4 COLLATE utf8mb4_vietnamese_ci DEFAULT NULL,
  PRIMARY KEY (`id_sanh`)
) ENGINE=InnoDB AUTO_INCREMENT=25 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_vietnamese_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `sanh`
--

LOCK TABLES `sanh` WRITE;
/*!40000 ALTER TABLE `sanh` DISABLE KEYS */;
INSERT INTO `sanh` VALUES (4,353,1234,'fs','sdf'),(24,0,0,'','');
/*!40000 ALTER TABLE `sanh` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tai_khoan`
--

DROP TABLE IF EXISTS `tai_khoan`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `tai_khoan` (
  `id_tai_khoan` int NOT NULL AUTO_INCREMENT,
  `mail` varchar(45) NOT NULL,
  `ten_tai_khoan` varchar(45) NOT NULL,
  `mat_khau` varchar(10000) NOT NULL,
  `role` varchar(45) NOT NULL,
  `ghi_chu` varchar(1000) DEFAULT NULL,
  PRIMARY KEY (`id_tai_khoan`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tai_khoan`
--

LOCK TABLES `tai_khoan` WRITE;
/*!40000 ALTER TABLE `tai_khoan` DISABLE KEYS */;
INSERT INTO `tai_khoan` VALUES (1,'tphuongnam01@gmail.com','nam','123','admin',NULL);
/*!40000 ALTER TABLE `tai_khoan` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2021-05-13 21:27:04
