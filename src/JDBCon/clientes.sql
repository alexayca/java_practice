USE test;

CREATE TABLE `clients` (
	`ID` INT(10) UNSIGNED NOT NULL AUTO_INCREMENT,
	`enterprise` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
	`address` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
	`state` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
	`phone` VARCHAR(10) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
	`responsibleName` VARCHAR(50) NULL DEFAULT NULL COLLATE 'utf8mb3_general_ci',
	`vip` TINYINT(1) NULL DEFAULT NULL,
	PRIMARY KEY (`ID`) USING BTREE
)
COLLATE='utf8mb3_general_ci'
;


INSERT INTO `clients` (`enterprise`, `address`, `state`, `phone`, `responsibleName`, `vip`) VALUES
	('Ferreteria Hnos.', 'conocido #50', 'Aguascalientes', '2220421758', 'Angel Miranda', 1),
	('La moderna', 'Sierra aconcahua #987', 'Puebla', '2220421175', 'Roberto Carlos', 1),
	('Confeccion', 'La otra calle #69', 'Sonora', '2022021178', 'Miguel Biden', 0),
	('Mexicana', 'Nicaragua #67', 'Yucatan', '2020411500', 'Vladimir Valdez', 0),
	('La casa del juguete', 'Bucarelli #12', 'Sonora', '2022042107', 'Bryan Chavez', 0),
	('Fernandez', 'Reforma #1000', 'Aguascalientes', '2102411053', 'Sara Smith', 1),
	('Deportes Mora', 'Flores #7', 'Yucatan', '2022041708', 'Alejandra Chong', 0),
	('Tiendas Felices', 'Rosas #90', 'Aguascalientes', '2220430891', 'Carmona Yepes', 0),
	('Linea curva', 'Martires de Rio blanco # 999', 'Yucatan', '2204110834', 'Rosario Guadalupe', 1),
	('Bazar de novedades', 'Heroina #876', 'Aguascalientes', '2022041103', 'Benedicto Pio', 0),
	('Confecciones importadas', 'Heroes de la historia #11', 'Mexico', '2022041217', 'Francisco Villa', 1),
	('Industrias Pio', 'Calle 13 # 13', 'Puebla', '2022041418', 'Bolivar', 0),
	('Computadoras reensambladas', 'Heroes de la historia #11', 'Mexico', '2022041217', 'Francisco Villa', 1),
	('Los Amigos ', 'Calle 1 # 1093', 'Morelos', '2552051418', 'Miguel Hidalgo', 0),
	('Esperanza y Fe', 'Constitucion de 1810', 'Puebla', '2999141859', 'Jonh Kenny', 0);

/* Procedimiento almacenado */
CREATE PROCEDURE muestraClientes()
    SELECT * FROM clients WHERE state='Aguascalientes'

// llamar a un procedimiento almacenado
CALL muestraCliente()

