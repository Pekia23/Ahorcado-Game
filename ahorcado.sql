-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: ahorcado
-- ------------------------------------------------------
-- Server version	8.0.32

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
-- Table structure for table `evento`
--

DROP TABLE IF EXISTS `evento`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `evento` (
  `idevento` int NOT NULL AUTO_INCREMENT,
  `Jugador` varchar(45) NOT NULL,
  `palabraAdivinar` varchar(45) NOT NULL,
  `estado` varchar(20) NOT NULL,
  `puntuacion` varchar(45) NOT NULL,
  PRIMARY KEY (`idevento`),
  KEY `palabra_idx` (`palabraAdivinar`)
) ENGINE=InnoDB AUTO_INCREMENT=12 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `evento`
--

LOCK TABLES `evento` WRITE;
/*!40000 ALTER TABLE `evento` DISABLE KEYS */;
INSERT INTO `evento` VALUES (1,'vane233','mechanization','Gano','1300'),(2,'HolaMundo','hipertexto','Gano','1000'),(3,'Erick','ingeniero','Perdio','-100'),(4,'Erick','ciencia','Perdio','0'),(5,'HolaMundo','combustible','Gano','1100'),(6,'Erick','microsd','Perdio','0'),(7,'Erick','mechanics','Perdio','0'),(8,'pekia','sistema','Gano','700'),(9,'DarkHunter','polvora','Gano','700'),(10,'pekia','customize','Gano','850'),(11,'pekia','artefacto','Gano','800');
/*!40000 ALTER TABLE `evento` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `jugador`
--

DROP TABLE IF EXISTS `jugador`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `jugador` (
  `idjugador` int NOT NULL AUTO_INCREMENT,
  `apodo` varchar(10) NOT NULL,
  `puntaje` int NOT NULL,
  PRIMARY KEY (`idjugador`),
  UNIQUE KEY `apodo_UNIQUE` (`apodo`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `jugador`
--

LOCK TABLES `jugador` WRITE;
/*!40000 ALTER TABLE `jugador` DISABLE KEYS */;
INSERT INTO `jugador` VALUES (1,'pekia',4050),(2,'Kavapicu',500),(3,'Leo73',290),(4,'MarioBros',50),(5,'Erick',900),(6,'DarkHunter',730),(7,'Jean',180),(8,'Ali',1000),(9,'Vane233',2250),(10,'HolaMundo',2100);
/*!40000 ALTER TABLE `jugador` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `palabras`
--

DROP TABLE IF EXISTS `palabras`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `palabras` (
  `idpalabras` varchar(30) NOT NULL,
  `palabra` varchar(45) NOT NULL,
  `cantidadPalabra` int NOT NULL,
  `cantidadEspacio` int NOT NULL,
  PRIMARY KEY (`idpalabras`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `palabras`
--

LOCK TABLES `palabras` WRITE;
/*!40000 ALTER TABLE `palabras` DISABLE KEYS */;
INSERT INTO `palabras` VALUES ('642a1d77fc13ae5f14f4cfe5','agricultura',11,0),('642a1d77fc13ae5f14f4cfe6','alfabeto',8,0),('642a1d77fc13ae5f14f4cfe7','algoritmo',9,0),('642a1d77fc13ae5f14f4cfe8','analogico',9,0),('642a1d77fc13ae5f14f4cfe9','androidpalabrase',8,0),('642a1d77fc13ae5f14f4cfea','armamento',9,0),('642a1d77fc13ae5f14f4cfeb','artefacto',9,0),('642a1d77fc13ae5f14f4cfec','astronomia',10,0),('642a1d77fc13ae5f14f4cfed','atomico',7,0),('642a1d77fc13ae5f14f4cfee','audiovisual',11,0),('642a1d77fc13ae5f14f4cfef','botanica',8,0),('642a1d77fc13ae5f14f4cff0','ciberespacio',12,0),('642a1d77fc13ae5f14f4cff1','cibernetica',11,0),('642a1d77fc13ae5f14f4cff2','ciencia',7,0),('642a1d77fc13ae5f14f4cff3','cientifico',10,0),('642a1d77fc13ae5f14f4cff4','circuito',8,0),('642a1d77fc13ae5f14f4cff5','clonacion',9,0),('642a1d77fc13ae5f14f4cff6','combustible',11,0),('642a1d77fc13ae5f14f4cff7','computacion',11,0),('642a1d77fc13ae5f14f4cff8','concepto',8,0),('642a1d77fc13ae5f14f4cff9','conocimiento',12,0),('642a1d77fc13ae5f14f4cffa','desarrollo',10,0),('642a1d77fc13ae5f14f4cffb','descubrimiento',14,0),('642a1d77fc13ae5f14f4cffc','digital',7,0),('642a1d77fc13ae5f14f4cffd','diseño',6,0),('642a1d77fc13ae5f14f4cffe','dispositivo',11,0),('642a1d77fc13ae5f14f4cfff','divulgacion',11,0),('642a1d77fc13ae5f14f4d000','domotica',8,0),('642a1d77fc13ae5f14f4d001','economia',8,0),('642a1d77fc13ae5f14f4d002','educacion',9,0),('642a1d77fc13ae5f14f4d003','electricidad',12,0),('642a1d77fc13ae5f14f4d004','energia',7,0),('642a1d77fc13ae5f14f4d005','ensayo',6,0),('642a1d77fc13ae5f14f4d006','etica',5,0),('642a1d77fc13ae5f14f4d007','evolucion',9,0),('642a1d77fc13ae5f14f4d008','experimento',11,0),('642a1d77fc13ae5f14f4d009','fabrica',7,0),('642a1d77fc13ae5f14f4d00a','ferrocarril',11,0),('642a1d77fc13ae5f14f4d00b','fision',6,0),('642a1d77fc13ae5f14f4d00c','fordismo',8,0),('642a1d77fc13ae5f14f4d00d','fotografia',10,0),('642a1d77fc13ae5f14f4d00e','fusion',6,0),('642a1d77fc13ae5f14f4d00f','generacion',10,0),('642a1d77fc13ae5f14f4d010','genetica',8,0),('642a1d77fc13ae5f14f4d011','hardware',8,0),('642a1d77fc13ae5f14f4d012','herramienta',11,0),('642a1d77fc13ae5f14f4d013','hierro',6,0),('642a1d77fc13ae5f14f4d014','hipertexto',10,0),('642a1d77fc13ae5f14f4d015','hipotesis',9,0),('642a1d77fc13ae5f14f4d016','historia',8,0),('642a1d77fc13ae5f14f4d017','imprenta',8,0),('642a1d77fc13ae5f14f4d018','industria',9,0),('642a1d77fc13ae5f14f4d019','infografia',10,0),('642a1d77fc13ae5f14f4d01a','informacion',11,0),('642a1d77fc13ae5f14f4d01b','informatica',11,0),('642a1d77fc13ae5f14f4d01c','ingeniero',9,0),('642a1d77fc13ae5f14f4d01d','innovacion',10,0),('642a1d77fc13ae5f14f4d01e','interface',9,0),('642a1d77fc13ae5f14f4d01f','inventor',8,0),('642a1d77fc13ae5f14f4d020','inversion',9,0),('642a1d77fc13ae5f14f4d021','investigacion',13,0),('642a1d77fc13ae5f14f4d022','laboratorio',11,0),('642a1d77fc13ae5f14f4d023','laser',5,0),('642a1d77fc13ae5f14f4d024','lenguaje',8,0),('642a1d77fc13ae5f14f4d025','logica',6,0),('642a1d77fc13ae5f14f4d026','manufactura',11,0),('642a1d77fc13ae5f14f4d027','maquina',7,0),('642a1d77fc13ae5f14f4d028','mecanica',8,0),('642a1d77fc13ae5f14f4d029','metal',5,0),('642a1d77fc13ae5f14f4d02a','metalurgia',10,0),('642a1d77fc13ae5f14f4d02b','microchip',9,0),('642a1d77fc13ae5f14f4d02c','motor',5,0),('642a1d77fc13ae5f14f4d02d','nuclear',7,0),('642a1d77fc13ae5f14f4d02e','patente',7,0),('642a1d77fc13ae5f14f4d02f','piedra',6,0),('642a1d77fc13ae5f14f4d030','polvora',7,0),('642a1d77fc13ae5f14f4d031','produccion',10,0),('642a1d77fc13ae5f14f4d032','programacion',12,0),('642a1d77fc13ae5f14f4d033','progreso',8,0),('642a1d77fc13ae5f14f4d034','prototipo',9,0),('642a1d77fc13ae5f14f4d035','radar',5,0),('642a1d77fc13ae5f14f4d036','radioactividad',14,0),('642a1d77fc13ae5f14f4d037','reactor',7,0),('642a1d77fc13ae5f14f4d038','red',3,0),('642a1d77fc13ae5f14f4d039','revolucion_industrial',20,1),('642a1d77fc13ae5f14f4d03a','robotica',8,0),('642a1d77fc13ae5f14f4d03b','rueda',5,0),('642a1d77fc13ae5f14f4d03c','sensor',6,0),('642a1d77fc13ae5f14f4d03d','sistema',7,0),('642a1d77fc13ae5f14f4d03e','software',8,0),('642a1d77fc13ae5f14f4d03f','taylorismo',10,0),('642a1d77fc13ae5f14f4d040','tecnica',7,0),('642a1d77fc13ae5f14f4d041','telecomunicaciones',18,0),('642a1d77fc13ae5f14f4d042','telefonia',9,0),('642a1d77fc13ae5f14f4d043','telegrafo',9,0),('642a1d77fc13ae5f14f4d044','telescopio',10,0),('642a1d77fc13ae5f14f4d045','television',10,0),('642a1d77fc13ae5f14f4d046','teoria',6,0),('642a1d77fc13ae5f14f4d047','termino',7,0),('642a1d77fc13ae5f14f4d048','termodinamica',13,0),('642a1d77fc13ae5f14f4d049','toyotismo',9,0),('642a1d77fc13ae5f14f4d04a','transmision',11,0),('642a1d77fc13ae5f14f4d04b','vapor',5,0),('642a1d77fc13ae5f14f4d04c','ethernet',8,0),('642a1d77fc13ae5f14f4d04d','website',7,0),('642a1d77fc13ae5f14f4d04e','internet',8,0),('642a1d77fc13ae5f14f4d04f','online',6,0),('642a1d77fc13ae5f14f4d050','read-only_memory',15,1),('642a1d77fc13ae5f14f4d051','random-access_memory',19,1),('642a1d77fc13ae5f14f4d052','processor',9,0),('642a1d77fc13ae5f14f4d053','ssd',3,0),('642a1d77fc13ae5f14f4d054','3d',2,0),('642a1d77fc13ae5f14f4d055','imax',4,0),('642a1d77fc13ae5f14f4d056','laptop',6,0),('642a1d77fc13ae5f14f4d057','computer',8,0),('642a1d77fc13ae5f14f4d058','mouse',5,0),('642a1d77fc13ae5f14f4d059','keyboard',8,0),('642a1d77fc13ae5f14f4d05a','keyword',7,0),('642a1d77fc13ae5f14f4d05b','automation',10,0),('642a1d77fc13ae5f14f4d05c','machinery',9,0),('642a1d77fc13ae5f14f4d05d','computers',9,0),('642a1d77fc13ae5f14f4d05e','mechanics',9,0),('642a1d77fc13ae5f14f4d05f','mechanization',13,0),('642a1d77fc13ae5f14f4d060','robotics',8,0),('642a1d77fc13ae5f14f4d061','telecommunications',18,0),('642a1d77fc13ae5f14f4d062','applied_science',14,1),('642a1d77fc13ae5f14f4d063','technology',10,0),('642a1d77fc13ae5f14f4d064','phone',5,0),('642a1d77fc13ae5f14f4d065','cellphone',9,0),('642a1d77fc13ae5f14f4d066','smartphone',10,0),('642a1d77fc13ae5f14f4d067','4k',2,0),('642a1d77fc13ae5f14f4d068','led',3,0),('642a1d77fc13ae5f14f4d069','smart-tv',8,0),('642a1d77fc13ae5f14f4d06a','bytes',5,0),('642a1d77fc13ae5f14f4d06b','kilobytes',9,0),('642a1d77fc13ae5f14f4d06c','megabytes',9,0),('642a1d77fc13ae5f14f4d06d','GigaBytes',9,0),('642a1d77fc13ae5f14f4d06e','TeraBytes',9,0),('642a1d77fc13ae5f14f4d06f','e-mail',6,0),('642a1d77fc13ae5f14f4d070','bluetooth',9,0),('642a1d77fc13ae5f14f4d071','operative_system',15,1),('642a1d77fc13ae5f14f4d072','virtual_reality',14,1),('642a1d77fc13ae5f14f4d073','vidpalabraseo-games',11,0),('642a1d77fc13ae5f14f4d074','social_media',11,1),('642a1d77fc13ae5f14f4d075','search_engine_optimization',24,2),('642a1d77fc13ae5f14f4d076','bots',4,0),('642a1d77fc13ae5f14f4d077','marketing',9,0),('642a1d77fc13ae5f14f4d078','online_market',12,1),('642a1d77fc13ae5f14f4d079','token_no_fungible',15,2),('642a1d77fc13ae5f14f4d07a','cryptocurrencies',16,0),('642a1d77fc13ae5f14f4d07b','antivirus_software',17,1),('642a1d77fc13ae5f14f4d07c','app',3,0),('642a1d77fc13ae5f14f4d07d','app_store',8,1),('642a1d77fc13ae5f14f4d07e','autocorrect',11,0),('642a1d77fc13ae5f14f4d07f','browser_tabs',11,1),('642a1d77fc13ae5f14f4d080','browsers',8,0),('642a1d77fc13ae5f14f4d081','blog',4,0),('642a1d77fc13ae5f14f4d082','blogger',7,0),('642a1d77fc13ae5f14f4d083','blogosfera',10,0),('642a1d77fc13ae5f14f4d084','calculators',11,0),('642a1d77fc13ae5f14f4d085','cameras',7,0),('642a1d77fc13ae5f14f4d086','cell_phones',10,1),('642a1d77fc13ae5f14f4d087','chat',4,0),('642a1d77fc13ae5f14f4d088','chatear',7,0),('642a1d77fc13ae5f14f4d089','cd_&_dvd_drivers',13,3),('642a1d77fc13ae5f14f4d08a','cyberbullying',13,0),('642a1d77fc13ae5f14f4d08b','cookie',6,0),('642a1d77fc13ae5f14f4d08c','crowdfunding',12,0),('642a1d77fc13ae5f14f4d08d','cursors',7,0),('642a1d77fc13ae5f14f4d08e','customize',9,0),('642a1d77fc13ae5f14f4d08f','desktops',8,0),('642a1d77fc13ae5f14f4d090','downloads',9,0),('642a1d77fc13ae5f14f4d091','drivers',7,0),('642a1d77fc13ae5f14f4d092','emoticon',8,0),('642a1d77fc13ae5f14f4d093','emoji',5,0),('642a1d77fc13ae5f14f4d094','e-commerce',10,0),('642a1d77fc13ae5f14f4d095','file_compression',15,1),('642a1d77fc13ae5f14f4d096','follower',8,0),('642a1d77fc13ae5f14f4d097','forums',6,0),('642a1d77fc13ae5f14f4d098','forward',7,0),('642a1d77fc13ae5f14f4d099','free_version',11,1),('642a1d77fc13ae5f14f4d09a','front-facing_camera',18,1),('642a1d77fc13ae5f14f4d09b','games_/_gamer',11,2),('642a1d77fc13ae5f14f4d09c','geek',4,0),('642a1d77fc13ae5f14f4d09d','google',6,0),('642a1d77fc13ae5f14f4d09e','googlear',8,0),('642a1d77fc13ae5f14f4d09f','hacker',6,0),('642a1d77fc13ae5f14f4d0a0','hangout',7,0),('642a1d77fc13ae5f14f4d0a1','hashtag',7,0),('642a1d77fc13ae5f14f4d0a2','hard_drive',9,1),('642a1d77fc13ae5f14f4d0a3','hoax',4,0),('642a1d77fc13ae5f14f4d0a4','hd_(high_definition)',16,2),('642a1d77fc13ae5f14f4d0a5','high_resolution',14,1),('642a1d77fc13ae5f14f4d0a6','homepage',8,0),('642a1d77fc13ae5f14f4d0a7','icons',5,0),('642a1d77fc13ae5f14f4d0a8','intranet',8,0),('642a1d77fc13ae5f14f4d0a9','iPad',4,0),('642a1d77fc13ae5f14f4d0aa','joystick',8,0),('642a1d77fc13ae5f14f4d0ab','laptops',7,0),('642a1d77fc13ae5f14f4d0ac','link',4,0),('642a1d77fc13ae5f14f4d0ad','lock_screen',10,1),('642a1d77fc13ae5f14f4d0ae','locked_screen',12,1),('642a1d77fc13ae5f14f4d0af','log_In',5,1),('642a1d77fc13ae5f14f4d0b0','mac_(macintosh_computer)',22,2),('642a1d77fc13ae5f14f4d0b1','meme',4,0),('642a1d77fc13ae5f14f4d0b2','microsd',7,0),('642a1d77fc13ae5f14f4d0b3','mobile_phone',11,1),('642a1d77fc13ae5f14f4d0b4','monitors',8,0),('642a1d77fc13ae5f14f4d0b5','mp3_&_audio_software',18,2),('642a1d77fc13ae5f14f4d0b6','multitasking',12,0),('642a1d77fc13ae5f14f4d0b7','networks',8,0),('642a1d77fc13ae5f14f4d0b8','nube',4,0),('642a1d77fc13ae5f14f4d0b9','operating_system',15,1),('642a1d77fc13ae5f14f4d0ba','password',8,0),('642a1d77fc13ae5f14f4d0bb','pc_(personal_computer)',20,2),('642a1d77fc13ae5f14f4d0bc','phablet',7,0),('642a1d77fc13ae5f14f4d0bd','post',4,0),('642a1d77fc13ae5f14f4d0be','power_button',11,1),('642a1d77fc13ae5f14f4d0bf','phubbing',8,0),('642a1d77fc13ae5f14f4d0c0','postear',7,0),('642a1d77fc13ae5f14f4d0c1','printers',8,0),('642a1d77fc13ae5f14f4d0c2','quick_access',11,1),('642a1d77fc13ae5f14f4d0c3','reboot',6,0),('642a1d77fc13ae5f14f4d0c4','remote control',14,0),('642a1d77fc13ae5f14f4d0c5','resolution',10,0),('642a1d77fc13ae5f14f4d0c6','ringtones',9,0),('642a1d77fc13ae5f14f4d0c7','screenshot',10,0),('642a1d77fc13ae5f14f4d0c8','selfie',6,0),('642a1d77fc13ae5f14f4d0c9','set-up_/_settings',15,2),('642a1d77fc13ae5f14f4d0ca','skype',5,0),('642a1d77fc13ae5f14f4d0cb','skin',4,0),('642a1d77fc13ae5f14f4d0cc','slot',4,0),('642a1d77fc13ae5f14f4d0cd','stalkear',8,0),('642a1d77fc13ae5f14f4d0ce','smartwatch',10,0),('642a1d77fc13ae5f14f4d0cf','social_networks',14,1),('642a1d77fc13ae5f14f4d0d0','spam',4,0),('642a1d77fc13ae5f14f4d0d1','streaming',9,0),('642a1d77fc13ae5f14f4d0d2','tablet',6,0),('642a1d77fc13ae5f14f4d0d3','tags',4,0),('642a1d77fc13ae5f14f4d0d4','timeline',8,0),('642a1d77fc13ae5f14f4d0d5','tweet',5,0),('642a1d77fc13ae5f14f4d0d6','trending_topic',13,1),('642a1d77fc13ae5f14f4d0d7','toolbar',7,0),('642a1d77fc13ae5f14f4d0d8','touch_pad',8,1),('642a1d77fc13ae5f14f4d0d9','touch_screen',11,1),('642a1d77fc13ae5f14f4d0da','unlocked',8,0),('642a1d77fc13ae5f14f4d0db','updates',7,0),('642a1d77fc13ae5f14f4d0dc','utilities',9,0),('642a1d77fc13ae5f14f4d0dd','vidpalabraseo',5,0),('642a1d77fc13ae5f14f4d0de','vidpalabraseo_chat',9,1),('642a1d77fc13ae5f14f4d0df','voicemail',9,0),('642a1d77fc13ae5f14f4d0e0','viral',5,0),('642a1d77fc13ae5f14f4d0e1','whatsapp',8,0),('642a1d77fc13ae5f14f4d0e2','web',3,0),('642a1d77fc13ae5f14f4d0e3','web_site',7,1),('642a1d77fc13ae5f14f4d0e4','webcam',6,0),('642a1d77fc13ae5f14f4d0e5','wifi',4,0),('642a1d77fc13ae5f14f4d0e6','wireless',8,0),('642a1d77fc13ae5f14f4d0e7','webinar',7,0);
/*!40000 ALTER TABLE `palabras` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-04-06 20:39:37
