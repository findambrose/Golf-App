-- phpMyAdmin SQL Dump
-- version 4.9.5
-- https://www.phpmyadmin.net/
--
-- Host: localhost:3306
-- Generation Time: Apr 21, 2020 at 11:24 AM
-- Server version: 10.3.16-MariaDB
-- PHP Version: 7.3.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `id13309641_reelgolf`
--

-- --------------------------------------------------------

--
-- Table structure for table `location_90105`
--

CREATE TABLE `location_90105` (
  `id` int(11) NOT NULL,
  `longitude` decimal(10,0) NOT NULL,
  `latitude` decimal(10,0) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `users_90105`
--

CREATE TABLE `users_90105` (
  `id` int(11) NOT NULL,
  `username` varchar(20) NOT NULL,
  `firstname` varchar(20) NOT NULL,
  `lastname` varchar(20) NOT NULL,
  `email` varchar(30) NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users_90105`
--

INSERT INTO `users_90105` (`id`, `username`, `firstname`, `lastname`, `email`, `password`) VALUES
(1, 'ambroo', 'ambroo', 'ambroo', 'ambroo@gmail.com', 'c6295485f7dcc2fcbf834ffbfa505dbb'),
(2, 'ambrose', 'ambrose', 'ambrose', 'ambrose@gmail.com', '519e331a6064d40ec330a39973132cdf'),
(3, 'test7', 'test7', 'test7', 'test7@gmail.com', 'b04083e53e242626595e2b8ea327e525'),
(4, 'test6', 'test7', 'test7', 'test6@gmail.com', 'b04083e53e242626595e2b8ea327e525'),
(5, 'rht', 'fsv', 'czvb', 'fbfd@yahoo.com', '2b016d90959eda144d600e4f870c30ba'),
(6, 'test9', 'test9', 'test9', 'test9@gmail.com', '2b016d90959eda144d600e4f870c30ba'),
(7, 'signup', 'signup', 'signup', 'signup@gmail.com', '7d2abf2d0fa7c3a0c13236910f30bc43'),
(8, 'login', 'loginhxjskkch', 'logindhsjjfgg', 'login@gdh.com', 'd56b699830e77ba53855679cb1d252da');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `location_90105`
--
ALTER TABLE `location_90105`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `users_90105`
--
ALTER TABLE `users_90105`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `users_90105`
--
ALTER TABLE `users_90105`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
