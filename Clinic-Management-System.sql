-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 18, 2025 at 09:02 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicmanagementsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_appointments`
--

CREATE TABLE `tbl_appointments` (
  `ID` int(11) NOT NULL,
  `Patient_id` int(11) NOT NULL,
  `Doctor_id` int(11) NOT NULL,
  `Appointment_date` date NOT NULL,
  `Appointment_time` time NOT NULL,
  `Status` enum('Reserved','Cancelled','Completed') NOT NULL,
  `Created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_invoices`
--

CREATE TABLE `tbl_invoices` (
  `ID` int(11) NOT NULL,
  `Patient_id` int(11) NOT NULL,
  `Visit_id` int(11) NOT NULL,
  `Total_amount` double NOT NULL,
  `Payment_method` enum('Cach','Electronic card','Transfer') NOT NULL DEFAULT 'Cach',
  `Payment_date` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_patients`
--

CREATE TABLE `tbl_patients` (
  `ID` int(11) NOT NULL,
  `Full_name` varchar(100) NOT NULL,
  `Age` int(2) NOT NULL,
  `Gender` enum('Male','Female') NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Address` varchar(100) NOT NULL,
  `Medication_nots` text NOT NULL,
  `Created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_prescryption`
--

CREATE TABLE `tbl_prescryption` (
  `ID` int(11) NOT NULL,
  `Visit_id` int(11) NOT NULL,
  `Medicatoin` text NOT NULL,
  `Dosage` varchar(50) NOT NULL,
  `Duration` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_users`
--

CREATE TABLE `tbl_users` (
  `ID` int(11) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(150) NOT NULL,
  `Role` enum('Admin','User') NOT NULL DEFAULT 'User',
  `Full_name` varchar(100) NOT NULL,
  `Phone` varchar(20) NOT NULL,
  `Created_at` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Dumping data for table `tbl_users`
--

INSERT INTO `tbl_users` (`ID`, `Username`, `Password`, `Role`, `Full_name`, `Phone`, `Created_at`) VALUES
(3, 'أحمد', '123', 'Admin', 'أحمد محمد', '789456123', '2025-05-18 16:17:36'),
(7, 'محمد', '123', 'User', 'محمد أحمد', '779456123', '2025-05-18 16:18:25');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_visits`
--

CREATE TABLE `tbl_visits` (
  `ID` int(11) NOT NULL,
  `Appointment_id` int(11) NOT NULL,
  `Doctor_id` int(11) NOT NULL,
  `Visit_date` date NOT NULL,
  `Diagnosis` text NOT NULL,
  `Notes` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_general_ci;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Patient_id` (`Patient_id`),
  ADD KEY `Doctor_id` (`Doctor_id`);

--
-- Indexes for table `tbl_invoices`
--
ALTER TABLE `tbl_invoices`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Patient_id` (`Patient_id`),
  ADD KEY `Visit_id` (`Visit_id`);

--
-- Indexes for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbl_prescryption`
--
ALTER TABLE `tbl_prescryption`
  ADD PRIMARY KEY (`ID`);

--
-- Indexes for table `tbl_users`
--
ALTER TABLE `tbl_users`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Username` (`Username`),
  ADD UNIQUE KEY `Phone` (`Phone`);

--
-- Indexes for table `tbl_visits`
--
ALTER TABLE `tbl_visits`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `Appointment_id` (`Appointment_id`),
  ADD KEY `Doctor_id` (`Doctor_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_invoices`
--
ALTER TABLE `tbl_invoices`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_prescryption`
--
ALTER TABLE `tbl_prescryption`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbl_users`
--
ALTER TABLE `tbl_users`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT for table `tbl_visits`
--
ALTER TABLE `tbl_visits`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `tbl_appointments`
--
ALTER TABLE `tbl_appointments`
  ADD CONSTRAINT `tbl_appointments_ibfk_1` FOREIGN KEY (`Patient_id`) REFERENCES `tbl_patients` (`ID`),
  ADD CONSTRAINT `tbl_appointments_ibfk_2` FOREIGN KEY (`Doctor_id`) REFERENCES `tbl_users` (`ID`);

--
-- Constraints for table `tbl_invoices`
--
ALTER TABLE `tbl_invoices`
  ADD CONSTRAINT `tbl_invoices_ibfk_1` FOREIGN KEY (`Patient_id`) REFERENCES `tbl_patients` (`ID`),
  ADD CONSTRAINT `tbl_invoices_ibfk_2` FOREIGN KEY (`Visit_id`) REFERENCES `tbl_visits` (`ID`);

--
-- Constraints for table `tbl_visits`
--
ALTER TABLE `tbl_visits`
  ADD CONSTRAINT `tbl_visits_ibfk_1` FOREIGN KEY (`Appointment_id`) REFERENCES `tbl_appointments` (`ID`),
  ADD CONSTRAINT `tbl_visits_ibfk_2` FOREIGN KEY (`Doctor_id`) REFERENCES `tbl_users` (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
