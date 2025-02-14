/*!40101 SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO" */;
/*!40101 SET time_zone = "+00:00" */;


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

-- --------------------------------------------------------

--
-- Table structure for table `produits`
--

DROP TABLE IF EXISTS `produits`;
CREATE TABLE IF NOT EXISTS `produits` (
  `id` integer NOT NULL /*!40101 AUTO_INCREMENT */,
  `nom` varchar(15) NOT NULL,
  `prix` int(11) NOT NULL,
  `qmax` int(10) /*!40101 UNSIGNED */ NOT NULL,
  PRIMARY KEY (`id`)
) /*!40101 ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=utf8 */;

--
-- Dumping data for table `produits`
--

INSERT INTO `produits` (`id`, `nom`, `prix`, `qmax`) VALUES
(1, 'Milk', 10, 10),
(2, 'Bread', 6, 10),
(5, 'Butter', 14, 10),
(6, 'Apple', 3, 10),
(7, 'Potato', 2, 10),
(8, 'Mais', 3, 10),
(9, 'Bananas', 3, 10),
(10, 'Tomato', 7, 10),
(11, 'Meat', 20, 10),
(12, 'Fish', 16, 10),
(13, 'Sugar', 12, 10),
(14, 'Salt', 5, 10);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
