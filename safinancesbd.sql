-- phpMyAdmin SQL Dump
-- version 4.7.4
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le :  lun. 15 jan. 2018 à 00:03
-- Version du serveur :  10.1.28-MariaDB
-- Version de PHP :  7.1.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données :  `test`
--

DELIMITER $$
--
-- Procédures
--
CREATE DEFINER=`` PROCEDURE `AddGeometryColumn` (`catalog` VARCHAR(64), `t_schema` VARCHAR(64), `t_name` VARCHAR(64), `geometry_column` VARCHAR(64), `t_srid` INT)  begin
  set @qwe= concat('ALTER TABLE ', t_schema, '.', t_name, ' ADD ', geometry_column,' GEOMETRY REF_SYSTEM_ID=', t_srid); PREPARE ls from @qwe; execute ls; deallocate prepare ls; end$$

CREATE DEFINER=`` PROCEDURE `DropGeometryColumn` (`catalog` VARCHAR(64), `t_schema` VARCHAR(64), `t_name` VARCHAR(64), `geometry_column` VARCHAR(64))  begin
  set @qwe= concat('ALTER TABLE ', t_schema, '.', t_name, ' DROP ', geometry_column); PREPARE ls from @qwe; execute ls; deallocate prepare ls; end$$

DELIMITER ;

-- --------------------------------------------------------

--
-- Structure de la table `Admin`
--

CREATE TABLE `Admin` (
  `idAdmin` int(11) NOT NULL,
  `nom_admin` varchar(20) NOT NULL,
  `prenom_admin` varchar(20) NOT NULL,
  `loginAdmin` varchar(20) NOT NULL,
  `mdpAdmin` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'Administrateur'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Admin`
--

INSERT INTO `Admin` (`idAdmin`, `nom_admin`, `prenom_admin`, `loginAdmin`, `mdpAdmin`, `role`) VALUES
(4, 'Sall', 'Sy', 'A123', 'passer', 'Administrateur');


-- --------------------------------------------------------

--
-- Structure de la table `DepenseCheque`
--

CREATE TABLE `DepenseCheque` (
  `idDepenseCh` int(11) NOT NULL,
  `motif` varchar(50) NOT NULL,
  `montant` double NOT NULL,
  `date` date NOT NULL,
  `numCheque` double NOT NULL,
  `nomBeneficiaire` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `DepenseCheque`
--

INSERT INTO `DepenseCheque` (`idDepenseCh`, `motif`, `montant`, `date`, `numCheque`, `nomBeneficiaire`) VALUES
(1, 'achat ordi', 120000, '2018-01-01', 123456, 'kandji et freres'),
(2, 'achat accessoires', 250000, '2018-01-03', 123456, 'sysall'),
(3, 'dons', 5555662, '2018-01-10', 54889, 'aboo');

-- --------------------------------------------------------

--
-- Structure de la table `DepenseEspece`
--

CREATE TABLE `DepenseEspece` (
  `idDepenseEs` int(11) NOT NULL,
  `motif` varchar(50) NOT NULL,
  `montant` double NOT NULL,
  `date` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `DepenseEspece`
--

INSERT INTO `DepenseEspece` (`idDepenseEs`, `motif`, `montant`, `date`) VALUES
(1, 'achat ordi', 350000, '2018-01-01'),
(2, 'achat chaises', 100000, '2018-01-03');



-- --------------------------------------------------------

--
-- Structure de la table `Financier`
--

CREATE TABLE `Financier` (
  `idFinancier` int(11) NOT NULL,
  `nom_financier` varchar(20) NOT NULL,
  `prenom_financier` varchar(20) NOT NULL,
  `loginFinancier` varchar(20) NOT NULL,
  `mdpFinancier` varchar(20) NOT NULL,
  `role` varchar(20) NOT NULL DEFAULT 'Financier'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Financier`
--

INSERT INTO `Financier` (`idFinancier`, `nom_financier`, `prenom_financier`, `loginFinancier`, `mdpFinancier`, `role`) VALUES
(1, 'saizonou', 'aboo', 'F123', 'passer', 'Financier');

-- --------------------------------------------------------

--
-- Structure de la table `Membres`
--

CREATE TABLE `Membres` (
  `idMembre` int(11) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `date_naissance` date NOT NULL,
  `dateEntrée` date NOT NULL,
  `Adresse` varchar(50) NOT NULL,
  `état` varchar(20) NOT NULL DEFAULT 'Activé'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `Membres`
--

INSERT INTO `Membres` (`idMembre`, `nom`, `prenom`, `date_naissance`, `dateEntrée`, `Adresse`, `état`) VALUES
(1, 'sy', 'sall', '1996-11-14', '2017-12-25', 'baobab', 'Activé'),
(2, 'anna', 'diandy', '1974-11-22', '2017-12-26', 'thies', 'Activé'),
(3, 'Saizonou', 'Aboo', '1997-08-13', '2018-01-01', 'medina', 'Activé'),
(4, 'ndiaye', 'deffa', '1997-09-03', '2018-01-02', 'nord foire', 'Activé'),
(5, 'Ndiaye', 'Matalibé', '1995-06-01', '2018-01-04', 'baobab', 'Activé'),
(6, 'agbanrin', 'zeidane', '1997-09-03', '2018-01-01', 'medina', 'Activé');


-- --------------------------------------------------------


--
-- Structure de la table `RecetteMembre`
--

CREATE TABLE `RecetteMembre` (
  `id` int(11) NOT NULL,
  `montant` double NOT NULL,
  `date` date NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL,
  `categorie` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RecetteMembre`
--

INSERT INTO `RecetteMembre` (`id`, `montant`, `date`, `nom`, `prenom`, `categorie`) VALUES
(1, 1000000, '2018-01-01', 'saizonou', 'saizonou', 1),
(2, 20000, '2018-01-03', 'saizonou', 'saizonou', 2),
(3, 745000, '2018-01-05', 'saizonou', 'saizonou', 3),
(4, 5500000, '2018-01-08', 'saizonou', 'saizonou', 1),
(5, 850000, '2018-01-10', 'saizonou', 'saizonou', 2),
(6, 22225, '2018-01-01', 'saizonou', 'saizonou', 2);

-- --------------------------------------------------------

--
-- Structure de la table `RecettePrincipale`
--

CREATE TABLE `RecettePrincipale` (
  `id_recPrincipale` int(11) NOT NULL,
  `montant` double NOT NULL,
  `date` date NOT NULL,
  `categorie` int(10) NOT NULL DEFAULT '4'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RecettePrincipale`
--

INSERT INTO `RecettePrincipale` (`id_recPrincipale`, `montant`, `date`, `categorie`) VALUES
(1, 100000, '2018-01-01', 4),
(2, 20000000, '2018-01-03', 4),
(3, 60000, '2018-01-05', 4),
(4, 850000000, '2018-01-09', 4);

-- --------------------------------------------------------

--
-- Structure de la table `RecetteSecondaire`
--

CREATE TABLE `RecetteSecondaire` (
  `id_recSecondaire` int(11) NOT NULL,
  `montant` double NOT NULL,
  `date` date NOT NULL,
  `libellé` varchar(50) NOT NULL,
  `nom` varchar(20) NOT NULL,
  `prenom` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Déchargement des données de la table `RecetteSecondaire`
--

INSERT INTO `RecetteSecondaire` (`id_recSecondaire`, `montant`, `date`, `libellé`, `nom`, `prenom`) VALUES
(1, 10000, '2018-01-01', 'cotisation', 'saizonou', 'saizonou'),
(2, 50000, '2018-01-05', 'subvention', 'sall', 'sy'),
(3, 550000, '2018-01-09', 'gains', 'sall', 'sy'),
(4, 900000, '2018-01-06', 'dons', 'ndiaye', 'matalibé');

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `Admin`
--
ALTER TABLE `Admin`
  ADD PRIMARY KEY (`idAdmin`);

--
-- Index pour la table `DepenseCheque`
--
ALTER TABLE `DepenseCheque`
  ADD PRIMARY KEY (`idDepenseCh`);

--
-- Index pour la table `DepenseEspece`
--
ALTER TABLE `DepenseEspece`
  ADD PRIMARY KEY (`idDepenseEs`);

--
-- Index pour la table `Financier`
--
ALTER TABLE `Financier`
  ADD PRIMARY KEY (`idFinancier`);

--
-- Index pour la table `Membres`
--
ALTER TABLE `Membres`
  ADD PRIMARY KEY (`idMembre`);

--
-- Index pour la table `RecetteMembre`
--
ALTER TABLE `RecetteMembre`
  ADD PRIMARY KEY (`id`);

--
-- Index pour la table `RecettePrincipale`
--
ALTER TABLE `RecettePrincipale`
  ADD PRIMARY KEY (`id_recPrincipale`);

--
-- Index pour la table `RecetteSecondaire`
--
ALTER TABLE `RecetteSecondaire`
  ADD PRIMARY KEY (`id_recSecondaire`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `Admin`
--
ALTER TABLE `Admin`
  MODIFY `idAdmin` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `DepenseCheque`
--
ALTER TABLE `DepenseCheque`
  MODIFY `idDepenseCh` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT pour la table `DepenseEspece`
--
ALTER TABLE `DepenseEspece`
  MODIFY `idDepenseEs` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT pour la table `Financier`
--
ALTER TABLE `Financier`
  MODIFY `idFinancier` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT pour la table `Membres`
--
ALTER TABLE `Membres`
  MODIFY `idMembre` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `RecetteMembre`
--
ALTER TABLE `RecetteMembre`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT pour la table `RecettePrincipale`
--
ALTER TABLE `RecettePrincipale`
  MODIFY `id_recPrincipale` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;

--
-- AUTO_INCREMENT pour la table `RecetteSecondaire`
--
ALTER TABLE `RecetteSecondaire`
  MODIFY `id_recSecondaire` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=5;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
