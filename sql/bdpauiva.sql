-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-06-2024 a las 19:51:04
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
-- Base de datos: `bdpauiva`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `analisisderiesgo`
--

CREATE TABLE `analisisderiesgo` (
  `idanalisis` int(11) NOT NULL,
  `listaclinton` varchar(11) DEFAULT NULL,
  `centralesriesgo` varchar(11) DEFAULT NULL,
  `certificado` varchar(11) DEFAULT NULL,
  `inmueble` int(11) DEFAULT NULL,
  `pago` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `analisisderiesgo`
--

INSERT INTO `analisisderiesgo` (`idanalisis`, `listaclinton`, `centralesriesgo`, `certificado`, `inmueble`, `pago`) VALUES
(1, 'No', 'Bajo', 'Cert001', 1, 1),
(2, 'Si', 'Medio', 'cert002', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avaluo`
--

CREATE TABLE `avaluo` (
  `idavaluo` int(11) NOT NULL,
  `valor` varchar(30) DEFAULT NULL,
  `inmueble` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `avaluo`
--

INSERT INTO `avaluo` (`idavaluo`, `valor`, `inmueble`) VALUES
(1, '$2.000.000', 1),
(2, '$1.500.000', 2),
(3, '$100.000.000', 3);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `citas`
--

CREATE TABLE `citas` (
  `idcitas` int(11) NOT NULL,
  `fecha` varchar(10) DEFAULT NULL,
  `estado` varchar(10) DEFAULT NULL,
  `inmueble` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `citas`
--

INSERT INTO `citas` (`idcitas`, `fecha`, `estado`, `inmueble`) VALUES
(1, '15/06/2024', 'Bueno', 1),
(2, '20/06/2024', 'Medio', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clientes`
--

CREATE TABLE `clientes` (
  `idcliente` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `razon_social` varchar(50) DEFAULT NULL,
  `nit` varchar(30) DEFAULT NULL,
  `tipocliente` int(11) DEFAULT NULL,
  `telefono` varchar(20) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idcliente`, `nombre`, `apellido`, `razon_social`, `nit`, `tipocliente`, `telefono`, `correo`) VALUES
(1, 'Nixon', 'Duarte', NULL, NULL, 1, '1234567891', 'Nixonduarte@inaplesinmo.com'),
(2, 'Nicole', 'Vargas', NULL, NULL, 1, '235651212', 'NVargas@inaplesinmo.com'),
(44, 'ewewqasd', 'acqwcqwc', NULL, NULL, 1, '12222144', 'cascaxzzcxc@hotmail.com'),
(45, 'eeeeeqwqwe', 'qwqwqwqw', NULL, NULL, 1, '1597844', 'qwqsdafa@gmail.com'),
(46, NULL, NULL, 'eeeeewwww', 'wwwwwww', 2, '1597444', 'qweqwe@gmail.com'),
(47, 'mmmmmm', 'mmmmmmm', NULL, NULL, 1, '15977444', 'aaaa@gmail.com'),
(48, 'aaaaaa', 'aaaae', NULL, NULL, 1, '365544', '222323@gmail.com'),
(52, 'Ivan David', 'Sierra Cudriz', NULL, NULL, 1, '3103238798', 'ivansierra259@gmail.com'),
(53, NULL, NULL, 'empresa chamo', '4448877777', 3, '98777745', 'chamo@gmail.com'),
(54, 'aaa', 'aaaaaaa', NULL, NULL, 1, '1544444', 'pppppp'),
(55, NULL, NULL, 'asdasd', 'eeeeee', 3, '2226655', 'asdasd@gmail.com'),
(56, 'aaaaaa', 'aaadasd', NULL, NULL, 1, '1547777', 'asdasda@gmail.com'),
(57, 'qqqwwww', 'eeeeeeeeeee', NULL, NULL, 1, '154444', 'asdasd@gmail.com'),
(58, 'asdeqqqq', 'sddddsd', NULL, NULL, 1, '1515444', 'asdasdxcs@gmail.com'),
(59, NULL, NULL, 'aaaaa', '151545454545', 2, '15444447', 'sdasda@gmailk.com'),
(60, NULL, NULL, 'empresa ola', '11444444', 2, '154447877', 'ola2333@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleados`
--

CREATE TABLE `empleados` (
  `idempleado` int(11) NOT NULL,
  `nombre` varchar(20) DEFAULT NULL,
  `apellido` varchar(20) DEFAULT NULL,
  `tipoempleado` int(11) DEFAULT NULL,
  `oficina` int(11) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idempleado`, `nombre`, `apellido`, `tipoempleado`, `oficina`, `correo`) VALUES
(1, 'Martha', 'Gonzales', 1, 1, 'm.gonzales@inaplesinmo.com'),
(2, 'Juan', 'Perez', 2, 1, 'juan.Perez@inaplesinmo.com'),
(3, 'Alejandro', 'Robles', 2, 2, 'alejarobles145@gmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `idinmueble` int(11) NOT NULL,
  `tipoinmueble` int(11) DEFAULT NULL,
  `tituloinmueble` varchar(100) DEFAULT NULL,
  `estado` varchar(20) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `habitaciones` int(11) DEFAULT NULL,
  `banos` int(11) DEFAULT NULL,
  `garajes` int(11) DEFAULT NULL,
  `estrato` int(11) DEFAULT NULL,
  `area` varchar(50) DEFAULT NULL,
  `propietario` int(11) DEFAULT NULL,
  `foto` varchar(500) DEFAULT NULL,
  `pago` int(11) DEFAULT NULL,
  `comercial` int(11) DEFAULT NULL,
  `valor` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `inmueble`
--

INSERT INTO `inmueble` (`idinmueble`, `tipoinmueble`, `tituloinmueble`, `estado`, `direccion`, `descripcion`, `habitaciones`, `banos`, `garajes`, `estrato`, `area`, `propietario`, `foto`, `pago`, `comercial`, `valor`) VALUES
(1, 1, 'Casa ubicada en Calle 100', 'Venta', 'Calle 100', 'Ubicada en un exclusivo barrio residencial, esta impresionante residencia de estrato alto combina elegancia y confort en cada detalle. Con una arquitectura moderna y acabados de lujo, la propiedad se extiende sobre aproximadamente 800 metros cuadrados. Sus espacios interiores incluyen una amplia sala de estar con techos altos y chimenea central, un comedor formal diseñado para grandes reuniones, y una cocina gourmet equipada con electrodomésticos de última generación y encimeras de mármol. Además, cuenta con varias suites principales y adicionales, todas con baños privados y armarios empotrados, un estudio o biblioteca, una sala de cine en casa, sala de juegos con mesa de billar, gimnasio privado y áreas de entretenimiento al aire libre. Los exteriores están diseñados con amplios jardines paisajísticos, terrazas cubiertas y descubiertas con vistas panorámicas, una piscina climatizada con jacuzzi, y un garaje privado para varios vehículos. Equipada con suelos de mármol, iluminación LED, climatización central y sistemas de seguridad avanzados, esta propiedad representa el epitome del lujo residencial, valorada por su ubicación exclusiva y todas las comodidades que ofrece.', 4, 2, 1, 3, '450.30cm3', 2, 'inmueble-destacada1.jpg', 1, 1, '$100.000.000'),
(2, 2, 'Apartamento en la Calle 8', 'Arriendo', '76a40 Cl. 8a', 'La propiedad evaluada es una casa unifamiliar de dos pisos, ubicada en Calle Principal de Castilla,en la ciudad de Bogota D.C,Colombia. La estructura está construida con concreto armado y tiene un área total de 200 metros cuadrados. La casa cuenta con cuatro habitaciones, tres baños completos, cocina, sala de estar, comedor y un garaje para dos vehículos. Está equipada con sistemas de calefacción central y aire acondicionado.', 3, 1, 0, 3, '250.00cm3', 1, 'inmueble-destacada2.jpg', 2, 2, '$800.000'),
(3, 1, 'Casa ubicada en la 30', 'Venta', 'Cra. 33 # 40 - 15', 'casa muy buena', 2, 1, 0, 2, '120.00cm3', 52, 'inmueble-destacada3.jpg', 2, 3, '$1.200.000'),
(4, 2, 'Apartamento ubicado en Cedritos', 'Venta', 'Bogotá / Cedritos', 'Casa en cedritos', 3, 2, 0, 4, '120.00cm3', 44, 'casa-cedritos.JPG', 1, 1, '$450.000.000'),
(5, 1, 'Casa ubicada en la Calle 100', 'Venta', 'Bogotá / Calle 100', 'Casa en la calle 100', 3, 2, 1, 4, '120.0cm3', 2, 'Casa-calle100.JPG', 2, 3, '$1.100.000.000'),
(6, 1, 'Casa ubicada en Engativa', 'Venta', 'Bogotá/Engativa', 'Casa ubicada en Engativa', 2, 1, 0, 3, '210.20cm3', 52, 'casa-engativa.jpg', 2, 1, '$2.100.000.000'),
(7, 1, 'Casa ubicada en Kennedy', 'Venta', 'Bogotá/ Kennedy', 'Casa en Kennedy', 2, 1, 1, 3, '129.02cm3', 2, 'casa-kennedy.JPG', 2, 2, '$100.000.000'),
(8, 1, 'Casa ubicada en Colina Campestre', 'Venta', 'Bogotá / Colina Campestre', 'Casa en Colina Campestre', 4, 3, 2, 4, '350.20cm3', 52, 'casa-colina.JPG', 2, 2, '$500.000.000'),
(9, 1, 'Casa ubicada en Barrios Unidos', 'Venta', 'Bogotá / Barrios Unidos', 'Casa en Barrios Unidos', 2, 1, 0, 3, '120.35cm3', 2, 'casa-barriosunidos.JPG', 1, 3, '$240.000.000'),
(10, 3, 'Lote ubicado en Bosa', 'Venta', 'Bogotá / Bosa', 'Lote en Bosa', 0, 0, 0, 3, '125.00cm3', 52, 'lote-bosa.JPG', 1, 2, '$150.000.000'),
(11, 1, 'Casa ubicada en Castilla', 'Venta', 'Bogotá / Castilla', 'Casa en Castilla', 4, 2, 1, 3, '250.20cm3', 1, 'casa-castilla.JPG', 1, 3, '$150.000.000'),
(12, 2, 'Apartamento ubicado en Centro de Niza', 'Venta', 'Bogotá /  Centro de Niza', 'Apartamento ubicado en Centro de niza', 2, 1, 0, 2, '120.00cm3', 52, 'Venta11.JPG', 1, 3, '$1.997.000.000'),
(13, 1, 'Casa ubicada en Villa del Prado', 'Venta', 'Bogotá / Villa del Prado', 'Casa en Villa del Prado', 2, 1, 0, 3, '126.20cm3', 52, 'Venta12.JPG', 1, 2, '$400.000.000'),
(14, 1, 'Casa ubicada en La Floresta', 'Venta', 'Bogotá / La floresta', 'Casa en La Floresta', 3, 1, 1, 3, '129.35cm3', 52, 'Venta13.JPG', 1, 3, '$719.000.000'),
(15, 1, 'Casa ubicada en Bosa', 'Venta', 'Bogotá / Bosa', 'Casa en Bosa', 2, 1, 0, 3, '124.20cm3', 2, 'Venta14.JPG', 1, 3, '$350.000.000'),
(16, 2, 'Apartamento ubicado en Santa Ana', 'Venta', 'Bogotá / Santa Ana', 'Apartamento en Santa Ana', 2, 1, 0, 3, '160.20cm3', 52, 'Venta15.JPG', 1, 3, '$600.000.000');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pagos`
--

CREATE TABLE `pagos` (
  `idpagos` int(11) NOT NULL,
  `tipopago` int(11) DEFAULT NULL,
  `consignacion` varchar(30) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `pagos`
--

INSERT INTO `pagos` (`idpagos`, `tipopago`, `consignacion`, `descripcion`, `cliente`) VALUES
(1, 2, 'Consignacion001', 'Comprobante de Consignación:\r\n\r\nFecha: 15 de junio de 2024\r\n\r\nNombre del Consignante: Nixon Duarte\r\nID: 1\r\nNombre del Beneficiario: Juan Perez\r\nBanco: Banco ABC\r\nTipo de Cuenta: Cuenta de Ahorros\r\nNúmero de Cuenta: 1234567890\r\nConcepto: Pago de casa ubicada en Calle 100,Bogotá D.C\r\nMonto: $200,000,000', 1),
(2, 2, 'Consignacion002', 'Comprobante de Consignación:\r\n\r\nFecha: 20 de junio de 2024\r\n\r\nNombre del Consignante:Nicole Vargas\r\nID: 2\r\nNombre del Beneficiario: Martha Gomez\r\nBanco: Banco ABC\r\nTipo de Cuenta: Cuenta de Ahorros\r\nNúmero de Cuenta: 1234567890\r\nConcepto: Pago de casa ubicada en Calle 76a40 Cl. 8a Castilla,Bogotá D.C\r\nMonto: $300,000,000', 2);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `sucursales`
--

CREATE TABLE `sucursales` (
  `idsucursales` int(11) NOT NULL,
  `ubicacion` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `sucursales`
--

INSERT INTO `sucursales` (`idsucursales`, `ubicacion`) VALUES
(1, 'Bogotá D.C Centro-121 Cra. 8'),
(2, 'Bogotá D.C Norte-Cl. 123');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipocliente`
--

CREATE TABLE `tipocliente` (
  `idtipocliente` int(11) NOT NULL,
  `descripciontipo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipocliente`
--

INSERT INTO `tipocliente` (`idtipocliente`, `descripciontipo`) VALUES
(1, 'Persona Natural'),
(2, 'Pymes'),
(3, 'Empresariales');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoempleado`
--

CREATE TABLE `tipoempleado` (
  `idtipoempleado` int(11) NOT NULL,
  `descripciontipo` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipoempleado`
--

INSERT INTO `tipoempleado` (`idtipoempleado`, `descripciontipo`) VALUES
(1, 'Administrador'),
(2, 'Comercial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoinmueble`
--

CREATE TABLE `tipoinmueble` (
  `idtipoinmueble` int(11) NOT NULL,
  `descripcioninmueble` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipoinmueble`
--

INSERT INTO `tipoinmueble` (`idtipoinmueble`, `descripcioninmueble`) VALUES
(1, 'Casa'),
(2, 'Apartamento'),
(3, 'Lote');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipopagos`
--

CREATE TABLE `tipopagos` (
  `idtipos` int(11) NOT NULL,
  `tipopago` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipopagos`
--

INSERT INTO `tipopagos` (`idtipos`, `tipopago`) VALUES
(1, 'Arriendo'),
(2, 'Estudio'),
(3, 'Compra'),
(4, 'Venta');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `analisisderiesgo`
--
ALTER TABLE `analisisderiesgo`
  ADD PRIMARY KEY (`idanalisis`),
  ADD KEY `Relacion10` (`inmueble`),
  ADD KEY `Relacion11` (`pago`);

--
-- Indices de la tabla `avaluo`
--
ALTER TABLE `avaluo`
  ADD PRIMARY KEY (`idavaluo`);

--
-- Indices de la tabla `citas`
--
ALTER TABLE `citas`
  ADD PRIMARY KEY (`idcitas`),
  ADD KEY `Relacion14` (`inmueble`);

--
-- Indices de la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD PRIMARY KEY (`idcliente`),
  ADD KEY `Relacion1` (`tipocliente`);

--
-- Indices de la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD PRIMARY KEY (`idempleado`),
  ADD KEY `Relacion2` (`tipoempleado`),
  ADD KEY `Relacion3` (`oficina`);

--
-- Indices de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD PRIMARY KEY (`idinmueble`),
  ADD KEY `Relacion4` (`tipoinmueble`),
  ADD KEY `Relacion5` (`propietario`),
  ADD KEY `Relacion6` (`pago`),
  ADD KEY `Relacion7` (`comercial`);

--
-- Indices de la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD PRIMARY KEY (`idpagos`),
  ADD KEY `Relacion12` (`tipopago`),
  ADD KEY `Relacion13` (`cliente`);

--
-- Indices de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  ADD PRIMARY KEY (`idsucursales`);

--
-- Indices de la tabla `tipocliente`
--
ALTER TABLE `tipocliente`
  ADD PRIMARY KEY (`idtipocliente`);

--
-- Indices de la tabla `tipoempleado`
--
ALTER TABLE `tipoempleado`
  ADD PRIMARY KEY (`idtipoempleado`);

--
-- Indices de la tabla `tipoinmueble`
--
ALTER TABLE `tipoinmueble`
  ADD PRIMARY KEY (`idtipoinmueble`);

--
-- Indices de la tabla `tipopagos`
--
ALTER TABLE `tipopagos`
  ADD PRIMARY KEY (`idtipos`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `analisisderiesgo`
--
ALTER TABLE `analisisderiesgo`
  MODIFY `idanalisis` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `avaluo`
--
ALTER TABLE `avaluo`
  MODIFY `idavaluo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `idcitas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=61;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idempleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `idinmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT de la tabla `pagos`
--
ALTER TABLE `pagos`
  MODIFY `idpagos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `sucursales`
--
ALTER TABLE `sucursales`
  MODIFY `idsucursales` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipocliente`
--
ALTER TABLE `tipocliente`
  MODIFY `idtipocliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tipoempleado`
--
ALTER TABLE `tipoempleado`
  MODIFY `idtipoempleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `tipoinmueble`
--
ALTER TABLE `tipoinmueble`
  MODIFY `idtipoinmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de la tabla `tipopagos`
--
ALTER TABLE `tipopagos`
  MODIFY `idtipos` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `analisisderiesgo`
--
ALTER TABLE `analisisderiesgo`
  ADD CONSTRAINT `Relacion10` FOREIGN KEY (`inmueble`) REFERENCES `inmueble` (`idinmueble`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion11` FOREIGN KEY (`pago`) REFERENCES `pagos` (`idpagos`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `citas`
--
ALTER TABLE `citas`
  ADD CONSTRAINT `Relacion14` FOREIGN KEY (`inmueble`) REFERENCES `inmueble` (`idinmueble`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `clientes`
--
ALTER TABLE `clientes`
  ADD CONSTRAINT `Relacion1` FOREIGN KEY (`tipocliente`) REFERENCES `tipocliente` (`idtipocliente`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `empleados`
--
ALTER TABLE `empleados`
  ADD CONSTRAINT `Relacion2` FOREIGN KEY (`tipoempleado`) REFERENCES `tipoempleado` (`idtipoempleado`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion3` FOREIGN KEY (`oficina`) REFERENCES `sucursales` (`idsucursales`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `inmueble`
--
ALTER TABLE `inmueble`
  ADD CONSTRAINT `Relacion4` FOREIGN KEY (`tipoinmueble`) REFERENCES `tipoinmueble` (`idtipoinmueble`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion5` FOREIGN KEY (`propietario`) REFERENCES `clientes` (`idcliente`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion6` FOREIGN KEY (`pago`) REFERENCES `pagos` (`idpagos`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion7` FOREIGN KEY (`comercial`) REFERENCES `empleados` (`idempleado`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `pagos`
--
ALTER TABLE `pagos`
  ADD CONSTRAINT `Relacion12` FOREIGN KEY (`tipopago`) REFERENCES `tipopagos` (`idtipos`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion13` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`idcliente`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
