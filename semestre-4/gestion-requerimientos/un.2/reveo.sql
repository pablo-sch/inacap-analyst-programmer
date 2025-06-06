-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-10-2019 a las 22:30:15
-- Versión del servidor: 10.4.6-MariaDB
-- Versión de PHP: 7.3.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `reveo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `ciudad`
--

CREATE TABLE `ciudad` (
  `ID_CIUDAD` int(2) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `color`
--

CREATE TABLE `color` (
  `ID_COLOR` int(2) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `marca`
--

CREATE TABLE `marca` (
  `ID_MARCA` int(3) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `metodo_pago`
--

CREATE TABLE `metodo_pago` (
  `ID_METODO_PAGO` int(2) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `HABILITADO` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `modelo`
--

CREATE TABLE `modelo` (
  `ID_MODELO` int(3) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `ID_MARCA` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `propietario`
--

CREATE TABLE `propietario` (
  `RUT` varchar(10) COLLATE utf32_spanish2_ci NOT NULL,
  `NOMBRES` varchar(20) COLLATE utf32_spanish2_ci NOT NULL,
  `APELLIDO_PATERNO` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `APELLIDO_MATERNO` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `DIRECCION` varchar(25) COLLATE utf32_spanish2_ci NOT NULL,
  `CORREO` varchar(15) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `ID_CIUDAD` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `registro`
--

CREATE TABLE `registro` (
  `FOLIO` int(12) NOT NULL,
  `FECHA` date NOT NULL,
  `HORA` time NOT NULL,
  `ESTADO_FINAL` tinyint(1) DEFAULT NULL,
  `TOTAL` int(5) NOT NULL,
  `LLEVADOR` varchar(25) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `RUT_USUARIO` varchar(10) COLLATE utf32_spanish2_ci NOT NULL,
  `RUT_PROPIETARIO` varchar(10) COLLATE utf32_spanish2_ci NOT NULL,
  `PATENTE_VEHICULO` varchar(8) COLLATE utf32_spanish2_ci NOT NULL,
  `ID_METODO_PAGO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `revision`
--

CREATE TABLE `revision` (
  `ID_REVISION` int(12) NOT NULL,
  `MEDICION` double NOT NULL,
  `ESTADO` tinyint(1) NOT NULL,
  `OBSERVACION` varchar(150) COLLATE utf32_spanish2_ci DEFAULT NULL,
  `FOLIO_REGISTRO` int(12) NOT NULL,
  `ID_TIPO_REVISION` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_revision`
--

CREATE TABLE `tipo_revision` (
  `ID_TIPO_REVISION` int(2) NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `PARAMETRO_INICIO` double NOT NULL,
  `PARAMETRO_FINAL` double NOT NULL,
  `ID_TIPO_VEHICULO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipo_vehiculo`
--

CREATE TABLE `tipo_vehiculo` (
  `ID_TIPO_VEHICULO` int(2) NOT NULL,
  `CATEGORIA` varchar(15) COLLATE utf32_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `usuario`
--

CREATE TABLE `usuario` (
  `RUT` varchar(10) COLLATE utf32_spanish2_ci NOT NULL,
  `NOMBRE` varchar(15) COLLATE utf32_spanish2_ci NOT NULL,
  `CONTRASENIA` varchar(10) COLLATE utf32_spanish2_ci NOT NULL,
  `CARGO` varchar(15) COLLATE utf32_spanish2_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `vehiculo`
--

CREATE TABLE `vehiculo` (
  `PATENTE` varchar(8) COLLATE utf32_spanish2_ci NOT NULL,
  `ANIO` int(4) NOT NULL,
  `NUMERO_MOTOR` varchar(30) COLLATE utf32_spanish2_ci NOT NULL,
  `NUMERO_CHASIS` varchar(30) COLLATE utf32_spanish2_ci NOT NULL,
  `ID_MODELO` int(3) NOT NULL,
  `ID_COLOR` int(2) NOT NULL,
  `ID_TIPO_VEHICULO` int(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_spanish2_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  ADD PRIMARY KEY (`ID_CIUDAD`);

--
-- Indices de la tabla `color`
--
ALTER TABLE `color`
  ADD PRIMARY KEY (`ID_COLOR`);

--
-- Indices de la tabla `marca`
--
ALTER TABLE `marca`
  ADD PRIMARY KEY (`ID_MARCA`);

--
-- Indices de la tabla `metodo_pago`
--
ALTER TABLE `metodo_pago`
  ADD PRIMARY KEY (`ID_METODO_PAGO`);

--
-- Indices de la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD PRIMARY KEY (`ID_MODELO`),
  ADD KEY `ID_MARCA` (`ID_MARCA`);

--
-- Indices de la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD PRIMARY KEY (`RUT`),
  ADD KEY `ID_CIUDAD` (`ID_CIUDAD`);

--
-- Indices de la tabla `registro`
--
ALTER TABLE `registro`
  ADD PRIMARY KEY (`FOLIO`),
  ADD KEY `RUT_USUARIO` (`RUT_USUARIO`),
  ADD KEY `RUT_PROPIETARIO` (`RUT_PROPIETARIO`),
  ADD KEY `PATENTE_VEHICULO` (`PATENTE_VEHICULO`),
  ADD KEY `ID_METODO_PAGO` (`ID_METODO_PAGO`);

--
-- Indices de la tabla `revision`
--
ALTER TABLE `revision`
  ADD PRIMARY KEY (`ID_REVISION`),
  ADD KEY `FOLIO_REGISTRO` (`FOLIO_REGISTRO`),
  ADD KEY `ID_TIPO_REVISION` (`ID_TIPO_REVISION`);

--
-- Indices de la tabla `tipo_revision`
--
ALTER TABLE `tipo_revision`
  ADD PRIMARY KEY (`ID_TIPO_REVISION`),
  ADD KEY `ID_TIPO_VEHICULO` (`ID_TIPO_VEHICULO`);

--
-- Indices de la tabla `tipo_vehiculo`
--
ALTER TABLE `tipo_vehiculo`
  ADD PRIMARY KEY (`ID_TIPO_VEHICULO`);

--
-- Indices de la tabla `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`RUT`);

--
-- Indices de la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD PRIMARY KEY (`PATENTE`),
  ADD KEY `ID_MODELO` (`ID_MODELO`),
  ADD KEY `ID_COLOR` (`ID_COLOR`),
  ADD KEY `ID_TIPO_VEHICULO` (`ID_TIPO_VEHICULO`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `ciudad`
--
ALTER TABLE `ciudad`
  MODIFY `ID_CIUDAD` int(2) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `color`
--
ALTER TABLE `color`
  MODIFY `ID_COLOR` int(2) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `marca`
--
ALTER TABLE `marca`
  MODIFY `ID_MARCA` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `metodo_pago`
--
ALTER TABLE `metodo_pago`
  MODIFY `ID_METODO_PAGO` int(2) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `modelo`
--
ALTER TABLE `modelo`
  MODIFY `ID_MODELO` int(3) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `registro`
--
ALTER TABLE `registro`
  MODIFY `FOLIO` int(12) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `revision`
--
ALTER TABLE `revision`
  MODIFY `ID_REVISION` int(12) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_revision`
--
ALTER TABLE `tipo_revision`
  MODIFY `ID_TIPO_REVISION` int(2) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `tipo_vehiculo`
--
ALTER TABLE `tipo_vehiculo`
  MODIFY `ID_TIPO_VEHICULO` int(2) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `modelo`
--
ALTER TABLE `modelo`
  ADD CONSTRAINT `modelo_ibfk_1` FOREIGN KEY (`ID_MARCA`) REFERENCES `marca` (`ID_MARCA`);

--
-- Filtros para la tabla `propietario`
--
ALTER TABLE `propietario`
  ADD CONSTRAINT `propietario_ibfk_1` FOREIGN KEY (`ID_CIUDAD`) REFERENCES `ciudad` (`ID_CIUDAD`);

--
-- Filtros para la tabla `registro`
--
ALTER TABLE `registro`
  ADD CONSTRAINT `registro_ibfk_1` FOREIGN KEY (`RUT_USUARIO`) REFERENCES `usuario` (`RUT`),
  ADD CONSTRAINT `registro_ibfk_2` FOREIGN KEY (`RUT_PROPIETARIO`) REFERENCES `propietario` (`RUT`),
  ADD CONSTRAINT `registro_ibfk_3` FOREIGN KEY (`PATENTE_VEHICULO`) REFERENCES `vehiculo` (`PATENTE`),
  ADD CONSTRAINT `registro_ibfk_4` FOREIGN KEY (`ID_METODO_PAGO`) REFERENCES `metodo_pago` (`ID_METODO_PAGO`);

--
-- Filtros para la tabla `revision`
--
ALTER TABLE `revision`
  ADD CONSTRAINT `revision_ibfk_1` FOREIGN KEY (`FOLIO_REGISTRO`) REFERENCES `registro` (`FOLIO`),
  ADD CONSTRAINT `revision_ibfk_2` FOREIGN KEY (`ID_TIPO_REVISION`) REFERENCES `tipo_revision` (`ID_TIPO_REVISION`);

--
-- Filtros para la tabla `tipo_revision`
--
ALTER TABLE `tipo_revision`
  ADD CONSTRAINT `tipo_revision_ibfk_1` FOREIGN KEY (`ID_TIPO_VEHICULO`) REFERENCES `tipo_vehiculo` (`ID_TIPO_VEHICULO`);

--
-- Filtros para la tabla `vehiculo`
--
ALTER TABLE `vehiculo`
  ADD CONSTRAINT `vehiculo_ibfk_1` FOREIGN KEY (`ID_MODELO`) REFERENCES `modelo` (`ID_MODELO`),
  ADD CONSTRAINT `vehiculo_ibfk_2` FOREIGN KEY (`ID_COLOR`) REFERENCES `color` (`ID_COLOR`),
  ADD CONSTRAINT `vehiculo_ibfk_3` FOREIGN KEY (`ID_TIPO_VEHICULO`) REFERENCES `tipo_vehiculo` (`ID_TIPO_VEHICULO`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
