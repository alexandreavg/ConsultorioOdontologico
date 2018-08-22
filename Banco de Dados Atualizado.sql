-- --------------------------------------------------------
-- Servidor:                     127.0.0.1
-- Versão do servidor:           10.1.19-MariaDB - mariadb.org binary distribution
-- OS do Servidor:               Win32
-- HeidiSQL Versão:              9.4.0.5142
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- Copiando estrutura do banco de dados para bd_consultorio
CREATE DATABASE IF NOT EXISTS `bd_consultorio` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `bd_consultorio`;

-- Copiando estrutura para tabela bd_consultorio.agendamento
CREATE TABLE IF NOT EXISTS `agendamento` (
  `codAgendamento` int(10) NOT NULL AUTO_INCREMENT,
  `codDentistaAgendamento` int(10) NOT NULL,
  `codPacienteAgendamento` int(10) NOT NULL,
  `obsAgendamento` longtext NOT NULL,
  `dataLancamentoAgendamento` date NOT NULL DEFAULT '1000-01-01',
  `dataConsultaAgendamento` date NOT NULL DEFAULT '1000-01-01',
  `codServicoAgendamento` int(10) NOT NULL,
  `tipoAgendamento` varchar(50) NOT NULL,
  PRIMARY KEY (`codAgendamento`),
  KEY `FKcodDentistaAgendamento` (`codDentistaAgendamento`),
  KEY `FKcodPacienteAgendamento` (`codPacienteAgendamento`),
  KEY `FKcodServicoAgendamento` (`codServicoAgendamento`),
  CONSTRAINT `FKcodDentistaAgendamento` FOREIGN KEY (`codDentistaAgendamento`) REFERENCES `dentista` (`codDentista`),
  CONSTRAINT `FKcodPacienteAgendamento` FOREIGN KEY (`codPacienteAgendamento`) REFERENCES `paciente` (`codPaciente`),
  CONSTRAINT `FKcodServicoAgendamento` FOREIGN KEY (`codServicoAgendamento`) REFERENCES `servico` (`codServico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.atendimento
CREATE TABLE IF NOT EXISTS `atendimento` (
  `codAtendimento` int(10) NOT NULL AUTO_INCREMENT,
  `codAgendamento` int(10) NOT NULL DEFAULT '0',
  `procedimentoAtendimento` longtext NOT NULL,
  `obsAtendimento` longtext NOT NULL,
  `nvlAvancoAtendimento` varchar(45) NOT NULL,
  `procedimentoFuturoAtendimento` longtext NOT NULL,
  PRIMARY KEY (`codAtendimento`),
  KEY `CodAgendamento` (`codAgendamento`),
  CONSTRAINT `FKCodAgendamento` FOREIGN KEY (`codAgendamento`) REFERENCES `agendamento` (`codAgendamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.contasreceber
CREATE TABLE IF NOT EXISTS `contasreceber` (
  `codContasReceber` int(11) NOT NULL,
  `valorcodContasReceber` float NOT NULL,
  `numeroDaParcelacodContasReceber` int(11) NOT NULL,
  `dtPagamentocodContasReceber` date NOT NULL DEFAULT '1000-01-01',
  `dtVencimentocodContasReceber` date NOT NULL DEFAULT '1000-01-01',
  `codContrato` int(11) NOT NULL,
  `statuscodContasReceber` varchar(50) NOT NULL,
  `reciboEmitidoContasReceber` tinyint(4) NOT NULL,
  PRIMARY KEY (`codContasReceber`),
  KEY `FK1codContrato` (`codContrato`),
  CONSTRAINT `FK1codContrato` FOREIGN KEY (`codContrato`) REFERENCES `contrato` (`codContrato`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.contrato
CREATE TABLE IF NOT EXISTS `contrato` (
  `codContrato` int(10) NOT NULL DEFAULT '0',
  `codOrcamento` int(10) NOT NULL DEFAULT '0',
  `posContrato` varchar(120) DEFAULT NULL,
  `riscoContrato` varchar(120) DEFAULT NULL,
  `dtInicioContrato` date DEFAULT '1000-01-01',
  PRIMARY KEY (`codContrato`),
  KEY `CodOrcamento` (`codOrcamento`),
  CONSTRAINT `FKCodOrcamento` FOREIGN KEY (`codOrcamento`) REFERENCES `orcamento` (`CodOrcamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.dentista
CREATE TABLE IF NOT EXISTS `dentista` (
  `codDentista` int(8) NOT NULL AUTO_INCREMENT,
  `dtNascimentoDentista` date NOT NULL DEFAULT '1000-01-01',
  `cpfDentista` bigint(16) NOT NULL DEFAULT '0',
  `rgDentista` varchar(50) NOT NULL DEFAULT '0',
  `estadoCivilDentista` varchar(50) NOT NULL DEFAULT '0',
  `emailDentista` varchar(50) NOT NULL DEFAULT '0',
  `statusDentista` tinyint(4) NOT NULL,
  `codEndereco` int(8) NOT NULL,
  `nomeDentista` varchar(120) NOT NULL DEFAULT '0',
  `telefoneDentista` int(11) DEFAULT '0',
  `celularDentista` int(11) NOT NULL DEFAULT '0',
  PRIMARY KEY (`codDentista`),
  KEY `codEndereco` (`codEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.dentista_tratamento
CREATE TABLE IF NOT EXISTS `dentista_tratamento` (
  `codDentista` int(11) DEFAULT NULL,
  `codTratamento` int(11) DEFAULT NULL,
  KEY `FK1codDentista` (`codDentista`),
  KEY `FK2codTratamento` (`codTratamento`),
  CONSTRAINT `FK1codDentista` FOREIGN KEY (`codDentista`) REFERENCES `dentista` (`codDentista`),
  CONSTRAINT `FK2codTratamento` FOREIGN KEY (`codTratamento`) REFERENCES `tratamento` (`codTratamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.endereco
CREATE TABLE IF NOT EXISTS `endereco` (
  `codEndereco` int(10) NOT NULL AUTO_INCREMENT,
  `ruaEndereco` varchar(120) NOT NULL DEFAULT '',
  `numEndereco` int(10) NOT NULL,
  `bairroEndereco` varchar(120) NOT NULL DEFAULT '',
  `cidadeEndereco` varchar(120) NOT NULL DEFAULT '',
  `ufEndereco` varchar(120) NOT NULL DEFAULT '',
  `complementoEndereco` varchar(120) NOT NULL DEFAULT '',
  PRIMARY KEY (`codEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.orcamento
CREATE TABLE IF NOT EXISTS `orcamento` (
  `codOrcamento` int(10) NOT NULL AUTO_INCREMENT,
  `codAgendamento` int(10) NOT NULL DEFAULT '0',
  `valorOrcamento` float NOT NULL DEFAULT '0',
  `qtdParcelaOrcamento` int(10) NOT NULL DEFAULT '0',
  `tempoDuracaoOrcamento` varchar(45) NOT NULL,
  PRIMARY KEY (`codOrcamento`),
  KEY `CodAgendamento` (`codAgendamento`),
  CONSTRAINT `CodAgendamento` FOREIGN KEY (`codAgendamento`) REFERENCES `agendamento` (`codAgendamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.orcamento_tratamento
CREATE TABLE IF NOT EXISTS `orcamento_tratamento` (
  `codTratamentoUniao` int(11) DEFAULT NULL,
  `codOrcamentoUniao` int(11) DEFAULT NULL,
  KEY `codTratamentoUniao` (`codTratamentoUniao`),
  KEY `codOrcamentoUniao` (`codOrcamentoUniao`),
  CONSTRAINT `codOrcamentoUniao` FOREIGN KEY (`codOrcamentoUniao`) REFERENCES `orcamento` (`codOrcamento`),
  CONSTRAINT `codTratamentoUniao` FOREIGN KEY (`codTratamentoUniao`) REFERENCES `tratamento` (`codTratamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.paciente
CREATE TABLE IF NOT EXISTS `paciente` (
  `codPaciente` int(11) NOT NULL AUTO_INCREMENT,
  `nomePaciente` varchar(120) NOT NULL,
  `cpfPaciente` bigint(12) DEFAULT NULL,
  `rgPaciente` varchar(12) DEFAULT '',
  `statusPaciente` tinyint(1) DEFAULT '1',
  `emailPaciente` varchar(120) DEFAULT '',
  `anamnesePaciente` varchar(120) DEFAULT '',
  `telefonePaciente` int(11) DEFAULT NULL,
  `codResponsavelPaciente` int(10) DEFAULT NULL,
  `codEnderecoPaciente` int(10) DEFAULT NULL,
  `profissaoPaciente` varchar(120) DEFAULT '',
  `estadoCivilPaciente` varchar(120) DEFAULT '',
  `obsPaciente` longtext,
  `celularPaciente` int(11) DEFAULT NULL,
  PRIMARY KEY (`codPaciente`),
  KEY `codResponsavelPaciente` (`codResponsavelPaciente`),
  KEY `codEnderecoPaciente` (`codEnderecoPaciente`),
  CONSTRAINT `codEnderecoPaciente` FOREIGN KEY (`codEnderecoPaciente`) REFERENCES `endereco` (`codEndereco`),
  CONSTRAINT `codResponsavelPaciente` FOREIGN KEY (`codResponsavelPaciente`) REFERENCES `responsavel` (`codResponsavel`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.responsavel
CREATE TABLE IF NOT EXISTS `responsavel` (
  `codResponsavel` int(11) NOT NULL AUTO_INCREMENT,
  `dtNascimentoResponsavel` date DEFAULT '1000-01-01',
  `nomeResponsavel` varchar(120) DEFAULT '',
  `profissaoResponsavel` varchar(120) DEFAULT '',
  `estadoCivilResponsavel` varchar(120) DEFAULT '',
  `codEnderecoResponsavel` int(11) DEFAULT NULL,
  PRIMARY KEY (`codResponsavel`),
  KEY `codEnderecoResponsavel` (`codEnderecoResponsavel`),
  CONSTRAINT `codEnderecoResponsavel` FOREIGN KEY (`codEnderecoResponsavel`) REFERENCES `endereco` (`codEndereco`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.servico
CREATE TABLE IF NOT EXISTS `servico` (
  `codServico` int(8) NOT NULL AUTO_INCREMENT,
  `nomeServico` varchar(120) NOT NULL,
  `duracaoServico` int(3) NOT NULL,
  PRIMARY KEY (`codServico`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.servico_tratamento
CREATE TABLE IF NOT EXISTS `servico_tratamento` (
  `codServico` int(11) DEFAULT NULL,
  `codTratamento` int(11) DEFAULT NULL,
  KEY `codServico` (`codServico`),
  KEY `codTratamento` (`codTratamento`),
  CONSTRAINT `codServico` FOREIGN KEY (`codServico`) REFERENCES `servico` (`codServico`),
  CONSTRAINT `codTratamento` FOREIGN KEY (`codTratamento`) REFERENCES `tratamento` (`codTratamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.tratamento
CREATE TABLE IF NOT EXISTS `tratamento` (
  `codTratamento` int(8) NOT NULL AUTO_INCREMENT,
  `nomeTratamento` varchar(120) NOT NULL DEFAULT '0',
  PRIMARY KEY (`codTratamento`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
-- Copiando estrutura para tabela bd_consultorio.usuario
CREATE TABLE IF NOT EXISTS `usuario` (
  `codUsuario` int(8) NOT NULL AUTO_INCREMENT,
  `nomeUsuario` varchar(120) NOT NULL DEFAULT '',
  `senhaUsuario` varchar(120) NOT NULL DEFAULT '0',
  `nivelUsuario` tinyint(1) NOT NULL,
  PRIMARY KEY (`codUsuario`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- Exportação de dados foi desmarcado.
/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
