-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 24-08-2023 a las 02:40:38
-- Versión del servidor: 10.4.28-MariaDB
-- Versión de PHP: 8.1.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `poo_p3_game_flappybird`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `points_top`
--

CREATE TABLE `points_top` (
  `id` int(11) NOT NULL,
  `nombre` varchar(150) NOT NULL,
  `puntaje` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `points_top`
--

INSERT INTO `points_top` (`id`, `nombre`, `puntaje`) VALUES
(57, 'hola', 0),
(58, 'Tu Nombre', 0),
(59, 'hola', 0),
(60, 'killer', 0),
(61, 'holaqqq', 1),
(62, 'hola xd', 1),
(63, 'hola xd', 1),
(64, 'pruebaaa', 1),
(65, 'quiensabe', 5),
(66, 'hkjuhgggg', 6),
(67, 'jajajja', 5),
(68, 'pppas', 3),
(69, 'erickpro', 0),
(70, 'elpapuuu', 12);

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `points_top`
--
ALTER TABLE `points_top`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `points_top`
--
ALTER TABLE `points_top`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=71;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
