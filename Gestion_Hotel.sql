-- phpMyAdmin SQL Dump
-- version 5.2.1deb2
-- https://www.phpmyadmin.net/
--
-- Hôte : localhost
-- Généré le : sam. 06 jan. 2024 à 08:35
-- Version du serveur : 10.11.6-MariaDB-1
-- Version de PHP : 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de données : `Gestion_Hotel`
--

-- --------------------------------------------------------

--
-- Structure de la table `carte_de_Fidelite`
--

CREATE TABLE `carte_de_Fidelite` (
  `id_carte` int(200) NOT NULL,
  `numerocarte` int(200) DEFAULT NULL,
  `point_de_fidelite` int(11) DEFAULT NULL,
  `date_de_delivrance` date DEFAULT NULL,
  `dateExpiration` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Chambres`
--

CREATE TABLE `Chambres` (
  `id_chambre` int(11) NOT NULL,
  `type` varchar(20) DEFAULT NULL,
  `caracteristique` varchar(20) DEFAULT NULL,
  `situation` varchar(20) DEFAULT NULL,
  `tarif` decimal(10,2) DEFAULT NULL,
  `NUM_Chambre` int(11) DEFAULT NULL,
  `Etat_Chambre` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `clients`
--

CREATE TABLE `clients` (
  `id_client` int(200) NOT NULL,
  `nom` varchar(40) DEFAULT NULL,
  `prenom` varchar(40) DEFAULT NULL,
  `origne` varchar(40) DEFAULT NULL,
  `numero_de_telephone` int(20) DEFAULT NULL,
  `photo` longblob DEFAULT NULL,
  `id_carte_de_fidelite` int(200) DEFAULT NULL,
  `Categorie` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Déchargement des données de la table `clients`
--

INSERT INTO `clients` (`id_client`, `nom`, `prenom`, `origne`, `numero_de_telephone`, `photo`, `id_carte_de_fidelite`, `Categorie`) VALUES
(1, 'edonvf ', 'jk lk', 'GHANA', 565689, NULL, NULL, NULL),
(3, 'ch', 'cvv', 'TOGO', 45556, NULL, NULL, NULL),
(4, 'dg', 'cvv', 'BENIN', 55465, NULL, NULL, NULL),
(5, 'dg', 'cvv', 'BENIN', 55465, NULL, NULL, NULL),
(6, 'fm [pm\'', 'fdf', 'BENIN', 498, NULL, NULL, NULL),
(7, 'cb', 'cv', 'TOGO', 4422, NULL, NULL, NULL),
(9, '', '', 'Choisir', 4, NULL, NULL, 'Choisir'),
(10, 'kbhi', 'oj ', 'Choisir', 4, NULL, NULL, 'Choisir'),
(14, 'kbhi', 'oj ', 'TOGO', 4, NULL, NULL, 'Clients groupes'),
(16, 'mm', 'l', 'TOGO', 45, NULL, NULL, 'Clients privés,');

-- --------------------------------------------------------

--
-- Structure de la table `Facture`
--

CREATE TABLE `Facture` (
  `id_facture` int(200) NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_reservation` int(11) DEFAULT NULL,
  `date_facture` date DEFAULT NULL,
  `montant_total` decimal(10,2) DEFAULT NULL,
  `remise_exceptionnelle` decimal(10,2) DEFAULT NULL,
  `remise_fidélité` decimal(10,2) DEFAULT NULL,
  `taux_remise_fidélité` decimal(5,2) DEFAULT NULL,
  `mode_paiement` varchar(20) DEFAULT NULL,
  `montant_payé` decimal(10,2) DEFAULT NULL,
  `note` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Facture_Service`
--

CREATE TABLE `Facture_Service` (
  `id_facture_service` int(11) NOT NULL,
  `id_facture` int(11) DEFAULT NULL,
  `service` varchar(100) DEFAULT NULL,
  `quantite` int(11) DEFAULT NULL,
  `prix_unitaire` decimal(10,2) DEFAULT NULL,
  `total` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `reservation`
--

CREATE TABLE `reservation` (
  `id_reservation` int(11) NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_chambres` int(11) DEFAULT NULL,
  `date_d_arrive` date DEFAULT NULL,
  `date_depart` date DEFAULT NULL,
  `date_reser` date DEFAULT NULL,
  `validiter` int(25) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Service`
--

CREATE TABLE `Service` (
  `id_service` int(11) NOT NULL,
  `nom_service` varchar(255) NOT NULL,
  `description` text DEFAULT NULL,
  `prix` decimal(10,2) DEFAULT NULL,
  `disponibilite` tinyint(1) DEFAULT NULL,
  `heures_ouverture` varchar(255) DEFAULT NULL,
  `type_service` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Structure de la table `Utilisateurs`
--

CREATE TABLE `Utilisateurs` (
  `id_utilisateur` int(11) NOT NULL,
  `nom_utilisateur` varchar(50) NOT NULL,
  `mot_de_passe` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Index pour les tables déchargées
--

--
-- Index pour la table `carte_de_Fidelite`
--
ALTER TABLE `carte_de_Fidelite`
  ADD PRIMARY KEY (`id_carte`);

--
-- Index pour la table `Chambres`
--
ALTER TABLE `Chambres`
  ADD PRIMARY KEY (`id_chambre`);

--
-- Index pour la table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id_client`);

--
-- Index pour la table `Facture`
--
ALTER TABLE `Facture`
  ADD PRIMARY KEY (`id_facture`),
  ADD KEY `id_client` (`id_client`),
  ADD KEY `id_reservation` (`id_reservation`);

--
-- Index pour la table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  ADD PRIMARY KEY (`id_facture_service`),
  ADD KEY `id_facture` (`id_facture`);

--
-- Index pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`),
  ADD KEY `id_chambres` (`id_chambres`),
  ADD KEY `id_client` (`id_client`);

--
-- Index pour la table `Service`
--
ALTER TABLE `Service`
  ADD PRIMARY KEY (`id_service`);

--
-- Index pour la table `Utilisateurs`
--
ALTER TABLE `Utilisateurs`
  ADD PRIMARY KEY (`id_utilisateur`),
  ADD UNIQUE KEY `nom_utilisateur` (`nom_utilisateur`);

--
-- AUTO_INCREMENT pour les tables déchargées
--

--
-- AUTO_INCREMENT pour la table `carte_de_Fidelite`
--
ALTER TABLE `carte_de_Fidelite`
  MODIFY `id_carte` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Chambres`
--
ALTER TABLE `Chambres`
  MODIFY `id_chambre` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `clients`
--
ALTER TABLE `clients`
  MODIFY `id_client` int(200) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=21;

--
-- AUTO_INCREMENT pour la table `Facture`
--
ALTER TABLE `Facture`
  MODIFY `id_facture` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  MODIFY `id_facture_service` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id_reservation` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Service`
--
ALTER TABLE `Service`
  MODIFY `id_service` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT pour la table `Utilisateurs`
--
ALTER TABLE `Utilisateurs`
  MODIFY `id_utilisateur` int(11) NOT NULL AUTO_INCREMENT;

--
-- Contraintes pour les tables déchargées
--

--
-- Contraintes pour la table `Facture`
--
ALTER TABLE `Facture`
  ADD CONSTRAINT `Facture_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id_client`),
  ADD CONSTRAINT `Facture_ibfk_2` FOREIGN KEY (`id_reservation`) REFERENCES `reservation` (`id_reservation`);

--
-- Contraintes pour la table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  ADD CONSTRAINT `Facture_Service_ibfk_1` FOREIGN KEY (`id_facture`) REFERENCES `Facture` (`id_facture`);

--
-- Contraintes pour la table `reservation`
--
ALTER TABLE `reservation`
  ADD CONSTRAINT `reservation_ibfk_1` FOREIGN KEY (`id_chambres`) REFERENCES `reservation` (`id_reservation`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `reservation_ibfk_2` FOREIGN KEY (`id_client`) REFERENCES `reservation` (`id_reservation`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
