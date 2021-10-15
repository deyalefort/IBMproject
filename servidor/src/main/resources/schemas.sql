DROP TABLE IF EXISTS tclientes;

CREATE TABLE tclientes (
    idCliente BIGINT AUTO_INCREMENT PRIMARY KEY,	
    yourPassion VARCHAR(50) NOT NULL,
    monthSalary DOUBLE NOT NULL, age INT NOT NULL, creditCard VARCHAR(50) NOT NULL
);
