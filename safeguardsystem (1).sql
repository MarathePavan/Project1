-- phpMyAdmin SQL Dump
-- version 4.7.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Sep 20, 2020 at 10:25 AM
-- Server version: 10.1.22-MariaDB
-- PHP Version: 7.1.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `safeguardsystem`
--

-- --------------------------------------------------------

--
-- Table structure for table `soft_paths`
--

CREATE TABLE `soft_paths` (
  `id` int(11) NOT NULL,
  `sname` text NOT NULL,
  `path` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `soft_paths`
--

INSERT INTO `soft_paths` (`id`, `sname`, `path`) VALUES
(1, 'sublime_text.exe', 'G:\\InstallSoft\\SubLimeText\\Sublime Text 3\\sublime_text.exe'),
(2, 'StarUML.exe', 'C:\\Program Files\\StarUML\\StarUML.exe'),
(3, 'notepad++.exe', 'C:\\Program Files\\Notepad++\\notepad++.exe'),
(4, 'notepad++.exe', 'C:\\Program Files\\Notepad++\\notepad++.exe'),
(5, 'sublime_text.exe', 'G:\\InstallSoft\\SubLimeText\\Sublime Text 3\\sublime_text.exe'),
(6, 'TypingMaster.exe', 'G:\\InstallSoft\\TypingTest\\TypingMaster.exe'),
(7, 'codeblocks.exe', 'G:\\InstallSoft\\CodeBlocks\\codeblocks.exe');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `id` int(11) NOT NULL,
  `name` text NOT NULL,
  `email` text NOT NULL,
  `password` text NOT NULL,
  `keyy` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`id`, `name`, `email`, `password`, `keyy`) VALUES
(1, 'Khatri', 'khatri', '1234', 'khatri'),
(2, 'Kaustubh', 'kau', '123', 'kau'),
(3, 'Sanket', 'san', '123', 'san'),
(4, 'Demo', 'demo', '123', 'demo'),
(5, 'User', 'user_name', '123', 'user'),
(6, 'pankaj', 'khatri', '123', 'pankja '),
(7, 'pro', 'pro', '123', 'pankja');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `soft_paths`
--
ALTER TABLE `soft_paths`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `userinfo`
--
ALTER TABLE `userinfo`
  ADD PRIMARY KEY (`id`,`password`(20),`email`(40));

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `soft_paths`
--
ALTER TABLE `soft_paths`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `userinfo`
--
ALTER TABLE `userinfo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
