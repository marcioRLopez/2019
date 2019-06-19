-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1:3306
-- Tiempo de generación: 19-06-2019 a las 18:39:28
-- Versión del servidor: 5.7.26
-- Versión de PHP: 7.2.18

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `veterinaria2019`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `atencion`
--

DROP TABLE IF EXISTS `atencion`;
CREATE TABLE IF NOT EXISTS `atencion` (
  `id_atencion` varchar(12) NOT NULL,
  `fecha_atencion` date NOT NULL,
  `diagnostico` varchar(255) NOT NULL,
  `observacion` varchar(255) NOT NULL,
  `mascota` varchar(20) NOT NULL,
  `propietario_mascota` varchar(20) NOT NULL,
  `medicamento` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_atencion`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `doctor`
--

DROP TABLE IF EXISTS `doctor`;
CREATE TABLE IF NOT EXISTS `doctor` (
  `nombre_usuario` varchar(12) NOT NULL,
  `password` varchar(12) NOT NULL,
  `correo_electronico` varchar(54) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  `persona` varchar(10) NOT NULL,
  PRIMARY KEY (`nombre_usuario`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Volcado de datos para la tabla `doctor`
--

INSERT INTO `doctor` (`nombre_usuario`, `password`, `correo_electronico`, `estado`, `persona`) VALUES
('jose', 'jose', 'jose@veterinaria.com', 1, '1');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `mascota`
--

DROP TABLE IF EXISTS `mascota`;
CREATE TABLE IF NOT EXISTS `mascota` (
  `id_mascota` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `especie` varchar(20) NOT NULL,
  `sexo` varchar(1) NOT NULL,
  `raza` varchar(20) NOT NULL,
  `fecha_nacimiento` date NOT NULL,
  `peso` int(11) NOT NULL,
  `estado` tinyint(4) NOT NULL,
  PRIMARY KEY (`id_mascota`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicamento`
--

DROP TABLE IF EXISTS `medicamento`;
CREATE TABLE IF NOT EXISTS `medicamento` (
  `id_medicamento` int(11) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `fecha_vencimiento` date NOT NULL,
  `descripcion` varchar(255) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_medicamento`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietariomascota`
--

DROP TABLE IF EXISTS `propietariomascota`;
CREATE TABLE IF NOT EXISTS `propietariomascota` (
  `dni` int(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `apellido` varchar(20) NOT NULL,
  `direccion` varchar(50) NOT NULL,
  `telefono` int(10) NOT NULL,
  `correo` varchar(60) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`dni`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vacuna`
--

DROP TABLE IF EXISTS `vacuna`;
CREATE TABLE IF NOT EXISTS `vacuna` (
  `id_vacuna` int(12) NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `tipo_vacuna` varchar(20) NOT NULL,
  `estado` tinyint(1) NOT NULL,
  PRIMARY KEY (`id_vacuna`)
) ENGINE=MyISAM DEFAULT CHARSET=latin1;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
