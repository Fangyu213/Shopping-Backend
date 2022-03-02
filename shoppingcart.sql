-- phpMyAdmin SQL Dump
-- version 5.1.0
-- https://www.phpmyadmin.net/
--
-- 主機： localhost:8889
-- 產生時間： 2022 年 03 月 02 日 12:37
-- 伺服器版本： 5.7.34
-- PHP 版本： 8.0.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- 資料庫： `shoppingcart`
--

-- --------------------------------------------------------

--
-- 資料表結構 `bill`
--

CREATE TABLE `bill` (
  `billID` int(255) NOT NULL,
  `ordersID` int(11) NOT NULL,
  `paytime` date NOT NULL,
  `shippingrate` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `totalprice` int(11) NOT NULL,
  `paid` int(11) NOT NULL,
  `shipped` tinyint(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 資料表結構 `favorites`
--

CREATE TABLE `favorites` (
  `productsID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `updatetime` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 資料表結構 `orders`
--

CREATE TABLE `orders` (
  `ordersID` int(11) NOT NULL,
  `productsID` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `odertime` date NOT NULL,
  `billID` int(11) NOT NULL,
  `userID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 資料表結構 `products`
--

CREATE TABLE `products` (
  `productsID` int(11) NOT NULL,
  `name` varchar(255) NOT NULL,
  `price` int(11) NOT NULL,
  `photoID` varchar(255) NOT NULL,
  `introduction` varchar(255) NOT NULL,
  `storage` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `products`
--

INSERT INTO `products` (`productsID`, `name`, `price`, `photoID`, `introduction`, `storage`) VALUES
(2, 'ggg', 54, '今天是二月二十五號', '我等等要打疫苗', 13);

-- --------------------------------------------------------

--
-- 資料表結構 `productscomments`
--

CREATE TABLE `productscomments` (
  `commentsID` int(11) NOT NULL,
  `userID` int(11) NOT NULL,
  `messages` varchar(255) NOT NULL,
  `updatetime` date NOT NULL,
  `productsID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 資料表結構 `productsphoto`
--

CREATE TABLE `productsphoto` (
  `photoID` int(11) NOT NULL,
  `photo` varchar(255) NOT NULL,
  `introduction` varchar(255) NOT NULL,
  `uploadtime` date NOT NULL,
  `productsID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- 資料表結構 `user`
--

CREATE TABLE `user` (
  `userID` int(255) NOT NULL,
  `name` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL,
  `nickname` varchar(255) NOT NULL,
  `gender` varchar(255) NOT NULL,
  `birthday` date NOT NULL,
  `phone` varchar(255) NOT NULL,
  `address` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `creditcards` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- 傾印資料表的資料 `user`
--

INSERT INTO `user` (`userID`, `name`, `password`, `nickname`, `gender`, `birthday`, `phone`, `address`, `email`, `creditcards`) VALUES
(1, 'Mark', 'mark860238', 'Micky', 'Male', '2022-02-01', '097739947739', '12345', 'glrjsiej@gmail', '123339-333-2222');

--
-- 已傾印資料表的索引
--

--
-- 資料表索引 `bill`
--
ALTER TABLE `bill`
  ADD PRIMARY KEY (`billID`),
  ADD KEY `odersID` (`ordersID`,`userID`),
  ADD KEY `userID` (`userID`);

--
-- 資料表索引 `favorites`
--
ALTER TABLE `favorites`
  ADD PRIMARY KEY (`productsID`,`userID`);

--
-- 資料表索引 `orders`
--
ALTER TABLE `orders`
  ADD PRIMARY KEY (`ordersID`),
  ADD KEY `billID` (`billID`),
  ADD KEY `productsID` (`productsID`,`userID`),
  ADD KEY `userID` (`userID`);

--
-- 資料表索引 `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`productsID`),
  ADD KEY `photoID` (`photoID`);

--
-- 資料表索引 `productscomments`
--
ALTER TABLE `productscomments`
  ADD PRIMARY KEY (`commentsID`),
  ADD KEY `userID` (`userID`,`productsID`),
  ADD KEY `productsID` (`productsID`);

--
-- 資料表索引 `productsphoto`
--
ALTER TABLE `productsphoto`
  ADD PRIMARY KEY (`photoID`),
  ADD KEY `productsID` (`productsID`);

--
-- 資料表索引 `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userID`),
  ADD KEY `userID` (`userID`);

--
-- 在傾印的資料表使用自動遞增(AUTO_INCREMENT)
--

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `bill`
--
ALTER TABLE `bill`
  MODIFY `billID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `orders`
--
ALTER TABLE `orders`
  MODIFY `ordersID` int(11) NOT NULL AUTO_INCREMENT;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `products`
--
ALTER TABLE `products`
  MODIFY `productsID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `productscomments`
--
ALTER TABLE `productscomments`
  MODIFY `commentsID` int(11) NOT NULL AUTO_INCREMENT;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `productsphoto`
--
ALTER TABLE `productsphoto`
  MODIFY `photoID` int(11) NOT NULL AUTO_INCREMENT;

--
-- 使用資料表自動遞增(AUTO_INCREMENT) `user`
--
ALTER TABLE `user`
  MODIFY `userID` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- 已傾印資料表的限制式
--

--
-- 資料表的限制式 `bill`
--
ALTER TABLE `bill`
  ADD CONSTRAINT `bill_ibfk_1` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- 資料表的限制式 `orders`
--
ALTER TABLE `orders`
  ADD CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`billID`) REFERENCES `bill` (`billID`),
  ADD CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`productsID`) REFERENCES `products` (`productsID`),
  ADD CONSTRAINT `orders_ibfk_3` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- 資料表的限制式 `productscomments`
--
ALTER TABLE `productscomments`
  ADD CONSTRAINT `productscomments_ibfk_1` FOREIGN KEY (`productsID`) REFERENCES `products` (`productsID`),
  ADD CONSTRAINT `productscomments_ibfk_2` FOREIGN KEY (`userID`) REFERENCES `user` (`userID`);

--
-- 資料表的限制式 `productsphoto`
--
ALTER TABLE `productsphoto`
  ADD CONSTRAINT `productsphoto_ibfk_1` FOREIGN KEY (`productsID`) REFERENCES `products` (`productsID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
