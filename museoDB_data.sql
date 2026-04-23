-- MySQL dump 10.13  Distrib 8.0.43, for Linux (x86_64)
--
-- Host: 10.2.1.202    Database: Museo
-- ------------------------------------------------------
-- Server version	8.0.44-0ubuntu0.24.04.2

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
-- Dumping data for table `ciclo_formativo`
--

LOCK TABLES `ciclo_formativo` WRITE;
/*!40000 ALTER TABLE `ciclo_formativo` DISABLE KEYS */;
/*!40000 ALTER TABLE `ciclo_formativo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `modulo`
--

LOCK TABLES `modulo` WRITE;
/*!40000 ALTER TABLE `modulo` DISABLE KEYS */;
/*!40000 ALTER TABLE `modulo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `obra`
--

LOCK TABLES `obra` WRITE;
/*!40000 ALTER TABLE `obra` DISABLE KEYS */;
INSERT INTO `obra` VALUES (9,1656,'las meninas','retrato de la familia real con juego de perspectivas.',1,1),(10,1600,'la vocación de san mateo','escena bíblica con uso dramático del claroscuro.',1,2),(11,1931,'la persistencia de la memoria','relojes deformados que simbolizan la relatividad del tiempo.',2,3),(12,1964,'el hijo del hombre','autorretrato con una manzana ocultando el rostro.',2,4),(13,1939,'las dos fridas','autorretrato doble que muestra la conexión emocional.',2,5),(14,1503,'la gioconda','famosa por el sfumato y la expresión enigmática.',3,6),(15,1512,'la creación de adán','fresco donde dios otorga la vida al hombre.',3,7);
/*!40000 ALTER TABLE `obra` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `sala`
--

LOCK TABLES `sala` WRITE;
/*!40000 ALTER TABLE `sala` DISABLE KEYS */;
INSERT INTO `sala` VALUES (1,'barroco'),(2,'surrealismo'),(3,'renacimiento');
/*!40000 ALTER TABLE `sala` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (1,'velázquez','diego'),(2,'merisi','caravaggio'),(3,'dalí','salvador'),(4,'magritte','rené'),(5,'kahlo','frida'),(6,'da vinci','leonardo'),(7,'ángel','miguel'),(10,'Velázquezd','Diego'),(11,'Velázquez','Diego'),(12,'Merisi','Caravaggio'),(13,'Dalí','Salvador'),(14,'Magritte','René'),(15,'Kahlo','Frida'),(16,'da Vinci','Leonardo'),(17,'Ángel','Miguel');
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2026-04-21 19:45:44
