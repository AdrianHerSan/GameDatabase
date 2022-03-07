-- --------------------------------------------------------
-- Host:                         127.0.0.1
-- Versión del servidor:         10.6.3-MariaDB - mariadb.org binary distribution
-- SO del servidor:              Win64
-- HeidiSQL Versión:             11.3.0.6295
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

-- Volcando datos para la tabla gamedatabase.characters_users: ~2 rows (aproximadamente)
DELETE FROM `characters_users`;
/*!40000 ALTER TABLE `characters_users` DISABLE KEYS */;
INSERT INTO `characters_users` (`character_id`, `user_id`) VALUES
	(20, 11),
	(20, 16);
/*!40000 ALTER TABLE `characters_users` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.charactertable: ~13 rows (aproximadamente)
DELETE FROM `charactertable`;
/*!40000 ALTER TABLE `charactertable` DISABLE KEYS */;
INSERT INTO `charactertable` (`character_id`, `charactername`) VALUES
	(2, 'Ashe'),
	(3, 'Ashe'),
	(4, 'Ashe'),
	(5, 'Ashe'),
	(6, 'Ashe'),
	(7, 'Ashe'),
	(8, 'Ashe'),
	(9, 'Konrad'),
	(10, 'Flavio'),
	(16, 'Nightmare'),
	(17, 'Lulu'),
	(19, 'Jorge-san'),
	(20, 'io');
/*!40000 ALTER TABLE `charactertable` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.hibernate_sequence: ~1 rows (aproximadamente)
DELETE FROM `hibernate_sequence`;
/*!40000 ALTER TABLE `hibernate_sequence` DISABLE KEYS */;
INSERT INTO `hibernate_sequence` (`next_not_cached_value`, `minimum_value`, `maximum_value`, `start_value`, `increment`, `cache_size`, `cycle_option`, `cycle_count`) VALUES
	(1001, 1, 9223372036854775806, 1, 1, 1000, 0, 0);
/*!40000 ALTER TABLE `hibernate_sequence` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.matches_users: ~4 rows (aproximadamente)
DELETE FROM `matches_users`;
/*!40000 ALTER TABLE `matches_users` DISABLE KEYS */;
INSERT INTO `matches_users` (`match_id`, `user_id`) VALUES
	(18, 11),
	(18, 16),
	(21, 11),
	(21, 16);
/*!40000 ALTER TABLE `matches_users` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.matchtable: ~9 rows (aproximadamente)
DELETE FROM `matchtable`;
/*!40000 ALTER TABLE `matchtable` DISABLE KEYS */;
INSERT INTO `matchtable` (`match_id`, `end`, `finished`, `start`) VALUES
	(2, '2022-02-18 18:32:02.095000', b'1', '2022-02-18 18:00:02.095000'),
	(3, '2022-02-18 19:32:02.095000', b'0', '2022-02-18 18:50:02.095000'),
	(11, '2022-02-18 16:32:02.095000', b'0', '2022-02-18 15:50:02.095000'),
	(12, '2022-02-18 01:32:02.095000', b'0', '2022-02-18 01:50:02.095000'),
	(13, '2022-02-18 01:32:02.095000', b'0', '2022-02-18 01:50:02.095000'),
	(14, '2022-02-18 01:32:02.095000', b'0', '2022-02-18 01:50:02.095000'),
	(15, '2022-02-18 10:32:02.095000', b'0', '2022-02-18 00:32:02.095000'),
	(18, '2022-02-18 10:32:02.095000', b'0', '2022-02-18 00:32:02.095000'),
	(21, '2022-02-18 10:32:02.095000', b'0', '2022-02-18 00:32:02.095000');
/*!40000 ALTER TABLE `matchtable` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.ranking_table: ~3 rows (aproximadamente)
DELETE FROM `ranking_table`;
/*!40000 ALTER TABLE `ranking_table` DISABLE KEYS */;
INSERT INTO `ranking_table` (`id`, `name`) VALUES
	(1, 'bronze'),
	(2, 'silver'),
	(3, 'gold');
/*!40000 ALTER TABLE `ranking_table` ENABLE KEYS */;

-- Volcando datos para la tabla gamedatabase.usertable: ~4 rows (aproximadamente)
DELETE FROM `usertable`;
/*!40000 ALTER TABLE `usertable` DISABLE KEYS */;
INSERT INTO `usertable` (`user_id`, `email`, `nickname`, `username`, `ranking_id`) VALUES
	(1, 'juanjo@em.com', 'SuperJuanjo', 'Juanjo', NULL),
	(11, 'a@email.com', 'gallumboasesino', 'pablo', NULL),
	(16, 'ramon@em.com', 'vientogelido', 'ramon', NULL),
	(17, 'jamon@em.com', 'felido', 'alberto', NULL);
/*!40000 ALTER TABLE `usertable` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IFNULL(@OLD_FOREIGN_KEY_CHECKS, 1) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40111 SET SQL_NOTES=IFNULL(@OLD_SQL_NOTES, 1) */;
