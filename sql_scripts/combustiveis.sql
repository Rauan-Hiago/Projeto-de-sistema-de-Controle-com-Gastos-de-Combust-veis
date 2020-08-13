-- phpMyAdmin SQL Dump
-- version 4.8.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 13-Ago-2020 às 21:48
-- Versão do servidor: 10.1.36-MariaDB
-- versão do PHP: 5.6.38

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `combustiveis`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `combustivel`
--

CREATE TABLE `combustivel` (
  `nome` varchar(30) DEFAULT NULL,
  `preco` double DEFAULT NULL,
  `id` int(11) NOT NULL,
  `datas` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `combustivel`
--

INSERT INTO `combustivel` (`nome`, `preco`, `id`, `datas`) VALUES
('gasolina', 4.39, 11, '2018-08-26');

-- --------------------------------------------------------

--
-- Estrutura da tabela `lancamento`
--

CREATE TABLE `lancamento` (
  `id` int(11) NOT NULL,
  `placa` varchar(30) DEFAULT NULL,
  `qtd` int(11) DEFAULT NULL,
  `tipo` varchar(15) DEFAULT NULL,
  `nome` varchar(230) DEFAULT NULL,
  `secretaria` varchar(20) DEFAULT NULL,
  `valor` double DEFAULT NULL,
  `datas` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `motoristas`
--

CREATE TABLE `motoristas` (
  `id` int(11) NOT NULL,
  `nome` varchar(40) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `datas` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `motoristas`
--

INSERT INTO `motoristas` (`id`, `nome`, `cpf`, `telefone`, `datas`) VALUES
(1, 'sdasda', '124514778', 'asdasd', '2014-02-10'),
(2, 'fvgfsdg', 'dfgdfg', 'dfgfdg', '2015-09-10');

-- --------------------------------------------------------

--
-- Estrutura da tabela `secretaria`
--

CREATE TABLE `secretaria` (
  `id` int(11) NOT NULL,
  `nome` varchar(30) DEFAULT NULL,
  `abreviacao` varchar(10) DEFAULT NULL,
  `datas` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `secretaria`
--

INSERT INTO `secretaria` (`id`, `nome`, `abreviacao`, `datas`) VALUES
(7, 'Esportes', 'SME', '2018-08-22');

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `nome` varchar(30) DEFAULT NULL,
  `cpf` varchar(15) DEFAULT NULL,
  `cargo` varchar(25) DEFAULT NULL,
  `email` varchar(20) DEFAULT NULL,
  `id` int(11) NOT NULL,
  `datas` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `usuario`
--

INSERT INTO `usuario` (`nome`, `cpf`, `cargo`, `email`, `id`, `datas`) VALUES
('Francisco Arruda', '047.002.074-18', 'Teste', 'xico@ufersa.edu.br', 2, '2020-07-23');

-- --------------------------------------------------------

--
-- Estrutura da tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `id` int(11) NOT NULL,
  `placa` varchar(30) DEFAULT NULL,
  `cor` varchar(10) DEFAULT NULL,
  `datas` date DEFAULT NULL,
  `modelo` varchar(20) DEFAULT NULL,
  `ano` int(11) DEFAULT NULL,
  `dono` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `veiculo`
--

INSERT INTO `veiculo` (`id`, `placa`, `cor`, `datas`, `modelo`, `ano`, `dono`) VALUES
(6, 'abc-1234', 'Azul', '2018-08-22', 'Ford Fox', 2018, 'Rauan'),
(7, 'dfgdfg', 'dfgdfg', '2018-04-02', 'dfgdf', 2015, 'dfgdfgdfg'),
(8, 'abc-1234', 'Azul', '2018-08-22', 'Ford Fox', 2018, 'Rauan'),
(9, 'abc-1234', 'Azul', '2018-08-22', 'GOL', 2018, 'Rauan'),
(10, 'abc-1234', 'Azul', '2018-08-22', 'GOL G5', 2018, 'Rauan');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `combustivel`
--
ALTER TABLE `combustivel`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `lancamento`
--
ALTER TABLE `lancamento`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `motoristas`
--
ALTER TABLE `motoristas`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `secretaria`
--
ALTER TABLE `secretaria`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `combustivel`
--
ALTER TABLE `combustivel`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `lancamento`
--
ALTER TABLE `lancamento`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `motoristas`
--
ALTER TABLE `motoristas`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `secretaria`
--
ALTER TABLE `secretaria`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT for table `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
