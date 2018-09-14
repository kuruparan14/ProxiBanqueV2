-- phpMyAdmin SQL Dump
-- version 4.7.9
-- https://www.phpmyadmin.net/
--
-- Hôte : 127.0.0.1:3306
-- Généré le :  ven. 14 sep. 2018 à 14:31
-- Version du serveur :  5.7.21
-- Version de PHP :  5.6.35

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `proxibanque`
--
CREATE DATABASE IF NOT EXISTS `proxibanque` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `proxibanque`;

-- --------------------------------------------------------

--
-- Structure de la table `client`
--

DROP TABLE IF EXISTS `client`;
CREATE TABLE IF NOT EXISTS `client` (
  `idClient` int(20) NOT NULL AUTO_INCREMENT,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `email` varchar(20) NOT NULL,
  `adresse` varchar(20) NOT NULL,
  `idConseiller` int(20) NOT NULL,
  `idCompte` int(20) NOT NULL,
  PRIMARY KEY (`idClient`)
) ENGINE=InnoDB AUTO_INCREMENT=89 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `client`
--

INSERT INTO `client` (`idClient`, `nom`, `prenom`, `email`, `adresse`, `idConseiller`, `idCompte`) VALUES
(1, 'Madonna', 'Chanteuse', 'madonna@gmail.com', 'USA', 3, 1213),
(11, 'Jakson', 'Michael', 'michael.j@gmail.com', 'USA', 3, 1011),
(12, 'Oppu', 'Kuru', 'kuru@gmail.com', 'BanlieuNord', 3, 123),
(45, 'Super', 'Lyes', 'lyes@gmail.com', 'Paris', 3, 456),
(88, 'Sanches', 'Renato', 'sanches@gmail.com', 'Portugal', 3, 789);

-- --------------------------------------------------------

--
-- Structure de la table `comptebanque`
--

DROP TABLE IF EXISTS `comptebanque`;
CREATE TABLE IF NOT EXISTS `comptebanque` (
  `numeroCompte` varchar(50) NOT NULL,
  `soldeCompteCourant` float NOT NULL,
  `soldeCompteEpargne` float NOT NULL,
  `compteCourant` varchar(50) NOT NULL,
  `compteEpargne` varchar(50) NOT NULL,
  `idCompteBanque` int(11) NOT NULL AUTO_INCREMENT,
  `idClient` int(11) NOT NULL,
  PRIMARY KEY (`idCompteBanque`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `comptebanque`
--

INSERT INTO `comptebanque` (`numeroCompte`, `soldeCompteCourant`, `soldeCompteEpargne`, `compteCourant`, `compteEpargne`, `idCompteBanque`, `idClient`) VALUES
('SQ125525522', 40000, 470, 'CC1', 'CE1', 1, 9),
('SQ125525523', 5000, 639.365, 'CC2', 'CE2', 2, 53),
('SQ125525543', 1000, 6998, 'CC3', 'CE3', 3, 4),
('SQ125525547', 2000, 500.25, 'CC4', 'CE4', 4, 7),
('SQ125525545', 3000, 750.36, 'CC5', 'CE5', 5, 11);

-- --------------------------------------------------------

--
-- Structure de la table `conseiller`
--

DROP TABLE IF EXISTS `conseiller`;
CREATE TABLE IF NOT EXISTS `conseiller` (
  `idConseiller` int(20) NOT NULL AUTO_INCREMENT,
  `login` varchar(20) NOT NULL,
  `password` varchar(20) NOT NULL,
  `idClient` int(11) NOT NULL,
  PRIMARY KEY (`idConseiller`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `conseiller`
--

INSERT INTO `conseiller` (`idConseiller`, `login`, `password`, `idClient`) VALUES
(1, 'nabil', 'fékir', 3),
(2, 'toufik', 'yahaoui', 4),
(3, 'krychowiak', 'grzegorz', 1),
(4, 'peter', 'hansson', 5),
(5, 'lewandowski', 'robert', 2);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
