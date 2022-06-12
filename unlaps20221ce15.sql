CREATE DATABASE  IF NOT EXISTS `unlaps20221ce15` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `unlaps20221ce15`;
-- MySQL dump 10.13  Distrib 8.0.26, for Win64 (x86_64)
--
-- Host: localhost    Database: unlaps20221ce15
-- ------------------------------------------------------
-- Server version	8.0.26

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
-- Table structure for table `category`
--

DROP TABLE IF EXISTS `category`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `category` (
  `id_category` int NOT NULL AUTO_INCREMENT,
  `category` varchar(255) DEFAULT NULL,
  `discount_category` double NOT NULL,
  `enable_discount_category` bit(1) NOT NULL,
  `url_image` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id_category`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `category`
--

LOCK TABLES `category` WRITE;
/*!40000 ALTER TABLE `category` DISABLE KEYS */;
INSERT INTO `category` VALUES (1,'Acompañantes',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/Acompañantes.jfif');
INSERT INTO `category` VALUES(2,'Bebidas',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/Bebidas.jfif');
INSERT INTO `category` VALUES(3,'CajitaFeliz',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/CajitaFeliz.jfif');
INSERT INTO `category` VALUES(4,'ComboMeals',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/ComboMeals.jfif');
INSERT INTO `category` VALUES(5,'Desayunos',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/Desayunos.jfif');
INSERT INTO `category` VALUES(6,'Hamburguesas',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/Hamburguesas.jfif');
INSERT INTO `category` VALUES(7,'McCafe',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/McCafe.jfif');
INSERT INTO `category` VALUES(8,'McCafeBakery',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/McCafeBakery.jfif');
INSERT INTO `category` VALUES(9,'PolloYSandwiches',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/PolloYSandwiches.jfif');
INSERT INTO `category` VALUES(10,'PostresYShakes',0,_binary '\0','/mc-donals-app/src/main/resources/assets/imagenes/Categorias/PostresYShakes.jfif');
/*!40000 ALTER TABLE `category` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `product`
--

DROP TABLE IF EXISTS `product`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `product` (
  `id_product` int NOT NULL AUTO_INCREMENT,
  `code` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `discount` double DEFAULT NULL,
  `enable` bit(1) DEFAULT NULL,
  `enable_discount` bit(1) DEFAULT NULL,
  `price` double DEFAULT NULL,
  `product` varchar(255) NOT NULL,
  `times_bought` int DEFAULT NULL,
  `url_image` varchar(255) DEFAULT NULL,
  `id_category` int NOT NULL,
  PRIMARY KEY (`id_product`),
  KEY `FK5cxv31vuhc7v32omftlxa8k3c` (`id_category`),
  CONSTRAINT `FK5cxv31vuhc7v32omftlxa8k3c` FOREIGN KEY (`id_category`) REFERENCES `category` (`id_category`)
) ENGINE=InnoDB AUTO_INCREMENT=43 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `product`
--

LOCK TABLES `product` WRITE;
/*!40000 ALTER TABLE `product` DISABLE KEYS */;
INSERT INTO `product` VALUES  (1,'AC',"Nuestras papitas provienen de papas de calidad superior, cultivadas localmente. Con cero gramo de grasa trans, estas papitas épicas son doraditas y crujientes por fuera y suavecitas por dentro.",0,_binary '',_binary '\0',100,'Papas Fritas',0,'/mc-donals-app/src/main/resources/assets/imagenes/Acompañantes/PapasFritas.jfif',1);
INSERT INTO `product` VALUES (2,'BE',"Purificada con minerales para refrescarte.",0,_binary '',_binary '\0',100,'Agua',0,'/mc-donals-app/src/main/resources/assets/imagenes/Bebidas/Agua.jfif',2);
INSERT INTO `product` VALUES (3,'BE',"Fría y refrescante. Va bien con cualquier opción de nuestro menú.",0,_binary '',_binary '\0',100,'Coca-Cola',0,'/mc-donals-app/src/main/resources/assets/imagenes/Bebidas/CocaCola.jfif',2);
INSERT INTO `product` VALUES (4,'BE',"Bebida cola súper fría. Cero calorías.",0,_binary '',_binary '\0',100,'Coca de dieta',0,'/mc-donals-app/src/main/resources/assets/imagenes/Bebidas/CocaDeDieta.jfif',2);
INSERT INTO `product` VALUES (5,'BE',"Gaseosa con sabor a naranja. Fria y refrescante para acompañar cualquier opcion de nuestro menú.",0,_binary '',_binary '\0',100,'Fanta de naranja',0,'/mc-donals-app/src/main/resources/assets/imagenes/Bebidas/FantaDeNaranja.jfif',2);
INSERT INTO `product` VALUES (6,'BE',"El refresco de máquina Sprite tiene un delicioso sabor a lima-limón. Sprite es un refresco sin cafeína que combina a la perfección con cualquier Combo Meal de McDonald’s.",0,_binary '',_binary '\0',100,'Sprite',0,'/mc-donals-app/src/main/resources/assets/imagenes/Bebidas/SpritePequeño.jfif',2);
INSERT INTO `product` VALUES (7,'CF',"Una jugosa hamburguesa acompañada de papas fritas para niños.",0,_binary '',_binary '\0',100,'Cajita Feliz con Hamburguesa',0,'/mc-donals-app/src/main/resources/assets/imagenes/CajitaFeliz/CajitaFelizHamburguesa.jfif',3);
INSERT INTO `product` VALUES (8,'CF',"Cuatro tiernos Chicken McNuggets hechos con carne blanca de pollo, acompañados con una porción de papas fritas para niños.",0,_binary '',_binary '\0',100,'Cajita Feliz con McNuggets de 4 piezas',0,'/mc-donals-app/src/main/resources/assets/imagenes/CajitaFeliz/CajitaFelizMcNuggets4pzs.jfif',3);
INSERT INTO `product` VALUES (9,'CF',"Seis tiernos Chicken McNuggets hechos con carne blanca de pollo, acompañados con una porción de nuestras papas fritas para niños.",0,_binary '',_binary '\0',100,'Cajita Feliz con McNuggets de 6 piezas',0,'/mc-donals-app/src/main/resources/assets/imagenes/CajitaFeliz/CajitaFelizMcNuggets6pzs.jfif',3);
INSERT INTO `product` VALUES (10,'CM',"La única y exclusiva Big Mac®, servida con papas fritas y tu refresco preferido bien frío.",0,_binary '',_binary '\0',100,'Big Mac Meal',0,'/mc-donals-app/src/main/resources/assets/imagenes/ComboMeal/BigMacMeal.jfif',4);
INSERT INTO `product` VALUES (11,'CM',"Nuestro Cheeseburger Meal es un clásico simple, delicioso y a un buen precio. Servido con papas fritas y tu refresco preferido bien frío.",0,_binary '',_binary '\0',100,'Hamburguesa con queso Meal',0,'/mc-donals-app/src/main/resources/assets/imagenes/ComboMeal/CheeseburguerMeal.jfif',4);
INSERT INTO `product` VALUES (12,'CM',"Los ahorros del desayuno se suman con un Egg McMuffin, crujientes y doraditos Hash Browns y un café de McCafé pequeño.",0,_binary '',_binary '\0',100,'McMuffin Meal',0,'/mc-donals-app/src/main/resources/assets/imagenes/ComboMeal/McMuffinMeal.jfif',4);
INSERT INTO `product` VALUES (13,'CM',"Disfruta 10 tiernos y deliciosos Chicken McNuggets, hechos con carne blanca de pollo, además de una porcion de papas fritas y tu refresco preferido bien frío.",0,_binary '',_binary '\0',100,'McNuggets Meal',0,'/mc-donals-app/src/main/resources/assets/imagenes/ComboMeal/McNuggetsMeal.jfif',4);
INSERT INTO `product` VALUES (14,'DE',"Dale algo picosito a tu mañana con un suave huevo revuelto, salchicha, queso derretido, chiles verdes, y cebollas, todo envuelto en una suave tortilla.",0,_binary '',_binary '\0',100,'Burrito',0,'/mc-donals-app/src/main/resources/assets/imagenes/Desayunos/Burrito.jfif',5);
INSERT INTO `product` VALUES (15,'DE',"El Desayuno Grande de McDonald’s satisface tus ganas de lo dulce y sabroso. Sacia tu apetito con un biscuit calientito, sabrosa salchicha caliente, esponjosos huevos revueltos, crujientes hash browns y doraditos hotcakes con mantequilla auténtica y el dulce sabor de la miel de maple como acompañantes.",0,_binary '',_binary '\0',100,'Desayuno Grande',0,'/mc-donals-app/src/main/resources/assets/imagenes/Desayunos/DesayunoGrande.jfif',5);
INSERT INTO `product` VALUES (16,'DE',"El McGriddles incluye griddle cakes suaves y calientitos con el dulce sabor de la miel de maple, tocino ahumado Applewood, un esponjoso huevo dobladito y una rebanada de queso americano derretido. McGriddle cakes no tienen conservantes, sabores ni colorantes artificiales de fuentes artificiales.",0,_binary '',_binary '\0',100,'McGriddles',0,'/mc-donals-app/src/main/resources/assets/imagenes/Desayunos/McGriddles.jfif',5);
INSERT INTO `product` VALUES (17,'DE',"¡Comienza tu mañana con un sabroso y delicioso sándwich de desayuno!El McMuffin de McDonald’s incluye una sabrosa salchicha caliente, una rebanada de queso americano derretido y un huevo delicioso, todo dentro de un muffin inglés recién tostado.",0,_binary '',_binary '\0',100,'McMuffin',0,'/mc-donals-app/src/main/resources/assets/imagenes/Desayunos/McMuffin.jfif',5);
INSERT INTO `product` VALUES (18,'DE',"Tres panqueques doraditos que se disuelven en la boca con mantequilla de verdad y el dulce sabor de la miel de maple como acompañantes. Además, incluye una porción de sabrosa salchicha calientita.",0,_binary '',_binary '\0',100,'Panqueques',0,'/mc-donals-app/src/main/resources/assets/imagenes/Desayunos/Panqueques.jfif',5);
INSERT INTO `product` VALUES (19,'HA',"La hamburguesa original comienza con un patty de 100% carne sazonado con una pizca de sal y pimienta. Viene cubierto con pepinillos crujientes, cebollas picadas, ketchup y mostaza. Se hace sin conservantes, colorantes ni sabores artificiales. No contiene sabores o conservantes artificiales ni colorantes agregados de fuentes artificiales.",0,_binary '',_binary '\0',100,'Hamburguesa',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/hamburguesa.jfif',6);
INSERT INTO `product` VALUES (20,'HA',"La perfección hecha hamburguesa que te hace agua la boca comienza con dos patties de 100% carne y la salsa Big Mac®, todo dentro de un pan con semillas de ajonjolí. Viene cubierta con pepinillos, crujiente lechuga, cebollas y queso americano para lograr ese sabor único de la hamburguesa 100% de carne. No contiene sabores o conservantes artificiales ni colorantes agregados de fuentes artificiales.",0,_binary '',_binary '\0',100,'BigMac',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/BigMac.jfif',6);
INSERT INTO `product` VALUES (21,'HA',"Nuestra simple y clásica Cheeseburger comienza con un patty de 100% carne sazonado con una pizca de sal y pimienta. Se cubre con pepinillos crujientes, cebollas picadas, ketchup, mostaza y una rebanada de queso americano derretido. No contiene sabores o conservantes artificiales ni colorantes agregados de fuentes artificiales.",0,_binary '',_binary '\0',100,'Hamburguesa con queso',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/Cheeseburguer.jfif',6);
INSERT INTO `product` VALUES (22,'HA',"Cada hamburguesa Cuarto de libra con queso y tocino incluye tres tiras de crujiente tocino ahumado applewood encima de un patty de 100% carne fresca de ¼ de libra* que se cocina en el minuto que ordenas. Se sirve caliente, deliciosamente jugosa y sazonada con solo una pizca de sal y pimienta y se sella en nuestras planchas de hierro. Viene con dos rebanadas de queso americano derretido, cebollas en tiras y deliciosos pepinillos, todo en un suave pan con semillas de ajonjolí.",0,_binary '',_binary '\0',100,'Cuarto de libra con queso y tocino',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/CuartoDeLibraConCheeseBacon.jfif',6);
INSERT INTO `product` VALUES (23,'HA',"La Cuarto de libra Deluxe es una versión fresca de la clásica Quarter Pounder®. Una crujiente hoja de lechuga y tres rebanadas de tomate Roma cubren el patty de ¼ de libra* de 100% carne fresca que viene caliente, deliciosamente jugoso y cocinado en el minuto que ordenas. Sazonado con solo una pizca de sal y pimienta y cocinado en nuestras planchas. Además, se le agregan dos rebanadas de queso americano derretido, cremosa mayonesa, cebollas en tiras y crujientes pepinillos. Todo en un pan esponjoso y suave con semillas de ajonjolí.",0,_binary '',_binary '\0',100,'Cuarto de libra Deluxe',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/CuartoDeLibraDeluxe.jfif',6);
INSERT INTO `product` VALUES (24,'HA',"La Cuarto de libra with Cheese de McDonald’s es la opción perfecta cuando se te antoja una jugosa hamburguesa de 100% carne fresca. ¡Llévate tu cuarto de libra hoy!",0,_binary '',_binary '\0',100,'Doble cuarto de libra con queso',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/DobleCuartoDeLibraConQueso.jfif',6);
INSERT INTO `product` VALUES (25,'HA',"La Cuarto de libra con queso de McDonald’s es la opción perfecta cuando se te antoja una jugosa hamburguesa de 100% carne fresca. ¡Llévate tu cuarto de libra hoy!",0,_binary '',_binary '\0',100,'Doble hamburguesa con queso',0,'/mc-donals-app/src/main/resources/assets/imagenes/hamburguesas/DoubleCheeseburguer.jfif',6);
INSERT INTO `product` VALUES (26,'CF',"Consiéntete con un simple y delicioso café mañanero. Hecho con granos 100% arábica, el Café Premium Roast es tostado por expertos y preparado cada 30 minutos. Disfruta tu café caliente negro o con azúcar, endulzante, leche o creamer... como te gusta.",0,_binary '',_binary '\0',100,'Cafe',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafe/Cafe.jfif',7);
INSERT INTO `product` VALUES (27,'CF',"Un Cappuccino reconfortante y calientito preparado con leche entera o sin grasa al vapor, intenso café espresso, hecho con granos de fuentes sostenibles, abundante espuma y tu sabor favorito.",0,_binary '',_binary '\0',100,'Capuccino',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafe/Capuccino.jfif',7);
INSERT INTO `product` VALUES (28,'CF',"Saborea el delicioso sabor chocolatoso del Hot Chocolate de McCafé. Chocolate caliente hecho con leche entera o sin grasa al vapor, sirope de rico chocolate, todo cubierto con un topping de crema batida y un chorrito de chocolate.",0,_binary '',_binary '\0',100,'Chocolate Caliente',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafe/ChocolateCaliente.jfif',7);
INSERT INTO `product` VALUES (29,'CF',"Siente el calorcito del delicioso Latte caliente, hecho con café espresso Rainforest Alliance Certified™. Personaliza tu Latte recién preparado con leche entera o sin grasa al vapor y tu sabor preferido. Sabores disponibles en ciertos restaurantes.",0,_binary '',_binary '\0',100,'Latte',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafe/Latte.jfif',7);
INSERT INTO `product` VALUES (30,'CF',"Nuestro Café Mocha de McCafé hecho con granos de café espresso de fuentes sostenibles, provenientes de cultivos Rainforest Alliance Certified™. Además, incluye leche entera o sin grasa al vapor y sirope de chocolate. Viene cubierto con un topping batido y un chorrito de chocolate. Disfruta este delicioso café mocha caliente, con todo el sabor del chocolate y rica cremosidad.",0,_binary '',_binary '\0',100,'Mocha',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafe/Mocha.jfif',7);
INSERT INTO `product` VALUES (31,'CFB',"Un buñuelo clásico hecho con canela y manzana, frito hasta doradito y cubierto con un glaseado dulce.",0,_binary '',_binary '\0',100,'Buñuelo de Manzana',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafeBakery/BuñeloManzana.jfif',8);
INSERT INTO `product` VALUES (32,'CFB',"Un suavecito muffin horneado con arandanos de verdad y cubierto con un topping de streusel crumb.",0,_binary '',_binary '\0',100,'Muffin de arandanos',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafeBakery/MuffinArandanos.jfif',8);
INSERT INTO `product` VALUES (33,'CFB',"Servido calientito y relleno de canela, dentro de masa hojaldrada ligera y curbierto con un delicioso choritto de queso crema.",0,_binary '',_binary '\0',100,'Rollo de canela',0,'/mc-donals-app/src/main/resources/assets/imagenes/McCafeBakery/RolloDeCanela.jfif',8);
INSERT INTO `product` VALUES (34,'PS',"Delicioso pollo crujiente cubierto con mayonesa, lechuga iceberg en tiritas. Servido en un pan tostado a la perfección.",0,_binary '',_binary '\0',100,'McChicken',0,'/mc-donals-app/src/main/resources/assets/imagenes/PolloYSandwiches/McChicken.jfif',9);
INSERT INTO `product` VALUES (35,'PS',"Nuestros tiernos y jugosos Chicken McNuggets están hechos con 100% carne blanca de pollo, sin colorantes, sabores ni conservantes artificiales.",0,_binary '',_binary '\0',100,'McNuggets',0,'/mc-donals-app/src/main/resources/assets/imagenes/PolloYSandwiches/McNuggets.jfif',9);
INSERT INTO `product` VALUES (36,'PS',"¡Saborea nuestro sándwich hecho con pescado silvestre! Proveniente de pesquerías de fuentes sostenibles, cubierto con queso americano derretido y cremosa salsa tártara. Servido en un suave pan calientito.",0,_binary '',_binary '\0',100,'Sandwich de Pescado',0,'/mc-donals-app/src/main/resources/assets/imagenes/PolloYSandwiches/SandwichDePescado.jfif',9);
INSERT INTO `product` VALUES (37,'PS',"El Sandwich de pollo Deluxe de McDonald’s es un sándwich de pollo crujiente estilo sureño que queda crujiente, tiernito y jugoso, perfecto. Viene cubierto con deliciosos pepinillos y se sirve en un nuevo pan de papa tostado con mantequilla acompañado con lechuga y tomate.",0,_binary '',_binary '\0',100,'Sandwich de pollo Deluxe',0,'/mc-donals-app/src/main/resources/assets/imagenes/PolloYSandwiches/SandwichDePolloDeluxe.jfif',9);
INSERT INTO `product` VALUES (38,'POSH',"Suave helado de vainilla, dulce y cremoso en un cono crujiente.",0,_binary '',_binary '\0',100,'Cono de vainilla',0,'/mc-donals-app/src/main/resources/assets/imagenes/PostresYShakes/ConoDeVainilla.jfif',10);
INSERT INTO `product` VALUES (39,'POSH',"Suave helado de vainilla mezclado con galletas OREO.",0,_binary '',_binary '\0',100,'McFlurry de oreo',0,'/mc-donals-app/src/main/resources/assets/imagenes/PostresYShakes/McFlurryOreo.jfif',10);
INSERT INTO `product` VALUES (40,'POSH',"Mini pies de manzana hechas de deliciosas manzanas con un toque de canela, horneadas dentro de una masa de hojaldre.",0,_binary '',_binary '\0',100,'Pie de manzana',0,'/mc-donals-app/src/main/resources/assets/imagenes/PostresYShakes/PieDeManzana.jfif',10);
INSERT INTO `product` VALUES (41,'POSH',"Nuestro suave helado de vainilla deliciosamente cremoso con sirope de chocolate y cubierto con crema batida y una cereza.",0,_binary '',_binary '\0',100,'Shake de chocolate',0,'/mc-donals-app/src/main/resources/assets/imagenes/PostresYShakes/ShakeDeChocolate.jfif',10);
INSERT INTO `product` VALUES (42,'POSH',"Un caramel sundae que combina el rico y cremoso suave helado, con el caramelo mantecoso y calientito.",0,_binary '',_binary '\0',100,'Sundae con caramelo',0,'/mc-donals-app/src/main/resources/assets/imagenes/PostresYShakes/SundaeCaramelo.jfif',10);
/*!40000 ALTER TABLE `product` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-06-11 18:29:05
