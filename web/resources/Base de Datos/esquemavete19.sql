CREATE DATABASE  IF NOT EXISTS `esquemavete19` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;
USE `esquemavete19`;
-- MySQL dump 10.13  Distrib 8.0.11, for Win64 (x86_64)
--
-- Host: localhost    Database: esquemavete19
-- ------------------------------------------------------
-- Server version	8.0.11

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `atencion`
--

DROP TABLE IF EXISTS `atencion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `atencion` (
  `id_atenc_medica` varchar(20) NOT NULL,
  `fech_atenc_medica` date NOT NULL,
  `diagnos_atenc_medica` varchar(50) NOT NULL,
  `observ_atenc_medica` varchar(20) NOT NULL,
  `mascota_atenc` varchar(20) NOT NULL,
  `propie_masc_atencion` varchar(20) NOT NULL,
  `medic_atencion` varchar(20) NOT NULL,
  `atencion_estado` bit(1) NOT NULL,
  PRIMARY KEY (`id_atenc_medica`),
  KEY `FK_eefc7gd7wem56jrscu5fdw0vi` (`mascota_atenc`),
  KEY `FK_tdnqsw7a2gd8jgowiup7d8scr` (`propie_masc_atencion`),
  KEY `FK_ga5dbi2u5hwrr5edfnbsa7k67` (`medic_atencion`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `atencion`
--

LOCK TABLES `atencion` WRITE;
/*!40000 ALTER TABLE `atencion` DISABLE KEYS */;
/*!40000 ALTER TABLE `atencion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `mascota`
--

DROP TABLE IF EXISTS `mascota`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `mascota` (
  `id_mascota` varchar(20) NOT NULL,
  `masco_nombre` varchar(25) DEFAULT NULL,
  `masco_especie` varchar(30) DEFAULT NULL,
  `masco_sexo` varchar(20) DEFAULT NULL,
  `masco_raza` varchar(30) DEFAULT NULL,
  `masco_fechaNac` date DEFAULT NULL,
  `masco_peso` double DEFAULT NULL,
  `masco_estado` bit(1) DEFAULT NULL,
  `id_vacuna` varchar(12) NOT NULL,
  PRIMARY KEY (`id_mascota`),
  KEY `FK_m95rm58el056ftouf8i6mg7bo` (`id_vacuna`),
  CONSTRAINT `FK_m95rm58el056ftouf8i6mg7bo` FOREIGN KEY (`id_vacuna`) REFERENCES `vacuna` (`id_vacuna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `mascota`
--

LOCK TABLES `mascota` WRITE;
/*!40000 ALTER TABLE `mascota` DISABLE KEYS */;
/*!40000 ALTER TABLE `mascota` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `medicamento` (
  `id_medicamento` varchar(20) NOT NULL,
  `nomb_medicamento` varchar(100) DEFAULT NULL,
  `fech_venc_medicamento` date DEFAULT NULL,
  `descr_medicamento` varchar(200) DEFAULT NULL,
  `medcmento_estado` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `medicamento`
--

LOCK TABLES `medicamento` WRITE;
/*!40000 ALTER TABLE `medicamento` DISABLE KEYS */;
/*!40000 ALTER TABLE `medicamento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `propietario`
--

DROP TABLE IF EXISTS `propietario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `propietario` (
  `prop_dni` varchar(20) NOT NULL,
  `prop_nombre` varchar(100) DEFAULT NULL,
  `prop_apellido` varchar(50) DEFAULT NULL,
  `prop_direccion` varchar(100) DEFAULT NULL,
  `prop_telefono` varchar(50) DEFAULT NULL,
  `prop_email` varchar(100) DEFAULT NULL,
  `prop_estado` bit(1) DEFAULT NULL,
  PRIMARY KEY (`prop_dni`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `propietario`
--

LOCK TABLES `propietario` WRITE;
/*!40000 ALTER TABLE `propietario` DISABLE KEYS */;
/*!40000 ALTER TABLE `propietario` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuarios`
--

DROP TABLE IF EXISTS `usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `usuarios` (
  `usu_nombre_usuario` varchar(12) NOT NULL,
  `usu_password` varchar(255) DEFAULT NULL,
  `usu_tipo_usuario` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`usu_nombre_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuarios`
--

LOCK TABLES `usuarios` WRITE;
/*!40000 ALTER TABLE `usuarios` DISABLE KEYS */;
INSERT INTO `usuarios` VALUES ('ezequiel','clavijo','admin');
/*!40000 ALTER TABLE `usuarios` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vacuna`
--

DROP TABLE IF EXISTS `vacuna`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vacuna` (
  `id_vacuna` varchar(12) NOT NULL,
  `nombre_vacuna` varchar(100) DEFAULT NULL,
  `vac_lote` varchar(50) DEFAULT NULL,
  `fech_vacuna` date DEFAULT NULL,
  `estado_vacun` bit(1) DEFAULT NULL,
  PRIMARY KEY (`id_vacuna`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vacuna`
--

LOCK TABLES `vacuna` WRITE;
/*!40000 ALTER TABLE `vacuna` DISABLE KEYS */;
/*!40000 ALTER TABLE `vacuna` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-06-26 22:35:43
