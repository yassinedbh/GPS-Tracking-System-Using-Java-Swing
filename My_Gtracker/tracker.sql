-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1
-- Généré le : mer. 04 mai 2022 à 14:44
-- Version du serveur :  10.4.18-MariaDB
-- Version de PHP : 7.3.27

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `tracker`
--

-- --------------------------------------------------------

--
-- Structure de la table `position`
--

CREATE TABLE `position` (
  `id` int(11) NOT NULL,
  `latitude` double DEFAULT NULL,
  `longitude` double DEFAULT NULL,
  `date` date DEFAULT NULL,
  `idTracker` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `position`
--

INSERT INTO `position` (`id`, `latitude`, `longitude`, `date`, `idTracker`) VALUES
(1, 20, -9, '2022-05-04', 1),
(2, 40, -8, '2022-05-04', 2),
(3, 60, -2, '2021-10-22', 2),
(4, 50, 9, '2022-05-03', 4);

-- --------------------------------------------------------

--
-- Structure de la table `tracker`
--

CREATE TABLE `tracker` (
  `id` int(11) NOT NULL,
  `simNumber` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `tracker`
--

INSERT INTO `tracker` (`id`, `simNumber`) VALUES
(1, '14522'),
(2, '4552'),
(3, '14992'),
(4, '2654');

-- --------------------------------------------------------

--
-- Structure de la table `user`
--

CREATE TABLE `user` (
  `id` int(11) NOT NULL,
  `username` varchar(20) DEFAULT NULL,
  `cin` varchar(20) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `user`
--

INSERT INTO `user` (`id`, `username`, `cin`, `password`) VALUES
(1, 'yassine', 'AD5A5A6D6A', 'admin'),
(2, 'yassine', 'AD5A5A6D6A', 'admin');

-- --------------------------------------------------------

--
-- Structure de la table `vehicule`
--

CREATE TABLE `vehicule` (
  `id` int(11) NOT NULL,
  `matricule` varchar(20) DEFAULT NULL,
  `marque` varchar(20) DEFAULT NULL,
  `type` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vehicule`
--

INSERT INTO `vehicule` (`id`, `matricule`, `marque`, `type`) VALUES
(1, '12352-a-26', 'Dacia', 'Hybride'),
(2, '78523-d-1', 'Renault', 'Hybride'),
(3, '41235-b-10', 'Fiat', 'Hybride'),
(4, '52599-o-34', 'Seat', 'Hybride');

-- --------------------------------------------------------

--
-- Structure de la table `vehiculegpstracker`
--

CREATE TABLE `vehiculegpstracker` (
  `id` int(11) NOT NULL,
  `dateDebut` date DEFAULT NULL,
  `dateFin` date DEFAULT NULL,
  `idTracker` int(11) DEFAULT NULL,
  `idVehicule` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Déchargement des données de la table `vehiculegpstracker`
--

INSERT INTO `vehiculegpstracker` (`id`, `dateDebut`, `dateFin`, `idTracker`, `idVehicule`) VALUES
(1, '2020-01-01', NULL, 1, 1),
(2, '2022-05-03', '2022-05-04', 4, 4);

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `position`
--
ALTER TABLE `position`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk` (`idTracker`);

--
-- Index pour la table `tracker`
--
ALTER TABLE `tracker`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vehicule`
--
ALTER TABLE `vehicule`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `vehiculegpstracker`
--
ALTER TABLE `vehiculegpstracker`
  ADD PRIMARY KEY (`id`),
  ADD KEY `fk2` (`idTracker`),
  ADD KEY `fk3` (`idVehicule`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `position`
--
ALTER TABLE `position`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `tracker`
--
ALTER TABLE `tracker`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `user`
--
ALTER TABLE `user`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `vehicule`
--
ALTER TABLE `vehicule`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `vehiculegpstracker`
--
ALTER TABLE `vehiculegpstracker`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `position`
--
ALTER TABLE `position`
  ADD CONSTRAINT `fk` FOREIGN KEY (`idTracker`) REFERENCES `tracker` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Contraintes pour la table `vehiculegpstracker`
--
ALTER TABLE `vehiculegpstracker`
  ADD CONSTRAINT `fk2` FOREIGN KEY (`idTracker`) REFERENCES `tracker` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `fk3` FOREIGN KEY (`idVehicule`) REFERENCES `vehicule` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
