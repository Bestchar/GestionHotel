-- phpMyAdmin SQL Dump
-- version 5.2.1deb1
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Nov 02, 2023 at 10:39 PM
-- Server version: 10.11.4-MariaDB-1
-- PHP Version: 8.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `Gestion_Hotel`
--

-- --------------------------------------------------------

--
-- Table structure for table `carte_de_Fidelite`
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
-- Table structure for table `chambres`
--

CREATE TABLE `chambres` (
  `id_chambre` int(200) NOT NULL,
  `categorie` varchar(40) DEFAULT NULL,
  `capacite` varchar(10) DEFAULT NULL,
  `prix` int(100) DEFAULT NULL,
  `id_Type_chambre` int(200) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `clients`
--

CREATE TABLE `clients` (
  `id_client` int(11) NOT NULL,
  `nom` varchar(40) DEFAULT NULL,
  `prenom` varchar(40) DEFAULT NULL,
  `origne` varchar(40) DEFAULT NULL,
  `numero_de_telephone` int(20) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `id_carte_de_fidelite` int(11) DEFAULT NULL,
  `id_Type_clients` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Facture`
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
  `note` varchar(255) DEFAULT NULL,
  `Chambre_id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Facture_Service`
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
-- Table structure for table `reservation`
--

CREATE TABLE `reservation` (
  `id_reservation` int(11) NOT NULL,
  `id_client` int(11) DEFAULT NULL,
  `id_chambre` int(11) DEFAULT NULL,
  `date_d_arrive` date DEFAULT NULL,
  `date_depart` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Service`
--

CREATE TABLE `Service` (
  `id_service` int(11) NOT NULL,
  `nom_service` varchar(255) NOT NULL,
  `description` text DEFAULT NULL,
  `prix` decimal(10,2) DEFAULT NULL,
  `disponibilite` tinyint(1) DEFAULT NULL,
  `heures_ouverture` varchar(255) DEFAULT NULL,
  `emplacement` varchar(255) DEFAULT NULL,
  `type_service` varchar(255) DEFAULT NULL,
  `evaluations` text DEFAULT NULL,
  `commentaires` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Type_chambre`
--

CREATE TABLE `Type_chambre` (
  `id_Type_chambre` int(200) NOT NULL,
  `categorie_chambre` text DEFAULT NULL,
  `description_chambre` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Type_clients`
--

CREATE TABLE `Type_clients` (
  `id_Type_clients` int(40) NOT NULL,
  `categories` tinytext DEFAULT NULL,
  `description` tinytext DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `Utilisateurs`
--

CREATE TABLE `Utilisateurs` (
  `id_utilisateur` int(11) NOT NULL,
  `nom_utilisateur` varchar(50) NOT NULL,
  `mot_de_passe` varchar(100) NOT NULL,
  `email` varchar(100) DEFAULT NULL,
  `role` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `carte_de_Fidelite`
--
ALTER TABLE `carte_de_Fidelite`
  ADD PRIMARY KEY (`id_carte`);

--
-- Indexes for table `chambres`
--
ALTER TABLE `chambres`
  ADD PRIMARY KEY (`id_chambre`);

--
-- Indexes for table `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`id_client`),
  ADD KEY `id_carte_de_fidelite` (`id_carte_de_fidelite`),
  ADD KEY `id_Type_clients` (`id_Type_clients`);

--
-- Indexes for table `Facture`
--
ALTER TABLE `Facture`
  ADD PRIMARY KEY (`id_facture`),
  ADD KEY `id_client` (`id_client`),
  ADD KEY `id_reservation` (`id_reservation`),
  ADD KEY `Chambre_id` (`Chambre_id`);

--
-- Indexes for table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  ADD PRIMARY KEY (`id_facture_service`),
  ADD KEY `id_facture` (`id_facture`);

--
-- Indexes for table `reservation`
--
ALTER TABLE `reservation`
  ADD PRIMARY KEY (`id_reservation`),
  ADD KEY `id_client` (`id_client`);

--
-- Indexes for table `Service`
--
ALTER TABLE `Service`
  ADD PRIMARY KEY (`id_service`);

--
-- Indexes for table `Type_chambre`
--
ALTER TABLE `Type_chambre`
  ADD PRIMARY KEY (`id_Type_chambre`);

--
-- Indexes for table `Type_clients`
--
ALTER TABLE `Type_clients`
  ADD PRIMARY KEY (`id_Type_clients`);

--
-- Indexes for table `Utilisateurs`
--
ALTER TABLE `Utilisateurs`
  ADD PRIMARY KEY (`id_utilisateur`),
  ADD UNIQUE KEY `nom_utilisateur` (`nom_utilisateur`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `carte_de_Fidelite`
--
ALTER TABLE `carte_de_Fidelite`
  MODIFY `id_carte` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `chambres`
--
ALTER TABLE `chambres`
  MODIFY `id_chambre` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `clients`
--
ALTER TABLE `clients`
  MODIFY `id_client` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Facture`
--
ALTER TABLE `Facture`
  MODIFY `id_facture` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  MODIFY `id_facture_service` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `reservation`
--
ALTER TABLE `reservation`
  MODIFY `id_reservation` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Service`
--
ALTER TABLE `Service`
  MODIFY `id_service` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Type_chambre`
--
ALTER TABLE `Type_chambre`
  MODIFY `id_Type_chambre` int(200) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Type_clients`
--
ALTER TABLE `Type_clients`
  MODIFY `id_Type_clients` int(40) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `Utilisateurs`
--
ALTER TABLE `Utilisateurs`
  MODIFY `id_utilisateur` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `clients`
--
ALTER TABLE `clients`
  ADD CONSTRAINT `clients_ibfk_1` FOREIGN KEY (`id_carte_de_fidelite`) REFERENCES `clients` (`id_client`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `clients_ibfk_2` FOREIGN KEY (`id_Type_clients`) REFERENCES `clients` (`id_client`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Facture`
--
ALTER TABLE `Facture`
  ADD CONSTRAINT `Facture_ibfk_1` FOREIGN KEY (`id_client`) REFERENCES `clients` (`id_client`),
  ADD CONSTRAINT `Facture_ibfk_2` FOREIGN KEY (`id_reservation`) REFERENCES `reservation` (`id_reservation`),
  ADD CONSTRAINT `Facture_ibfk_3` FOREIGN KEY (`Chambre_id`) REFERENCES `chambres` (`id_chambre`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `Facture_Service`
--
ALTER TABLE `Facture_Service`
  ADD CONSTRAINT `Facture_Service_ibfk_1` FOREIGN KEY (`id_facture`) REFERENCES `Facture` (`id_facture`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
