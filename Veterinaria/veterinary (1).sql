-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 30-05-2025 a las 20:51:32
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
  `historyId` bigint(20) NOT NULL,
  `date` bigint(20) NOT NULL,
  `veterinarianId` bigint(20) NOT NULL,
  `petId` bigint(20) NOT NULL,
  `reason` varchar(255) DEFAULT NULL,
  `procedure_detail` varchar(255) DEFAULT NULL,
  `dose` double DEFAULT NULL,
  `allergy` varchar(255) DEFAULT NULL,
  `symptoms` varchar(255) DEFAULT NULL,
  `diagnosis` varchar(255) DEFAULT NULL,
  `medicine` varchar(255) DEFAULT NULL,
  `orderId` bigint(20) DEFAULT NULL,
  `vaccinationHistory` text DEFAULT NULL,
  `detailProcedure` text DEFAULT NULL,
  `detail_procedure` varchar(255) DEFAULT NULL,
  `vaccination_history` varchar(255) DEFAULT NULL,
  `medical_order_id` bigint(20) DEFAULT NULL,
  `pet_id` bigint(20) NOT NULL,
  `veterinarian_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoice`
--

CREATE TABLE `invoice` (
  `invoiceId` bigint(20) NOT NULL,
  `petId` bigint(20) NOT NULL,
  `personId` bigint(20) NOT NULL,
  `medicalOrderId` bigint(20) DEFAULT NULL,
  `productName` varchar(255) DEFAULT NULL,
  `price` decimal(10,2) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  `date` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `invoices`
--

CREATE TABLE `invoices` (
  `invoice_id` bigint(20) NOT NULL,
  `date` date NOT NULL,
  `price` double NOT NULL,
  `product_name` varchar(255) NOT NULL,
  `quantity` int(11) NOT NULL,
  `person_id` bigint(20) NOT NULL,
  `medical_order_id` bigint(20) DEFAULT NULL,
  `pet_id` bigint(20) NOT NULL
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
  `dosage` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `medication_name` varchar(255) NOT NULL,
  `person_id` bigint(20) NOT NULL,
  `pet_id` bigint(20) NOT NULL,
  `veterinarian_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `person`
--

CREATE TABLE `person` (
  `id` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Volcado de datos para la tabla `person`
--

INSERT INTO `person` (`id`, `name`, `age`, `role`) VALUES
(1, 'Carlos', 21, 'seller'),
(2, 'Alberto', 21, 'Veterinarian');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pet`
--

CREATE TABLE `pet` (
  `petId` bigint(20) NOT NULL,
  `name` varchar(255) NOT NULL,
  `ownerId` bigint(20) NOT NULL,
  `age` int(11) DEFAULT NULL,
  `spice` varchar(100) DEFAULT NULL,
  `race` varchar(100) DEFAULT NULL,
  `characteristics` text DEFAULT NULL,
  `weight` double DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `pets`
--

CREATE TABLE `pets` (
  `pet_id` bigint(20) NOT NULL,
  `pet_age` int(11) NOT NULL,
  `characteristics` varchar(255) DEFAULT NULL,
  `pet_name` varchar(255) NOT NULL,
  `race` varchar(255) NOT NULL,
  `specie` varchar(255) NOT NULL,
  `weight` double NOT NULL,
  `person_id` bigint(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `user`
--

CREATE TABLE `user` (
  `id` bigint(20) NOT NULL,
  `userName` varchar(100) NOT NULL,
  `password` varchar(255) NOT NULL,
  `role` varchar(255) DEFAULT NULL,
  `user_name` varchar(255) DEFAULT NULL,
  `person_id` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `clinichistory`
--
ALTER TABLE `clinichistory`
  ADD PRIMARY KEY (`historyId`),
  ADD UNIQUE KEY `UK1s7dvgvp0cffikdosb6xpgsyr` (`medical_order_id`),
  ADD KEY `veterinarianId` (`veterinarianId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `orderId` (`orderId`),
  ADD KEY `FKfsq8dh62ebv99lft03njfww4p` (`pet_id`),
  ADD KEY `FKlsgw5e8jkfik11alu7rg1hxtm` (`veterinarian_id`);

--
-- Indices de la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD PRIMARY KEY (`invoiceId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `personId` (`personId`),
  ADD KEY `medicalOrderId` (`medicalOrderId`);

--
-- Indices de la tabla `invoices`
--
ALTER TABLE `invoices`
  ADD PRIMARY KEY (`invoice_id`),
  ADD UNIQUE KEY `UK30utfj3no81qtis42fjjd56vv` (`medical_order_id`),
  ADD KEY `FK4jopb1yms0vk48gvvism61o2d` (`person_id`),
  ADD KEY `FKnl0p94grf13ib6gl09gsx27du` (`pet_id`);

--
-- Indices de la tabla `medicalorder`
--
ALTER TABLE `medicalorder`
  ADD PRIMARY KEY (`orderId`),
  ADD KEY `petId` (`petId`),
  ADD KEY `personId` (`personId`),
  ADD KEY `veterinarianId` (`veterinarianId`),
  ADD KEY `FKqs27s5iikbb7lqsxp38f9mrbq` (`person_id`),
  ADD KEY `FKi2b1edwdd6fxjfbbbx7x2xi2j` (`pet_id`),
  ADD KEY `FKqv3rf8n6jkfd8oeuplurprecp` (`veterinarian_id`);

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
  ADD KEY `ownerId` (`ownerId`);

--
-- Indices de la tabla `pets`
--
ALTER TABLE `pets`
  ADD PRIMARY KEY (`pet_id`),
  ADD KEY `FKqok4cqwm7n9wi6jhsrnlxe0c7` (`person_id`);

--
-- Indices de la tabla `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `userName` (`userName`),
  ADD UNIQUE KEY `UKskugu4aa786hx4o05wn6cs7q0` (`person_id`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `clinichistory`
--
ALTER TABLE `clinichistory`
  MODIFY `historyId` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `invoices`
--
ALTER TABLE `invoices`
  MODIFY `invoice_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `pets`
--
ALTER TABLE `pets`
  MODIFY `pet_id` bigint(20) NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `clinichistory`
--
ALTER TABLE `clinichistory`
  ADD CONSTRAINT `FKfsq8dh62ebv99lft03njfww4p` FOREIGN KEY (`pet_id`) REFERENCES `pets` (`pet_id`),
  ADD CONSTRAINT `FKlsgw5e8jkfik11alu7rg1hxtm` FOREIGN KEY (`veterinarian_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `clinichistory_ibfk_1` FOREIGN KEY (`veterinarianId`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `clinichistory_ibfk_2` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `clinichistory_ibfk_3` FOREIGN KEY (`orderId`) REFERENCES `medicalorder` (`orderId`);

--
-- Filtros para la tabla `invoice`
--
ALTER TABLE `invoice`
  ADD CONSTRAINT `invoice_ibfk_1` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `invoice_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `invoice_ibfk_3` FOREIGN KEY (`medicalOrderId`) REFERENCES `medicalorder` (`orderId`);

--
-- Filtros para la tabla `invoices`
--
ALTER TABLE `invoices`
  ADD CONSTRAINT `FK4jopb1yms0vk48gvvism61o2d` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `FKnl0p94grf13ib6gl09gsx27du` FOREIGN KEY (`pet_id`) REFERENCES `pets` (`pet_id`);

--
-- Filtros para la tabla `medicalorder`
--
ALTER TABLE `medicalorder`
  ADD CONSTRAINT `FKi2b1edwdd6fxjfbbbx7x2xi2j` FOREIGN KEY (`pet_id`) REFERENCES `pets` (`pet_id`),
  ADD CONSTRAINT `FKqs27s5iikbb7lqsxp38f9mrbq` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `FKqv3rf8n6jkfd8oeuplurprecp` FOREIGN KEY (`veterinarian_id`) REFERENCES `user` (`id`),
  ADD CONSTRAINT `medicalorder_ibfk_1` FOREIGN KEY (`petId`) REFERENCES `pet` (`petId`),
  ADD CONSTRAINT `medicalorder_ibfk_2` FOREIGN KEY (`personId`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `medicalorder_ibfk_3` FOREIGN KEY (`veterinarianId`) REFERENCES `user` (`id`);

--
-- Filtros para la tabla `pet`
--
ALTER TABLE `pet`
  ADD CONSTRAINT `pet_ibfk_1` FOREIGN KEY (`ownerId`) REFERENCES `person` (`id`);

--
-- Filtros para la tabla `pets`
--
ALTER TABLE `pets`
  ADD CONSTRAINT `FKqok4cqwm7n9wi6jhsrnlxe0c7` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`);

--
-- Filtros para la tabla `user`
--
ALTER TABLE `user`
  ADD CONSTRAINT `FKir5g7yucydevmmc84i788jp79` FOREIGN KEY (`person_id`) REFERENCES `person` (`id`),
  ADD CONSTRAINT `user_ibfk_1` FOREIGN KEY (`id`) REFERENCES `person` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
