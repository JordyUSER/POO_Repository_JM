-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3307
-- Tiempo de generación: 09-08-2023 a las 19:57:57
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
-- Base de datos: `jordy_db`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `estudiantes`
--

CREATE TABLE `estudiantes` (
  `id` int(11) NOT NULL,
  `estuCedula` int(11) NOT NULL,
  `estuNombre` varchar(40) NOT NULL,
  `estuApellido` varchar(40) NOT NULL,
  `estuAsignatura` varchar(40) NOT NULL,
  `estuPromedio` double NOT NULL,
  `estuEstado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `estudiantes`
--

INSERT INTO `estudiantes` (`id`, `estuCedula`, `estuNombre`, `estuApellido`, `estuAsignatura`, `estuPromedio`, `estuEstado`) VALUES
(2, 67676734, 'TEST', 'TESTAPE', 'POO', 13, 'Aprobado'),
(3, 2343, 'Jordy', 'Mejia', 'POO', 18.4, 'Aprobado'),
(4, 2343, 'Jordy', 'Mejia', 'POO', 18.4, 'Aprobado'),
(6, 2343, 'Jordy', 'Mejia', 'POO', 18.4, 'Aprobado'),
(7, 2343, 'Jordy', 'Mejia', 'POO', 18.4, 'Aprobado');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `horario`
--

CREATE TABLE `horario` (
  `id` int(11) NOT NULL,
  `labNombre` varchar(40) NOT NULL,
  `labHorarioIn` varchar(40) NOT NULL,
  `labHorarioOut` varchar(40) NOT NULL,
  `labDepartamento` varchar(40) NOT NULL,
  `labDia` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `horario`
--

INSERT INTO `horario` (`id`, `labNombre`, `labHorarioIn`, `labHorarioOut`, `labDepartamento`, `labDia`) VALUES
(1, 'LABGOD', 'asdasf', 'sfasfasf', 'Ciencias Exactas', 'Lunes'),
(2, 'fsasfas', 'saasassf', 'sfasa', 'Ciencias Humanas', 'Miercoles'),
(5, 'LABGOD', 'asdasf', 'sfasfasf', 'Ciencias Exactas', 'Lunes');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `profesor`
--

CREATE TABLE `profesor` (
  `id` bigint(20) NOT NULL,
  `profCedula` bigint(20) NOT NULL,
  `profNombre` varchar(40) NOT NULL,
  `profApellido` varchar(40) NOT NULL,
  `profCelular` bigint(20) NOT NULL,
  `profMail` varchar(40) NOT NULL,
  `profTitulo` varchar(40) NOT NULL,
  `profEstado` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `profesor`
--

INSERT INTO `profesor` (`id`, `profCedula`, `profNombre`, `profApellido`, `profCelular`, `profMail`, `profTitulo`, `profEstado`) VALUES
(2, 132412, 'Jordy', 'Mejia', 4239234, 'sjdasd@asafas.com', 'Ingeniero', 'Tiempo Completo'),
(3, 2412424, 'asfasfasf', 'safasf', 124241, 'sdasf@sfasfsa.com', 'fasfasf', 'Tiempo Completo'),
(5, 132412, 'Jordy', 'Mejia', 4239234, 'sjdasd@asafas.com', 'Ingeniero', 'Tiempo Completo'),
(6, 132412, 'Jordy', 'Mejia', 4239234, 'sjdasd@asafas.com', 'Ingeniero', 'Tiempo Completo');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `id` int(11) NOT NULL,
  `userUsuario` varchar(40) NOT NULL,
  `userPass` varchar(40) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `usuario`
--

INSERT INTO `usuario` (`id`, `userUsuario`, `userPass`) VALUES
(1, 'Jordy', '123'),
(2, 'Paul', '123');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `horario`
--
ALTER TABLE `horario`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `profesor`
--
ALTER TABLE `profesor`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `estudiantes`
--
ALTER TABLE `estudiantes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT de la tabla `horario`
--
ALTER TABLE `horario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de la tabla `profesor`
--
ALTER TABLE `profesor`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
