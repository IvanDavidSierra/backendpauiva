-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 25-06-2024 a las 05:48:58
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
(1, 'No', 'Bajo', 'Cert001', NULL, NULL),
(2, 'Si', 'Medio', 'cert002', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `avaluo`
--

CREATE TABLE `avaluo` (
  `idavaluo` int(11) NOT NULL,
  `fecha` varchar(10) DEFAULT NULL,
  `valor` varchar(11) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `inmueble` int(11) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `avaluo`
--

INSERT INTO `avaluo` (`idavaluo`, `fecha`, `valor`, `descripcion`, `inmueble`, `cliente`) VALUES
(1, '15/06/2024', '$2.000.000', 'Descripción de la Propiedad:\nLa propiedad evaluada es un tipo de propiedad casa ubicada en la ciudad de Bogotá D.C sobre la calle 100. La estructura está construida con una estructura de concreto armado sus muroscon Ladrillo y bloques de concreto.\nCubierta con losas de concreto,su aislamiento con Fibra de vidrio,los acabados exteriores con estuco sus ventanas y puertas con Ventanas de aluminio y puertas de acero,los pisos de baldosas de cerámica.En cuanto a las instalaciones eléctricas y plomería esta en base de tubos de cobre o PVC para plomería,cables eléctricos de cobre,interruptores y enchufes estándar.\nSistema de Calefacción y Refrigeración cuanta con calentadores de agua a gas\n\nUbicación:\n\nLa propiedad se encuentra en el barrio del chicó de la ciudad de Bogotá D.C,Colombia.\n\nEstado de Conservación:\n\nLa propiedad se encuentra en buen estado de conservación, con mantenimiento regular y sin necesidad inmediata de reparaciones estructurales significativas.\n\nValoración:\n\nLa valoración de la propiedad se ha realizado de acuerdo con [método de valoración utilizado: comparativo de mercado, coste de reposición, método del ingreso, etc.], basándose en [factores relevantes para la valoración, como el estado de la propiedad, características específicas, ubicación, etc.].', NULL, NULL),
(2, '20/06/2024', '$1.500.000', 'Avalúo de Propiedad Residencial\r\n\r\nDescripción de la Propiedad:\r\n\r\nLa propiedad evaluada es una casa unifamiliar de dos pisos, ubicada en Calle Principal del barrio Castilla, en la ciudad de Bogotá D.C,Colombia. La estructura está construida con concreto armado y tiene un área total de 200 metros cuadrados. La casa cuenta con cuatro habitaciones, tres baños completos, cocina, sala de estar, comedor y un garaje para dos vehículos. Está equipada con sistemas de calefacción central y aire acondicionado.\r\n\r\nUbicación:\r\n\r\nLa propiedad se encuentra en el barrio residencial de Calle Principal, conocido por su entorno tranquilo y familiar. Está cerca de escuelas, parques y centros comerciales, con fácil acceso a las principales vías de transporte.\r\n\r\nEstado de Conservación:\r\n\r\nLa propiedad se encuentra en excelente estado de conservación, con mantenimiento regular y sin necesidad de reparaciones estructurales significativas.\r\n\r\nValoración:\r\n\r\nLa valoración de la propiedad se ha realizado de acuerdo con el método comparativo de mercado, utilizando ventas recientes de propiedades similares en la zona. Además, se han considerado las características únicas de esta propiedad, como su tamaño, ubicación y los acabados de alta calidad.\r\n\r\nLista de Clinton:\r\n\r\nEstructura: Concreto armado.\r\nMuros: Ladrillo.\r\nCubierta: Tejas de barro.\r\nAislamiento: Lana mineral.\r\nAcabados Exteriores: Estuco.\r\nVentanas y Puertas: Ventanas de aluminio.\r\nPisos: Baldosas de cerámica.\r\nInstalaciones Eléctricas y Plomería: Tubos de cobre.\r\nSistema de Calefacción y Refrigeración: Calefacción central y aire acondicionado.\r\nOtros: Iluminación empotrada.\r\nValor Total:\r\n\r\nBasado en la lista de Clinton y otros factores relevantes, la valoración total de la propiedad asciende a [monto total en la moneda local]. Esta valoración refleja el valor de mercado actual y está sujeta a cambios según la oferta y demanda del mercado inmobiliario.', NULL, NULL);

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
(1, '15/06/2024', 'Bueno', NULL),
(2, '20/06/2024', 'Medio', NULL);

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
  `telefono` int(11) DEFAULT NULL,
  `correo` varchar(30) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `clientes`
--

INSERT INTO `clientes` (`idcliente`, `nombre`, `apellido`, `razon_social`, `nit`, `tipocliente`, `telefono`, `correo`, `password`) VALUES
(1, 'Nixon', 'Duarte', NULL, NULL, 1, 1234567891, 'Nixonduarte@inaplesinmo.com', 'c4ca4238a0b923820dcc509a6f75849b'),
(2, 'Nicole', 'Vargas', NULL, NULL, 1, 235651212, 'NVargas@inaplesinmo.com', NULL),
(22, 'eeeeeeeee', 'eeeeeeeeeee', NULL, NULL, 1, 2112111, 'eeeeeeee@gmail.com', '96ac0342a3ccf9553e3d4c9da9b821b0'),
(23, 'eeeeeeeee', 'eeeeeeeeeee', NULL, NULL, 1, 2112111, 'eeeeeeee@gmail.com', '926e27eecdbc7a18858b3798ba99bddd'),
(24, 'sdadasdasd', 'wqeqwewqx', NULL, NULL, 1, 124545, 'lllll@gmail.com', '68053af2923e00204c3ca7c6a3150cf7'),
(25, 'asdasdasd', 'eeeeeeee', NULL, NULL, 1, 121122121, 'weweweweew@gmail.com', '202cb962ac59075b964b07152d234b70'),
(26, 'asdasd', 'eeeeeeeee', NULL, NULL, 1, 112121, 'wewewewerqqqq@gmail.com', '42998cf32d552343bc8e460416382dca'),
(27, 'asdasd', 'eeeeeeeee', NULL, NULL, 1, 112121, 'wewewewerqqqq@gmail.com', '15de21c670ae7c3f6f3f1f37029303c9'),
(28, 'ola', 'comotas', NULL, NULL, 1, 5455445, 'ola21@gmail.com', '550a141f12de6341fba65b0ad0433500'),
(29, 'ñññññ', 'ñññññ', NULL, NULL, 1, 87877887, 'ñññññ@gmail.com', '202cb962ac59075b964b07152d234b70'),
(30, 'fffffffffff', 'ffffffffffff', NULL, NULL, 1, 4544545, 'fffff@gmail.com', '580796a888df897b38097bd6c1fdaa96');

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
  `correo` varchar(50) DEFAULT NULL,
  `contraseña` varchar(10) DEFAULT NULL,
  `comisiones` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `empleados`
--

INSERT INTO `empleados` (`idempleado`, `nombre`, `apellido`, `tipoempleado`, `oficina`, `correo`, `contraseña`, `comisiones`) VALUES
(1, 'Martha', 'Gonzales', 1, NULL, 'm.gonzales@inaplesinmo.com', NULL, NULL),
(2, 'Juan', 'Perez', 2, NULL, 'juan.Perez@inaplesinmo.com', NULL, NULL);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `inmueble`
--

CREATE TABLE `inmueble` (
  `idinmueble` int(11) NOT NULL,
  `tipoinmueble` int(11) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `descripcion` text DEFAULT NULL,
  `propietario` int(11) DEFAULT NULL,
  `foto` varchar(20) DEFAULT NULL,
  `pago` int(11) DEFAULT NULL,
  `comercial` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `inmueble`
--

INSERT INTO `inmueble` (`idinmueble`, `tipoinmueble`, `direccion`, `descripcion`, `propietario`, `foto`, `pago`, `comercial`) VALUES
(1, NULL, 'Calle 100', 'Ubicada en un exclusivo barrio residencial, esta impresionante residencia de estrato alto combina elegancia y confort en cada detalle. Con una arquitectura moderna y acabados de lujo, la propiedad se extiende sobre aproximadamente 800 metros cuadrados. Sus espacios interiores incluyen una amplia sala de estar con techos altos y chimenea central, un comedor formal diseñado para grandes reuniones, y una cocina gourmet equipada con electrodomésticos de última generación y encimeras de mármol. Además, cuenta con varias suites principales y adicionales, todas con baños privados y armarios empotrados, un estudio o biblioteca, una sala de cine en casa, sala de juegos con mesa de billar, gimnasio privado y áreas de entretenimiento al aire libre. Los exteriores están diseñados con amplios jardines paisajísticos, terrazas cubiertas y descubiertas con vistas panorámicas, una piscina climatizada con jacuzzi, y un garaje privado para varios vehículos. Equipada con suelos de mármol, iluminación LED, climatización central y sistemas de seguridad avanzados, esta propiedad representa el epitome del lujo residencial, valorada por su ubicación exclusiva y todas las comodidades que ofrece.', 2, NULL, NULL, 1),
(2, NULL, '76a40 Cl. 8a', 'La propiedad evaluada es una casa unifamiliar de dos pisos, ubicada en Calle Principal de Castilla,en la ciudad de Bogota D.C,Colombia. La estructura está construida con concreto armado y tiene un área total de 200 metros cuadrados. La casa cuenta con cuatro habitaciones, tres baños completos, cocina, sala de estar, comedor y un garaje para dos vehículos. Está equipada con sistemas de calefacción central y aire acondicionado.', 1, NULL, NULL, 2);

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
(1, NULL, 'Consignacion001', 'Comprobante de Consignación:\r\n\r\nFecha: 15 de junio de 2024\r\n\r\nNombre del Consignante: Nixon Duarte\r\nID: 1\r\nNombre del Beneficiario: Juan Perez\r\nBanco: Banco ABC\r\nTipo de Cuenta: Cuenta de Ahorros\r\nNúmero de Cuenta: 1234567890\r\nConcepto: Pago de casa ubicada en Calle 100,Bogotá D.C\r\nMonto: $200,000,000', 1),
(2, NULL, 'Consignacion002', 'Comprobante de Consignación:\r\n\r\nFecha: 20 de junio de 2024\r\n\r\nNombre del Consignante:Nicole Vargas\r\nID: 2\r\nNombre del Beneficiario: Martha Gomez\r\nBanco: Banco ABC\r\nTipo de Cuenta: Cuenta de Ahorros\r\nNúmero de Cuenta: 1234567890\r\nConcepto: Pago de casa ubicada en Calle 76a40 Cl. 8a Castilla,Bogotá D.C\r\nMonto: $300,000,000', 2);

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
  `descripcion` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipoempleado`
--

INSERT INTO `tipoempleado` (`idtipoempleado`, `descripcion`) VALUES
(1, 'Administrador'),
(2, 'Comercial');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tipoinmueble`
--

CREATE TABLE `tipoinmueble` (
  `idtipoinmueble` int(11) NOT NULL,
  `descripcioninmueble` varchar(20) DEFAULT NULL,
  `estadoinmueble` varchar(10) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1 COLLATE=latin1_swedish_ci;

--
-- Volcado de datos para la tabla `tipoinmueble`
--

INSERT INTO `tipoinmueble` (`idtipoinmueble`, `descripcioninmueble`, `estadoinmueble`) VALUES
(1, 'Casa', NULL),
(2, 'Apartamento', NULL),
(3, 'Lote', NULL);

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
  ADD PRIMARY KEY (`idavaluo`),
  ADD KEY `Relacion8` (`inmueble`),
  ADD KEY `Relacion9` (`cliente`);

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
  MODIFY `idavaluo` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `citas`
--
ALTER TABLE `citas`
  MODIFY `idcitas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `clientes`
--
ALTER TABLE `clientes`
  MODIFY `idcliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT de la tabla `empleados`
--
ALTER TABLE `empleados`
  MODIFY `idempleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `inmueble`
--
ALTER TABLE `inmueble`
  MODIFY `idinmueble` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

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
-- Filtros para la tabla `avaluo`
--
ALTER TABLE `avaluo`
  ADD CONSTRAINT `Relacion8` FOREIGN KEY (`inmueble`) REFERENCES `inmueble` (`idinmueble`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `Relacion9` FOREIGN KEY (`cliente`) REFERENCES `clientes` (`idcliente`) ON DELETE CASCADE ON UPDATE CASCADE;

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
