-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-05-2025 a las 10:15:41
-- Versión del servidor: 10.4.32-MariaDB
-- Versión de PHP: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyecto`
--

DELIMITER $$
--
-- Funciones
--
CREATE DEFINER=`root`@`localhost` FUNCTION `contar_usuarios` () RETURNS INT(11) DETERMINISTIC BEGIN
    DECLARE total INT;
    SELECT COUNT(*) INTO total FROM usuarios;
    RETURN total;
END$$

CREATE DEFINER=`root`@`localhost` FUNCTION `obtener_usuarios` () RETURNS TEXT CHARSET utf8mb4 COLLATE utf8mb4_general_ci DETERMINISTIC BEGIN
    DECLARE lista TEXT DEFAULT '';

    -- Concatenar todos los usernames en una sola cadena
    SELECT GROUP_CONCAT(username SEPARATOR ', ') INTO lista FROM usuarios;

    RETURN lista;
END$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `compras`
--

CREATE TABLE `compras` (
  `id` int(11) NOT NULL,
  `usuario_id` int(11) NOT NULL,
  `juego_id` int(11) NOT NULL,
  `fecha_compra` timestamp NOT NULL DEFAULT current_timestamp()
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `historial_eliminaciones`
--

CREATE TABLE `historial_eliminaciones` (
  `id` int(11) NOT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `correo` varchar(100) DEFAULT NULL,
  `fecha` timestamp NOT NULL DEFAULT current_timestamp(),
  `usuario_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `historial_eliminaciones`
--

INSERT INTO `historial_eliminaciones` (`id`, `usuario`, `correo`, `fecha`, `usuario_id`) VALUES
(1, 'alvan', 'alfonso@gmail.com', '2025-05-25 14:09:40', NULL),
(2, 'alvana', 'alfonsa@gmail.com', '2025-05-25 14:15:08', NULL),
(3, 'fonsi', 'aaa@gmail.com', '2025-05-25 14:21:07', NULL),
(4, 'alvan', 'alfonso@gmail.com', '2025-05-25 18:10:36', NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `juegos`
--

CREATE TABLE `juegos` (
  `id` int(11) NOT NULL,
  `titulo` varchar(100) NOT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `plataforma` varchar(50) DEFAULT NULL,
  `precio` decimal(6,2) DEFAULT NULL,
  `fecha_lanzamiento` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `juegos`
--

INSERT INTO `juegos` (`id`, `titulo`, `genero`, `plataforma`, `precio`, `fecha_lanzamiento`) VALUES
(1, 'Grand Theft Auto V', 'Acción', 'PC', 59.99, '2013-09-17'),
(2, 'Assasins Creed Shadows', 'Accion', 'Xbox, PC', 69.99, '2025-03-20'),
(3, 'FC 25', 'Deportes', 'Xbox, PC, PS5, Switch', 69.99, '2024-09-27'),
(4, 'Call Of Duty Black Ops 6', 'Accion', 'Xbox, PC, PS5, Switch', 79.99, '2024-10-25'),
(5, 'Black Myth Wukong', 'Accion', 'Xbox, PS5', 59.99, '2024-08-20'),
(6, 'NBA 2K25', 'Deportes', 'PC, Switch', 69.99, '2024-09-06'),
(7, 'Super Mario Bros. Wonder', 'Plataformas', 'Switch', 59.99, '2023-10-20'),
(8, 'Super Mario Party Jamboree', 'Fiesta', 'Switch', 59.99, '2024-10-17'),
(9, 'Monster Hunter Wilds', 'Rol', 'PS5', 59.99, '2025-02-28'),
(10, 'The Elder Scrolls IV Oblivion Remastered', 'Rol', 'PC', 69.99, '2025-04-22');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuarios`
--

CREATE TABLE `usuarios` (
  `id` int(11) NOT NULL,
  `username` varchar(50) NOT NULL,
  `nombre` varchar(50) NOT NULL,
  `apellido` varchar(50) NOT NULL,
  `email` varchar(100) NOT NULL,
  `pais` varchar(50) DEFAULT NULL,
  `genero` varchar(50) DEFAULT NULL,
  `pin` varchar(4) DEFAULT NULL,
  `password` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuarios`
--

INSERT INTO `usuarios` (`id`, `username`, `nombre`, `apellido`, `email`, `pais`, `genero`, `pin`, `password`) VALUES
(9, 'qfsafsa', 'afsasfsaafs', 'afsasfsafsa', 'ada@gmail.com', 'Arabia Saudita', 'Hombre', '1234', 'Mhera'),
(10, 'afsahfiuhkau', 'hfuhuaklfa', 'fnlanlnfasl', 'alfosnso@gmail.com', 'Afganistán', 'Hombre', '1234', 'Mhero1'),
(11, 'PabloBg', 'Pablo', 'Dominguez Suarez', 'socialismo@gmail.com', 'Afganistán', 'Hombre', '3333', 'Socialismo2323'),
(12, 'adsa', 'dasadasdads', 'dasasd', 'adsasdads', 'Afganistán', 'Hombre', '1243', 'adsdas'),
(13, 'ADADS', 'ADSADS', 'ADSADS', 'ADSADS', 'Afganistán', 'Hombre', '1231', 'ADSADS'),
(18, 'asda', 'adasda', 'asddas', 'asdasda', 'Afganistán', 'Hombre', '1133', 'adsad'),
(19, 'adssd', 'asdasd', 'asdasd', 'araraa', 'Afganistán', 'Hombre', '0410', '1rwq'),
(21, 'adsads', 'adsadsasd', 'asdsadd', 'dasasdasd', 'Afganistán', 'Hombre', '1223', 'asdas'),
(22, 'fssaf', 'afsasfsaf', 'aafasf', 'afsafs', 'Afganistán', 'Hombre', '1241', 'afasf'),
(23, 'dasdasd', 'adsas', 'adasddas', 'adsasdsad', 'Afganistán', 'Hombre', '1231', 'adasa'),
(27, 'fdafda', 'asdasdnk', 'adsasd', 'alfon@gmail.com', 'Afganistán', 'Hombre', '1212', 'adsasd'),
(28, 'fsfa', 'afssaf', 'afsasf', 'asfafaa', 'Afganistán', 'Hombre', '1241', 'afafa'),
(32, 'adsasd', 'dassdad', 'asdasd', 'asdsada', 'Afganistán', 'Hombre', '1423', 'adsasd'),
(33, 'asdasda', 'adsasda', 'adsada', 'alfonsito@gmail.com', 'Afganistán', 'Hombre', '3425', 'adas'),
(36, 'alfon', 'alfonso', 'barrios', 'alfonso@gmail.com', 'Afganistán', 'Hombre', '0410', 'Qwaszxk2004');

--
-- Disparadores `usuarios`
--
DELIMITER $$
CREATE TRIGGER `registrar_eliminacion` AFTER DELETE ON `usuarios` FOR EACH ROW INSERT INTO historial_eliminaciones (usuario, correo, fecha) 
VALUES (OLD.username, OLD.email, NOW())
$$
DELIMITER ;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `compras`
--
ALTER TABLE `compras`
  ADD PRIMARY KEY (`id`),
  ADD KEY `usuario_id` (`usuario_id`),
  ADD KEY `juego_id` (`juego_id`);

--
-- Indices de la tabla `historial_eliminaciones`
--
ALTER TABLE `historial_eliminaciones`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk_usuario` (`usuario_id`);

--
-- Indices de la tabla `juegos`
--
ALTER TABLE `juegos`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`),
  ADD UNIQUE KEY `nombre` (`nombre`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `compras`
--
ALTER TABLE `compras`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `historial_eliminaciones`
--
ALTER TABLE `historial_eliminaciones`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT de la tabla `juegos`
--
ALTER TABLE `juegos`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT de la tabla `usuarios`
--
ALTER TABLE `usuarios`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=37;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `compras`
--
ALTER TABLE `compras`
  ADD CONSTRAINT `compras_ibfk_1` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE,
  ADD CONSTRAINT `compras_ibfk_2` FOREIGN KEY (`juego_id`) REFERENCES `juegos` (`id`) ON DELETE CASCADE;

--
-- Filtros para la tabla `historial_eliminaciones`
--
ALTER TABLE `historial_eliminaciones`
  ADD CONSTRAINT `fk_usuario` FOREIGN KEY (`usuario_id`) REFERENCES `usuarios` (`id`) ON DELETE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
