DROP TABLE IF EXISTS `tb_person`;
CREATE TABLE `tb_person` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(18) DEFAULT NULL,
  `sex` varchar(18) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `card_id` int(11) UNIQUE,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=utf8;


