-- phpMyAdmin SQL Dump
-- version 5.1.1deb5ubuntu1
-- https://www.phpmyadmin.net/
--
-- Servidor: localhost:3306
-- Tiempo de generación: 26-01-2024 a las 16:10:22
-- Versión del servidor: 8.0.35-0ubuntu0.22.04.1
-- Versión de PHP: 8.1.2-1ubuntu2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `Cuestionarios`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Preguntas`
--

CREATE TABLE `Preguntas` (
  `id_pregunta` int NOT NULL,
  `cuerpo_pregunta` text COLLATE utf16_spanish_ci NOT NULL,
  `tema_id` int DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

--
-- Volcado de datos para la tabla `Preguntas`
--

INSERT INTO `Preguntas` (`id_pregunta`, `cuerpo_pregunta`, `tema_id`) VALUES
(1, '¿Cuánto es 2 + 2?', 1),
(2, '¿Cuál es la raíz cuadrada de 16?', 1),
(3, '¿Cuántos grados tiene un círculo completo?', 1),
(4, '¿Cuál es el resultado de 5 * 7?', 1),
(5, '¿Cuánto es 3 al cubo?', 1),
(6, '¿Cuánto es 15 / 3?', 1),
(7, '¿Cuál es el valor de PI (π)?', 1),
(8, '¿Cuál es la fórmula del área de un triángulo?', 1),
(9, '¿Cuál es la derivada de x^2?', 1),
(10, '¿Qué es un número primo?', 1),
(11, '¿En qué año ocurrió la Revolución Francesa?', 2),
(12, '¿Quién fue el primer presidente de los Estados Unidos?', 2),
(13, '¿Cuál fue el imperio más extenso de la historia?', 2),
(14, '¿En qué año se firmó la Declaración de Independencia de EE.UU.?', 2),
(15, '¿Quién fue Cleopatra?', 2),
(16, '¿Qué evento histórico marcó el final de la Segunda Guerra Mundial?', 2),
(17, '¿En qué año se fundó la ONU?', 2),
(18, '¿Cuál fue la Revolución Industrial?', 2),
(19, '¿Quién fue Mahatma Gandhi?', 2),
(20, '¿Dónde se firmó el Tratado de Versalles?', 2),
(21, '¿Cuál es la estructura básica de un átomo?', 3),
(22, '¿Qué gas es esencial para la fotosíntesis?', 3),
(23, '¿Quién formuló la teoría de la relatividad?', 3),
(24, '¿Cuál es la función principal del ADN?', 3),
(25, '¿Cuál es la capa más externa de la atmósfera terrestre?', 3),
(26, '¿Cuál es el planeta más grande del sistema solar?', 3),
(27, '¿Cuál es la velocidad de la luz?', 3),
(28, '¿Cuál es la fórmula química del agua?', 3),
(29, '¿Qué causa las estaciones del año?', 3),
(30, '¿Cuál es la ley de Newton sobre la acción y la reacción?', 3),
(31, '¿Quién escribió \"Cien años de soledad\"?', 4),
(32, '¿Cuál es el género literario de \"Romeo y Julieta\"?', 4),
(33, '¿En qué época se desarrolla la novela \"Orgullo y prejuicio\"?', 4),
(34, '¿Quién es el autor de \"El señor de los anillos\"?', 4),
(35, '¿Cuál es el tema principal de \"1984\" de George Orwell?', 4),
(36, '¿Qué escritor es conocido como el \"Bardo de Avon\"?', 4),
(37, '¿Qué obra literaria inicia con la frase \"En un lugar de la Mancha, de cuyo nombre no quiero acordarme...\"?', 4),
(38, '¿Quién escribió \"Matar un ruiseñor\"?', 4),
(39, '¿Cuál es el título original de la obra \"Romeo y Julieta\"?', 4),
(40, '¿Qué autor escribió \"Crónica de una muerte anunciada\"?', 4),
(41, '¿Cuál es el río más largo del mundo?', 5),
(42, '¿En qué continente se encuentra el desierto del Sahara?', 5),
(43, '¿Cuántos océanos hay en la Tierra?', 5),
(44, '¿Cuál es la montaña más alta del mundo?', 5),
(45, '¿Cuál es el país más grande por área terrestre?', 5),
(46, '¿Dónde se encuentra el Triángulo de las Bermudas?', 5),
(47, '¿Cuál es el país más poblado del mundo?', 5),
(48, '¿Cuál es la capital de Australia?', 5),
(49, '¿Cuántos países hay en América del Sur?', 5),
(50, '¿En qué país se encuentra el Canal de Panamá?', 5);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Respuestas`
--

CREATE TABLE `Respuestas` (
  `id_respuesta` int NOT NULL,
  `id_pregunta` int DEFAULT NULL,
  `cuerpo_respuesta` text COLLATE utf16_spanish_ci NOT NULL,
  `es_correcta` tinyint(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

--
-- Volcado de datos para la tabla `Respuestas`
--

INSERT INTO `Respuestas` (`id_respuesta`, `id_pregunta`, `cuerpo_respuesta`, `es_correcta`) VALUES
(1, 1, '4', 1),
(2, 1, '5', 0),
(3, 1, '3', 0),
(4, 1, '8', 0),
(5, 2, '4', 1),
(6, 2, '5', 0),
(7, 2, '3', 0),
(8, 2, '8', 0),
(9, 3, '360', 1),
(10, 3, '180', 0),
(11, 3, '90', 0),
(12, 3, '720', 0),
(13, 4, '35', 1),
(14, 4, '42', 0),
(15, 4, '25', 0),
(16, 4, '12', 0),
(17, 5, '27', 1),
(18, 5, '64', 0),
(19, 5, '81', 0),
(20, 5, '16', 0),
(21, 6, '5', 1),
(22, 6, '10', 0),
(23, 6, '2', 0),
(24, 6, '7', 0),
(25, 7, '3.14', 1),
(26, 7, '2.71', 0),
(27, 7, '1.618', 0),
(28, 7, '0.577', 0),
(29, 8, 'base * altura / 2', 1),
(30, 8, 'lado * lado', 0),
(31, 8, 'π * radio^2', 0),
(32, 8, '2 * π * radio', 0),
(33, 9, '2 * x', 1),
(34, 9, '3 * x^2', 0),
(35, 9, '2 * x^2', 0),
(36, 9, '3 * x', 0),
(37, 10, 'Un número divisible solo por 1 y por sí mismo', 1),
(38, 10, 'Un número divisible por 2', 0),
(39, 10, 'Un número divisible por 10', 0),
(40, 10, 'Un número divisible por 5', 0),
(41, 11, '1789', 1),
(42, 11, '1776', 0),
(43, 11, '1804', 0),
(44, 11, '1799', 0),
(45, 12, 'George Washington', 1),
(46, 12, 'Thomas Jefferson', 0),
(47, 12, 'Abraham Lincoln', 0),
(48, 12, 'John Adams', 0),
(49, 13, 'Imperio Mongol', 1),
(50, 13, 'Imperio Romano', 0),
(51, 13, 'Imperio Otomano', 0),
(52, 13, 'Imperio Británico', 0),
(53, 14, '1945', 1),
(54, 14, '1939', 0),
(55, 14, '1941', 0),
(56, 14, '1950', 0),
(57, 15, '1945', 1),
(58, 15, '1939', 0),
(59, 15, '1950', 0),
(60, 15, '1941', 0),
(61, 16, '1945', 1),
(62, 16, '1950', 0),
(63, 16, '1939', 0),
(64, 16, '1941', 0),
(65, 17, '1945', 1),
(66, 17, '1939', 0),
(67, 17, '1941', 0),
(68, 17, '1950', 0),
(69, 18, '1945', 1),
(70, 18, '1939', 0),
(71, 18, '1941', 0),
(72, 18, '1950', 0),
(73, 19, '1865', 1),
(74, 19, '1850', 0),
(75, 19, '1875', 0),
(76, 19, '1880', 0),
(77, 20, 'Palacio de Versalles', 1),
(78, 20, 'Palacio de Buckingham', 0),
(79, 20, 'Coliseo Romano', 0),
(80, 20, 'Museo del Louvre', 0),
(81, 21, 'Núcleo, electrones y protones', 1),
(82, 21, 'Protones, neutrones y electrones', 0),
(83, 21, 'Núcleo, electrones y neutrones', 0),
(84, 21, 'Electrones, protones y neutrones', 0),
(85, 22, 'Oxígeno', 1),
(86, 22, 'Dióxido de carbono', 0),
(87, 22, 'Nitrógeno', 0),
(88, 22, 'Hidrógeno', 0),
(89, 23, 'Albert Einstein', 1),
(90, 23, 'Isaac Newton', 0),
(91, 23, 'Galileo Galilei', 0),
(92, 23, 'Marie Curie', 0),
(93, 24, 'Almacenar información genética', 1),
(94, 24, 'Facilitar la respiración', 0),
(95, 24, 'Producir proteínas', 0),
(96, 24, 'Regular el metabolismo', 0),
(97, 25, 'Exosfera', 1),
(98, 25, 'Troposfera', 0),
(99, 25, 'Estratosfera', 0),
(100, 25, 'Mesosfera', 0),
(101, 26, 'Júpiter', 1),
(102, 26, 'Saturno', 0),
(103, 26, 'Marte', 0),
(104, 26, 'Venus', 0),
(105, 27, '299,792 kilómetros por segundo', 1),
(106, 27, '150,000 kilómetros por segundo', 0),
(107, 27, '450,000 kilómetros por segundo', 0),
(108, 27, '600,000 kilómetros por segundo', 0),
(109, 28, 'H2O', 1),
(110, 28, 'CO2', 0),
(111, 28, 'NaCl', 0),
(112, 28, 'C6H12O6', 0),
(113, 29, 'La inclinación del eje terrestre', 1),
(114, 29, 'La distancia al Sol', 0),
(115, 29, 'La rotación de la Tierra', 0),
(116, 29, 'La actividad solar', 0),
(117, 30, 'Por cada acción hay una reacción igual y opuesta', 1),
(118, 30, 'La ley de la gravedad', 0),
(119, 30, 'La ley de la inercia', 0),
(120, 30, 'La ley de la conservación de la energía', 0),
(121, 31, 'Gabriel García Márquez', 1),
(122, 31, 'Isabel Allende', 0),
(123, 31, 'Julio Cortázar', 0),
(124, 31, 'Mario Vargas Llosa', 0),
(125, 32, 'Tragedia', 1),
(126, 32, 'Comedia', 0),
(127, 32, 'Novela negra', 0),
(128, 32, 'Ciencia ficción', 0),
(129, 33, 'Siglo XIX', 1),
(130, 33, 'Siglo XVIII', 0),
(131, 33, 'Siglo XX', 0),
(132, 33, 'Renacimiento', 0),
(133, 34, 'J.R.R. Tolkien', 1),
(134, 34, 'C.S. Lewis', 0),
(135, 34, 'J.K. Rowling', 0),
(136, 34, 'George Orwell', 0),
(137, 35, 'Crítica al totalitarismo', 1),
(138, 35, 'Ciencia ficción espacial', 0),
(139, 35, 'Romance histórico', 0),
(140, 35, 'Novela de aventuras', 0),
(141, 36, 'William Shakespeare', 1),
(142, 36, 'Jane Austen', 0),
(143, 36, 'Charles Dickens', 0),
(144, 36, 'Virginia Woolf', 0),
(145, 37, 'Don Quijote de la Mancha', 1),
(146, 37, 'Crimen y castigo', 0),
(147, 37, 'Cien años de soledad', 0),
(148, 37, 'Ulises', 0),
(149, 38, 'Harper Lee', 1),
(150, 38, 'John Steinbeck', 0),
(151, 38, 'Mark Twain', 0),
(152, 38, 'F. Scott Fitzgerald', 0),
(153, 39, 'The Most Excellent and Lamentable Tragedy of Romeo and Juliet', 1),
(154, 39, 'Love and Death in Verona', 0),
(155, 39, 'A Tale of Two Cities', 0),
(156, 39, 'Two Gentlemen of Verona', 0),
(157, 40, 'Gabriel García Márquez', 1),
(158, 40, 'Isabel Allende', 0),
(159, 40, 'Julio Cortázar', 0),
(160, 40, 'Mario Vargas Llosa', 0),
(161, 41, 'Amazonas', 1),
(162, 41, 'Nilo', 0),
(163, 41, 'Misisipi', 0),
(164, 41, 'Yangtsé', 0),
(165, 42, 'África', 1),
(166, 42, 'Asia', 0),
(167, 42, 'América del Norte', 0),
(168, 42, 'Europa', 0),
(169, 43, '5', 1),
(170, 43, '4', 0),
(171, 43, '6', 0),
(172, 43, '7', 0),
(173, 44, 'Monte Everest', 1),
(174, 44, 'Monte Kilimanjaro', 0),
(175, 44, 'Monte McKinley', 0),
(176, 44, 'Monte Elbrús', 0),
(177, 45, 'Rusia', 1),
(178, 45, 'Canadá', 0),
(179, 45, 'China', 0),
(180, 45, 'Estados Unidos', 0),
(181, 46, 'Atlántico, Pacífico, Índico, Antártico', 1),
(182, 46, 'Atlántico, Pacífico, Índico, Ártico', 0),
(183, 46, 'Atlántico, Pacífico, Antártico, Ártico', 0),
(184, 46, 'Atlántico, Índico, Antártico, Ártico', 0),
(185, 47, 'Triángulo de las Bermudas', 1),
(186, 47, 'Mar del Norte', 0),
(187, 47, 'Triángulo de las Malvinas', 0),
(188, 47, 'Triángulo de la Muerte', 0),
(189, 48, 'China', 1),
(190, 48, 'India', 0),
(191, 48, 'Estados Unidos', 0),
(192, 48, 'Indonesia', 0),
(193, 49, 'Canberra', 1),
(194, 49, 'Sídney', 0),
(195, 49, 'Melbourne', 0),
(196, 49, 'Brisbane', 0),
(197, 50, '12', 1),
(198, 50, '10', 0),
(199, 50, '8', 0),
(200, 50, '14', 0);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Temas`
--

CREATE TABLE `Temas` (
  `id_tema` int NOT NULL,
  `nombre_tema` varchar(50) COLLATE utf16_spanish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

--
-- Volcado de datos para la tabla `Temas`
--

INSERT INTO `Temas` (`id_tema`, `nombre_tema`) VALUES
(1, 'Matemáticas'),
(2, 'Historia'),
(3, 'Ciencias'),
(4, 'Literatura'),
(5, 'Geografía');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `TestRealizados`
--

CREATE TABLE `TestRealizados` (
  `id_test` int NOT NULL,
  `id_usuario` int DEFAULT NULL,
  `resultado` int DEFAULT NULL,
  `es_respuesta_correcta` tinyint(1) DEFAULT NULL,
  `fecha_realizacion` timestamp NULL DEFAULT CURRENT_TIMESTAMP
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `Usuarios`
--

CREATE TABLE `Usuarios` (
  `id` int NOT NULL,
  `nombre` varchar(50) COLLATE utf16_spanish_ci NOT NULL,
  `contraseña` varchar(255) COLLATE utf16_spanish_ci NOT NULL,
  `primer_apellido` varchar(50) COLLATE utf16_spanish_ci NOT NULL,
  `segundo_apellido` varchar(50) COLLATE utf16_spanish_ci NOT NULL,
  `email` varchar(100) COLLATE utf16_spanish_ci NOT NULL,
  `Tipo` int DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf16 COLLATE=utf16_spanish_ci;

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `Preguntas`
--
ALTER TABLE `Preguntas`
  ADD PRIMARY KEY (`id_pregunta`),
  ADD KEY `tema_id` (`tema_id`);

--
-- Indices de la tabla `Respuestas`
--
ALTER TABLE `Respuestas`
  ADD PRIMARY KEY (`id_respuesta`),
  ADD KEY `id_pregunta` (`id_pregunta`);

--
-- Indices de la tabla `Temas`
--
ALTER TABLE `Temas`
  ADD PRIMARY KEY (`id_tema`);

--
-- Indices de la tabla `TestRealizados`
--
ALTER TABLE `TestRealizados`
  ADD PRIMARY KEY (`id_test`),
  ADD KEY `id_usuario` (`id_usuario`);

--
-- Indices de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `email` (`email`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `Preguntas`
--
ALTER TABLE `Preguntas`
  MODIFY `id_pregunta` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=51;

--
-- AUTO_INCREMENT de la tabla `Respuestas`
--
ALTER TABLE `Respuestas`
  MODIFY `id_respuesta` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=201;

--
-- AUTO_INCREMENT de la tabla `Temas`
--
ALTER TABLE `Temas`
  MODIFY `id_tema` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;

--
-- AUTO_INCREMENT de la tabla `TestRealizados`
--
ALTER TABLE `TestRealizados`
  MODIFY `id_test` int NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de la tabla `Usuarios`
--
ALTER TABLE `Usuarios`
  MODIFY `id` int NOT NULL AUTO_INCREMENT;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `Preguntas`
--
ALTER TABLE `Preguntas`
  ADD CONSTRAINT `Preguntas_ibfk_1` FOREIGN KEY (`tema_id`) REFERENCES `Temas` (`id_tema`);

--
-- Filtros para la tabla `Respuestas`
--
ALTER TABLE `Respuestas`
  ADD CONSTRAINT `Respuestas_ibfk_1` FOREIGN KEY (`id_pregunta`) REFERENCES `Preguntas` (`id_pregunta`);

--
-- Filtros para la tabla `TestRealizados`
--
ALTER TABLE `TestRealizados`
  ADD CONSTRAINT `TestRealizados_ibfk_1` FOREIGN KEY (`id_usuario`) REFERENCES `Usuarios` (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
