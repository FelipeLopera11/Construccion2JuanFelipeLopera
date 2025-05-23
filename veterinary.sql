-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-04-2025 a las 05:33:26
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
-- Base de datos: `veterinary`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `clinichistory`
--

CREATE TABLE `clinichistory` (
  `date` bigint(20) NOT NULL,
  `veterinarianId` bigint(20) NOT NULL,
  `petId` bigint(20) NOT NULL,
  `reason` varchar(255) NOT NULL,
  `procedur` varchar(255) NOT NULL,
  `dose` double NOT NULL,
  `allergy` text DEFAULT NULL,
  `symptoms` text DEFAULT NULL,
  `diagnosis` text DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `orderId` bigint(20) DEFAULT NULL,
  `vaccinationHistory` text DEFAULT NULL,
  `detailProcedure` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice`
--

CREATE TABLE `invoice` (
  `invoiceId` bigint(20) NOT NULL,
  `petId` bigint(20) NOT NULL,
  `id` bigint(20) NOT NULL,
  `medicalOrderId` bigint(20) NOT NULL,
  `productName` varchar(255) NOT NULL,
  `price` double NOT NULL,
  `quantity` int(11) NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `medicalorder`
--

CREATE TABLE `medicalorder` (
  `orderId` bigint(20) NOT NULL,
  `petId` bigint(20) NOT NULL,
  `personId` bigint(20) NOT NULL,
  `veterinarianId` bigint(20) NOT NULL,
  `medicationName` varchar(255) NOT NULL,
  `dosage` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pet`
--

CREATE TABLE `pet` (
  `petId` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `id` bigint(20) NOT NULL,
  `age` int(11) NOT NULL,
  `spice` varchar(255) NOT NULL,
  `race` varchar(255) NOT NULL,
  `characteristics` text DEFAULT NULL,
  `weight` double NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `username` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clinichistory`
--
ALTER TABLE `clinichistory`
  ADD PRIMARY KEY (`date`,`petId`),
  ADD KEY `veterinarianId` (`veterinarianId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `orderId` (`orderId`);

--
-- Indices de la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoiceId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `id` (`id`),
  ADD KEY `medicalOrderId` (`medicalOrderId`);

--
-- Indices de la tabla `medicalorder`
--
ALTER TABLE `medicalorder`
  ADD PRIMARY KEY (`orderId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `personId` (`personId`),
  ADD KEY `veterinarianId` (`veterinarianId`);

--
-- Indices de la tabla `person`
--
ALTER TABLE `person`
  ADD PRIMARY KEY (`id`);

--
-- Indices de la tabla `pet`
--
ALTER TABLE `pet`
  ADD PRIMARY KEY (`petId`),
  ADD KEY `id` (`id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `username` (`username`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `invoice`
--
ALTER TABLE `invoice`
  MODIFY `invoiceId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `medicalorder`
--
ALTER TABLE `medicalorder`
  MODIFY `orderId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `person`
--
ALTER TABLE `person`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pet`
--
ALTER TABLE `pet`
  MODIFY `petId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `user`
--
ALTER TABLE `user`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clinichistory`
--
ALTER TABLE `clinichistory`
  ADD CONSTRAINT `clinichistory_ibfk_1` FOREIGN KEY (`veterinarianId`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `clinichistory_ibfk_2` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `clinichistory_ibfk_3` FOREIGN KEY (`orderId`) REFERENCES `medicalorder` (`orderId`);

--
-- Filtros para la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`id`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `invoice_ibfk_3` FOREIGN KEY (`medicalOrderId`) REFERENCES `medicalorder` (`orderId`);

--
-- Filtros para la tabla `medicalorder`
--
ALTER TABLE `medicalorder`
  ADD CONSTRAINT `medicalorder_ibfk_1` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `medicalorder_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `medicalorder_ibfk_3` FOREIGN KEY (`veterinarianId`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `pet`
--
ALTER TABLE `pet`
  ADD CONSTRAINT `pet_ibfk_1` FOREIGN KEY (`id`) REFERENCES `person` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
