/*
*/

USE test;

CREATE TABLE IF NOT EXISTS `Products` (
	`ID` INT UNSIGNED NOT NULL AUTO_INCREMENT,
	`section` VARCHAR(50) NULL DEFAULT NULL,
	`articleName` VARCHAR(50) NULL DEFAULT NULL,
	`price` DECIMAL(20,2) NULL DEFAULT NULL,
	`date` DATETIME NULL DEFAULT NULL,
	`country` VARCHAR(50) NULL DEFAULT NULL,
	`import` TINYINT(1) NULL DEFAULT NULL,
	PRIMARY KEY (`ID`)
)
COLLATE='utf8mb3_general_ci'
;


/* * * * * * */
INSERT INTO `test`.`products` 
    (`section`, `articleName`, `price`, `date`, `country`, `import`) 
    VALUES 
    ('Ferreteria', 'Desarmador', '30', '2022-04-21 17:58', 'China', '1'),
    ('Ferreteria', 'Sierra', '30', '2022-04-21 17:58', 'Mexico', '1'),
    ('Confeccion', 'Traje caballero', '500', '2022-03-21 17:58', 'Italia', '0'),
    ('Jugueteria', 'Pelota', '75', '2022-04-1 10:50', 'Francia', '0'),
    ('Deportes', 'Raqueta', '120', '2022-04-2 10:58', 'Mexico', '0'),
    ('Deportes', 'Guantes', '55', '2022-04-1 10:53', 'China', '1'),
    ('Ceramica', 'Florero', '3', '2022-04-1 7:08', 'Francia', '0'),
    ('Ferreteria', 'Pinzas', '45', '2022-04-3 10:08', 'Mexico', '0'),
    ('Ferreteria', 'Aceite', '12', '2022-04-11 10:08', 'USA', '1'),
    ('Jugueteria', 'Heroina', '9', '2022-04-11 10:03', 'China', '0'),
    ('Confeccion', 'Blusa', '3', '2022-04-12 17:00', 'Italia', '1'),
    ('Deportes', 'Tenis', '20', '2022-04-14 18:55', 'China', '0'),
    ('Deportes', 'Tenis', '20', '2022-04-14 18:59', 'China', '0')
    ;

