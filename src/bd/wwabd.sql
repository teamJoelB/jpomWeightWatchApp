-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  jeu. 04 avr. 2019 à 10:22
-- Version du serveur :  5.7.24
-- Version de PHP :  7.2.14

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `wwabd`
--
CREATE DATABASE IF NOT EXISTS `wwabd` DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;
USE `wwabd`;

-- --------------------------------------------------------

--
-- Structure de la table `table_suiviobjectif`
--

DROP TABLE IF EXISTS `table_suiviobjectif`;
CREATE TABLE IF NOT EXISTS `table_suiviobjectif` (
  `idSuiviObj` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `statut` varchar(5) NOT NULL,
  `dateD` date NOT NULL,
  `dateF` date NOT NULL,
  `poidsO` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idSuiviObj`),
  KEY `fk_Table_User1_idx` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `table_suivipoids`
--

DROP TABLE IF EXISTS `table_suivipoids`;
CREATE TABLE IF NOT EXISTS `table_suivipoids` (
  `idSuiviPoids` int(11) NOT NULL AUTO_INCREMENT,
  `idUser` int(11) NOT NULL,
  `date` date NOT NULL,
  `poidsA` decimal(10,0) NOT NULL,
  PRIMARY KEY (`idSuiviPoids`),
  KEY `fk_Table_User_idx` (`idUser`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Structure de la table `table_user`
--

DROP TABLE IF EXISTS `table_user`;
CREATE TABLE IF NOT EXISTS `table_user` (
  `idUser` int(11) NOT NULL AUTO_INCREMENT,
  `nom` varchar(45) NOT NULL,
  `prenom` varchar(45) NOT NULL,
  `age` int(11) NOT NULL,
  `sexe` varchar(45) NOT NULL,
  `mail` varchar(45) NOT NULL,
  `taille` int(11) NOT NULL,
  `mdp` varchar(45) NOT NULL,
  PRIMARY KEY (`idUser`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

--
-- Déchargement des données de la table `table_user`
--

INSERT INTO `table_user` (`idUser`, `nom`, `prenom`, `age`, `sexe`, `mail`, `taille`, `mdp`) VALUES
(1, 'admin', 'admin', 20, 'M', 'admin', 100, 'admin');

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `table_suiviobjectif`
--
ALTER TABLE `table_suiviobjectif`
  ADD CONSTRAINT `fk_Table_User1` FOREIGN KEY (`idUser`) REFERENCES `table_user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Contraintes pour la table `table_suivipoids`
--
ALTER TABLE `table_suivipoids`
  ADD CONSTRAINT `fk_Table_User` FOREIGN KEY (`idUser`) REFERENCES `table_user` (`idUser`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
